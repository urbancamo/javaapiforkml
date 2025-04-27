
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.AbstractObject;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.CoordinatesConverter;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * gx:LatLonQuad
 * <p>
 * Allows non-rectangular quadrilateral ground overlays. 
 * </p>
 * <p>
 * If a third value is inserted into any tuple (representing altitude) it will be ignored. 
 * Altitude is set using altitude and altitudeMode (or gx:altitudeMode) extending 
 * GroundOverlay. Allowed altitude modes are absolute, clampToGround, and clampToSeaFloor. 
 * </p>
 * <p>
 * Specifies the coordinates of the four corner points of a quadrilateral defining 
 * the overlay area. Exactly four coordinate tuples have to be provided, each consisting 
 * of floating point values for longitude and latitude. Insert a space between tuples. 
 * Do not include spaces within a tuple. The coordinates must be specified in counter-clockwise 
 * order with the first coordinate corresponding to the lower-left corner of the overlayed 
 * image. The shape described by these corners must be convex. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;GroundOverlay id="ID"&gt;
 *   ...
 *   &lt;Icon&gt;...&lt;/Icon&gt;
 *   &lt;altitude&gt;0&lt;/altitude&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;                   &lt;!-- or <em>absolute</em> --&gt;
 *          &lt;!-- can substitute <em>&lt;gx:altitudeMode&gt;clampToSeaFloor&lt;/gx:altitudeMode&gt;</em> --&gt;
 * 
 *   <strong>&lt;gx:LatLonQuad&gt;
 *     &lt;coordinates&gt;...&lt;/coordinates&gt;              &lt;!-- four lon,lat tuples --&gt;
 *   &lt;/gx:LatLonQuad&gt;</strong>
 * &lt;/GroundOverlay&gt;</pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonQuadType", propOrder = {
    "coordinates"
})
@XmlRootElement(name = "LatLonQuad", namespace = "http://www.google.com/kml/ext/2.2")
public class LatLonQuad
    extends AbstractObject
    implements Cloneable
{

    /**
     * coordinates (required)
     * <p>
     * A single tuple consisting of floating point values for longitude, latitude, and 
     * altitude (in that order). Longitude and latitude values are in degrees, where longitude 
     * gteq −180 and lteq 180 latitude gteq −90 and lteq 90 altitude values (optional) are in meters
     * above sea level 
     * </p>
     * <p>
     * Do not include spaces between the three values that describe a coordinate. 
     * </p>
     * <p>
     * Two or more coordinate tuples, each consisting of floating point values for longitude, 
     * latitude, and altitude. The altitude component is optional. Insert a space between 
     * tuples. Do not include spaces within a tuple. 
     * </p>
     * 
     * 
     * 
     */


    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", type = String.class)
    @XmlJavaTypeAdapter(CoordinatesConverter.class)
    protected List<Coordinate> coordinates;

    public LatLonQuad() {
        super();
    }

    /**
     *
     * 
     */
    public List<Coordinate> getCoordinates() {
        if (coordinates == null) {
            coordinates = new ArrayList<Coordinate>();
        }
        return coordinates;
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

        LatLonQuad that = (LatLonQuad) object;
        return Objects.equals(coordinates, that.coordinates);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(coordinates);
        return result;
    }

    /**
     *
     *
     */
    public void setCoordinates(final List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * add a value to the coordinates property collection
     * 
     * @param longitude
     *     required parameter
     * @param latitude
     *     required parameter
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonQuad addToCoordinates(final double longitude, final double latitude) {
        this.getCoordinates().add(new Coordinate(longitude, latitude));
        return this;
    }

    /**
     * add a value to the coordinates property collection
     * 
     * @param longitude
     *     required parameter
     * @param latitude
     *     required parameter
     * @param altitude
     *     required parameter
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonQuad addToCoordinates(final double longitude, final double latitude, final double altitude) {
        this.getCoordinates().add(new Coordinate(longitude, latitude, altitude));
        return this;
    }

    /**
     * add a value to the coordinates property collection
     * 
     * @param coordinates
     *     required parameter
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonQuad addToCoordinates(final String coordinates) {
        this.getCoordinates().add(new Coordinate(coordinates));
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
    public LatLonQuad addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param coordinates
     *     required parameter
     */
    public LatLonQuad withCoordinates(final List<Coordinate> coordinates) {
        this.setCoordinates(coordinates);
        return this;
    }

    @Obvious
    @Override
    public LatLonQuad withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonQuad withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public LatLonQuad withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    /**
     * Creates a new instance of {@link List}{{@link Coordinate} and set it to this.coordinates.
     * 
     * This method is a short version for:
     * {@code
     * List<Coordinate> newValue = new List<Coordinate>();
     * this.setCoordinates(newValue); }
     *
     * 
     */
    public List<Coordinate> createAndSetCoordinates() {
        List<Coordinate> newValue = new ArrayList<Coordinate>();
        this.setCoordinates(newValue);
        return newValue;
    }

    @Override
    public LatLonQuad clone() {
        LatLonQuad copy;
        copy = ((LatLonQuad) super.clone());
        copy.coordinates = new ArrayList<Coordinate>((getCoordinates().size()));
        for (Coordinate iter: coordinates) {
            copy.coordinates.add(iter.clone());
        }
        return copy;
    }

}
