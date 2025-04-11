
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
@XmlType(name = "FirmType", propOrder = {
    "addressLine",
    "firmName",
    "department",
    "mailStop",
    "postalCode",
    "any"
})
@XmlRootElement(name = "Firm", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
public class Firm implements Cloneable
{

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "FirmName")
    protected List<Firm.FirmName> firmName;
    @XmlElement(name = "Department")
    protected List<Department> department;
    @XmlElement(name = "MailStop")
    protected MailStop mailStop;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public Firm() {
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
    public List<Firm.FirmName> getFirmName() {
        if (firmName == null) {
            firmName = new ArrayList<Firm.FirmName>();
        }
        return this.firmName;
    }

    /**
     * 
     */
    public List<Department> getDepartment() {
        if (department == null) {
            department = new ArrayList<Department>();
        }
        return this.department;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link MailStop}
     *     
     */
    public MailStop getMailStop() {
        return mailStop;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link MailStop}
     *     
     */
    public void setMailStop(MailStop value) {
        this.mailStop = value;
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

        Firm firm = (Firm) object;
        return Objects.equals(addressLine, firm.addressLine)
                && Objects.equals(firmName, firm.firmName)
                && Objects.equals(department, firm.department)
                && Objects.equals(mailStop, firm.mailStop)
                && Objects.equals(postalCode, firm.postalCode)
                && Objects.equals(any, firm.any)
                && Objects.equals(underscore, firm.underscore)
                && Objects.equals(otherAttributes, firm.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(addressLine);
        result = 31 * result + Objects.hashCode(firmName);
        result = 31 * result + Objects.hashCode(department);
        result = 31 * result + Objects.hashCode(mailStop);
        result = 31 * result + Objects.hashCode(postalCode);
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
     * Creates a new instance of {@link Firm.FirmName} and adds it to firmName.
     * This method is a short version for:
     * {@code
     * FirmName firmName = new FirmName();
     * this.getFirmName().add(firmName); }
     * 
     * 
     */
    public Firm.FirmName createAndAddFirmName() {
        Firm.FirmName newValue = new Firm.FirmName();
        this.getFirmName().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Department} and adds it to department.
     * This method is a short version for:
     * {@code
     * Department department = new Department();
     * this.getDepartment().add(department); }
     * 
     * 
     */
    public Department createAndAddDepartment() {
        Department newValue = new Department();
        this.getDepartment().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link MailStop} and set it to mailStop.
     * 
     * This method is a short version for:
     * {@code
     * MailStop mailStop = new MailStop();
     * this.setMailStop(mailStop); }
     * 
     * 
     */
    public MailStop createAndSetMailStop() {
        MailStop newValue = new MailStop();
        this.setMailStop(newValue);
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
    public Firm addToAddressLine(final AddressLine addressLine) {
        this.getAddressLine().add(addressLine);
        return this;
    }

    /**
     * Sets the value of the firmName property Objects of the following type(s) are allowed in the list {@code List<FirmName>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withFirmName} instead.
     * 
     * 
     * @param firmName
     *     Objects of the following type are allowed in the list: {@link Firm.FirmName}
     */
    public void setFirmName(final List<Firm.FirmName> firmName) {
        this.firmName = firmName;
    }

    /**
     * add a value to the firmName property collection
     * 
     * @param firmName
     *     Objects of the following type are allowed in the list: {@link Firm.FirmName}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Firm addToFirmName(final Firm.FirmName firmName) {
        this.getFirmName().add(firmName);
        return this;
    }

    /**
     * Sets the value of the department property Objects of the following type(s) are allowed in the list {@code List<Department>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withDepartment} instead.
     * 
     * 
     * @param department
     *     Objects of the following type are allowed in the list: {@link Department}
     */
    public void setDepartment(final List<Department> department) {
        this.department = department;
    }

    /**
     * add a value to the department property collection
     * 
     * @param department
     *     Objects of the following type are allowed in the list: {@link Department}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Firm addToDepartment(final Department department) {
        this.getDepartment().add(department);
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
    public Firm addToAny(final Object any) {
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
    public Firm withAddressLine(final List<AddressLine> addressLine) {
        this.setAddressLine(addressLine);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param firmName
     *     required parameter
     */
    public Firm withFirmName(final List<Firm.FirmName> firmName) {
        this.setFirmName(firmName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param department
     *     required parameter
     */
    public Firm withDepartment(final List<Department> department) {
        this.setDepartment(department);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param mailStop
     *     required parameter
     */
    public Firm withMailStop(final MailStop mailStop) {
        this.setMailStop(mailStop);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postalCode
     *     required parameter
     */
    public Firm withPostalCode(final PostalCode postalCode) {
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
    public Firm withAny(final List<Object> any) {
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
    public Firm withUnderscore(final String underscore) {
        this.setUnderscore(underscore);
        return this;
    }

    @Override
    public Firm clone() {
        Firm copy;
        try {
            copy = ((Firm) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
        for (AddressLine iter: addressLine) {
            copy.addressLine.add(iter.clone());
        }
        copy.firmName = new ArrayList<Firm.FirmName>((getFirmName().size()));
        for (Firm.FirmName iter: firmName) {
            copy.firmName.add(iter.clone());
        }
        copy.department = new ArrayList<Department>((getDepartment().size()));
        for (Department iter: department) {
            copy.department.add(iter.clone());
        }
        copy.mailStop = ((mailStop == null)?null:((MailStop) mailStop.clone()));
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
    @XmlRootElement(name = "FirmName", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class FirmName implements Cloneable
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

        public FirmName() {
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
            if ((obj instanceof Firm.FirmName) == false) {
                return false;
            }
            Firm.FirmName other = ((Firm.FirmName) obj);
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
        public Firm.FirmName withContent(final String content) {
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
        public Firm.FirmName withUnderscore(final String underscore) {
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
        public Firm.FirmName withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public Firm.FirmName clone() {
            Firm.FirmName copy;
            try {
                copy = ((Firm.FirmName) super.clone());
            } catch (CloneNotSupportedException _x) {
                throw new InternalError((_x.toString()));
            }
            return copy;
        }

    }

}
