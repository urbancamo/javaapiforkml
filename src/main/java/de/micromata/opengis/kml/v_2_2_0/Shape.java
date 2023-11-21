
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Shape
 * <p>
 * rectangle, cylinder, sphere 
 * </p>
 * 
 * See Also: 
 * See {@code <PhotoOverlay>}
 * 
 * 
 * 
 */
@XmlType(name = "shapeEnumType")
@XmlEnum
public enum Shape {

    @XmlEnumValue("rectangle")
    RECTANGLE("rectangle"),
    @XmlEnumValue("cylinder")
    CYLINDER("cylinder"),
    @XmlEnumValue("sphere")
    SPHERE("sphere");
    private final String value;

    Shape(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Shape fromValue(String v) {
        for (Shape c: Shape.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
