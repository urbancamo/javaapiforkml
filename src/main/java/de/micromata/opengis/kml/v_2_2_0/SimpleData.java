
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.Objects;

/**
 * {@code <simpledata name="string">}
 * <p>
 * {@code <SimpleData name="string">} This element assigns a value to the custom data field
 * identified by the name attribute. The type and name of this custom data field are 
 * declared in the {@code <Schema>} element. Here is an example of defining two custom data 
 * elements: {@code <Placemark> <name>Easy trail</name> <ExtendedData> <SchemaData schemaUrl="#TrailHeadTypeId">
 * <SimpleData name="TrailHeadName">Pi in the sky</SimpleData> <SimpleData name="TrailLength">3.14159</SimpleData> 
 * <SimpleData name="ElevationGain">10</SimpleData> </SchemaData> </ExtendedData>Point 
 * coordinates-122.000,37.002</coordinates> </Point> </Placemark> <Placemark> <name>Difficult 
 * trail</name> <ExtendedData> <SchemaData schemaUrl="#TrailHeadTypeId"> <SimpleData 
 * name="TrailHeadName">Mount Everest</SimpleData> <SimpleData name="TrailLength">347.45</SimpleData> 
 * <SimpleData name="ElevationGain">10000</SimpleData> </SchemaData> </ExtendedData> 
 * Point coordinates-122.000,37.002</coordinates> </Point> </Placemark> }
 * </p>
 * <p>
 * Here is an example of defining two custom data elements: 
 * </p>
 * <p>
 * This element assigns a value to the custom data field identified by the name attribute. 
 * The type and name of this custom data field are declared in the {@code <Schema>} element. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleDataType", propOrder = {
    "value"
})
@XmlRootElement(name = "SimpleData", namespace = "http://www.opengis.net/kml/2.2")
public class SimpleData implements Cloneable
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
    /**
     * {@code <name>}
     * <p>
     * User-defined text displayed in the 3D viewer as the label for the object (for example, 
     * for a Placemark, Folder, or NetworkLink). 
     * </p>
     * 
     * 
     * 
     */
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Value constructor with only mandatory fields
     * 
     * @param name
     *     required parameter
     */
    public SimpleData(final String name) {
        super();
        this.name = name;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private SimpleData() {
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
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getName() {
        return name;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        SimpleData that = (SimpleData) object;
        return Objects.equals(value, that.value)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(value);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param value
     *     required parameter
     */
    public SimpleData withValue(final String value) {
        this.setValue(value);
        return this;
    }

    @Override
    public SimpleData clone() {
        SimpleData copy;
        try {
            copy = ((SimpleData) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
