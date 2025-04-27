
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.gx.MultiTrack;
import de.micromata.opengis.kml.v_2_2_0.gx.Track;
import jakarta.xml.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Geometry>}
 * <p>
 * This is an abstract element and cannot be used directly in a KML file. It provides 
 * a placeholder object for all derived Geometry objects. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;!-- abstract element; do not create --&gt;
 * <strong>&lt;!<em>-- Geometry</em> id="ID" --&gt;                 &lt;!-- Point,LineString,LinearRing,
 *                                                Polygon,MultiGeometry,Model --&gt;</strong>
 * <strong>&lt;!-- /<em>Geometry --</em>&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Extended By: 
 *
 *
 *
 *
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometryType", propOrder = {
    "geometrySimpleExtension",
    "geometryObjectExtension"
})
@XmlSeeAlso({
    MultiTrack.class,
    Track.class,
    LinearRing.class,
    Point.class,
    Model.class,
    MultiGeometry.class,
    LineString.class,
    Polygon.class
})
public abstract class Geometry
    extends AbstractObject
    implements Cloneable
{

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
    @XmlElement(name = "AbstractGeometrySimpleExtensionGroup")
    protected List<Object> geometrySimpleExtension;
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
    @XmlElement(name = "AbstractGeometryObjectExtensionGroup")
    protected List<AbstractObject> geometryObjectExtension;

    public Geometry() {
        super();
    }

    /**
     *
     * 
     */
    public List<Object> getGeometrySimpleExtension() {
        if (geometrySimpleExtension == null) {
            geometrySimpleExtension = new ArrayList<Object>();
        }
        return this.geometrySimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getGeometryObjectExtension() {
        if (geometryObjectExtension == null) {
            geometryObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.geometryObjectExtension;
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

        Geometry geometry = (Geometry) object;
        return Objects.equals(geometrySimpleExtension, geometry.geometrySimpleExtension)
                && Objects.equals(geometryObjectExtension, geometry.geometryObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(geometrySimpleExtension);
        result = 31 * result + Objects.hashCode(geometryObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param geometrySimpleExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link Object}{@code >}{@code <}{@link BigInteger}{@code >}{@code <}{@link Double}{@code >}
     */
    public void setGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        this.geometrySimpleExtension = geometrySimpleExtension;
    }

    /**
     * add a value to the geometrySimpleExtension property collection
     * 
     * @param geometrySimpleExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link Object}{@code >}{@code <}{@link BigInteger}{@code >}{@code <}{@link Double}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Geometry addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
        this.getGeometrySimpleExtension().add(geometrySimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param geometryObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        this.geometryObjectExtension = geometryObjectExtension;
    }

    /**
     * add a value to the geometryObjectExtension property collection
     * 
     * @param geometryObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Geometry addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
        this.getGeometryObjectExtension().add(geometryObjectExtension);
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
    public Geometry addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param geometrySimpleExtension
     *     required parameter
     */
    public Geometry withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        this.setGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param geometryObjectExtension
     *     required parameter
     */
    public Geometry withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        this.setGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Geometry withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Geometry withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Geometry withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Geometry clone() {
        Geometry copy;
        copy = ((Geometry) super.clone());
        copy.geometrySimpleExtension = new ArrayList<Object>((getGeometrySimpleExtension().size()));
        for (Object iter: geometrySimpleExtension) {
            copy.geometrySimpleExtension.add(iter);
        }
        copy.geometryObjectExtension = new ArrayList<AbstractObject>((getGeometryObjectExtension().size()));
        for (AbstractObject iter: geometryObjectExtension) {
            copy.geometryObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
