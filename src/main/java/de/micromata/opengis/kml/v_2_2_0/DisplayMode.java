
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DisplayMode
 * <p>
 * default, hide 
 * </p>
 * 
 * See Also: 
 * See {@code <BalloonStyle>}
 * 
 * 
 * 
 */
@XmlType(name = "displayModeEnumType")
@XmlEnum
public enum DisplayMode {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("hide")
    HIDE("hide");
    private final String value;

    DisplayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayMode fromValue(String v) {
        for (DisplayMode c: DisplayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
