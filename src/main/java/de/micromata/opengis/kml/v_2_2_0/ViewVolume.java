
package de.micromata.opengis.kml.v_2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;


/**
 * <viewvolume>
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
public class ViewVolume
    extends AbstractObject
{

    /**
     * <leftfov>
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the left side of the 
     * view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double leftFov = 0.0D;
    /**
     * <rightfov>
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the right side of 
     * the view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double rightFov = 0.0D;
    /**
     * <bottomfov>
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the bottom side of 
     * the view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double bottomFov = 0.0D;
    /**
     * <topfov>
     * <p>
     * Angle, in degrees, between the camera's viewing direction and the top side of the 
     * view volume. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double topFov = 0.0D;
    /**
     * <near>
     * <p>
     * Measurement in meters along the viewing direction from the camera viewpoint to the 
     * PhotoOverlay shape. 
     * </p>
     * <p>
     * <leftFov> Angle, in degrees, between the camera's viewing direction and the left 
     * side of the view volume. <rightFov> Angle, in degrees, between the camera's viewing 
     * direction and the right side of the view volume. <bottomFov> Angle, in degrees, 
     * between the camera's viewing direction and the bottom side of the view volume. <topFov> 
     * Angle, in degrees, between the camera's viewing direction and the top side of the 
     * view volume. <near> Measurement in meters along the viewing direction from the camera 
     * viewpoint to the PhotoOverlay shape. 
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
    protected double near = 0.0D;
    @XmlElement(name = "ViewVolumeSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> viewVolumeSimpleExtension;
    /**
     * <Object>
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the <Update> mechanism is to 
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
     */
    public List<Object> getViewVolumeSimpleExtension() {
        if (viewVolumeSimpleExtension == null) {
            viewVolumeSimpleExtension = new ArrayList<Object>();
        }
        return this.viewVolumeSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getViewVolumeObjectExtension() {
        if (viewVolumeObjectExtension == null) {
            viewVolumeObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.viewVolumeObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(leftFov);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(rightFov);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(bottomFov);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(topFov);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(near);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        result = ((prime*result)+((viewVolumeSimpleExtension == null)? 0 :viewVolumeSimpleExtension.hashCode()));
        result = ((prime*result)+((viewVolumeObjectExtension == null)? 0 :viewVolumeObjectExtension.hashCode()));
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
        if ((obj instanceof ViewVolume) == false) {
            return false;
        }
        ViewVolume other = ((ViewVolume) obj);
        if (leftFov!= other.leftFov) {
            return false;
        }
        if (rightFov!= other.rightFov) {
            return false;
        }
        if (bottomFov!= other.bottomFov) {
            return false;
        }
        if (topFov!= other.topFov) {
            return false;
        }
        if (near!= other.near) {
            return false;
        }
        if (viewVolumeSimpleExtension == null) {
            if (other.viewVolumeSimpleExtension!= null) {
                return false;
            }
        } else {
            if (viewVolumeSimpleExtension.equals(other.viewVolumeSimpleExtension) == false) {
                return false;
            }
        }
        if (viewVolumeObjectExtension == null) {
            if (other.viewVolumeObjectExtension!= null) {
                return false;
            }
        } else {
            if (viewVolumeObjectExtension.equals(other.viewVolumeObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the value of the viewVolumeSimpleExtension property Objects of the following type(s) are allowed in the list List<Object>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withViewVolumeSimpleExtension} instead.
     * 
     * 
     * @param viewVolumeSimpleExtension
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
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public ViewVolume addToViewVolumeSimpleExtension(final Object viewVolumeSimpleExtension) {
        this.getViewVolumeSimpleExtension().add(viewVolumeSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the viewVolumeObjectExtension property Objects of the following type(s) are allowed in the list List<AbstractObject>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withViewVolumeObjectExtension} instead.
     * 
     * 
     * @param viewVolumeObjectExtension
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
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public ViewVolume addToViewVolumeObjectExtension(final AbstractObject viewVolumeObjectExtension) {
        this.getViewVolumeObjectExtension().add(viewVolumeObjectExtension);
        return this;
    }

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

}
