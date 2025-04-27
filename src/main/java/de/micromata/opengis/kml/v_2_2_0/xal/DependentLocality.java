
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
@XmlType(name = "DependentLocalityType", propOrder = {
    "addressLine",
    "dependentLocalityName",
    "dependentLocalityNumber",
    "postBox",
    "largeMailUser",
    "postOffice",
    "postalRoute",
    "thoroughfare",
    "premise",
    "dependentLocality",
    "postalCode",
    "any"
})
@XmlRootElement(name = "DependentLocality", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
public class DependentLocality implements Cloneable
{

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "DependentLocalityName")
    protected List<DependentLocality.DependentLocalityName> dependentLocalityName;
    @XmlElement(name = "DependentLocalityNumber")
    protected DependentLocality.DependentLocalityNumber dependentLocalityNumber;
    @XmlElement(name = "PostBox")
    protected PostBox postBox;
    @XmlElement(name = "LargeMailUser")
    protected LargeMailUser largeMailUser;
    @XmlElement(name = "PostOffice")
    protected PostOffice postOffice;
    @XmlElement(name = "PostalRoute")
    protected PostalRoute postalRoute;
    @XmlElement(name = "Thoroughfare")
    protected Thoroughfare thoroughfare;
    @XmlElement(name = "Premise")
    protected Premise premise;
    @XmlElement(name = "DependentLocality")
    protected DependentLocality dependentLocality;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAttribute(name = "UsageType")
    @XmlSchemaType(name = "anySimpleType")
    protected String usage;
    @XmlAttribute(name = "Connector")
    @XmlSchemaType(name = "anySimpleType")
    protected String connector;
    @XmlAttribute(name = "Indicator")
    @XmlSchemaType(name = "anySimpleType")
    protected String indicator;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Value constructor with only mandatory fields
     * 
     * @param postBox
     *     required parameter
     * @param postOffice
     *     required parameter
     * @param postalRoute
     *     required parameter
     * @param largeMailUser
     *     required parameter
     */
    public DependentLocality(final PostBox postBox, final LargeMailUser largeMailUser, final PostOffice postOffice, final PostalRoute postalRoute) {
        super();
        this.postBox = postBox;
        this.largeMailUser = largeMailUser;
        this.postOffice = postOffice;
        this.postalRoute = postalRoute;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private DependentLocality() {
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
    public List<DependentLocality.DependentLocalityName> getDependentLocalityName() {
        if (dependentLocalityName == null) {
            dependentLocalityName = new ArrayList<DependentLocality.DependentLocalityName>();
        }
        return this.dependentLocalityName;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link DependentLocality.DependentLocalityNumber}
     *     
     */
    public DependentLocality.DependentLocalityNumber getDependentLocalityNumber() {
        return dependentLocalityNumber;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link DependentLocality.DependentLocalityNumber}
     *     
     */
    public void setDependentLocalityNumber(DependentLocality.DependentLocalityNumber value) {
        this.dependentLocalityNumber = value;
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
     *     {@link LargeMailUser}
     *     
     */
    public LargeMailUser getLargeMailUser() {
        return largeMailUser;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link LargeMailUser}
     *     
     */
    public void setLargeMailUser(LargeMailUser value) {
        this.largeMailUser = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link PostOffice}
     *     
     */
    public PostOffice getPostOffice() {
        return postOffice;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link PostOffice}
     *     
     */
    public void setPostOffice(PostOffice value) {
        this.postOffice = value;
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
     *     {@link Thoroughfare}
     *     
     */
    public Thoroughfare getThoroughfare() {
        return thoroughfare;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Thoroughfare}
     *     
     */
    public void setThoroughfare(Thoroughfare value) {
        this.thoroughfare = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Premise}
     *     
     */
    public Premise getPremise() {
        return premise;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Premise}
     *     
     */
    public void setPremise(Premise value) {
        this.premise = value;
    }

    public DependentLocality getDependentLocality() {
        return dependentLocality;
    }

    public void setDependentLocality(DependentLocality value) {
        this.dependentLocality = value;
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
    public String getUsage() {
        return usage;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getConnector() {
        return connector;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setConnector(String value) {
        this.connector = value;
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

        DependentLocality that = (DependentLocality) object;
        return Objects.equals(addressLine, that.addressLine)
                && Objects.equals(dependentLocalityName, that.dependentLocalityName)
                && Objects.equals(dependentLocalityNumber, that.dependentLocalityNumber)
                && Objects.equals(postBox, that.postBox)
                && Objects.equals(largeMailUser, that.largeMailUser)
                && Objects.equals(postOffice, that.postOffice)
                && Objects.equals(postalRoute, that.postalRoute)
                && Objects.equals(thoroughfare, that.thoroughfare)
                && Objects.equals(premise, that.premise)
                && Objects.equals(dependentLocality, that.dependentLocality)
                && Objects.equals(postalCode, that.postalCode)
                && Objects.equals(any, that.any)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(usage, that.usage)
                && Objects.equals(connector, that.connector)
                && Objects.equals(indicator, that.indicator)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(addressLine);
        result = 31 * result + Objects.hashCode(dependentLocalityName);
        result = 31 * result + Objects.hashCode(dependentLocalityNumber);
        result = 31 * result + Objects.hashCode(postBox);
        result = 31 * result + Objects.hashCode(largeMailUser);
        result = 31 * result + Objects.hashCode(postOffice);
        result = 31 * result + Objects.hashCode(postalRoute);
        result = 31 * result + Objects.hashCode(thoroughfare);
        result = 31 * result + Objects.hashCode(premise);
        result = 31 * result + Objects.hashCode(dependentLocality);
        result = 31 * result + Objects.hashCode(postalCode);
        result = 31 * result + Objects.hashCode(any);
        result = 31 * result + Objects.hashCode(underscore);
        result = 31 * result + Objects.hashCode(usage);
        result = 31 * result + Objects.hashCode(connector);
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
     * Creates a new instance of {@link DependentLocality.DependentLocalityName} and adds it to dependentLocalityName.
     * This method is a short version for:
     * {@code
     * DependentLocalityName dependentLocalityName = new DependentLocalityName();
     * this.getDependentLocalityName().add(dependentLocalityName); }
     * 
     * 
     */
    public DependentLocality.DependentLocalityName createAndAddDependentLocalityName() {
        DependentLocality.DependentLocalityName newValue = new DependentLocality.DependentLocalityName();
        this.getDependentLocalityName().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link DependentLocality.DependentLocalityNumber} and set it to dependentLocalityNumber.
     * 
     * This method is a short version for:
     * {@code
     * DependentLocalityNumber dependentLocalityNumber = new DependentLocalityNumber();
     * this.setDependentLocalityNumber(dependentLocalityNumber); }
     * 
     * 
     */
    public DependentLocality.DependentLocalityNumber createAndSetDependentLocalityNumber() {
        DependentLocality.DependentLocalityNumber newValue = new DependentLocality.DependentLocalityNumber();
        this.setDependentLocalityNumber(newValue);
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
     * Creates a new instance of {@link LargeMailUser} and set it to largeMailUser.
     * 
     * This method is a short version for:
     * {@code
     * LargeMailUser largeMailUser = new LargeMailUser();
     * this.setLargeMailUser(largeMailUser); }
     * 
     * 
     */
    public LargeMailUser createAndSetLargeMailUser() {
        LargeMailUser newValue = new LargeMailUser();
        this.setLargeMailUser(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PostOffice} and set it to postOffice.
     * 
     * This method is a short version for:
     * {@code
     * PostOffice postOffice = new PostOffice();
     * this.setPostOffice(postOffice); }
     * 
     * 
     */
    public PostOffice createAndSetPostOffice() {
        PostOffice newValue = new PostOffice();
        this.setPostOffice(newValue);
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
     * Creates a new instance of {@link Thoroughfare} and set it to thoroughfare.
     * 
     * This method is a short version for:
     * {@code
     * Thoroughfare thoroughfare = new Thoroughfare();
     * this.setThoroughfare(thoroughfare); }
     * 
     * 
     * @param postalCode
     *     required parameter
     * @param premise
     *     required parameter
     * @param firm
     *     required parameter
     * @param dependentLocality
     *     required parameter
     */
    public Thoroughfare createAndSetThoroughfare(final DependentLocality dependentLocality, final Premise premise, final Firm firm, final PostalCode postalCode) {
        Thoroughfare newValue = new Thoroughfare(dependentLocality, premise, firm, postalCode);
        this.setThoroughfare(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Premise} and set it to premise.
     * 
     * This method is a short version for:
     * {@code
     * Premise premise = new Premise();
     * this.setPremise(premise); }
     * 
     * 
     * @param premiseNumber
     *     required parameter
     * @param premiseNumberRange
     *     required parameter
     * @param premiseLocation
     *     required parameter
     */
    public Premise createAndSetPremise(final Premise.PremiseLocation premiseLocation, final List<PremiseNumber> premiseNumber, final Premise.PremiseNumberRange premiseNumberRange) {
        Premise newValue = new Premise(premiseLocation, premiseNumber, premiseNumberRange);
        this.setPremise(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of DependentLocality and set it to dependentLocality.
     * 
     * This method is a short version for:
     * {@code
     * DependentLocality dependentLocality = new DependentLocality();
     * this.setDependentLocality(dependentLocality); }
     * 
     * 
     * @param postBox
     *     required parameter
     * @param postOffice
     *     required parameter
     * @param postalRoute
     *     required parameter
     * @param largeMailUser
     *     required parameter
     */
    public DependentLocality createAndSetDependentLocality(final PostBox postBox, final LargeMailUser largeMailUser, final PostOffice postOffice, final PostalRoute postalRoute) {
        DependentLocality newValue = new DependentLocality(postBox, largeMailUser, postOffice, postalRoute);
        this.setDependentLocality(newValue);
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
    public DependentLocality addToAddressLine(final AddressLine addressLine) {
        this.getAddressLine().add(addressLine);
        return this;
    }

    /**
     * Sets the value of the dependentLocalityName property Objects of the following type(s) are allowed in the list {@code List<DependentLocalityName>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withDependentLocalityName} instead.
     * 
     * 
     * @param dependentLocalityName
     *     Objects of the following type are allowed in the list: {@link DependentLocality.DependentLocalityName}
     */
    public void setDependentLocalityName(final List<DependentLocality.DependentLocalityName> dependentLocalityName) {
        this.dependentLocalityName = dependentLocalityName;
    }

    /**
     * add a value to the dependentLocalityName property collection
     * 
     * @param dependentLocalityName
     *     Objects of the following type are allowed in the list: {@link DependentLocality.DependentLocalityName}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public DependentLocality addToDependentLocalityName(final DependentLocality.DependentLocalityName dependentLocalityName) {
        this.getDependentLocalityName().add(dependentLocalityName);
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
    public DependentLocality addToAny(final Object any) {
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
    public DependentLocality withAddressLine(final List<AddressLine> addressLine) {
        this.setAddressLine(addressLine);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param dependentLocalityName
     *     required parameter
     */
    public DependentLocality withDependentLocalityName(final List<DependentLocality.DependentLocalityName> dependentLocalityName) {
        this.setDependentLocalityName(dependentLocalityName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param dependentLocalityNumber
     *     required parameter
     */
    public DependentLocality withDependentLocalityNumber(final DependentLocality.DependentLocalityNumber dependentLocalityNumber) {
        this.setDependentLocalityNumber(dependentLocalityNumber);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param thoroughfare
     *     required parameter
     */
    public DependentLocality withThoroughfare(final Thoroughfare thoroughfare) {
        this.setThoroughfare(thoroughfare);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premise
     *     required parameter
     */
    public DependentLocality withPremise(final Premise premise) {
        this.setPremise(premise);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param dependentLocality
     *     required parameter
     */
    public DependentLocality withDependentLocality(final DependentLocality dependentLocality) {
        this.setDependentLocality(dependentLocality);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param postalCode
     *     required parameter
     */
    public DependentLocality withPostalCode(final PostalCode postalCode) {
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
    public DependentLocality withAny(final List<Object> any) {
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
    public DependentLocality withUnderscore(final String underscore) {
        this.setUnderscore(underscore);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param usage
     *     required parameter
     */
    public DependentLocality withUsage(final String usage) {
        this.setUsage(usage);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param connector
     *     required parameter
     */
    public DependentLocality withConnector(final String connector) {
        this.setConnector(connector);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param indicator
     *     required parameter
     */
    public DependentLocality withIndicator(final String indicator) {
        this.setIndicator(indicator);
        return this;
    }

    @Override
    public DependentLocality clone() {
        DependentLocality copy;
        try {
            copy = ((DependentLocality) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
        for (AddressLine iter: addressLine) {
            copy.addressLine.add(iter.clone());
        }
        copy.dependentLocalityName = new ArrayList<DependentLocality.DependentLocalityName>((getDependentLocalityName().size()));
        for (DependentLocality.DependentLocalityName iter: dependentLocalityName) {
            copy.dependentLocalityName.add(iter.clone());
        }
        copy.dependentLocalityNumber = ((dependentLocalityNumber == null)?null:((DependentLocality.DependentLocalityNumber) dependentLocalityNumber.clone()));
        copy.postBox = ((postBox == null)?null:((PostBox) postBox.clone()));
        copy.largeMailUser = ((largeMailUser == null)?null:((LargeMailUser) largeMailUser.clone()));
        copy.postOffice = ((postOffice == null)?null:((PostOffice) postOffice.clone()));
        copy.postalRoute = ((postalRoute == null)?null:((PostalRoute) postalRoute.clone()));
        copy.thoroughfare = ((thoroughfare == null)?null:((Thoroughfare) thoroughfare.clone()));
        copy.premise = ((premise == null)?null:((Premise) premise.clone()));
        copy.dependentLocality = ((dependentLocality == null)?null:((DependentLocality) dependentLocality.clone()));
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
    @XmlRootElement(name = "DependentLocalityName", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class DependentLocalityName implements Cloneable
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

        public DependentLocalityName() {
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
            if ((obj instanceof DependentLocality.DependentLocalityName) == false) {
                return false;
            }
            DependentLocality.DependentLocalityName other = ((DependentLocality.DependentLocalityName) obj);
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
        public DependentLocality.DependentLocalityName withContent(final String content) {
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
        public DependentLocality.DependentLocalityName withUnderscore(final String underscore) {
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
        public DependentLocality.DependentLocalityName withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public DependentLocality.DependentLocalityName clone() {
            DependentLocality.DependentLocalityName copy;
            try {
                copy = ((DependentLocality.DependentLocalityName) super.clone());
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
    @XmlRootElement(name = "DependentLocalityNumber", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class DependentLocalityNumber implements Cloneable
    {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "NameNumberOccurrence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nameNumberOccurrence;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        public DependentLocalityNumber() {
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
        public String getNameNumberOccurrence() {
            return nameNumberOccurrence;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link String}
         *     
         */
        public void setNameNumberOccurrence(String value) {
            this.nameNumberOccurrence = value;
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
            result = ((prime*result)+((nameNumberOccurrence == null)? 0 :nameNumberOccurrence.hashCode()));
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
            if ((obj instanceof DependentLocality.DependentLocalityNumber) == false) {
                return false;
            }
            DependentLocality.DependentLocalityNumber other = ((DependentLocality.DependentLocalityNumber) obj);
            if (content == null) {
                if (other.content!= null) {
                    return false;
                }
            } else {
                if (content.equals(other.content) == false) {
                    return false;
                }
            }
            if (nameNumberOccurrence == null) {
                if (other.nameNumberOccurrence!= null) {
                    return false;
                }
            } else {
                if (nameNumberOccurrence.equals(other.nameNumberOccurrence) == false) {
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
        public DependentLocality.DependentLocalityNumber withContent(final String content) {
            this.setContent(content);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param nameNumberOccurrence
         *     required parameter
         */
        public DependentLocality.DependentLocalityNumber withNameNumberOccurrence(final String nameNumberOccurrence) {
            this.setNameNumberOccurrence(nameNumberOccurrence);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param code
         *     required parameter
         */
        public DependentLocality.DependentLocalityNumber withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public DependentLocality.DependentLocalityNumber clone() {
            DependentLocality.DependentLocalityNumber copy;
            try {
                copy = ((DependentLocality.DependentLocalityNumber) super.clone());
            } catch (CloneNotSupportedException _x) {
                throw new InternalError((_x.toString()));
            }
            return copy;
        }

    }

}
