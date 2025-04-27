
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
@XmlType(name = "TourControlType", propOrder = {
    "playMode"
})
@XmlRootElement(name = "TourControl", namespace = "http://www.google.com/kml/ext/2.2")
public class TourControl
    extends TourPrimitive
    implements Cloneable
{

    @XmlElement(defaultValue = "pause")
    protected PlayMode playMode;

    public TourControl() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PlayMode}
     *     
     */
    public PlayMode getPlayMode() {
        return playMode;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PlayMode}
     *     
     */
    public void setPlayMode(PlayMode value) {
        this.playMode = value;
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

        TourControl that = (TourControl) object;
        return playMode == that.playMode;
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(playMode);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param playMode
     *     required parameter
     */
    public TourControl withPlayMode(final PlayMode playMode) {
        this.setPlayMode(playMode);
        return this;
    }

    @Obvious
    @Override
    public TourControl withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public TourControl withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public TourControl withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public TourControl clone() {
        TourControl copy;
        copy = ((TourControl) super.clone());
        return copy;
    }

}
