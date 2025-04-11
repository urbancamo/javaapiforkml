
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <metadata>} (deprecated in kml 2.2; use {@code <extendeddata>} instead)
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType", propOrder = {
    "any"
})
@Deprecated
@XmlRootElement(name = "Metadata", namespace = "http://www.opengis.net/kml/2.2")
public class Metadata implements Cloneable
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public Metadata() {
        super();
    }

    /**
     *
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Metadata metadata = (Metadata) object;
        return Objects.equals(any, metadata.any);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(any);
    }

    /**
     *
     * 
     * @param any
     *     Objects of the following type are allowed in the list: {@link Object}{@link Element}
     */
    public void setAny(final List<Object> any) {
        this.any = any;
    }

    /**
     * add a value to the any property collection
     * 
     * @param any
     *     Objects of the following type are allowed in the list: {@link Object}{@link Element}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Metadata addToAny(final Object any) {
        this.getAny().add(any);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param any
     *     required parameter
     */
    public Metadata withAny(final List<Object> any) {
        this.setAny(any);
        return this;
    }

    @Override
    public Metadata clone() {
        Metadata copy;
        try {
            copy = ((Metadata) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.any = new ArrayList<Object>((getAny().size()));
        for (Object iter: any) {
            copy.any.add(iter);
        }
        return copy;
    }

}
