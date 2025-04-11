
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.atom.Link;
import de.micromata.opengis.kml.v_2_2_0.gx.Tour;
import de.micromata.opengis.kml.v_2_2_0.xal.*;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Feature>}
 * <p>
 * This is an abstract element and cannot be used directly in a KML file.
 * </p>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "name",
    "visibility",
    "open",
    "atomAuthor",
    "atomLink",
    "address",
    "xalAddressDetails",
    "phoneNumber",
    "snippet",
    "snippetd",
    "description",
    "abstractView",
    "timePrimitive",
    "styleUrl",
    "styleSelector",
    "region",
    "metadata",
    "extendedData",
    "featureSimpleExtension",
    "featureObjectExtension"
})
@XmlSeeAlso({
    Tour.class,
    Overlay.class,
    NetworkLink.class,
    Container.class,
    Placemark.class
})
public abstract class Feature
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <name>}
     * <p>
     * User-defined text displayed in the 3D viewer as the label for the object (for example, 
     * for a Placemark, Folder, or NetworkLink). 
     * </p>
     * 
     * 
     * 
     */
    protected String name;
    /**
     * {@code <visibility>}
     * <p>
     * Boolean value. Specifies whether the feature is drawn in the 3D viewer when it is 
     * initially loaded. In order for a feature to be visible, the {@code <visibility>} tag of
     * all its ancestors must also be set to 1. In the Google Earth List View, each Feature 
     * has a checkbox that allows the user to control visibility of the Feature. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean visibility;
    /**
     * {@code <open>}
     * <p>
     * Boolean value. Specifies whether a Document or Folder appears closed or open when 
     * first loaded into the Places panel. 0=collapsed (the default), 1=expanded. See also 
     * {@code <ListStyle>}. This element applies only to Document, Folder, and NetworkLink. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0")
    @XmlJavaTypeAdapter(BooleanConverter.class)
    protected Boolean open;
    /**
     * {@code <atom:author>}
     * <p>
     * KML 2.2 supports new elements for including data about the author and related website 
     * in your KML file. This information is displayed in geo search results, both in Earth 
     * browsers such as Google Earth, and in other applications such as Google Maps. The 
     * ascription elements used in KML are as follows: 
     * </p>
     * <p>
     * The {@code <atom:author>} element is the parent element for {@code <atom:name>}, which specifies
     * the author of the KML feature. 
     * </p>
     * <p>
     * These elements are defined in the Atom Syndication Format. The complete specification 
     * is found at http://atompub.org. (see the sample that follows). 
     * </p>
     * <p>
     * These elements are defined in the Atom Syndication Format. The complete specification 
     * is found at http://atompub.org. (see the sample that follows). 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "author", namespace = "http://www.w3.org/2005/Atom")
    protected Author atomAuthor;
    /**
     * {@code <Link>} (required). see {@code <Link>}.
     * <p>
     * {@code <Link>} specifies the location of any of the following: 
     * </p>
     * <p>
     * If the file specified in {@code <href>}is a local file, the {@code <viewFormat>} and {@code <httpQuery>} 
     * elements are not used. 
     * </p>
     * <p>
     * KML files fetched by network links Image files used in any Overlay (the {@code <Icon>}element 
     * specifies the image in an Overlay; {@code <Icon>}has the same fields as {@code <Link>}) Model files 
     * used in the {@code <Model>} element 
     * </p>
     * <p>
     * Specifies the URL of the website containing this KML or KMZ file. Be sure to include 
     * the namespace for this element in any KML file that uses it: xmlns:atom="http://www.w3.org/2005/Atom" 
     * (see the sample that follows). 
     * </p>
     * <p>
     * Specifies the file to load and optional refresh parameters. See {@code <Link>}. 
     * </p>
     * <p>
     * The {@code <Link>} element replaces the {@code <Url>} element of NetworkLink contained in earlier 
     * KML releases and adds functionality for the {@code <Region>} element (introduced in KML 
     *  2.1). In Google Earth releases 3.0 and earlier, the {@code <Link>} element is ignored. 
     * </p>
     * <p>
     * The file is conditionally loaded and refreshed, depending on the refresh parameters 
     * supplied here. Two different sets of refresh parameters can be specified: one set 
     * is based on time ({@code <refreshMode>} and {@code <refreshInterval>}) and one is based on the current
     * "camera" view ({@code <viewRefreshMode>} and {@code <viewRefreshTime>}). In addition, Link specifies
     * whether to scale the bounding box parameters that are sent to the server ({@code <viewBoundScale>}
     * and provides a set of optional viewing parameters that can be sent to the server 
     * ({@code <viewFormat>}) as well as a set of optional parameters containing version and language
     * information. 
     * </p>
     * <p>
     * Tip: To display the top-level Folder or Document within a Network Link in the List 
     * View, assign an ID to the Folder or Document. Without this ID, only the child object 
     * names are displayed in the List View. 
     * </p>
     * <p>
     * When a file is fetched, the URL that is sent to the server is composed of three 
     * pieces of information: 
     * </p>
     * <p>
     * the href (Hypertext Reference) that specifies the file to load. an arbitrary format 
     * string that is created from (a) parameters that you specify in the {@code <viewFormat>} 
     * element or (b) bounding box parameters (this is the default and is used if no {@code <viewFormat>} 
     * element is included in the file). a second format string that is specified in the 
     * {@code <httpQuery>} element. 
     * </p>
     * 

     * See Also: 
     * {@code <NetworkLinkControl>}
     * {@code <Region>}
     * 
     * 
     * 
     */
    @XmlElement(name = "link", namespace = "http://www.w3.org/2005/Atom")
    protected Link atomLink;
    /**
     * {@code <address>}
     * <p>
     * A string value representing an unstructured address written as a standard street, 
     * city, state address, and/or as a postal code. You can use the address tag to specify
     * the location of a point instead of using latitude and longitude coordinates. (However, 
     * if aPoint is provided, it takes precedence over the address.) To find out which
     * locales are supported for this tag in Google Earth, go to the Google Maps Help. 
     * </p>
     * 
     * 
     * 
     */
    protected String address;
    /**
     * {@code <xal:addressdetails>}
     * <p>
     * A structured address, formatted as xAL, or eXtensible Address Language, an international 
     * standard for address formatting. xal:addressdetails is used by KML for geocoding 
     * in Google Maps only. For details, see the Google Maps API documentation. Currently, 
     * Google Earth does not use this element; use address instead. Be sure to include
     * the namespace for this element in any KML file that uses it: xmlns:xal="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0" 
     * </p>
     * <p>
     * A structured address, formatted as xAL, or eXtensible Address Language, an international 
     * standard for address formatting. xal:addressdetails is used by KML for geocoding 
     * in Google Maps only. For details, see the Google Maps API documentation. Currently, 
     * Google Earth does not use this element; use address instead. Be sure to include
     * the namespace for this element in any KML file that uses it: xmlns:xal="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0" 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "AddressDetails", namespace = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
    protected AddressDetails xalAddressDetails;
    /**
     * {@code <phonenumber>}
     * 
     * 
     */
    protected String phoneNumber;
    /**
     * {@code <snippet maxlines="2" >}
     * <p>
     * A short description of the feature. In Google Earth, this description is displayed 
     * in the Places panel under the name of the feature. If a Snippet is not supplied, 
     * the first two lines of the {@code <description>} are used. In Google Earth, if a Placemark
     * contains both a description and a Snippet, the {@code <Snippet>} appears beneath the Placemark
     * in the Places panel, and the {@code <description>} appears in the Placemark's description
     * balloon. This tag does not support HTML markup. {@code <Snippet>} has a maxLines attribute,
     * an integer that specifies the maximum number of lines to display. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "Snippet")
    protected Snippet snippet;
    @XmlElement(name = "snippet")
    protected String snippetd;
    /**
     * {@code <description>}
     * <p>
     * The supported content for the {@code <description>} element changed from Google Earth 4.3
     * to 5.0. Specific information for each version is listed out below, followed by information 
     * common to both. 
     * </p>
     * <p>
     * User-supplied content that appears in the description balloon. 
     * </p>
     * <p>
     * User-supplied content that appears in the description balloon. The supported content 
     * for the {@code <description>} element changed from Google Earth 4.3 to 5.0. Specific information
     * for each version is listed out below, followed by information common to both. Google 
     * Earth 5.0 Google Earth 5.0 supports plain text content, as well as full HTML and 
     * JavaScript, within description balloons. Contents of the description tag are rendered 
     * by the WebKit open source web browser engine, and are displayed as they would be 
     * in any WebKit-based browser. General restrictions Links to local files are generally 
     * not allowed. This prevents malicious code from damaging your system or accessing 
     * your data. Should you wish to allow access to your local filesystem, select Preferences 
     * Allow placemark balloons to access local files and personal data. Links to image
     * files on the local filesystem are always allowed, if contained within an {@code <img>} tag.
     * Content that has been compressed into a KMZ file can be accessed, even if on the 
     * local filesystem. Cookies are completely disabled, including cookies set or read 
     * by content contained within a iFrame. There are no exceptions to this rule. Doctype 
     * declarations are ignored. 
     * </p>
     * 
     * 
     * 
     */
    protected String description;
    /**
     * {@code <abstractview>}
     * <p>
     * Defines a viewpoint associated with any element derived from Feature. See Camera 
     * and LookAt. 
     * </p>
     * <p>
     * This is an abstract element and cannot be used directly in a KML file. This element 
     * is extended by the Camera and LookAt elements. 
     * </p>
     */
    @XmlElementRef(name = "AbstractViewGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected AbstractView abstractView;
    /**
     * {@code <TimePrimitive>}
     * <p>
     * Associates this Feature with a period of time ({@code <TimeSpan>}) or a point in time ({@code <TimeStamp>}).
     * </p>
     * <p>
     * This is an abstract element and cannot be used directly in a KML file. This element 
     * is extended by the {@code <TimeSpan>} and {@code <TimeStamp>} elements. 
     * </p>
     */
    @XmlElementRef(name = "AbstractTimePrimitiveGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected TimePrimitive timePrimitive;
    /**
     * {@code <styleurl>}
     * <p>
     * URL of a {@code <Style>} or {@code <StyleMap>} defined in a Document. If the style is in the same
     * file, use a # reference. If the style is defined in an external file, use a full 
     * URL along with # referencing. Examples are {@code <styleUrl>#myIconStyleID</styleUrl> <styleUrl>http://someserver.com/somestylefile.xml#restaurant</styleUrl>
     * <styleUrl>eateries.kml#my-lunch-spot</styleUrl>}
     * </p>
     * 
     * 
     * 
     */
    @XmlSchemaType(name = "anyURI")
    protected String styleUrl;
    /**
     * {@code <StyleSelector>}
     * <p>
     * One or more Styles and StyleMaps can be defined to customize the appearance of any 
     * element derived from Feature or of the Geometry in a Placemark. (See {@code <BalloonStyle>},
     * {@code <ListStyle>}, {@code <StyleSelector>}, and the styles derived from {@code <ColorStyle>}.) A style 
     * defined within a Feature is called an "inline style" and applies only to the Feature 
     * that contains it. A style defined as the child of a {@code <Document>} is called a "shared 
     * style." A shared style must have an id defined for it. This id is referenced by 
     * one or more Features within the {@code <Document>}. In cases where a style element is defined 
     * both in a shared style and in an inline style for a Feature—that is, a Folder, GroundOverlay, 
     * NetworkLink, Placemark, or ScreenOverlay—the value for the Feature's inline style 
     * takes precedence over the value for the shared style. 
     * </p>
     */
    @XmlElementRef(name = "AbstractStyleSelectorGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<StyleSelector> styleSelector;
    /**
     * {@code <Region>}
     * <p>
     * A region contains a bounding box ({@code <LatLonAltBox>}) that describes an area of interest
     * defined by geographic coordinates and altitudes. In addition, a Region contains 
     * an LOD (level of detail) extent ({@code <Lod>}) that defines a validity range of the associated
     * Region in terms of projected screen size. A Region is said to be "active" when the 
     * bounding box is within the user's view and the LOD requirements are met. Objects 
     * associated with a Region are drawn only when the Region is active. When the {@code <viewRefreshMode>} 
     * is onRegion, the Link or Icon is loaded only when the Region is active. See the 
     * "Topics in KML" page on Regions for more details. In a Container or NetworkLink 
     * hierarchy, this calculation uses the Region that is the closest ancestor in the 
     * hierarchy. 
     * </p>
     * <p>
     * Features and geometry associated with a Region are drawn only when the Region is 
     * active. See {@code <Region>}. 
     * </p>
     * 
     */
    @XmlElement(name = "Region")
    protected Region region;
    /**
     * {@code <metadata>} (deprecated in kml 2.2; use {@code <extendeddata>} instead)
     * 
     * 
     */
    @XmlElement(name = "Metadata")
    protected Metadata metadata;
    /**
     * {@code <extendeddata>}
     * <p>
     * Adding untyped data/value pairs using the {@code <Data>} element (basic) Declaring new typed
     * fields using the {@code <Schema>} element and then instancing them using the {@code <SchemaData>} 
     * element (advanced) Referring to XML elements defined in other namespaces by referencing 
     * the external namespace within the KML file (basic) 
     * </p>
     * <p>
     * Allows you to add custom data to a KML file. This data can be (1) data that references 
     * an external XML schema, (2) untyped data/value pairs, or (3) typed data. A given 
     * KML Feature can contain a combination of these types of custom data. 
     * </p>
     * <p>
     * For more information, see Adding Custom Data in "Topics in KML." 
     * </p>
     * <p>
     * The ExtendedData element offers three techniques for adding custom data to a KML 
     * Feature (NetworkLink, Placemark, GroundOverlay, PhotoOverlay, ScreenOverlay, Document, 
     * Folder). These techniques are 
     * </p>
     * <p>
     * These techniques can be combined within a single KML file or Feature for different 
     * pieces of data. 
     * </p>
     */
    @XmlElement(name = "ExtendedData")
    protected ExtendedData extendedData;
    /**
     * {@code <Object>}
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the Update mechanism is to 
     * be used. 
     * </p>
     */
    @XmlElement(name = "AbstractFeatureSimpleExtensionGroup")
    protected List<Object> featureSimpleExtension;
    /**
     * {@code <Object>}
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the Update mechanism is to 
     * be used. 
     * </p>
     */
    @XmlElement(name = "AbstractFeatureObjectExtensionGroup")
    protected List<AbstractObject> featureObjectExtension;

    public Feature() {
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
    public String getName() {
        return name;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isVisibility() {
        return visibility;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setVisibility(Boolean value) {
        this.visibility = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setOpen(Boolean value) {
        this.open = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Author}
     *     
     */
    public Author getAtomAuthor() {
        return atomAuthor;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Author}
     *     
     */
    public void setAtomAuthor(Author value) {
        this.atomAuthor = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Link}
     *     
     */
    public Link getAtomLink() {
        return atomLink;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Link}
     *     
     */
    public void setAtomLink(Link value) {
        this.atomLink = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link AddressDetails}
     *     
     */
    public AddressDetails getXalAddressDetails() {
        return xalAddressDetails;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetails}
     *     
     */
    public void setXalAddressDetails(AddressDetails value) {
        this.xalAddressDetails = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Snippet}
     *     
     */
    public Snippet getSnippet() {
        return snippet;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Snippet}
     *     
     */
    public void setSnippet(Snippet value) {
        this.snippet = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getSnippetd() {
        return snippetd;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setSnippetd(String value) {
        this.snippetd = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@code <}{@link AbstractView}{@code >}
     *     {@code <}{@link LookAt}{@code >}
     *     {@code <}{@link Camera}{@code >}
     *     
     */
    public AbstractView getAbstractView() {
        return abstractView;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link AbstractView}{@code >}
     *     {@code <}{@link LookAt}{@code >}
     *     {@code <}{@link Camera}{@code >}
     *     
     */
    public void setAbstractView(AbstractView value) {
        this.abstractView = ((AbstractView ) value);
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@code <}{@link TimeSpan}{@code >}
     *     {@code <}{@link TimeStamp}{@code >}
     *     {@code <}{@link TimePrimitive}{@code >}
     *     
     */
    public TimePrimitive getTimePrimitive() {
        return timePrimitive;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link TimeSpan}{@code >}
     *     {@code <}{@link TimeStamp}{@code >}
     *     {@code <}{@link TimePrimitive}{@code >}
     *     
     */
    public void setTimePrimitive(TimePrimitive value) {
        this.timePrimitive = ((TimePrimitive ) value);
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getStyleUrl() {
        return styleUrl;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setStyleUrl(String value) {
        this.styleUrl = value;
    }

    /**
     *
     * 
     */
    public List<StyleSelector> getStyleSelector() {
        if (styleSelector == null) {
            styleSelector = new ArrayList<StyleSelector>();
        }
        return this.styleSelector;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Region}
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Region}
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Metadata}
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata}
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link ExtendedData}
     *     
     */
    public ExtendedData getExtendedData() {
        return extendedData;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedData}
     *     
     */
    public void setExtendedData(ExtendedData value) {
        this.extendedData = value;
    }

    /**
     *
     * 
     */
    public List<Object> getFeatureSimpleExtension() {
        if (featureSimpleExtension == null) {
            featureSimpleExtension = new ArrayList<Object>();
        }
        return this.featureSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getFeatureObjectExtension() {
        if (featureObjectExtension == null) {
            featureObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.featureObjectExtension;
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

        Feature feature = (Feature) object;
        return Objects.equals(name, feature.name)
                && Objects.equals(visibility, feature.visibility)
                && Objects.equals(open, feature.open)
                && Objects.equals(atomAuthor, feature.atomAuthor)
                && Objects.equals(atomLink, feature.atomLink)
                && Objects.equals(address, feature.address)
                && Objects.equals(xalAddressDetails, feature.xalAddressDetails)
                && Objects.equals(phoneNumber, feature.phoneNumber)
                && Objects.equals(snippet, feature.snippet)
                && Objects.equals(snippetd, feature.snippetd)
                && Objects.equals(description, feature.description)
                && Objects.equals(abstractView, feature.abstractView)
                && Objects.equals(timePrimitive, feature.timePrimitive)
                && Objects.equals(styleUrl, feature.styleUrl)
                && Objects.equals(styleSelector, feature.styleSelector)
                && Objects.equals(region, feature.region)
                && Objects.equals(metadata, feature.metadata)
                && Objects.equals(extendedData, feature.extendedData)
                && Objects.equals(featureSimpleExtension, feature.featureSimpleExtension)
                && Objects.equals(featureObjectExtension, feature.featureObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(visibility);
        result = 31 * result + Objects.hashCode(open);
        result = 31 * result + Objects.hashCode(atomAuthor);
        result = 31 * result + Objects.hashCode(atomLink);
        result = 31 * result + Objects.hashCode(address);
        result = 31 * result + Objects.hashCode(xalAddressDetails);
        result = 31 * result + Objects.hashCode(phoneNumber);
        result = 31 * result + Objects.hashCode(snippet);
        result = 31 * result + Objects.hashCode(snippetd);
        result = 31 * result + Objects.hashCode(description);
        result = 31 * result + Objects.hashCode(abstractView);
        result = 31 * result + Objects.hashCode(timePrimitive);
        result = 31 * result + Objects.hashCode(styleUrl);
        result = 31 * result + Objects.hashCode(styleSelector);
        result = 31 * result + Objects.hashCode(region);
        result = 31 * result + Objects.hashCode(metadata);
        result = 31 * result + Objects.hashCode(extendedData);
        result = 31 * result + Objects.hashCode(featureSimpleExtension);
        result = 31 * result + Objects.hashCode(featureObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Author} and set it to atomAuthor.
     * 
     * This method is a short version for:
     * {@code
     * Author author = new Author();
     * this.setAtomAuthor(author); }
     * 
     * 
     */
    public Author createAndSetAtomAuthor() {
        Author newValue = new Author();
        this.setAtomAuthor(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Link} and set it to atomLink.
     * 
     * This method is a short version for:
     * {@code
     * Link link = new Link();
     * this.setAtomLink(link); }
     * 
     * 
     * @param href
     *     required parameter
     */
    public Link createAndSetAtomLink(final String href) {
        Link newValue = new Link(href);
        this.setAtomLink(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link AddressDetails} and set it to xalAddressDetails.
     * 
     * This method is a short version for:
     * {@code
     * AddressDetails addressDetails = new AddressDetails();
     * this.setXalAddressDetails(addressDetails); }
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
    public AddressDetails createAndSetXalAddressDetails(final AddressDetails.Address xalAddress, final AddressLines addressLines, final AddressDetails.Country country, final AdministrativeArea administrativeArea, final Locality locality, final Thoroughfare thoroughfare) {
        AddressDetails newValue = new AddressDetails(xalAddress, addressLines, country, administrativeArea, locality, thoroughfare);
        this.setXalAddressDetails(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Snippet} and set it to snippet.
     * 
     * This method is a short version for:
     * {@code
     * Snippet snippet = new Snippet();
     * this.setSnippet(snippet); }
     * 
     * 
     */
    public Snippet createAndSetSnippet() {
        Snippet newValue = new Snippet();
        this.setSnippet(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link LookAt} and set it to abstractView.
     * 
     * This method is a short version for:
     * {@code
     * LookAt lookAt = new LookAt();
     * this.setAbstractView(lookAt); }
     * 
     * 
     */
    public LookAt createAndSetLookAt() {
        LookAt newValue = new LookAt();
        this.setAbstractView(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Camera} and set it to abstractView.
     * 
     * This method is a short version for:
     * {@code
     * Camera camera = new Camera();
     * this.setAbstractView(camera); }
     * 
     * 
     */
    public Camera createAndSetCamera() {
        Camera newValue = new Camera();
        this.setAbstractView(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link TimeSpan} and set it to timePrimitive.
     * 
     * This method is a short version for:
     * {@code
     * TimeSpan timeSpan = new TimeSpan();
     * this.setTimePrimitive(timeSpan); }
     * 
     * 
     */
    public TimeSpan createAndSetTimeSpan() {
        TimeSpan newValue = new TimeSpan();
        this.setTimePrimitive(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link TimeStamp} and set it to timePrimitive.
     * 
     * This method is a short version for:
     * {@code
     * TimeStamp timeStamp = new TimeStamp();
     * this.setTimePrimitive(timeStamp); }
     * 
     * 
     */
    public TimeStamp createAndSetTimeStamp() {
        TimeStamp newValue = new TimeStamp();
        this.setTimePrimitive(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Style} and adds it to styleSelector.
     * This method is a short version for:
     * {@code
     * Style style = new Style();
     * this.getStyleSelector().add(style); }
     * 
     * 
     */
    public Style createAndAddStyle() {
        Style newValue = new Style();
        this.getStyleSelector().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link StyleMap} and adds it to styleSelector.
     * This method is a short version for:
     * {@code
     * StyleMap styleMap = new StyleMap();
     * this.getStyleSelector().add(styleMap); }
     * 
     * 
     */
    public StyleMap createAndAddStyleMap() {
        StyleMap newValue = new StyleMap();
        this.getStyleSelector().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Region} and set it to region.
     * 
     * This method is a short version for:
     * {@code
     * Region region = new Region();
     * this.setRegion(region); }
     * 
     * 
     */
    public Region createAndSetRegion() {
        Region newValue = new Region();
        this.setRegion(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Metadata} and set it to metadata.
     * 
     * This method is a short version for:
     * {@code
     * Metadata metadata = new Metadata();
     * this.setMetadata(metadata); }
     * 
     * 
     */
    public Metadata createAndSetMetadata() {
        Metadata newValue = new Metadata();
        this.setMetadata(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ExtendedData} and set it to extendedData.
     * 
     * This method is a short version for:
     * {@code
     * ExtendedData extendedData = new ExtendedData();
     * this.setExtendedData(extendedData); }
     * 
     * 
     */
    public ExtendedData createAndSetExtendedData() {
        ExtendedData newValue = new ExtendedData();
        this.setExtendedData(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param styleSelector
     *     Objects of the following type are allowed in the list: {@code <}{@link Style}{@code >}{@code <}{@link StyleSelector}{@code >}{@code <}{@link StyleMap}{@code >}
     */
    public void setStyleSelector(final List<StyleSelector> styleSelector) {
        this.styleSelector = styleSelector;
    }

    /**
     * add a value to the styleSelector property collection
     * 
     * @param styleSelector
     *     Objects of the following type are allowed in the list: {@code <}{@link Style}{@code >}{@code <}{@link StyleSelector}{@code >}{@code <}{@link StyleMap}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Feature addToStyleSelector(final StyleSelector styleSelector) {
        this.getStyleSelector().add(styleSelector);
        return this;
    }

    /**
     *
     * 
     * @param featureSimpleExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link Double}{@code >}{@code <}{@link Object}{@code >}{@code <}{@link Boolean}{@code >}
     */
    public void setFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        this.featureSimpleExtension = featureSimpleExtension;
    }

    /**
     * add a value to the featureSimpleExtension property collection
     * 
     * @param featureSimpleExtension
     *     Objects of the following type are allowed in the list: {@code <}{@link Double}{@code >}{@code <}{@link Object}{@code >}{@code <}{@link Boolean}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Feature addToFeatureSimpleExtension(final Object featureSimpleExtension) {
        this.getFeatureSimpleExtension().add(featureSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param featureObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        this.featureObjectExtension = featureObjectExtension;
    }

    /**
     * add a value to the featureObjectExtension property collection
     * 
     * @param featureObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Feature addToFeatureObjectExtension(final AbstractObject featureObjectExtension) {
        this.getFeatureObjectExtension().add(featureObjectExtension);
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
    public Feature addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param name
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withName(final String name) {
        this.setName(name);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param visibility
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withVisibility(final Boolean visibility) {
        this.setVisibility(visibility);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param open
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withOpen(final Boolean open) {
        this.setOpen(open);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param atomAuthor
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withAtomAuthor(final Author atomAuthor) {
        this.setAtomAuthor(atomAuthor);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param atomLink
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withAtomLink(final Link atomLink) {
        this.setAtomLink(atomLink);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param address
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withAddress(final String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param xalAddressDetails
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withXalAddressDetails(final AddressDetails xalAddressDetails) {
        this.setXalAddressDetails(xalAddressDetails);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param phoneNumber
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withPhoneNumber(final String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param snippet
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withSnippet(final Snippet snippet) {
        this.setSnippet(snippet);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param snippetd
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withSnippetd(final String snippetd) {
        this.setSnippetd(snippetd);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param description
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withDescription(final String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractView
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withAbstractView(final AbstractView abstractView) {
        this.setAbstractView(abstractView);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param timePrimitive
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withTimePrimitive(final TimePrimitive timePrimitive) {
        this.setTimePrimitive(timePrimitive);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleUrl
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withStyleUrl(final String styleUrl) {
        this.setStyleUrl(styleUrl);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param styleSelector
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withStyleSelector(final List<StyleSelector> styleSelector) {
        this.setStyleSelector(styleSelector);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param region
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withRegion(final Region region) {
        this.setRegion(region);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param metadata
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withMetadata(final Metadata metadata) {
        this.setMetadata(metadata);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param extendedData
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withExtendedData(final ExtendedData extendedData) {
        this.setExtendedData(extendedData);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param featureSimpleExtension
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        this.setFeatureSimpleExtension(featureSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param featureObjectExtension
     *     required parameter
     * @return
     *     Feature
     */
    public Feature withFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        this.setFeatureObjectExtension(featureObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Feature withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Feature withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Feature withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public Feature clone() {
        Feature copy;
        copy = ((Feature) super.clone());
        copy.atomAuthor = ((atomAuthor == null)?null:((Author) atomAuthor.clone()));
        copy.atomLink = ((atomLink == null)?null:((Link) atomLink.clone()));
        copy.xalAddressDetails = ((xalAddressDetails == null)?null:((AddressDetails) xalAddressDetails.clone()));
        copy.snippet = ((snippet == null)?null:((Snippet) snippet.clone()));
        copy.abstractView = ((abstractView == null)?null:((AbstractView ) abstractView.clone()));
        copy.timePrimitive = ((timePrimitive == null)?null:((TimePrimitive ) timePrimitive.clone()));
        copy.styleSelector = new ArrayList<StyleSelector>((getStyleSelector().size()));
        for (StyleSelector iter: styleSelector) {
            copy.styleSelector.add(iter.clone());
        }
        copy.region = ((region == null)?null:((Region) region.clone()));
        copy.metadata = ((metadata == null)?null:((Metadata) metadata.clone()));
        copy.extendedData = ((extendedData == null)?null:((ExtendedData) extendedData.clone()));
        copy.featureSimpleExtension = new ArrayList<Object>((getFeatureSimpleExtension().size()));
        for (Object iter: featureSimpleExtension) {
            copy.featureSimpleExtension.add(iter);
        }
        copy.featureObjectExtension = new ArrayList<AbstractObject>((getFeatureObjectExtension().size()));
        for (AbstractObject iter: featureObjectExtension) {
            copy.featureObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
