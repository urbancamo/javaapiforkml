
package de.micromata.opengis.kml.v_2_2_0.gx;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playModeEnumType.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * </p>
 * {@code
 * <simpleType name="playModeEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="pause"/>
 *   </restriction>
 * </simpleType>
 * }
 * 
 */
@XmlType(name = "playModeEnumType")
@XmlEnum
public enum PlayMode {

    @XmlEnumValue("pause")
    PAUSE("pause");
    private final String value;

    PlayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlayMode fromValue(String v) {
        for (PlayMode c: PlayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
