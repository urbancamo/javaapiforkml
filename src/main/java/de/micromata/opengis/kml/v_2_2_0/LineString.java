
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <LineString>}
 * <p>
 * Defines a connected set of line segments. Use {@code {@code <LineStyle>}} to specify the color,
 * color mode, and width of the line. When a LineString is extruded, the line is extended 
 * to the ground, forming a polygon that looks somewhat like a wall or fence. For extruded 
 * LineStrings, the line itself uses the current LineStyle, and the extrusion uses 
 * the current PolyStyle. See the KML Tutorial for examples of LineStrings (or paths). 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;LineString id="ID"&gt;</strong>
 *   &lt;!-- specific to LineString --&gt;
 *   &lt;extrude&gt;0&lt;/extrude&gt;                   &lt;!-- boolean --&gt;
 *   &lt;tessellate&gt;0&lt;/tessellate&gt;             &lt;!-- boolean --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
 *       &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
 *         &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt;
 * 			&lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt;
 *   &lt;coordinates&gt;<em>...</em>&lt;/coordinates&gt;         &lt;!<em>-- </em>lon,lat[,alt] --&gt;
 * <strong>&lt;/LineString&gt;</strong></pre>
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
@XmlType(name = "LineStringType", propOrder = {
    "extrude",
    "tessellate",
    "altitudeMode",
    "coordinates",
    "lineStringSimpleExtension",
    "lineStringObjectExtension"
})
@XmlRootElement(name = "LineString", namespace = "http://www.opengis.net/kml/2.2")
public class LineString
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
     * {@code <extrude>}
     * <p>
     * Boolean value. Specifies whether to allow the LineString to follow the terrain. 
     * To enable tessellation, the altitude mode must be clampToGround or clampToSeaFloor. 
     * Very large LineStrings should enable tessellation so that they follow the curvature 
     * of the earth (otherwise, they may go underground and be hidden). 
     * </p>
     * <p>
     * Boolean value. Specifies whether to allow the LinearRing to follow the terrain. 
     * To enable tessellation, the value for altitudeMode must be clampToGround or clampToSeaFloor. 
     * Very large LinearRings should enable tessellation so that they follow the curvature 
     * of the earth (otherwise, they may go underground and be hidden). 
     * </p>
     * <p>
     * Boolean value. Specifies whether to allow the Polygon to follow the terrain. To 
     * enable tessellation, the Polygon must have an altitude mode of clampToGround or 
     * clampToSeaFloor. Very large Polygons should enable tessellation so that they follow 
     * the curvature of the earth (otherwise, they may go underground and be hidden). 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean tessellate;
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
    @XmlElement(name = "LineStringSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> lineStringSimpleExtension;
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
    @XmlElement(name = "LineStringObjectExtensionGroup")
    protected List<AbstractObject> lineStringObjectExtension;

    public LineString() {
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
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isTessellate() {
        return tessellate;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setTessellate(Boolean value) {
        this.tessellate = value;
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
    public List<Object> getLineStringSimpleExtension() {
        if (lineStringSimpleExtension == null) {
            lineStringSimpleExtension = new ArrayList<Object>();
        }
        return this.lineStringSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLineStringObjectExtension() {
        if (lineStringObjectExtension == null) {
            lineStringObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.lineStringObjectExtension;
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

        LineString that = (LineString) object;
        return altitudeMode == that.altitudeMode
                && Objects.equals(extrude, that.extrude)
                && Objects.equals(tessellate, that.tessellate)
                && Objects.equals(coordinates, that.coordinates)
                && Objects.equals(lineStringSimpleExtension, that.lineStringSimpleExtension)
                && Objects.equals(lineStringObjectExtension, that.lineStringObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(extrude);
        result = 31 * result + Objects.hashCode(tessellate);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(coordinates);
        result = 31 * result + Objects.hashCode(lineStringSimpleExtension);
        result = 31 * result + Objects.hashCode(lineStringObjectExtension);
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
    public LineString addToCoordinates(final double longitude, final double latitude) {
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
    public LineString addToCoordinates(final double longitude, final double latitude, final double altitude) {
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
    public LineString addToCoordinates(final String coordinates) {
        this.getCoordinates().add(new Coordinate(coordinates));
        return this;
    }

    /**
     *
     * 
     * @param lineStringSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLineStringSimpleExtension(final List<Object> lineStringSimpleExtension) {
        this.lineStringSimpleExtension = lineStringSimpleExtension;
    }

    /**
     * add a value to the lineStringSimpleExtension property collection
     * 
     * @param lineStringSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LineString addToLineStringSimpleExtension(final Object lineStringSimpleExtension) {
        this.getLineStringSimpleExtension().add(lineStringSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param lineStringObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLineStringObjectExtension(final List<AbstractObject> lineStringObjectExtension) {
        this.lineStringObjectExtension = lineStringObjectExtension;
    }

    /**
     * add a value to the lineStringObjectExtension property collection
     * 
     * @param lineStringObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LineString addToLineStringObjectExtension(final AbstractObject lineStringObjectExtension) {
        this.getLineStringObjectExtension().add(lineStringObjectExtension);
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
    public LineString addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public LineString addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
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
    public LineString addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
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
    public LineString withExtrude(final Boolean extrude) {
        this.setExtrude(extrude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param tessellate
     *     required parameter
     */
    public LineString withTessellate(final Boolean tessellate) {
        this.setTessellate(tessellate);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public LineString withAltitudeMode(final  AltitudeMode altitudeMode) {
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
    public LineString withCoordinates(final List<Coordinate> coordinates) {
        this.setCoordinates(coordinates);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param lineStringSimpleExtension
     *     required parameter
     */
    public LineString withLineStringSimpleExtension(final List<Object> lineStringSimpleExtension) {
        this.setLineStringSimpleExtension(lineStringSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param lineStringObjectExtension
     *     required parameter
     */
    public LineString withLineStringObjectExtension(final List<AbstractObject> lineStringObjectExtension) {
        this.setLineStringObjectExtension(lineStringObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public LineString withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LineString withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public LineString withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public LineString withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LineString withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
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
    public LineString clone() {
        LineString copy;
        copy = ((LineString) super.clone());
        copy.coordinates = new ArrayList<Coordinate>((getCoordinates().size()));
        for (Coordinate iter: coordinates) {
            copy.coordinates.add(iter.clone());
        }
        copy.lineStringSimpleExtension = new ArrayList<Object>((getLineStringSimpleExtension().size()));
        for (Object iter: lineStringSimpleExtension) {
            copy.lineStringSimpleExtension.add(iter);
        }
        copy.lineStringObjectExtension = new ArrayList<AbstractObject>((getLineStringObjectExtension().size()));
        for (AbstractObject iter: lineStringObjectExtension) {
            copy.lineStringObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
