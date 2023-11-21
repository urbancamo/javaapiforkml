
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.gx.ViewerOptions;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractViewType", propOrder = {
    "abstractViewSimpleExtension",
    "abstractViewObjectExtension"
})
@XmlSeeAlso({
    LookAt.class,
    Camera.class
})
public abstract class AbstractView
    extends AbstractObject
    implements Cloneable
{

    @XmlElement(name = "AbstractViewSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> abstractViewSimpleExtension;
    @XmlElementRef(name = "AbstractViewObjectExtensionGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<AbstractObject> abstractViewObjectExtension;

    public AbstractView() {
        super();
    }

    /**
     * 
     */
    public List<Object> getAbstractViewSimpleExtension() {
        if (abstractViewSimpleExtension == null) {
            abstractViewSimpleExtension = new ArrayList<Object>();
        }
        return this.abstractViewSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getAbstractViewObjectExtension() {
        if (abstractViewObjectExtension == null) {
            abstractViewObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.abstractViewObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = ((prime*result)+((abstractViewSimpleExtension == null)? 0 :abstractViewSimpleExtension.hashCode()));
        result = ((prime*result)+((abstractViewObjectExtension == null)? 0 :abstractViewObjectExtension.hashCode()));
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
        if (super.equals(obj) == false) {
            return false;
        }
        if ((obj instanceof AbstractView) == false) {
            return false;
        }
        AbstractView other = ((AbstractView) obj);
        if (abstractViewSimpleExtension == null) {
            if (other.abstractViewSimpleExtension!= null) {
                return false;
            }
        } else {
            if (abstractViewSimpleExtension.equals(other.abstractViewSimpleExtension) == false) {
                return false;
            }
        }
        if (abstractViewObjectExtension == null) {
            if (other.abstractViewObjectExtension!= null) {
                return false;
            }
        } else {
            if (abstractViewObjectExtension.equals(other.abstractViewObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the value of the abstractViewSimpleExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withAbstractViewSimpleExtension} instead.
     * 
     * 
     * @param abstractViewSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setAbstractViewSimpleExtension(final List<Object> abstractViewSimpleExtension) {
        this.abstractViewSimpleExtension = abstractViewSimpleExtension;
    }

    /**
     * add a value to the abstractViewSimpleExtension property collection
     * 
     * @param abstractViewSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public AbstractView addToAbstractViewSimpleExtension(final Object abstractViewSimpleExtension) {
        this.getAbstractViewSimpleExtension().add(abstractViewSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the abstractViewObjectExtension property Objects of the following type(s) are allowed in the list {@code List<AbstractObject>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withAbstractViewObjectExtension} instead.
     * 
     * 
     * @param abstractViewObjectExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link TimeSpan}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeStamp}{@code >}{@code <}{@link ViewerOptions}{@code >}
     */
    public void setAbstractViewObjectExtension(final List<AbstractObject> abstractViewObjectExtension) {
        this.abstractViewObjectExtension = abstractViewObjectExtension;
    }

    /**
     * add a value to the abstractViewObjectExtension property collection
     * 
     * @param abstractViewObjectExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link TimeSpan}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeStamp}{@code >}{@code <}{@link ViewerOptions}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public AbstractView addToAbstractViewObjectExtension(final AbstractObject abstractViewObjectExtension) {
        this.getAbstractViewObjectExtension().add(abstractViewObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public AbstractView addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractViewSimpleExtension
     *     required parameter
     * @return
     *     AbstractView
     */
    public AbstractView withAbstractViewSimpleExtension(final List<Object> abstractViewSimpleExtension) {
        this.setAbstractViewSimpleExtension(abstractViewSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractViewObjectExtension
     *     required parameter
     * @return
     *     AbstractView
     */
    public AbstractView withAbstractViewObjectExtension(final List<AbstractObject> abstractViewObjectExtension) {
        this.setAbstractViewObjectExtension(abstractViewObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public AbstractView withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public AbstractView withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public AbstractView withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public AbstractView clone() {
        AbstractView copy;
        copy = ((AbstractView) super.clone());
        copy.abstractViewSimpleExtension = new ArrayList<Object>((getAbstractViewSimpleExtension().size()));
        for (Object iter: abstractViewSimpleExtension) {
            copy.abstractViewSimpleExtension.add(iter);
        }
        copy.abstractViewObjectExtension = new ArrayList<AbstractObject>((getAbstractViewObjectExtension().size()));
        for (AbstractObject iter: abstractViewObjectExtension) {
            copy.abstractViewObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
