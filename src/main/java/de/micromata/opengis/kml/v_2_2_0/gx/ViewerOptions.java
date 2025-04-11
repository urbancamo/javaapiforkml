
package de.micromata.opengis.kml.v_2_2_0.gx;

import de.micromata.opengis.kml.v_2_2_0.AbstractObject;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerOptionsType", propOrder = {
    "option"
})
@XmlRootElement(name = "ViewerOptions", namespace = "http://www.google.com/kml/ext/2.2")
public class ViewerOptions
    extends AbstractObject
    implements Cloneable
{

    @XmlElement(required = true)
    protected List<Option> option;

    /**
     * Value constructor with only mandatory fields
     * 
     * @param option
     *     required parameter
     */
    public ViewerOptions(final List<Option> option) {
        super();
        this.option = option;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private ViewerOptions() {
        super();
    }

    /**
     * 
     */
    public List<Option> getOption() {
        if (option == null) {
            option = new ArrayList<Option>();
        }
        return this.option;
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

        ViewerOptions that = (ViewerOptions) object;
        return Objects.equals(option, that.option);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(option);
        return result;
    }

    /**
     * Creates a new instance of {@link Option} and adds it to option.
     * This method is a short version for:
     * {@code
     * Option option = new Option();
     * this.getOption().add(option); }
     * 
     * 
     */
    public Option createAndAddOption() {
        Option newValue = new Option();
        this.getOption().add(newValue);
        return newValue;
    }

    /**
     * Sets the value of the option property Objects of the following type(s) are allowed in the list {@code List<Option>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withOption instead.
     * 
     * 
     * @param option
     *     Objects of the following type are allowed in the list: {@link Option}
     */
    public void setOption(final List<Option> option) {
        this.option = option;
    }

    /**
     * add a value to the option property collection
     * 
     * @param option
     *     Objects of the following type are allowed in the list: {@link Option}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ViewerOptions addToOption(final Option option) {
        this.getOption().add(option);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public ViewerOptions addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    @Override
    public ViewerOptions clone() {
        ViewerOptions copy;
        copy = ((ViewerOptions) super.clone());
        copy.option = new ArrayList<Option>((getOption().size()));
        for (Option iter: option) {
            copy.option.add(iter.clone());
        }
        return copy;
    }

}
