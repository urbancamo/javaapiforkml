package de.micromata.jak.examples;

import java.io.File;
import java.io.FileNotFoundException;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Icon;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Style;

/**
 * This example generates a KML file with a placemark and a chart for each continent. The chart is generated with the Google Chart API and
 * show the area (surface of the earth) of each continent.
 * 
 * Google Chart API example: http://chart.apis.google.com/chart?cht=p3&chd=t:60,40&chs=250x100&chl=Hello|World
 */
public class Example1 {

	public static void main(String[] args) throws FileNotFoundException {
		final Kml kml = new Kml();
		Document doc = kml.createAndSetDocument().withName("JAK Example1").withOpen(true);

		// create a Folder
		Folder folder = doc.createAndAddFolder();
		folder.withName("Continents with Earth's surface").withOpen(true);

		// create Placemark elements
		createPlacemarkWithChart(doc, folder, 93.24607775062842, 47.49808862281773, "Asia", 30);
		createPlacemarkWithChart(doc, folder, 19.44601806124206, 10.13133611111111, "Africa", 20);
		createPlacemarkWithChart(doc, folder, -103.5286299241638, 41.26035225962401, "North America", 17);
		createPlacemarkWithChart(doc, folder, -59.96161780270248, -13.27347674076888, "South America", 12);
		createPlacemarkWithChart(doc, folder, 14.45531426360271, 47.26208181151567, "Europe", 7);
		createPlacemarkWithChart(doc, folder, 135.0555272486322, -26.23824399654937, "Australia", 6);

		// print and save
		kml.marshal(new File("advancedexample1.kml"));
	}

	
/**
 * The createPlacemarkWithChart ()-method generates and set a placemark object, with the given statistical data . The Icon and Style
 * objects (color and size of the text and icon) are saved to the root element. The placemark is created and set to the given folder.
 * 
 * @param document structure of the KML file
 * @param folder to add continent
 * @param longitude of the continent
 * @param latitude of the continent
 * @param continentName or name of the placemark
 * @param coveredLandmass in percent
 */
private static void createPlacemarkWithChart(Document document, Folder folder, double longitude, double latitude, 
    String continentName, int coveredLandmass) {

	int remainingLand = 100 - coveredLandmass;
	Icon icon = new Icon()
	    .withHref("http://chart.apis.google.com/chart?chs=380x200&chd=t:" + coveredLandmass + "," + remainingLand + "&cht=p&chf=bg,s,ffffff00");
	Style style = document.createAndAddStyle();
	style.withId("style_" + continentName) // set the stylename to use this style from the placemark
	    .createAndSetIconStyle().withScale(5.0).withIcon(icon); // set size and icon
	style.createAndSetLabelStyle().withColor("ff43b3ff").withScale(5.0); // set color and size of the continent name

	Placemark placemark = folder.createAndAddPlacemark();
	// use the style for each continent
	placemark.withName(continentName)
	    .withStyleUrl("#style_" + continentName)
	    // 3D chart imgae
	    .withDescription(
	        "<![CDATA[<img src=\"http://chart.apis.google.com/chart?chs=430x200&chd=t:" + coveredLandmass + "," + remainingLand + "&cht=p3&chl=" + continentName + "|remaining&chtt=Earth's surface\" />")
	    // coordinates and distance (zoom level) of the viewer
	    .createAndSetLookAt().withLongitude(longitude).withLatitude(latitude).withAltitude(0).withRange(12000000);
	
	placemark.createAndSetPoint().addToCoordinates(longitude, latitude); // set coordinates
}

}
