package de.micromata.jak.examples;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Boundary;
import de.micromata.opengis.kml.v_2_2_0.ColorMode;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LinearRing;
import de.micromata.opengis.kml.v_2_2_0.MultiGeometry;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Polygon;

/**
 * Read data of mobile phone subscriptions in 2008 from a CSV and set the height of the polygons to the value of the
 * data for each country. Creating 3D Polygons for each country is described in example 2.
 */
public class Example3 {

  public static void main(String args[]) throws IOException {

HashMap<String, Double> data = Utils.readCSVDoubleData("src/main/resources/exampledata/mobile_phone_2008.csv", 0, 3);
double max = data.get("maximum");
int minPolyHeight = 308000; // set a minimum height used by the 3D shapes
int maxPolyHeight = 2692000; // real max = 3000000 - 308000 = 2692000

Kml unmarshal = Kml.unmarshal(new File("src/main/resources/exampledata/worldBorders.kml"));
Document document = (Document) unmarshal.getFeature();
document.setName("JAK Example3");
Folder folder = (Folder) document.getFeature().get(0);
folder.setName("Mobile Phone Subscriptions 2008");

int folderSize = folder.getFeature().size();
// loop over all countries / Placemarks
for (int i = 0; i < folderSize; i++) {
  Placemark placemark = (Placemark) folder.getFeature().get(i);
  MultiGeometry multigeometry = (MultiGeometry) placemark.getGeometry();
  double height = -1;
  // only set height if data found in the HashMap (CSV)
  if (data.containsKey(placemark.getId())) {
    height = data.get(placemark.getId());
    placemark.withDescription("" + (int) height);
    // set a color gradient from yellow to red, calculating by the height, no transparency and no stroke/line

		int colorValue = (int) ((height / max) * 255);
		/*
		 * value <-> color conversion calculate percental value (with the max value) and use it for the hex color value 0 % => yellow 50 % =>
		 * orange 100 % => red
		 */
		String color = Utils.getHexColor(0, (255 - colorValue), 255, true); // KML color format: inverse order of RGB
		Utils.setPolyStyleAndLineStyle(placemark, "FF" + color, ColorMode.NORMAL, 1, "FF000000", ColorMode.NORMAL);
    
    
    folder.addToFeature(placemark);
    // normalize height and add minimal polygon height to prevent the "polygon hole problem"
    height = ((height / max) * maxPolyHeight) + minPolyHeight;
  } else {
    // if no data found for the current country / Placemark, use no 3D polygon and set color to gray
    Utils.setPolyStyleAndLineStyle(placemark, "FFCCCCCC", ColorMode.NORMAL, 1, null, ColorMode.NORMAL);
    folder.addToFeature(placemark);
    placemark.withDescription("no data");
  }

  for (int j = 0; j < multigeometry.getGeometry().size(); j++) {
    Polygon polygon = (Polygon) multigeometry.getGeometry().get(j);
    if (height < 0) {
      // color overlay
      polygon.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
      polygon.setTessellate(Boolean.TRUE); // follow the terrain
    } else {
      // 3D polygon
      polygon.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND); // altitude can only be set in this mode
      polygon.setExtrude(Boolean.TRUE); // connect to ground
    }

    // only for 3D polygons
    if (height > 0) {
      Boundary outerBoundaryIs = polygon.getOuterBoundaryIs();
      LinearRing linearRing = outerBoundaryIs.getLinearRing();
      List<Coordinate> coordinates = linearRing.getCoordinates();
      // set the altitude of all vertices (height of the polygon)
      for (Coordinate c : coordinates) {
        c.setAltitude(height);
      }
      // check enclaves or polygons like it
      if (!polygon.getInnerBoundaryIs().isEmpty()) {
        for (int k = 0; k < polygon.getInnerBoundaryIs().size(); k++) {
          Boundary innerBoundaryIs = polygon.getInnerBoundaryIs().get(k);
          LinearRing linearRingInner = innerBoundaryIs.getLinearRing();
          List<Coordinate> coordinatesInner = linearRingInner.getCoordinates();
          // set the altitude of all vertices (height of the polygon)
          for (Coordinate c : coordinatesInner) {
            c.setAltitude(height);
          }
        }
      }
    }
  }
}
unmarshal.marshal(new File("advancedexample3.kml"));
  }
}
