
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubStyleType", propOrder = {
    "subStyleSimpleExtension",
    "subStyleObjectExtension"
})
@XmlSeeAlso({
    BalloonStyle.class,
    ListStyle.class,
    ColorStyle.class
})
public abstract class SubStyle
    extends AbstractObject
    implements Cloneable
{

    @XmlElement(name = "AbstractSubStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> subStyleSimpleExtension;
    @XmlElement(name = "AbstractSubStyleObjectExtensionGroup")
    protected List<AbstractObject> subStyleObjectExtension;

    public SubStyle() {
        super();
    }

    /**
     * 
     */
    public List<Object> getSubStyleSimpleExtension() {
        if (subStyleSimpleExtension == null) {
            subStyleSimpleExtension = new ArrayList<Object>();
        }
        return this.subStyleSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getSubStyleObjectExtension() {
        if (subStyleObjectExtension == null) {
            subStyleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.subStyleObjectExtension;
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

        SubStyle subStyle = (SubStyle) object;
        return Objects.equals(subStyleSimpleExtension, subStyle.subStyleSimpleExtension)
                && Objects.equals(subStyleObjectExtension, subStyle.subStyleObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(subStyleSimpleExtension);
        result = 31 * result + Objects.hashCode(subStyleObjectExtension);
        return result;
    }

    /**
     * Sets the value of the subStyleSimpleExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withSubStyleSimpleExtension} instead.
     * 
     * 
     * @param subStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        this.subStyleSimpleExtension = subStyleSimpleExtension;
    }

    /**
     * add a value to the subStyleSimpleExtension property collection
     * 
     * @param subStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SubStyle addToSubStyleSimpleExtension(final Object subStyleSimpleExtension) {
        this.getSubStyleSimpleExtension().add(subStyleSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the subStyleObjectExtension property Objects of the following type(s) are allowed in the list {@code List<AbstractObject>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withSubStyleObjectExtension} instead.
     * 
     * 
     * @param subStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        this.subStyleObjectExtension = subStyleObjectExtension;
    }

    /**
     * add a value to the subStyleObjectExtension property collection
     * 
     * @param subStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public SubStyle addToSubStyleObjectExtension(final AbstractObject subStyleObjectExtension) {
        this.getSubStyleObjectExtension().add(subStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public SubStyle addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param subStyleSimpleExtension
     *     required parameter
     * @return
     *     SubStyle
     */
    public SubStyle withSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        this.setSubStyleSimpleExtension(subStyleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param subStyleObjectExtension
     *     required parameter
     * @return
     *     SubStyle
     */
    public SubStyle withSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        this.setSubStyleObjectExtension(subStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public SubStyle withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public SubStyle withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public SubStyle withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public SubStyle clone() {
        SubStyle copy;
        copy = ((SubStyle) super.clone());
        copy.subStyleSimpleExtension = new ArrayList<Object>((getSubStyleSimpleExtension().size()));
        for (Object iter: subStyleSimpleExtension) {
            copy.subStyleSimpleExtension.add(iter);
        }
        copy.subStyleObjectExtension = new ArrayList<AbstractObject>((getSubStyleObjectExtension().size()));
        for (AbstractObject iter: subStyleObjectExtension) {
            copy.subStyleObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
