package de.micromata.jak;

import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

/**
 * Verifies the default marshalled output uses an unprefixed default namespace
 * (xmlns="http://www.opengis.net/kml/2.2") rather than the "kml:" prefix that
 * Google Maps rejects as INVALID_KML.
 *
 * See README, "Namespace prefix in output".
 */
public class NamespacePrefixTest {

    private static final String KML_NS = "http://www.opengis.net/kml/2.2";

    @Test
    public void defaultMarshalUsesUnprefixedKmlNamespace() throws Exception {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();
        document.setName("prefix test");
        Placemark placemark = document.createAndAddPlacemark();
        placemark.setName("p1");

        StringWriter out = new StringWriter();
        Assert.assertTrue("marshal should succeed", kml.marshal(out));
        String xml = out.toString();

        Assert.assertTrue(
            "output should declare the KML namespace as the default namespace: " + xml,
            xml.contains("xmlns=\"" + KML_NS + "\""));

        Assert.assertFalse(
            "output should not declare an xmlns:kml prefix binding: " + xml,
            xml.contains("xmlns:kml=\""));

        Assert.assertFalse(
            "root element should be <kml>, not <kml:kml>: " + xml,
            xml.contains("<kml:kml"));

        Assert.assertFalse(
            "no element should be emitted with a kml: prefix: " + xml,
            xml.contains("<kml:"));
    }
}
