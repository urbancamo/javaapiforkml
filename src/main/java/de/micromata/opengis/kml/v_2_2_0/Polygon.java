
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Polygon>}
 * <p>
 * A Polygon is defined by an outer boundary and 0 or more inner boundaries. The boundaries, 
 * in turn, are defined by LinearRings. When a Polygon is extruded, its boundaries 
 * are connected to the ground to form additional polygons, which gives the appearance 
 * of a building or a box. Extruded Polygons use {@code <PolyStyle>} for their color, color 
 * mode, and fill. 
 * </p>
 * <p>
 * Note: In Google Earth, a Polygon with an altitudeMode of clampToGround follows 
 * the great circle; however, a LinearRing (by itself) with an altitudeMode of clampToGround 
 * follows lines of constant latitude. 
 * </p>
 * <p>
 * The coordinates for polygons must be specified in counterclockwise order. Polygons 
 * follow the "right-hand rule," which states that if you place the fingers of your 
 * right hand in the direction in which the coordinates are specified, your thumb points 
 * in the general direction of the geometric normal for the polygon. (In 3D graphics, 
 * the geometric normal is used for lighting and points away from the front face of 
 * the polygon.) Since Google Earth fills only the front face of polygons, you will 
 * achieve the desired effect only when the coordinates are specified in the proper 
 * order. Otherwise, the polygon will be gray. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Polygon id="ID"&gt;</strong>
 *   &lt;!-- specific to Polygon --&gt;
 *   &lt;extrude&gt;0&lt;/extrude&gt;                       &lt;!-- boolean --&gt;
 *   &lt;tessellate&gt;0&lt;/tessellate&gt;                 &lt;!-- boolean --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
 *         &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
 *         &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt;
 *   &lt;outerBoundaryIs&gt;
 *     &lt;LinearRing&gt;
 *       &lt;coordinates&gt;...&lt;/coordinates&gt;         &lt;!-- lon,lat[,alt] --&gt;
 *     &lt;/LinearRing&gt;
 *   &lt;/outerBoundaryIs&gt;
 *   &lt;innerBoundaryIs&gt;
 *     &lt;LinearRing&gt;
 *       &lt;coordinates&gt;...&lt;/coordinates&gt;         &lt;!-- lon,lat[,alt] --&gt;
 *     &lt;/LinearRing&gt;
 *   &lt;/innerBoundaryIs&gt;
 * <strong>&lt;/Polygon&gt;</strong></pre>
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
@XmlType(name = "PolygonType", propOrder = {
    "extrude",
    "tessellate",
    "altitudeMode",
    "outerBoundaryIs",
    "innerBoundaryIs",
    "polygonSimpleExtension",
    "polygonObjectExtension"
})
@XmlRootElement(name = "Polygon", namespace = "http://www.opengis.net/kml/2.2")
public class Polygon
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
     * {@code <outerboundaryis>} (required)
     * <p>
     * Contains a {@code <LinearRing>} element. 
     * </p>
     * 
     * 
     * 
     */
    protected Boundary outerBoundaryIs;
    /**
     * {@code <innerboundaryis>}
     * <p>
     * Contains a {@code <LinearRing>} element. A Polygon can contain multiple {@code <innerBoundaryIs> }
     * elements, which create multiple cut-outs inside the Polygon. 
     * </p>
     * 
     * 
     * 
     */
    protected List<Boundary> innerBoundaryIs;
    @XmlElement(name = "PolygonSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> polygonSimpleExtension;
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
    @XmlElement(name = "PolygonObjectExtensionGroup")
    protected List<AbstractObject> polygonObjectExtension;

    public Polygon() {
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
     * @return
     *     possible object is
     *     {@link Boundary}
     *     
     */
    public Boundary getOuterBoundaryIs() {
        return outerBoundaryIs;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Boundary}
     *     
     */
    public void setOuterBoundaryIs(Boundary value) {
        this.outerBoundaryIs = value;
    }

    /**
     *
     * 
     */
    public List<Boundary> getInnerBoundaryIs() {
        if (innerBoundaryIs == null) {
            innerBoundaryIs = new ArrayList<Boundary>();
        }
        return this.innerBoundaryIs;
    }

    /**
     *
     * 
     */
    public List<Object> getPolygonSimpleExtension() {
        if (polygonSimpleExtension == null) {
            polygonSimpleExtension = new ArrayList<Object>();
        }
        return this.polygonSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getPolygonObjectExtension() {
        if (polygonObjectExtension == null) {
            polygonObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.polygonObjectExtension;
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

        Polygon polygon = (Polygon) object;
        return altitudeMode == polygon.altitudeMode
                && Objects.equals(extrude, polygon.extrude)
                && Objects.equals(tessellate, polygon.tessellate)
                && Objects.equals(outerBoundaryIs, polygon.outerBoundaryIs)
                && Objects.equals(innerBoundaryIs, polygon.innerBoundaryIs)
                && Objects.equals(polygonSimpleExtension, polygon.polygonSimpleExtension)
                && Objects.equals(polygonObjectExtension, polygon.polygonObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(extrude);
        result = 31 * result + Objects.hashCode(tessellate);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(outerBoundaryIs);
        result = 31 * result + Objects.hashCode(innerBoundaryIs);
        result = 31 * result + Objects.hashCode(polygonSimpleExtension);
        result = 31 * result + Objects.hashCode(polygonObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Boundary} and set it to outerBoundaryIs.
     * 
     * This method is a short version for:
     * {@code
     * Boundary boundary = new Boundary();
     * this.setOuterBoundaryIs(boundary); }
     * 
     * 
     */
    public Boundary createAndSetOuterBoundaryIs() {
        Boundary newValue = new Boundary();
        this.setOuterBoundaryIs(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Boundary} and adds it to innerBoundaryIs.
     * This method is a short version for:
     * {@code
     * Boundary boundary = new Boundary();
     * this.getInnerBoundaryIs().add(boundary); }
     * 
     * 
     */
    public Boundary createAndAddInnerBoundaryIs() {
        Boundary newValue = new Boundary();
        this.getInnerBoundaryIs().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param innerBoundaryIs
     *     Objects of the following type are allowed in the list: {@link Boundary}
     */
    public void setInnerBoundaryIs(final List<Boundary> innerBoundaryIs) {
        this.innerBoundaryIs = innerBoundaryIs;
    }

    /**
     * add a value to the innerBoundaryIs property collection
     * 
     * @param innerBoundaryIs
     *     Objects of the following type are allowed in the list: {@link Boundary}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Polygon addToInnerBoundaryIs(final Boundary innerBoundaryIs) {
        this.getInnerBoundaryIs().add(innerBoundaryIs);
        return this;
    }

    /**
     *
     * 
     * @param polygonSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setPolygonSimpleExtension(final List<Object> polygonSimpleExtension) {
        this.polygonSimpleExtension = polygonSimpleExtension;
    }

    /**
     * add a value to the polygonSimpleExtension property collection
     * 
     * @param polygonSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Polygon addToPolygonSimpleExtension(final Object polygonSimpleExtension) {
        this.getPolygonSimpleExtension().add(polygonSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param polygonObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setPolygonObjectExtension(final List<AbstractObject> polygonObjectExtension) {
        this.polygonObjectExtension = polygonObjectExtension;
    }

    /**
     * add a value to the polygonObjectExtension property collection
     * 
     * @param polygonObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Polygon addToPolygonObjectExtension(final AbstractObject polygonObjectExtension) {
        this.getPolygonObjectExtension().add(polygonObjectExtension);
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
    public Polygon addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public Polygon addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
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
    public Polygon addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
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
    public Polygon withExtrude(final Boolean extrude) {
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
    public Polygon withTessellate(final Boolean tessellate) {
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
    public Polygon withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param outerBoundaryIs
     *     required parameter
     */
    public Polygon withOuterBoundaryIs(final Boundary outerBoundaryIs) {
        this.setOuterBoundaryIs(outerBoundaryIs);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param innerBoundaryIs
     *     required parameter
     */
    public Polygon withInnerBoundaryIs(final List<Boundary> innerBoundaryIs) {
        this.setInnerBoundaryIs(innerBoundaryIs);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param polygonSimpleExtension
     *     required parameter
     */
    public Polygon withPolygonSimpleExtension(final List<Object> polygonSimpleExtension) {
        this.setPolygonSimpleExtension(polygonSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param polygonObjectExtension
     *     required parameter
     */
    public Polygon withPolygonObjectExtension(final List<AbstractObject> polygonObjectExtension) {
        this.setPolygonObjectExtension(polygonObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Polygon withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Polygon withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Polygon withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Polygon withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Polygon withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.withGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    @Override
    public Polygon clone() {
        Polygon copy;
        copy = ((Polygon) super.clone());
        copy.outerBoundaryIs = ((outerBoundaryIs == null)?null:((Boundary) outerBoundaryIs.clone()));
        copy.innerBoundaryIs = new ArrayList<Boundary>((getInnerBoundaryIs().size()));
        for (Boundary iter: innerBoundaryIs) {
            copy.innerBoundaryIs.add(iter.clone());
        }
        copy.polygonSimpleExtension = new ArrayList<Object>((getPolygonSimpleExtension().size()));
        for (Object iter: polygonSimpleExtension) {
            copy.polygonSimpleExtension.add(iter);
        }
        copy.polygonObjectExtension = new ArrayList<AbstractObject>((getPolygonObjectExtension().size()));
        for (AbstractObject iter: polygonObjectExtension) {
            copy.polygonObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
