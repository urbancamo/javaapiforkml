package de.micromata.jak.examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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
 * Read data of mobile phone subscriptions in from 1960 - 2008 from a CSV and set the height of the polygons to the value of the data for
 * each country. For each year, there is a folder, with the attribute begin and end, which activates the timeline in Google Earth for an
 * animation. Creating 3D Polygons for each country is described in example 2.
 */
public class Example4 {

	public static void main(String args[]) throws IOException {

HashMap<String, HashMap<String, Double>> result = Utils
    .readMultiDataFromCVS("src/main/resources/exampledata/mobile_phone.csv", 0, 3, 2);
double max = result.get("info").get("maximum");
result.remove("info");
int minPolyHeight = 308000;
int maxPolyHeight = 2692000; // real max = 3000000 - 308000 = 2692000

String path = "src/main/resources/data/worldBorders.kml";
Kml unmarshal = Kml.unmarshal(new File(path));

Document document = (Document) unmarshal.getFeature();
Folder oldFolder = (Folder) document.getFeature().get(0);
int folderSize = oldFolder.getFeature().size();
Folder folder = new Folder();
folder.setName("Mobile Phone Subscriptions 1960 - 2008");
// pick up a country (AFG) and geht the HashMap keys to sort the KML file by years
ArrayList<String> yearKeys = new ArrayList<String>();
yearKeys.addAll(result.get("AFG").keySet());
Collections.sort(yearKeys);
Iterator<String> iterator = yearKeys.iterator();

// loop over the year range
while (iterator.hasNext()) {
	String currentYear = iterator.next();
	if (Integer.valueOf(currentYear).intValue() <= 1989) {
		continue; // skip years before 1989 (less data)
	}
	// create a (root) folder and set the time range for the current year
	Folder yearFolder = new Folder();
	yearFolder.withName(currentYear).createAndSetTimeSpan().withBegin(currentYear + "-01-01").withEnd(currentYear + "-12-31");

	// loop over all countries / Placemarks
	for (int i = 0; i < folderSize; i++) {
		Placemark placemark = (Placemark) oldFolder.getFeature().get(i).clone();
		MultiGeometry multigeometry = (MultiGeometry) placemark.getGeometry();

		double height = -1;
		// only set height if data found in the HashMap (CSV) AND found the current year in the nested HashMap as key
		if (result.containsKey(placemark.getId()) && result.get(placemark.getId()).containsKey(currentYear)) {
			height = result.get(placemark.getId()).get(currentYear);
			placemark.withDescription("" + (int) height);
			// set a color gradient from yellow to red, calculating by the height, no transparency and no stroke/line
			Utils.setDataValueColor(placemark, max, height, "FF", 1, null, ColorMode.NORMAL);
			yearFolder.addToFeature(placemark);
			// normalize height and add minimal polygon height to prevent the "polygon hole problem"
			height = ((height / max) * maxPolyHeight) + minPolyHeight;
		} else {
			// if no data found for the current country / Placemark, use no 3D polygon and set color to gray
			Utils.setPolyStyleAndLineStyle(placemark, "FFCCCCCC", ColorMode.NORMAL, 1, null, ColorMode.NORMAL);
			yearFolder.addToFeature(placemark);
			placemark.withDescription("no data");
		}

		for (int j = 0; j < multigeometry.getGeometry().size(); j++) {
			Polygon polygon = (Polygon) multigeometry.getGeometry().get(j);
			if (height < 0) {
				// color overlay
				polygon.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
				polygon.setTessellate(Boolean.TRUE);
			} else {
				// 3D polygon
				polygon.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);
				polygon.setExtrude(Boolean.TRUE);
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
	folder.addToFeature(yearFolder); // put folder with current year into the root folder
}

Document newDocument = new Document().withName("JAK Example4");
newDocument.getFeature().add(folder);
unmarshal.setFeature(newDocument);

// unmarshal.marshal(new File("advancedexample4.kml"));
unmarshal.marshalAsKmz("advanvedexample4.kmz");

	}

}
