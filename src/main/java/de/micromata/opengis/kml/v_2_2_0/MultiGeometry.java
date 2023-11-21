
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.gx.MultiTrack;
import de.micromata.opengis.kml.v_2_2_0.gx.Track;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * {@code <MultiGeometry>}
 * <p>
 * A container for zero or more geometry primitives associated with the same feature. 
 * </p>
 * <p>
 * Note: The {@code <GeometryCollection>} tag has been deprecated. Use {@code <MultiGeometry>} instead.
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;MultiGeometry id="ID"&gt;</strong>
 *   &lt;!-- specific to MultiGeometry --&gt;
 *   &lt;!-- 0 or more <em>Geometry</em> elements --&gt;
 * <strong>&lt;/MultiGeometry&gt;</strong></pre>
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
@XmlType(name = "MultiGeometryType", propOrder = {
    "geometry",
    "multiGeometrySimpleExtension",
    "multiGeometryObjectExtension"
})
@XmlRootElement(name = "MultiGeometry", namespace = "http://www.opengis.net/kml/2.2")
public class MultiGeometry
    extends Geometry
    implements Cloneable
{

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
    @XmlElementRef(name = "AbstractGeometryGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<Geometry> geometry;
    @XmlElement(name = "MultiGeometrySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> multiGeometrySimpleExtension;
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
    @XmlElement(name = "MultiGeometryObjectExtensionGroup")
    protected List<AbstractObject> multiGeometryObjectExtension;

    public MultiGeometry() {
        super();
    }

    /**
     *
     * 
     */
    public List<Geometry> getGeometry() {
        if (geometry == null) {
            geometry = new ArrayList<Geometry>();
        }
        return this.geometry;
    }

    /**
     *
     * 
     */
    public List<Object> getMultiGeometrySimpleExtension() {
        if (multiGeometrySimpleExtension == null) {
            multiGeometrySimpleExtension = new ArrayList<Object>();
        }
        return this.multiGeometrySimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getMultiGeometryObjectExtension() {
        if (multiGeometryObjectExtension == null) {
            multiGeometryObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.multiGeometryObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = ((prime*result)+((geometry == null)? 0 :geometry.hashCode()));
        result = ((prime*result)+((multiGeometrySimpleExtension == null)? 0 :multiGeometrySimpleExtension.hashCode()));
        result = ((prime*result)+((multiGeometryObjectExtension == null)? 0 :multiGeometryObjectExtension.hashCode()));
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
        if ((obj instanceof MultiGeometry) == false) {
            return false;
        }
        MultiGeometry other = ((MultiGeometry) obj);
        if (geometry == null) {
            if (other.geometry!= null) {
                return false;
            }
        } else {
            if (geometry.equals(other.geometry) == false) {
                return false;
            }
        }
        if (multiGeometrySimpleExtension == null) {
            if (other.multiGeometrySimpleExtension!= null) {
                return false;
            }
        } else {
            if (multiGeometrySimpleExtension.equals(other.multiGeometrySimpleExtension) == false) {
                return false;
            }
        }
        if (multiGeometryObjectExtension == null) {
            if (other.multiGeometryObjectExtension!= null) {
                return false;
            }
        } else {
            if (multiGeometryObjectExtension.equals(other.multiGeometryObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates a new instance of {@link MultiTrack} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * MultiTrack multiTrack = new MultiTrack();
     * this.getGeometry().add(multiTrack); }
     * 
     * 
     */
    public MultiTrack createAndAddMultiTrack() {
        MultiTrack newValue = new MultiTrack();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Track} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * Track track = new Track();
     * this.getGeometry().add(track); }
     * 
     * 
     */
    public Track createAndAddTrack() {
        Track newValue = new Track();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link LinearRing} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * LinearRing linearRing = new LinearRing();
     * this.getGeometry().add(linearRing); }
     * 
     * 
     */
    public LinearRing createAndAddLinearRing() {
        LinearRing newValue = new LinearRing();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Point} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * Point point = new Point();
     * this.getGeometry().add(point); }
     * 
     * 
     */
    public Point createAndAddPoint() {
        Point newValue = new Point();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Model} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * Model model = new Model();
     * this.getGeometry().add(model); }
     * 
     * 
     */
    public Model createAndAddModel() {
        Model newValue = new Model();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of MultiGeometry and adds it to geometry.
     * This method is a short version for:
     * {@code
     * MultiGeometry multiGeometry = new MultiGeometry();
     * this.getGeometry().add(multiGeometry); }
     * 
     * 
     */
    public MultiGeometry createAndAddMultiGeometry() {
        MultiGeometry newValue = new MultiGeometry();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link LineString} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * LineString lineString = new LineString();
     * this.getGeometry().add(lineString); }
     * 
     * 
     */
    public LineString createAndAddLineString() {
        LineString newValue = new LineString();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Polygon} and adds it to geometry.
     * This method is a short version for:
     * {@code
     * Polygon polygon = new Polygon();
     * this.getGeometry().add(polygon); }
     * 
     * 
     */
    public Polygon createAndAddPolygon() {
        Polygon newValue = new Polygon();
        this.getGeometry().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param geometry
     *     Objects of the following type are allowed in the list: {@code <}{@link Geometry}{@code >}{@code <}{@link Point}{@code >}{@code <}{@link LinearRing}{@code >}{@code <}{@link Polygon}{@code >}{@code <}{@link Track}{@code >}{@code <}{@link MultiTrack}{@code >}{@code <}{@link Model}{@code >}{@code <}{@link LineString}{@code >}{@code <}MultiGeometry{@code >}
     */
    public void setGeometry(final List<Geometry> geometry) {
        this.geometry = geometry;
    }

    /**
     * add a value to the geometry property collection
     * 
     * @param geometry
     *     Objects of the following type are allowed in the list: {@code <}{@link Geometry}{@code >}{@code <}{@link Point}{@code >}{@code <}{@link LinearRing}{@code >}{@code <}{@link Polygon}{@code >}{@code <}{@link Track}{@code >}{@code <}{@link MultiTrack}{@code >}{@code <}{@link Model}{@code >}{@code <}{@link LineString}{@code >}{@code <}MultiGeometry{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public MultiGeometry addToGeometry(final Geometry geometry) {
        this.getGeometry().add(geometry);
        return this;
    }

    /**
     *
     * 
     * @param multiGeometrySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setMultiGeometrySimpleExtension(final List<Object> multiGeometrySimpleExtension) {
        this.multiGeometrySimpleExtension = multiGeometrySimpleExtension;
    }

    /**
     * add a value to the multiGeometrySimpleExtension property collection
     * 
     * @param multiGeometrySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public MultiGeometry addToMultiGeometrySimpleExtension(final Object multiGeometrySimpleExtension) {
        this.getMultiGeometrySimpleExtension().add(multiGeometrySimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param multiGeometryObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setMultiGeometryObjectExtension(final List<AbstractObject> multiGeometryObjectExtension) {
        this.multiGeometryObjectExtension = multiGeometryObjectExtension;
    }

    /**
     * add a value to the multiGeometryObjectExtension property collection
     * 
     * @param multiGeometryObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public MultiGeometry addToMultiGeometryObjectExtension(final AbstractObject multiGeometryObjectExtension) {
        this.getMultiGeometryObjectExtension().add(multiGeometryObjectExtension);
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
    public MultiGeometry addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public MultiGeometry addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
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
    public MultiGeometry addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
        super.getGeometryObjectExtension().add(geometryObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param geometry
     *     required parameter
     */
    public MultiGeometry withGeometry(final List<Geometry> geometry) {
        this.setGeometry(geometry);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param multiGeometrySimpleExtension
     *     required parameter
     */
    public MultiGeometry withMultiGeometrySimpleExtension(final List<Object> multiGeometrySimpleExtension) {
        this.setMultiGeometrySimpleExtension(multiGeometrySimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param multiGeometryObjectExtension
     *     required parameter
     */
    public MultiGeometry withMultiGeometryObjectExtension(final List<AbstractObject> multiGeometryObjectExtension) {
        this.setMultiGeometryObjectExtension(multiGeometryObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public MultiGeometry withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public MultiGeometry withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public MultiGeometry withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public MultiGeometry withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public MultiGeometry withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.withGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    @Override
    public MultiGeometry clone() {
        MultiGeometry copy;
        copy = ((MultiGeometry) super.clone());
        copy.geometry = new ArrayList<Geometry>((getGeometry().size()));
        for (Geometry iter: geometry) {
            copy.geometry.add(iter.clone());
        }
        copy.multiGeometrySimpleExtension = new ArrayList<Object>((getMultiGeometrySimpleExtension().size()));
        for (Object iter: multiGeometrySimpleExtension) {
            copy.multiGeometrySimpleExtension.add(iter);
        }
        copy.multiGeometryObjectExtension = new ArrayList<AbstractObject>((getMultiGeometryObjectExtension().size()));
        for (AbstractObject iter: multiGeometryObjectExtension) {
            copy.multiGeometryObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
