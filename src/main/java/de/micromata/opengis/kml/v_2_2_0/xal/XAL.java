
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
@XmlType(name = "", propOrder = {
    "xalAddressDetails",
    "any"
})
@XmlRootElement(name = "xAL")
public class XAL implements Cloneable
{

    @XmlElement(name = "AddressDetails", required = true)
    protected List<AddressDetails> xalAddressDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Version")
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Value constructor with only mandatory fields
     * 
     * @param xalAddressDetails
     *     required parameter
     */
    public XAL(final List<AddressDetails> xalAddressDetails) {
        super();
        this.xalAddressDetails = xalAddressDetails;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private XAL() {
        super();
    }

    /**
     * 
     */
    public List<AddressDetails> getXalAddressDetails() {
        if (xalAddressDetails == null) {
            xalAddressDetails = new ArrayList<AddressDetails>();
        }
        return this.xalAddressDetails;
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
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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

        XAL xal = (XAL) object;
        return Objects.equals(xalAddressDetails, xal.xalAddressDetails)
                && Objects.equals(any, xal.any)
                && Objects.equals(version, xal.version)
                && Objects.equals(otherAttributes, xal.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(xalAddressDetails);
        result = 31 * result + Objects.hashCode(any);
        result = 31 * result + Objects.hashCode(version);
        result = 31 * result + Objects.hashCode(otherAttributes);
        return result;
    }

    /**
     * Creates a new instance of {@link AddressDetails} and adds it to xalAddressDetails.
     * This method is a short version for:
     * {@code
     * AddressDetails addressDetails = new AddressDetails();
     * this.getXalAddressDetails().add(addressDetails); }
     * 
     * 
     * @param xalAddress
     *     required parameter
     * @param addressLines
     *     required parameter
     * @param country
     *     required parameter
     * @param locality
     *     required parameter
     * @param administrativeArea
     *     required parameter
     * @param thoroughfare
     *     required parameter
     */
    public AddressDetails createAndAddXalAddressDetails(final AddressDetails.Address xalAddress, final AddressLines addressLines, final AddressDetails.Country country, final AdministrativeArea administrativeArea, final Locality locality, final Thoroughfare thoroughfare) {
        AddressDetails newValue = new AddressDetails(xalAddress, addressLines, country, administrativeArea, locality, thoroughfare);
        this.getXalAddressDetails().add(newValue);
        return newValue;
    }

    /**
     * Sets the value of the xalAddressDetails property Objects of the following type(s) are allowed in the list {@code List<AddressDetails>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withXalAddressDetails instead.
     * 
     * 
     * @param xalAddressDetails
     *     Objects of the following type are allowed in the list: {@link AddressDetails}
     */
    public void setXalAddressDetails(final List<AddressDetails> xalAddressDetails) {
        this.xalAddressDetails = xalAddressDetails;
    }

    /**
     * add a value to the xalAddressDetails property collection
     * 
     * @param xalAddressDetails
     *     Objects of the following type are allowed in the list: {@link AddressDetails}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public XAL addToXalAddressDetails(final AddressDetails xalAddressDetails) {
        this.getXalAddressDetails().add(xalAddressDetails);
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
    public XAL addToAny(final Object any) {
        this.getAny().add(any);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param any
     *     required parameter
     */
    public XAL withAny(final List<Object> any) {
        this.setAny(any);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param version
     *     required parameter
     */
    public XAL withVersion(final String version) {
        this.setVersion(version);
        return this;
    }

    @Override
    public XAL clone() {
        XAL copy;
        try {
            copy = ((XAL) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.xalAddressDetails = new ArrayList<AddressDetails>((getXalAddressDetails().size()));
        for (AddressDetails iter: xalAddressDetails) {
            copy.xalAddressDetails.add(iter.clone());
        }
        copy.any = new ArrayList<Object>((getAny().size()));
        for (Object iter: any) {
            copy.any.add(iter);
        }
        return copy;
    }

}
