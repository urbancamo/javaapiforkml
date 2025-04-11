
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairType", propOrder = {
    "key",
    "styleUrl",
    "styleSelector",
    "pairSimpleExtension",
    "pairObjectExtension"
})
@XmlRootElement(name = "Pair", namespace = "http://www.opengis.net/kml/2.2")
public class Pair
    extends AbstractObject
    implements Cloneable
{

    /**
     * StyleState
     * <p>
     * normal, highlight 
     * </p>
     * 
     * See Also: 
     * See {@code <StyleMap>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "normal")
    protected StyleState key;
    /**
     * {@code <styleurl>}
     * <p>
     * URL of a {@code <Style>} or {@code <StyleMap>} defined in a Document. If the style is in the same
     * file, use a # reference. If the style is defined in an external file, use a full 
     * URL along with # referencing. Examples are {@code <styleUrl>#myIconStyleID</styleUrl> <styleUrl>http://someserver.com/somestylefile.xml#restaurant</styleUrl>
     * <styleUrl>eateries.kml#my-lunch-spot</styleUrl> }
     * </p>
     * 
     * 
     * 
     */
    @XmlSchemaType(name = "anyURI")
    protected String styleUrl;
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
    @XmlElementRef(name = "AbstractStyleSelectorGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected StyleSelector styleSelector;
    @XmlElement(name = "PairSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> pairSimpleExtension;
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
    @XmlElement(name = "PairObjectExtensionGroup")
    protected List<AbstractObject> pairObjectExtension;

    public Pair() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link StyleState}
     *     
     */
    public StyleState getKey() {
        return key;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link StyleState}
     *     
     */
    public void setKey(StyleState value) {
        this.key = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getStyleUrl() {
        return styleUrl;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setStyleUrl(String value) {
        this.styleUrl = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@code <}{@link Style}{@code >}
     *     {@code <}{@link StyleSelector}{@code >}
     *     {@code <}{@link StyleMap}{@code >}
     *     
     */
    public StyleSelector getStyleSelector() {
        return styleSelector;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link Style}{@code >}
     *     {@code <}{@link StyleSelector}{@code >}
     *     {@code <}{@link StyleMap}{@code >}
     *     
     */
    public void setStyleSelector(StyleSelector value) {
        this.styleSelector = ((StyleSelector ) value);
    }

    /**
     *
     * 
     */
    public List<Object> getPairSimpleExtension() {
        if (pairSimpleExtension == null) {
            pairSimpleExtension = new ArrayList<Object>();
        }
        return this.pairSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getPairObjectExtension() {
        if (pairObjectExtension == null) {
            pairObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.pairObjectExtension;
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

        Pair pair = (Pair) object;
        return key == pair.key
                && Objects.equals(styleUrl, pair.styleUrl)
                && Objects.equals(styleSelector, pair.styleSelector)
                && Objects.equals(pairSimpleExtension, pair.pairSimpleExtension)
                && Objects.equals(pairObjectExtension, pair.pairObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(key);
        result = 31 * result + Objects.hashCode(styleUrl);
        result = 31 * result + Objects.hashCode(styleSelector);
        result = 31 * result + Objects.hashCode(pairSimpleExtension);
        result = 31 * result + Objects.hashCode(pairObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Style} and set it to styleSelector.
     * 
     * This method is a short version for:
     * {@code
     * Style style = new Style();
     * this.setStyleSelector(style); }
     * 
     * 
     */
    public Style createAndSetStyle() {
        Style newValue = new Style();
        this.setStyleSelector(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link StyleMap} and set it to styleSelector.
     * 
     * This method is a short version for:
     * {@code
     * StyleMap styleMap = new StyleMap();
     * this.setStyleSelector(styleMap); }
     * 
     * 
     */
    public StyleMap createAndSetStyleMap() {
        StyleMap newValue = new StyleMap();
        this.setStyleSelector(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param pairSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setPairSimpleExtension(final List<Object> pairSimpleExtension) {
        this.pairSimpleExtension = pairSimpleExtension;
    }

    /**
     * add a value to the pairSimpleExtension property collection
     * 
     * @param pairSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Pair addToPairSimpleExtension(final Object pairSimpleExtension) {
        this.getPairSimpleExtension().add(pairSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param pairObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setPairObjectExtension(final List<AbstractObject> pairObjectExtension) {
        this.pairObjectExtension = pairObjectExtension;
    }

    /**
     * add a value to the pairObjectExtension property collection
     * 
     * @param pairObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Pair addToPairObjectExtension(final AbstractObject pairObjectExtension) {
        this.getPairObjectExtension().add(pairObjectExtension);
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
    public Pair addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param key
     *     required parameter
     */
    public Pair withKey(final StyleState key) {
        this.setKey(key);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleUrl
     *     required parameter
     */
    public Pair withStyleUrl(final String styleUrl) {
        this.setStyleUrl(styleUrl);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleSelector
     *     required parameter
     */
    public Pair withStyleSelector(final StyleSelector styleSelector) {
        this.setStyleSelector(styleSelector);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param pairSimpleExtension
     *     required parameter
     */
    public Pair withPairSimpleExtension(final List<Object> pairSimpleExtension) {
        this.setPairSimpleExtension(pairSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param pairObjectExtension
     *     required parameter
     */
    public Pair withPairObjectExtension(final List<AbstractObject> pairObjectExtension) {
        this.setPairObjectExtension(pairObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Pair withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Pair withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Pair withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Pair clone() {
        Pair copy;
        copy = ((Pair) super.clone());
        copy.styleSelector = ((styleSelector == null)?null:((StyleSelector ) styleSelector.clone()));
        copy.pairSimpleExtension = new ArrayList<Object>((getPairSimpleExtension().size()));
        for (Object iter: pairSimpleExtension) {
            copy.pairSimpleExtension.add(iter);
        }
        copy.pairObjectExtension = new ArrayList<AbstractObject>((getPairObjectExtension().size()));
        for (AbstractObject iter: pairObjectExtension) {
            copy.pairObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
