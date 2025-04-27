
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <StyleMap>}
 * <p>
 * A {@code <StyleMap>} maps between two different Styles. Typically a {@code <StyleMap>} element is
 * used to provide separate normal and highlighted styles for a placemark, so that 
 * the highlighted version appears when the user mouses over the icon in Google Earth. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;StyleMap id="ID"&gt;</strong>
 *   &lt;!-- extends <em>StyleSelector</em> --&gt;
 *   &lt;!-- elements specific to StyleMap --&gt;
 *   &lt;Pair id="ID"&gt;
 *     &lt;key&gt;normal&lt;/key&gt;              &lt;!-- kml:styleStateEnum:  normal<em> or</em> highlight --&gt;
 *     &lt;styleUrl&gt;<em>...</em>&lt;/styleUrl&gt; or &lt;Style&gt;...&lt;/Style&gt;
 *   &lt;/Pair&gt;
 * <strong>&lt;/StyleMap&gt;</strong></pre>
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
@XmlType(name = "StyleMapType", propOrder = {
    "pair",
    "styleMapSimpleExtension",
    "styleMapObjectExtension"
})
@XmlRootElement(name = "StyleMap", namespace = "http://www.opengis.net/kml/2.2")
public class StyleMap
    extends StyleSelector
    implements Cloneable
{

    /**
     * {@code <Pair>} (required)
     * <p>
     * Defines a key/value pair that maps a mode (normal or highlight) to the predefined 
     * {@code <styleUrl>}. {@code <Pair>} contains two elements (both are required): {@code <key>}, which identifies
     * the key {@code <styleUrl>} or {@code <Style>}, which references the style. In {@code <styleUrl>}, for referenced
     * style elements that are local to the KML document, a simple # referencing is used. 
     * For styles that are contained in external files, use a full URL along with # referencing. 
     * For example: {@code <Pair> <key>normal</key> <styleUrl>http://myserver.com/populationProject.xml#example_style_off</styleUrl>
     * </Pair> }
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "Pair")
    protected List<Pair> pair;
    @XmlElement(name = "StyleMapSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> styleMapSimpleExtension;
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
    @XmlElement(name = "StyleMapObjectExtensionGroup")
    protected List<AbstractObject> styleMapObjectExtension;

    public StyleMap() {
        super();
    }

    /**
     *
     * 
     */
    public List<Pair> getPair() {
        if (pair == null) {
            pair = new ArrayList<Pair>();
        }
        return this.pair;
    }

    /**
     *
     * 
     */
    public List<Object> getStyleMapSimpleExtension() {
        if (styleMapSimpleExtension == null) {
            styleMapSimpleExtension = new ArrayList<Object>();
        }
        return this.styleMapSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getStyleMapObjectExtension() {
        if (styleMapObjectExtension == null) {
            styleMapObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.styleMapObjectExtension;
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

        StyleMap styleMap = (StyleMap) object;
        return Objects.equals(pair, styleMap.pair)
                && Objects.equals(styleMapSimpleExtension, styleMap.styleMapSimpleExtension)
                && Objects.equals(styleMapObjectExtension, styleMap.styleMapObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(pair);
        result = 31 * result + Objects.hashCode(styleMapSimpleExtension);
        result = 31 * result + Objects.hashCode(styleMapObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Pair} and adds it to pair.
     * This method is a short version for:
     * {@code
     * Pair pair = new Pair();
     * this.getPair().add(pair); }
     * 
     * 
     */
    public Pair createAndAddPair() {
        Pair newValue = new Pair();
        this.getPair().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param pair
     *     Objects of the following type are allowed in the list: {@link Pair}
     */
    public void setPair(final List<Pair> pair) {
        this.pair = pair;
    }

    /**
     * add a value to the pair property collection
     * 
     * @param pair
     *     Objects of the following type are allowed in the list: {@link Pair}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public StyleMap addToPair(final Pair pair) {
        this.getPair().add(pair);
        return this;
    }

    /**
     *
     * 
     * @param styleMapSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setStyleMapSimpleExtension(final List<Object> styleMapSimpleExtension) {
        this.styleMapSimpleExtension = styleMapSimpleExtension;
    }

    /**
     * add a value to the styleMapSimpleExtension property collection
     * 
     * @param styleMapSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public StyleMap addToStyleMapSimpleExtension(final Object styleMapSimpleExtension) {
        this.getStyleMapSimpleExtension().add(styleMapSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param styleMapObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setStyleMapObjectExtension(final List<AbstractObject> styleMapObjectExtension) {
        this.styleMapObjectExtension = styleMapObjectExtension;
    }

    /**
     * add a value to the styleMapObjectExtension property collection
     * 
     * @param styleMapObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public StyleMap addToStyleMapObjectExtension(final AbstractObject styleMapObjectExtension) {
        this.getStyleMapObjectExtension().add(styleMapObjectExtension);
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
    public StyleMap addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setStyleSelectorSimpleExtension(final List<Object> styleSelectorSimpleExtension) {
        super.setStyleSelectorSimpleExtension(styleSelectorSimpleExtension);
    }

    @Obvious
    @Override
    public StyleMap addToStyleSelectorSimpleExtension(final Object styleSelectorSimpleExtension) {
        super.getStyleSelectorSimpleExtension().add(styleSelectorSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setStyleSelectorObjectExtension(final List<AbstractObject> styleSelectorObjectExtension) {
        super.setStyleSelectorObjectExtension(styleSelectorObjectExtension);
    }

    @Obvious
    @Override
    public StyleMap addToStyleSelectorObjectExtension(final AbstractObject styleSelectorObjectExtension) {
        super.getStyleSelectorObjectExtension().add(styleSelectorObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param pair
     *     required parameter
     */
    public StyleMap withPair(final List<Pair> pair) {
        this.setPair(pair);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleMapSimpleExtension
     *     required parameter
     */
    public StyleMap withStyleMapSimpleExtension(final List<Object> styleMapSimpleExtension) {
        this.setStyleMapSimpleExtension(styleMapSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleMapObjectExtension
     *     required parameter
     */
    public StyleMap withStyleMapObjectExtension(final List<AbstractObject> styleMapObjectExtension) {
        this.setStyleMapObjectExtension(styleMapObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public StyleMap withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public StyleMap withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public StyleMap withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public StyleMap withStyleSelectorSimpleExtension(final List<Object> styleSelectorSimpleExtension) {
        super.withStyleSelectorSimpleExtension(styleSelectorSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public StyleMap withStyleSelectorObjectExtension(final List<AbstractObject> styleSelectorObjectExtension) {
        super.withStyleSelectorObjectExtension(styleSelectorObjectExtension);
        return this;
    }

    @Override
    public StyleMap clone() {
        StyleMap copy;
        copy = ((StyleMap) super.clone());
        copy.pair = new ArrayList<Pair>((getPair().size()));
        for (Pair iter: pair) {
            copy.pair.add(iter.clone());
        }
        copy.styleMapSimpleExtension = new ArrayList<Object>((getStyleMapSimpleExtension().size()));
        for (Object iter: styleMapSimpleExtension) {
            copy.styleMapSimpleExtension.add(iter);
        }
        copy.styleMapObjectExtension = new ArrayList<AbstractObject>((getStyleMapObjectExtension().size()));
        for (AbstractObject iter: styleMapObjectExtension) {
            copy.styleMapObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
