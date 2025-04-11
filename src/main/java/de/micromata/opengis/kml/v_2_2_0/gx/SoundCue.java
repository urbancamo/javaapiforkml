
package de.micromata.opengis.kml.v_2_2_0.gx;

import java.util.List;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundCueType", propOrder = {
    "href",
    "delayedStart"
})
@XmlRootElement(name = "SoundCue", namespace = "http://www.google.com/kml/ext/2.2")
public class SoundCue
    extends TourPrimitive
    implements Cloneable
{

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected String href;
    @XmlElement(defaultValue = "0.0")
    protected double delayedStart;

    public SoundCue() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
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

        SoundCue soundCue = (SoundCue) object;
        return Double.compare(delayedStart, soundCue.delayedStart) == 0
                && Objects.equals(href, soundCue.href);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(href);
        result = 31 * result + Double.hashCode(delayedStart);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param href
     *     required parameter
     */
    public SoundCue withHref(final String href) {
        this.setHref(href);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param delayedStart
     *     required parameter
     */
    public SoundCue withDelayedStart(final double delayedStart) {
        this.setDelayedStart(delayedStart);
        return this;
    }

    @Obvious
    @Override
    public SoundCue withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public SoundCue withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public SoundCue withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public SoundCue clone() {
        SoundCue copy;
        copy = ((SoundCue) super.clone());
        return copy;
    }

}
