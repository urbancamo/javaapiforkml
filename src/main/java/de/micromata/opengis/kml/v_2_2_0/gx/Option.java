
package de.micromata.opengis.kml.v_2_2_0.gx;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionType")
@XmlRootElement(name = "Option", namespace = "http://www.google.com/kml/ext/2.2")
public class Option implements Cloneable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "enabled")
    protected boolean enabled;

    public Option() {
        super();
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

    /**
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Option option = (Option) object;
        return enabled == option.enabled
                && Objects.equals(name, option.name);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(name);
        result = 31 * result + Boolean.hashCode(enabled);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param name
     *     required parameter
     */
    public Option withName(final String name) {
        this.setName(name);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param enabled
     *     required parameter
     */
    public Option withEnabled(final boolean enabled) {
        this.setEnabled(enabled);
        return this;
    }

    @Override
    public Option clone() {
        Option copy;
        try {
            copy = ((Option) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
