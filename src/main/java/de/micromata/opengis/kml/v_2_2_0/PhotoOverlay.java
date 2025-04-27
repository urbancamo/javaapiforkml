
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.atom.Link;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressDetails;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <PhotoOverlay>}
 * <p>
 * Because {@code <PhotoOverlay>} is derived from {@code <Feature>}, it can contain one of the two 
 * elements derived from {@code <AbstractView>}—either Camera or LookAt. The Camera (or
 * LookAt) specifies a viewpoint and a viewing direction (also referred to as a view 
 * vector). The PhotoOverlay is positioned in relation to the viewpoint. Specifically, 
 * the plane of a 2D rectangular image is orthogonal (at right angles to) the view 
 * vector. The normal of this plane—that is, its front, which is the part with the 
 * photo—is oriented toward the viewpoint.
 * </p>
 * <p>
 * For more information, see the "Topics in KML" page on PhotoOverlay. 
 * </p>
 * <p>
 * The {@code <PhotoOverlay>} element allows you to geographically locate a photograph on the 
 * Earth and to specify viewing parameters for this PhotoOverlay. The PhotoOverlay 
 * can be a simple 2D rectangle, a partial or full cylinder, or a sphere (for spherical 
 * panoramas). The overlay is placed at the specified location and oriented toward 
 * the viewpoint. 
 * </p>
 * <p>
 * The URL for the PhotoOverlay image is specified in the {@code <Icon>}tag, which is inherited 
 * from {@code <Overlay>}. The {@code <Icon>}tag must contain an {@code <href>}element that specifies the 
 * image file to use for the PhotoOverlay. In the case of a very large image, the {@code <href>}
 * is a special URL that indexes into a pyramid of images of varying resolutions (see 
 * ImagePyramid). 
 * </p>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoOverlayType", propOrder = {
    "rotation",
    "viewVolume",
    "imagePyramid",
    "point",
    "shape",
    "photoOverlaySimpleExtension",
    "photoOverlayObjectExtension"
})
@XmlRootElement(name = "PhotoOverlay", namespace = "http://www.opengis.net/kml/2.2")
public class PhotoOverlay
    extends Overlay
    implements Cloneable
{

    /**
     * rotation
     * <p>
     * Adjusts how the photo is placed inside the field of view. This element is useful 
     * if your photo has been rotated and deviates slightly from a desired horizontal view. 
     * </p>
     * <p>
     * Indicates the angle of rotation of the parent object. A value of 0 means no rotation. 
     * The value is an angle in degrees counterclockwise starting from north. Use ±180 
     * to indicate the rotation of the parent object from 0. The center of the rotation, 
     * if not (.5,.5), is specified in {@code <rotationXY>}. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double rotation;
    /**
     * {@code <viewvolume>}
     * <p>
     * Defines how much of the current scene is visible. Specifying the field of view is 
     * analogous to specifying the lens opening in a physical camera. A small field of 
     * view, like a telephoto lens, focuses on a small part of the scene. A large field 
     * of view, like a wide-angle lens, focuses on a large part of the scene. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "ViewVolume")
    protected ViewVolume viewVolume;
    /**
     * {@code <imagepyramid>}
     * <p>
     * For very large images, you'll need to construct an image pyramid, which is a hierarchical 
     * set of images, each of which is an increasingly lower resolution version of the 
     * original image. Each image in the pyramid is subdivided into tiles, so that only 
     * the portions in view need to be loaded. Google Earth calculates the current viewpoint 
     * and loads the tiles that are appropriate to the user's distance from the image. 
     * As the viewpoint moves closer to the PhotoOverlay, Google Earth loads higher resolution 
     * tiles. Since all the pixels in the original image can't be viewed on the screen 
     * at once, this preprocessing allows Google Earth to achieve maximum performance because 
     * it loads only the portions of the image that are in view, and only the pixel details 
     * that can be discerned by the user at the current viewpoint. 
     * </p>
     * <p>
     * When you specify an image pyramid, you also modify the {@code <href>}in the {@code <Icon>}element 
     * to include specifications for which tiles to load. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "ImagePyramid")
    protected ImagePyramid imagePyramid;
    /**
     *Point
     * <p>
     * A geographic location defined by longitude, latitude, and (optional) altitude. When 
     * a Point is contained by a Placemark, the point itself determines the position of 
     * the Placemark's name and icon. When a Point is extruded, it is connected to the 
     * ground with a line. This "tether" uses the current LineStyle. 
     * </p>
     * <p>
     * ThePoint element acts as aPoint inside a {@code <Placemark>} element. It draws an
     * icon to mark the position of the PhotoOverlay. The icon drawn is specified by the 
     * {@code <styleUrl>} and {@code <StyleSelector>} fields, just as it is for {@code <Placemark>}.
     * </p>
     * 
     * Syntax: 
     * <pre><strong>&lt;Point id="ID"&gt;</strong>
     *   &lt;!-- specific to Point --&gt;
     *   &lt;extrude&gt;0&lt;/extrude&gt;                        &lt;!-- boolean --&gt;
     *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;  
     * 	      &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
     *         &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt;
     *   &lt;coordinates&gt;<em>...</em>&lt;/coordinates&gt;<span class="style1"><em>              </em></span>&lt;!-- lon,lat[,alt] --&gt;
     * <strong>&lt;/Point&gt;</strong></pre>
     * 
     * Extends: 
     *
     * 
     * Contained By: 
     *
     *
     * 
     * 
     * 
     */
    @XmlElement(name = "Point")
    protected Point point;
    /**
     * Shape
     * <p>
     * rectangle, cylinder, sphere 
     * </p>
     * 
     * See Also: 
     * See {@code <PhotoOverlay>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "rectangle")
    protected Shape shape;
    @XmlElement(name = "PhotoOverlaySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> photoOverlaySimpleExtension;
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
    @XmlElement(name = "PhotoOverlayObjectExtensionGroup")
    protected List<AbstractObject> photoOverlayObjectExtension;

    public PhotoOverlay() {
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
    public double getRotation() {
        return rotation;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setRotation(double value) {
        this.rotation = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link ViewVolume}
     *     
     */
    public ViewVolume getViewVolume() {
        return viewVolume;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link ViewVolume}
     *     
     */
    public void setViewVolume(ViewVolume value) {
        this.viewVolume = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link ImagePyramid}
     *     
     */
    public ImagePyramid getImagePyramid() {
        return imagePyramid;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link ImagePyramid}
     *     
     */
    public void setImagePyramid(ImagePyramid value) {
        this.imagePyramid = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Point}
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Point}
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Shape}
     *     
     */
    public Shape getShape() {
        return shape;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Shape}
     *     
     */
    public void setShape(Shape value) {
        this.shape = value;
    }

    /**
     *
     * 
     */
    public List<Object> getPhotoOverlaySimpleExtension() {
        if (photoOverlaySimpleExtension == null) {
            photoOverlaySimpleExtension = new ArrayList<Object>();
        }
        return this.photoOverlaySimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getPhotoOverlayObjectExtension() {
        if (photoOverlayObjectExtension == null) {
            photoOverlayObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.photoOverlayObjectExtension;
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

        PhotoOverlay that = (PhotoOverlay) object;
        return shape == that.shape
                && Double.compare(rotation, that.rotation) == 0
                && Objects.equals(viewVolume, that.viewVolume)
                && Objects.equals(imagePyramid, that.imagePyramid)
                && Objects.equals(point, that.point)
                && Objects.equals(photoOverlaySimpleExtension, that.photoOverlaySimpleExtension)
                && Objects.equals(photoOverlayObjectExtension, that.photoOverlayObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(rotation);
        result = 31 * result + Objects.hashCode(viewVolume);
        result = 31 * result + Objects.hashCode(imagePyramid);
        result = 31 * result + Objects.hashCode(point);
        result = 31 * result + Objects.hashCode(shape);
        result = 31 * result + Objects.hashCode(photoOverlaySimpleExtension);
        result = 31 * result + Objects.hashCode(photoOverlayObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link ViewVolume} and set it to viewVolume.
     * 
     * This method is a short version for:
     * {@code
     * ViewVolume viewVolume = new ViewVolume();
     * this.setViewVolume(viewVolume); }
     * 
     * 
     */
    public ViewVolume createAndSetViewVolume() {
        ViewVolume newValue = new ViewVolume();
        this.setViewVolume(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ImagePyramid} and set it to imagePyramid.
     * 
     * This method is a short version for:
     * {@code
     * ImagePyramid imagePyramid = new ImagePyramid();
     * this.setImagePyramid(imagePyramid); }
     * 
     * 
     */
    public ImagePyramid createAndSetImagePyramid() {
        ImagePyramid newValue = new ImagePyramid();
        this.setImagePyramid(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Point} and set it to point.
     * 
     * This method is a short version for:
     * {@code
     * Point point = new Point();
     * this.setPoint(point); }
     * 
     * 
     */
    public Point createAndSetPoint() {
        Point newValue = new Point();
        this.setPoint(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param photoOverlaySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setPhotoOverlaySimpleExtension(final List<Object> photoOverlaySimpleExtension) {
        this.photoOverlaySimpleExtension = photoOverlaySimpleExtension;
    }

    /**
     * add a value to the photoOverlaySimpleExtension property collection
     * 
     * @param photoOverlaySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public PhotoOverlay addToPhotoOverlaySimpleExtension(final Object photoOverlaySimpleExtension) {
        this.getPhotoOverlaySimpleExtension().add(photoOverlaySimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param photoOverlayObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setPhotoOverlayObjectExtension(final List<AbstractObject> photoOverlayObjectExtension) {
        this.photoOverlayObjectExtension = photoOverlayObjectExtension;
    }

    /**
     * add a value to the photoOverlayObjectExtension property collection
     * 
     * @param photoOverlayObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public PhotoOverlay addToPhotoOverlayObjectExtension(final AbstractObject photoOverlayObjectExtension) {
        this.getPhotoOverlayObjectExtension().add(photoOverlayObjectExtension);
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
    public PhotoOverlay addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public PhotoOverlay addToStyleSelector(final StyleSelector styleSelector) {
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
    public PhotoOverlay addToFeatureSimpleExtension(final Object featureSimpleExtension) {
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
    public PhotoOverlay addToFeatureObjectExtension(final AbstractObject featureObjectExtension) {
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
    public PhotoOverlay addToOverlaySimpleExtension(final Object overlaySimpleExtension) {
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
    public PhotoOverlay addToOverlayObjectExtension(final AbstractObject overlayObjectExtension) {
        super.getOverlayObjectExtension().add(overlayObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param rotation
     *     required parameter
     */
    public PhotoOverlay withRotation(final double rotation) {
        this.setRotation(rotation);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewVolume
     *     required parameter
     */
    public PhotoOverlay withViewVolume(final ViewVolume viewVolume) {
        this.setViewVolume(viewVolume);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param imagePyramid
     *     required parameter
     */
    public PhotoOverlay withImagePyramid(final ImagePyramid imagePyramid) {
        this.setImagePyramid(imagePyramid);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param point
     *     required parameter
     */
    public PhotoOverlay withPoint(final Point point) {
        this.setPoint(point);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param shape
     *     required parameter
     */
    public PhotoOverlay withShape(final Shape shape) {
        this.setShape(shape);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param photoOverlaySimpleExtension
     *     required parameter
     */
    public PhotoOverlay withPhotoOverlaySimpleExtension(final List<Object> photoOverlaySimpleExtension) {
        this.setPhotoOverlaySimpleExtension(photoOverlaySimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param photoOverlayObjectExtension
     *     required parameter
     */
    public PhotoOverlay withPhotoOverlayObjectExtension(final List<AbstractObject> photoOverlayObjectExtension) {
        this.setPhotoOverlayObjectExtension(photoOverlayObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withName(final String name) {
        super.withName(name);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withVisibility(final Boolean visibility) {
        super.withVisibility(visibility);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withOpen(final Boolean open) {
        super.withOpen(open);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withAtomAuthor(final Author atomAuthor) {
        super.withAtomAuthor(atomAuthor);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withAtomLink(final Link atomLink) {
        super.withAtomLink(atomLink);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withAddress(final String address) {
        super.withAddress(address);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withXalAddressDetails(final AddressDetails xalAddressDetails) {
        super.withXalAddressDetails(xalAddressDetails);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withPhoneNumber(final String phoneNumber) {
        super.withPhoneNumber(phoneNumber);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withSnippet(final Snippet snippet) {
        super.withSnippet(snippet);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withSnippetd(final String snippetd) {
        super.withSnippetd(snippetd);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withDescription(final String description) {
        super.withDescription(description);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withAbstractView(final AbstractView abstractView) {
        super.withAbstractView(abstractView);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withTimePrimitive(final TimePrimitive timePrimitive) {
        super.withTimePrimitive(timePrimitive);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withStyleUrl(final String styleUrl) {
        super.withStyleUrl(styleUrl);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withStyleSelector(final List<StyleSelector> styleSelector) {
        super.withStyleSelector(styleSelector);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withRegion(final Region region) {
        super.withRegion(region);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withMetadata(final Metadata metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withExtendedData(final ExtendedData extendedData) {
        super.withExtendedData(extendedData);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.withFeatureSimpleExtension(featureSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.withFeatureObjectExtension(featureObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withColor(final String color) {
        super.withColor(color);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withDrawOrder(final int drawOrder) {
        super.withDrawOrder(drawOrder);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withIcon(final Icon icon) {
        super.withIcon(icon);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withOverlaySimpleExtension(final List<Object> overlaySimpleExtension) {
        super.withOverlaySimpleExtension(overlaySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public PhotoOverlay withOverlayObjectExtension(final List<AbstractObject> overlayObjectExtension) {
        super.withOverlayObjectExtension(overlayObjectExtension);
        return this;
    }

    @Override
    public PhotoOverlay clone() {
        PhotoOverlay copy;
        copy = ((PhotoOverlay) super.clone());
        copy.viewVolume = ((viewVolume == null)?null:((ViewVolume) viewVolume.clone()));
        copy.imagePyramid = ((imagePyramid == null)?null:((ImagePyramid) imagePyramid.clone()));
        copy.point = ((point == null)?null:((Point) point.clone()));
        copy.photoOverlaySimpleExtension = new ArrayList<Object>((getPhotoOverlaySimpleExtension().size()));
        for (Object iter: photoOverlaySimpleExtension) {
            copy.photoOverlaySimpleExtension.add(iter);
        }
        copy.photoOverlayObjectExtension = new ArrayList<AbstractObject>((getPhotoOverlayObjectExtension().size()));
        for (AbstractObject iter: photoOverlayObjectExtension) {
            copy.photoOverlayObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
