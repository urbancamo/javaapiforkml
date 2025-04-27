
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasType", propOrder = {
    "targetHref",
    "sourceHref",
    "aliasSimpleExtension",
    "aliasObjectExtension"
})
@XmlRootElement(name = "Alias", namespace = "http://www.opengis.net/kml/2.2")
public class Alias
    extends AbstractObject
    implements Cloneable
{

    /**
     * targetHref (required)
     * <p>
     * A URL that specifies the .kml or .kmz file whose data (within Google Earth) is to 
     * be modified by an Update element. This KML file must already have been loaded 
     * via a NetworkLink. In that file, the element to be modified must already have
     * an explicit id attribute defined for it. 
     * </p>
     * <p>
     * Specifies the texture file to be fetched by Google Earth. This reference can be 
     * a relative reference to an image file within the .kmz archive, or it can be an absolute 
     * reference to the file (for example, a URL). 
     * </p>
     * 
     * 
     * 
     */
    @XmlSchemaType(name = "anyURI")
    protected String targetHref;
    /**
     * sourceHref
     * <p>
     * targetHref Specifies the texture file to be fetched by Google Earth. This reference 
     * can be a relative reference to an image file within the .kmz archive, or it can 
     * be an absolute reference to the file (for example, a URL). sourceHref Is the path 
     * specified for the texture file in the Collada .dae file. 
     * </p>
     * <p>
     * In Google Earth, if this mapping is not supplied, the following rules are used to 
     * locate the textures referenced in the Collada (.dae) file: No path: If the texture 
     * name does not include a path, Google Earth looks for the texture in the same directory 
     * as the .dae file that references it. Relative path: If the texture name includes 
     * a relative path (for example, ../images/mytexture.jpg), Google Earth interprets 
     * the path as being relative to the .dae file that references it. Absolute path: If 
     * the texture name is an absolute path (c:\mytexture.jpg) or a network path (for example, 
     * http://myserver.com/mytexture.jpg), Google Earth looks for the file in the specified 
     * location, regardless of where the .dae file is located. 
     * </p>
     * <p>
     * Is the path specified for the texture file in the Collada .dae file. 
     * </p>
     * <p>
     * Is the path specified for the texture file in the Collada .dae file. 
     * </p>
     * 
     * 
     * 
     */
    @XmlSchemaType(name = "anyURI")
    protected String sourceHref;
    @XmlElement(name = "AliasSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> aliasSimpleExtension;
    /**
     * Object
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
    @XmlElement(name = "AliasObjectExtensionGroup")
    protected List<AbstractObject> aliasObjectExtension;

    public Alias() {
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
    public String getTargetHref() {
        return targetHref;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setTargetHref(String value) {
        this.targetHref = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getSourceHref() {
        return sourceHref;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setSourceHref(String value) {
        this.sourceHref = value;
    }

    /**
     *
     * 
     */
    public List<Object> getAliasSimpleExtension() {
        if (aliasSimpleExtension == null) {
            aliasSimpleExtension = new ArrayList<Object>();
        }
        return this.aliasSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getAliasObjectExtension() {
        if (aliasObjectExtension == null) {
            aliasObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.aliasObjectExtension;
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

        Alias alias = (Alias) object;
        return Objects.equals(targetHref, alias.targetHref)
                && Objects.equals(sourceHref, alias.sourceHref)
                && Objects.equals(aliasSimpleExtension, alias.aliasSimpleExtension)
                && Objects.equals(aliasObjectExtension, alias.aliasObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(targetHref);
        result = 31 * result + Objects.hashCode(sourceHref);
        result = 31 * result + Objects.hashCode(aliasSimpleExtension);
        result = 31 * result + Objects.hashCode(aliasObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param aliasSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setAliasSimpleExtension(final List<Object> aliasSimpleExtension) {
        this.aliasSimpleExtension = aliasSimpleExtension;
    }

    /**
     * add a value to the aliasSimpleExtension property collection
     * 
     * @param aliasSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Alias addToAliasSimpleExtension(final Object aliasSimpleExtension) {
        this.getAliasSimpleExtension().add(aliasSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param aliasObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setAliasObjectExtension(final List<AbstractObject> aliasObjectExtension) {
        this.aliasObjectExtension = aliasObjectExtension;
    }

    /**
     * add a value to the aliasObjectExtension property collection
     * 
     * @param aliasObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Alias addToAliasObjectExtension(final AbstractObject aliasObjectExtension) {
        this.getAliasObjectExtension().add(aliasObjectExtension);
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
    public Alias addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param targetHref
     *     required parameter
     * @return
     *     Alias
     */
    public Alias withTargetHref(final String targetHref) {
        this.setTargetHref(targetHref);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param sourceHref
     *     required parameter
     * @return
     *     Alias
     */
    public Alias withSourceHref(final String sourceHref) {
        this.setSourceHref(sourceHref);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param aliasSimpleExtension
     *     required parameter
     * @return
     *     Alias
     */
    public Alias withAliasSimpleExtension(final List<Object> aliasSimpleExtension) {
        this.setAliasSimpleExtension(aliasSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param aliasObjectExtension
     *     required parameter
     * @return
     *     Alias
     */
    public Alias withAliasObjectExtension(final List<AbstractObject> aliasObjectExtension) {
        this.setAliasObjectExtension(aliasObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Alias withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Alias withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Alias withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Alias clone() {
        Alias copy;
        copy = ((Alias) super.clone());
        copy.aliasSimpleExtension = new ArrayList<Object>((getAliasSimpleExtension().size()));
        for (Object iter: aliasSimpleExtension) {
            copy.aliasSimpleExtension.add(iter);
        }
        copy.aliasObjectExtension = new ArrayList<AbstractObject>((getAliasObjectExtension().size()));
        for (AbstractObject iter: aliasObjectExtension) {
            copy.aliasObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
