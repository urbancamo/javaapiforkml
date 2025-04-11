
package de.micromata.opengis.kml.v_2_2_0.xal;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressLine",
    "postOfficeName",
    "postOfficeNumber",
    "postalRoute",
    "postBox",
    "postalCode",
    "any"
})
@XmlRootElement(name = "PostOffice")
public class PostOffice implements Cloneable
{

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "PostOfficeName")
    protected List<PostOffice.PostOfficeName> postOfficeName;
    @XmlElement(name = "PostOfficeNumber")
    protected PostOffice.PostOfficeNumber postOfficeNumber;
    @XmlElement(name = "PostalRoute")
    protected PostalRoute postalRoute;
    @XmlElement(name = "PostBox")
    protected PostBox postBox;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAttribute(name = "Indicator")
    @XmlSchemaType(name = "anySimpleType")
    protected String indicator;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public PostOffice() {
        super();
    }

    /**
     * 
     */
    public List<AddressLine> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLine>();
        }
        return this.addressLine;
    }

    /**
     * 
     */
    public List<PostOffice.PostOfficeName> getPostOfficeName() {
        if (postOfficeName == null) {
            postOfficeName = new ArrayList<PostOffice.PostOfficeName>();
        }
        return this.postOfficeName;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PostOffice.PostOfficeNumber}
     *     
     */
    public PostOffice.PostOfficeNumber getPostOfficeNumber() {
        return postOfficeNumber;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PostOffice.PostOfficeNumber}
     *     
     */
    public void setPostOfficeNumber(PostOffice.PostOfficeNumber value) {
        this.postOfficeNumber = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PostalRoute}
     *     
     */
    public PostalRoute getPostalRoute() {
        return postalRoute;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PostalRoute}
     *     
     */
    public void setPostalRoute(PostalRoute value) {
        this.postalRoute = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PostBox}
     *     
     */
    public PostBox getPostBox() {
        return postBox;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PostBox}
     *     
     */
    public void setPostBox(PostBox value) {
        this.postBox = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PostalCode}
     *     
     */
    public PostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCode}
     *     
     */
    public void setPostalCode(PostalCode value) {
        this.postalCode = value;
    }

    /**
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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

        PostOffice that = (PostOffice) object;
        return Objects.equals(addressLine, that.addressLine)
                && Objects.equals(postOfficeName, that.postOfficeName)
                && Objects.equals(postOfficeNumber, that.postOfficeNumber)
                && Objects.equals(postalRoute, that.postalRoute)
                && Objects.equals(postBox, that.postBox)
                && Objects.equals(postalCode, that.postalCode)
                && Objects.equals(any, that.any)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(indicator, that.indicator)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(addressLine);
        result = 31 * result + Objects.hashCode(postOfficeName);
        result = 31 * result + Objects.hashCode(postOfficeNumber);
        result = 31 * result + Objects.hashCode(postalRoute);
        result = 31 * result + Objects.hashCode(postBox);
        result = 31 * result + Objects.hashCode(postalCode);
        result = 31 * result + Objects.hashCode(any);
        result = 31 * result + Objects.hashCode(underscore);
        result = 31 * result + Objects.hashCode(indicator);
        result = 31 * result + Objects.hashCode(otherAttributes);
        return result;
    }

    /**
     * Creates a new instance of {@link AddressLine} and adds it to addressLine.
     * This method is a short version for:
     * {@code
     * AddressLine addressLine = new AddressLine();
     * this.getAddressLine().add(addressLine); }
     * 
     * 
     */
    public AddressLine createAndAddAddressLine() {
        AddressLine newValue = new AddressLine();
        this.getAddressLine().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostOffice.PostOfficeName} and adds it to postOfficeName.
     * This method is a short version for:
     * {@code
     * PostOfficeName postOfficeName = new PostOfficeName();
     * this.getPostOfficeName().add(postOfficeName); }
     * 
     * 
     */
    public PostOffice.PostOfficeName createAndAddPostOfficeName() {
        PostOffice.PostOfficeName newValue = new PostOffice.PostOfficeName();
        this.getPostOfficeName().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostOffice.PostOfficeNumber} and set it to postOfficeNumber.
     * 
     * This method is a short version for:
     * {@code
     * PostOfficeNumber postOfficeNumber = new PostOfficeNumber();
     * this.setPostOfficeNumber(postOfficeNumber); }
     * 
     * 
     */
    public PostOffice.PostOfficeNumber createAndSetPostOfficeNumber() {
        PostOffice.PostOfficeNumber newValue = new PostOffice.PostOfficeNumber();
        this.setPostOfficeNumber(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostalRoute} and set it to postalRoute.
     * 
     * This method is a short version for:
     * {@code
     * PostalRoute postalRoute = new PostalRoute();
     * this.setPostalRoute(postalRoute); }
     * 
     * 
     * @param postalRouteName
     *     required parameter
     * @param postalRouteNumber
     *     required parameter
     */
    public PostalRoute createAndSetPostalRoute(final List<PostalRoute.PostalRouteName> postalRouteName, final PostalRoute.PostalRouteNumber postalRouteNumber) {
        PostalRoute newValue = new PostalRoute(postalRouteName, postalRouteNumber);
        this.setPostalRoute(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostBox} and set it to postBox.
     * 
     * This method is a short version for:
     * {@code
     * PostBox postBox = new PostBox();
     * this.setPostBox(postBox); }
     * 
     * 
     * @param postBoxNumber
     *     required parameter
     */
    public PostBox createAndSetPostBox(final PostBox.PostBoxNumber postBoxNumber) {
        PostBox newValue = new PostBox(postBoxNumber);
        this.setPostBox(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostalCode} and set it to postalCode.
     * 
     * This method is a short version for:
     * {@code
     * PostalCode postalCode = new PostalCode();
     * this.setPostalCode(postalCode); }
     * 
     * 
     */
    public PostalCode createAndSetPostalCode() {
        PostalCode newValue = new PostalCode();
        this.setPostalCode(newValue);
        return newValue;
    }

    /**
     * Sets the value of the addressLine property Objects of the following type(s) are allowed in the list {@code List<AddressLine>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withAddressLine instead.
     * 
     * 
     * @param addressLine
     *     Objects of the following type are allowed in the list: {@link AddressLine}
     */
    public void setAddressLine(final List<AddressLine> addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * add a value to the addressLine property collection
     * 
     * @param addressLine
     *     Objects of the following type are allowed in the list: {@link AddressLine}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public PostOffice addToAddressLine(final AddressLine addressLine) {
        this.getAddressLine().add(addressLine);
        return this;
    }

    /**
     * Sets the value of the postOfficeName property Objects of the following type(s) are allowed in the list {@code List<PostOfficeName>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPostOfficeName} instead.
     * 
     * 
     * @param postOfficeName
     *     Objects of the following type are allowed in the list: {@link PostOffice.PostOfficeName}
     */
    public void setPostOfficeName(final List<PostOffice.PostOfficeName> postOfficeName) {
        this.postOfficeName = postOfficeName;
    }

    /**
     * add a value to the postOfficeName property collection
     * 
     * @param postOfficeName
     *     Objects of the following type are allowed in the list: {@link PostOffice.PostOfficeName}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public PostOffice addToPostOfficeName(final PostOffice.PostOfficeName postOfficeName) {
        this.getPostOfficeName().add(postOfficeName);
        return this;
    }

    /**
     * Sets the value of the any property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withAny} instead.
     * 
     * 
     * @param any
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setAny(final List<Object> any) {
        this.any = any;
    }

    /**
     * add a value to the any property collection
     * 
     * @param any
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public PostOffice addToAny(final Object any) {
        this.getAny().add(any);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param addressLine
     *     required parameter
     */
    public PostOffice withAddressLine(final List<AddressLine> addressLine) {
        this.setAddressLine(addressLine);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postOfficeName
     *     required parameter
     */
    public PostOffice withPostOfficeName(final List<PostOffice.PostOfficeName> postOfficeName) {
        this.setPostOfficeName(postOfficeName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postOfficeNumber
     *     required parameter
     */
    public PostOffice withPostOfficeNumber(final PostOffice.PostOfficeNumber postOfficeNumber) {
        this.setPostOfficeNumber(postOfficeNumber);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postalRoute
     *     required parameter
     */
    public PostOffice withPostalRoute(final PostalRoute postalRoute) {
        this.setPostalRoute(postalRoute);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postBox
     *     required parameter
     */
    public PostOffice withPostBox(final PostBox postBox) {
        this.setPostBox(postBox);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postalCode
     *     required parameter
     */
    public PostOffice withPostalCode(final PostalCode postalCode) {
        this.setPostalCode(postalCode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param any
     *     required parameter
     */
    public PostOffice withAny(final List<Object> any) {
        this.setAny(any);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param underscore
     *     required parameter
     */
    public PostOffice withUnderscore(final String underscore) {
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
    public PostOffice withIndicator(final String indicator) {
        this.setIndicator(indicator);
        return this;
    }

    @Override
    public PostOffice clone() {
        PostOffice copy;
        try {
            copy = ((PostOffice) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
        for (AddressLine iter: addressLine) {
            copy.addressLine.add(iter.clone());
        }
        copy.postOfficeName = new ArrayList<PostOffice.PostOfficeName>((getPostOfficeName().size()));
        for (PostOffice.PostOfficeName iter: postOfficeName) {
            copy.postOfficeName.add(iter.clone());
        }
        copy.postOfficeNumber = ((postOfficeNumber == null)?null:((PostOffice.PostOfficeNumber) postOfficeNumber.clone()));
        copy.postalRoute = ((postalRoute == null)?null:((PostalRoute) postalRoute.clone()));
        copy.postBox = ((postBox == null)?null:((PostBox) postBox.clone()));
        copy.postalCode = ((postalCode == null)?null:((PostalCode) postalCode.clone()));
        copy.any = new ArrayList<Object>((getAny().size()));
        for (Object iter: any) {
            copy.any.add(iter);
        }
        return copy;
    }


    /**
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    @XmlRootElement(name = "PostOfficeName", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PostOfficeName implements Cloneable
    {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String underscore;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        public PostOfficeName() {
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
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = ((prime*result)+((content == null)? 0 :content.hashCode()));
            result = ((prime*result)+((underscore == null)? 0 :underscore.hashCode()));
            result = ((prime*result)+((code == null)? 0 :code.hashCode()));
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
            if ((obj instanceof PostOffice.PostOfficeName) == false) {
                return false;
            }
            PostOffice.PostOfficeName other = ((PostOffice.PostOfficeName) obj);
            if (content == null) {
                if (other.content!= null) {
                    return false;
                }
            } else {
                if (content.equals(other.content) == false) {
                    return false;
                }
            }
            if (underscore == null) {
                if (other.underscore!= null) {
                    return false;
                }
            } else {
                if (underscore.equals(other.underscore) == false) {
                    return false;
                }
            }
            if (code == null) {
                if (other.code!= null) {
                    return false;
                }
            } else {
                if (code.equals(other.code) == false) {
                    return false;
                }
            }
            return true;
        }

        /**
         * fluent setter
         *
         * 
         * @param content
         *     required parameter
         */
        public PostOffice.PostOfficeName withContent(final String content) {
            this.setContent(content);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param underscore
         *     required parameter
         */
        public PostOffice.PostOfficeName withUnderscore(final String underscore) {
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
        public PostOffice.PostOfficeName withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public PostOffice.PostOfficeName clone() {
            PostOffice.PostOfficeName copy;
            try {
                copy = ((PostOffice.PostOfficeName) super.clone());
            } catch (CloneNotSupportedException _x) {
                throw new InternalError((_x.toString()));
            }
            return copy;
        }

    }


    /**
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    @XmlRootElement(name = "PostOfficeNumber", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PostOfficeNumber implements Cloneable
    {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Indicator")
        @XmlSchemaType(name = "anySimpleType")
        protected String indicator;
        @XmlAttribute(name = "IndicatorOccurrence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String indicatorOccurrence;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        public PostOfficeNumber() {
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
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = ((prime*result)+((content == null)? 0 :content.hashCode()));
            result = ((prime*result)+((indicator == null)? 0 :indicator.hashCode()));
            result = ((prime*result)+((indicatorOccurrence == null)? 0 :indicatorOccurrence.hashCode()));
            result = ((prime*result)+((code == null)? 0 :code.hashCode()));
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
            if ((obj instanceof PostOffice.PostOfficeNumber) == false) {
                return false;
            }
            PostOffice.PostOfficeNumber other = ((PostOffice.PostOfficeNumber) obj);
            if (content == null) {
                if (other.content!= null) {
                    return false;
                }
            } else {
                if (content.equals(other.content) == false) {
                    return false;
                }
            }
            if (indicator == null) {
                if (other.indicator!= null) {
                    return false;
                }
            } else {
                if (indicator.equals(other.indicator) == false) {
                    return false;
                }
            }
            if (indicatorOccurrence == null) {
                if (other.indicatorOccurrence!= null) {
                    return false;
                }
            } else {
                if (indicatorOccurrence.equals(other.indicatorOccurrence) == false) {
                    return false;
                }
            }
            if (code == null) {
                if (other.code!= null) {
                    return false;
                }
            } else {
                if (code.equals(other.code) == false) {
                    return false;
                }
            }
            return true;
        }

        /**
         * fluent setter
         *
         * 
         * @param content
         *     required parameter
         */
        public PostOffice.PostOfficeNumber withContent(final String content) {
            this.setContent(content);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param indicator
         *     required parameter
         */
        public PostOffice.PostOfficeNumber withIndicator(final String indicator) {
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
        public PostOffice.PostOfficeNumber withIndicatorOccurrence(final String indicatorOccurrence) {
            this.setIndicatorOccurrence(indicatorOccurrence);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param code
         *     required parameter
         */
        public PostOffice.PostOfficeNumber withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public PostOffice.PostOfficeNumber clone() {
            PostOffice.PostOfficeNumber copy;
            try {
                copy = ((PostOffice.PostOfficeNumber) super.clone());
            } catch (CloneNotSupportedException _x) {
                throw new InternalError((_x.toString()));
            }
            return copy;
        }

    }

}
