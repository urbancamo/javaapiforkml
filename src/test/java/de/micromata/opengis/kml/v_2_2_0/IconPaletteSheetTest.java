package de.micromata.opengis.kml.v_2_2_0;

import org.junit.Test;

import java.io.File;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Covers the Google gx: icon palette sheet extension (gx:x, gx:y, gx:w, gx:h)
 * on {@link Icon}.
 *
 * <p>Test matrix:
 * <ul>
 *   <li>Defaults: a fresh {@link Icon} returns null for all four getters and
 *       marshals nothing for them.</li>
 *   <li>Marshal: values set via fluent API appear in the correct gx namespace.</li>
 *   <li>Unmarshal: values are parsed from a synthetic fixture modeled on the
 *       Google KML Reference example (integer-like doubles).</li>
 *   <li>Unmarshal: values are parsed from the canonical libkml all-gx.kml
 *       fixture (float doubles), proving {@code Double} was the right
 *       type choice rather than {@code Integer}.</li>
 *   <li>Round-trip: marshal then unmarshal preserves the four values.</li>
 * </ul>
 */
public class IconPaletteSheetTest {

    private static final String LIBKML_ALL_GX = "src/test/resources/exampledata/libkml-all-gx.kml";
    private static final String SYNTHETIC_PALETTE = "src/test/resources/exampledata/icon_palette_sheet.kml";

    @Test
    public void defaultsAreNullAndNothingIsMarshalled() {
        Icon icon = new Icon();

        assertNull(icon.getX());
        assertNull(icon.getY());
        assertNull(icon.getW());
        assertNull(icon.getH());

        String xml = marshalStandalone(new Kml().createAndSetDocument()
                .createAndAddStyle()
                .createAndSetIconStyle()
                .createAndSetIcon()
                .withHref("https://example.com/sheet.png"));

        assertFalse("unset gx:x should not be marshalled: " + xml, xml.contains(":x>"));
        assertFalse("unset gx:y should not be marshalled: " + xml, xml.contains(":y>"));
        assertFalse("unset gx:w should not be marshalled: " + xml, xml.contains(":w>"));
        assertFalse("unset gx:h should not be marshalled: " + xml, xml.contains(":h>"));
    }

    @Test
    public void explicitValuesAreMarshalledInGxNamespace() {
        Kml kml = new Kml();
        kml.createAndSetDocument()
                .createAndAddStyle()
                .createAndSetIconStyle()
                .createAndSetIcon()
                .withHref("https://example.com/sheet.png")
                .withX(0.0).withY(0.0).withW(138.0).withH(138.0);

        String xml = marshal(kml);

        assertTrue("gx namespace should be declared: " + xml,
                xml.contains("http://www.google.com/kml/ext/2.2"));
        assertTrue("gx:x should be marshalled: " + xml, xml.contains(":x>0.0</"));
        assertTrue("gx:y should be marshalled: " + xml, xml.contains(":y>0.0</"));
        assertTrue("gx:w should be marshalled: " + xml, xml.contains(":w>138.0</"));
        assertTrue("gx:h should be marshalled: " + xml, xml.contains(":h>138.0</"));
    }

    @Test
    public void unmarshalSyntheticPaletteFixture() {
        Kml kml = Kml.unmarshal(new File(SYNTHETIC_PALETTE));
        assertNotNull("fixture should parse: " + SYNTHETIC_PALETTE, kml);

        Document doc = (Document) kml.getFeature();
        Style style = (Style) doc.getStyleSelector().get(0);
        Icon icon = style.getIconStyle().getIcon();

        assertEquals("https://example.com/weather-sprites.png", icon.getHref());
        assertEquals(Double.valueOf(0.0), icon.getX());
        assertEquals(Double.valueOf(0.0), icon.getY());
        assertEquals(Double.valueOf(138.0), icon.getW());
        assertEquals(Double.valueOf(138.0), icon.getH());
    }

    @Test
    public void unmarshalLibkmlReferenceFixtureWithFloats() {
        Kml kml = Kml.unmarshal(new File(LIBKML_ALL_GX));
        assertNotNull("fixture should parse: " + LIBKML_ALL_GX, kml);

        Icon paletteIcon = findFirstPaletteIcon((Document) kml.getFeature());
        assertNotNull("expected a Placemark whose IconStyle/Icon has gx palette values", paletteIcon);

        // libkml's golden uses non-integer doubles — hence Double rather than Integer.
        assertEquals(Double.valueOf(3.2), paletteIcon.getX());
        assertEquals(Double.valueOf(4.3), paletteIcon.getY());
        assertEquals(Double.valueOf(1.0), paletteIcon.getW());
        assertEquals(Double.valueOf(2.1), paletteIcon.getH());
    }

    @Test
    public void roundTripPreservesPaletteValues() {
        Kml original = new Kml();
        original.createAndSetDocument()
                .createAndAddStyle()
                .createAndSetIconStyle()
                .createAndSetIcon()
                .withHref("https://example.com/sheet.png")
                .withX(12.5).withY(48.0).withW(32.0).withH(32.0);

        String xml = marshal(original);
        Kml parsed = Kml.unmarshal(xml);
        assertNotNull(parsed);

        Document doc = (Document) parsed.getFeature();
        Icon icon = ((Style) doc.getStyleSelector().get(0)).getIconStyle().getIcon();

        assertEquals(Double.valueOf(12.5), icon.getX());
        assertEquals(Double.valueOf(48.0), icon.getY());
        assertEquals(Double.valueOf(32.0), icon.getW());
        assertEquals(Double.valueOf(32.0), icon.getH());
    }

    // --- helpers -----------------------------------------------------------

    /**
     * Depth-first search of the Document for the first {@link Icon} anywhere
     * in the tree that has any of the four palette-sheet elements set.
     * libkml-all-gx.kml buries it inside a nested Placemark/Style/IconStyle,
     * so we walk the feature tree to find it rather than hard-coding an index.
     */
    private static Icon findFirstPaletteIcon(Document doc) {
        for (Feature feature : doc.getFeature()) {
            if (feature instanceof Placemark) {
                StyleSelector sel = feature.getStyleSelector().isEmpty()
                        ? null
                        : feature.getStyleSelector().get(0);
                if (sel instanceof Style) {
                    IconStyle is = ((Style) sel).getIconStyle();
                    if (is != null && is.getIcon() != null && is.getIcon().getW() != null) {
                        return is.getIcon();
                    }
                }
            }
        }
        return null;
    }

    private static String marshal(Kml kml) {
        StringWriter writer = new StringWriter();
        kml.marshal(writer);
        return writer.toString();
    }

    private static String marshalStandalone(Icon icon) {
        // Wrap the icon in a full Kml so the marshaller has a valid root.
        Kml kml = new Kml();
        kml.createAndSetDocument()
                .createAndAddStyle()
                .createAndSetIconStyle()
                .setIcon(icon);
        return marshal(kml);
    }
}
