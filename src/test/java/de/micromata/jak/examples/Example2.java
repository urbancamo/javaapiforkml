package de.micromata.jak.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Boundary;
import de.micromata.opengis.kml.v_2_2_0.ColorMode;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LinearRing;
import de.micromata.opengis.kml.v_2_2_0.ListItemType;
import de.micromata.opengis.kml.v_2_2_0.MultiGeometry;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Polygon;
import de.micromata.opengis.kml.v_2_2_0.Style;
import de.micromata.opengis.kml.v_2_2_0.StyleSelector;

/**
 * This example reads the world borders from a KML file and creates two radio folder. The first folder show all countries with a
 * coloroverlay (2D) and random colors. The second folder show a polygon (3D) with random color and random height for each country. To
 * create a 3D polygon, the object structure must be traverse until the Coordinate objects.
 */
public class Example2 {

  public static void main(String args[]) throws FileNotFoundException {
		int minPolyHeight = 308000; // set a minimum height used by the 3D shapes
		int maxPolyHeight = 2692000; // real max = 3000000 - 308000 = 2692000

		Kml worldBorders = Kml.unmarshal(new File("src/main/resources/exampledata/worldBorders.kml"));

		Document document = (Document) worldBorders.getFeature().withName("JAK Example 2");
		Folder rootFolder = document.createAndAddFolder().withName("choose").withStyleUrl("radioFolder");
		// set radiofolder: only one folder can be activated
		Style radioStyle = document.createAndAddStyle().withId("radioFolder");
		radioStyle.createAndSetListStyle().withListItemType(ListItemType.RADIO_FOLDER);

		// put the original folder into the rootFolder and use for 3D shapes
		Folder folder2D = (Folder) document.getFeature().get(0).withName("2D borders");
		document.getFeature().remove(0);
		rootFolder.addToFeature(folder2D);

		// set a random color to each placemark
		for (int i = 0; i < folder2D.getFeature().size(); i++) {
			Placemark placemaek2D = (Placemark) folder2D.getFeature().get(i);
			placemaek2D.withDescription(placemaek2D.getName());

			List<StyleSelector> styleSelector = placemaek2D.getStyleSelector();
			Iterator<StyleSelector> iterator = styleSelector.iterator();
			Style style = null;
			while (iterator.hasNext()) {
				StyleSelector tmp = iterator.next();
				if (tmp instanceof Style) {
					style = (Style) tmp;
					style.getPolyStyle().withColor("FFFFFFFF").withColorMode(ColorMode.RANDOM);
					style.createAndSetLineStyle().withWidth(1).withColor("FF000000").withColorMode(ColorMode.NORMAL);
				}
			}
		}

		// clone the 2d folder
		Folder folder3D = folder2D.clone();
		folder3D.setName("3D borders");
		rootFolder.addToFeature(folder3D);

		// loop over all countries / Placemarks and set a random height to each country
		for (int i = 0; i < folder3D.getFeature().size(); i++) {
			Placemark placemark3D = (Placemark) folder3D.getFeature().get(i);
			placemark3D.withDescription(placemark3D.getName());

			// use random color for the polygon and a black (default color) stroke with 1 width
			MultiGeometry multigeometry3D = (MultiGeometry) placemark3D.getGeometry();
			Random rand = new Random(System.nanoTime());
			// use minimal polygon height to prevent the "polygon hole problem"
			double x = rand.nextInt(maxPolyHeight) + minPolyHeight;

			for (int j = 0; j < multigeometry3D.getGeometry().size(); j++) {
				Polygon polygon3D = (Polygon) multigeometry3D.getGeometry().get(j);
				polygon3D.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND); // altitude can only be set in this mode
				polygon3D.setExtrude(Boolean.TRUE);
				Boundary outerBoundaryIs = polygon3D.getOuterBoundaryIs();
				LinearRing linearRing = outerBoundaryIs.getLinearRing();
				List<Coordinate> coordinates = linearRing.getCoordinates();
				// set the altitude of all vertices (height of the polygon)
				for (Coordinate c : coordinates) {
					c.setAltitude(x);
				}

				// check enclaves or polygons like it
				if (!polygon3D.getInnerBoundaryIs().isEmpty()) {
					for (int k = 0; k < polygon3D.getInnerBoundaryIs().size(); k++) {
						Boundary innerBoundaryIs = polygon3D.getInnerBoundaryIs().get(k);
						LinearRing linearRingInner = innerBoundaryIs.getLinearRing();
						List<Coordinate> coordinatesInner = linearRingInner.getCoordinates();
						// set the altitude of all vertices (height of the polygon)
						for (Coordinate c : coordinatesInner) {
							c.setAltitude(x);
						}
					}
				}
			}
		}
		worldBorders.marshal(new File("advancedexample2.kml"));
  }

}
