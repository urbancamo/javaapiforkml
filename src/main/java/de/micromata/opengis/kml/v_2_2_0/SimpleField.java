
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFieldType", propOrder = {
    "displayName",
    "simpleFieldExtension"
})
@XmlRootElement(name = "SimpleField", namespace = "http://www.opengis.net/kml/2.2")
public class SimpleField implements Cloneable
{

    protected String displayName;
    @XmlElement(name = "SimpleFieldExtension")
    protected List<Object> simpleFieldExtension;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name")
    protected String name;

    public SimpleField() {
        super();
    }

    /**
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
     */
    public List<Object> getSimpleFieldExtension() {
        if (simpleFieldExtension == null) {
            simpleFieldExtension = new ArrayList<Object>();
        }
        return this.simpleFieldExtension;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
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

        SimpleField that = (SimpleField) object;
        return Objects.equals(displayName, that.displayName)
                && Objects.equals(simpleFieldExtension, that.simpleFieldExtension)
                && Objects.equals(type, that.type)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(displayName);
        result = 31 * result + Objects.hashCode(simpleFieldExtension);
        result = 31 * result + Objects.hashCode(type);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    /**
     * Sets the value of the simpleFieldExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withSimpleFieldExtension} instead.
     * 
     * 
     * @param simpleFieldExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setSimpleFieldExtension(final List<Object> simpleFieldExtension) {
        this.simpleFieldExtension = simpleFieldExtension;
    }

    /**
     * add a value to the simpleFieldExtension property collection
     * 
     * @param simpleFieldExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SimpleField addToSimpleFieldExtension(final Object simpleFieldExtension) {
        this.getSimpleFieldExtension().add(simpleFieldExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param displayName
     *     required parameter
     */
    public SimpleField withDisplayName(final String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param simpleFieldExtension
     *     required parameter
     */
    public SimpleField withSimpleFieldExtension(final List<Object> simpleFieldExtension) {
        this.setSimpleFieldExtension(simpleFieldExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param type
     *     required parameter
     */
    public SimpleField withType(final String type) {
        this.setType(type);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param name
     *     required parameter
     */
    public SimpleField withName(final String name) {
        this.setName(name);
        return this;
    }

    @Override
    public SimpleField clone() {
        SimpleField copy;
        try {
            copy = ((SimpleField) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.simpleFieldExtension = new ArrayList<Object>((getSimpleFieldExtension().size()));
        for (Object iter: simpleFieldExtension) {
            copy.simpleFieldExtension.add(iter);
        }
        return copy;
    }

}
