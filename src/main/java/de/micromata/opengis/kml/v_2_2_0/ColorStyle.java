
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code {@code <ColorStyle>}}
 * <p>
 * This is an abstract element and cannot be used directly in a KML file. It provides 
 * elements for specifying the color and color mode of extended style types. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;!-- abstract element; do not create --&gt;
 * <strong>&lt;!<em>-- ColorStyle</em> id="ID" --&gt;</strong>          &lt;!-- IconStyle,LabelStyle,LineStyle,PolyStyle --&gt;
 *   &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
 *   &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum: normal <em>or</em> random --&gt;
 * <strong>&lt;!-- /<em>ColorStyle</em> --&gt;</strong></pre>
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
@XmlType(name = "AbstractColorStyleType", propOrder = {
    "color",
    "colorMode",
    "colorStyleSimpleExtension",
    "colorStyleObjectExtension"
})
@XmlSeeAlso({
    LabelStyle.class,
    LineStyle.class,
    PolyStyle.class,
    IconStyle.class
})
public abstract class ColorStyle
    extends SubStyle
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
     * ColorMode
     * <p>
     * normal, random 
     * </p>
     * 
     * See Also: 
     * See any element that extends {@code <ColorStyle>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "normal")
    protected ColorMode colorMode;
    @XmlElement(name = "AbstractColorStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> colorStyleSimpleExtension;
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
    @XmlElement(name = "AbstractColorStyleObjectExtensionGroup")
    protected List<AbstractObject> colorStyleObjectExtension;

    public ColorStyle() {
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
     *     {@link ColorMode}
     *     
     */
    public ColorMode getColorMode() {
        return colorMode;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link ColorMode}
     *     
     */
    public void setColorMode(ColorMode value) {
        this.colorMode = value;
    }

    /**
     *
     * 
     */
    public List<Object> getColorStyleSimpleExtension() {
        if (colorStyleSimpleExtension == null) {
            colorStyleSimpleExtension = new ArrayList<Object>();
        }
        return this.colorStyleSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getColorStyleObjectExtension() {
        if (colorStyleObjectExtension == null) {
            colorStyleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.colorStyleObjectExtension;
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

        ColorStyle that = (ColorStyle) object;
        return colorMode == that.colorMode
                && Objects.equals(color, that.color)
                && Objects.equals(colorStyleSimpleExtension, that.colorStyleSimpleExtension)
                && Objects.equals(colorStyleObjectExtension, that.colorStyleObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(color);
        result = 31 * result + Objects.hashCode(colorMode);
        result = 31 * result + Objects.hashCode(colorStyleSimpleExtension);
        result = 31 * result + Objects.hashCode(colorStyleObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param colorStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        this.colorStyleSimpleExtension = colorStyleSimpleExtension;
    }

    /**
     * add a value to the colorStyleSimpleExtension property collection
     * 
     * @param colorStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ColorStyle addToColorStyleSimpleExtension(final Object colorStyleSimpleExtension) {
        this.getColorStyleSimpleExtension().add(colorStyleSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param colorStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        this.colorStyleObjectExtension = colorStyleObjectExtension;
    }

    /**
     * add a value to the colorStyleObjectExtension property collection
     * 
     * @param colorStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ColorStyle addToColorStyleObjectExtension(final AbstractObject colorStyleObjectExtension) {
        this.getColorStyleObjectExtension().add(colorStyleObjectExtension);
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
    public ColorStyle addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public ColorStyle addToSubStyleSimpleExtension(final Object subStyleSimpleExtension) {
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
    public ColorStyle addToSubStyleObjectExtension(final AbstractObject subStyleObjectExtension) {
        super.getSubStyleObjectExtension().add(subStyleObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param color
     *     required parameter
     * @return
     *     ColorStyle
     */
    public ColorStyle withColor(final String color) {
        this.setColor(color);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param colorMode
     *     required parameter
     * @return
     *     ColorStyle
     */
    public ColorStyle withColorMode(final ColorMode colorMode) {
        this.setColorMode(colorMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param colorStyleSimpleExtension
     *     required parameter
     * @return
     *     ColorStyle
     */
    public ColorStyle withColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        this.setColorStyleSimpleExtension(colorStyleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param colorStyleObjectExtension
     *     required parameter
     * @return
     *     ColorStyle
     */
    public ColorStyle withColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        this.setColorStyleObjectExtension(colorStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public ColorStyle withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public ColorStyle withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public ColorStyle withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public ColorStyle withSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        super.withSubStyleSimpleExtension(subStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public ColorStyle withSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        super.withSubStyleObjectExtension(subStyleObjectExtension);
        return this;
    }

    @Override
    public ColorStyle clone() {
        ColorStyle copy;
        copy = ((ColorStyle) super.clone());
        copy.colorStyleSimpleExtension = new ArrayList<Object>((getColorStyleSimpleExtension().size()));
        for (Object iter: colorStyleSimpleExtension) {
            copy.colorStyleSimpleExtension.add(iter);
        }
        copy.colorStyleObjectExtension = new ArrayList<AbstractObject>((getColorStyleObjectExtension().size()));
        for (AbstractObject iter: colorStyleObjectExtension) {
            copy.colorStyleObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
