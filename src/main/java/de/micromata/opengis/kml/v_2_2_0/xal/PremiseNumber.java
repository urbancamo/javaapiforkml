
package de.micromata.opengis.kml.v_2_2_0.xal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "PremiseNumber")
public class PremiseNumber implements Cloneable
{

    @XmlValue
    protected String content;
    @XmlAttribute(name = "NumberType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String number;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAttribute(name = "Indicator")
    @XmlSchemaType(name = "anySimpleType")
    protected String indicator;
    @XmlAttribute(name = "IndicatorOccurrence")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indicatorOccurrence;
    @XmlAttribute(name = "NumberTypeOccurrence")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberTypeOccurrence;
    @XmlAttribute(name = "Code")
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public PremiseNumber() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getUnderscore() {
        return underscore;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setUnderscore(String value) {
        this.underscore = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getIndicatorOccurrence() {
        return indicatorOccurrence;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setIndicatorOccurrence(String value) {
        this.indicatorOccurrence = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getNumberTypeOccurrence() {
        return numberTypeOccurrence;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setNumberTypeOccurrence(String value) {
        this.numberTypeOccurrence = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        PremiseNumber that = (PremiseNumber) object;
        return Objects.equals(content, that.content)
                && Objects.equals(number, that.number)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(indicator, that.indicator)
                && Objects.equals(indicatorOccurrence, that.indicatorOccurrence)
                && Objects.equals(numberTypeOccurrence, that.numberTypeOccurrence)
                && Objects.equals(code, that.code)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(content);
        result = 31 * result + Objects.hashCode(number);
        result = 31 * result + Objects.hashCode(underscore);
        result = 31 * result + Objects.hashCode(indicator);
        result = 31 * result + Objects.hashCode(indicatorOccurrence);
        result = 31 * result + Objects.hashCode(numberTypeOccurrence);
        result = 31 * result + Objects.hashCode(code);
        result = 31 * result + Objects.hashCode(otherAttributes);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param content
     *     required parameter
     */
    public PremiseNumber withContent(final String content) {
        this.setContent(content);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param number
     *     required parameter
     */
    public PremiseNumber withNumber(final String number) {
        this.setNumber(number);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param underscore
     *     required parameter
     */
    public PremiseNumber withUnderscore(final String underscore) {
        this.setUnderscore(underscore);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param indicator
     *     required parameter
     */
    public PremiseNumber withIndicator(final String indicator) {
        this.setIndicator(indicator);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param indicatorOccurrence
     *     required parameter
     */
    public PremiseNumber withIndicatorOccurrence(final String indicatorOccurrence) {
        this.setIndicatorOccurrence(indicatorOccurrence);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param numberTypeOccurrence
     *     required parameter
     */
    public PremiseNumber withNumberTypeOccurrence(final String numberTypeOccurrence) {
        this.setNumberTypeOccurrence(numberTypeOccurrence);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param code
     *     required parameter
     */
    public PremiseNumber withCode(final String code) {
        this.setCode(code);
        return this;
    }

    @Override
    public PremiseNumber clone() {
        PremiseNumber copy;
        try {
            copy = ((PremiseNumber) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
