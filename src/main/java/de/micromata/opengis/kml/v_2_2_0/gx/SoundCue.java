
package de.micromata.opengis.kml.v_2_2_0.gx;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundCueType", propOrder = {
    "href"
})
@XmlRootElement(name = "SoundCue", namespace = "http://www.google.com/kml/ext/2.2")
public class SoundCue
    extends TourPrimitive
    implements Cloneable
{

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected String href;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((href == null)? 0 :href.hashCode()));
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
        if ((obj instanceof SoundCue) == false) {
            return false;
        }
        SoundCue other = ((SoundCue) obj);
        if (href == null) {
            if (other.href!= null) {
                return false;
            }
        } else {
            if (href.equals(other.href) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * fluent setter
     * @see #setHref(String)
     * 
     * @param href
     *     required parameter
     */
    public SoundCue withHref(final String href) {
        this.setHref(href);
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
