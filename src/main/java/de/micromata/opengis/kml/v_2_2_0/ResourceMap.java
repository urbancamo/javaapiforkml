
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <resourcemap>}
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceMapType", propOrder = {
    "alias",
    "resourceMapSimpleExtension",
    "resourceMapObjectExtension"
})
@XmlRootElement(name = "ResourceMap", namespace = "http://www.opengis.net/kml/2.2")
public class ResourceMap
    extends AbstractObject
    implements Cloneable
{

    /**
     * alias contains a mapping from a sourceHref to a targetHref:
     * <p>
     * targetHref Specifies the texture file to be fetched by Google Earth. This reference 
     * can be a relative reference to an image file within the .kmz archive, or it can 
     * be an absolute reference to the file (for example, a URL). sourceHref Is the path 
     * specified for the texture file in the Collada .dae file. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "Alias")
    protected List<Alias> alias;
    @XmlElement(name = "ResourceMapSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> resourceMapSimpleExtension;
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
    @XmlElement(name = "ResourceMapObjectExtensionGroup")
    protected List<AbstractObject> resourceMapObjectExtension;

    public ResourceMap() {
        super();
    }

    /**
     *
     * 
     */
    public List<Alias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<Alias>();
        }
        return this.alias;
    }

    /**
     *
     * 
     */
    public List<Object> getResourceMapSimpleExtension() {
        if (resourceMapSimpleExtension == null) {
            resourceMapSimpleExtension = new ArrayList<Object>();
        }
        return this.resourceMapSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getResourceMapObjectExtension() {
        if (resourceMapObjectExtension == null) {
            resourceMapObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.resourceMapObjectExtension;
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

        ResourceMap that = (ResourceMap) object;
        return Objects.equals(alias, that.alias)
                && Objects.equals(resourceMapSimpleExtension, that.resourceMapSimpleExtension)
                && Objects.equals(resourceMapObjectExtension, that.resourceMapObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(alias);
        result = 31 * result + Objects.hashCode(resourceMapSimpleExtension);
        result = 31 * result + Objects.hashCode(resourceMapObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Alias} and adds it to alias.
     * This method is a short version for:
     * {@code
     * Alias alias = new Alias();
     * this.getAlias().add(alias); }
     * 
     * 
     */
    public Alias createAndAddAlias() {
        Alias newValue = new Alias();
        this.getAlias().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param alias
     *     Objects of the following type are allowed in the list: {@link Alias}
     */
    public void setAlias(final List<Alias> alias) {
        this.alias = alias;
    }

    /**
     * add a value to the alias property collection
     * 
     * @param alias
     *     Objects of the following type are allowed in the list: {@link Alias}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ResourceMap addToAlias(final Alias alias) {
        this.getAlias().add(alias);
        return this;
    }

    /**
     *
     * 
     * @param resourceMapSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setResourceMapSimpleExtension(final List<Object> resourceMapSimpleExtension) {
        this.resourceMapSimpleExtension = resourceMapSimpleExtension;
    }

    /**
     * add a value to the resourceMapSimpleExtension property collection
     * 
     * @param resourceMapSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ResourceMap addToResourceMapSimpleExtension(final Object resourceMapSimpleExtension) {
        this.getResourceMapSimpleExtension().add(resourceMapSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param resourceMapObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setResourceMapObjectExtension(final List<AbstractObject> resourceMapObjectExtension) {
        this.resourceMapObjectExtension = resourceMapObjectExtension;
    }

    /**
     * add a value to the resourceMapObjectExtension property collection
     * 
     * @param resourceMapObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ResourceMap addToResourceMapObjectExtension(final AbstractObject resourceMapObjectExtension) {
        this.getResourceMapObjectExtension().add(resourceMapObjectExtension);
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
    public ResourceMap addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param alias
     *     required parameter
     */
    public ResourceMap withAlias(final List<Alias> alias) {
        this.setAlias(alias);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param resourceMapSimpleExtension
     *     required parameter
     */
    public ResourceMap withResourceMapSimpleExtension(final List<Object> resourceMapSimpleExtension) {
        this.setResourceMapSimpleExtension(resourceMapSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param resourceMapObjectExtension
     *     required parameter
     */
    public ResourceMap withResourceMapObjectExtension(final List<AbstractObject> resourceMapObjectExtension) {
        this.setResourceMapObjectExtension(resourceMapObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public ResourceMap withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public ResourceMap withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public ResourceMap withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public ResourceMap clone() {
        ResourceMap copy;
        copy = ((ResourceMap) super.clone());
        copy.alias = new ArrayList<Alias>((getAlias().size()));
        for (Alias iter: alias) {
            copy.alias.add(iter.clone());
        }
        copy.resourceMapSimpleExtension = new ArrayList<Object>((getResourceMapSimpleExtension().size()));
        for (Object iter: resourceMapSimpleExtension) {
            copy.resourceMapSimpleExtension.add(iter);
        }
        copy.resourceMapObjectExtension = new ArrayList<AbstractObject>((getResourceMapObjectExtension().size()));
        for (AbstractObject iter: resourceMapObjectExtension) {
            copy.resourceMapObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
