
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.gx.SimpleArrayData;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <schemadata schemaurl="anyuri">}
 * <p>
 * The {@code <schemaURL>} can be a full URL, a reference to a Schema ID defined in an external
 * KML file, or a reference to a Schema ID defined in the same KML file. All of the 
 * following specifications are acceptable: 
 * </p>
 * <p>
 * The Schema element is always a child of Document. The ExtendedData element is a 
 * child of the Feature that contains the custom data. 
 * </p>
 * <p>
 * This element is used in conjunction with {@code <Schema>} to add typed custom data to a 
 * KML Feature. The Schema element (identified by the schemaUrl attribute) declares 
 * the custom data type. The actual data objects ("instances" of the custom data) are 
 * defined using the SchemaData element. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaDataType", propOrder = {
    "simpleData",
    "schemaDataExtension"
})
@XmlRootElement(name = "SchemaData", namespace = "http://www.opengis.net/kml/2.2")
public class SchemaData
    extends AbstractObject
    implements Cloneable
{

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
     *Point coordinates-122.000,37.002</coordinates> </Point> </Placemark> }
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
    @XmlElement(name = "SimpleData")
    protected List<SimpleData> simpleData;
    /**
     * {@code <Object>}
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the Update mechanism is to 
     * be used. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;<strong>
     * &lt;!-- <em>Object</em> id="ID" targetId="NCName" --&gt;
     * &lt;!-- /<em>Object</em>&gt; --&gt;</strong></pre>
     * 
     * 
     * 
     */
    @XmlElement(name = "SchemaDataExtension")
    protected List<Object> schemaDataExtension;
    @XmlAttribute(name = "schemaUrl")
    @XmlSchemaType(name = "anyURI")
    protected String schemaUrl;

    public SchemaData() {
        super();
    }

    /**
     *
     * 
     */
    public List<SimpleData> getSimpleData() {
        if (simpleData == null) {
            simpleData = new ArrayList<SimpleData>();
        }
        return this.simpleData;
    }

    /**
     *
     * 
     */
    public List<Object> getSchemaDataExtension() {
        if (schemaDataExtension == null) {
            schemaDataExtension = new ArrayList<Object>();
        }
        return this.schemaDataExtension;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getSchemaUrl() {
        return schemaUrl;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setSchemaUrl(String value) {
        this.schemaUrl = value;
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

        SchemaData that = (SchemaData) object;
        return Objects.equals(simpleData, that.simpleData)
                && Objects.equals(schemaDataExtension, that.schemaDataExtension)
                && Objects.equals(schemaUrl, that.schemaUrl);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(simpleData);
        result = 31 * result + Objects.hashCode(schemaDataExtension);
        result = 31 * result + Objects.hashCode(schemaUrl);
        return result;
    }

    /**
     * Creates a new instance of {@link SimpleData} and adds it to simpleData.
     * This method is a short version for:
     * {@code
     * SimpleData simpleData = new SimpleData();
     * this.getSimpleData().add(simpleData); }
     * 
     * 
     * @param name
     *     required parameter
     */
    public SimpleData createAndAddSimpleData(final String name) {
        SimpleData newValue = new SimpleData(name);
        this.getSimpleData().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param simpleData
     *     Objects of the following type are allowed in the list: {@link SimpleData}
     */
    public void setSimpleData(final List<SimpleData> simpleData) {
        this.simpleData = simpleData;
    }

    /**
     * add a value to the simpleData property collection
     * 
     * @param simpleData
     *     Objects of the following type are allowed in the list: {@link SimpleData}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SchemaData addToSimpleData(final SimpleData simpleData) {
        this.getSimpleData().add(simpleData);
        return this;
    }

    /**
     *
     * 
     * @param schemaDataExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link SimpleArrayData}{@code >}{@code <}{@link Object}{@code >}
     */
    public void setSchemaDataExtension(final List<Object> schemaDataExtension) {
        this.schemaDataExtension = schemaDataExtension;
    }

    /**
     * add a value to the schemaDataExtension property collection
     * 
     * @param schemaDataExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link SimpleArrayData}{@code >}{@code <}{@link Object}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SchemaData addToSchemaDataExtension(final Object schemaDataExtension) {
        this.getSchemaDataExtension().add(schemaDataExtension);
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
    public SchemaData addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param simpleData
     *     required parameter
     */
    public SchemaData withSimpleData(final List<SimpleData> simpleData) {
        this.setSimpleData(simpleData);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param schemaDataExtension
     *     required parameter
     */
    public SchemaData withSchemaDataExtension(final List<Object> schemaDataExtension) {
        this.setSchemaDataExtension(schemaDataExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param schemaUrl
     *     required parameter
     */
    public SchemaData withSchemaUrl(final String schemaUrl) {
        this.setSchemaUrl(schemaUrl);
        return this;
    }

    @Obvious
    @Override
    public SchemaData withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public SchemaData withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public SchemaData withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public SchemaData clone() {
        SchemaData copy;
        copy = ((SchemaData) super.clone());
        copy.simpleData = new ArrayList<SimpleData>((getSimpleData().size()));
        for (SimpleData iter: simpleData) {
            copy.simpleData.add(iter.clone());
        }
        copy.schemaDataExtension = new ArrayList<Object>((getSchemaDataExtension().size()));
        for (Object iter: schemaDataExtension) {
            copy.schemaDataExtension.add(iter);
        }
        return copy;
    }

}
