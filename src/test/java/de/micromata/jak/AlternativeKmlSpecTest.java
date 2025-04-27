package de.micromata.jak;

import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.NamespaceFilterHandler;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link NamespaceFilterHandler} allows registration of 3rd party KML specifications.
 * <br>
 * This can be used by 3rd parties that have KML 2.X complaint specifications with minor tweaks
 * not related to data model structure.
 */
public class AlternativeKmlSpecTest {
    @Test
    public void test() {
        String impl = "http://example.com/kml/2.X";
        String content = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<kml xmlns=\"" + impl + "\">\n"
                + "    <Document>\n"
                + "        <name>NDBC BuoyCAM Stations</name>\n"
                + "        <open>1</open>\n"
                + "    </Document>\n"
                + "</kml>\n";
        try {
            Assert.assertNull("Expected unknown KML spec to fail initially", Kml.unmarshal(content));
            NamespaceFilterHandler.addKml2SpecUri(impl);
            Assert.assertNotNull(Kml.unmarshal(content));
        } catch (Exception ex) {
           Assert.fail(ex.getMessage());
        }
    }
}
