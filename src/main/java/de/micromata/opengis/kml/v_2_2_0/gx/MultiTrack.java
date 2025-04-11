
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.AbstractObject;
import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.BooleanConverter;
import de.micromata.opengis.kml.v_2_2_0.Geometry;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiTrackType", propOrder = {
    "altitudeMode",
    "interpolate",
    "track"
})
@XmlRootElement(name = "MultiTrack", namespace = "http://www.google.com/kml/ext/2.2")
public class MultiTrack
    extends Geometry
    implements Cloneable
{

    @XmlElement(defaultValue = "clampToGround")
    protected AltitudeMode altitudeMode;
    @XmlElement(defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean interpolate;
    @XmlElement(name = "Track")
    protected List<Track> track;

    public MultiTrack() {
        super();
    }

    /**
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
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isInterpolate() {
        return interpolate;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setInterpolate(Boolean value) {
        this.interpolate = value;
    }

    /**
     * 
     */
    public List<Track> getTrack() {
        if (track == null) {
            track = new ArrayList<Track>();
        }
        return this.track;
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

        MultiTrack that = (MultiTrack) object;
        return altitudeMode == that.altitudeMode
                && Objects.equals(interpolate, that.interpolate)
                && Objects.equals(track, that.track);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(interpolate);
        result = 31 * result + Objects.hashCode(track);
        return result;
    }

    /**
     * Creates a new instance of {@link Track} and adds it to track.
     * This method is a short version for:
     * {@code
     * Track track = new Track();
     * this.getTrack().add(track); }
     * 
     * 
     */
    public Track createAndAddTrack() {
        Track newValue = new Track();
        this.getTrack().add(newValue);
        return newValue;
    }

    /**
     * Sets the value of the track property Objects of the following type(s) are allowed in the list {@code List<Track>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withTrack} instead.
     * 
     * 
     * @param track
     *     Objects of the following type are allowed in the list: {@link Track}
     */
    public void setTrack(final List<Track> track) {
        this.track = track;
    }

    /**
     * add a value to the track property collection
     * 
     * @param track
     *     Objects of the following type are allowed in the list: {@link Track}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public MultiTrack addToTrack(final Track track) {
        this.getTrack().add(track);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public MultiTrack addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.setGeometrySimpleExtension(geometrySimpleExtension);
    }

    @Obvious
    @Override
    public MultiTrack addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
        super.getGeometrySimpleExtension().add(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.setGeometryObjectExtension(geometryObjectExtension);
    }

    @Obvious
    @Override
    public MultiTrack addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
        super.getGeometryObjectExtension().add(geometryObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public MultiTrack withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param interpolate
     *     required parameter
     */
    public MultiTrack withInterpolate(final Boolean interpolate) {
        this.setInterpolate(interpolate);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param track
     *     required parameter
     */
    public MultiTrack withTrack(final List<Track> track) {
        this.setTrack(track);
        return this;
    }

    @Obvious
    @Override
    public MultiTrack withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public MultiTrack withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public MultiTrack withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public MultiTrack withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public MultiTrack withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.withGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    @Override
    public MultiTrack clone() {
        MultiTrack copy;
        copy = ((MultiTrack) super.clone());
        copy.track = new ArrayList<Track>((getTrack().size()));
        for (Track iter: track) {
            copy.track.add(iter.clone());
        }
        return copy;
    }

}
