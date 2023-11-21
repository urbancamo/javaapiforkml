
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.AbstractObject;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaylistType", propOrder = {
    "tourPrimitive"
})
@XmlRootElement(name = "Playlist", namespace = "http://www.google.com/kml/ext/2.2")
public class Playlist
    extends AbstractObject
    implements Cloneable
{

    @XmlElementRef(name = "AbstractTourPrimitiveGroup", namespace = "http://www.google.com/kml/ext/2.2", required = false)
    protected List<TourPrimitive> tourPrimitive;

    public Playlist() {
        super();
    }

    /**
     * 
     */
    public List<TourPrimitive> getTourPrimitive() {
        if (tourPrimitive == null) {
            tourPrimitive = new ArrayList<TourPrimitive>();
        }
        return this.tourPrimitive;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = ((prime*result)+((tourPrimitive == null)? 0 :tourPrimitive.hashCode()));
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
        if ((obj instanceof Playlist) == false) {
            return false;
        }
        Playlist other = ((Playlist) obj);
        if (tourPrimitive == null) {
            if (other.tourPrimitive!= null) {
                return false;
            }
        } else {
            if (tourPrimitive.equals(other.tourPrimitive) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates a new instance of {@link Wait} and adds it to tourPrimitive.
     * This method is a short version for:
     * {@code
     * Wait wait = new Wait();
     * this.getTourPrimitive().add(wait); }
     * 
     * 
     */
    public Wait createAndAddWait() {
        Wait newValue = new Wait();
        this.getTourPrimitive().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link AnimatedUpdate} and adds it to tourPrimitive.
     * This method is a short version for:
     * {@code
     * AnimatedUpdate animatedUpdate = new AnimatedUpdate();
     * this.getTourPrimitive().add(animatedUpdate); }
     * 
     * 
     */
    public AnimatedUpdate createAndAddAnimatedUpdate() {
        AnimatedUpdate newValue = new AnimatedUpdate();
        this.getTourPrimitive().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link TourControl} and adds it to tourPrimitive.
     * This method is a short version for:
     * {@code
     * TourControl tourControl = new TourControl();
     * this.getTourPrimitive().add(tourControl); }
     * 
     * 
     */
    public TourControl createAndAddTourControl() {
        TourControl newValue = new TourControl();
        this.getTourPrimitive().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link FlyTo} and adds it to tourPrimitive.
     * This method is a short version for:
     * {@code
     * FlyTo flyTo = new FlyTo();
     * this.getTourPrimitive().add(flyTo); }
     * 
     * 
     */
    public FlyTo createAndAddFlyTo() {
        FlyTo newValue = new FlyTo();
        this.getTourPrimitive().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link SoundCue} and adds it to tourPrimitive.
     * This method is a short version for:
     * {@code
     * SoundCue soundCue = new SoundCue();
     * this.getTourPrimitive().add(soundCue); }
     * 
     * 
     */
    public SoundCue createAndAddSoundCue() {
        SoundCue newValue = new SoundCue();
        this.getTourPrimitive().add(newValue);
        return newValue;
    }

    /**
     * Sets the value of the tourPrimitive property Objects of the following type(s) are allowed in the list {@code List<TourPrimitive>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withTourPrimitive} instead.
     * 
     * 
     * @param tourPrimitive
     *     Objects of the following type are allowed in the list: {@code <}{@link AnimatedUpdate}{@code >}{@code <}{@link Wait}{@code >}{@code <}{@link SoundCue}{@code >}{@code <}{@link TourPrimitive}{@code >}{@code <}{@link FlyTo}{@code >}{@code <}{@link TourControl}{@code >}
     */
    public void setTourPrimitive(final List<TourPrimitive> tourPrimitive) {
        this.tourPrimitive = tourPrimitive;
    }

    /**
     * add a value to the tourPrimitive property collection
     * 
     * @param tourPrimitive
     *     Objects of the following type are allowed in the list: {@code <}{@link AnimatedUpdate}{@code >}{@code <}{@link Wait}{@code >}{@code <}{@link SoundCue}{@code >}{@code <}{@link TourPrimitive}{@code >}{@code <}{@link FlyTo}{@code >}{@code <}{@link TourControl}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Playlist addToTourPrimitive(final TourPrimitive tourPrimitive) {
        this.getTourPrimitive().add(tourPrimitive);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Playlist addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param tourPrimitive
     *     required parameter
     */
    public Playlist withTourPrimitive(final List<TourPrimitive> tourPrimitive) {
        this.setTourPrimitive(tourPrimitive);
        return this;
    }

    @Obvious
    @Override
    public Playlist withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Playlist withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Playlist withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Playlist clone() {
        Playlist copy;
        copy = ((Playlist) super.clone());
        copy.tourPrimitive = new ArrayList<TourPrimitive>((getTourPrimitive().size()));
        for (TourPrimitive iter: tourPrimitive) {
            copy.tourPrimitive.add(iter.clone());
        }
        return copy;
    }

}
