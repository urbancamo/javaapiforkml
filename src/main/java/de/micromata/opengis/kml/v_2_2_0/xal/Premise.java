
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
    "premiseName",
    "premiseLocation",
    "premiseNumber",
    "premiseNumberRange",
    "premiseNumberPrefix",
    "premiseNumberSuffix",
    "buildingName",
    "subPremise",
    "firm",
    "mailStop",
    "postalCode",
    "premise",
    "any"
})
@XmlRootElement(name = "Premise")
public class Premise implements Cloneable
{

    @XmlElement(name = "AddressLine")
    protected List<AddressLine> addressLine;
    @XmlElement(name = "PremiseName")
    protected List<Premise.PremiseName> premiseName;
    @XmlElement(name = "PremiseLocation")
    protected Premise.PremiseLocation premiseLocation;
    @XmlElement(name = "PremiseNumber")
    protected List<PremiseNumber> premiseNumber;
    @XmlElement(name = "PremiseNumberRange")
    protected Premise.PremiseNumberRange premiseNumberRange;
    @XmlElement(name = "PremiseNumberPrefix")
    protected List<PremiseNumberPrefix> premiseNumberPrefix;
    @XmlElement(name = "PremiseNumberSuffix")
    protected List<PremiseNumberSuffix> premiseNumberSuffix;
    @XmlElement(name = "BuildingName")
    protected List<BuildingName> buildingName;
    @XmlElement(name = "SubPremise")
    protected List<SubPremise> subPremise;
    @XmlElement(name = "Firm")
    protected Firm firm;
    @XmlElement(name = "MailStop")
    protected MailStop mailStop;
    @XmlElement(name = "PostalCode")
    protected PostalCode postalCode;
    @XmlElement(name = "Premise")
    protected Premise premise;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String underscore;
    @XmlAttribute(name = "PremiseDependency")
    @XmlSchemaType(name = "anySimpleType")
    protected String xalPremiseDependency;
    @XmlAttribute(name = "PremiseDependencyType")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiseDependency;
    @XmlAttribute(name = "PremiseThoroughfareConnector")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiseThoroughfareConnector;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Value constructor with only mandatory fields
     * 
     * @param premiseNumber
     *     required parameter
     * @param premiseNumberRange
     *     required parameter
     * @param premiseLocation
     *     required parameter
     */
    public Premise(final Premise.PremiseLocation premiseLocation, final List<PremiseNumber> premiseNumber, final Premise.PremiseNumberRange premiseNumberRange) {
        super();
        this.premiseLocation = premiseLocation;
        this.premiseNumber = premiseNumber;
        this.premiseNumberRange = premiseNumberRange;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private Premise() {
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
    public List<Premise.PremiseName> getPremiseName() {
        if (premiseName == null) {
            premiseName = new ArrayList<Premise.PremiseName>();
        }
        return this.premiseName;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Premise.PremiseLocation}
     *     
     */
    public Premise.PremiseLocation getPremiseLocation() {
        return premiseLocation;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Premise.PremiseLocation}
     *     
     */
    public void setPremiseLocation(Premise.PremiseLocation value) {
        this.premiseLocation = value;
    }

    /**
     * 
     */
    public List<PremiseNumber> getPremiseNumber() {
        if (premiseNumber == null) {
            premiseNumber = new ArrayList<PremiseNumber>();
        }
        return this.premiseNumber;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Premise.PremiseNumberRange}
     *     
     */
    public Premise.PremiseNumberRange getPremiseNumberRange() {
        return premiseNumberRange;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Premise.PremiseNumberRange}
     *     
     */
    public void setPremiseNumberRange(Premise.PremiseNumberRange value) {
        this.premiseNumberRange = value;
    }

    /**
     * 
     */
    public List<PremiseNumberPrefix> getPremiseNumberPrefix() {
        if (premiseNumberPrefix == null) {
            premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>();
        }
        return this.premiseNumberPrefix;
    }

    /**
     * 
     */
    public List<PremiseNumberSuffix> getPremiseNumberSuffix() {
        if (premiseNumberSuffix == null) {
            premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>();
        }
        return this.premiseNumberSuffix;
    }

    /**
     * 
     */
    public List<BuildingName> getBuildingName() {
        if (buildingName == null) {
            buildingName = new ArrayList<BuildingName>();
        }
        return this.buildingName;
    }

    /**
     * 
     */
    public List<SubPremise> getSubPremise() {
        if (subPremise == null) {
            subPremise = new ArrayList<SubPremise>();
        }
        return this.subPremise;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Firm}
     *     
     */
    public Firm getFirm() {
        return firm;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Firm}
     *     
     */
    public void setFirm(Firm value) {
        this.firm = value;
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

    public Premise getPremise() {
        return premise;
    }

    public void setPremise(Premise value) {
        this.premise = value;
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
    public String getXalPremiseDependency() {
        return xalPremiseDependency;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setXalPremiseDependency(String value) {
        this.xalPremiseDependency = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getPremiseDependency() {
        return premiseDependency;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setPremiseDependency(String value) {
        this.premiseDependency = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getPremiseThoroughfareConnector() {
        return premiseThoroughfareConnector;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setPremiseThoroughfareConnector(String value) {
        this.premiseThoroughfareConnector = value;
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

        Premise that = (Premise) object;
        return Objects.equals(addressLine, that.addressLine)
                && Objects.equals(premiseName, that.premiseName)
                && Objects.equals(premiseLocation, that.premiseLocation)
                && Objects.equals(premiseNumber, that.premiseNumber)
                && Objects.equals(premiseNumberRange, that.premiseNumberRange)
                && Objects.equals(premiseNumberPrefix, that.premiseNumberPrefix)
                && Objects.equals(premiseNumberSuffix, that.premiseNumberSuffix)
                && Objects.equals(buildingName, that.buildingName)
                && Objects.equals(subPremise, that.subPremise)
                && Objects.equals(firm, that.firm)
                && Objects.equals(mailStop, that.mailStop)
                && Objects.equals(postalCode, that.postalCode)
                && Objects.equals(premise, that.premise)
                && Objects.equals(any, that.any)
                && Objects.equals(underscore, that.underscore)
                && Objects.equals(xalPremiseDependency, that.xalPremiseDependency)
                && Objects.equals(premiseDependency, that.premiseDependency)
                && Objects.equals(premiseThoroughfareConnector, that.premiseThoroughfareConnector)
                && Objects.equals(otherAttributes, that.otherAttributes);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(addressLine);
        result = 31 * result + Objects.hashCode(premiseName);
        result = 31 * result + Objects.hashCode(premiseLocation);
        result = 31 * result + Objects.hashCode(premiseNumber);
        result = 31 * result + Objects.hashCode(premiseNumberRange);
        result = 31 * result + Objects.hashCode(premiseNumberPrefix);
        result = 31 * result + Objects.hashCode(premiseNumberSuffix);
        result = 31 * result + Objects.hashCode(buildingName);
        result = 31 * result + Objects.hashCode(subPremise);
        result = 31 * result + Objects.hashCode(firm);
        result = 31 * result + Objects.hashCode(mailStop);
        result = 31 * result + Objects.hashCode(postalCode);
        result = 31 * result + Objects.hashCode(premise);
        result = 31 * result + Objects.hashCode(any);
        result = 31 * result + Objects.hashCode(underscore);
        result = 31 * result + Objects.hashCode(xalPremiseDependency);
        result = 31 * result + Objects.hashCode(premiseDependency);
        result = 31 * result + Objects.hashCode(premiseThoroughfareConnector);
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
     * Creates a new instance of {@link Premise.PremiseName} and adds it to premiseName.
     * This method is a short version for:
     * {@code
     * PremiseName premiseName = new PremiseName();
     * this.getPremiseName().add(premiseName); }
     * 
     * 
     */
    public Premise.PremiseName createAndAddPremiseName() {
        Premise.PremiseName newValue = new Premise.PremiseName();
        this.getPremiseName().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Premise.PremiseLocation} and set it to premiseLocation.
     * 
     * This method is a short version for:
     * {@code
     * PremiseLocation premiseLocation = new PremiseLocation();
     * this.setPremiseLocation(premiseLocation); }
     * 
     * 
     */
    public Premise.PremiseLocation createAndSetPremiseLocation() {
        Premise.PremiseLocation newValue = new Premise.PremiseLocation();
        this.setPremiseLocation(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PremiseNumber} and adds it to premiseNumber.
     * This method is a short version for:
     * {@code
     * PremiseNumber premiseNumber = new PremiseNumber();
     * this.getPremiseNumber().add(premiseNumber); }
     * 
     * 
     */
    public PremiseNumber createAndAddPremiseNumber() {
        PremiseNumber newValue = new PremiseNumber();
        this.getPremiseNumber().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Premise.PremiseNumberRange} and set it to premiseNumberRange.
     * 
     * This method is a short version for:
     * {@code
     * PremiseNumberRange premiseNumberRange = new PremiseNumberRange();
     * this.setPremiseNumberRange(premiseNumberRange); }
     * 
     * 
     * @param premiseNumberRangeTo
     *     required parameter
     * @param premiseNumberRangeFrom
     *     required parameter
     */
    public Premise.PremiseNumberRange createAndSetPremiseNumberRange(final Premise.PremiseNumberRange.PremiseNumberRangeFrom premiseNumberRangeFrom, final Premise.PremiseNumberRange.PremiseNumberRangeTo premiseNumberRangeTo) {
        Premise.PremiseNumberRange newValue = new Premise.PremiseNumberRange(premiseNumberRangeFrom, premiseNumberRangeTo);
        this.setPremiseNumberRange(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PremiseNumberPrefix} and adds it to premiseNumberPrefix.
     * This method is a short version for:
     * {@code
     * PremiseNumberPrefix premiseNumberPrefix = new PremiseNumberPrefix();
     * this.getPremiseNumberPrefix().add(premiseNumberPrefix); }
     * 
     * 
     */
    public PremiseNumberPrefix createAndAddPremiseNumberPrefix() {
        PremiseNumberPrefix newValue = new PremiseNumberPrefix();
        this.getPremiseNumberPrefix().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PremiseNumberSuffix} and adds it to premiseNumberSuffix.
     * This method is a short version for:
     * {@code
     * PremiseNumberSuffix premiseNumberSuffix = new PremiseNumberSuffix();
     * this.getPremiseNumberSuffix().add(premiseNumberSuffix); }
     * 
     * 
     */
    public PremiseNumberSuffix createAndAddPremiseNumberSuffix() {
        PremiseNumberSuffix newValue = new PremiseNumberSuffix();
        this.getPremiseNumberSuffix().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link BuildingName} and adds it to buildingName.
     * This method is a short version for:
     * {@code
     * BuildingName buildingName = new BuildingName();
     * this.getBuildingName().add(buildingName); }
     * 
     * 
     */
    public BuildingName createAndAddBuildingName() {
        BuildingName newValue = new BuildingName();
        this.getBuildingName().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link SubPremise} and adds it to subPremise.
     * This method is a short version for:
     * {@code
     * SubPremise subPremise = new SubPremise();
     * this.getSubPremise().add(subPremise); }
     * 
     * 
     * @param subPremiseLocation
     *     required parameter
     */
    public SubPremise createAndAddSubPremise(final SubPremise.SubPremiseLocation subPremiseLocation) {
        SubPremise newValue = new SubPremise(subPremiseLocation);
        this.getSubPremise().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Firm} and set it to firm.
     * 
     * This method is a short version for:
     * {@code
     * Firm firm = new Firm();
     * this.setFirm(firm); }
     * 
     * 
     */
    public Firm createAndSetFirm() {
        Firm newValue = new Firm();
        this.setFirm(newValue);
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
     * Creates a new instance of Premise and set it to premise.
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
    public Premise addToAddressLine(final AddressLine addressLine) {
        this.getAddressLine().add(addressLine);
        return this;
    }

    /**
     * Sets the value of the premiseName property Objects of the following type(s) are allowed in the list {@code List<PremiseName>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseName} instead.
     * 
     * 
     * @param premiseName
     *     Objects of the following type are allowed in the list: {@link Premise.PremiseName}
     */
    public void setPremiseName(final List<Premise.PremiseName> premiseName) {
        this.premiseName = premiseName;
    }

    /**
     * add a value to the premiseName property collection
     * 
     * @param premiseName
     *     Objects of the following type are allowed in the list: {@link Premise.PremiseName}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Premise addToPremiseName(final Premise.PremiseName premiseName) {
        this.getPremiseName().add(premiseName);
        return this;
    }

    /**
     * Sets the value of the premiseNumber property Objects of the following type(s) are allowed in the list {@code List<PremiseNumber>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withPremiseNumber instead.
     * 
     * 
     * @param premiseNumber
     *     Objects of the following type are allowed in the list: {@link PremiseNumber}
     */
    public void setPremiseNumber(final List<PremiseNumber> premiseNumber) {
        this.premiseNumber = premiseNumber;
    }

    /**
     * add a value to the premiseNumber property collection
     * 
     * @param premiseNumber
     *     Objects of the following type are allowed in the list: {@link PremiseNumber}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Premise addToPremiseNumber(final PremiseNumber premiseNumber) {
        this.getPremiseNumber().add(premiseNumber);
        return this;
    }

    /**
     * Sets the value of the premiseNumberPrefix property Objects of the following type(s) are allowed in the list {@code List<PremiseNumberPrefix>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseNumberPrefix} instead.
     * 
     * 
     * @param premiseNumberPrefix
     *     Objects of the following type are allowed in the list: {@link PremiseNumberPrefix}
     */
    public void setPremiseNumberPrefix(final List<PremiseNumberPrefix> premiseNumberPrefix) {
        this.premiseNumberPrefix = premiseNumberPrefix;
    }

    /**
     * add a value to the premiseNumberPrefix property collection
     * 
     * @param premiseNumberPrefix
     *     Objects of the following type are allowed in the list: {@link PremiseNumberPrefix}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Premise addToPremiseNumberPrefix(final PremiseNumberPrefix premiseNumberPrefix) {
        this.getPremiseNumberPrefix().add(premiseNumberPrefix);
        return this;
    }

    /**
     * Sets the value of the premiseNumberSuffix property Objects of the following type(s) are allowed in the list {@code List<PremiseNumberSuffix>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseNumberSuffix} instead.
     * 
     * 
     * @param premiseNumberSuffix
     *     Objects of the following type are allowed in the list: {@link PremiseNumberSuffix}
     */
    public void setPremiseNumberSuffix(final List<PremiseNumberSuffix> premiseNumberSuffix) {
        this.premiseNumberSuffix = premiseNumberSuffix;
    }

    /**
     * add a value to the premiseNumberSuffix property collection
     * 
     * @param premiseNumberSuffix
     *     Objects of the following type are allowed in the list: {@link PremiseNumberSuffix}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Premise addToPremiseNumberSuffix(final PremiseNumberSuffix premiseNumberSuffix) {
        this.getPremiseNumberSuffix().add(premiseNumberSuffix);
        return this;
    }

    /**
     * Sets the value of the buildingName property Objects of the following type(s) are allowed in the list {@code List<BuildingName>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withBuildingName} instead.
     * 
     * 
     * @param buildingName
     *     Objects of the following type are allowed in the list: {@link BuildingName}
     */
    public void setBuildingName(final List<BuildingName> buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * add a value to the buildingName property collection
     * 
     * @param buildingName
     *     Objects of the following type are allowed in the list: {@link BuildingName}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Premise addToBuildingName(final BuildingName buildingName) {
        this.getBuildingName().add(buildingName);
        return this;
    }

    /**
     * Sets the value of the subPremise property Objects of the following type(s) are allowed in the list {@code List<SubPremise>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withSubPremise} instead.
     * 
     * 
     * @param subPremise
     *     Objects of the following type are allowed in the list: {@link SubPremise}
     */
    public void setSubPremise(final List<SubPremise> subPremise) {
        this.subPremise = subPremise;
    }

    /**
     * add a value to the subPremise property collection
     * 
     * @param subPremise
     *     Objects of the following type are allowed in the list: {@link SubPremise}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Premise addToSubPremise(final SubPremise subPremise) {
        this.getSubPremise().add(subPremise);
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
    public Premise addToAny(final Object any) {
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
    public Premise withAddressLine(final List<AddressLine> addressLine) {
        this.setAddressLine(addressLine);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premiseName
     *     required parameter
     */
    public Premise withPremiseName(final List<Premise.PremiseName> premiseName) {
        this.setPremiseName(premiseName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premiseNumberPrefix
     *     required parameter
     */
    public Premise withPremiseNumberPrefix(final List<PremiseNumberPrefix> premiseNumberPrefix) {
        this.setPremiseNumberPrefix(premiseNumberPrefix);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premiseNumberSuffix
     *     required parameter
     */
    public Premise withPremiseNumberSuffix(final List<PremiseNumberSuffix> premiseNumberSuffix) {
        this.setPremiseNumberSuffix(premiseNumberSuffix);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param buildingName
     *     required parameter
     */
    public Premise withBuildingName(final List<BuildingName> buildingName) {
        this.setBuildingName(buildingName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param subPremise
     *     required parameter
     */
    public Premise withSubPremise(final List<SubPremise> subPremise) {
        this.setSubPremise(subPremise);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param firm
     *     required parameter
     */
    public Premise withFirm(final Firm firm) {
        this.setFirm(firm);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param mailStop
     *     required parameter
     */
    public Premise withMailStop(final MailStop mailStop) {
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
    public Premise withPostalCode(final PostalCode postalCode) {
        this.setPostalCode(postalCode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premise
     *     required parameter
     */
    public Premise withPremise(final Premise premise) {
        this.setPremise(premise);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param any
     *     required parameter
     */
    public Premise withAny(final List<Object> any) {
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
    public Premise withUnderscore(final String underscore) {
        this.setUnderscore(underscore);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param xalPremiseDependency
     *     required parameter
     */
    public Premise withXalPremiseDependency(final String xalPremiseDependency) {
        this.setXalPremiseDependency(xalPremiseDependency);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premiseDependency
     *     required parameter
     */
    public Premise withPremiseDependency(final String premiseDependency) {
        this.setPremiseDependency(premiseDependency);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param premiseThoroughfareConnector
     *     required parameter
     */
    public Premise withPremiseThoroughfareConnector(final String premiseThoroughfareConnector) {
        this.setPremiseThoroughfareConnector(premiseThoroughfareConnector);
        return this;
    }

    @Override
    public Premise clone() {
        Premise copy;
        try {
            copy = ((Premise) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
        for (AddressLine iter: addressLine) {
            copy.addressLine.add(iter.clone());
        }
        copy.premiseName = new ArrayList<Premise.PremiseName>((getPremiseName().size()));
        for (Premise.PremiseName iter: premiseName) {
            copy.premiseName.add(iter.clone());
        }
        copy.premiseLocation = ((premiseLocation == null)?null:((Premise.PremiseLocation) premiseLocation.clone()));
        copy.premiseNumber = new ArrayList<PremiseNumber>((getPremiseNumber().size()));
        for (PremiseNumber iter: premiseNumber) {
            copy.premiseNumber.add(iter.clone());
        }
        copy.premiseNumberRange = ((premiseNumberRange == null)?null:((Premise.PremiseNumberRange) premiseNumberRange.clone()));
        copy.premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>((getPremiseNumberPrefix().size()));
        for (PremiseNumberPrefix iter: premiseNumberPrefix) {
            copy.premiseNumberPrefix.add(iter.clone());
        }
        copy.premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>((getPremiseNumberSuffix().size()));
        for (PremiseNumberSuffix iter: premiseNumberSuffix) {
            copy.premiseNumberSuffix.add(iter.clone());
        }
        copy.buildingName = new ArrayList<BuildingName>((getBuildingName().size()));
        for (BuildingName iter: buildingName) {
            copy.buildingName.add(iter.clone());
        }
        copy.subPremise = new ArrayList<SubPremise>((getSubPremise().size()));
        for (SubPremise iter: subPremise) {
            copy.subPremise.add(iter.clone());
        }
        copy.firm = ((firm == null)?null:((Firm) firm.clone()));
        copy.mailStop = ((mailStop == null)?null:((MailStop) mailStop.clone()));
        copy.postalCode = ((postalCode == null)?null:((PostalCode) postalCode.clone()));
        copy.premise = ((premise == null)?null:((Premise) premise.clone()));
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
    @XmlRootElement(name = "PremiseLocation", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PremiseLocation implements Cloneable
    {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        public PremiseLocation() {
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
            if ((obj instanceof Premise.PremiseLocation) == false) {
                return false;
            }
            Premise.PremiseLocation other = ((Premise.PremiseLocation) obj);
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
        public Premise.PremiseLocation withContent(final String content) {
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
        public Premise.PremiseLocation withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public Premise.PremiseLocation clone() {
            Premise.PremiseLocation copy;
            try {
                copy = ((Premise.PremiseLocation) super.clone());
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
    @XmlRootElement(name = "PremiseName", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PremiseName implements Cloneable
    {

        @XmlValue
        protected String content;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String underscore;
        @XmlAttribute(name = "TypeOccurrence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String typeOccurrence;
        @XmlAttribute(name = "Code")
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        public PremiseName() {
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
        public String getTypeOccurrence() {
            return typeOccurrence;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link String}
         *     
         */
        public void setTypeOccurrence(String value) {
            this.typeOccurrence = value;
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
            result = ((prime*result)+((typeOccurrence == null)? 0 :typeOccurrence.hashCode()));
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
            if ((obj instanceof Premise.PremiseName) == false) {
                return false;
            }
            Premise.PremiseName other = ((Premise.PremiseName) obj);
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
            if (typeOccurrence == null) {
                if (other.typeOccurrence!= null) {
                    return false;
                }
            } else {
                if (typeOccurrence.equals(other.typeOccurrence) == false) {
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
        public Premise.PremiseName withContent(final String content) {
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
        public Premise.PremiseName withUnderscore(final String underscore) {
            this.setUnderscore(underscore);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param typeOccurrence
         *     required parameter
         */
        public Premise.PremiseName withTypeOccurrence(final String typeOccurrence) {
            this.setTypeOccurrence(typeOccurrence);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param code
         *     required parameter
         */
        public Premise.PremiseName withCode(final String code) {
            this.setCode(code);
            return this;
        }

        @Override
        public Premise.PremiseName clone() {
            Premise.PremiseName copy;
            try {
                copy = ((Premise.PremiseName) super.clone());
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
        "premiseNumberRangeFrom",
        "premiseNumberRangeTo"
    })
    @XmlRootElement(name = "PremiseNumberRange", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    public static class PremiseNumberRange implements Cloneable
    {

        @XmlElement(name = "PremiseNumberRangeFrom", required = true)
        protected Premise.PremiseNumberRange.PremiseNumberRangeFrom premiseNumberRangeFrom;
        @XmlElement(name = "PremiseNumberRangeTo", required = true)
        protected Premise.PremiseNumberRange.PremiseNumberRangeTo premiseNumberRangeTo;
        @XmlAttribute(name = "RangeType")
        @XmlSchemaType(name = "anySimpleType")
        protected String range;
        @XmlAttribute(name = "Indicator")
        @XmlSchemaType(name = "anySimpleType")
        protected String indicator;
        @XmlAttribute(name = "Separator")
        @XmlSchemaType(name = "anySimpleType")
        protected String separator;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String underscore;
        @XmlAttribute(name = "IndicatorOccurence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String indicatorOccurence;
        @XmlAttribute(name = "NumberRangeOccurence")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String numberRangeOccurence;

        /**
         * Value constructor with only mandatory fields
         * 
         * @param premiseNumberRangeTo
         *     required parameter
         * @param premiseNumberRangeFrom
         *     required parameter
         */
        public PremiseNumberRange(final Premise.PremiseNumberRange.PremiseNumberRangeFrom premiseNumberRangeFrom, final Premise.PremiseNumberRange.PremiseNumberRangeTo premiseNumberRangeTo) {
            super();
            this.premiseNumberRangeFrom = premiseNumberRangeFrom;
            this.premiseNumberRangeTo = premiseNumberRangeTo;
        }

        /**
         * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
         * 
         */
        @Deprecated
        private PremiseNumberRange() {
            super();
        }

        /**
         * 
         * @return
         *     possible object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeFrom}
         *     
         */
        public Premise.PremiseNumberRange.PremiseNumberRangeFrom getPremiseNumberRangeFrom() {
            return premiseNumberRangeFrom;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeFrom}
         *     
         */
        public void setPremiseNumberRangeFrom(Premise.PremiseNumberRange.PremiseNumberRangeFrom value) {
            this.premiseNumberRangeFrom = value;
        }

        /**
         * 
         * @return
         *     possible object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeTo}
         *     
         */
        public Premise.PremiseNumberRange.PremiseNumberRangeTo getPremiseNumberRangeTo() {
            return premiseNumberRangeTo;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link Premise.PremiseNumberRange.PremiseNumberRangeTo}
         *     
         */
        public void setPremiseNumberRangeTo(Premise.PremiseNumberRange.PremiseNumberRangeTo value) {
            this.premiseNumberRangeTo = value;
        }

        /**
         * 
         * @return
         *     possible object is
         *     {@link String}
         *     
         */
        public String getRange() {
            return range;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link String}
         *     
         */
        public void setRange(String value) {
            this.range = value;
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
        public String getSeparator() {
            return separator;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link String}
         *     
         */
        public void setSeparator(String value) {
            this.separator = value;
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
        public String getIndicatorOccurence() {
            return indicatorOccurence;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link String}
         *     
         */
        public void setIndicatorOccurence(String value) {
            this.indicatorOccurence = value;
        }

        /**
         * 
         * @return
         *     possible object is
         *     {@link String}
         *     
         */
        public String getNumberRangeOccurence() {
            return numberRangeOccurence;
        }

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link String}
         *     
         */
        public void setNumberRangeOccurence(String value) {
            this.numberRangeOccurence = value;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = ((prime*result)+((premiseNumberRangeFrom == null)? 0 :premiseNumberRangeFrom.hashCode()));
            result = ((prime*result)+((premiseNumberRangeTo == null)? 0 :premiseNumberRangeTo.hashCode()));
            result = ((prime*result)+((range == null)? 0 :range.hashCode()));
            result = ((prime*result)+((indicator == null)? 0 :indicator.hashCode()));
            result = ((prime*result)+((separator == null)? 0 :separator.hashCode()));
            result = ((prime*result)+((underscore == null)? 0 :underscore.hashCode()));
            result = ((prime*result)+((indicatorOccurence == null)? 0 :indicatorOccurence.hashCode()));
            result = ((prime*result)+((numberRangeOccurence == null)? 0 :numberRangeOccurence.hashCode()));
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
            if ((obj instanceof Premise.PremiseNumberRange) == false) {
                return false;
            }
            Premise.PremiseNumberRange other = ((Premise.PremiseNumberRange) obj);
            if (premiseNumberRangeFrom == null) {
                if (other.premiseNumberRangeFrom!= null) {
                    return false;
                }
            } else {
                if (premiseNumberRangeFrom.equals(other.premiseNumberRangeFrom) == false) {
                    return false;
                }
            }
            if (premiseNumberRangeTo == null) {
                if (other.premiseNumberRangeTo!= null) {
                    return false;
                }
            } else {
                if (premiseNumberRangeTo.equals(other.premiseNumberRangeTo) == false) {
                    return false;
                }
            }
            if (range == null) {
                if (other.range!= null) {
                    return false;
                }
            } else {
                if (range.equals(other.range) == false) {
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
            if (separator == null) {
                if (other.separator!= null) {
                    return false;
                }
            } else {
                if (separator.equals(other.separator) == false) {
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
            if (indicatorOccurence == null) {
                if (other.indicatorOccurence!= null) {
                    return false;
                }
            } else {
                if (indicatorOccurence.equals(other.indicatorOccurence) == false) {
                    return false;
                }
            }
            if (numberRangeOccurence == null) {
                if (other.numberRangeOccurence!= null) {
                    return false;
                }
            } else {
                if (numberRangeOccurence.equals(other.numberRangeOccurence) == false) {
                    return false;
                }
            }
            return true;
        }

        /**
         * Creates a new instance of {@link Premise.PremiseNumberRange.PremiseNumberRangeFrom} and set it to premiseNumberRangeFrom.
         * 
         * This method is a short version for:
         * {@code
         * PremiseNumberRangeFrom premiseNumberRangeFrom = new PremiseNumberRangeFrom();
         * this.setPremiseNumberRangeFrom(premiseNumberRangeFrom); }
         * 
         * 
         * @param premiseNumber
         *     required parameter
         */
        public Premise.PremiseNumberRange.PremiseNumberRangeFrom createAndSetPremiseNumberRangeFrom(final List<PremiseNumber> premiseNumber) {
            Premise.PremiseNumberRange.PremiseNumberRangeFrom newValue = new Premise.PremiseNumberRange.PremiseNumberRangeFrom(premiseNumber);
            this.setPremiseNumberRangeFrom(newValue);
            return newValue;
        }

        /**
         * Creates a new instance of {@link Premise.PremiseNumberRange.PremiseNumberRangeTo} and set it to premiseNumberRangeTo.
         * 
         * This method is a short version for:
         * {@code
         * PremiseNumberRangeTo premiseNumberRangeTo = new PremiseNumberRangeTo();
         * this.setPremiseNumberRangeTo(premiseNumberRangeTo); }
         * 
         * 
         * @param premiseNumber
         *     required parameter
         */
        public Premise.PremiseNumberRange.PremiseNumberRangeTo createAndSetPremiseNumberRangeTo(final List<PremiseNumber> premiseNumber) {
            Premise.PremiseNumberRange.PremiseNumberRangeTo newValue = new Premise.PremiseNumberRange.PremiseNumberRangeTo(premiseNumber);
            this.setPremiseNumberRangeTo(newValue);
            return newValue;
        }

        /**
         * fluent setter
         *
         * 
         * @param range
         *     required parameter
         */
        public Premise.PremiseNumberRange withRange(final String range) {
            this.setRange(range);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param indicator
         *     required parameter
         */
        public Premise.PremiseNumberRange withIndicator(final String indicator) {
            this.setIndicator(indicator);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param separator
         *     required parameter
         */
        public Premise.PremiseNumberRange withSeparator(final String separator) {
            this.setSeparator(separator);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param underscore
         *     required parameter
         */
        public Premise.PremiseNumberRange withUnderscore(final String underscore) {
            this.setUnderscore(underscore);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param indicatorOccurence
         *     required parameter
         */
        public Premise.PremiseNumberRange withIndicatorOccurence(final String indicatorOccurence) {
            this.setIndicatorOccurence(indicatorOccurence);
            return this;
        }

        /**
         * fluent setter
         *
         * 
         * @param numberRangeOccurence
         *     required parameter
         */
        public Premise.PremiseNumberRange withNumberRangeOccurence(final String numberRangeOccurence) {
            this.setNumberRangeOccurence(numberRangeOccurence);
            return this;
        }

        @Override
        public Premise.PremiseNumberRange clone() {
            Premise.PremiseNumberRange copy;
            try {
                copy = ((Premise.PremiseNumberRange) super.clone());
            } catch (CloneNotSupportedException _x) {
                throw new InternalError((_x.toString()));
            }
            copy.premiseNumberRangeFrom = ((premiseNumberRangeFrom == null)?null:((Premise.PremiseNumberRange.PremiseNumberRangeFrom) premiseNumberRangeFrom.clone()));
            copy.premiseNumberRangeTo = ((premiseNumberRangeTo == null)?null:((Premise.PremiseNumberRange.PremiseNumberRangeTo) premiseNumberRangeTo.clone()));
            return copy;
        }


        /**
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addressLine",
            "premiseNumberPrefix",
            "premiseNumber",
            "premiseNumberSuffix"
        })
        @XmlRootElement(name = "PremiseNumberRangeFrom", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
        public static class PremiseNumberRangeFrom implements Cloneable
        {

            @XmlElement(name = "AddressLine")
            protected List<AddressLine> addressLine;
            @XmlElement(name = "PremiseNumberPrefix")
            protected List<PremiseNumberPrefix> premiseNumberPrefix;
            @XmlElement(name = "PremiseNumber", required = true)
            protected List<PremiseNumber> premiseNumber;
            @XmlElement(name = "PremiseNumberSuffix")
            protected List<PremiseNumberSuffix> premiseNumberSuffix;

            /**
             * Value constructor with only mandatory fields
             * 
             * @param premiseNumber
             *     required parameter
             */
            public PremiseNumberRangeFrom(final List<PremiseNumber> premiseNumber) {
                super();
                this.premiseNumber = premiseNumber;
            }

            /**
             * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
             * 
             */
            @Deprecated
            private PremiseNumberRangeFrom() {
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
            public List<PremiseNumberPrefix> getPremiseNumberPrefix() {
                if (premiseNumberPrefix == null) {
                    premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>();
                }
                return this.premiseNumberPrefix;
            }

            /**
             * 
             */
            public List<PremiseNumber> getPremiseNumber() {
                if (premiseNumber == null) {
                    premiseNumber = new ArrayList<PremiseNumber>();
                }
                return this.premiseNumber;
            }

            /**
             * 
             */
            public List<PremiseNumberSuffix> getPremiseNumberSuffix() {
                if (premiseNumberSuffix == null) {
                    premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>();
                }
                return this.premiseNumberSuffix;
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = ((prime*result)+((addressLine == null)? 0 :addressLine.hashCode()));
                result = ((prime*result)+((premiseNumberPrefix == null)? 0 :premiseNumberPrefix.hashCode()));
                result = ((prime*result)+((premiseNumber == null)? 0 :premiseNumber.hashCode()));
                result = ((prime*result)+((premiseNumberSuffix == null)? 0 :premiseNumberSuffix.hashCode()));
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
                if ((obj instanceof Premise.PremiseNumberRange.PremiseNumberRangeFrom) == false) {
                    return false;
                }
                Premise.PremiseNumberRange.PremiseNumberRangeFrom other = ((Premise.PremiseNumberRange.PremiseNumberRangeFrom) obj);
                if (addressLine == null) {
                    if (other.addressLine!= null) {
                        return false;
                    }
                } else {
                    if (addressLine.equals(other.addressLine) == false) {
                        return false;
                    }
                }
                if (premiseNumberPrefix == null) {
                    if (other.premiseNumberPrefix!= null) {
                        return false;
                    }
                } else {
                    if (premiseNumberPrefix.equals(other.premiseNumberPrefix) == false) {
                        return false;
                    }
                }
                if (premiseNumber == null) {
                    if (other.premiseNumber!= null) {
                        return false;
                    }
                } else {
                    if (premiseNumber.equals(other.premiseNumber) == false) {
                        return false;
                    }
                }
                if (premiseNumberSuffix == null) {
                    if (other.premiseNumberSuffix!= null) {
                        return false;
                    }
                } else {
                    if (premiseNumberSuffix.equals(other.premiseNumberSuffix) == false) {
                        return false;
                    }
                }
                return true;
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
             * Creates a new instance of {@link PremiseNumberPrefix} and adds it to premiseNumberPrefix.
             * This method is a short version for:
             * {@code
             * PremiseNumberPrefix premiseNumberPrefix = new PremiseNumberPrefix();
             * this.getPremiseNumberPrefix().add(premiseNumberPrefix); }
             * 
             * 
             */
            public PremiseNumberPrefix createAndAddPremiseNumberPrefix() {
                PremiseNumberPrefix newValue = new PremiseNumberPrefix();
                this.getPremiseNumberPrefix().add(newValue);
                return newValue;
            }

            /**
             * Creates a new instance of {@link PremiseNumber} and adds it to premiseNumber.
             * This method is a short version for:
             * {@code
             * PremiseNumber premiseNumber = new PremiseNumber();
             * this.getPremiseNumber().add(premiseNumber); }
             * 
             * 
             */
            public PremiseNumber createAndAddPremiseNumber() {
                PremiseNumber newValue = new PremiseNumber();
                this.getPremiseNumber().add(newValue);
                return newValue;
            }

            /**
             * Creates a new instance of {@link PremiseNumberSuffix} and adds it to premiseNumberSuffix.
             * This method is a short version for:
             * {@code
             * PremiseNumberSuffix premiseNumberSuffix = new PremiseNumberSuffix();
             * this.getPremiseNumberSuffix().add(premiseNumberSuffix); }
             * 
             * 
             */
            public PremiseNumberSuffix createAndAddPremiseNumberSuffix() {
                PremiseNumberSuffix newValue = new PremiseNumberSuffix();
                this.getPremiseNumberSuffix().add(newValue);
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
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom addToAddressLine(final AddressLine addressLine) {
                this.getAddressLine().add(addressLine);
                return this;
            }

            /**
             * Sets the value of the premiseNumberPrefix property Objects of the following type(s) are allowed in the list {@code List<PremiseNumberPrefix>}.
             * <p>Note:
             * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseNumberPrefix} instead.
             * 
             * 
             * @param premiseNumberPrefix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberPrefix}
             */
            public void setPremiseNumberPrefix(final List<PremiseNumberPrefix> premiseNumberPrefix) {
                this.premiseNumberPrefix = premiseNumberPrefix;
            }

            /**
             * add a value to the premiseNumberPrefix property collection
             * 
             * @param premiseNumberPrefix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberPrefix}
             * @return
             *     true (as general contract of Collection.add). 
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom addToPremiseNumberPrefix(final PremiseNumberPrefix premiseNumberPrefix) {
                this.getPremiseNumberPrefix().add(premiseNumberPrefix);
                return this;
            }

            /**
             * Sets the value of the premiseNumber property Objects of the following type(s) are allowed in the list {@code List<PremiseNumber>}.
             * <p>Note:
             * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withPremiseNumber instead.
             * 
             * 
             * @param premiseNumber
             *     Objects of the following type are allowed in the list: {@link PremiseNumber}
             */
            public void setPremiseNumber(final List<PremiseNumber> premiseNumber) {
                this.premiseNumber = premiseNumber;
            }

            /**
             * add a value to the premiseNumber property collection
             * 
             * @param premiseNumber
             *     Objects of the following type are allowed in the list: {@link PremiseNumber}
             * @return
             *     true (as general contract of Collection.add). 
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom addToPremiseNumber(final PremiseNumber premiseNumber) {
                this.getPremiseNumber().add(premiseNumber);
                return this;
            }

            /**
             * Sets the value of the premiseNumberSuffix property Objects of the following type(s) are allowed in the list {@code List<PremiseNumberSuffix>}.
             * <p>Note:
             * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseNumberSuffix} instead.
             * 
             * 
             * @param premiseNumberSuffix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberSuffix}
             */
            public void setPremiseNumberSuffix(final List<PremiseNumberSuffix> premiseNumberSuffix) {
                this.premiseNumberSuffix = premiseNumberSuffix;
            }

            /**
             * add a value to the premiseNumberSuffix property collection
             * 
             * @param premiseNumberSuffix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberSuffix}
             * @return
             *     true (as general contract of Collection.add). 
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom addToPremiseNumberSuffix(final PremiseNumberSuffix premiseNumberSuffix) {
                this.getPremiseNumberSuffix().add(premiseNumberSuffix);
                return this;
            }

            /**
             * fluent setter
             *
             * 
             * @param addressLine
             *     required parameter
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom withAddressLine(final List<AddressLine> addressLine) {
                this.setAddressLine(addressLine);
                return this;
            }

            /**
             * fluent setter
             *
             * 
             * @param premiseNumberPrefix
             *     required parameter
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom withPremiseNumberPrefix(final List<PremiseNumberPrefix> premiseNumberPrefix) {
                this.setPremiseNumberPrefix(premiseNumberPrefix);
                return this;
            }

            /**
             * fluent setter
             *
             * 
             * @param premiseNumberSuffix
             *     required parameter
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom withPremiseNumberSuffix(final List<PremiseNumberSuffix> premiseNumberSuffix) {
                this.setPremiseNumberSuffix(premiseNumberSuffix);
                return this;
            }

            @Override
            public Premise.PremiseNumberRange.PremiseNumberRangeFrom clone() {
                Premise.PremiseNumberRange.PremiseNumberRangeFrom copy;
                try {
                    copy = ((Premise.PremiseNumberRange.PremiseNumberRangeFrom) super.clone());
                } catch (CloneNotSupportedException _x) {
                    throw new InternalError((_x.toString()));
                }
                copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
                for (AddressLine iter: addressLine) {
                    copy.addressLine.add(iter.clone());
                }
                copy.premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>((getPremiseNumberPrefix().size()));
                for (PremiseNumberPrefix iter: premiseNumberPrefix) {
                    copy.premiseNumberPrefix.add(iter.clone());
                }
                copy.premiseNumber = new ArrayList<PremiseNumber>((getPremiseNumber().size()));
                for (PremiseNumber iter: premiseNumber) {
                    copy.premiseNumber.add(iter.clone());
                }
                copy.premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>((getPremiseNumberSuffix().size()));
                for (PremiseNumberSuffix iter: premiseNumberSuffix) {
                    copy.premiseNumberSuffix.add(iter.clone());
                }
                return copy;
            }

        }


        /**
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addressLine",
            "premiseNumberPrefix",
            "premiseNumber",
            "premiseNumberSuffix"
        })
        @XmlRootElement(name = "PremiseNumberRangeTo", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
        public static class PremiseNumberRangeTo implements Cloneable
        {

            @XmlElement(name = "AddressLine")
            protected List<AddressLine> addressLine;
            @XmlElement(name = "PremiseNumberPrefix")
            protected List<PremiseNumberPrefix> premiseNumberPrefix;
            @XmlElement(name = "PremiseNumber", required = true)
            protected List<PremiseNumber> premiseNumber;
            @XmlElement(name = "PremiseNumberSuffix")
            protected List<PremiseNumberSuffix> premiseNumberSuffix;

            /**
             * Value constructor with only mandatory fields
             * 
             * @param premiseNumber
             *     required parameter
             */
            public PremiseNumberRangeTo(final List<PremiseNumber> premiseNumber) {
                super();
                this.premiseNumber = premiseNumber;
            }

            /**
             * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
             * 
             */
            @Deprecated
            private PremiseNumberRangeTo() {
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
            public List<PremiseNumberPrefix> getPremiseNumberPrefix() {
                if (premiseNumberPrefix == null) {
                    premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>();
                }
                return this.premiseNumberPrefix;
            }

            /**
             * 
             */
            public List<PremiseNumber> getPremiseNumber() {
                if (premiseNumber == null) {
                    premiseNumber = new ArrayList<PremiseNumber>();
                }
                return this.premiseNumber;
            }

            /**
             * 
             */
            public List<PremiseNumberSuffix> getPremiseNumberSuffix() {
                if (premiseNumberSuffix == null) {
                    premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>();
                }
                return this.premiseNumberSuffix;
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = ((prime*result)+((addressLine == null)? 0 :addressLine.hashCode()));
                result = ((prime*result)+((premiseNumberPrefix == null)? 0 :premiseNumberPrefix.hashCode()));
                result = ((prime*result)+((premiseNumber == null)? 0 :premiseNumber.hashCode()));
                result = ((prime*result)+((premiseNumberSuffix == null)? 0 :premiseNumberSuffix.hashCode()));
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
                if ((obj instanceof Premise.PremiseNumberRange.PremiseNumberRangeTo) == false) {
                    return false;
                }
                Premise.PremiseNumberRange.PremiseNumberRangeTo other = ((Premise.PremiseNumberRange.PremiseNumberRangeTo) obj);
                if (addressLine == null) {
                    if (other.addressLine!= null) {
                        return false;
                    }
                } else {
                    if (addressLine.equals(other.addressLine) == false) {
                        return false;
                    }
                }
                if (premiseNumberPrefix == null) {
                    if (other.premiseNumberPrefix!= null) {
                        return false;
                    }
                } else {
                    if (premiseNumberPrefix.equals(other.premiseNumberPrefix) == false) {
                        return false;
                    }
                }
                if (premiseNumber == null) {
                    if (other.premiseNumber!= null) {
                        return false;
                    }
                } else {
                    if (premiseNumber.equals(other.premiseNumber) == false) {
                        return false;
                    }
                }
                if (premiseNumberSuffix == null) {
                    if (other.premiseNumberSuffix!= null) {
                        return false;
                    }
                } else {
                    if (premiseNumberSuffix.equals(other.premiseNumberSuffix) == false) {
                        return false;
                    }
                }
                return true;
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
             * Creates a new instance of {@link PremiseNumberPrefix} and adds it to premiseNumberPrefix.
             * This method is a short version for:
             * {@code
             * PremiseNumberPrefix premiseNumberPrefix = new PremiseNumberPrefix();
             * this.getPremiseNumberPrefix().add(premiseNumberPrefix); }
             * 
             * 
             */
            public PremiseNumberPrefix createAndAddPremiseNumberPrefix() {
                PremiseNumberPrefix newValue = new PremiseNumberPrefix();
                this.getPremiseNumberPrefix().add(newValue);
                return newValue;
            }

            /**
             * Creates a new instance of {@link PremiseNumber} and adds it to premiseNumber.
             * This method is a short version for:
             * {@code
             * PremiseNumber premiseNumber = new PremiseNumber();
             * this.getPremiseNumber().add(premiseNumber); }
             * 
             * 
             */
            public PremiseNumber createAndAddPremiseNumber() {
                PremiseNumber newValue = new PremiseNumber();
                this.getPremiseNumber().add(newValue);
                return newValue;
            }

            /**
             * Creates a new instance of {@link PremiseNumberSuffix} and adds it to premiseNumberSuffix.
             * This method is a short version for:
             * {@code
             * PremiseNumberSuffix premiseNumberSuffix = new PremiseNumberSuffix();
             * this.getPremiseNumberSuffix().add(premiseNumberSuffix); }
             * 
             * 
             */
            public PremiseNumberSuffix createAndAddPremiseNumberSuffix() {
                PremiseNumberSuffix newValue = new PremiseNumberSuffix();
                this.getPremiseNumberSuffix().add(newValue);
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
            public Premise.PremiseNumberRange.PremiseNumberRangeTo addToAddressLine(final AddressLine addressLine) {
                this.getAddressLine().add(addressLine);
                return this;
            }

            /**
             * Sets the value of the premiseNumberPrefix property Objects of the following type(s) are allowed in the list {@code List<PremiseNumberPrefix>}.
             * <p>Note:
             * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseNumberPrefix} instead.
             * 
             * 
             * @param premiseNumberPrefix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberPrefix}
             */
            public void setPremiseNumberPrefix(final List<PremiseNumberPrefix> premiseNumberPrefix) {
                this.premiseNumberPrefix = premiseNumberPrefix;
            }

            /**
             * add a value to the premiseNumberPrefix property collection
             * 
             * @param premiseNumberPrefix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberPrefix}
             * @return
             *     true (as general contract of Collection.add). 
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeTo addToPremiseNumberPrefix(final PremiseNumberPrefix premiseNumberPrefix) {
                this.getPremiseNumberPrefix().add(premiseNumberPrefix);
                return this;
            }

            /**
             * Sets the value of the premiseNumber property Objects of the following type(s) are allowed in the list {@code List<PremiseNumber>}.
             * <p>Note:
             * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use withPremiseNumber instead.
             * 
             * 
             * @param premiseNumber
             *     Objects of the following type are allowed in the list: {@link PremiseNumber}
             */
            public void setPremiseNumber(final List<PremiseNumber> premiseNumber) {
                this.premiseNumber = premiseNumber;
            }

            /**
             * add a value to the premiseNumber property collection
             * 
             * @param premiseNumber
             *     Objects of the following type are allowed in the list: {@link PremiseNumber}
             * @return
             *     true (as general contract of Collection.add). 
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeTo addToPremiseNumber(final PremiseNumber premiseNumber) {
                this.getPremiseNumber().add(premiseNumber);
                return this;
            }

            /**
             * Sets the value of the premiseNumberSuffix property Objects of the following type(s) are allowed in the list {@code List<PremiseNumberSuffix>}.
             * <p>Note:
             * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPremiseNumberSuffix} instead.
             * 
             * 
             * @param premiseNumberSuffix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberSuffix}
             */
            public void setPremiseNumberSuffix(final List<PremiseNumberSuffix> premiseNumberSuffix) {
                this.premiseNumberSuffix = premiseNumberSuffix;
            }

            /**
             * add a value to the premiseNumberSuffix property collection
             * 
             * @param premiseNumberSuffix
             *     Objects of the following type are allowed in the list: {@link PremiseNumberSuffix}
             * @return
             *     true (as general contract of Collection.add). 
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeTo addToPremiseNumberSuffix(final PremiseNumberSuffix premiseNumberSuffix) {
                this.getPremiseNumberSuffix().add(premiseNumberSuffix);
                return this;
            }

            /**
             * fluent setter
             *
             * 
             * @param addressLine
             *     required parameter
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeTo withAddressLine(final List<AddressLine> addressLine) {
                this.setAddressLine(addressLine);
                return this;
            }

            /**
             * fluent setter
             *
             * 
             * @param premiseNumberPrefix
             *     required parameter
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeTo withPremiseNumberPrefix(final List<PremiseNumberPrefix> premiseNumberPrefix) {
                this.setPremiseNumberPrefix(premiseNumberPrefix);
                return this;
            }

            /**
             * fluent setter
             *
             * 
             * @param premiseNumberSuffix
             *     required parameter
             */
            public Premise.PremiseNumberRange.PremiseNumberRangeTo withPremiseNumberSuffix(final List<PremiseNumberSuffix> premiseNumberSuffix) {
                this.setPremiseNumberSuffix(premiseNumberSuffix);
                return this;
            }

            @Override
            public Premise.PremiseNumberRange.PremiseNumberRangeTo clone() {
                Premise.PremiseNumberRange.PremiseNumberRangeTo copy;
                try {
                    copy = ((Premise.PremiseNumberRange.PremiseNumberRangeTo) super.clone());
                } catch (CloneNotSupportedException _x) {
                    throw new InternalError((_x.toString()));
                }
                copy.addressLine = new ArrayList<AddressLine>((getAddressLine().size()));
                for (AddressLine iter: addressLine) {
                    copy.addressLine.add(iter.clone());
                }
                copy.premiseNumberPrefix = new ArrayList<PremiseNumberPrefix>((getPremiseNumberPrefix().size()));
                for (PremiseNumberPrefix iter: premiseNumberPrefix) {
                    copy.premiseNumberPrefix.add(iter.clone());
                }
                copy.premiseNumber = new ArrayList<PremiseNumber>((getPremiseNumber().size()));
                for (PremiseNumber iter: premiseNumber) {
                    copy.premiseNumber.add(iter.clone());
                }
                copy.premiseNumberSuffix = new ArrayList<PremiseNumberSuffix>((getPremiseNumberSuffix().size()));
                for (PremiseNumberSuffix iter: premiseNumberSuffix) {
                    copy.premiseNumberSuffix.add(iter.clone());
                }
                return copy;
            }

        }

    }

}
