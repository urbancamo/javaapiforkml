
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Units
 * <p>
 * fraction, pixels, insetPixels 
 * </p>
 * 
 * See Also: 
 * See {@code <hotSpot>} in {@code <IconStyle>}, {@code <ScreenOverlay>}
 * 
 * 
 * 
 */
@XmlType(name = "unitsEnumType")
@XmlEnum
public enum Units {

    @XmlEnumValue("fraction")
    FRACTION("fraction"),
    @XmlEnumValue("pixels")
    PIXELS("pixels"),
    @XmlEnumValue("insetPixels")
    INSET_PIXELS("insetPixels");
    private final String value;

    Units(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Units fromValue(String v) {
        for (Units c: Units.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
