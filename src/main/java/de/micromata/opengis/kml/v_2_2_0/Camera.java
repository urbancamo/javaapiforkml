
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Camera
 * <p>
 * Camera can also contain a TimePrimitive ({@code <gx:TimeSpan>} or {@code <gx:TimeStamp>}). Time
 * values in Camera affect historical imagery, sunlight, and the display of time-stamped 
 * features. For more information, read Time with AbstractViews in the Time and Animation 
 * chapter of the Developer's Guide. 
 * </p>
 * <p>
 * Camera provides full six-degrees-of-freedom control over the view, so you can 
 * position the Camera in space and then rotate it around the X, Y, and Z axes. Most 
 * importantly, you can tilt the camera view so that you're looking above the horizon 
 * into the sky. 
 * </p>
 * <p>
 * Defines the virtual camera that views the scene. This element defines the position 
 * of the camera relative to the Earth's surface as well as the viewing direction of 
 * the camera. The camera position is defined by {@code <longitude>}, {@code <latitude>}, {@code <altitude>},
 * and either {@code <altitudeMode>} or {@code <gx:altitudeMode>}. The viewing direction of the camera
 * is defined by {@code <heading>}, {@code <tilt>}, and {@code <roll>}. Camera can be a child element of
 * any Feature or of {@code <NetworkLinkControl>}. A parent element cannot contain both a Camera
 * and a LookAt at the same time. 
 * </p>
 * <p>
 * Defining a View 
 * </p>
 * <p>
 * The X axis points toward the right of the camera and is called the right vector. 
 * The Y axis defines the "up" direction relative to the screen and is called the up 
 * vector. The Z axis points from the center of the screen toward the eye point. The 
 * camera looks down the −Z axis, which is called the view vector. 
 * </p>
 * <p>
 * The following diagram shows the X, Y, and Z axes, which are attached to the virtual 
 * camera. 
 * </p>
 * <p>
 * Within a Feature or {@code <NetworkLinkControl>}, use either a Camera or a LookAt object
 * (but not both in the same object). The Camera object defines the viewpoint in 
 * terms of the viewer's position and orientation. The Camera object allows you to 
 * specify a view that is not on the Earth's surface. The LookAt object defines the 
 * viewpoint in terms of what is being viewed. The LookAt object is more limited 
 * in scope than Camera and generally requires that the view direction intersect 
 * the Earth's surface. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Camera id="ID"&gt;</strong>
 *   &lt;!-- inherited from AbstractView element --&gt;
 *   <em>&lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;</em>  &lt;!-- gx:TimeSpan or gx:TimeStamp --&gt;
 *    
 *   &lt;!-- specific to Camera --&gt;
 *   &lt;longitude&gt;0&lt;/longitude&gt;            &lt;!-- kml:angle180 --&gt; 
 *   &lt;latitude&gt;0&lt;/latitude&gt;              &lt;!-- kml:angle90 --&gt;
 *   &lt;altitude&gt;0&lt;/altitude&gt;              &lt;!-- double --&gt;
 *   &lt;heading&gt;0&lt;/heading&gt;                &lt;!-- kml:angle360 --&gt;
 *   &lt;tilt&gt;0&lt;/tilt&gt;                      &lt;!-- kml:anglepos180 --&gt;
 *   &lt;roll&gt;0&lt;/roll&gt;                      &lt;!-- kml:angle180 --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;              
 *         &lt;!-- kml:altitudeModeEnum: relativeToGround, clampToGround, or absolute --&gt;
 *         &lt;!-- or, gx:altitudeMode can be substituted: clampToSeaFloor, relativeToSeaFloor --&gt;
 * <strong>&lt;/Camera&gt;</strong> </pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraType", propOrder = {
    "longitude",
    "latitude",
    "altitude",
    "heading",
    "tilt",
    "roll",
    "altitudeMode",
    "cameraSimpleExtension",
    "cameraObjectExtension"
})
@XmlRootElement(name = "Camera", namespace = "http://www.opengis.net/kml/2.2")
public class Camera
    extends AbstractView
    implements Cloneable
{

    /**
     * {@code <longitude>}
     * <p>
     * Longitude of the point the camera is looking at. Angular distance in degrees, relative 
     * to the Prime Meridian. Values west of the Meridian range from −180 to 0 degrees. 
     * Values east of the Meridian range from 0 to 180 degrees. 
     * </p>
     * <p>
     * Longitude of the virtual camera (eye point). Angular distance in degrees, relative 
     * to the Prime Meridian. Values west of the Meridian range from −180 to 0 degrees. 
     * Values east of the Meridian range from 0 to 180 degrees. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double longitude;
    /**
     * {@code <latitude>}
     * <p>
     * Latitude of the point the camera is looking at. Degrees north or south of the Equator 
     * (0 degrees). Values range from −90 degrees to 90 degrees. 
     * </p>
     * <p>
     * Latitude of the virtual camera. Degrees north or south of the Equator (0 degrees). 
     * Values range from −90 degrees to 90 degrees. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double latitude;
    /**
     * altitude
     * <p>
     * Distance from the earth's surface, in meters. Interpreted according to the LookAt's 
     * altitude mode. 
     * </p>
     * <p>
     * Distance of the camera from the earth's surface, in meters. Interpreted according 
     * to the Camera's altitudeMode or gx:altitudeMode. 
     * </p>
     * <p>
     * Specifies the distance above the earth's surface, in meters, and is interpreted 
     * according to the altitude mode. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double altitude;
    /**
     * {@code {@code <heading>}}
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
    /**
     * AltitudeMode
     * <p>
     * clampToGround, relativeToGround, absolute 
     * </p>
     * 
     * See Also: 
     * See LookAt and {@code <Region>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "clampToGround")
    protected AltitudeMode altitudeMode;
    @XmlElement(name = "CameraSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> cameraSimpleExtension;
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
    @XmlElement(name = "CameraObjectExtensionGroup")
    protected List<AbstractObject> cameraObjectExtension;

    public Camera() {
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
    public double getLongitude() {
        return longitude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setAltitude(double value) {
        this.altitude = value;
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
     * @return
     *     possible object is
     *     {@code <}{@link Object}{@code >}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.AltitudeMode}{@code >}
     *     
     *     
     */
    public AltitudeMode getAltitudeMode() {
        return altitudeMode;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link Object}{@code >}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.AltitudeMode}{@code >}
     *     
     *     
     */
    public void setAltitudeMode(AltitudeMode value) {
        this.altitudeMode = value;
    }

    /**
     *
     * 
     */
    public List<Object> getCameraSimpleExtension() {
        if (cameraSimpleExtension == null) {
            cameraSimpleExtension = new ArrayList<Object>();
        }
        return this.cameraSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getCameraObjectExtension() {
        if (cameraObjectExtension == null) {
            cameraObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.cameraObjectExtension;
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

        Camera camera = (Camera) object;
        return altitudeMode == camera.altitudeMode
                && Double.compare(longitude, camera.longitude) == 0
                && Double.compare(latitude, camera.latitude) == 0
                && Double.compare(altitude, camera.altitude) == 0
                && Double.compare(heading, camera.heading) == 0
                && Double.compare(tilt, camera.tilt) == 0
                && Double.compare(roll, camera.roll) == 0
                && Objects.equals(cameraSimpleExtension, camera.cameraSimpleExtension)
                && Objects.equals(cameraObjectExtension, camera.cameraObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(longitude);
        result = 31 * result + Double.hashCode(latitude);
        result = 31 * result + Double.hashCode(altitude);
        result = 31 * result + Double.hashCode(heading);
        result = 31 * result + Double.hashCode(tilt);
        result = 31 * result + Double.hashCode(roll);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(cameraSimpleExtension);
        result = 31 * result + Objects.hashCode(cameraObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param cameraSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setCameraSimpleExtension(final List<Object> cameraSimpleExtension) {
        this.cameraSimpleExtension = cameraSimpleExtension;
    }

    /**
     * add a value to the cameraSimpleExtension property collection
     * 
     * @param cameraSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Camera addToCameraSimpleExtension(final Object cameraSimpleExtension) {
        this.getCameraSimpleExtension().add(cameraSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param cameraObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setCameraObjectExtension(final List<AbstractObject> cameraObjectExtension) {
        this.cameraObjectExtension = cameraObjectExtension;
    }

    /**
     * add a value to the cameraObjectExtension property collection
     * 
     * @param cameraObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Camera addToCameraObjectExtension(final AbstractObject cameraObjectExtension) {
        this.getCameraObjectExtension().add(cameraObjectExtension);
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
    public Camera addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setAbstractViewSimpleExtension(final List<Object> abstractViewSimpleExtension) {
        super.setAbstractViewSimpleExtension(abstractViewSimpleExtension);
    }

    @Obvious
    @Override
    public Camera addToAbstractViewSimpleExtension(final Object abstractViewSimpleExtension) {
        super.getAbstractViewSimpleExtension().add(abstractViewSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setAbstractViewObjectExtension(final List<AbstractObject> abstractViewObjectExtension) {
        super.setAbstractViewObjectExtension(abstractViewObjectExtension);
    }

    @Obvious
    @Override
    public Camera addToAbstractViewObjectExtension(final AbstractObject abstractViewObjectExtension) {
        super.getAbstractViewObjectExtension().add(abstractViewObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param longitude
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withLongitude(final double longitude) {
        this.setLongitude(longitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latitude
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withLatitude(final double latitude) {
        this.setLatitude(latitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitude
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withAltitude(final double altitude) {
        this.setAltitude(altitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param heading
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withHeading(final double heading) {
        this.setHeading(heading);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param tilt
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withTilt(final double tilt) {
        this.setTilt(tilt);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param roll
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withRoll(final double roll) {
        this.setRoll(roll);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param cameraSimpleExtension
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withCameraSimpleExtension(final List<Object> cameraSimpleExtension) {
        this.setCameraSimpleExtension(cameraSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param cameraObjectExtension
     *     required parameter
     * @return
     *     Camera
     */
    public Camera withCameraObjectExtension(final List<AbstractObject> cameraObjectExtension) {
        this.setCameraObjectExtension(cameraObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Camera withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Camera withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Camera withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Camera withAbstractViewSimpleExtension(final List<Object> abstractViewSimpleExtension) {
        super.withAbstractViewSimpleExtension(abstractViewSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Camera withAbstractViewObjectExtension(final List<AbstractObject> abstractViewObjectExtension) {
        super.withAbstractViewObjectExtension(abstractViewObjectExtension);
        return this;
    }

    @Override
    public Camera clone() {
        Camera copy;
        copy = ((Camera) super.clone());
        copy.cameraSimpleExtension = new ArrayList<Object>((getCameraSimpleExtension().size()));
        for (Object iter: cameraSimpleExtension) {
            copy.cameraSimpleExtension.add(iter);
        }
        copy.cameraObjectExtension = new ArrayList<AbstractObject>((getCameraObjectExtension().size()));
        for (AbstractObject iter: cameraObjectExtension) {
            copy.cameraObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
