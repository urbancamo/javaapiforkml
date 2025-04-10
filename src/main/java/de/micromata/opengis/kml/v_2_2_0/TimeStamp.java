
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <TimeStamp>}
 * <p>
 * Represents a single moment in time. This is a simple element and contains no children. 
 * Its value is a dateTime, specified in XML time (see XML Schema Part 2: Datatypes 
 * Second Edition). The precision of the TimeStamp is dictated by the dateTime value 
 * in the {@code <when>} element.
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;TimeStamp id=ID&gt;</strong>
 *   &lt;when&gt;...&lt;/when&gt;      &lt;!-- kml:dateTime --&gt;
 * <strong>&lt;/TimeStamp&gt;</strong> </pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStampType", propOrder = {
    "when",
    "timeStampSimpleExtension",
    "timeStampObjectExtension"
})
@XmlRootElement(name = "TimeStamp", namespace = "http://www.opengis.net/kml/2.2")
public class TimeStamp
    extends TimePrimitive
    implements Cloneable
{

    /**
     * {@code <when>}
     * <p>
     * Specifies a single moment in time. The value is a dateTime, which can be one of 
     * the following: dateTime gives second resolution date gives day resolution gYearMonth 
     * gives month resolution gYear gives year resolution 
     * </p>
     * 
     * 
     * 
     */
    protected String when;
    @XmlElement(name = "TimeStampSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> timeStampSimpleExtension;
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
    @XmlElement(name = "TimeStampObjectExtensionGroup")
    protected List<AbstractObject> timeStampObjectExtension;

    public TimeStamp() {
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
    public String getWhen() {
        return when;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setWhen(String value) {
        this.when = value;
    }

    /**
     *
     * 
     */
    public List<Object> getTimeStampSimpleExtension() {
        if (timeStampSimpleExtension == null) {
            timeStampSimpleExtension = new ArrayList<Object>();
        }
        return this.timeStampSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getTimeStampObjectExtension() {
        if (timeStampObjectExtension == null) {
            timeStampObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.timeStampObjectExtension;
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

        TimeStamp timeStamp = (TimeStamp) object;
        return Objects.equals(when, timeStamp.when)
                && Objects.equals(timeStampSimpleExtension, timeStamp.timeStampSimpleExtension)
                && Objects.equals(timeStampObjectExtension, timeStamp.timeStampObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(when);
        result = 31 * result + Objects.hashCode(timeStampSimpleExtension);
        result = 31 * result + Objects.hashCode(timeStampObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param timeStampSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setTimeStampSimpleExtension(final List<Object> timeStampSimpleExtension) {
        this.timeStampSimpleExtension = timeStampSimpleExtension;
    }

    /**
     * add a value to the timeStampSimpleExtension property collection
     * 
     * @param timeStampSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public TimeStamp addToTimeStampSimpleExtension(final Object timeStampSimpleExtension) {
        this.getTimeStampSimpleExtension().add(timeStampSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param timeStampObjectExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setTimeStampObjectExtension(final List<AbstractObject> timeStampObjectExtension) {
        this.timeStampObjectExtension = timeStampObjectExtension;
    }

    /**
     * add a value to the timeStampObjectExtension property collection
     * 
     * @param timeStampObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public TimeStamp addToTimeStampObjectExtension(final AbstractObject timeStampObjectExtension) {
        this.getTimeStampObjectExtension().add(timeStampObjectExtension);
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
    public TimeStamp addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setTimePrimitiveSimpleExtension(final List<Object> timePrimitiveSimpleExtension) {
        super.setTimePrimitiveSimpleExtension(timePrimitiveSimpleExtension);
    }

    @Obvious
    @Override
    public TimeStamp addToTimePrimitiveSimpleExtension(final Object timePrimitiveSimpleExtension) {
        super.getTimePrimitiveSimpleExtension().add(timePrimitiveSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setTimePrimitiveObjectExtension(final List<AbstractObject> timePrimitiveObjectExtension) {
        super.setTimePrimitiveObjectExtension(timePrimitiveObjectExtension);
    }

    @Obvious
    @Override
    public TimeStamp addToTimePrimitiveObjectExtension(final AbstractObject timePrimitiveObjectExtension) {
        super.getTimePrimitiveObjectExtension().add(timePrimitiveObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param when
     *     required parameter
     */
    public TimeStamp withWhen(final String when) {
        this.setWhen(when);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param timeStampSimpleExtension
     *     required parameter
     */
    public TimeStamp withTimeStampSimpleExtension(final List<Object> timeStampSimpleExtension) {
        this.setTimeStampSimpleExtension(timeStampSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param timeStampObjectExtension
     *     required parameter
     */
    public TimeStamp withTimeStampObjectExtension(final List<AbstractObject> timeStampObjectExtension) {
        this.setTimeStampObjectExtension(timeStampObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public TimeStamp withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public TimeStamp withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public TimeStamp withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public TimeStamp withTimePrimitiveSimpleExtension(final List<Object> timePrimitiveSimpleExtension) {
        super.withTimePrimitiveSimpleExtension(timePrimitiveSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public TimeStamp withTimePrimitiveObjectExtension(final List<AbstractObject> timePrimitiveObjectExtension) {
        super.withTimePrimitiveObjectExtension(timePrimitiveObjectExtension);
        return this;
    }

    @Override
    public TimeStamp clone() {
        TimeStamp copy;
        copy = ((TimeStamp) super.clone());
        copy.timeStampSimpleExtension = new ArrayList<Object>((getTimeStampSimpleExtension().size()));
        for (Object iter: timeStampSimpleExtension) {
            copy.timeStampSimpleExtension.add(iter);
        }
        copy.timeStampObjectExtension = new ArrayList<AbstractObject>((getTimeStampObjectExtension().size()));
        for (AbstractObject iter: timeStampObjectExtension) {
            copy.timeStampObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
