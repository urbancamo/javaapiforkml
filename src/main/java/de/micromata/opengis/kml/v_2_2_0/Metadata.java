
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;


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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((any == null)? 0 :any.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if ((obj instanceof Metadata) == false) {
            return false;
        }
        Metadata other = ((Metadata) obj);
        if (any == null) {
            if (other.any!= null) {
                return false;
            }
        } else {
            if (any.equals(other.any) == false) {
                return false;
            }
        }
        return true;
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
