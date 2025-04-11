
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <itemicon>}
 * <p>
 * {@code <state>} Specifies the current state of the NetworkLink or Folder. Possible values 
 * are open, closed, error, fetching0, fetching1, and fetching2. These values can be 
 * combined by inserting a space between two values (no comma). {@code <href>}Specifies the 
 * URI of the image used in the List View for the Feature. 
 * </p>
 * <p>
 * Icon used in the List view that reflects the state of a Folder or Link fetch. Icons 
 * associated with the open and closed modes are used for Folders and Network Links. 
 * Icons associated with the error and fetching0, fetching1, and fetching2 modes are 
 * used for Network Links. The following screen capture illustrates the Google Earth 
 * icons for these states: 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemIconType", propOrder = {
    "state",
    "href",
    "itemIconSimpleExtension",
    "itemIconObjectExtension"
})
@XmlRootElement(name = "ItemIcon", namespace = "http://www.opengis.net/kml/2.2")
public class ItemIcon
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <state>}
     * <p>
     * Specifies the current state of the NetworkLink or Folder. Possible values are open, 
     * closed, error, fetching0, fetching1, and fetching2. These values can be combined 
     * by inserting a space between two values (no comma). 
     * </p>
     * 
     * 
     * 
     */
    @XmlList
    protected List<ItemIconState> state;
    /**
     * {@code <href>}
     * <p>
     * A URL (either an HTTP address or a local file specification). When the parent of 
     * {@code <Link>} is a NetworkLink, {@code <href>}is a KML file. When the parent of {@code <Link>} is a Model, 
     * {@code <href>}is a COLLADA file. When the parent of {@code <Icon>}(same fields as {@code <Link>}) is an 
     * Overlay, {@code <href>}is an image. Relative URLs can be used in this tag and are evaluated 
     * relative to the enclosing KML file. 
     * </p>
     * <p>
     * An HTTP address or a local file specification used to load an icon. 
     * </p>
     * <p>
     * Specifies the URI of the image used in the List View for the Feature. 
     * </p>
     * 
     * 
     * 
     */
    protected String href;
    @XmlElement(name = "ItemIconSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> itemIconSimpleExtension;
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
    @XmlElement(name = "ItemIconObjectExtensionGroup")
    protected List<AbstractObject> itemIconObjectExtension;

    public ItemIcon() {
        super();
    }

    /**
     *
     * 
     */
    public List<ItemIconState> getState() {
        if (state == null) {
            state = new ArrayList<ItemIconState>();
        }
        return this.state;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     *
     * 
     */
    public List<Object> getItemIconSimpleExtension() {
        if (itemIconSimpleExtension == null) {
            itemIconSimpleExtension = new ArrayList<Object>();
        }
        return this.itemIconSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getItemIconObjectExtension() {
        if (itemIconObjectExtension == null) {
            itemIconObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.itemIconObjectExtension;
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

        ItemIcon itemIcon = (ItemIcon) object;
        return Objects.equals(state, itemIcon.state)
                && Objects.equals(href, itemIcon.href)
                && Objects.equals(itemIconSimpleExtension, itemIcon.itemIconSimpleExtension)
                && Objects.equals(itemIconObjectExtension, itemIcon.itemIconObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(state);
        result = 31 * result + Objects.hashCode(href);
        result = 31 * result + Objects.hashCode(itemIconSimpleExtension);
        result = 31 * result + Objects.hashCode(itemIconObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param state
     *     Objects of the following type are allowed in the list: {@link ItemIconState}
     */
    public void setState(final List<ItemIconState> state) {
        this.state = state;
    }

    /**
     * add a value to the state property collection
     * 
     * @param state
     *     Objects of the following type are allowed in the list: {@link ItemIconState}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ItemIcon addToState(final ItemIconState state) {
        this.getState().add(state);
        return this;
    }

    /**
     *
     * 
     * @param itemIconSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setItemIconSimpleExtension(final List<Object> itemIconSimpleExtension) {
        this.itemIconSimpleExtension = itemIconSimpleExtension;
    }

    /**
     * add a value to the itemIconSimpleExtension property collection
     * 
     * @param itemIconSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ItemIcon addToItemIconSimpleExtension(final Object itemIconSimpleExtension) {
        this.getItemIconSimpleExtension().add(itemIconSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param itemIconObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setItemIconObjectExtension(final List<AbstractObject> itemIconObjectExtension) {
        this.itemIconObjectExtension = itemIconObjectExtension;
    }

    /**
     * add a value to the itemIconObjectExtension property collection
     * 
     * @param itemIconObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ItemIcon addToItemIconObjectExtension(final AbstractObject itemIconObjectExtension) {
        this.getItemIconObjectExtension().add(itemIconObjectExtension);
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
    public ItemIcon addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param state
     *     required parameter
     */
    public ItemIcon withState(final List<ItemIconState> state) {
        this.setState(state);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param href
     *     required parameter
     */
    public ItemIcon withHref(final String href) {
        this.setHref(href);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param itemIconSimpleExtension
     *     required parameter
     */
    public ItemIcon withItemIconSimpleExtension(final List<Object> itemIconSimpleExtension) {
        this.setItemIconSimpleExtension(itemIconSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param itemIconObjectExtension
     *     required parameter
     */
    public ItemIcon withItemIconObjectExtension(final List<AbstractObject> itemIconObjectExtension) {
        this.setItemIconObjectExtension(itemIconObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public ItemIcon withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public ItemIcon withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public ItemIcon withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public ItemIcon clone() {
        ItemIcon copy;
        copy = ((ItemIcon) super.clone());
        copy.state = new ArrayList<ItemIconState>((getState().size()));
        for (ItemIconState iter: state) {
            copy.state.add(iter);
        }
        copy.itemIconSimpleExtension = new ArrayList<Object>((getItemIconSimpleExtension().size()));
        for (Object iter: itemIconSimpleExtension) {
            copy.itemIconSimpleExtension.add(iter);
        }
        copy.itemIconObjectExtension = new ArrayList<AbstractObject>((getItemIconObjectExtension().size()));
        for (AbstractObject iter: itemIconObjectExtension) {
            copy.itemIconObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
