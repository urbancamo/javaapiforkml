
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.*;
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
@XmlType(name = "TrackType", propOrder = {
    "extrude",
    "tessellate",
    "altitudeMode",
    "when",
    "coord",
    "angles",
    "model",
    "extendedData",
    "trackSimpleExtension"
})
@XmlRootElement(name = "Track", namespace = "http://www.google.com/kml/ext/2.2")
public class Track
    extends Geometry
    implements Cloneable
{

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "0")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean extrude;
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "0")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean tessellate;
    @XmlElement(defaultValue = "clampToGround")
    protected AltitudeMode altitudeMode;
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected List<String> when;
    protected List<String> coord;
    protected List<String> angles;
    @XmlElement(name = "Model", namespace = "http://www.opengis.net/kml/2.2")
    protected Model model;
    @XmlElement(name = "ExtendedData", namespace = "http://www.opengis.net/kml/2.2")
    protected ExtendedData extendedData;
    @XmlElement(name = "AbstractTrackSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> trackSimpleExtension;

    public Track() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isExtrude() {
        return extrude;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setExtrude(Boolean value) {
        this.extrude = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isTessellate() {
        return tessellate;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setTessellate(Boolean value) {
        this.tessellate = value;
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
     */
    public List<String> getWhen() {
        if (when == null) {
            when = new ArrayList<String>();
        }
        return this.when;
    }

    /**
     * 
     */
    public List<String> getCoord() {
        if (coord == null) {
            coord = new ArrayList<String>();
        }
        return this.coord;
    }

    /**
     * 
     */
    public List<String> getAngles() {
        if (angles == null) {
            angles = new ArrayList<String>();
        }
        return this.angles;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Model}
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Model}
     *     
     */
    public void setModel(Model value) {
        this.model = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link ExtendedData}
     *     
     */
    public ExtendedData getExtendedData() {
        return extendedData;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedData}
     *     
     */
    public void setExtendedData(ExtendedData value) {
        this.extendedData = value;
    }

    /**
     * 
     */
    public List<Object> getTrackSimpleExtension() {
        if (trackSimpleExtension == null) {
            trackSimpleExtension = new ArrayList<Object>();
        }
        return this.trackSimpleExtension;
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

        Track track = (Track) object;
        return altitudeMode == track.altitudeMode
                && Objects.equals(extrude, track.extrude)
                && Objects.equals(tessellate, track.tessellate)
                && Objects.equals(when, track.when)
                && Objects.equals(coord, track.coord)
                && Objects.equals(angles, track.angles)
                && Objects.equals(model, track.model)
                && Objects.equals(extendedData, track.extendedData)
                && Objects.equals(trackSimpleExtension, track.trackSimpleExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(extrude);
        result = 31 * result + Objects.hashCode(tessellate);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(when);
        result = 31 * result + Objects.hashCode(coord);
        result = 31 * result + Objects.hashCode(angles);
        result = 31 * result + Objects.hashCode(model);
        result = 31 * result + Objects.hashCode(extendedData);
        result = 31 * result + Objects.hashCode(trackSimpleExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Model} and set it to model.
     * 
     * This method is a short version for:
     * {@code
     * Model model = new Model();
     * this.setModel(model); }
     * 
     * 
     */
    public Model createAndSetModel() {
        Model newValue = new Model();
        this.setModel(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ExtendedData} and set it to extendedData.
     * 
     * This method is a short version for:
     * {@code
     * ExtendedData extendedData = new ExtendedData();
     * this.setExtendedData(extendedData); }
     * 
     * 
     */
    public ExtendedData createAndSetExtendedData() {
        ExtendedData newValue = new ExtendedData();
        this.setExtendedData(newValue);
        return newValue;
    }

    /**
     * Sets the value of the when property Objects of the following type(s) are allowed in the list {@code List<String>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withWhen} instead.
     * 
     * 
     * @param when
     *     Objects of the following type are allowed in the list: {@link String}
     */
    public void setWhen(final List<String> when) {
        this.when = when;
    }

    /**
     * add a value to the when property collection
     * 
     * @param when
     *     Objects of the following type are allowed in the list: {@link String}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Track addToWhen(final String when) {
        this.getWhen().add(when);
        return this;
    }

    /**
     * Sets the value of the coord property Objects of the following type(s) are allowed in the list {@code List<String>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withCoord} instead.
     * 
     * 
     * @param coord
     *     Objects of the following type are allowed in the list: {@link String}
     */
    public void setCoord(final List<String> coord) {
        this.coord = coord;
    }

    /**
     * add a value to the coord property collection
     * 
     * @param coord
     *     Objects of the following type are allowed in the list: {@link String}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Track addToCoord(final String coord) {
        this.getCoord().add(coord);
        return this;
    }

    /**
     * Sets the value of the angles property Objects of the following type(s) are allowed in the list {@code List<String>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withAngles} instead.
     * 
     * 
     * @param angles
     *     Objects of the following type are allowed in the list: {@link String}
     */
    public void setAngles(final List<String> angles) {
        this.angles = angles;
    }

    /**
     * add a value to the angles property collection
     * 
     * @param angles
     *     Objects of the following type are allowed in the list: {@link String}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Track addToAngles(final String angles) {
        this.getAngles().add(angles);
        return this;
    }

    /**
     * Sets the value of the trackSimpleExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withTrackSimpleExtension} instead.
     * 
     * 
     * @param trackSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setTrackSimpleExtension(final List<Object> trackSimpleExtension) {
        this.trackSimpleExtension = trackSimpleExtension;
    }

    /**
     * add a value to the trackSimpleExtension property collection
     * 
     * @param trackSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Track addToTrackSimpleExtension(final Object trackSimpleExtension) {
        this.getTrackSimpleExtension().add(trackSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Track addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public Track addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
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
    public Track addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
        super.getGeometryObjectExtension().add(geometryObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param extrude
     *     required parameter
     */
    public Track withExtrude(final Boolean extrude) {
        this.setExtrude(extrude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param tessellate
     *     required parameter
     */
    public Track withTessellate(final Boolean tessellate) {
        this.setTessellate(tessellate);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public Track withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param when
     *     required parameter
     */
    public Track withWhen(final List<String> when) {
        this.setWhen(when);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param coord
     *     required parameter
     */
    public Track withCoord(final List<String> coord) {
        this.setCoord(coord);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param angles
     *     required parameter
     */
    public Track withAngles(final List<String> angles) {
        this.setAngles(angles);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param model
     *     required parameter
     */
    public Track withModel(final Model model) {
        this.setModel(model);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param extendedData
     *     required parameter
     */
    public Track withExtendedData(final ExtendedData extendedData) {
        this.setExtendedData(extendedData);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param trackSimpleExtension
     *     required parameter
     */
    public Track withTrackSimpleExtension(final List<Object> trackSimpleExtension) {
        this.setTrackSimpleExtension(trackSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Track withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Track withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Track withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Track withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Track withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.withGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    @Override
    public Track clone() {
        Track copy;
        copy = ((Track) super.clone());
        copy.when = new ArrayList<String>((getWhen().size()));
        for (String iter: when) {
            copy.when.add(iter);
        }
        copy.coord = new ArrayList<String>((getCoord().size()));
        for (String iter: coord) {
            copy.coord.add(iter);
        }
        copy.angles = new ArrayList<String>((getAngles().size()));
        for (String iter: angles) {
            copy.angles.add(iter);
        }
        copy.model = ((model == null)?null:((Model) model.clone()));
        copy.extendedData = ((extendedData == null)?null:((ExtendedData) extendedData.clone()));
        copy.trackSimpleExtension = new ArrayList<Object>((getTrackSimpleExtension().size()));
        for (Object iter: trackSimpleExtension) {
            copy.trackSimpleExtension.add(iter);
        }
        return copy;
    }

}
