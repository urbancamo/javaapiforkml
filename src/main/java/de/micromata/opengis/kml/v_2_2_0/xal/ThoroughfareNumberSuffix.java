
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
import javax.xml.namespace.QName;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ThoroughfareNumberSuffix")
public class ThoroughfareNumberSuffix implements Cloneable
{

    @XmlValue
    protected String content;
    @XmlAttribute(name = "NumberSuffixSeparator")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberSuffixSeparator;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAttribute(name = "Code")
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public ThoroughfareNumberSuffix() {
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
    public String getNumberSuffixSeparator() {
        return numberSuffixSeparator;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setNumberSuffixSeparator(String value) {
        this.numberSuffixSeparator = value;
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

        ThoroughfareNumberSuffix that = (ThoroughfareNumberSuffix) object;
        return Objects.equals(content, that.content)
                && Objects.equals(numberSuffixSeparator, that.numberSuffixSeparator)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(code, that.code)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(content);
        result = 31 * result + Objects.hashCode(numberSuffixSeparator);
        result = 31 * result + Objects.hashCode(underscore);
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
    public ThoroughfareNumberSuffix withContent(final String content) {
        this.setContent(content);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param numberSuffixSeparator
     *     required parameter
     */
    public ThoroughfareNumberSuffix withNumberSuffixSeparator(final String numberSuffixSeparator) {
        this.setNumberSuffixSeparator(numberSuffixSeparator);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param underscore
     *     required parameter
     */
    public ThoroughfareNumberSuffix withUnderscore(final String underscore) {
        this.setUnderscore(underscore);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param code
     *     required parameter
     */
    public ThoroughfareNumberSuffix withCode(final String code) {
        this.setCode(code);
        return this;
    }

    @Override
    public ThoroughfareNumberSuffix clone() {
        ThoroughfareNumberSuffix copy;
        try {
            copy = ((ThoroughfareNumberSuffix) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
