
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <StyleSelector>}
 * <p>
 * One or more Styles and StyleMaps can be defined to customize the appearance of any 
 * element derived from Feature or of the Geometry in a Placemark. (See {@code <BalloonStyle>},
 * {@code <ListStyle>}, {@code <StyleSelector>}, and the styles derived from {@code <ColorStyle>}.) A style 
 * defined within a Feature is called an "inline style" and applies only to the Feature 
 * that contains it. A style defined as the child of a {@code <Document>} is called a "shared 
 * style." A shared style must have an id defined for it. This id is referenced by 
 * one or more Features within the {@code <Document>}. In cases where a style element is defined 
 * both in a shared style and in an inline style for a Feature—that is, a Folder, GroundOverlay, 
 * NetworkLink, Placemark, or ScreenOverlay—the value for the Feature's inline style 
 * takes precedence over the value for the shared style. 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;!-- abstract element; do not create --&gt;
 * <strong>&lt;!-- <em>StyleSelector</em> id="ID" --&gt;               </strong>  &lt;!-- Style,StyleMap --&gt;<strong>
 * &lt;!-- /<em>StyleSelector</em> --&gt;</strong></pre>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractStyleSelectorType", propOrder = {
    "styleSelectorSimpleExtension",
    "styleSelectorObjectExtension"
})
@XmlSeeAlso({
    Style.class,
    StyleMap.class
})
public abstract class StyleSelector
    extends AbstractObject
    implements Cloneable
{

    @XmlElement(name = "AbstractStyleSelectorSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> styleSelectorSimpleExtension;
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
    @XmlElement(name = "AbstractStyleSelectorObjectExtensionGroup")
    protected List<AbstractObject> styleSelectorObjectExtension;

    public StyleSelector() {
        super();
    }

    /**
     *
     * 
     */
    public List<Object> getStyleSelectorSimpleExtension() {
        if (styleSelectorSimpleExtension == null) {
            styleSelectorSimpleExtension = new ArrayList<Object>();
        }
        return this.styleSelectorSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getStyleSelectorObjectExtension() {
        if (styleSelectorObjectExtension == null) {
            styleSelectorObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.styleSelectorObjectExtension;
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

        StyleSelector that = (StyleSelector) object;
        return Objects.equals(styleSelectorSimpleExtension, that.styleSelectorSimpleExtension)
                && Objects.equals(styleSelectorObjectExtension, that.styleSelectorObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(styleSelectorSimpleExtension);
        result = 31 * result + Objects.hashCode(styleSelectorObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param styleSelectorSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setStyleSelectorSimpleExtension(final List<Object> styleSelectorSimpleExtension) {
        this.styleSelectorSimpleExtension = styleSelectorSimpleExtension;
    }

    /**
     * add a value to the styleSelectorSimpleExtension property collection
     * 
     * @param styleSelectorSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public StyleSelector addToStyleSelectorSimpleExtension(final Object styleSelectorSimpleExtension) {
        this.getStyleSelectorSimpleExtension().add(styleSelectorSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param styleSelectorObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setStyleSelectorObjectExtension(final List<AbstractObject> styleSelectorObjectExtension) {
        this.styleSelectorObjectExtension = styleSelectorObjectExtension;
    }

    /**
     * add a value to the styleSelectorObjectExtension property collection
     * 
     * @param styleSelectorObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public StyleSelector addToStyleSelectorObjectExtension(final AbstractObject styleSelectorObjectExtension) {
        this.getStyleSelectorObjectExtension().add(styleSelectorObjectExtension);
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
    public StyleSelector addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleSelectorSimpleExtension
     *     required parameter
     */
    public StyleSelector withStyleSelectorSimpleExtension(final List<Object> styleSelectorSimpleExtension) {
        this.setStyleSelectorSimpleExtension(styleSelectorSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleSelectorObjectExtension
     *     required parameter
     */
    public StyleSelector withStyleSelectorObjectExtension(final List<AbstractObject> styleSelectorObjectExtension) {
        this.setStyleSelectorObjectExtension(styleSelectorObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public StyleSelector withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public StyleSelector withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public StyleSelector withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public StyleSelector clone() {
        StyleSelector copy;
        copy = ((StyleSelector) super.clone());
        copy.styleSelectorSimpleExtension = new ArrayList<Object>((getStyleSelectorSimpleExtension().size()));
        for (Object iter: styleSelectorSimpleExtension) {
            copy.styleSelectorSimpleExtension.add(iter);
        }
        copy.styleSelectorObjectExtension = new ArrayList<AbstractObject>((getStyleSelectorObjectExtension().size()));
        for (AbstractObject iter: styleSelectorObjectExtension) {
            copy.styleSelectorObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
