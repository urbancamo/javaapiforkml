
package de.micromata.opengis.kml.v_2_2_0.gx;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleArrayFieldType", propOrder = {
    "displayName",
    "simpleArrayFieldExtension"
})
@XmlRootElement(name = "SimpleArrayField", namespace = "http://www.google.com/kml/ext/2.2")
public class SimpleArrayField implements Cloneable
{

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected String displayName;
    @XmlElement(name = "SimpleArrayFieldExtension")
    protected List<Object> simpleArrayFieldExtension;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name")
    protected String name;

    public SimpleArrayField() {
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
    public List<Object> getSimpleArrayFieldExtension() {
        if (simpleArrayFieldExtension == null) {
            simpleArrayFieldExtension = new ArrayList<Object>();
        }
        return this.simpleArrayFieldExtension;
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

        SimpleArrayField that = (SimpleArrayField) object;
        return Objects.equals(displayName, that.displayName)
                && Objects.equals(simpleArrayFieldExtension, that.simpleArrayFieldExtension)
                && Objects.equals(type, that.type)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(displayName);
        result = 31 * result + Objects.hashCode(simpleArrayFieldExtension);
        result = 31 * result + Objects.hashCode(type);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    /**
     * Sets the value of the simpleArrayFieldExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withSimpleArrayFieldExtension} instead.
     * 
     * 
     * @param simpleArrayFieldExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setSimpleArrayFieldExtension(final List<Object> simpleArrayFieldExtension) {
        this.simpleArrayFieldExtension = simpleArrayFieldExtension;
    }

    /**
     * add a value to the simpleArrayFieldExtension property collection
     * 
     * @param simpleArrayFieldExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SimpleArrayField addToSimpleArrayFieldExtension(final Object simpleArrayFieldExtension) {
        this.getSimpleArrayFieldExtension().add(simpleArrayFieldExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param displayName
     *     required parameter
     */
    public SimpleArrayField withDisplayName(final String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param simpleArrayFieldExtension
     *     required parameter
     */
    public SimpleArrayField withSimpleArrayFieldExtension(final List<Object> simpleArrayFieldExtension) {
        this.setSimpleArrayFieldExtension(simpleArrayFieldExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param type
     *     required parameter
     */
    public SimpleArrayField withType(final String type) {
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
    public SimpleArrayField withName(final String name) {
        this.setName(name);
        return this;
    }

    @Override
    public SimpleArrayField clone() {
        SimpleArrayField copy;
        try {
            copy = ((SimpleArrayField) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.simpleArrayFieldExtension = new ArrayList<Object>((getSimpleArrayFieldExtension().size()));
        for (Object iter: simpleArrayFieldExtension) {
            copy.simpleArrayFieldExtension.add(iter);
        }
        return copy;
    }

}
