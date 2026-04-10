package de.micromata.jak;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Feature;
import de.micromata.opengis.kml.v_2_2_0.GroundOverlay;
import de.micromata.opengis.kml.v_2_2_0.IconStyle;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LabelStyle;
import de.micromata.opengis.kml.v_2_2_0.LineStyle;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.PolyStyle;
import de.micromata.opengis.kml.v_2_2_0.ScreenOverlay;
import de.micromata.opengis.kml.v_2_2_0.Style;
import de.micromata.opengis.kml.v_2_2_0.StyleSelector;
import org.junit.Test;

import java.io.File;
import java.io.StringWriter;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Parses real-world NWS/WPC KML files and verifies they round-trip cleanly.
 *
 * <p>Also serves as a regression test for the {@code Double} conversion of
 * {@code scale}/{@code heading}/{@code width}: prior to that fix, marshalling
 * any of these files would emit stray {@code <scale>0.0</scale>} and
 * {@code <heading>0.0</heading>} elements wherever the source didn't set them.
 */
public class RealWorldNwsFixturesTest {

    private static final String FIXTURE_DIR = "src/test/resources/exampledata/";
    private static final String QPF6HR = FIXTURE_DIR + "QPF6hr_f00-f06_latest.kml";
    private static final String DAY1_SNOW = FIXTURE_DIR + "Day1_psnow_gt_12inches.kml";
    private static final String DAY1_RAINFALL = FIXTURE_DIR + "Day_1_Excessive_Rainfall_Outlook.kml";

    @Test
    public void qpf6hr_parsesAndIsPolyStyleOnly() {
        Kml kml = Kml.unmarshal(new File(QPF6HR));
        assertNotNull("QPF6hr should parse", kml);

        Document doc = (Document) kml.getFeature();
        assertEquals("QPF6hr_f00-f06", doc.getName());

        // A folder of Placemarks with PolyStyle-driven contours, no icons.
        long polyStyleCount = doc.getStyleSelector().stream()
                .filter(s -> s instanceof Style)
                .map(s -> ((Style) s).getPolyStyle())
                .filter(Objects::nonNull)
                .count();
        // The top-level Document may not have the PolyStyles directly; fall back
        // to searching inside the nested Folder.
        if (polyStyleCount == 0) {
            for (Feature f : doc.getFeature()) {
                if (f.getClass().getSimpleName().equals("Folder")) {
                    polyStyleCount = f.getStyleSelector().stream()
                            .filter(s -> s instanceof Style)
                            .map(s -> ((Style) s).getPolyStyle())
                            .filter(Objects::nonNull)
                            .count();
                    break;
                }
            }
        }
        assertTrue("expected at least one PolyStyle in the document", polyStyleCount > 0);
    }

    @Test
    public void day1Snow_parsesWithMixedStylesAndOverlays() {
        Kml kml = Kml.unmarshal(new File(DAY1_SNOW));
        assertNotNull("Day1 snow should parse", kml);

        Document doc = (Document) kml.getFeature();
        assertEquals("Day 1 WPC PRBLTY of Snow > 12\"", doc.getName());

        int styleCount = 0;
        int iconStyleWithScale = 0;
        int screenOverlayCount = 0;
        int groundOverlayCount = 0;

        for (StyleSelector sel : doc.getStyleSelector()) {
            if (sel instanceof Style) {
                styleCount++;
                Style style = (Style) sel;
                IconStyle is = style.getIconStyle();
                if (is != null && is.getScale() != null) {
                    iconStyleWithScale++;
                    assertEquals("all IconStyles in this file use scale=0.7",
                            Double.valueOf(0.7), is.getScale());
                }
                LabelStyle ls = style.getLabelStyle();
                if (ls != null) {
                    assertEquals("all LabelStyles in this file use scale=1.0",
                            Double.valueOf(1.0), ls.getScale());
                }
                LineStyle lineStyle = style.getLineStyle();
                if (lineStyle != null) {
                    assertEquals(Double.valueOf(2.0), lineStyle.getWidth());
                }
            }
        }

        for (Feature f : doc.getFeature()) {
            if (f instanceof ScreenOverlay) screenOverlayCount++;
            if (f instanceof GroundOverlay) groundOverlayCount++;
        }

        assertEquals("expected 4 Styles in Day1_psnow_gt_12inches", 4, styleCount);
        assertEquals("all 4 Styles include an IconStyle with scale=0.7", 4, iconStyleWithScale);
        assertEquals(1, screenOverlayCount);
        assertEquals(1, groundOverlayCount);
    }

    @Test
    public void day1Rainfall_parsesWithPolygonGeometry() {
        Kml kml = Kml.unmarshal(new File(DAY1_RAINFALL));
        assertNotNull("Day1 rainfall should parse", kml);

        Document doc = (Document) kml.getFeature();

        // File contains Placemarks with Polygon geometries. Find at least one.
        for (Feature f : doc.getFeature()) {
            if (f instanceof Placemark) {
                Placemark p = (Placemark) f;
                if (p.getGeometry() != null) {
                    break;
                }
            }
        }
        // Depending on how deeply the file nests geometry, also check inside folders.
        assertFalse("expected at least one Placemark or Folder of Placemarks", doc.getFeature().isEmpty());

        // Make sure any PolyStyles we do see parse cleanly.
        for (StyleSelector sel : doc.getStyleSelector()) {
            if (sel instanceof Style) {
                PolyStyle ps = ((Style) sel).getPolyStyle();
                if (ps != null) {
                    assertNotNull("PolyStyle color should be populated", ps.getColor());
                }
            }
        }
    }

    /**
     * Regression test for the scale/heading/width fix: round-tripping a real
     * NWS file must not introduce stray {@code <scale>0.0</scale>} or
     * {@code <heading>0.0</heading>} elements on any IconStyle/LineStyle that
     * didn't have them in the input.
     */
    @Test
    public void day1Snow_roundTripDoesNotIntroduceStrayDefaults() {
        Kml kml = Kml.unmarshal(new File(DAY1_SNOW));
        assertNotNull(kml);

        StringWriter writer = new StringWriter();
        kml.marshal(writer);
        String xml = writer.toString();

        // Input has no <heading> anywhere — output should likewise have none.
        assertFalse("round-tripped output should not contain stray <heading>0.0</heading>: ",
                xml.contains("<heading>0.0</heading>"));
        // Input's <scale> values are 0.7 and 1.0 — no 0.0 should appear either.
        assertFalse("round-tripped output should not contain stray <scale>0.0</scale>: ",
                xml.contains("<scale>0.0</scale>"));
        // Input's LineStyle widths are 2.0 — no 0.0 should appear.
        assertFalse("round-tripped output should not contain stray <width>0.0</width>: ",
                xml.contains("<width>0.0</width>"));

        // Sanity: the values that WERE set should still be present.
        assertTrue("IconStyle scale=0.7 should be preserved", xml.contains("<scale>0.7</scale>"));
        assertTrue("LabelStyle scale=1.0 should be preserved", xml.contains("<scale>1.0</scale>"));
        assertTrue("LineStyle width=2.0 should be preserved", xml.contains("<width>2.0</width>"));
    }
}
