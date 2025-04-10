
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <location>}
 * <p>
 * Specifies the exact coordinates of the Model's origin in latitude, longitude, and 
 * altitude. Latitude and longitude measurements are standard lat-lon projection with 
 * WGS84 datum. Altitude is distance above the earth's surface, in meters, and is interpreted 
 * according to altitudeMode or gx:altitudeMode. {@code <Location> <longitude>39.55375305703105</longitude>
 * <latitude>-118.9813220168456</latitude> altitude1223</altitude> </Location> }
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "longitude",
    "latitude",
    "altitude",
    "locationSimpleExtension",
    "locationObjectExtension"
})
@XmlRootElement(name = "Location", namespace = "http://www.opengis.net/kml/2.2")
public class Location
    extends AbstractObject
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
    @XmlElement(name = "LocationSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> locationSimpleExtension;
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
    @XmlElement(name = "LocationObjectExtensionGroup")
    protected List<AbstractObject> locationObjectExtension;

    public Location() {
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
     */
    public List<Object> getLocationSimpleExtension() {
        if (locationSimpleExtension == null) {
            locationSimpleExtension = new ArrayList<Object>();
        }
        return this.locationSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLocationObjectExtension() {
        if (locationObjectExtension == null) {
            locationObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.locationObjectExtension;
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

        Location location = (Location) object;
        return Double.compare(longitude, location.longitude) == 0
                && Double.compare(latitude, location.latitude) == 0
                && Double.compare(altitude, location.altitude) == 0
                && Objects.equals(locationSimpleExtension, location.locationSimpleExtension)
                && Objects.equals(locationObjectExtension, location.locationObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(longitude);
        result = 31 * result + Double.hashCode(latitude);
        result = 31 * result + Double.hashCode(altitude);
        result = 31 * result + Objects.hashCode(locationSimpleExtension);
        result = 31 * result + Objects.hashCode(locationObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param locationSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLocationSimpleExtension(final List<Object> locationSimpleExtension) {
        this.locationSimpleExtension = locationSimpleExtension;
    }

    /**
     * add a value to the locationSimpleExtension property collection
     * 
     * @param locationSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Location addToLocationSimpleExtension(final Object locationSimpleExtension) {
        this.getLocationSimpleExtension().add(locationSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param locationObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLocationObjectExtension(final List<AbstractObject> locationObjectExtension) {
        this.locationObjectExtension = locationObjectExtension;
    }

    /**
     * add a value to the locationObjectExtension property collection
     * 
     * @param locationObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Location addToLocationObjectExtension(final AbstractObject locationObjectExtension) {
        this.getLocationObjectExtension().add(locationObjectExtension);
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
    public Location addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param longitude
     *     required parameter
     */
    public Location withLongitude(final double longitude) {
        this.setLongitude(longitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latitude
     *     required parameter
     */
    public Location withLatitude(final double latitude) {
        this.setLatitude(latitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitude
     *     required parameter
     */
    public Location withAltitude(final double altitude) {
        this.setAltitude(altitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param locationSimpleExtension
     *     required parameter
     */
    public Location withLocationSimpleExtension(final List<Object> locationSimpleExtension) {
        this.setLocationSimpleExtension(locationSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param locationObjectExtension
     *     required parameter
     */
    public Location withLocationObjectExtension(final List<AbstractObject> locationObjectExtension) {
        this.setLocationObjectExtension(locationObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Location withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Location withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Location withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Location clone() {
        Location copy;
        copy = ((Location) super.clone());
        copy.locationSimpleExtension = new ArrayList<Object>((getLocationSimpleExtension().size()));
        for (Object iter: locationSimpleExtension) {
            copy.locationSimpleExtension.add(iter);
        }
        copy.locationObjectExtension = new ArrayList<AbstractObject>((getLocationObjectExtension().size()));
        for (AbstractObject iter: locationObjectExtension) {
            copy.locationObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
