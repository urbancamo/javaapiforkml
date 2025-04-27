
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.atom.Link;
import de.micromata.opengis.kml.v_2_2_0.gx.LatLonQuad;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressDetails;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GroundOverlay
 * <p>
 * This element draws an image overlay draped onto the terrain. The {@code <href>}child of 
 * {@code <Icon>}specifies the image to be used as the overlay. This file can be either on
 * a local file system or on a web server. If this element is omitted or contains no 
 * {@code <href>}, a rectangle is drawn using the color and LatLonBox bounds defined by the
 * ground overlay. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;GroundOverlay id="ID"&gt;</strong>
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
 *   &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;</span>
 * 
 *   &lt;!-- inherited from <em>Overlay</em> element --&gt;
 *   &lt;color&gt;ffffffff&lt;/color&gt;                   &lt;!-- kml:color --&gt;
 *   &lt;drawOrder&gt;0&lt;/drawOrder&gt;                  &lt;!-- int --&gt;  
 *   &lt;Icon&gt;...&lt;/Icon&gt;
 * 
 *   &lt;!-- specific to GroundOverlay --&gt;
 *   &lt;altitude&gt;0&lt;/altitude&gt;                    &lt;!-- double --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;
 *      &lt;!-- kml:altitudeModeEnum: clampToGround or absolute --&gt; 
 * 	   &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor or relativeToSeaFloor --&gt;
 *   &lt;LatLonBox&gt;
 *     &lt;north&gt;...&lt;/north&gt;                      &lt;! kml:angle90 --&gt;
 *     &lt;south&gt;<em>...</em>&lt;/south&gt;                      &lt;! kml:angle90 --&gt;
 *     &lt;east&gt;<em>...</em>&lt;/east&gt;                        &lt;! kml:angle180 --&gt;
 *     &lt;west&gt;<em>...</em>&lt;/west&gt;                        &lt;! kml:angle180 --&gt;
 *     &lt;rotation&gt;0&lt;/rotation&gt;                  &lt;! kml:angle180 --&gt;
 *   &lt;/LatLonBox&gt;
 * <strong>&lt;/GroundOverlay&gt;</strong></pre>
 * 
 * Extends: 
 *
 *
 * 
 * Contained By: 
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundOverlayType", propOrder = {
    "altitude",
    "altitudeMode",
    "latLonBox",
    "groundOverlaySimpleExtension",
    "groundOverlayObjectExtension"
})
@XmlRootElement(name = "GroundOverlay", namespace = "http://www.opengis.net/kml/2.2")
public class GroundOverlay
    extends Overlay
    implements Cloneable
{

    /**
     * altitude
     * <p>
     * Distance from the earth's surface, in meters. Interpreted according to the LookAt's 
     * altitude mode. 
     * </p>
     * <p>
     * Distance of the camera from the earth's surface, in meters. Interpreted according 
     * to the Camera's altitudeMode or gx:altitudeMode. 
     * </p>
     * <p>
     * Specifies the distance above the earth's surface, in meters, and is interpreted 
     * according to the altitude mode. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double altitude;
    /**
     * AltitudeMode
     * <p>
     * clampToGround, relativeToGround, absolute 
     * </p>
     * 
     * See Also: 
     * See LookAt and {@code <Region>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "clampToGround")
    protected AltitudeMode altitudeMode;
    /**
     * latlongbox
     * <p>
     * Specifies where the top, bottom, right, and left sides of a bounding box for the 
     * ground overlay are aligned. north Specifies the latitude of the north edge of 
     * the bounding box, in decimal degrees from 0 to ±90. south Specifies the latitude 
     * of the south edge of the bounding box, in decimal degrees from 0 to ±90. east 
     * Specifies the longitude of the east edge of the bounding box, in decimal degrees 
     * from 0 to ±180. (For overlays that overlap the meridian of 180° longitude, values 
     * can extend beyond that range.) west Specifies the longitude of the west edge of 
     * the bounding box, in decimal degrees from 0 to ±180. (For overlays that overlap 
     * the meridian of 180° longitude, values can extend beyond that range.) rotation 
     * Specifies a rotation of the overlay about its center, in degrees. Values can be 
     * ±180. The default is 0 (north). Rotations are specified in a counterclockwise direction. 
     * latlongbox north 48.25475939255556 south 48.25207367852141 east -90.86591508839973
     * west -90.8714285289695 rotation 39.37878630116985
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "LatLonBox")
    protected LatLonBox latLonBox;
    @XmlElement(name = "GroundOverlaySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> groundOverlaySimpleExtension;
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
    @XmlElementRef(name = "GroundOverlayObjectExtensionGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<AbstractObject> groundOverlayObjectExtension;

    public GroundOverlay() {
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
    public double getAltitude() {
        return altitude;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setAltitude(double value) {
        this.altitude = value;
    }

    /**
     *
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
     * 
     * @return
     *     possible object is
     *     {@link LatLonBox}
     *     
     */
    public LatLonBox getLatLonBox() {
        return latLonBox;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonBox}
     *     
     */
    public void setLatLonBox(LatLonBox value) {
        this.latLonBox = value;
    }

    /**
     *
     * 
     */
    public List<Object> getGroundOverlaySimpleExtension() {
        if (groundOverlaySimpleExtension == null) {
            groundOverlaySimpleExtension = new ArrayList<Object>();
        }
        return this.groundOverlaySimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getGroundOverlayObjectExtension() {
        if (groundOverlayObjectExtension == null) {
            groundOverlayObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.groundOverlayObjectExtension;
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

        GroundOverlay that = (GroundOverlay) object;
        return altitudeMode == that.altitudeMode
                && Double.compare(altitude, that.altitude) == 0
                && Objects.equals(latLonBox, that.latLonBox)
                && Objects.equals(groundOverlaySimpleExtension, that.groundOverlaySimpleExtension)
                && Objects.equals(groundOverlayObjectExtension, that.groundOverlayObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(altitude);
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(latLonBox);
        result = 31 * result + Objects.hashCode(groundOverlaySimpleExtension);
        result = 31 * result + Objects.hashCode(groundOverlayObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link LatLonBox} and set it to latLonBox.
     * 
     * This method is a short version for:
     * {@code
     * LatLonBox latLonBox = new LatLonBox();
     * this.setLatLonBox(latLonBox); }
     * 
     * 
     */
    public LatLonBox createAndSetLatLonBox() {
        LatLonBox newValue = new LatLonBox();
        this.setLatLonBox(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param groundOverlaySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setGroundOverlaySimpleExtension(final List<Object> groundOverlaySimpleExtension) {
        this.groundOverlaySimpleExtension = groundOverlaySimpleExtension;
    }

    /**
     * add a value to the groundOverlaySimpleExtension property collection
     * 
     * @param groundOverlaySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public GroundOverlay addToGroundOverlaySimpleExtension(final Object groundOverlaySimpleExtension) {
        this.getGroundOverlaySimpleExtension().add(groundOverlaySimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param groundOverlayObjectExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link LatLonQuad}{@code >}{@code <}{@link AbstractObject}{@code >}
     */
    public void setGroundOverlayObjectExtension(final List<AbstractObject> groundOverlayObjectExtension) {
        this.groundOverlayObjectExtension = groundOverlayObjectExtension;
    }

    /**
     * add a value to the groundOverlayObjectExtension property collection
     * 
     * @param groundOverlayObjectExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link LatLonQuad}{@code >}{@code <}{@link AbstractObject}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public GroundOverlay addToGroundOverlayObjectExtension(final AbstractObject groundOverlayObjectExtension) {
        this.getGroundOverlayObjectExtension().add(groundOverlayObjectExtension);
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
    public GroundOverlay addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public GroundOverlay addToStyleSelector(final StyleSelector styleSelector) {
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
    public GroundOverlay addToFeatureSimpleExtension(final Object featureSimpleExtension) {
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
    public GroundOverlay addToFeatureObjectExtension(final AbstractObject featureObjectExtension) {
        super.getFeatureObjectExtension().add(featureObjectExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setOverlaySimpleExtension(final List<Object> overlaySimpleExtension) {
        super.setOverlaySimpleExtension(overlaySimpleExtension);
    }

    @Obvious
    @Override
    public GroundOverlay addToOverlaySimpleExtension(final Object overlaySimpleExtension) {
        super.getOverlaySimpleExtension().add(overlaySimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setOverlayObjectExtension(final List<AbstractObject> overlayObjectExtension) {
        super.setOverlayObjectExtension(overlayObjectExtension);
    }

    @Obvious
    @Override
    public GroundOverlay addToOverlayObjectExtension(final AbstractObject overlayObjectExtension) {
        super.getOverlayObjectExtension().add(overlayObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitude
     *     required parameter
     */
    public GroundOverlay withAltitude(final double altitude) {
        this.setAltitude(altitude);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public GroundOverlay withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param latLonBox
     *     required parameter
     */
    public GroundOverlay withLatLonBox(final LatLonBox latLonBox) {
        this.setLatLonBox(latLonBox);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param groundOverlaySimpleExtension
     *     required parameter
     */
    public GroundOverlay withGroundOverlaySimpleExtension(final List<Object> groundOverlaySimpleExtension) {
        this.setGroundOverlaySimpleExtension(groundOverlaySimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param groundOverlayObjectExtension
     *     required parameter
     */
    public GroundOverlay withGroundOverlayObjectExtension(final List<AbstractObject> groundOverlayObjectExtension) {
        this.setGroundOverlayObjectExtension(groundOverlayObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withName(final String name) {
        super.withName(name);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withVisibility(final Boolean visibility) {
        super.withVisibility(visibility);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withOpen(final Boolean open) {
        super.withOpen(open);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withAtomAuthor(final Author atomAuthor) {
        super.withAtomAuthor(atomAuthor);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withAtomLink(final Link atomLink) {
        super.withAtomLink(atomLink);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withAddress(final String address) {
        super.withAddress(address);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withXalAddressDetails(final AddressDetails xalAddressDetails) {
        super.withXalAddressDetails(xalAddressDetails);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withPhoneNumber(final String phoneNumber) {
        super.withPhoneNumber(phoneNumber);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withSnippet(final Snippet snippet) {
        super.withSnippet(snippet);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withSnippetd(final String snippetd) {
        super.withSnippetd(snippetd);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withDescription(final String description) {
        super.withDescription(description);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withAbstractView(final AbstractView abstractView) {
        super.withAbstractView(abstractView);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withTimePrimitive(final TimePrimitive timePrimitive) {
        super.withTimePrimitive(timePrimitive);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withStyleUrl(final String styleUrl) {
        super.withStyleUrl(styleUrl);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withStyleSelector(final List<StyleSelector> styleSelector) {
        super.withStyleSelector(styleSelector);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withRegion(final Region region) {
        super.withRegion(region);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withMetadata(final Metadata metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withExtendedData(final ExtendedData extendedData) {
        super.withExtendedData(extendedData);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.withFeatureSimpleExtension(featureSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.withFeatureObjectExtension(featureObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withColor(final String color) {
        super.withColor(color);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withDrawOrder(final int drawOrder) {
        super.withDrawOrder(drawOrder);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withIcon(final Icon icon) {
        super.withIcon(icon);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withOverlaySimpleExtension(final List<Object> overlaySimpleExtension) {
        super.withOverlaySimpleExtension(overlaySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public GroundOverlay withOverlayObjectExtension(final List<AbstractObject> overlayObjectExtension) {
        super.withOverlayObjectExtension(overlayObjectExtension);
        return this;
    }

    @Override
    public GroundOverlay clone() {
        GroundOverlay copy;
        copy = ((GroundOverlay) super.clone());
        copy.latLonBox = ((latLonBox == null)?null:((LatLonBox) latLonBox.clone()));
        copy.groundOverlaySimpleExtension = new ArrayList<Object>((getGroundOverlaySimpleExtension().size()));
        for (Object iter: groundOverlaySimpleExtension) {
            copy.groundOverlaySimpleExtension.add(iter);
        }
        copy.groundOverlayObjectExtension = new ArrayList<AbstractObject>((getGroundOverlayObjectExtension().size()));
        for (AbstractObject iter: groundOverlayObjectExtension) {
            copy.groundOverlayObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
