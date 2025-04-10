
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Orientation>}
 * <p>
 * Describes rotation of a 3D model's coordinate system to position the object in Google 
 * Earth. See diagram below. {@code <Orientation> <heading>45.0</heading> <tilt>10.0</tilt>
 * <roll>0.0</roll> </Orientation> }
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientationType", propOrder = {
    "heading",
    "tilt",
    "roll",
    "orientationSimpleExtension",
    "orientationObjectExtension"
})
@XmlRootElement(name = "Orientation", namespace = "http://www.opengis.net/kml/2.2")
public class Orientation
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <heading>}
     * <p>
     * Direction (azimuth) of the camera, in degrees. Default=0 (true North). (See diagram.) 
     * Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Direction (that is, North, South, East, West), in degrees. Default=0 (North). (See 
     * diagram below.) Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Direction (that is, North, South, East, West), in degrees. Default=0 (North). (See 
     * diagram.) Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Rotation about the z axis (normal to the Earth's surface). A value of 0 (the default) 
     * equals North. A positive rotation is clockwise around the z axis and specified in 
     * degrees from 0 to 360. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double heading;
    /**
     * {@code <tilt>}
     * <p>
     * Angle between the direction of the LookAt position and the normal to the surface 
     * of the earth. (See diagram below.) Values range from 0 to 90 degrees. Values for 
     * {@code <tilt>} cannot be negative. A {@code <tilt>} value of 0 degrees indicates viewing from directly 
     * above. A {@code <tilt>} value of 90 degrees indicates viewing along the horizon. 
     * </p>
     * <p>
     * Rotation about the x axis. A positive rotation is clockwise around the x axis and 
     * specified in degrees from 0 to 360. 
     * </p>
     * <p>
     * Rotation, in degrees, of the camera around the X axis. A value of 0 indicates that 
     * the view is aimed straight down toward the earth (the most common case). A value 
     * for 90 for {@code <tilt>} indicates that the view is aimed toward the horizon. Values greater 
     * than 90 indicate that the view is pointed up into the sky. Values for {@code <tilt>} are 
     * clamped at +180 degrees. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double tilt;
    /**
     * {@code <roll>}
     * <p>
     * {@code <heading>} Rotation about the z axis (normal to the Earth's surface). A value of 
     *  0 (the default) equals North. A positive rotation is clockwise around the z axis 
     * and specified in degrees from 0 to 360. {@code <tilt>} Rotation about the x axis. A positive 
     * rotation is clockwise around the x axis and specified in degrees from 0 to 360. 
     * {@code <roll>} Rotation about the y axis. A positive rotation is clockwise around the y 
     * axis and specified in degrees from 0 to 360. This diagram illustrates the typical 
     * orientation of a model's axes: 
     * </p>
     * <p>
     * Rotation about the y axis. A positive rotation is clockwise around the y axis and 
     * specified in degrees from 0 to 360. 
     * </p>
     * <p>
     * Rotation, in degrees, of the camera around the Z axis. Values range from −180 to 
     * +180 degrees. 
     * </p>
     * <p>
     * This diagram illustrates the typical orientation of a model's axes: 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double roll;
    @XmlElement(name = "OrientationSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> orientationSimpleExtension;
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
    @XmlElement(name = "OrientationObjectExtensionGroup")
    protected List<AbstractObject> orientationObjectExtension;

    public Orientation() {
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
    public double getHeading() {
        return heading;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setHeading(double value) {
        this.heading = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getTilt() {
        return tilt;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setTilt(double value) {
        this.tilt = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getRoll() {
        return roll;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setRoll(double value) {
        this.roll = value;
    }

    /**
     *
     * 
     */
    public List<Object> getOrientationSimpleExtension() {
        if (orientationSimpleExtension == null) {
            orientationSimpleExtension = new ArrayList<Object>();
        }
        return this.orientationSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getOrientationObjectExtension() {
        if (orientationObjectExtension == null) {
            orientationObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.orientationObjectExtension;
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

        Orientation that = (Orientation) object;
        return Double.compare(heading, that.heading) == 0
                && Double.compare(tilt, that.tilt) == 0
                && Double.compare(roll, that.roll) == 0
                && Objects.equals(orientationSimpleExtension, that.orientationSimpleExtension)
                && Objects.equals(orientationObjectExtension, that.orientationObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(heading);
        result = 31 * result + Double.hashCode(tilt);
        result = 31 * result + Double.hashCode(roll);
        result = 31 * result + Objects.hashCode(orientationSimpleExtension);
        result = 31 * result + Objects.hashCode(orientationObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param orientationSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setOrientationSimpleExtension(final List<Object> orientationSimpleExtension) {
        this.orientationSimpleExtension = orientationSimpleExtension;
    }

    /**
     * add a value to the orientationSimpleExtension property collection
     * 
     * @param orientationSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Orientation addToOrientationSimpleExtension(final Object orientationSimpleExtension) {
        this.getOrientationSimpleExtension().add(orientationSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param orientationObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setOrientationObjectExtension(final List<AbstractObject> orientationObjectExtension) {
        this.orientationObjectExtension = orientationObjectExtension;
    }

    /**
     * add a value to the orientationObjectExtension property collection
     * 
     * @param orientationObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Orientation addToOrientationObjectExtension(final AbstractObject orientationObjectExtension) {
        this.getOrientationObjectExtension().add(orientationObjectExtension);
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
    public Orientation addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param heading
     *     required parameter
     */
    public Orientation withHeading(final double heading) {
        this.setHeading(heading);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param tilt
     *     required parameter
     */
    public Orientation withTilt(final double tilt) {
        this.setTilt(tilt);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param roll
     *     required parameter
     */
    public Orientation withRoll(final double roll) {
        this.setRoll(roll);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param orientationSimpleExtension
     *     required parameter
     */
    public Orientation withOrientationSimpleExtension(final List<Object> orientationSimpleExtension) {
        this.setOrientationSimpleExtension(orientationSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param orientationObjectExtension
     *     required parameter
     */
    public Orientation withOrientationObjectExtension(final List<AbstractObject> orientationObjectExtension) {
        this.setOrientationObjectExtension(orientationObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Orientation withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Orientation withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Orientation withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Orientation clone() {
        Orientation copy;
        copy = ((Orientation) super.clone());
        copy.orientationSimpleExtension = new ArrayList<Object>((getOrientationSimpleExtension().size()));
        for (Object iter: orientationSimpleExtension) {
            copy.orientationSimpleExtension.add(iter);
        }
        copy.orientationObjectExtension = new ArrayList<AbstractObject>((getOrientationObjectExtension().size()));
        for (AbstractObject iter: orientationObjectExtension) {
            copy.orientationObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
