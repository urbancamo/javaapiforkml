
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.Update;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * gx:AnimatedUpdate
 * <p>
 * gx:AnimatedUpdate controls changes during a tour to KML features, using Update. 
 * Changes to KML features will not modify the DOM - that is, any changes will be reverted 
 * when the tour is over, and will not be saved in the KML at any time. 
 * </p>
 * <p>
 * gx:AnimatedUpdate should also contain a gx:duration value to specify the length
 * of time in seconds over which the update takes place. Integer, float, and color 
 * fields are smoothly animated from original to new value across the duration; boolean, 
 * string, and other values that don't lend to interpolation are updated at the end 
 * of the duration. 
 * </p>
 * <p>
 * Refer to Tour timelines in the Touring chapter of the KML Developer's Guide for 
 * information about gx:AnimatedUpdate and the tour timeline. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;gx:AnimatedUpdate&gt;
 *   &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;    &lt;!-- double, specifies time in seconds --&gt;
 *   &lt;Update&gt;
 *     &lt;targetHref&gt;...&lt;/targetHref&gt;    &lt;!-- required; can contain a URL or be left blank --&gt;
 *                                                 &lt;!-- (to target elements within the same file --&gt;
 *     &lt;Change&gt;...&lt;/Change&gt;
 *     &lt;Create&gt;...&lt;/Create&gt;
 *     &lt;Delete&gt;...&lt;/Delete&gt;
 *   &lt;/Update&gt;
 * &lt;/gx:AnimatedUpdate&gt;</pre>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimatedUpdateType", propOrder = {
    "duration",
    "update",
    "delayedStart"
})
@XmlRootElement(name = "AnimatedUpdate", namespace = "http://www.google.com/kml/ext/2.2")
public class AnimatedUpdate
    extends TourPrimitive
    implements Cloneable
{

    /**
     * gx:duration
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
     * <pre>&lt;gx:duration&gt;0.0&lt;/gx:duration&gt;            &lt;!-- double --&gt;
     * </pre>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double duration;
    /**
     * Update
     * <p>
     * Specifies an addition, change, or deletion to KML data that has already been loaded 
     * using the specified URL. The targetHref specifies the .kml or .kmz file whose 
     * data (within Google Earth) is to be modified. Update is always contained in a 
     * NetworkLinkControl. Furthermore, the file containing the NetworkLinkControl must 
     * have been loaded by a NetworkLink. See the "Topics in KML" page on Updates for a 
     * detailed example of how Update works. 
     * </p>
     * <p>
     * With Update, you can specify any number of Change, Create, and Delete tags for 
     * a .kml file or .kmz archive that has previously been loaded with a network link. 
     * See Update. 
     * </p>
     * 
     * Syntax: 
     * <pre><strong>&lt;Update&gt;
     *   </strong>&lt;targetHref&gt;...&lt;targetHref&gt;    &lt;!-- URL --&gt;
     *   &lt;Change&gt;...&lt;/Change&gt;
     *   &lt;Create&gt;...&lt;/Create&gt;
     *   &lt;Delete&gt;...&lt;/Delete&gt;
     * <strong>&lt;/Update&gt;</strong></pre>
     * 
     * Contained By: 
     *
     *
     *
     * 
     * 
     * 
     */
    @XmlElement(name = "Update", namespace = "http://www.opengis.net/kml/2.2")
    protected Update update;
    @XmlElement(defaultValue = "0.0")
    protected double delayedStart;

    public AnimatedUpdate() {
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
     *     {@link Update}
     *     
     */
    public Update getUpdate() {
        return update;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Update}
     *     
     */
    public void setUpdate(Update value) {
        this.update = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getDelayedStart() {
        return delayedStart;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setDelayedStart(double value) {
        this.delayedStart = value;
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

        AnimatedUpdate that = (AnimatedUpdate) object;
        return Double.compare(duration, that.duration) == 0
                && Double.compare(delayedStart, that.delayedStart) == 0
                && Objects.equals(update, that.update);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(duration);
        result = 31 * result + Objects.hashCode(update);
        result = 31 * result + Double.hashCode(delayedStart);
        return result;
    }

    /**
     * Creates a new instance of {@link Update} and set it to update.
     * 
     * This method is a short version for:
     * {@code
     * Update update = new Update();
     * this.setUpdate(update); }
     * 
     * 
     * @param createOrDeleteOrChange
     *     required parameter
     * @param targetHref
     *     required parameter
     */
    public Update createAndSetUpdate(final String targetHref, final List<Object> createOrDeleteOrChange) {
        Update newValue = new Update(targetHref, createOrDeleteOrChange);
        this.setUpdate(newValue);
        return newValue;
    }

    /**
     * fluent setter
     *
     * 
     * @param duration
     *     required parameter
     */
    public AnimatedUpdate withDuration(final double duration) {
        this.setDuration(duration);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param update
     *     required parameter
     */
    public AnimatedUpdate withUpdate(final Update update) {
        this.setUpdate(update);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param delayedStart
     *     required parameter
     */
    public AnimatedUpdate withDelayedStart(final double delayedStart) {
        this.setDelayedStart(delayedStart);
        return this;
    }

    @Obvious
    @Override
    public AnimatedUpdate withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public AnimatedUpdate withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public AnimatedUpdate withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public AnimatedUpdate clone() {
        AnimatedUpdate copy;
        copy = ((AnimatedUpdate) super.clone());
        copy.update = ((update == null)?null:((Update) update.clone()));
        return copy;
    }

}
