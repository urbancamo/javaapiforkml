
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <viewvolume>}
 * <p>
 * Defines how much of the current scene is visible. Specifying the field of view is 
 * analogous to specifying the lens opening in a physical camera. A small field of 
 * view, like a telephoto lens, focuses on a small part of the scene. A large field 
 * of view, like a wide-angle lens, focuses on a large part of the scene. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewVolumeType", propOrder = {
    "leftFov",
    "rightFov",
    "bottomFov",
    "topFov",
    "near",
    "viewVolumeSimpleExtension",
    "viewVolumeObjectExtension"
})
@XmlRootElement(name = "ViewVolume", namespace = "http://www.opengis.net/kml/2.2")
public class ViewVolume
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <leftfov>}
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the left side of the 
     * view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double leftFov;
    /**
     * {@code <rightfov>}
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the right side of 
     * the view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double rightFov;
    /**
     * {@code <bottomfov>}
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the bottom side of 
     * the view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double bottomFov;
    /**
     * {@code <topfov>}
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the top side of the 
     * view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double topFov;
    /**
     * {@code <near>}
     * <p>
     * {@code <leftFov>} Angle, in degrees, between the camera's viewing direction and the left
     * side of the view volume. {@code <rightFov>} Angle, in degrees, between the camera's viewing
     * direction and the right side of the view volume. {@code <bottomFov>} Angle, in degrees,
     * between the camera's viewing direction and the bottom side of the view volume. {@code <topFov>}
     * Angle, in degrees, between the camera's viewing direction and the top side of the 
     * view volume. {@code <near>} Measurement in meters along the viewing direction from the camera
     * viewpoint to the PhotoOverlay shape. 
     * </p>
     * <p>
     * Measurement in meters along the viewing direction from the camera viewpoint to the 
     * PhotoOverlay shape. 
     * </p>
     * <p>
     * The field of view for a PhotoOverlay is defined by four planes, each of which is 
     * specified by an angle relative to the view vector. These four planes define the 
     * top, bottom, left, and right sides of the field of view, which has the shape of 
     * a truncated pyramid, as shown here: 
     * </p>
     * <p>
     * The following diagrams show the four field-of-view angles within this pyramid: 
     * </p>
     * <p>
     * The following diagrams show the four field-of-view angles within this pyramid: 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double near;
    @XmlElement(name = "ViewVolumeSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> viewVolumeSimpleExtension;
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
    @XmlElement(name = "ViewVolumeObjectExtensionGroup")
    protected List<AbstractObject> viewVolumeObjectExtension;

    public ViewVolume() {
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
    public double getLeftFov() {
        return leftFov;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setLeftFov(double value) {
        this.leftFov = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getRightFov() {
        return rightFov;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setRightFov(double value) {
        this.rightFov = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getBottomFov() {
        return bottomFov;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setBottomFov(double value) {
        this.bottomFov = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getTopFov() {
        return topFov;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setTopFov(double value) {
        this.topFov = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getNear() {
        return near;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setNear(double value) {
        this.near = value;
    }

    /**
     *
     * 
     */
    public List<Object> getViewVolumeSimpleExtension() {
        if (viewVolumeSimpleExtension == null) {
            viewVolumeSimpleExtension = new ArrayList<Object>();
        }
        return this.viewVolumeSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getViewVolumeObjectExtension() {
        if (viewVolumeObjectExtension == null) {
            viewVolumeObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.viewVolumeObjectExtension;
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

        ViewVolume that = (ViewVolume) object;
        return Double.compare(leftFov, that.leftFov) == 0
                && Double.compare(rightFov, that.rightFov) == 0
                && Double.compare(bottomFov, that.bottomFov) == 0
                && Double.compare(topFov, that.topFov) == 0
                && Double.compare(near, that.near) == 0
                && Objects.equals(viewVolumeSimpleExtension, that.viewVolumeSimpleExtension)
                && Objects.equals(viewVolumeObjectExtension, that.viewVolumeObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(leftFov);
        result = 31 * result + Double.hashCode(rightFov);
        result = 31 * result + Double.hashCode(bottomFov);
        result = 31 * result + Double.hashCode(topFov);
        result = 31 * result + Double.hashCode(near);
        result = 31 * result + Objects.hashCode(viewVolumeSimpleExtension);
        result = 31 * result + Objects.hashCode(viewVolumeObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param viewVolumeSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setViewVolumeSimpleExtension(final List<Object> viewVolumeSimpleExtension) {
        this.viewVolumeSimpleExtension = viewVolumeSimpleExtension;
    }

    /**
     * add a value to the viewVolumeSimpleExtension property collection
     * 
     * @param viewVolumeSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ViewVolume addToViewVolumeSimpleExtension(final Object viewVolumeSimpleExtension) {
        this.getViewVolumeSimpleExtension().add(viewVolumeSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param viewVolumeObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setViewVolumeObjectExtension(final List<AbstractObject> viewVolumeObjectExtension) {
        this.viewVolumeObjectExtension = viewVolumeObjectExtension;
    }

    /**
     * add a value to the viewVolumeObjectExtension property collection
     * 
     * @param viewVolumeObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ViewVolume addToViewVolumeObjectExtension(final AbstractObject viewVolumeObjectExtension) {
        this.getViewVolumeObjectExtension().add(viewVolumeObjectExtension);
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
    public ViewVolume addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param leftFov
     *     required parameter
     */
    public ViewVolume withLeftFov(final double leftFov) {
        this.setLeftFov(leftFov);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param rightFov
     *     required parameter
     */
    public ViewVolume withRightFov(final double rightFov) {
        this.setRightFov(rightFov);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param bottomFov
     *     required parameter
     */
    public ViewVolume withBottomFov(final double bottomFov) {
        this.setBottomFov(bottomFov);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param topFov
     *     required parameter
     */
    public ViewVolume withTopFov(final double topFov) {
        this.setTopFov(topFov);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param near
     *     required parameter
     */
    public ViewVolume withNear(final double near) {
        this.setNear(near);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewVolumeSimpleExtension
     *     required parameter
     */
    public ViewVolume withViewVolumeSimpleExtension(final List<Object> viewVolumeSimpleExtension) {
        this.setViewVolumeSimpleExtension(viewVolumeSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewVolumeObjectExtension
     *     required parameter
     */
    public ViewVolume withViewVolumeObjectExtension(final List<AbstractObject> viewVolumeObjectExtension) {
        this.setViewVolumeObjectExtension(viewVolumeObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public ViewVolume withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public ViewVolume withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public ViewVolume withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public ViewVolume clone() {
        ViewVolume copy;
        copy = ((ViewVolume) super.clone());
        copy.viewVolumeSimpleExtension = new ArrayList<Object>((getViewVolumeSimpleExtension().size()));
        for (Object iter: viewVolumeSimpleExtension) {
            copy.viewVolumeSimpleExtension.add(iter);
        }
        copy.viewVolumeObjectExtension = new ArrayList<AbstractObject>((getViewVolumeObjectExtension().size()));
        for (AbstractObject iter: viewVolumeObjectExtension) {
            copy.viewVolumeObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
