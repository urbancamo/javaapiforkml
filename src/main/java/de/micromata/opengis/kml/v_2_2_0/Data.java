
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <data name ="string">}
 * <p>
 * Creates an untyped name/value pair. The name can have two versions: name and displayName. 
 * The name attribute is used to identify the data pair within the KML file. The displayName 
 * element is used when a properly formatted name, with spaces and HTML formatting, 
 * is displayed in Google Earth. In the {@code <text>} element of {@code <BalloonStyle>}, the notation
 * $[name:displayName] is replaced with {@code <displayName>}. If you substitute the value
 * of the name attribute of the {@code <Data>} element in this format (for example, $[holeYardage],
 * the attribute value is replaced with {@code <value>}. By default, the Placemark's balloon
 * displays the name/value pairs associated with it. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder = {
    "displayName",
    "value",
    "dataExtension"
})
@XmlRootElement(name = "Data", namespace = "http://www.opengis.net/kml/2.2")
public class Data
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <displayname>}
     * <p>
     * An optional formatted version of name, to be used for display purposes. 
     * </p>
     * 
     * 
     * 
     */
    protected String displayName;
    /**
     * {@code <value>}
     * <p>
     * {@code <Placemark> <name>Club house</name> <ExtendedData> <Data name="holeNumber"> <value>1</value>
     * </Data> <Data name="holeYardage"> <value>234</value> </Data> <Data name="holePar"> 
     * <value>4</value> </Data> </ExtendedData> </Placemark> }
     * </p>
     * <p>
     * {@code <displayName> An optional formatted version of name, to be used for display purposes.
     * <value> Value of the data pair. <Placemark> <name>Club house</name> <ExtendedData> 
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
    @XmlElement(required = true)
    protected String value;
    @XmlElement(name = "DataExtension")
    protected List<Object> dataExtension;
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
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Value constructor with only mandatory fields
     * 
     * @param value
     *     required parameter
     */
    public Data(final String value) {
        super();
        this.value = value;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private Data() {
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
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
    public List<Object> getDataExtension() {
        if (dataExtension == null) {
            dataExtension = new ArrayList<Object>();
        }
        return this.dataExtension;
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
        if (!super.equals(object))
            return false;

        Data data = (Data) object;
        return Objects.equals(displayName, data.displayName)
                && Objects.equals(value, data.value)
                && Objects.equals(dataExtension, data.dataExtension)
                && Objects.equals(name, data.name);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(displayName);
        result = 31 * result + Objects.hashCode(value);
        result = 31 * result + Objects.hashCode(dataExtension);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    /**
     *
     * 
     * @param dataExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setDataExtension(final List<Object> dataExtension) {
        this.dataExtension = dataExtension;
    }

    /**
     * add a value to the dataExtension property collection
     * 
     * @param dataExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Data addToDataExtension(final Object dataExtension) {
        this.getDataExtension().add(dataExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Data addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param displayName
     *     required parameter
     */
    public Data withDisplayName(final String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param dataExtension
     *     required parameter
     */
    public Data withDataExtension(final List<Object> dataExtension) {
        this.setDataExtension(dataExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param name
     *     required parameter
     */
    public Data withName(final String name) {
        this.setName(name);
        return this;
    }

    @Obvious
    @Override
    public Data withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Data withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Data withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Data clone() {
        Data copy;
        copy = ((Data) super.clone());
        copy.dataExtension = new ArrayList<Object>((getDataExtension().size()));
        for (Object iter: dataExtension) {
            copy.dataExtension.add(iter);
        }
        return copy;
    }

}
