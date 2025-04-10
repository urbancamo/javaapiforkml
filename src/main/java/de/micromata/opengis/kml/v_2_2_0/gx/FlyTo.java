
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.AbstractView;
import de.micromata.opengis.kml.v_2_2_0.Camera;
import de.micromata.opengis.kml.v_2_2_0.LookAt;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * {@code <gx:FlyTo>}
 * <p>
 * gx:FlyTo specifies a point in space to which the browser will fly during a tour. 
 * It must contain one AbstractView, and should contain {@code <gx:duration>} and {@code <gx:flyToMode>}
 * elements, which specify the time it takes to fly to the defined point from the current 
 * point, and the method of flight, respectively. 
 * </p>
 * 
 * Syntax: 
 * {@code <gx:FlyTo>
 *   <gx:duration>0.0</gx:duration>         <!-- double -->
 *   <gx:flyToMode>bounce</gx:duration>      <!-- <em>smooth</em> or <em>bounce</em> -->
 *   <!-- AbstractView -->                   <!-- <em>Camera</em> or <em>LookAt</em> --> 
 *     ...
 *   <!-- /AbstractView -->
 * </gx:FlyTo>}
 * 
 * Extends: 
 *
 * 
 * Contains: 
 *
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlyToType", propOrder = {
    "duration",
    "flyToMode",
    "abstractView"
})
@XmlRootElement(name = "FlyTo", namespace = "http://www.google.com/kml/ext/2.2")
public class FlyTo
    extends TourPrimitive
    implements Cloneable
{

    /**
     * {@code gx:duration}
     * <p>
     * gx:duration extends gx:TourPrimitive by specifying a time-span for events. The 
     * time is written as seconds using XML's double datatype. 
     * </p>
     * <p>
     * Duration and gx:AnimatedUpdate 
     * </p>
     * <p>
     * Duration and gx:FlyTo 
     * </p>
     * <p>
     * Specifies the length of time over which the update takes place. Integer, float, 
     * and color fields are smoothly animated from original to new value across the duration; 
     * boolean, string, and other values that don't lend to interpolation are updated at 
     * the end of the duration. 
     * </p>
     * <p>
     * When a duration is included within a gx:FlyTo element, it specifies the length 
     * of time that the browser takes to fly from the previous point to the specified point. 
     * </p>
     * 
     * Syntax: 
     * {@code <gx:duration>0.0</gx:duration>            <!-- double -->}
     *
     */
    @XmlElement(defaultValue = "0.0")
    protected double duration;
    @XmlElement(defaultValue = "bounce")
    protected FlyToMode flyToMode;
    /**
     * {@code abstractview}
     * <p>
     * Defines a viewpoint associated with any element derived from Feature. See Camera
     * and LookAt.
     * </p>
     * <p>
     * This is an abstract element and cannot be used directly in a KML file. This element 
     * is extended by the Camera and LookAt elements.
     * </p>
     * 
     * Syntax: 
     * {@code <!-- abstract element; do not create -->
     * <strong><!--<em> AbstractView</em> --></strong>                   <!-- Camera, LookAt -->                
     *   <!-- extends <span class="style1">Object</span> -->
     *   <em><TimePrimitive>...</TimePrimitive></em>                        <!-- gx:TimeSpan or gx:TimeStamp -->
     * <strong><-- /<em>AbstractView</em> --></strong> }
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
     */
    @XmlElementRef(name = "AbstractViewGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected AbstractView abstractView;

    public FlyTo() {
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
    public double getDuration() {
        return duration;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setDuration(double value) {
        this.duration = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link FlyToMode}
     *     
     */
    public FlyToMode getFlyToMode() {
        return flyToMode;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link FlyToMode}
     *     
     */
    public void setFlyToMode(FlyToMode value) {
        this.flyToMode = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@code <}{@link AbstractView}{@code >}
     *     {@code <}{@link LookAt}{@code >}
     *     {@code <}{@link Camera}{@code >}
     *     
     */
    public AbstractView getAbstractView() {
        return abstractView;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link AbstractView}{@code >}
     *     {@code <}{@link LookAt}{@code >}
     *     {@code <}{@link Camera}{@code >}
     *     
     */
    public void setAbstractView(AbstractView value) {
        this.abstractView = ((AbstractView ) value);
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

        FlyTo flyTo = (FlyTo) object;
        return flyToMode == flyTo.flyToMode
                && Double.compare(duration, flyTo.duration) == 0
                && Objects.equals(abstractView, flyTo.abstractView);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(duration);
        result = 31 * result + Objects.hashCode(flyToMode);
        result = 31 * result + Objects.hashCode(abstractView);
        return result;
    }

    /**
     * Creates a new instance of {@link LookAt} and set it to abstractView.
     * 
     * This method is a short version for:
     * {@code
     * LookAt lookAt = new LookAt();
     * this.setAbstractView(lookAt); }
     * 
     * 
     */
    public LookAt createAndSetLookAt() {
        LookAt newValue = new LookAt();
        this.setAbstractView(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Camera} and set it to abstractView.
     * 
     * This method is a short version for:
     * {@code
     * Camera camera = new Camera();
     * this.setAbstractView(camera); }
     * 
     * 
     */
    public Camera createAndSetCamera() {
        Camera newValue = new Camera();
        this.setAbstractView(newValue);
        return newValue;
    }

    /**
     * fluent setter
     *
     * 
     * @param duration
     *     required parameter
     */
    public FlyTo withDuration(final double duration) {
        this.setDuration(duration);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param flyToMode
     *     required parameter
     */
    public FlyTo withFlyToMode(final FlyToMode flyToMode) {
        this.setFlyToMode(flyToMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractView
     *     required parameter
     */
    public FlyTo withAbstractView(final AbstractView abstractView) {
        this.setAbstractView(abstractView);
        return this;
    }

    @Obvious
    @Override
    public FlyTo withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public FlyTo withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public FlyTo withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public FlyTo clone() {
        FlyTo copy;
        copy = ((FlyTo) super.clone());
        copy.abstractView = ((abstractView == null)?null:((AbstractView ) abstractView.clone()));
        return copy;
    }

}
