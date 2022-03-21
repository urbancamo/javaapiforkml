
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * GridOrigin
 * <p>
 * lowerLeft, upperLeft 
 * </p>
 * 
 * See Also: 
 * See {@code <PhotoOverlay>}
 * 
 * 
 * 
 */
@XmlType(name = "gridOriginEnumType")
@XmlEnum
public enum GridOrigin {

    @XmlEnumValue("lowerLeft")
    LOWER_LEFT("lowerLeft"),
    @XmlEnumValue("upperLeft")
    UPPER_LEFT("upperLeft");
    private final String value;

    GridOrigin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GridOrigin fromValue(String v) {
        for (GridOrigin c: GridOrigin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
