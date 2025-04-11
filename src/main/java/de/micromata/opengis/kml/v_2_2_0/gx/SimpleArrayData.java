
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.AbstractObject;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleArrayDataType", propOrder = {
    "value",
    "simpleArrayDataExtension"
})
@XmlRootElement(name = "SimpleArrayData", namespace = "http://www.google.com/kml/ext/2.2")
public class SimpleArrayData
    extends AbstractObject
    implements Cloneable
{

    protected List<String> value;
    @XmlElement(name = "SimpleArrayDataExtension")
    protected List<Object> simpleArrayDataExtension;
    @XmlAttribute(name = "name")
    protected String name;

    public SimpleArrayData() {
        super();
    }

    /**
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * 
     */
    public List<Object> getSimpleArrayDataExtension() {
        if (simpleArrayDataExtension == null) {
            simpleArrayDataExtension = new ArrayList<Object>();
        }
        return this.simpleArrayDataExtension;
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
        if (!super.equals(object))
            return false;

        SimpleArrayData that = (SimpleArrayData) object;
        return Objects.equals(value, that.value)
                && Objects.equals(simpleArrayDataExtension, that.simpleArrayDataExtension)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(value);
        result = 31 * result + Objects.hashCode(simpleArrayDataExtension);
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    /**
     * Sets the value of the value property Objects of the following type(s) are allowed in the list {@code List<String>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withValue} instead.
     * 
     * 
     * @param value
     *     Objects of the following type are allowed in the list: {@link String}
     */
    public void setValue(final List<String> value) {
        this.value = value;
    }

    /**
     * add a value to the value property collection
     * 
     * @param value
     *     Objects of the following type are allowed in the list: {@link String}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SimpleArrayData addToValue(final String value) {
        this.getValue().add(value);
        return this;
    }

    /**
     * Sets the value of the simpleArrayDataExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withSimpleArrayDataExtension} instead.
     * 
     * 
     * @param simpleArrayDataExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setSimpleArrayDataExtension(final List<Object> simpleArrayDataExtension) {
        this.simpleArrayDataExtension = simpleArrayDataExtension;
    }

    /**
     * add a value to the simpleArrayDataExtension property collection
     * 
     * @param simpleArrayDataExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SimpleArrayData addToSimpleArrayDataExtension(final Object simpleArrayDataExtension) {
        this.getSimpleArrayDataExtension().add(simpleArrayDataExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public SimpleArrayData addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param value
     *     required parameter
     */
    public SimpleArrayData withValue(final List<String> value) {
        this.setValue(value);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param simpleArrayDataExtension
     *     required parameter
     */
    public SimpleArrayData withSimpleArrayDataExtension(final List<Object> simpleArrayDataExtension) {
        this.setSimpleArrayDataExtension(simpleArrayDataExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param name
     *     required parameter
     */
    public SimpleArrayData withName(final String name) {
        this.setName(name);
        return this;
    }

    @Obvious
    @Override
    public SimpleArrayData withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public SimpleArrayData withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public SimpleArrayData withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public SimpleArrayData clone() {
        SimpleArrayData copy;
        copy = ((SimpleArrayData) super.clone());
        copy.value = new ArrayList<String>((getValue().size()));
        for (String iter: value) {
            copy.value.add(iter);
        }
        copy.simpleArrayDataExtension = new ArrayList<Object>((getSimpleArrayDataExtension().size()));
        for (Object iter: simpleArrayDataExtension) {
            copy.simpleArrayDataExtension.add(iter);
        }
        return copy;
    }

}
