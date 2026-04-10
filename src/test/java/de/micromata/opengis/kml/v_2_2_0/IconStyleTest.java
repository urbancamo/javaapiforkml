package de.micromata.opengis.kml.v_2_2_0;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Regression coverage for style classes whose numeric fields previously
 * leaked into marshalled output even when the caller never set them,
 * because the fields were primitive {@code double} and JAXB always
 * marshals primitives.
 */
public class IconStyleTest {

    // --- IconStyle ---------------------------------------------------------

    @Test
    public void iconStyle_unsetScaleAndHeadingAreOmitted() {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();

        Style style = document.createAndAddStyle().withId("multiTrack_n");
        style.createAndSetIconStyle()
                .createAndSetIcon()
                .withHref("https://earth.google.com/images/kml-icons/track-directional/track-0.png");
        style.createAndSetLineStyle().withColor("99ffac59").withWidth(6.0);

        String xml = marshal(kml);

        assertFalse("unset IconStyle/heading should not be marshalled: " + xml,
                xml.contains("<heading>"));
        assertFalse("unset IconStyle/scale should not be marshalled: " + xml,
                xml.contains("<scale>"));
        assertTrue("Icon href should still be present", xml.contains("track-0.png"));
    }

    @Test
    public void iconStyle_explicitScaleAndHeadingAreMarshalled() {
        Kml kml = kmlWithIconStyle(new IconStyle().withScale(2.5).withHeading(90.0));

        String xml = marshal(kml);

        assertTrue("explicitly set scale should be marshalled: " + xml,
                xml.contains("<scale>2.5</scale>"));
        assertTrue("explicitly set heading should be marshalled: " + xml,
                xml.contains("<heading>90.0</heading>"));
    }

    @Test
    public void iconStyle_explicitZeroValuesAreMarshalled() {
        // Ensures "explicitly 0.0" is still distinguishable from "unset".
        Kml kml = kmlWithIconStyle(new IconStyle().withScale(0.0).withHeading(0.0));

        String xml = marshal(kml);

        assertTrue("explicit scale=0.0 should be marshalled: " + xml,
                xml.contains("<scale>0.0</scale>"));
        assertTrue("explicit heading=0.0 should be marshalled: " + xml,
                xml.contains("<heading>0.0</heading>"));
    }

    @Test
    public void iconStyle_defaultGettersReturnNull() {
        IconStyle iconStyle = new IconStyle();
        assertNull("scale should default to null", iconStyle.getScale());
        assertNull("heading should default to null", iconStyle.getHeading());
    }

    // --- LineStyle ---------------------------------------------------------

    @Test
    public void lineStyle_unsetWidthIsOmitted() {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();
        document.createAndAddStyle().withId("lineOnly")
                .createAndSetLineStyle().withColor("ffffffff");

        String xml = marshal(kml);

        assertFalse("unset LineStyle/width should not be marshalled: " + xml,
                xml.contains("<width>"));
        assertTrue("LineStyle/color should still be present", xml.contains("<color>ffffffff"));
    }

    @Test
    public void lineStyle_explicitWidthIsMarshalled() {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();
        document.createAndAddStyle().withId("lineOnly")
                .createAndSetLineStyle().withWidth(6.0);

        String xml = marshal(kml);

        assertTrue("explicit LineStyle/width should be marshalled: " + xml,
                xml.contains("<width>6.0</width>"));
    }

    @Test
    public void lineStyle_defaultWidthIsNull() {
        assertNull("LineStyle width should default to null", new LineStyle().getWidth());
    }

    // --- LabelStyle --------------------------------------------------------

    @Test
    public void labelStyle_unsetScaleIsOmitted() {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();
        document.createAndAddStyle().withId("labelOnly")
                .createAndSetLabelStyle().withColor("ff00ff00");

        String xml = marshal(kml);

        assertFalse("unset LabelStyle/scale should not be marshalled: " + xml,
                xml.contains("<scale>"));
        assertTrue("LabelStyle/color should still be present", xml.contains("<color>ff00ff00"));
    }

    @Test
    public void labelStyle_explicitScaleIsMarshalled() {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();
        document.createAndAddStyle().withId("labelOnly")
                .createAndSetLabelStyle().withScale(1.5);

        String xml = marshal(kml);

        assertTrue("explicit LabelStyle/scale should be marshalled: " + xml,
                xml.contains("<scale>1.5</scale>"));
    }

    @Test
    public void labelStyle_defaultScaleIsNull() {
        assertNull("LabelStyle scale should default to null", new LabelStyle().getScale());
    }

    // --- Original reported issue -------------------------------------------

    /**
     * Reproduces the exact scenario from the bug report: configuring an
     * IconStyle with only an icon href and a LineStyle with only color and
     * width should not produce stray {@code <scale>}, {@code <heading>} or
     * other fields the caller never touched.
     */
    @Test
    public void reportedIssue_multiTrackStyleHasNoStrayFields() {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();

        Style normalMultitrackStyle = document.createAndAddStyle().withId("multiTrack_n");
        normalMultitrackStyle.createAndSetIconStyle()
                .createAndSetIcon()
                .withHref("https://earth.google.com/images/kml-icons/track-directional/track-0.png");
        normalMultitrackStyle.createAndSetLineStyle().withColor("99ffac59").withWidth(6.0);

        String xml = marshal(kml);

        assertEquals("no <heading> elements expected", 0, occurrences(xml, "<heading>"));
        assertEquals("no <scale> elements expected", 0, occurrences(xml, "<scale>"));
        assertEquals("exactly one <width> element expected", 1, occurrences(xml, "<width>"));
        assertEquals("exactly one <color> element expected", 1, occurrences(xml, "<color>"));
    }

    // --- helpers -----------------------------------------------------------

    private static String marshal(Kml kml) {
        StringWriter writer = new StringWriter();
        kml.marshal(writer);
        return writer.toString();
    }

    private static Kml kmlWithIconStyle(IconStyle iconStyle) {
        Kml kml = new Kml();
        Document document = kml.createAndSetDocument();
        Style style = document.createAndAddStyle().withId("s");
        style.setIconStyle(iconStyle);
        return kml;
    }

    private static int occurrences(String haystack, String needle) {
        int count = 0;
        int idx = 0;
        while ((idx = haystack.indexOf(needle, idx)) != -1) {
            count++;
            idx += needle.length();
        }
        return count;
    }
}
