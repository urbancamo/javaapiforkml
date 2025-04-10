
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Update
 * <p>
 * Specifies an addition, change, or deletion to KML data that has already been loaded 
 * using the specified URL. The targetHref specifies the .kml or .kmz file whose 
 * data (within Google Earth) is to be modified. Update is always contained in a 
 * NetworkLinkControl. Furthermore, the file containing the NetworkLinkControl must 
 * have been loaded by a NetworkLink. See the "Topics in KML" page on Updates for a 
 * detailed example of how Update works. 
 * </p>
 * <p>
 * With Update, you can specify any number of Change, Create, and Delete tags for 
 * a .kml file or .kmz archive that has previously been loaded with a network link. 
 * See Update. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Update&gt;
 *   </strong>&lt;targetHref&gt;...&lt;targetHref&gt;    &lt;!-- URL --&gt;
 *   &lt;Change&gt;...&lt;/Change&gt;
 *   &lt;Create&gt;...&lt;/Create&gt;
 *   &lt;Delete&gt;...&lt;/Delete&gt;
 * <strong>&lt;/Update&gt;</strong></pre>
 * 
 * Contained By: 
 *
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType", propOrder = {
    "targetHref",
    "createOrDeleteOrChange",
    "updateExtension"
})
@XmlRootElement(name = "Update", namespace = "http://www.opengis.net/kml/2.2")
public class Update implements Cloneable
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
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetHref;
    @XmlElements({
        @XmlElement(name = "UpdateOpExtensionGroup"),
        @XmlElement(name = "Change", type = Change.class),
        @XmlElement(name = "Delete", type = Delete.class),
        @XmlElement(name = "Create", type = Create.class)
    })
    protected List<Object> createOrDeleteOrChange;
    @XmlElement(name = "UpdateExtensionGroup")
    protected List<Object> updateExtension;

    /**
     * Value constructor with only mandatory fields
     * 
     * @param createOrDeleteOrChange
     *     required parameter
     * @param targetHref
     *     required parameter
     */
    public Update(final String targetHref, final List<Object> createOrDeleteOrChange) {
        super();
        this.targetHref = targetHref;
        this.createOrDeleteOrChange = createOrDeleteOrChange;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private Update() {
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
     */
    public List<Object> getCreateOrDeleteOrChange() {
        if (createOrDeleteOrChange == null) {
            createOrDeleteOrChange = new ArrayList<Object>();
        }
        return this.createOrDeleteOrChange;
    }

    /**
     *
     * 
     */
    public List<Object> getUpdateExtension() {
        if (updateExtension == null) {
            updateExtension = new ArrayList<Object>();
        }
        return this.updateExtension;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Update update = (Update) object;
        return Objects.equals(targetHref, update.targetHref)
                && Objects.equals(createOrDeleteOrChange, update.createOrDeleteOrChange)
                && Objects.equals(updateExtension, update.updateExtension);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(targetHref);
        result = 31 * result + Objects.hashCode(createOrDeleteOrChange);
        result = 31 * result + Objects.hashCode(updateExtension);
        return result;
    }

    /**
     *
     * 
     * @param createOrDeleteOrChange
     *     Objects of the following type are allowed in the list: {@link Object}{@link Change}{@link Delete}{@link Create}
     */
    public void setCreateOrDeleteOrChange(final List<Object> createOrDeleteOrChange) {
        this.createOrDeleteOrChange = createOrDeleteOrChange;
    }

    /**
     * add a value to the createOrDeleteOrChange property collection
     * 
     * @param createOrDeleteOrChange
     *     Objects of the following type are allowed in the list: {@link Object}{@link Change}{@link Delete}{@link Create}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Update addToCreateOrDeleteOrChange(final Object createOrDeleteOrChange) {
        this.getCreateOrDeleteOrChange().add(createOrDeleteOrChange);
        return this;
    }

    /**
     *
     * 
     * @param updateExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setUpdateExtension(final List<Object> updateExtension) {
        this.updateExtension = updateExtension;
    }

    /**
     * add a value to the updateExtension property collection
     * 
     * @param updateExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Update addToUpdateExtension(final Object updateExtension) {
        this.getUpdateExtension().add(updateExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param updateExtension
     *     required parameter
     */
    public Update withUpdateExtension(final List<Object> updateExtension) {
        this.setUpdateExtension(updateExtension);
        return this;
    }

    @Override
    public Update clone() {
        Update copy;
        try {
            copy = ((Update) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.createOrDeleteOrChange = new ArrayList<Object>((getCreateOrDeleteOrChange().size()));
        for (Object iter: createOrDeleteOrChange) {
            copy.createOrDeleteOrChange.add(iter);
        }
        copy.updateExtension = new ArrayList<Object>((getUpdateExtension().size()));
        for (Object iter: updateExtension) {
            copy.updateExtension.add(iter);
        }
        return copy;
    }

}
