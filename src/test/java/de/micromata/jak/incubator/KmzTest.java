// ///////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project JavaAPIforKML
//
// Author Flori (f.bachmann@micromata.de)
// Created Aug 15, 2009
// Copyright Micromata Aug 15, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
// ///////////////////////////////////////////////////////////////////////////
package de.micromata.jak.incubator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import de.micromata.opengis.kml.v_2_2_0.Kml;



public class KmzTest {
	@Test
	@Ignore
	public void testKml12() throws IOException {
		final Kml kmlmain = createKmlStructure("KmlFileMain.kml", "PlacemarkMain");

		Kml kml1 = createKmlStructure("KmlFile1.kml", "Placemark1");
		Kml kml2 = createKmlStructure(null, "Placemark2");
		Kml kml3 = createKmlStructure("KmlFile3.kml", "Placemark3");

		kmlmain.marshalAsKmz("kmzFileMain.kmz");

		kmlmain.marshalAsKmz("kmzFileMain2.kmz", kml1, kml2, kml3);

		Kml kml4 = createKmlStructure("KmlFile4", "Placemark3");
		Kml kml5 = createKmlStructure("KmlFile5", "Placemark3");
		Kml kml6 = createKmlStructure(null, "Placemark3");
		Kml kml7 = createKmlStructure("KmlFile7.kml", "Placemark3");

		
		kmlmain.marshalAsKmz("kmzFileMain3.kmz", kml1, kml2, kml3, kml4, kml5, kml6, kml7);
		

		Kml[] unmarshalKMZ = Kml.unmarshalFromKmz(new File("kmzFileMain3.kmz"));

		for (Kml kml : unmarshalKMZ) {
			String name = null;
			if (kml.getFeature() == null || kml.getFeature().getName() == null || kml.getFeature().getName().length() == 0) {
				name = "noName";
			} else {
				name = kml.getFeature().getName();
			}

			System.out.println(name);
		}
	}

	private Kml createKmlStructure(String documentName, String placemarkName) {
		final Kml kml = new Kml();
		kml.createAndSetDocument().withName(documentName).createAndAddPlacemark().withName(placemarkName).createAndSetLineString()
		    .addToCoordinates(3528968.79007832, 5805512.1556938, 662.7).addToCoordinates(3528973.946, 5805504.127, 662.7).addToCoordinates(
		        3528973.946, 5805504.127, 662.7).addToCoordinates(3528975.646, 5805505.047, 662.7).addToCoordinates(3528975.646, 5805505.047,
		        662.7).addToCoordinates(3528977.563, 5805502.246, 662.7).addToCoordinates(3528977.563, 5805502.246, 662.7).addToCoordinates(
		        3528975.869, 5805501.4, 662.7);
		return kml;
	}

	// @Test
	public void tetetetetetet() throws FileNotFoundException {
		Kml unmarshal = Kml
		    .unmarshal("<?xml version=\"1.0\" encoding=\"UTF-8\"?><kml xmlns=\"http://www.opengis.net/kml/2.2\" xmlns:gx=\"http://www.google.com/kml/ext/2.2\" xmlns:kml=\"http://www.opengis.net/kml/2.2\" xmlns:atom=\"http://www.w3.org/2005/Atom\"><Placemark>	<name>London, UK</name>	<open>1</open>	<Point>		<coordinates>-0.126236,51.500152,0</coordinates>	</Point></Placemark></kml>");
		unmarshal.marshal(System.out);

	}

	@Test
	public void helloKML() {

		final Kml kml = new Kml();
		kml.createAndSetPlacemark().withName("London, UK").withOpen(true).createAndSetPoint().addToCoordinates(-0.126236, 51.500152);
		kml.marshal();
	}
}
