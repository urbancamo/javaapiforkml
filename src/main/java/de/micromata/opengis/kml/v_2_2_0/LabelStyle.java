
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <LabelStyle>}
 * <p>
 * Note: The {@code <LabelColor>} tag is deprecated. Use {@code <LabelStyle>} instead.
 * </p>
 * <p>
 * Specifies how the {@code <name>} of a Feature is drawn in the 3D viewer. A custom color,
 * color mode, and scale for the label (name) can be specified. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;LabelStyle id="ID"&gt;</strong>
 *   &lt;!-- inherited from <em>ColorStyle</em> --&gt;
 *   &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
 *   &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum: normal <em>or</em> random --&gt;
 * 
 *   &lt;!-- specific to LabelStyle --&gt;
 *   &lt;scale&gt;1&lt;/scale&gt;                   &lt;!-- float --&gt;
 * <strong>&lt;/LabelStyle&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelStyleType", propOrder = {
    "scale",
    "labelStyleSimpleExtension",
    "labelStyleObjectExtension"
})
@XmlRootElement(name = "LabelStyle", namespace = "http://www.opengis.net/kml/2.2")
public class LabelStyle
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
     * Scales a model along the x, y, and z axes in the model's coordinate space. {@code <Scale>
     * <x>2.5</x> <y>2.5</y> <z>3.5</z> </Scale> }
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1.0")
    protected double scale;
    @XmlElement(name = "LabelStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> labelStyleSimpleExtension;
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
    @XmlElement(name = "LabelStyleObjectExtensionGroup")
    protected List<AbstractObject> labelStyleObjectExtension;

    public LabelStyle() {
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
     */
    public List<Object> getLabelStyleSimpleExtension() {
        if (labelStyleSimpleExtension == null) {
            labelStyleSimpleExtension = new ArrayList<Object>();
        }
        return this.labelStyleSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLabelStyleObjectExtension() {
        if (labelStyleObjectExtension == null) {
            labelStyleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.labelStyleObjectExtension;
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

        LabelStyle that = (LabelStyle) object;
        return Double.compare(scale, that.scale) == 0
                && Objects.equals(labelStyleSimpleExtension, that.labelStyleSimpleExtension)
                && Objects.equals(labelStyleObjectExtension, that.labelStyleObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(scale);
        result = 31 * result + Objects.hashCode(labelStyleSimpleExtension);
        result = 31 * result + Objects.hashCode(labelStyleObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param labelStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLabelStyleSimpleExtension(final List<Object> labelStyleSimpleExtension) {
        this.labelStyleSimpleExtension = labelStyleSimpleExtension;
    }

    /**
     * add a value to the labelStyleSimpleExtension property collection
     * 
     * @param labelStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LabelStyle addToLabelStyleSimpleExtension(final Object labelStyleSimpleExtension) {
        this.getLabelStyleSimpleExtension().add(labelStyleSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param labelStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLabelStyleObjectExtension(final List<AbstractObject> labelStyleObjectExtension) {
        this.labelStyleObjectExtension = labelStyleObjectExtension;
    }

    /**
     * add a value to the labelStyleObjectExtension property collection
     * 
     * @param labelStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public LabelStyle addToLabelStyleObjectExtension(final AbstractObject labelStyleObjectExtension) {
        this.getLabelStyleObjectExtension().add(labelStyleObjectExtension);
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
    public LabelStyle addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public LabelStyle addToSubStyleSimpleExtension(final Object subStyleSimpleExtension) {
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
    public LabelStyle addToSubStyleObjectExtension(final AbstractObject subStyleObjectExtension) {
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
    public LabelStyle addToColorStyleSimpleExtension(final Object colorStyleSimpleExtension) {
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
    public LabelStyle addToColorStyleObjectExtension(final AbstractObject colorStyleObjectExtension) {
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
    public LabelStyle withScale(final double scale) {
        this.setScale(scale);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param labelStyleSimpleExtension
     *     required parameter
     */
    public LabelStyle withLabelStyleSimpleExtension(final List<Object> labelStyleSimpleExtension) {
        this.setLabelStyleSimpleExtension(labelStyleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param labelStyleObjectExtension
     *     required parameter
     */
    public LabelStyle withLabelStyleObjectExtension(final List<AbstractObject> labelStyleObjectExtension) {
        this.setLabelStyleObjectExtension(labelStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        super.withSubStyleSimpleExtension(subStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        super.withSubStyleObjectExtension(subStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withColor(final String color) {
        super.withColor(color);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withColorMode(final ColorMode colorMode) {
        super.withColorMode(colorMode);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        super.withColorStyleSimpleExtension(colorStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public LabelStyle withColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        super.withColorStyleObjectExtension(colorStyleObjectExtension);
        return this;
    }

    @Override
    public LabelStyle clone() {
        LabelStyle copy;
        copy = ((LabelStyle) super.clone());
        copy.labelStyleSimpleExtension = new ArrayList<Object>((getLabelStyleSimpleExtension().size()));
        for (Object iter: labelStyleSimpleExtension) {
            copy.labelStyleSimpleExtension.add(iter);
        }
        copy.labelStyleObjectExtension = new ArrayList<AbstractObject>((getLabelStyleObjectExtension().size()));
        for (AbstractObject iter: labelStyleObjectExtension) {
            copy.labelStyleObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
