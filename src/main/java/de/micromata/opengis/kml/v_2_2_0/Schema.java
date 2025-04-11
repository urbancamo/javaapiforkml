
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.gx.SimpleArrayField;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Schema>}
 * <p>
 * Specifies a custom KML schema that is used to add custom data to KML Features. The 
 * "id" attribute is required and must be unique within the KML file. {@code <Schema>} is always 
 * a child of {@code <Document>}. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;Schema name="string" id="ID"&gt;
 *   &lt;SimpleField type="string" name="string"&gt;
 *     &lt;displayName&gt;...&lt;/displayName&gt;            &lt;!-- string --&gt;
 *   &lt;/SimpleField&gt;
 * &lt;/Schema&gt;</pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 * 
 * See Also: 
 * {@code <SchemaData>}
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaType", propOrder = {
    "simpleField",
    "schemaExtension"
})
@XmlRootElement(name = "Schema", namespace = "http://www.opengis.net/kml/2.2")
public class Schema implements Cloneable
{

    @XmlElement(name = "SimpleField")
    protected List<SimpleField> simpleField;
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
    @XmlElement(name = "SchemaExtension")
    protected List<Object> schemaExtension;
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
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    public Schema() {
        super();
    }

    /**
     *
     * 
     */
    public List<SimpleField> getSimpleField() {
        if (simpleField == null) {
            simpleField = new ArrayList<SimpleField>();
        }
        return this.simpleField;
    }

    /**
     *
     * 
     */
    public List<Object> getSchemaExtension() {
        if (schemaExtension == null) {
            schemaExtension = new ArrayList<Object>();
        }
        return this.schemaExtension;
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

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getId() {
        return id;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Schema schema = (Schema) object;
        return Objects.equals(simpleField, schema.simpleField)
                && Objects.equals(schemaExtension, schema.schemaExtension)
                && Objects.equals(name, schema.name)
                && Objects.equals(id, schema.id);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(simpleField);
        result = 31 * result + Objects.hashCode(schemaExtension);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(id);
        return result;
    }

    /**
     * Creates a new instance of {@link SimpleField} and adds it to simpleField.
     * This method is a short version for:
     * {@code
     * SimpleField simpleField = new SimpleField();
     * this.getSimpleField().add(simpleField); }
     * 
     * 
     */
    public SimpleField createAndAddSimpleField() {
        SimpleField newValue = new SimpleField();
        this.getSimpleField().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param simpleField
     *     Objects of the following type are allowed in the list: {@link SimpleField}
     */
    public void setSimpleField(final List<SimpleField> simpleField) {
        this.simpleField = simpleField;
    }

    /**
     * add a value to the simpleField property collection
     * 
     * @param simpleField
     *     Objects of the following type are allowed in the list: {@link SimpleField}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Schema addToSimpleField(final SimpleField simpleField) {
        this.getSimpleField().add(simpleField);
        return this;
    }

    /**
     *
     * 
     * @param schemaExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link SimpleArrayField}{@code >}{@code <}{@link Object}{@code >}
     */
    public void setSchemaExtension(final List<Object> schemaExtension) {
        this.schemaExtension = schemaExtension;
    }

    /**
     * add a value to the schemaExtension property collection
     * 
     * @param schemaExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link SimpleArrayField}{@code >}{@code <}{@link Object}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Schema addToSchemaExtension(final Object schemaExtension) {
        this.getSchemaExtension().add(schemaExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param simpleField
     *     required parameter
     */
    public Schema withSimpleField(final List<SimpleField> simpleField) {
        this.setSimpleField(simpleField);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param schemaExtension
     *     required parameter
     */
    public Schema withSchemaExtension(final List<Object> schemaExtension) {
        this.setSchemaExtension(schemaExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param name
     *     required parameter
     */
    public Schema withName(final String name) {
        this.setName(name);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param id
     *     required parameter
     */
    public Schema withId(final String id) {
        this.setId(id);
        return this;
    }

    @Override
    public Schema clone() {
        Schema copy;
        try {
            copy = ((Schema) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.simpleField = new ArrayList<SimpleField>((getSimpleField().size()));
        for (SimpleField iter: simpleField) {
            copy.simpleField.add(iter.clone());
        }
        copy.schemaExtension = new ArrayList<Object>((getSchemaExtension().size()));
        for (Object iter: schemaExtension) {
            copy.schemaExtension.add(iter);
        }
        return copy;
    }

}
