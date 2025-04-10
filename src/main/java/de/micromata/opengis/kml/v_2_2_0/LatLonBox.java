
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
 * {@code <latlongbox> <north>48.25475939255556</north> <south>48.25207367852141</south> <east>-90.86591508839973</east>
 * <west>-90.8714285289695</west> <rotation>39.37878630116985</rotation> </LatLonBox> }
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonBoxType", propOrder = {
    "rotation",
    "latLonBoxSimpleExtension",
    "latLonBoxObjectExtension"
})
@XmlRootElement(name = "LatLonBox", namespace = "http://www.opengis.net/kml/2.2")
public class LatLonBox
    extends AbstractLatLonBox
    implements Cloneable
{

    /**
     * rotation
     * <p>
     * Adjusts how the photo is placed inside the field of view. This element is useful 
     * if your photo has been rotated and deviates slightly from a desired horizontal view. 
     * </p>
     * <p>
     * Indicates the angle of rotation of the parent object. A value of 0 means no rotation. 
     * The value is an angle in degrees counterclockwise starting from north. Use ±180 
     * to indicate the rotation of the parent object from 0. The center of the rotation, 
     * if not (.5,.5), is specified in {@code <rotationXY>}.
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double rotation;
    @XmlElement(name = "LatLonBoxSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> latLonBoxSimpleExtension;
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
    @XmlElement(name = "LatLonBoxObjectExtensionGroup")
    protected List<AbstractObject> latLonBoxObjectExtension;

    public LatLonBox() {
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
    public double getRotation() {
        return rotation;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setRotation(double value) {
        this.rotation = value;
    }

    /**
     *
     * 
     */
    public List<Object> getLatLonBoxSimpleExtension() {
        if (latLonBoxSimpleExtension == null) {
            latLonBoxSimpleExtension = new ArrayList<Object>();
        }
        return this.latLonBoxSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLatLonBoxObjectExtension() {
        if (latLonBoxObjectExtension == null) {
            latLonBoxObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.latLonBoxObjectExtension;
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

        LatLonBox latLonBox = (LatLonBox) object;
        return Double.compare(rotation, latLonBox.rotation) == 0
                && Objects.equals(latLonBoxSimpleExtension, latLonBox.latLonBoxSimpleExtension)
                && Objects.equals(latLonBoxObjectExtension, latLonBox.latLonBoxObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(rotation);
        result = 31 * result + Objects.hashCode(latLonBoxSimpleExtension);
        result = 31 * result + Objects.hashCode(latLonBoxObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param latLonBoxSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLatLonBoxSimpleExtension(final List<Object> latLonBoxSimpleExtension) {
        this.latLonBoxSimpleExtension = latLonBoxSimpleExtension;
    }

    /**
     * add a value to the latLonBoxSimpleExtension property collection
     * 
     * @param latLonBoxSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonBox addToLatLonBoxSimpleExtension(final Object latLonBoxSimpleExtension) {
        this.getLatLonBoxSimpleExtension().add(latLonBoxSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param latLonBoxObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLatLonBoxObjectExtension(final List<AbstractObject> latLonBoxObjectExtension) {
        this.latLonBoxObjectExtension = latLonBoxObjectExtension;
    }

    /**
     * add a value to the latLonBoxObjectExtension property collection
     * 
     * @param latLonBoxObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonBox addToLatLonBoxObjectExtension(final AbstractObject latLonBoxObjectExtension) {
        this.getLatLonBoxObjectExtension().add(latLonBoxObjectExtension);
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
    public LatLonBox addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setAbstractLatLonBoxSimpleExtension(final List<Object> abstractLatLonBoxSimpleExtension) {
        super.setAbstractLatLonBoxSimpleExtension(abstractLatLonBoxSimpleExtension);
    }

    @Obvious
    @Override
    public LatLonBox addToAbstractLatLonBoxSimpleExtension(final Object abstractLatLonBoxSimpleExtension) {
        super.getAbstractLatLonBoxSimpleExtension().add(abstractLatLonBoxSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setAbstractLatLonBoxObjectExtension(final List<AbstractObject> abstractLatLonBoxObjectExtension) {
        super.setAbstractLatLonBoxObjectExtension(abstractLatLonBoxObjectExtension);
    }

    @Obvious
    @Override
    public LatLonBox addToAbstractLatLonBoxObjectExtension(final AbstractObject abstractLatLonBoxObjectExtension) {
        super.getAbstractLatLonBoxObjectExtension().add(abstractLatLonBoxObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param rotation
     *     required parameter
     */
    public LatLonBox withRotation(final double rotation) {
        this.setRotation(rotation);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latLonBoxSimpleExtension
     *     required parameter
     */
    public LatLonBox withLatLonBoxSimpleExtension(final List<Object> latLonBoxSimpleExtension) {
        this.setLatLonBoxSimpleExtension(latLonBoxSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latLonBoxObjectExtension
     *     required parameter
     */
    public LatLonBox withLatLonBoxObjectExtension(final List<AbstractObject> latLonBoxObjectExtension) {
        this.setLatLonBoxObjectExtension(latLonBoxObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withNorth(final double north) {
        super.withNorth(north);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withSouth(final double south) {
        super.withSouth(south);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withEast(final double east) {
        super.withEast(east);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withWest(final double west) {
        super.withWest(west);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withAbstractLatLonBoxSimpleExtension(final List<Object> abstractLatLonBoxSimpleExtension) {
        super.withAbstractLatLonBoxSimpleExtension(abstractLatLonBoxSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonBox withAbstractLatLonBoxObjectExtension(final List<AbstractObject> abstractLatLonBoxObjectExtension) {
        super.withAbstractLatLonBoxObjectExtension(abstractLatLonBoxObjectExtension);
        return this;
    }

    @Override
    public LatLonBox clone() {
        LatLonBox copy;
        copy = ((LatLonBox) super.clone());
        copy.latLonBoxSimpleExtension = new ArrayList<Object>((getLatLonBoxSimpleExtension().size()));
        for (Object iter: latLonBoxSimpleExtension) {
            copy.latLonBoxSimpleExtension.add(iter);
        }
        copy.latLonBoxObjectExtension = new ArrayList<AbstractObject>((getLatLonBoxObjectExtension().size()));
        for (AbstractObject iter: latLonBoxObjectExtension) {
            copy.latLonBoxObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
