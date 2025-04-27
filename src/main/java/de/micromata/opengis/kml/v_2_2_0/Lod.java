
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <lod>}
 * <p>
 * {@code <minLodPixels>} (required) Measurement in screen pixels that represents the minimum 
 * limit of the visibility range for a given Region. Google Earth calculates the size 
 * of the Region when projected onto screen space. Then it computes the square root 
 * of the Region's area (if, for example, the Region is square and the viewpoint is 
 * directly above the Region, and the Region is not tilted, this measurement is equal 
 * to the width of the projected Region). If this measurement falls within the limits 
 * defined by {@code <minLodPixels>} and {@code <maxLodPixels>} (and if the {@code <LatLonAltBox>} is in view),
 * the Region is active. If this limit is not reached, the associated geometry is considered 
 * to be too far from the user's viewpoint to be drawn. {@code <maxLodPixels>} Measurement 
 * in screen pixels that represents the maximum limit of the visibility range for a 
 * given Region. A value of −1, the default, indicates "active to infinite size." {@code <minFadeExtent>} 
 * Distance over which the geometry fades, from fully opaque to fully transparent. 
 * This ramp value, expressed in screen pixels, is applied at the minimum end of the 
 * LOD (visibility) limits. {@code <maxFadeExtent>} Distance over which the geometry fades, 
 * from fully transparent to fully opaque. This ramp value, expressed in screen pixels, 
 * is applied at the maximum end of the LOD (visibility) limits. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodType", propOrder = {
    "minLodPixels",
    "maxLodPixels",
    "minFadeExtent",
    "maxFadeExtent",
    "lodSimpleExtension",
    "lodObjectExtension"
})
@XmlRootElement(name = "Lod", namespace = "http://www.opengis.net/kml/2.2")
public class Lod
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <minLodPixels>} (required)
     * <p>
     * Measurement in screen pixels that represents the minimum limit of the visibility 
     * range for a given Region. Google Earth calculates the size of the Region when projected 
     * onto screen space. Then it computes the square root of the Region's area (if, for 
     * example, the Region is square and the viewpoint is directly above the Region, and 
     * the Region is not tilted, this measurement is equal to the width of the projected 
     * Region). If this measurement falls within the limits defined by {@code <minLodPixels>} and 
     * {@code <maxLodPixels>} (and if the {@code <LatLonAltBox>} is in view), the Region is active. If
     * this limit is not reached, the associated geometry is considered to be too far from 
     * the user's viewpoint to be drawn. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double minLodPixels;
    /**
     * {@code <maxLodPixels>}
     * <p>
     * Measurement in screen pixels that represents the maximum limit of the visibility 
     * range for a given Region. A value of −1, the default, indicates "active to infinite 
     * size." 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "-1.0")
    protected double maxLodPixels;
    /**
     * {@code <minFadeExtent>}
     * <p>
     * Distance over which the geometry fades, from fully opaque to fully transparent. 
     * This ramp value, expressed in screen pixels, is applied at the minimum end of the 
     * LOD (visibility) limits. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double minFadeExtent;
    /**
     * {@code <maxFadeExtent>}
     * <p>
     * Distance over which the geometry fades, from fully transparent to fully opaque. 
     * This ramp value, expressed in screen pixels, is applied at the maximum end of the 
     * LOD (visibility) limits. 
     * </p>
     * <p>
     * In the following diagram, if P=the calculated projected pixel size, the circled 
     * numbers indicate the following: if (P lt minLodPixels) opacity=0 //#1 in diagram
     * else if(P lt minLodPixels + minFadeExtent) opacity=(P - minLodPixels)/minFadeExtent
     * //#2 in diagram else if (P lt maxLodPixels - maxFadeExtent) opacity=1 //#3 in diagram
     * else if (P lt maxLodPixels) opacity=(maxLodPixels-P)/maxFadeExtent //#4 in diagram
     * else opacity=0 //#5 in diagram 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double maxFadeExtent;
    @XmlElement(name = "LodSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> lodSimpleExtension;
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
    @XmlElement(name = "LodObjectExtensionGroup")
    protected List<AbstractObject> lodObjectExtension;

    public Lod() {
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
    public double getMinLodPixels() {
        return minLodPixels;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMinLodPixels(double value) {
        this.minLodPixels = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getMaxLodPixels() {
        return maxLodPixels;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMaxLodPixels(double value) {
        this.maxLodPixels = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getMinFadeExtent() {
        return minFadeExtent;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMinFadeExtent(double value) {
        this.minFadeExtent = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getMaxFadeExtent() {
        return maxFadeExtent;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMaxFadeExtent(double value) {
        this.maxFadeExtent = value;
    }

    /**
     *
     * 
     */
    public List<Object> getLodSimpleExtension() {
        if (lodSimpleExtension == null) {
            lodSimpleExtension = new ArrayList<Object>();
        }
        return this.lodSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLodObjectExtension() {
        if (lodObjectExtension == null) {
            lodObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.lodObjectExtension;
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

        Lod lod = (Lod) object;
        return Double.compare(minLodPixels, lod.minLodPixels) == 0
                && Double.compare(maxLodPixels, lod.maxLodPixels) == 0
                && Double.compare(minFadeExtent, lod.minFadeExtent) == 0
                && Double.compare(maxFadeExtent, lod.maxFadeExtent) == 0
                && Objects.equals(lodSimpleExtension, lod.lodSimpleExtension)
                && Objects.equals(lodObjectExtension, lod.lodObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(minLodPixels);
        result = 31 * result + Double.hashCode(maxLodPixels);
        result = 31 * result + Double.hashCode(minFadeExtent);
        result = 31 * result + Double.hashCode(maxFadeExtent);
        result = 31 * result + Objects.hashCode(lodSimpleExtension);
        result = 31 * result + Objects.hashCode(lodObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param lodSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLodSimpleExtension(final List<Object> lodSimpleExtension) {
        this.lodSimpleExtension = lodSimpleExtension;
    }

    /**
     * add a value to the lodSimpleExtension property collection
     * 
     * @param lodSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Lod addToLodSimpleExtension(final Object lodSimpleExtension) {
        this.getLodSimpleExtension().add(lodSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param lodObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLodObjectExtension(final List<AbstractObject> lodObjectExtension) {
        this.lodObjectExtension = lodObjectExtension;
    }

    /**
     * add a value to the lodObjectExtension property collection
     * 
     * @param lodObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Lod addToLodObjectExtension(final AbstractObject lodObjectExtension) {
        this.getLodObjectExtension().add(lodObjectExtension);
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
    public Lod addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param minLodPixels
     *     required parameter
     */
    public Lod withMinLodPixels(final double minLodPixels) {
        this.setMinLodPixels(minLodPixels);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param maxLodPixels
     *     required parameter
     */
    public Lod withMaxLodPixels(final double maxLodPixels) {
        this.setMaxLodPixels(maxLodPixels);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param minFadeExtent
     *     required parameter
     */
    public Lod withMinFadeExtent(final double minFadeExtent) {
        this.setMinFadeExtent(minFadeExtent);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param maxFadeExtent
     *     required parameter
     */
    public Lod withMaxFadeExtent(final double maxFadeExtent) {
        this.setMaxFadeExtent(maxFadeExtent);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param lodSimpleExtension
     *     required parameter
     */
    public Lod withLodSimpleExtension(final List<Object> lodSimpleExtension) {
        this.setLodSimpleExtension(lodSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param lodObjectExtension
     *     required parameter
     */
    public Lod withLodObjectExtension(final List<AbstractObject> lodObjectExtension) {
        this.setLodObjectExtension(lodObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Lod withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Lod withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Lod withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Lod clone() {
        Lod copy;
        copy = ((Lod) super.clone());
        copy.lodSimpleExtension = new ArrayList<Object>((getLodSimpleExtension().size()));
        for (Object iter: lodSimpleExtension) {
            copy.lodSimpleExtension.add(iter);
        }
        copy.lodObjectExtension = new ArrayList<AbstractObject>((getLodObjectExtension().size()));
        for (AbstractObject iter: lodObjectExtension) {
            copy.lodObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
