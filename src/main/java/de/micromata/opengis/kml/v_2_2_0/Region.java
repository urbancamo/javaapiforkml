
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Region>}
 * <p>
 * A region contains a bounding box ({@code <LatLonAltBox>}) that describes an area of interest
 * defined by geographic coordinates and altitudes. In addition, a Region contains 
 * an LOD (level of detail) extent ({@code <Lod>}) that defines a validity range of the associated
 * Region in terms of projected screen size. A Region is said to be "active" when the 
 * bounding box is within the user's view and the LOD requirements are met. Objects 
 * associated with a Region are drawn only when the Region is active. When the {@code <viewRefreshMode>} 
 * is onRegion, the Link or Icon is loaded only when the Region is active. See the 
 * "Topics in KML" page on Regions for more details. In a Container or NetworkLink 
 * hierarchy, this calculation uses the Region that is the closest ancestor in the 
 * hierarchy. 
 * </p>
 * <p>
 * Features and geometry associated with a Region are drawn only when the Region is 
 * active. See {@code <Region>}. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Region id="ID"&gt; </strong>
 *   &lt;LatLonAltBox&gt; 
 *     &lt;north&gt;&lt;/north&gt;                            &lt;!-- required; kml:angle90 --&gt;
 *     &lt;south&gt;&lt;/south&gt;                            &lt;!-- required; kml:angle90 --&gt; 
 *     &lt;east&gt;&lt;/east&gt;                              &lt;!-- required; kml:angle180 --&gt;
 *     &lt;west&gt;&lt;/west&gt;                              &lt;!-- required; kml:angle180 --&gt;
 *     &lt;minAltitude&gt;0&lt;/minAltitude&gt;               &lt;!-- float --&gt;
 *     &lt;maxAltitude&gt;0&lt;/maxAltitude&gt;               &lt;!-- float --&gt;
 *     &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
 *         &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
 *         &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt; 
 *   &lt;/LatLonAltBox&gt; 
 *   &lt;Lod&gt;
 *     &lt;minLodPixels&gt;0&lt;/minLodPixels&gt;             &lt;!-- float --&gt;
 *     &lt;maxLodPixels&gt;-1&lt;/maxLodPixels&gt;            &lt;!-- float --&gt;
 *     &lt;minFadeExtent&gt;0&lt;/minFadeExtent&gt;           &lt;!-- float --&gt; 
 *     &lt;maxFadeExtent&gt;0&lt;/maxFadeExtent&gt;           &lt;!-- float --&gt;
 *   &lt;/Lod&gt;
 * <strong>&lt;/Region&gt; </strong></pre>
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
@XmlType(name = "RegionType", propOrder = {
    "latLonAltBox",
    "lod",
    "regionSimpleExtension",
    "regionObjectExtension"
})
@XmlRootElement(name = "Region", namespace = "http://www.opengis.net/kml/2.2")
public class Region
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <latlonaltbox>}(required)
     * <p>
     * A bounding box that describes an area of interest defined by geographic coordinates 
     * and altitudes. Default values and required fields are as follows: 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "LatLonAltBox")
    protected LatLonAltBox latLonAltBox;
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
    @XmlElement(name = "Lod")
    protected Lod lod;
    @XmlElement(name = "RegionSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> regionSimpleExtension;
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
    @XmlElement(name = "RegionObjectExtensionGroup")
    protected List<AbstractObject> regionObjectExtension;

    public Region() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link LatLonAltBox}
     *     
     */
    public LatLonAltBox getLatLonAltBox() {
        return latLonAltBox;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonAltBox}
     *     
     */
    public void setLatLonAltBox(LatLonAltBox value) {
        this.latLonAltBox = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Lod}
     *     
     */
    public Lod getLod() {
        return lod;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Lod}
     *     
     */
    public void setLod(Lod value) {
        this.lod = value;
    }

    /**
     *
     * 
     */
    public List<Object> getRegionSimpleExtension() {
        if (regionSimpleExtension == null) {
            regionSimpleExtension = new ArrayList<Object>();
        }
        return this.regionSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getRegionObjectExtension() {
        if (regionObjectExtension == null) {
            regionObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.regionObjectExtension;
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

        Region region = (Region) object;
        return Objects.equals(latLonAltBox, region.latLonAltBox)
                && Objects.equals(lod, region.lod)
                && Objects.equals(regionSimpleExtension, region.regionSimpleExtension)
                && Objects.equals(regionObjectExtension, region.regionObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(latLonAltBox);
        result = 31 * result + Objects.hashCode(lod);
        result = 31 * result + Objects.hashCode(regionSimpleExtension);
        result = 31 * result + Objects.hashCode(regionObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link LatLonAltBox} and set it to latLonAltBox.
     * 
     * This method is a short version for:
     * {@code
     * LatLonAltBox latLonAltBox = new LatLonAltBox();
     * this.setLatLonAltBox(latLonAltBox); }
     * 
     * 
     */
    public LatLonAltBox createAndSetLatLonAltBox() {
        LatLonAltBox newValue = new LatLonAltBox();
        this.setLatLonAltBox(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Lod} and set it to lod.
     * 
     * This method is a short version for:
     * {@code
     * Lod lod = new Lod();
     * this.setLod(lod); }
     * 
     * 
     */
    public Lod createAndSetLod() {
        Lod newValue = new Lod();
        this.setLod(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param regionSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setRegionSimpleExtension(final List<Object> regionSimpleExtension) {
        this.regionSimpleExtension = regionSimpleExtension;
    }

    /**
     * add a value to the regionSimpleExtension property collection
     * 
     * @param regionSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Region addToRegionSimpleExtension(final Object regionSimpleExtension) {
        this.getRegionSimpleExtension().add(regionSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param regionObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setRegionObjectExtension(final List<AbstractObject> regionObjectExtension) {
        this.regionObjectExtension = regionObjectExtension;
    }

    /**
     * add a value to the regionObjectExtension property collection
     * 
     * @param regionObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Region addToRegionObjectExtension(final AbstractObject regionObjectExtension) {
        this.getRegionObjectExtension().add(regionObjectExtension);
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
    public Region addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latLonAltBox
     *     required parameter
     */
    public Region withLatLonAltBox(final LatLonAltBox latLonAltBox) {
        this.setLatLonAltBox(latLonAltBox);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param lod
     *     required parameter
     */
    public Region withLod(final Lod lod) {
        this.setLod(lod);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param regionSimpleExtension
     *     required parameter
     */
    public Region withRegionSimpleExtension(final List<Object> regionSimpleExtension) {
        this.setRegionSimpleExtension(regionSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param regionObjectExtension
     *     required parameter
     */
    public Region withRegionObjectExtension(final List<AbstractObject> regionObjectExtension) {
        this.setRegionObjectExtension(regionObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Region withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Region withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Region withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Region clone() {
        Region copy;
        copy = ((Region) super.clone());
        copy.latLonAltBox = ((latLonAltBox == null)?null:((LatLonAltBox) latLonAltBox.clone()));
        copy.lod = ((lod == null)?null:((Lod) lod.clone()));
        copy.regionSimpleExtension = new ArrayList<Object>((getRegionSimpleExtension().size()));
        for (Object iter: regionSimpleExtension) {
            copy.regionSimpleExtension.add(iter);
        }
        copy.regionObjectExtension = new ArrayList<AbstractObject>((getRegionObjectExtension().size()));
        for (AbstractObject iter: regionObjectExtension) {
            copy.regionObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
