
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <IconStyle>}
 * <p>
 * Specifies how icons for point Placemarks are drawn, both in the Places panel and 
 * in the 3D viewer of Google Earth. The {@code <Icon>} element specifies the icon image. The
 * {@code <scale>} element specifies the x, y scaling of the icon. The color specified in the 
 * {@code <color>} element of {@code <IconStyle>} is blended with the color of the {@code <Icon>}.
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;IconStyle id="ID"&gt;</strong>
 *   &lt;!-- inherited from <em>ColorStyle</em> --&gt;
 *   &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
 *   &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum:normal <em>or</em> random --&gt;
 * 
 *   &lt;!-- specific to IconStyle --&gt;
 *   &lt;scale&gt;1&lt;/scale&gt;                   &lt;!-- float --&gt;
 *   &lt;heading&gt;0&lt;/heading&gt;               &lt;!-- float --&gt;
 *   &lt;Icon&gt;
 *     &lt;href&gt;...&lt;/href&gt;
 *   &lt;/Icon&gt; 
 *   &lt;hotSpot x="0.5"  y="0.5" 
 *     xunits="fraction" yunits="fraction"/&gt;    &lt;!-- kml:vec2 --&gt;                    
 * <strong>&lt;/IconStyle&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Contains: 
 *
 *
 * 
 * Contained By: 
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IconStyleType", propOrder = {
    "scale",
    "heading",
    "icon",
    "hotSpot",
    "iconStyleSimpleExtension",
    "iconStyleObjectExtension"
})
@XmlRootElement(name = "IconStyle", namespace = "http://www.opengis.net/kml/2.2")
public class IconStyle
    extends ColorStyle
    implements Cloneable
{

    /**
     * {@code <scale>}
     * <p>
     * Note: The {@code <geomScale>} tag has been deprecated. Use {@code <scale>} instead.
     * </p>
     * <p>
     * Resizes the icon. 
     * </p>
     * <p>
     * Scales a model along the x, y, and z axes in the model's coordinate space. {@code <scale>
     * <x>2.5</x> <y>2.5</y> <z>3.5</z> </Scale> }
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1.0")
    protected double scale;
    /**
     * {@code <heading>}
     * <p>
     * Direction (azimuth) of the camera, in degrees. Default=0 (true North). (See diagram.) 
     * Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Direction (that is, North, South, East, West), in degrees. Default=0 (North). (See 
     * diagram below.) Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Direction (that is, North, South, East, West), in degrees. Default=0 (North). (See 
     * diagram.) Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Rotation about the z axis (normal to the Earth's surface). A value of 0 (the default) 
     * equals North. A positive rotation is clockwise around the z axis and specified in 
     * degrees from 0 to 360. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double heading;
    /**
     * {@code <Icon>}
     * <p>
     * {@code <Icon><href>Sunset.jpg</href> </Icon> }
     * </p>
     * <p>
     * A custom Icon. In {@code <IconStyle>}, the only child element of {@code <Icon> is <href>: <href>: }
     * An HTTP address or a local file specification used to load an icon. 
     * </p>
     * <p>
     * Defines an image associated with an Icon style or overlay. {@code <Icon>}has the same child 
     * elements as {@code <Link>}. The required {@code <href>}child element defines the location of the 
     * image to be used as the overlay or as the icon for the placemark. This location 
     * can either be on a local file system or a remote web server. 
     * </p>
     * <p>
     * Defines the image associated with the Overlay. The {@code <href>}element defines the location 
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
    /**
     * {@code <hotspot x="0.5" y="0.5" xunits="fraction" yunits="fraction">}
     * <p>
     * Specifies the position within the Icon that is "anchored" to thePoint specified 
     * in the Placemark. The x and y values can be specified in three different ways: as 
     * pixels ("pixels"), as fractions of the icon ("fraction"), or as inset pixels ("insetPixels"), 
     * which is an offset in pixels from the upper right corner of the icon. The x and 
     * y positions can be specified in different ways—for example, x can be in pixels and 
     * y can be a fraction. The origin of the coordinate system is in the lower left corner 
     * of the icon. x - Either the number of pixels, a fractional component of the icon, 
     * or a pixel inset indicating the x component of a point on the icon. y - Either the 
     * number of pixels, a fractional component of the icon, or a pixel inset indicating 
     * the y component of a point on the icon. xunits - Units in which the x value is specified. 
     * A value of fraction indicates the x value is a fraction of the icon. A value of 
     * pixels indicates the x value in pixels. A value of insetPixels indicates the indent 
     * from the right edge of the icon. yunits - Units in which the y value is specified. 
     * A value of fraction indicates the y value is a fraction of the icon. A value of 
     * pixels indicates the y value in pixels. A value of insetPixels indicates the indent 
     * from the top edge of the icon. 
     * </p>
     * 
     * 
     * 
     */
    protected Vec2 hotSpot;
    @XmlElement(name = "IconStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> iconStyleSimpleExtension;
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
    @XmlElement(name = "IconStyleObjectExtensionGroup")
    protected List<AbstractObject> iconStyleObjectExtension;

    public IconStyle() {
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
    public double getScale() {
        return scale;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setScale(double value) {
        this.scale = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getHeading() {
        return heading;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setHeading(double value) {
        this.heading = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link BasicLink}
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
     *     {@link BasicLink}
     *     
     */
    public void setIcon(Icon value) {
        this.icon = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Vec2}
     *     
     */
    public Vec2 getHotSpot() {
        return hotSpot;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Vec2}
     *     
     */
    public void setHotSpot(Vec2 value) {
        this.hotSpot = value;
    }

    /**
     *
     * 
     */
    public List<Object> getIconStyleSimpleExtension() {
        if (iconStyleSimpleExtension == null) {
            iconStyleSimpleExtension = new ArrayList<Object>();
        }
        return this.iconStyleSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getIconStyleObjectExtension() {
        if (iconStyleObjectExtension == null) {
            iconStyleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.iconStyleObjectExtension;
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

        IconStyle iconStyle = (IconStyle) object;
        return Double.compare(scale, iconStyle.scale) == 0
                && Double.compare(heading, iconStyle.heading) == 0
                && Objects.equals(icon, iconStyle.icon)
                && Objects.equals(hotSpot, iconStyle.hotSpot)
                && Objects.equals(iconStyleSimpleExtension, iconStyle.iconStyleSimpleExtension)
                && Objects.equals(iconStyleObjectExtension, iconStyle.iconStyleObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(scale);
        result = 31 * result + Double.hashCode(heading);
        result = 31 * result + Objects.hashCode(icon);
        result = 31 * result + Objects.hashCode(hotSpot);
        result = 31 * result + Objects.hashCode(iconStyleSimpleExtension);
        result = 31 * result + Objects.hashCode(iconStyleObjectExtension);
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
     * Creates a new instance of {@link Vec2} and set it to hotSpot.
     * 
     * This method is a short version for:
     * {@code
     * Vec2 vec2 = new Vec2();
     * this.setHotSpot(vec2); }
     * 
     * 
     */
    public Vec2 createAndSetHotSpot() {
        Vec2 newValue = new Vec2();
        this.setHotSpot(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param iconStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setIconStyleSimpleExtension(final List<Object> iconStyleSimpleExtension) {
        this.iconStyleSimpleExtension = iconStyleSimpleExtension;
    }

    /**
     * add a value to the iconStyleSimpleExtension property collection
     * 
     * @param iconStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public IconStyle addToIconStyleSimpleExtension(final Object iconStyleSimpleExtension) {
        this.getIconStyleSimpleExtension().add(iconStyleSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param iconStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setIconStyleObjectExtension(final List<AbstractObject> iconStyleObjectExtension) {
        this.iconStyleObjectExtension = iconStyleObjectExtension;
    }

    /**
     * add a value to the iconStyleObjectExtension property collection
     * 
     * @param iconStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public IconStyle addToIconStyleObjectExtension(final AbstractObject iconStyleObjectExtension) {
        this.getIconStyleObjectExtension().add(iconStyleObjectExtension);
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
    public IconStyle addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        super.setSubStyleSimpleExtension(subStyleSimpleExtension);
    }

    @Obvious
    @Override
    public IconStyle addToSubStyleSimpleExtension(final Object subStyleSimpleExtension) {
        super.getSubStyleSimpleExtension().add(subStyleSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        super.setSubStyleObjectExtension(subStyleObjectExtension);
    }

    @Obvious
    @Override
    public IconStyle addToSubStyleObjectExtension(final AbstractObject subStyleObjectExtension) {
        super.getSubStyleObjectExtension().add(subStyleObjectExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        super.setColorStyleSimpleExtension(colorStyleSimpleExtension);
    }

    @Obvious
    @Override
    public IconStyle addToColorStyleSimpleExtension(final Object colorStyleSimpleExtension) {
        super.getColorStyleSimpleExtension().add(colorStyleSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        super.setColorStyleObjectExtension(colorStyleObjectExtension);
    }

    @Obvious
    @Override
    public IconStyle addToColorStyleObjectExtension(final AbstractObject colorStyleObjectExtension) {
        super.getColorStyleObjectExtension().add(colorStyleObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param scale
     *     required parameter
     */
    public IconStyle withScale(final double scale) {
        this.setScale(scale);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param heading
     *     required parameter
     */
    public IconStyle withHeading(final double heading) {
        this.setHeading(heading);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param icon
     *     required parameter
     */
    public IconStyle withIcon(final Icon icon) {
        this.setIcon(icon);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param hotSpot
     *     required parameter
     */
    public IconStyle withHotSpot(final Vec2 hotSpot) {
        this.setHotSpot(hotSpot);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param iconStyleSimpleExtension
     *     required parameter
     */
    public IconStyle withIconStyleSimpleExtension(final List<Object> iconStyleSimpleExtension) {
        this.setIconStyleSimpleExtension(iconStyleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param iconStyleObjectExtension
     *     required parameter
     */
    public IconStyle withIconStyleObjectExtension(final List<AbstractObject> iconStyleObjectExtension) {
        this.setIconStyleObjectExtension(iconStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        super.withSubStyleSimpleExtension(subStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        super.withSubStyleObjectExtension(subStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withColor(final String color) {
        super.withColor(color);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withColorMode(final ColorMode colorMode) {
        super.withColorMode(colorMode);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        super.withColorStyleSimpleExtension(colorStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public IconStyle withColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        super.withColorStyleObjectExtension(colorStyleObjectExtension);
        return this;
    }

    @Override
    public IconStyle clone() {
        IconStyle copy;
        copy = ((IconStyle) super.clone());
        copy.icon = ((icon == null)?null:((Icon) icon.clone()));
        copy.hotSpot = ((hotSpot == null)?null:((Vec2) hotSpot.clone()));
        copy.iconStyleSimpleExtension = new ArrayList<Object>((getIconStyleSimpleExtension().size()));
        for (Object iter: iconStyleSimpleExtension) {
            copy.iconStyleSimpleExtension.add(iter);
        }
        copy.iconStyleObjectExtension = new ArrayList<AbstractObject>((getIconStyleObjectExtension().size()));
        for (AbstractObject iter: iconStyleObjectExtension) {
            copy.iconStyleObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
