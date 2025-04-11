
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonAltBoxType", propOrder = {
    "minAltitude",
    "maxAltitude",
    "altitudeMode",
    "latLonAltBoxSimpleExtension",
    "latLonAltBoxObjectExtension"
})
@XmlRootElement(name = "LatLonAltBox", namespace = "http://www.opengis.net/kml/2.2")
public class LatLonAltBox
    extends AbstractLatLonBox
    implements Cloneable
{

    /**
     * {@code <minaltitude>}
     * <p>
     * Specified in meters (and is affected by the altitude mode specification). 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double minAltitude;
    /**
     * {@code <maxaltitude>}
     * <p>
     * Specified in meters (and is affected by the altitude mode specification). 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double maxAltitude;
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
    @XmlElement(name = "LatLonAltBoxSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> latLonAltBoxSimpleExtension;
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
    @XmlElement(name = "LatLonAltBoxObjectExtensionGroup")
    protected List<AbstractObject> latLonAltBoxObjectExtension;

    public LatLonAltBox() {
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
    public double getMinAltitude() {
        return minAltitude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMinAltitude(double value) {
        this.minAltitude = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getMaxAltitude() {
        return maxAltitude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMaxAltitude(double value) {
        this.maxAltitude = value;
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
    public List<Object> getLatLonAltBoxSimpleExtension() {
        if (latLonAltBoxSimpleExtension == null) {
            latLonAltBoxSimpleExtension = new ArrayList<Object>();
        }
        return this.latLonAltBoxSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLatLonAltBoxObjectExtension() {
        if (latLonAltBoxObjectExtension == null) {
            latLonAltBoxObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.latLonAltBoxObjectExtension;
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

        LatLonAltBox that = (LatLonAltBox) object;
        return altitudeMode == that.altitudeMode
                && Double.compare(minAltitude, that.minAltitude) == 0
                && Double.compare(maxAltitude, that.maxAltitude) == 0
                && Objects.equals(latLonAltBoxSimpleExtension, that.latLonAltBoxSimpleExtension)
                && Objects.equals(latLonAltBoxObjectExtension, that.latLonAltBoxObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(minAltitude);
        result = 31 * result + Double.hashCode(maxAltitude);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(latLonAltBoxSimpleExtension);
        result = 31 * result + Objects.hashCode(latLonAltBoxObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param latLonAltBoxSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLatLonAltBoxSimpleExtension(final List<Object> latLonAltBoxSimpleExtension) {
        this.latLonAltBoxSimpleExtension = latLonAltBoxSimpleExtension;
    }

    /**
     * add a value to the latLonAltBoxSimpleExtension property collection
     * 
     * @param latLonAltBoxSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonAltBox addToLatLonAltBoxSimpleExtension(final Object latLonAltBoxSimpleExtension) {
        this.getLatLonAltBoxSimpleExtension().add(latLonAltBoxSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param latLonAltBoxObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLatLonAltBoxObjectExtension(final List<AbstractObject> latLonAltBoxObjectExtension) {
        this.latLonAltBoxObjectExtension = latLonAltBoxObjectExtension;
    }

    /**
     * add a value to the latLonAltBoxObjectExtension property collection
     * 
     * @param latLonAltBoxObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LatLonAltBox addToLatLonAltBoxObjectExtension(final AbstractObject latLonAltBoxObjectExtension) {
        this.getLatLonAltBoxObjectExtension().add(latLonAltBoxObjectExtension);
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
    public LatLonAltBox addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setAbstractLatLonBoxSimpleExtension(final List<Object> abstractLatLonBoxSimpleExtension) {
        super.setAbstractLatLonBoxSimpleExtension(abstractLatLonBoxSimpleExtension);
    }

    @Obvious
    @Override
    public LatLonAltBox addToAbstractLatLonBoxSimpleExtension(final Object abstractLatLonBoxSimpleExtension) {
        super.getAbstractLatLonBoxSimpleExtension().add(abstractLatLonBoxSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setAbstractLatLonBoxObjectExtension(final List<AbstractObject> abstractLatLonBoxObjectExtension) {
        super.setAbstractLatLonBoxObjectExtension(abstractLatLonBoxObjectExtension);
    }

    @Obvious
    @Override
    public LatLonAltBox addToAbstractLatLonBoxObjectExtension(final AbstractObject abstractLatLonBoxObjectExtension) {
        super.getAbstractLatLonBoxObjectExtension().add(abstractLatLonBoxObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param minAltitude
     *     required parameter
     */
    public LatLonAltBox withMinAltitude(final double minAltitude) {
        this.setMinAltitude(minAltitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param maxAltitude
     *     required parameter
     */
    public LatLonAltBox withMaxAltitude(final double maxAltitude) {
        this.setMaxAltitude(maxAltitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public LatLonAltBox withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latLonAltBoxSimpleExtension
     *     required parameter
     */
    public LatLonAltBox withLatLonAltBoxSimpleExtension(final List<Object> latLonAltBoxSimpleExtension) {
        this.setLatLonAltBoxSimpleExtension(latLonAltBoxSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latLonAltBoxObjectExtension
     *     required parameter
     */
    public LatLonAltBox withLatLonAltBoxObjectExtension(final List<AbstractObject> latLonAltBoxObjectExtension) {
        this.setLatLonAltBoxObjectExtension(latLonAltBoxObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withNorth(final double north) {
        super.withNorth(north);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withSouth(final double south) {
        super.withSouth(south);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withEast(final double east) {
        super.withEast(east);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withWest(final double west) {
        super.withWest(west);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withAbstractLatLonBoxSimpleExtension(final List<Object> abstractLatLonBoxSimpleExtension) {
        super.withAbstractLatLonBoxSimpleExtension(abstractLatLonBoxSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LatLonAltBox withAbstractLatLonBoxObjectExtension(final List<AbstractObject> abstractLatLonBoxObjectExtension) {
        super.withAbstractLatLonBoxObjectExtension(abstractLatLonBoxObjectExtension);
        return this;
    }

    @Override
    public LatLonAltBox clone() {
        LatLonAltBox copy;
        copy = ((LatLonAltBox) super.clone());
        copy.latLonAltBoxSimpleExtension = new ArrayList<Object>((getLatLonAltBoxSimpleExtension().size()));
        for (Object iter: latLonAltBoxSimpleExtension) {
            copy.latLonAltBoxSimpleExtension.add(iter);
        }
        copy.latLonAltBoxObjectExtension = new ArrayList<AbstractObject>((getLatLonAltBoxObjectExtension().size()));
        for (AbstractObject iter: latLonAltBoxObjectExtension) {
            copy.latLonAltBoxObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
