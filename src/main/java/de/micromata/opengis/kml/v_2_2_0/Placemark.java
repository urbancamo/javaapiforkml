
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.atom.Link;
import de.micromata.opengis.kml.v_2_2_0.gx.MultiTrack;
import de.micromata.opengis.kml.v_2_2_0.gx.Track;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressDetails;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Placemark>}
 * <p>
 * A Placemark is a Feature with associated Geometry. In Google Earth, a Placemark 
 * appears as a list item in the Places panel. A Placemark with a Point has an icon 
 * associated with it that marks a point on the Earth in the 3D viewer. (In the Google 
 * Earth 3D viewer, a Point Placemark is the only object you can click or roll over. 
 * Other Geometry objects do not have an icon in the 3D viewer. To give the user something 
 * to click in the 3D viewer, you would need to create a MultiGeometry object that 
 * contains both a Point and the other Geometry object.) 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Placemark id="ID"&gt;</strong>
 *   &lt;!-- inherited from <em>Feature</em> element --&gt;
 *   &lt;name&gt;<em>...</em>&lt;/name&gt;                      &lt;!-- string --&gt;
 *   &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
 *   &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
 *   <span>&lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
 *   &lt;atom:link&gt;...&lt;/atom:link&gt;</span><span>            &lt;!-- xmlns:atom --&gt;</span>
 *   &lt;address&gt;<em>...</em>&lt;/address&gt;                &lt;!-- string --&gt;
 *   &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;<br>  &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;<br>  &lt;Snippet maxLines="2"&gt;<em>...</em>&lt;/Snippet&gt;   &lt;!-- string --&gt;
 *   &lt;description&gt;<em>...</em>&lt;/description&gt;        &lt;!-- string --&gt;
 *   <span><em>&lt;AbstractView&gt;...&lt;/AbstractView&gt;</em>      &lt;!-- Camera <em>or</em> LookAt --&gt;</span>
 *   &lt;<em>TimePrimitive</em>&gt;...&lt;/<em>TimePrimitive</em>&gt;
 *   &lt;styleUrl&gt;<em>...</em>&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
 *   &lt;<em>StyleSelector&gt;...&lt;/StyleSelector&gt;</em>
 *   &lt;Region&gt;...&lt;/Region&gt;
 *   <span>&lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
 *   &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;</span><br>
 *   &lt;!-- specific to Placemark element --&gt;
 *   <em>&lt;Geometry&gt;...&lt;/Geometry&gt;</em>
 * <strong>&lt;/Placemark&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 *
 * 
 * See Also: 
 * {@code <Icon>}
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacemarkType", propOrder = {
    "geometry",
    "placemarkSimpleExtension",
    "placemarkObjectExtension"
})
@XmlRootElement(name = "Placemark", namespace = "http://www.opengis.net/kml/2.2")
public class Placemark
    extends Feature
    implements Cloneable
{

    /**
     * {@code <Geometry>}
     * <p>
     * This is an abstract element and cannot be used directly in a KML file. It provides 
     * a placeholder object for all derived Geometry objects. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;
     * <strong>&lt;!<em>-- Geometry</em> id="ID" --&gt;                 &lt;!-- Point,LineString,LinearRing,
     *                                                Polygon,MultiGeometry,Model --&gt;</strong>
     * <strong>&lt;!-- /<em>Geometry --</em>&gt;</strong></pre>
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
     *
     * 
     * 
     * 
     */
    @XmlElementRef(name = "AbstractGeometryGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected Geometry geometry;
    @XmlElement(name = "PlacemarkSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> placemarkSimpleExtension;
    /**
     * {@code <Object>}
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the Update mechanism is to 
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
    @XmlElement(name = "PlacemarkObjectExtensionGroup")
    protected List<AbstractObject> placemarkObjectExtension;

    public Placemark() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@code <}{@link Geometry}{@code >}
     *     {@code <}{@link Point}{@code >}
     *     {@code <}{@link LinearRing}{@code >}
     *     {@code <}{@link Polygon}{@code >}
     *     {@code <}{@link Track}{@code >}
     *     {@code <}{@link MultiTrack}{@code >}
     *     {@code <}{@link Model}{@code >}
     *     {@code <}{@link LineString}{@code >}
     *     {@code <}{@link MultiGeometry}{@code >}
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link Geometry}{@code >}
     *     {@code <}{@link Point}{@code >}
     *     {@code <}{@link LinearRing}{@code >}
     *     {@code <}{@link Polygon}{@code >}
     *     {@code <}{@link Track}{@code >}
     *     {@code <}{@link MultiTrack}{@code >}
     *     {@code <}{@link Model}{@code >}
     *     {@code <}{@link LineString}{@code >}
     *     {@code <}{@link MultiGeometry}{@code >}
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = ((Geometry ) value);
    }

    /**
     *
     * 
     */
    public List<Object> getPlacemarkSimpleExtension() {
        if (placemarkSimpleExtension == null) {
            placemarkSimpleExtension = new ArrayList<Object>();
        }
        return this.placemarkSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getPlacemarkObjectExtension() {
        if (placemarkObjectExtension == null) {
            placemarkObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.placemarkObjectExtension;
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

        Placemark placemark = (Placemark) object;
        return Objects.equals(geometry, placemark.geometry)
                && Objects.equals(placemarkSimpleExtension, placemark.placemarkSimpleExtension)
                && Objects.equals(placemarkObjectExtension, placemark.placemarkObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(geometry);
        result = 31 * result + Objects.hashCode(placemarkSimpleExtension);
        result = 31 * result + Objects.hashCode(placemarkObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link MultiTrack} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * MultiTrack multiTrack = new MultiTrack();
     * this.setGeometry(multiTrack); }
     * 
     * 
     */
    public MultiTrack createAndSetMultiTrack() {
        MultiTrack newValue = new MultiTrack();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Track} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * Track track = new Track();
     * this.setGeometry(track); }
     * 
     * 
     */
    public Track createAndSetTrack() {
        Track newValue = new Track();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link LinearRing} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * LinearRing linearRing = new LinearRing();
     * this.setGeometry(linearRing); }
     * 
     * 
     */
    public LinearRing createAndSetLinearRing() {
        LinearRing newValue = new LinearRing();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Point} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * Point point = new Point();
     * this.setGeometry(point); }
     * 
     * 
     */
    public Point createAndSetPoint() {
        Point newValue = new Point();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Model} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * Model model = new Model();
     * this.setGeometry(model); }
     * 
     * 
     */
    public Model createAndSetModel() {
        Model newValue = new Model();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link MultiGeometry} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * MultiGeometry multiGeometry = new MultiGeometry();
     * this.setGeometry(multiGeometry); }
     * 
     * 
     */
    public MultiGeometry createAndSetMultiGeometry() {
        MultiGeometry newValue = new MultiGeometry();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link LineString} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * LineString lineString = new LineString();
     * this.setGeometry(lineString); }
     * 
     * 
     */
    public LineString createAndSetLineString() {
        LineString newValue = new LineString();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Polygon} and set it to geometry.
     * 
     * This method is a short version for:
     * {@code
     * Polygon polygon = new Polygon();
     * this.setGeometry(polygon); }
     * 
     * 
     */
    public Polygon createAndSetPolygon() {
        Polygon newValue = new Polygon();
        this.setGeometry(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param placemarkSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setPlacemarkSimpleExtension(final List<Object> placemarkSimpleExtension) {
        this.placemarkSimpleExtension = placemarkSimpleExtension;
    }

    /**
     * add a value to the placemarkSimpleExtension property collection
     * 
     * @param placemarkSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Placemark addToPlacemarkSimpleExtension(final Object placemarkSimpleExtension) {
        this.getPlacemarkSimpleExtension().add(placemarkSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param placemarkObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setPlacemarkObjectExtension(final List<AbstractObject> placemarkObjectExtension) {
        this.placemarkObjectExtension = placemarkObjectExtension;
    }

    /**
     * add a value to the placemarkObjectExtension property collection
     * 
     * @param placemarkObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Placemark addToPlacemarkObjectExtension(final AbstractObject placemarkObjectExtension) {
        this.getPlacemarkObjectExtension().add(placemarkObjectExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Placemark addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setStyleSelector(final List<StyleSelector> styleSelector) {
        super.setStyleSelector(styleSelector);
    }

    @Obvious
    @Override
    public Placemark addToStyleSelector(final StyleSelector styleSelector) {
        super.getStyleSelector().add(styleSelector);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.setFeatureSimpleExtension(featureSimpleExtension);
    }

    @Obvious
    @Override
    public Placemark addToFeatureSimpleExtension(final Object featureSimpleExtension) {
        super.getFeatureSimpleExtension().add(featureSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.setFeatureObjectExtension(featureObjectExtension);
    }

    @Obvious
    @Override
    public Placemark addToFeatureObjectExtension(final AbstractObject featureObjectExtension) {
        super.getFeatureObjectExtension().add(featureObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param geometry
     *     required parameter
     */
    public Placemark withGeometry(final Geometry geometry) {
        this.setGeometry(geometry);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param placemarkSimpleExtension
     *     required parameter
     */
    public Placemark withPlacemarkSimpleExtension(final List<Object> placemarkSimpleExtension) {
        this.setPlacemarkSimpleExtension(placemarkSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param placemarkObjectExtension
     *     required parameter
     */
    public Placemark withPlacemarkObjectExtension(final List<AbstractObject> placemarkObjectExtension) {
        this.setPlacemarkObjectExtension(placemarkObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Placemark withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Placemark withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Placemark withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Placemark withName(final String name) {
        super.withName(name);
        return this;
    }

    @Obvious
    @Override
    public Placemark withVisibility(final Boolean visibility) {
        super.withVisibility(visibility);
        return this;
    }

    @Obvious
    @Override
    public Placemark withOpen(final Boolean open) {
        super.withOpen(open);
        return this;
    }

    @Obvious
    @Override
    public Placemark withAtomAuthor(final Author atomAuthor) {
        super.withAtomAuthor(atomAuthor);
        return this;
    }

    @Obvious
    @Override
    public Placemark withAtomLink(final Link atomLink) {
        super.withAtomLink(atomLink);
        return this;
    }

    @Obvious
    @Override
    public Placemark withAddress(final String address) {
        super.withAddress(address);
        return this;
    }

    @Obvious
    @Override
    public Placemark withXalAddressDetails(final AddressDetails xalAddressDetails) {
        super.withXalAddressDetails(xalAddressDetails);
        return this;
    }

    @Obvious
    @Override
    public Placemark withPhoneNumber(final String phoneNumber) {
        super.withPhoneNumber(phoneNumber);
        return this;
    }

    @Obvious
    @Override
    public Placemark withSnippet(final Snippet snippet) {
        super.withSnippet(snippet);
        return this;
    }

    @Obvious
    @Override
    public Placemark withSnippetd(final String snippetd) {
        super.withSnippetd(snippetd);
        return this;
    }

    @Obvious
    @Override
    public Placemark withDescription(final String description) {
        super.withDescription(description);
        return this;
    }

    @Obvious
    @Override
    public Placemark withAbstractView(final AbstractView abstractView) {
        super.withAbstractView(abstractView);
        return this;
    }

    @Obvious
    @Override
    public Placemark withTimePrimitive(final TimePrimitive timePrimitive) {
        super.withTimePrimitive(timePrimitive);
        return this;
    }

    @Obvious
    @Override
    public Placemark withStyleUrl(final String styleUrl) {
        super.withStyleUrl(styleUrl);
        return this;
    }

    @Obvious
    @Override
    public Placemark withStyleSelector(final List<StyleSelector> styleSelector) {
        super.withStyleSelector(styleSelector);
        return this;
    }

    @Obvious
    @Override
    public Placemark withRegion(final Region region) {
        super.withRegion(region);
        return this;
    }

    @Obvious
    @Override
    public Placemark withMetadata(final Metadata metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Obvious
    @Override
    public Placemark withExtendedData(final ExtendedData extendedData) {
        super.withExtendedData(extendedData);
        return this;
    }

    @Obvious
    @Override
    public Placemark withFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.withFeatureSimpleExtension(featureSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Placemark withFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.withFeatureObjectExtension(featureObjectExtension);
        return this;
    }

    @Override
    public Placemark clone() {
        Placemark copy;
        copy = ((Placemark) super.clone());
        copy.geometry = ((geometry == null)?null:((Geometry ) geometry.clone()));
        copy.placemarkSimpleExtension = new ArrayList<Object>((getPlacemarkSimpleExtension().size()));
        for (Object iter: placemarkSimpleExtension) {
            copy.placemarkSimpleExtension.add(iter);
        }
        copy.placemarkObjectExtension = new ArrayList<AbstractObject>((getPlacemarkObjectExtension().size()));
        for (AbstractObject iter: placemarkObjectExtension) {
            copy.placemarkObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
