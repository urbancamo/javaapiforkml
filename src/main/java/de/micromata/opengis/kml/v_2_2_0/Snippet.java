
package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <snippet maxlines="2" >
 * <p>
 * A short description of the feature. In Google Earth, this description is displayed 
 * in the Places panel under the name of the feature. If a Snippet is not supplied, 
 * the first two lines of the <description> are used. In Google Earth, if a Placemark 
 * contains both a description and a Snippet, the <Snippet> appears beneath the Placemark 
 * in the Places panel, and the <description> appears in the Placemark's description 
 * balloon. This tag does not support HTML markup. <Snippet> has a maxLines attribute, 
 * an integer that specifies the maximum number of lines to display. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnippetType", propOrder = {
    "value"
})
@Deprecated
public class Snippet {

    /**
     * <value>
     * <p>
     * Value of the data pair. 
     * </p>
     * <p>
     * <Placemark> <name>Club house</name> <ExtendedData> <Data name="holeNumber"> <value>1</value> 
     * </Data> <Data name="holeYardage"> <value>234</value> </Data> <Data name="holePar"> 
     * <value>4</value> </Data> </ExtendedData> </Placemark> 
     * </p>
     * <p>
     * <displayName> An optional formatted version of name, to be used for display purposes. 
     * <value> Value of the data pair. <Placemark> <name>Club house</name> <ExtendedData> 
     * <Data name="holeNumber"> <value>1</value> </Data> <Data name="holeYardage"> <value>234</value> 
     * </Data> <Data name="holePar"> <value>4</value> </Data> </ExtendedData> </Placemark> 
     * </p>
     * 
     * 
     * 
     */
    @XmlValue
    protected String value;
    @XmlAttribute(name = "maxLines")
    protected int maxLines;

    public Snippet() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     */
    public int getMaxLines() {
        return maxLines;
    }

    /**
     * 
     */
    public void setMaxLines(int value) {
        this.maxLines = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((value == null)? 0 :value.hashCode()));
        result = ((prime*result)+ maxLines);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if ((obj instanceof Snippet) == false) {
            return false;
        }
        Snippet other = ((Snippet) obj);
        if (value == null) {
            if (other.value!= null) {
                return false;
            }
        } else {
            if (value.equals(other.value) == false) {
                return false;
            }
        }
        if (maxLines!= other.maxLines) {
            return false;
        }
        return true;
    }

    /**
     * fluent setter
     * 
     * @param value
     *     required parameter
     */
    public Snippet withValue(final String value) {
        this.setValue(value);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param maxLines
     *     required parameter
     */
    public Snippet withMaxLines(final int maxLines) {
        this.setMaxLines(maxLines);
        return this;
    }

}
