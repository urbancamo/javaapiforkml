package de.micromata.jak;

import java.io.StringWriter;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LineString;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

public final class KMLTest {
	@SuppressWarnings("unused")
	private final Logger LOG = Logger.getLogger(getClass().getName());

	public static String TEST_FOLDER = "src/test/resources/kml-gen/";

	@Test
	public void testKml12() {
		final Kml kml = new Kml();
		final Folder folder = kml.createAndSetFolder();
		final Placemark pl = folder.createAndAddPlacemark();
		final LineString ls = pl.createAndSetLineString();

		folder.setName("test");
		pl.setName("Placemark");
		ls.addToCoordinates("3528968.79007832, 5805512.1556938, 662.7");
		ls.addToCoordinates("3528973.946, 5805504.127, 662.7");
		ls.addToCoordinates("3528973.946, 5805504.127, 662.7");
		ls.addToCoordinates("3528975.646, 5805505.047, 662.7");
		ls.addToCoordinates("3528975.646, 5805505.047, 662.7");
		ls.addToCoordinates("3528977.563, 5805502.246, 662.7");
		ls.addToCoordinates("3528977.563, 5805502.246, 662.7");
		ls.addToCoordinates("3528975.869, 5805501.4, 662.7");
		kml.marshal();
		final Kml unmarshalledKml = Utils.marshalAndUnmarshall(kml);
		Assert.assertEquals("test", unmarshalledKml.getFeature().getName());
	}

	@Test
	public void testKml1() {
		final Kml kml = new Kml();
		final Folder folder = kml.createAndSetFolder();
		final Placemark pl = folder.createAndAddPlacemark();
		final LineString ls = pl.createAndSetLineString();
		// final Coordinates cs = ls.createAndSetCoordinates();

		folder.setName("test");
		pl.setName("Placemark");
		ls.addToCoordinates("3528968.79007832, 5805512.1556938, 662.7");
		ls.addToCoordinates("3528973.946, 5805504.127, 662.7");
		ls.addToCoordinates("3528973.946, 5805504.127, 662.7 ");
		ls.addToCoordinates("3528975.646, 5805505.047, 662.7");
		ls.addToCoordinates("3528975.646, 5805505.047, 662.7");
		ls.addToCoordinates("3528977.563, 5805502.246, 662.7 ");
		ls.addToCoordinates("3528977.563, 5805502.246, 662.7 ");
		ls.addToCoordinates("3528975.869, 5805501.4, 662.7");
		// ls.addToCoordinates(new ICoordinate(3528975.869, 5805501.4, 662.7));
		kml.marshal();
		final Kml unmarshalledKml = Utils.marshalAndUnmarshall(kml);
		Assert.assertEquals("test", unmarshalledKml.getFeature().getName());

	}

	@Test
	public void testKml2() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		document.setName("test");

		final Placemark p1 = new Placemark();
		p1.setName("P1");

		document.getFeature().add(p1);
		kml.marshal();
		final Kml unmarshalledKml = Utils.marshalAndUnmarshall(kml);
		Assert.assertEquals("test", unmarshalledKml.getFeature().getName());

	}

	@Test
	public void testKml3() {
		final Kml kml = new Kml();
		kml.createAndSetDocument().withName("test").createAndAddPlacemark().withName("P1").createAndSetPoint().addToCoordinates(
		    "3528968.79007832, 5805512.1556938, 662.7").addToCoordinates("3528973.946, 5805504.127, 662.7").addToCoordinates(
		    "3528973.946, 5805504.127, 662.7 ").addToCoordinates("3528975.646, 5805505.047, 662.7").addToCoordinates(
		    "3528975.646, 5805505.047, 662.7").addToCoordinates("3528977.563, 5805502.246, 662.7 ").addToCoordinates(
		    "3528977.563, 5805502.246, 662.7 ").addToCoordinates("3528975.869, 5805501.4, 662.7");

		kml.marshal();
		final StringWriter out = new StringWriter();
		kml.marshal(out);
		final Kml unmarshalledKml = Kml.unmarshal(out.toString());
		Assert.assertEquals("test", unmarshalledKml.getFeature().getName());
	}

	@Test
	public void testKml4() {
		final Kml kml = Kml
		    .unmarshal("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<kml xmlns=\"http://www.opengis.net/kml/2.2\" xmlns:ns2=\"http://www.w3.org/2005/Atom\" xmlns:ns3=\"urn:oasis:names:tc:ciq:xsdschema:xAL:2.0\">" + "    <Folder>" + "        <name>test4</name>" + "        <visibility>false</visibility>" + "        <open>false</open>" + "        <Placemark>" + "         <name>Placemark</name>" + "            <visibility>false</visibility>" + "            <open>false</open>" + "            <LineString>" + "                <extrude>false</extrude>" + "                <tessellate>false</tessellate>" + "                <altitudeMode>clampToGround</altitudeMode>" + "                <coordinates>3528968.79007832, 5805512.1556938, 662.7 3528973.946, 5805504.127, 662.7 3528973.946, 5805504.127, 662.7  3528975.646, 5805505.047, 662.7 3528975.646, 5805505.047, 662.7 3528977.563, 5805502.246, 662.7  3528977.563, 5805502.246, 662.7  3528975.869, 5805501.4, 662.7</coordinates>" + "            </LineString>" + "        </Placemark>" + "    </Folder>" + "</kml>");
		final StringWriter out = new StringWriter();
		kml.marshal();
		kml.marshal(out);
		final Kml unmarshalledKml = Kml.unmarshal(out.toString());
		Assert.assertEquals("test4", unmarshalledKml.getFeature().getName());
	}

}
