
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.gx.*;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;


/**
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObjectType", propOrder = {
    "objectSimpleExtension"
})
@XmlSeeAlso({
    Playlist.class,
    SimpleArrayData.class,
    ViewerOptions.class,
    TourPrimitive.class,
    LatLonQuad.class,
    Region.class,
    TimePrimitive.class,
    ItemIcon.class,
    Scale.class,
    Pair.class,
    ViewVolume.class,
    Alias.class,
    Location.class,
    Lod.class,
    ResourceMap.class,
    ImagePyramid.class,
    SchemaData.class,
    Orientation.class,
    Feature.class,
    StyleSelector.class,
    AbstractView.class,
    SubStyle.class,
    Data.class,
    Geometry.class,
    AbstractLatLonBox.class,
    BasicLink.class
})
public abstract class AbstractObject implements Cloneable
{

    @XmlElement(name = "ObjectSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> objectSimpleExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "targetId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String targetId;

    public AbstractObject() {
        super();
    }

    /**
     *
     */
    public List<Object> getObjectSimpleExtension() {
        if (objectSimpleExtension == null) {
            objectSimpleExtension = new ArrayList<Object>();
        }
        return this.objectSimpleExtension;
    }

    /**
     *
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     *
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setTargetId(String value) {
        this.targetId = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((objectSimpleExtension == null)? 0 :objectSimpleExtension.hashCode()));
        result = ((prime*result)+((id == null)? 0 :id.hashCode()));
        result = ((prime*result)+((targetId == null)? 0 :targetId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if ((obj instanceof AbstractObject) == false) {
            return false;
        }
        AbstractObject other = ((AbstractObject) obj);
        if (objectSimpleExtension == null) {
            if (other.objectSimpleExtension!= null) {
                return false;
            }
        } else {
            if (objectSimpleExtension.equals(other.objectSimpleExtension) == false) {
                return false;
            }
        }
        if (id == null) {
            if (other.id!= null) {
                return false;
            }
        } else {
            if (id.equals(other.id) == false) {
                return false;
            }
        }
        if (targetId == null) {
            if (other.targetId!= null) {
                return false;
            }
        } else {
            if (targetId.equals(other.targetId) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     */
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        this.objectSimpleExtension = objectSimpleExtension;
    }

    /**
     * add a value to the objectSimpleExtension property collection
     * 
     * @param objectSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public AbstractObject addToObjectSimpleExtension(final Object objectSimpleExtension) {
        this.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param objectSimpleExtension
     *     required parameter
     * @return
     *     AbstractObject
     */
    public AbstractObject withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        this.setObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param id
     *     required parameter
     * @return
     *     AbstractObject
     */
    public AbstractObject withId(final String id) {
        this.setId(id);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param targetId
     *     required parameter
     * @return
     *     AbstractObject
     */
    public AbstractObject withTargetId(final String targetId) {
        this.setTargetId(targetId);
        return this;
    }

    @Override
    public AbstractObject clone() {
        AbstractObject copy;
        try {
            copy = ((AbstractObject) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.objectSimpleExtension = new ArrayList<Object>((getObjectSimpleExtension().size()));
        for (Object iter: objectSimpleExtension) {
            copy.objectSimpleExtension.add(iter);
        }
        return copy;
    }

}
