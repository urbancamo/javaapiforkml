
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
@XmlRootElement(name = "ThoroughfareNumberPrefix")
public class ThoroughfareNumberPrefix implements Cloneable
{

    @XmlValue
    protected String content;
    @XmlAttribute(name = "NumberPrefixSeparator")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberPrefixSeparator;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAttribute(name = "Code")
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public ThoroughfareNumberPrefix() {
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
    public String getNumberPrefixSeparator() {
        return numberPrefixSeparator;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setNumberPrefixSeparator(String value) {
        this.numberPrefixSeparator = value;
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

        ThoroughfareNumberPrefix that = (ThoroughfareNumberPrefix) object;
        return Objects.equals(content, that.content)
                && Objects.equals(numberPrefixSeparator, that.numberPrefixSeparator)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(code, that.code)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(content);
        result = 31 * result + Objects.hashCode(numberPrefixSeparator);
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
    public ThoroughfareNumberPrefix withContent(final String content) {
        this.setContent(content);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param numberPrefixSeparator
     *     required parameter
     */
    public ThoroughfareNumberPrefix withNumberPrefixSeparator(final String numberPrefixSeparator) {
        this.setNumberPrefixSeparator(numberPrefixSeparator);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param underscore
     *     required parameter
     */
    public ThoroughfareNumberPrefix withUnderscore(final String underscore) {
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
    public ThoroughfareNumberPrefix withCode(final String code) {
        this.setCode(code);
        return this;
    }

    @Override
    public ThoroughfareNumberPrefix clone() {
        ThoroughfareNumberPrefix copy;
        try {
            copy = ((ThoroughfareNumberPrefix) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
