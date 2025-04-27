
package de.micromata.opengis.kml.v_2_2_0.xal;

import jakarta.xml.bind.annotation.*;

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
@XmlType(name = "PostalRouteType", propOrder = {
    "addressLine",
    "postalRouteName",
    "postalRouteNumber",
    "postBox",
    "any"
})
@XmlRootElement(name = "PostalRoute", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
public class PostalRoute implements Cloneable
{

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "PostalRouteName")
    protected List<PostalRoute.PostalRouteName> postalRouteName;
    @XmlElement(name = "PostalRouteNumber")
    protected PostalRoute.PostalRouteNumber postalRouteNumber;
    @XmlElement(name = "PostBox")
    protected PostBox postBox;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Value constructor with only mandatory fields
     * 
     * @param postalRouteName
     *     required parameter
     * @param postalRouteNumber
     *     required parameter
     */
    public PostalRoute(final List<PostalRoute.PostalRouteName> postalRouteName, final PostalRoute.PostalRouteNumber postalRouteNumber) {
        super();
        this.postalRouteName = postalRouteName;
        this.postalRouteNumber = postalRouteNumber;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private PostalRoute() {
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
    public List<PostalRoute.PostalRouteName> getPostalRouteName() {
        if (postalRouteName == null) {
            postalRouteName = new ArrayList<PostalRoute.PostalRouteName>();
        }
        return this.postalRouteName;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PostalRoute.PostalRouteNumber}
     *     
     */
    public PostalRoute.PostalRouteNumber getPostalRouteNumber() {
        return postalRouteNumber;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PostalRoute.PostalRouteNumber}
     *     
     */
    public void setPostalRouteNumber(PostalRoute.PostalRouteNumber value) {
        this.postalRouteNumber = value;
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

        PostalRoute that = (PostalRoute) object;
        return Objects.equals(addressLine, that.addressLine)
                && Objects.equals(postalRouteName, that.postalRouteName)
                && Objects.equals(postalRouteNumber, that.postalRouteNumber)
                && Objects.equals(postBox, that.postBox)
                && Objects.equals(any, that.any)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(addressLine);
        result = 31 * result + Objects.hashCode(postalRouteName);
        result = 31 * result + Objects.hashCode(postalRouteNumber);
        result = 31 * result + Objects.hashCode(postBox);
        result = 31 * result + Objects.hashCode(any);
        result = 31 * result + Objects.hashCode(underscore);
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
     * Creates a new instance of {@link PostalRoute.PostalRouteName} and adds it to postalRouteName.
     * This method is a short version for:
     * {@code
     * PostalRouteName postalRouteName = new PostalRouteName();
     * this.getPostalRouteName().add(postalRouteName); }
     * 
     * 
     */
    public PostalRoute.PostalRouteName createAndAddPostalRouteName() {
        PostalRoute.PostalRouteName newValue = new PostalRoute.PostalRouteName();
        this.getPostalRouteName().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostalRoute.PostalRouteNumber} and set it to postalRouteNumber.
     * 
     * This method is a short version for:
     * {@code
     * PostalRouteNumber postalRouteNumber = new PostalRouteNumber();
     * this.setPostalRouteNumber(postalRouteNumber); }
     * 
     * 
     */
    public PostalRoute.PostalRouteNumber createAndSetPostalRouteNumber() {
        PostalRoute.PostalRouteNumber newValue = new PostalRoute.PostalRouteNumber();
        this.setPostalRouteNumber(newValue);
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
    public PostalRoute addToAddressLine(final AddressLine addressLine) {
        this.getAddressLine().add(addressLine);
        return this;
    }

    /**
     * Sets the value of the postalRouteName property Objects of the following type(s) are allowed in the list {@code List<PostalRouteName>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withPostalRouteName instead.
     * 
     * 
     * @param postalRouteName
     *     Objects of the following type are allowed in the list: {@link PostalRoute.PostalRouteName}
     */
    public void setPostalRouteName(final List<PostalRoute.PostalRouteName> postalRouteName) {
        this.postalRouteName = postalRouteName;
    }

    /**
     * add a value to the postalRouteName property collection
     * 
     * @param postalRouteName
     *     Objects of the following type are allowed in the list: {@link PostalRoute.PostalRouteName}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public PostalRoute addToPostalRouteName(final PostalRoute.PostalRouteName postalRouteName) {
        this.getPostalRouteName().add(postalRouteName);
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
    public PostalRoute addToAny(final Object any) {
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
    public PostalRoute withAddressLine(final List<AddressLine> addressLine) {
        this.setAddressLine(addressLine);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postBox
     *     required parameter
     */
    public PostalRoute withPostBox(final PostBox postBox) {
        this.setPostBox(postBox);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param any
     *     required parameter
     */
    public PostalRoute withAny(final List<Object> any) {
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
    public PostalRoute withUnderscore(final String underscore) {
        this.setUnderscore(underscore);
        return this;
    }

    @Override
    public PostalRoute clone() {
        PostalRoute copy;
        try {
            copy = ((PostalRoute) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
        for (AddressLine iter: addressLine) {
            copy.addressLine.add(iter.clone());
        }
        copy.postalRouteName = new ArrayList<PostalRoute.PostalRouteName>((getPostalRouteName().size()));
        for (PostalRoute.PostalRouteName iter: postalRouteName) {
            copy.postalRouteName.add(iter.clone());
        }
        copy.postalRouteNumber = ((postalRouteNumber == null)?null:((PostalRoute.PostalRouteNumber) postalRouteNumber.clone()));
        copy.postBox = ((postBox == null)?null:((PostBox) postBox.clone()));
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
    @XmlRootElement(name = "PostalRouteName", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PostalRouteName implements Cloneable
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

        public PostalRouteName() {
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
            if ((obj instanceof PostalRoute.PostalRouteName) == false) {
                return false;
            }
            PostalRoute.PostalRouteName other = ((PostalRoute.PostalRouteName) obj);
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
        public PostalRoute.PostalRouteName withContent(final String content) {
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
        public PostalRoute.PostalRouteName withUnderscore(final String underscore) {
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
        public PostalRoute.PostalRouteName withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public PostalRoute.PostalRouteName clone() {
            PostalRoute.PostalRouteName copy;
            try {
                copy = ((PostalRoute.PostalRouteName) super.clone());
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
    @XmlRootElement(name = "PostalRouteNumber", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PostalRouteNumber implements Cloneable
    {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        public PostalRouteNumber() {
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
            if ((obj instanceof PostalRoute.PostalRouteNumber) == false) {
                return false;
            }
            PostalRoute.PostalRouteNumber other = ((PostalRoute.PostalRouteNumber) obj);
            if (content == null) {
                if (other.content!= null) {
                    return false;
                }
            } else {
                if (content.equals(other.content) == false) {
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
        public PostalRoute.PostalRouteNumber withContent(final String content) {
            this.setContent(content);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param code
         *     required parameter
         */
        public PostalRoute.PostalRouteNumber withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public PostalRoute.PostalRouteNumber clone() {
            PostalRoute.PostalRouteNumber copy;
            try {
                copy = ((PostalRoute.PostalRouteNumber) super.clone());
            } catch (CloneNotSupportedException _x) {
                throw new InternalError((_x.toString()));
            }
            return copy;
        }

    }

}
