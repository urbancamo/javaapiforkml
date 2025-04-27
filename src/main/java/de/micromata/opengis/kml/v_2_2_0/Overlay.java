
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressDetails;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Overlay>}
 * <p>
 * This is an abstract element and cannot be used directly in a KML file. {@code <Overlay>} 
 * is the base type for image overlays drawn on the planet surface or on the screen. 
 * {@code <Icon>}specifies the image to use and can be configured to reload images based on 
 * a timer or by camera changes. This element also includes specifications for stacking 
 * order of multiple overlays and for adding color and transparency values to the base 
 * image. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;!-- abstract element; do not create --&gt;
 * <strong>&lt;!-- <em>Overlay</em> id="ID" --&gt;</strong>                    &lt;!-- GroundOverlay,ScreenOverlay --&gt;
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
 *   &lt;!-- specific to <em>Overlay</em> --&gt;
 *   &lt;color&gt;ffffffff&lt;/color&gt;                   &lt;!-- kml:color --&gt;
 *   &lt;drawOrder&gt;0&lt;/drawOrder&gt;                  &lt;!-- int --&gt;
 *   &lt;Icon&gt;
 *     &lt;href&gt;...&lt;/href&gt;
 *   &lt;/Icon&gt;
 * <strong>&lt;!-- /<em>Overlay --</em>&gt;</strong></pre>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractOverlayType", propOrder = {
    "color",
    "drawOrder",
    "icon",
    "overlaySimpleExtension",
    "overlayObjectExtension"
})
@XmlSeeAlso({
    ScreenOverlay.class,
    PhotoOverlay.class,
    GroundOverlay.class
})
public abstract class Overlay
    extends Feature
    implements Cloneable
{

    /**
     * {@code <color>}
     * <p>
     * Color and opacity (alpha) values are expressed in hexadecimal notation. The range 
     * of values for any one color is 0 to 255 (00 to ff). For alpha, 00 is fully transparent 
     * and ff is fully opaque. The order of expression is aabbggrr, where aa=alpha (00 
     * to ff); bb=blue (00 to ff); gg=green (00 to ff); rr=red (00 to ff). For example, 
     * if you want to apply a blue color with 50 percent opacity to an overlay, you would 
     * specify the following: {@code <color>7fff0000</color>}, where alpha=0x7f, blue=0xff, green=0x00, 
     * and red=0x00. 
     * </p>
     * <p>
     * Color values are expressed in hexadecimal notation, including opacity (alpha) values. 
     * The order of expression is alpha, blue, green, red (aabbggrr). The range of values 
     * for any one color is 0 to 255 (00 to ff). For opacity, 00 is fully transparent and 
     * ff is fully opaque. For example, if you want to apply a blue color with 50 percent 
     * opacity to an overlay, you would specify the following: {@code <color>7fff0000</color>} 
     * </p>
     * <p>
     * Note: The {@code <geomColor>} element has been deprecated. Use {@code <color>} instead.
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "ffffffff")
    
    protected String color;
    /**
     * {@code <draworder>}
     * <p>
     * This element defines the stacking order for the images in overlapping overlays. 
     * Overlays with higher {@code <drawOrder>} values are drawn on top of overlays with lower
     * {@code <drawOrder>} values.
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0")
    protected int drawOrder;
    /**
     * {@code <Icon>}
     * <p>
     * {@code <Icon><href>Sunset.jpg</href> </Icon> }
     * </p>
     * <p>
     * A custom Icon. In {@code <IconStyle>}, the only child element of {@code <Icon>} is {@code <href>: <href>: }
     * An HTTP address or a local file specification used to load an icon. 
     * </p>
     * <p>
     * Defines an image associated with an Icon style or overlay. {@code <Icon>} has the same child
     * elements as {@code <Link>}. The required {@code <href>}child element defines the location of the 
     * image to be used as the overlay or as the icon for the placemark. This location 
     * can either be on a local file system or a remote web server. 
     * </p>
     * <p>
     * Defines the image associated with the Overlay. The {@code <href>} element defines the location
     * of the image to be used as the Overlay. This location can be either on a local file 
     * system or on a web server. If this element is omitted or contains no {@code <href>}, a rectangle 
     * is drawn using the color and size defined by the ground or screen overlay. {@code <Icon>
     * <href>icon.jpg</href> </Icon> }
     * </p>
     * 
     * Syntax: 
     * <pre><strong>&lt;Icon id="ID"&gt;</strong>
     *   &lt;!-- specific to Icon --&gt;
     *   &lt;href&gt;<em>...</em>&lt;/href&gt;                      &lt;!-- anyURI --&gt;
     *   &lt;refreshMode&gt;onChange&lt;/refreshMode&gt;   
     *     &lt;!-- kml:refreshModeEnum: onChange, onInterval, <em>or</em> onExpire --&gt;   
     *   &lt;refreshInterval&gt;4&lt;/refreshInterval&gt;  &lt;!-- float --&gt;
     *   &lt;viewRefreshMode&gt;never&lt;/viewRefreshMode&gt; 
     *     &lt;!-- kml:viewRefreshModeEnum: never, onStop, onRequest, onRegion --&gt;
     *   &lt;viewRefreshTime&gt;4&lt;/viewRefreshTime&gt;  &lt;!-- float --&gt;
     *   &lt;viewBoundScale&gt;1&lt;/viewBoundScale&gt;    &lt;!-- float --&gt;
     *   &lt;viewFormat&gt;...&lt;/viewFormat&gt;          &lt;!-- string --&gt;
     *   &lt;httpQuery&gt;...&lt;/httpQuery&gt;            &lt;!-- string --&gt;
     *   <strong>&lt;/Icon&gt;</strong></pre>
     * 
     * Contained By: 
     *
     *
     *
     * 
     * 
     * 
     */
    @XmlElement(name = "Icon")
    protected Icon icon;
    @XmlElement(name = "AbstractOverlaySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> overlaySimpleExtension;
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
    @XmlElement(name = "AbstractOverlayObjectExtensionGroup")
    protected List<AbstractObject> overlayObjectExtension;

    public Overlay() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setColor(String value) {
        this.color =  value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Integer}
     *     
     */
    public int getDrawOrder() {
        return drawOrder;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Integer}
     *     
     */
    public void setDrawOrder(int value) {
        this.drawOrder = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link de.micromata.opengis.kml.v_2_2_0.Link}
     *     
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link de.micromata.opengis.kml.v_2_2_0.Link}
     *     
     */
    public void setIcon(Icon value) {
        this.icon = value;
    }

    /**
     *
     * 
     */
    public List<Object> getOverlaySimpleExtension() {
        if (overlaySimpleExtension == null) {
            overlaySimpleExtension = new ArrayList<Object>();
        }
        return this.overlaySimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getOverlayObjectExtension() {
        if (overlayObjectExtension == null) {
            overlayObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.overlayObjectExtension;
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

        Overlay overlay = (Overlay) object;
        return drawOrder == overlay.drawOrder
                && Objects.equals(color, overlay.color)
                && Objects.equals(icon, overlay.icon)
                && Objects.equals(overlaySimpleExtension, overlay.overlaySimpleExtension)
                && Objects.equals(overlayObjectExtension, overlay.overlayObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(color);
        result = 31 * result + drawOrder;
        result = 31 * result + Objects.hashCode(icon);
        result = 31 * result + Objects.hashCode(overlaySimpleExtension);
        result = 31 * result + Objects.hashCode(overlayObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Icon} and set it to icon.
     * 
     * This method is a short version for:
     * {@code
     * Icon icon = new Icon();
     * this.setIcon(icon); }
     * 
     * 
     */
    public Icon createAndSetIcon() {
        Icon newValue = new Icon();
        this.setIcon(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param overlaySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setOverlaySimpleExtension(final List<Object> overlaySimpleExtension) {
        this.overlaySimpleExtension = overlaySimpleExtension;
    }

    /**
     * add a value to the overlaySimpleExtension property collection
     * 
     * @param overlaySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Overlay addToOverlaySimpleExtension(final Object overlaySimpleExtension) {
        this.getOverlaySimpleExtension().add(overlaySimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param overlayObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setOverlayObjectExtension(final List<AbstractObject> overlayObjectExtension) {
        this.overlayObjectExtension = overlayObjectExtension;
    }

    /**
     * add a value to the overlayObjectExtension property collection
     * 
     * @param overlayObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Overlay addToOverlayObjectExtension(final AbstractObject overlayObjectExtension) {
        this.getOverlayObjectExtension().add(overlayObjectExtension);
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
    public Overlay addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public Overlay addToStyleSelector(final StyleSelector styleSelector) {
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
    public Overlay addToFeatureSimpleExtension(final Object featureSimpleExtension) {
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
    public Overlay addToFeatureObjectExtension(final AbstractObject featureObjectExtension) {
        super.getFeatureObjectExtension().add(featureObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param color
     *     required parameter
     */
    public Overlay withColor(final String color) {
        this.setColor(color);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param drawOrder
     *     required parameter
     */
    public Overlay withDrawOrder(final int drawOrder) {
        this.setDrawOrder(drawOrder);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param icon
     *     required parameter
     */
    public Overlay withIcon(final Icon icon) {
        this.setIcon(icon);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param overlaySimpleExtension
     *     required parameter
     */
    public Overlay withOverlaySimpleExtension(final List<Object> overlaySimpleExtension) {
        this.setOverlaySimpleExtension(overlaySimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param overlayObjectExtension
     *     required parameter
     */
    public Overlay withOverlayObjectExtension(final List<AbstractObject> overlayObjectExtension) {
        this.setOverlayObjectExtension(overlayObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Overlay withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Overlay withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Overlay withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Overlay withName(final String name) {
        super.withName(name);
        return this;
    }

    @Obvious
    @Override
    public Overlay withVisibility(final Boolean visibility) {
        super.withVisibility(visibility);
        return this;
    }

    @Obvious
    @Override
    public Overlay withOpen(final Boolean open) {
        super.withOpen(open);
        return this;
    }

    @Obvious
    @Override
    public Overlay withAtomAuthor(final Author atomAuthor) {
        super.withAtomAuthor(atomAuthor);
        return this;
    }

    @Obvious
    @Override
    public Overlay withAtomLink(final de.micromata.opengis.kml.v_2_2_0.atom.Link atomLink) {
        super.withAtomLink(atomLink);
        return this;
    }

    @Obvious
    @Override
    public Overlay withAddress(final String address) {
        super.withAddress(address);
        return this;
    }

    @Obvious
    @Override
    public Overlay withXalAddressDetails(final AddressDetails xalAddressDetails) {
        super.withXalAddressDetails(xalAddressDetails);
        return this;
    }

    @Obvious
    @Override
    public Overlay withPhoneNumber(final String phoneNumber) {
        super.withPhoneNumber(phoneNumber);
        return this;
    }

    @Obvious
    @Override
    public Overlay withSnippet(final Snippet snippet) {
        super.withSnippet(snippet);
        return this;
    }

    @Obvious
    @Override
    public Overlay withSnippetd(final String snippetd) {
        super.withSnippetd(snippetd);
        return this;
    }

    @Obvious
    @Override
    public Overlay withDescription(final String description) {
        super.withDescription(description);
        return this;
    }

    @Obvious
    @Override
    public Overlay withAbstractView(final AbstractView abstractView) {
        super.withAbstractView(abstractView);
        return this;
    }

    @Obvious
    @Override
    public Overlay withTimePrimitive(final TimePrimitive timePrimitive) {
        super.withTimePrimitive(timePrimitive);
        return this;
    }

    @Obvious
    @Override
    public Overlay withStyleUrl(final String styleUrl) {
        super.withStyleUrl(styleUrl);
        return this;
    }

    @Obvious
    @Override
    public Overlay withStyleSelector(final List<StyleSelector> styleSelector) {
        super.withStyleSelector(styleSelector);
        return this;
    }

    @Obvious
    @Override
    public Overlay withRegion(final Region region) {
        super.withRegion(region);
        return this;
    }

    @Obvious
    @Override
    public Overlay withMetadata(final Metadata metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Obvious
    @Override
    public Overlay withExtendedData(final ExtendedData extendedData) {
        super.withExtendedData(extendedData);
        return this;
    }

    @Obvious
    @Override
    public Overlay withFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.withFeatureSimpleExtension(featureSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Overlay withFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.withFeatureObjectExtension(featureObjectExtension);
        return this;
    }

    @Override
    public Overlay clone() {
        Overlay copy;
        copy = ((Overlay) super.clone());
        copy.icon = ((icon == null)?null:((Icon) icon.clone()));
        copy.overlaySimpleExtension = new ArrayList<Object>((getOverlaySimpleExtension().size()));
        for (Object iter: overlaySimpleExtension) {
            copy.overlaySimpleExtension.add(iter);
        }
        copy.overlayObjectExtension = new ArrayList<AbstractObject>((getOverlayObjectExtension().size()));
        for (AbstractObject iter: overlayObjectExtension) {
            copy.overlayObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
