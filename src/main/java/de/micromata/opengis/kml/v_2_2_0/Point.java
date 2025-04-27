
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Point>}
 * <p>
 * A geographic location defined by longitude, latitude, and (optional) altitude. When 
 * a Point is contained by a Placemark, the point itself determines the position of 
 * the Placemark's name and icon. When a Point is extruded, it is connected to the 
 * ground with a line. This "tether" uses the current LineStyle. 
 * </p>
 * <p>
 * ThePoint element acts as aPoint inside a {@code <Placemark>} element. It draws an
 * icon to mark the position of the PhotoOverlay. The icon drawn is specified by the 
 * {@code <styleUrl>} and {@code <StyleSelector>} fields, just as it is for {@code <Placemark>}.
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Point id="ID"&gt;</strong>
 *   &lt;!-- specific to Point --&gt;
 *   &lt;extrude&gt;0&lt;/extrude&gt;                        &lt;!-- boolean --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;  
 * 	      &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
 *         &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt;
 *   &lt;coordinates&gt;<em>...</em>&lt;/coordinates&gt;<span class="style1"><em>              </em></span>&lt;!-- lon,lat[,alt] --&gt;
 * <strong>&lt;/Point&gt;</strong></pre>
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
@XmlType(name = "PointType", propOrder = {
    "extrude",
    "altitudeMode",
    "coordinates",
    "pointSimpleExtension",
    "pointObjectExtension"
})
@XmlRootElement(name = "Point", namespace = "http://www.opengis.net/kml/2.2")
public class Point
    extends Geometry
    implements Cloneable
{

    /**
     * {@code <extrude>}
     * <p>
     * Boolean value. Specifies whether to connect the LineString to the ground. To extrude 
     * a LineString, the altitude mode must be either relativeToGround, relativeToSeaFloor, 
     * or absolute. The vertices in the LineString are extruded toward the center of the 
     * Earth's sphere. 
     * </p>
     * <p>
     * Boolean value. Specifies whether to connect the LinearRing to the ground. To extrude 
     * this geometry, the altitude mode must be either relativeToGround, relativeToSeaFloor, 
     * or absolute. Only the vertices of the LinearRing are extruded, not the center of 
     * the geometry. The vertices are extruded toward the center of the Earth's sphere. 
     * </p>
     * <p>
     * Boolean value. Specifies whether to connect the Polygon to the ground. To extrude 
     * a Polygon, the altitude mode must be either relativeToGround, relativeToSeaFloor, 
     * or absolute. Only the vertices are extruded, not the geometry itself (for example, 
     * a rectangle turns into a box with five faces. The vertices of the Polygon are extruded 
     * toward the center of the Earth's sphere. 
     * </p>
     * <p>
     * Boolean value. Specifies whether to connect the point to the ground with a line. 
     * To extrude a Point, the value for altitudeMode must be either relativeToGround, 
     * relativeToSeaFloor, or absolute. The point is extruded toward the center of the 
     * Earth's sphere. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean extrude;
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
    @XmlElement(name = "PointSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> pointSimpleExtension;
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
    @XmlElement(name = "PointObjectExtensionGroup")
    protected List<AbstractObject> pointObjectExtension;

    public Point() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isExtrude() {
        return extrude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setExtrude(Boolean value) {
        this.extrude = value;
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
    public List<Object> getPointSimpleExtension() {
        if (pointSimpleExtension == null) {
            pointSimpleExtension = new ArrayList<Object>();
        }
        return this.pointSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getPointObjectExtension() {
        if (pointObjectExtension == null) {
            pointObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.pointObjectExtension;
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

        Point point = (Point) object;
        return altitudeMode == point.altitudeMode
                && Objects.equals(extrude, point.extrude)
                && Objects.equals(coordinates, point.coordinates)
                && Objects.equals(pointSimpleExtension, point.pointSimpleExtension)
                && Objects.equals(pointObjectExtension, point.pointObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(extrude);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(coordinates);
        result = 31 * result + Objects.hashCode(pointSimpleExtension);
        result = 31 * result + Objects.hashCode(pointObjectExtension);
        return result;
    }

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
    public Point addToCoordinates(final double longitude, final double latitude) {
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
    public Point addToCoordinates(final double longitude, final double latitude, final double altitude) {
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
    public Point addToCoordinates(final String coordinates) {
        this.getCoordinates().add(new Coordinate(coordinates));
        return this;
    }

    /**
     *
     * 
     * @param pointSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setPointSimpleExtension(final List<Object> pointSimpleExtension) {
        this.pointSimpleExtension = pointSimpleExtension;
    }

    /**
     * add a value to the pointSimpleExtension property collection
     * 
     * @param pointSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Point addToPointSimpleExtension(final Object pointSimpleExtension) {
        this.getPointSimpleExtension().add(pointSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param pointObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setPointObjectExtension(final List<AbstractObject> pointObjectExtension) {
        this.pointObjectExtension = pointObjectExtension;
    }

    /**
     * add a value to the pointObjectExtension property collection
     * 
     * @param pointObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Point addToPointObjectExtension(final AbstractObject pointObjectExtension) {
        this.getPointObjectExtension().add(pointObjectExtension);
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
    public Point addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.setGeometrySimpleExtension(geometrySimpleExtension);
    }

    @Obvious
    @Override
    public Point addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
        super.getGeometrySimpleExtension().add(geometrySimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.setGeometryObjectExtension(geometryObjectExtension);
    }

    @Obvious
    @Override
    public Point addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
        super.getGeometryObjectExtension().add(geometryObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param extrude
     *     required parameter
     */
    public Point withExtrude(final Boolean extrude) {
        this.setExtrude(extrude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public Point withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param coordinates
     *     required parameter
     */
    public Point withCoordinates(final List<Coordinate> coordinates) {
        this.setCoordinates(coordinates);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param pointSimpleExtension
     *     required parameter
     */
    public Point withPointSimpleExtension(final List<Object> pointSimpleExtension) {
        this.setPointSimpleExtension(pointSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param pointObjectExtension
     *     required parameter
     */
    public Point withPointObjectExtension(final List<AbstractObject> pointObjectExtension) {
        this.setPointObjectExtension(pointObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Point withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Point withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Point withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Point withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Point withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.withGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    /**
     * Creates a new instance of {@link List}{@code <}{@link Coordinate}{@code >} and set it to this.coordinates.
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
    public Point clone() {
        Point copy;
        copy = ((Point) super.clone());
        copy.coordinates = new ArrayList<Coordinate>((getCoordinates().size()));
        for (Coordinate iter: coordinates) {
            copy.coordinates.add(iter.clone());
        }
        copy.pointSimpleExtension = new ArrayList<Object>((getPointSimpleExtension().size()));
        for (Object iter: pointSimpleExtension) {
            copy.pointSimpleExtension.add(iter);
        }
        copy.pointObjectExtension = new ArrayList<AbstractObject>((getPointObjectExtension().size()));
        for (AbstractObject iter: pointObjectExtension) {
            copy.pointObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
