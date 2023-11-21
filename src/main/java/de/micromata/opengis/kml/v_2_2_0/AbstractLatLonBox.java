
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * latlongbox
 * <p>
 * Specifies where the top, bottom, right, and left sides of a bounding box for the 
 * ground overlay are aligned. north Specifies the latitude of the north edge of 
 * the bounding box, in decimal degrees from 0 to ±90. south Specifies the latitude 
 * of the south edge of the bounding box, in decimal degrees from 0 to ±90. east 
 * Specifies the longitude of the east edge of the bounding box, in decimal degrees 
 * from 0 to ±180. (For overlays that overlap the meridian of 180° longitude, values 
 * can extend beyond that range.) west Specifies the longitude of the west edge of 
 * the bounding box, in decimal degrees from 0 to ±180. (For overlays that overlap 
 * the meridian of 180° longitude, values can extend beyond that range.) rotation
 * Specifies a rotation of the overlay about its center, in degrees. Values can be 
 * ±180. The default is 0 (north). Rotations are specified in a counterclockwise direction. 
 * latlongbox north 48.25475939255556  south 48.25207367852141 east-90.86591508839973
 * west -90.8714285289695 rotation 39.37878630116985
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLatLonBoxType", propOrder = {
    "north",
    "south",
    "east",
    "west",
    "abstractLatLonBoxSimpleExtension",
    "abstractLatLonBoxObjectExtension"
})
@XmlSeeAlso({
    LatLonAltBox.class,
    LatLonBox.class
})
public abstract class AbstractLatLonBox
    extends AbstractObject
    implements Cloneable
{

    /**
     * north (required)
     * <p>
     * Specifies the latitude of the north edge of the bounding box, in decimal degrees 
     * from 0 to ±90. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "180.0")
    protected double north;
    /**
     * south (required)
     * <p>
     * Specifies the latitude of the south edge of the bounding box, in decimal degrees 
     * from 0 to ±90. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "-180.0")
    protected double south;
    /**
     * east (required)
     * 
     * 
     */
    @XmlElement(defaultValue = "180.0")
    protected double east;
    /**
     * west (required)
     * <p>
     * Specifies the longitude of the west edge of the bounding box, in decimal degrees 
     * from 0 to ±180. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "-180.0")
    protected double west;
    @XmlElement(name = "AbstractLatLonBoxSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractLatLonBoxSimpleExtension;
    /**
     * Object
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
    @XmlElement(name = "AbstractLatLonBoxObjectExtensionGroup")
    protected List<AbstractObject> abstractLatLonBoxObjectExtension;

    public AbstractLatLonBox() {
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
    public double getNorth() {
        return north;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setNorth(double value) {
        this.north = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getSouth() {
        return south;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setSouth(double value) {
        this.south = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getEast() {
        return east;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setEast(double value) {
        this.east = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getWest() {
        return west;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setWest(double value) {
        this.west = value;
    }

    /**
     *
     * 
     */
    public List<Object> getAbstractLatLonBoxSimpleExtension() {
        if (abstractLatLonBoxSimpleExtension == null) {
            abstractLatLonBoxSimpleExtension = new ArrayList<Object>();
        }
        return this.abstractLatLonBoxSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getAbstractLatLonBoxObjectExtension() {
        if (abstractLatLonBoxObjectExtension == null) {
            abstractLatLonBoxObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.abstractLatLonBoxObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(north);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(south);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(east);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(west);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        result = ((prime*result)+((abstractLatLonBoxSimpleExtension == null)? 0 :abstractLatLonBoxSimpleExtension.hashCode()));
        result = ((prime*result)+((abstractLatLonBoxObjectExtension == null)? 0 :abstractLatLonBoxObjectExtension.hashCode()));
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
        if ((obj instanceof AbstractLatLonBox) == false) {
            return false;
        }
        AbstractLatLonBox other = ((AbstractLatLonBox) obj);
        if (north!= other.north) {
            return false;
        }
        if (south!= other.south) {
            return false;
        }
        if (east!= other.east) {
            return false;
        }
        if (west!= other.west) {
            return false;
        }
        if (abstractLatLonBoxSimpleExtension == null) {
            if (other.abstractLatLonBoxSimpleExtension!= null) {
                return false;
            }
        } else {
            if (abstractLatLonBoxSimpleExtension.equals(other.abstractLatLonBoxSimpleExtension) == false) {
                return false;
            }
        }
        if (abstractLatLonBoxObjectExtension == null) {
            if (other.abstractLatLonBoxObjectExtension!= null) {
                return false;
            }
        } else {
            if (abstractLatLonBoxObjectExtension.equals(other.abstractLatLonBoxObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * 
     * @param abstractLatLonBoxSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setAbstractLatLonBoxSimpleExtension(final List<Object> abstractLatLonBoxSimpleExtension) {
        this.abstractLatLonBoxSimpleExtension = abstractLatLonBoxSimpleExtension;
    }

    /**
     * add a value to the abstractLatLonBoxSimpleExtension property collection
     * 
     * @param abstractLatLonBoxSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add).
     */
    public AbstractLatLonBox addToAbstractLatLonBoxSimpleExtension(final Object abstractLatLonBoxSimpleExtension) {
        this.getAbstractLatLonBoxSimpleExtension().add(abstractLatLonBoxSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param abstractLatLonBoxObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setAbstractLatLonBoxObjectExtension(final List<AbstractObject> abstractLatLonBoxObjectExtension) {
        this.abstractLatLonBoxObjectExtension = abstractLatLonBoxObjectExtension;
    }

    /**
     * add a value to the abstractLatLonBoxObjectExtension property collection
     * 
     * @param abstractLatLonBoxObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add).
     */
    public AbstractLatLonBox addToAbstractLatLonBoxObjectExtension(final AbstractObject abstractLatLonBoxObjectExtension) {
        this.getAbstractLatLonBoxObjectExtension().add(abstractLatLonBoxObjectExtension);
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
    public AbstractLatLonBox addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param north
     *     required parameter
     * @return
     *     AbstractLatLonBox
     */
    public AbstractLatLonBox withNorth(final double north) {
        this.setNorth(north);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param south
     *     required parameter
     * @return
     *     AbstractLatLonBox
     */
    public AbstractLatLonBox withSouth(final double south) {
        this.setSouth(south);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param east
     *     required parameter
     * @return
     *     AbstractLatLonBox
     */
    public AbstractLatLonBox withEast(final double east) {
        this.setEast(east);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param west
     *     required parameter
     * @return
     *     AbstractLatLonBox
     */
    public AbstractLatLonBox withWest(final double west) {
        this.setWest(west);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractLatLonBoxSimpleExtension
     *     required parameter
     * @return
     *     AbstractLatLonBox
     */
    public AbstractLatLonBox withAbstractLatLonBoxSimpleExtension(final List<Object> abstractLatLonBoxSimpleExtension) {
        this.setAbstractLatLonBoxSimpleExtension(abstractLatLonBoxSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractLatLonBoxObjectExtension
     *     required parameter
     * @return
     *     AbstractLatLonBox
     */
    public AbstractLatLonBox withAbstractLatLonBoxObjectExtension(final List<AbstractObject> abstractLatLonBoxObjectExtension) {
        this.setAbstractLatLonBoxObjectExtension(abstractLatLonBoxObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public AbstractLatLonBox withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public AbstractLatLonBox withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public AbstractLatLonBox withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public AbstractLatLonBox clone() {
        AbstractLatLonBox copy;
        copy = ((AbstractLatLonBox) super.clone());
        copy.abstractLatLonBoxSimpleExtension = new ArrayList<Object>((getAbstractLatLonBoxSimpleExtension().size()));
        for (Object iter: abstractLatLonBoxSimpleExtension) {
            copy.abstractLatLonBoxSimpleExtension.add(iter);
        }
        copy.abstractLatLonBoxObjectExtension = new ArrayList<AbstractObject>((getAbstractLatLonBoxObjectExtension().size()));
        for (AbstractObject iter: abstractLatLonBoxObjectExtension) {
            copy.abstractLatLonBoxObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
