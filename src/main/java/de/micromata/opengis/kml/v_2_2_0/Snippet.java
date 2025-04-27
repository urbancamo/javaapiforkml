
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.Objects;

/**
 * {@code <snippet maxlines="2" >}
 * <p>
 * A short description of the feature. In Google Earth, this description is displayed 
 * in the Places panel under the name of the feature. If a Snippet is not supplied, 
 * the first two lines of the {@code <description>} are used. In Google Earth, if a Placemark
 * contains both a description and a Snippet, the {@code <Snippet>} appears beneath the Placemark
 * in the Places panel, and the {@code <description>} appears in the Placemark's description
 * balloon. This tag does not support HTML markup. {@code <Snippet>} has a maxLines attribute,
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
@XmlRootElement(name = "Snippet", namespace = "http://www.opengis.net/kml/2.2")
public class Snippet implements Cloneable
{

    /**
     * {@code <value>}
     * <p>
     * {@code <Placemark> <name>Club house</name> <ExtendedData> <Data name="holeNumber"> <value>1</value>
     * </Data> <Data name="holeYardage"> <value>234</value> </Data> <Data name="holePar"> 
     * <value>4</value> </Data> </ExtendedData> </Placemark> }
     * </p>
     * <p>
     * {@code <displayName>} An optional formatted version of name, to be used for display purposes.
     * {@code <value>} Value of the data pair. {@code <Placemark> <name>Club house</name> <ExtendedData>
     * <Data name="holeNumber"> <value>1</value> </Data> <Data name="holeYardage"> <value>234</value> 
     * </Data> <Data name="holePar"> <value>4</value> </Data> </ExtendedData> </Placemark> }
     * </p>
     * <p>
     * Value of the data pair. 
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
     * 
     */
    public int getMaxLines() {
        return maxLines;
    }

    /**
     *
     * 
     */
    public void setMaxLines(int value) {
        this.maxLines = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Snippet snippet = (Snippet) object;
        return maxLines == snippet.maxLines
                && Objects.equals(value, snippet.value);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(value);
        result = 31 * result + maxLines;
        return result;
    }

    /**
     * fluent setter
     *
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
     * 
     * @param maxLines
     *     required parameter
     */
    public Snippet withMaxLines(final int maxLines) {
        this.setMaxLines(maxLines);
        return this;
    }

    @Override
    public Snippet clone() {
        Snippet copy;
        try {
            copy = ((Snippet) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
