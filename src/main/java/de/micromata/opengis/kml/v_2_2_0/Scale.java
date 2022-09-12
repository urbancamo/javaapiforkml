
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * {@code <scale>}
 * <p>
 * Note: The {@code <geomScale>} tag has been deprecated. Use {@code <scale>} instead. 
 * </p>
 * <p>
 * Resizes the icon. 
 * </p>
 * <p>
 * Scales a model along the x, y, and z axes in the model's coordinate space. {@code <scale>
 * <x>2.5</x> <y>2.5</y> <z>3.5</z> </Scale> }
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleType", propOrder = {
    "x",
    "y",
    "z",
    "scaleSimpleExtension",
    "scaleObjectExtension"
})
@XmlRootElement(name = "Scale", namespace = "http://www.opengis.net/kml/2.2")
public class Scale
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <x>, <y>, <w>, <h>}
     * <p>
     * Use of these elements within {@code <Icon>}has been deprecated. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1.0")
    protected double x;
    @XmlElement(defaultValue = "1.0")
    protected double y;
    @XmlElement(defaultValue = "1.0")
    protected double z;
    @XmlElement(name = "ScaleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> scaleSimpleExtension;
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
    @XmlElement(name = "ScaleObjectExtensionGroup")
    protected List<AbstractObject> scaleObjectExtension;

    public Scale() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getX() {
        return x;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getY() {
        return y;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setY(double value) {
        this.y = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getZ() {
        return z;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setZ(double value) {
        this.z = value;
    }

    /**
     *
     * 
     */
    public List<Object> getScaleSimpleExtension() {
        if (scaleSimpleExtension == null) {
            scaleSimpleExtension = new ArrayList<Object>();
        }
        return this.scaleSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getScaleObjectExtension() {
        if (scaleObjectExtension == null) {
            scaleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.scaleObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(x);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(y);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(z);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        result = ((prime*result)+((scaleSimpleExtension == null)? 0 :scaleSimpleExtension.hashCode()));
        result = ((prime*result)+((scaleObjectExtension == null)? 0 :scaleObjectExtension.hashCode()));
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
        if (super.equals(obj) == false) {
            return false;
        }
        if ((obj instanceof Scale) == false) {
            return false;
        }
        Scale other = ((Scale) obj);
        if (x!= other.x) {
            return false;
        }
        if (y!= other.y) {
            return false;
        }
        if (z!= other.z) {
            return false;
        }
        if (scaleSimpleExtension == null) {
            if (other.scaleSimpleExtension!= null) {
                return false;
            }
        } else {
            if (scaleSimpleExtension.equals(other.scaleSimpleExtension) == false) {
                return false;
            }
        }
        if (scaleObjectExtension == null) {
            if (other.scaleObjectExtension!= null) {
                return false;
            }
        } else {
            if (scaleObjectExtension.equals(other.scaleObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * 
     * @param scaleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setScaleSimpleExtension(final List<Object> scaleSimpleExtension) {
        this.scaleSimpleExtension = scaleSimpleExtension;
    }

    /**
     * add a value to the scaleSimpleExtension property collection
     * 
     * @param scaleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Scale addToScaleSimpleExtension(final Object scaleSimpleExtension) {
        this.getScaleSimpleExtension().add(scaleSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param scaleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setScaleObjectExtension(final List<AbstractObject> scaleObjectExtension) {
        this.scaleObjectExtension = scaleObjectExtension;
    }

    /**
     * add a value to the scaleObjectExtension property collection
     * 
     * @param scaleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Scale addToScaleObjectExtension(final AbstractObject scaleObjectExtension) {
        this.getScaleObjectExtension().add(scaleObjectExtension);
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
    public Scale addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param x
     *     required parameter
     */
    public Scale withX(final double x) {
        this.setX(x);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param y
     *     required parameter
     */
    public Scale withY(final double y) {
        this.setY(y);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param z
     *     required parameter
     */
    public Scale withZ(final double z) {
        this.setZ(z);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param scaleSimpleExtension
     *     required parameter
     */
    public Scale withScaleSimpleExtension(final List<Object> scaleSimpleExtension) {
        this.setScaleSimpleExtension(scaleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param scaleObjectExtension
     *     required parameter
     */
    public Scale withScaleObjectExtension(final List<AbstractObject> scaleObjectExtension) {
        this.setScaleObjectExtension(scaleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Scale withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Scale withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Scale withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Scale clone() {
        Scale copy;
        copy = ((Scale) super.clone());
        copy.scaleSimpleExtension = new ArrayList<Object>((getScaleSimpleExtension().size()));
        for (Object iter: scaleSimpleExtension) {
            copy.scaleSimpleExtension.add(iter);
        }
        copy.scaleObjectExtension = new ArrayList<AbstractObject>((getScaleObjectExtension().size()));
        for (AbstractObject iter: scaleObjectExtension) {
            copy.scaleObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
