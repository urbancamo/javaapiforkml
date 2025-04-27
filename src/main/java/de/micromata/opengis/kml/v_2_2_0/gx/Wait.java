
package de.micromata.opengis.kml.v_2_2_0.gx;

import java.util.List;
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
@XmlType(name = "WaitType", propOrder = {
    "duration"
})
@XmlRootElement(name = "Wait", namespace = "http://www.google.com/kml/ext/2.2")
public class Wait
    extends TourPrimitive
    implements Cloneable
{

    @XmlElement(defaultValue = "0.0")
    protected double duration;

    public Wait() {
        super();
    }

    /**
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
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setDuration(double value) {
        this.duration = value;
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

        Wait wait = (Wait) object;
        return Double.compare(duration, wait.duration) == 0;
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(duration);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param duration
     *     required parameter
     */
    public Wait withDuration(final double duration) {
        this.setDuration(duration);
        return this;
    }

    @Obvious
    @Override
    public Wait withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Wait withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Wait withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Wait clone() {
        Wait copy;
        copy = ((Wait) super.clone());
        return copy;
    }

}
