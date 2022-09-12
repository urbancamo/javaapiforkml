
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {@code <Style>}
 * <p>
 * A Style defines an addressable style group that can be referenced by StyleMaps and 
 * Features. Styles affect how Geometry is presented in the 3D viewer and how Features 
 * appear in the Places panel of the List view. Shared styles are collected in a {@code <Document>} 
 * and must have an id defined for them so that they can be referenced by the individual 
 * Features that use them. 
 * </p>
 * <p>
 * A Style defines an addressable style group that can be referenced by StyleMaps and 
 * Features. Styles affect how Geometry is presented in the 3D viewer and how Features 
 * appear in the Places panel of the List view. Shared styles are collected in a {@code <Document>} 
 * and must have an id defined for them so that they can be referenced by the individual 
 * Features that use them. 
 * </p>
 * <p>
 * Use an id to refer to the style from a {@code <styleUrl>}.
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Style id="ID"&gt;
 * </strong>&lt;!-- extends StyleSelector --&gt;
 * 
 * &lt;!-- specific to Style --&gt;
 *   &lt;IconStyle&gt;...&lt;/IconStyle&gt;
 *   &lt;LabelStyle&gt;...&lt;/LabelStyle&gt;
 *   &lt;LineStyle&gt;...&lt;/LineStyle&gt;
 *   &lt;PolyStyle&gt;...&lt;/PolyStyle&gt;
 *   &lt;BalloonStyle&gt;...&lt;/BalloonStyle&gt;
 *   &lt;ListStyle&gt;<strong>...</strong>&lt;/ListStyle&gt;<strong>
 * &lt;/Style&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 * 
 * 
 * 
 */
@XmlType(name = "styleStateEnumType")
@XmlEnum
public enum StyleState {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("highlight")
    HIGHLIGHT("highlight");
    private final String value;

    StyleState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StyleState fromValue(String v) {
        for (StyleState c: StyleState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
