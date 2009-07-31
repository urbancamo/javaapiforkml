
package de.micromata.opengis.kml.v_2_2_0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipOutputStream;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import de.micromata.opengis.kml.v_2_2_0.gx.Tour;
import org.xml.sax.SAXException;


/**
 * <kml>
 * <p>
 * The root element of a KML file. This element is required. It follows the xml declaration 
 * at the beginning of the file. The hint attribute is used as a signal to Google Earth 
 * to display the file as celestial data. 
 * </p>
 * <p>
 * The <kml> element may also include the namespace for any external XML schemas that 
 * are referenced within the file. 
 * </p>
 * <p>
 * A basic <kml> element contains 0 or 1 Feature and 0 or 1 NetworkLinkControl: 
 * </p>
 * <p>
 * <kml xmlns="http://www.opengis.net/kml/2.2"> <NetworkLinkControl> ... </NetworkLinkControl> 
 * <!-- 0 or 1 Feature elements --> </kml> 
 * </p>
 * 
 * Syntax: 
 * <pre>&lt;kml xmlns="http://www.opengis.net/kml/2.2" <span>hint="target=sky"</span>&gt; ... &lt;/kml&gt;</pre>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmlType", propOrder = {
    "networkLinkControl",
    "feature",
    "kmlSimpleExtension",
    "kmlObjectExtension"
})
@XmlRootElement(name = "kml", namespace = "http://www.opengis.net/kml/2.2")
public class Kml {

    /**
     * <NetworkLinkControl>
     * <p>
     * Controls the behavior of files fetched by a <NetworkLink>. 
     * </p>
     * 
     * Syntax: 
     * <pre><strong>&lt;NetworkLinkControl&gt;</strong>
     *   &lt;minRefreshPeriod&gt;0&lt;/minRefreshPeriod&gt;           &lt;!-- float --&gt;
     *   <span class="style2">&lt;maxSessionLength&gt;-1&lt;/maxSessionLength&gt;          &lt;!-- float --&gt; </span>
     *   &lt;cookie&gt;<em>...</em>&lt;/cookie&gt;                             &lt;!-- string --&gt;                             
     *   &lt;message&gt;<em>...</em>&lt;/message&gt;                           &lt;!-- string --&gt;
     *   &lt;linkName&gt;<em>...</em>&lt;/linkName&gt;                         &lt;!-- string --&gt;                          
     *   &lt;linkDescription&gt;<em>...</em>&lt;/linkDescription&gt;           &lt;!-- string --&gt;              
     *   &lt;linkSnippet maxLines="2"&gt;<em>...</em>&lt;/linkSnippet&gt;      &lt;!-- string --&gt;                      
     *   &lt;expires&gt;...&lt;/expires&gt;                           &lt;!-- kml:dateTime --&gt;
     *   &lt;Update&gt;...&lt;/Update&gt;                             &lt;!-- Change,Create,Delete --&gt;
     *   <span><em>&lt;AbstractView&gt;...&lt;/AbstractView&gt;</em>                 &lt;!-- LookAt <em>or</em> Camera --&gt;</span>
     * <strong>&lt;/NetworkLinkControl&gt;</strong></pre>
     * 
     * See Also: 
     * <Update>
     * <NetworkLink>
     * 
     * 
     * 
     */
    @XmlElement(name = "NetworkLinkControl")
    protected NetworkLinkControl networkLinkControl;
    /**
     * <Feature>
     * <p>
     * This is an abstract element and cannot be used directly in a KML file. The following 
     * diagram shows how some of a Feature's elements appear in Google Earth. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;
     * <strong>&lt;!--<em> Feature</em> id="ID" --&gt;</strong>                &lt;!-- Document,Folder,
     *                                              NetworkLink,Placemark,
     *                                              GroundOverlay,PhotoOverlay,ScreenOverlay --&gt;
     *   &lt;name&gt;<em>...</em>&lt;/name&gt;                      &lt;!-- string --&gt;
     *   &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
     *   &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
     *   <span>&lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
     *   &lt;atom:link&gt;...&lt;/atom:link&gt;</span><span>            &lt;!-- xmlns:atom --&gt;</span>
     *   &lt;address&gt;<em>...</em>&lt;/address&gt;                &lt;!-- string --&gt;
     *   &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;<br>  &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;<br>  &lt;Snippet maxLines="2"&gt;<em>...</em>&lt;/Snippet&gt;   &lt;!-- string --&gt;
     *   &lt;description&gt;<em>...</em>&lt;/description&gt;        &lt;!-- string --&gt;
     *   <span><em>&lt;AbstractView&gt;...&lt;/AbstractView&gt;</em>      &lt;!-- Camera <em>or</em> LookAt --&gt;</span>
     *   &lt;<em>TimePrimitive</em>&gt;...&lt;/<em>TimePrimitive</em>&gt;    &lt;!-- TimeStamp or TimeSpan --&gt;
     *   &lt;styleUrl&gt;<em>...</em>&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
     *   &lt;<em>StyleSelector&gt;...&lt;/StyleSelector&gt;</em>
     *   &lt;Region&gt;...&lt;/Region&gt;
     *   <span>&lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
     *   &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;<br></span>&lt;-- /<em>Feature</em> --&gt;</pre>
     * 
     * Extends: 
     * @see: <Object>
     * 
     * Extended By: 
     * @see: <Container>
     * @see: <Overlay>
     * @see: <Placemark>
     * @see: <NetworkLink>
     * @see: <gx:Tour>
     * 
     * 
     * 
     */
    @XmlElementRef(name = "AbstractFeatureGroup", namespace = "http://www.opengis.net/kml/2.2")
    protected Feature feature;
    @XmlElement(name = "KmlSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> kmlSimpleExtension;
    /**
     * <Object>
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the <Update> mechanism is to 
     * be used. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;<strong>
     * &lt;!-- <em>Object</em> id="ID" targetId="NCName" --&gt;
     * &lt;!-- /<em>Object</em>&gt; --&gt;</strong></pre>
     * 
     * 
     * 
     */
    @XmlElement(name = "KmlObjectExtensionGroup")
    protected List<AbstractObject> kmlObjectExtension;
    @XmlAttribute(name = "hint")
    protected String hint;
    private transient JAXBContext jc = null;
    private transient Marshaller m = null;
    private final static String SCHEMA_LOCATION = "src/main/resources/schema/ogckml/ogckml22.xsd";

    public Kml() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link NetworkLinkControl}
     *     
     */
    public NetworkLinkControl getNetworkLinkControl() {
        return networkLinkControl;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkLinkControl}
     *     
     */
    public void setNetworkLinkControl(NetworkLinkControl value) {
        this.networkLinkControl = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@code <}{@link Document}{@code>}
     *     {@code <}{@link ScreenOverlay}{@code>}
     *     {@code <}{@link Overlay}{@code>}
     *     {@code <}{@link PhotoOverlay}{@code>}
     *     {@code <}{@link Container}{@code>}
     *     {@code <}{@link Feature}{@code>}
     *     {@code <}{@link Tour}{@code>}
     *     {@code <}{@link Placemark}{@code>}
     *     {@code <}{@link GroundOverlay}{@code>}
     *     {@code <}{@link Folder}{@code>}
     *     {@code <}{@link NetworkLink}{@code>}
     *     
     */
    public Feature getFeature() {
        return feature;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link Document}{@code>}
     *     {@code <}{@link ScreenOverlay}{@code>}
     *     {@code <}{@link Overlay}{@code>}
     *     {@code <}{@link PhotoOverlay}{@code>}
     *     {@code <}{@link Container}{@code>}
     *     {@code <}{@link Feature}{@code>}
     *     {@code <}{@link Tour}{@code>}
     *     {@code <}{@link Placemark}{@code>}
     *     {@code <}{@link GroundOverlay}{@code>}
     *     {@code <}{@link Folder}{@code>}
     *     {@code <}{@link NetworkLink}{@code>}
     *     
     */
    public void setFeature(Feature value) {
        this.feature = ((Feature ) value);
    }

    /**
     * 
     */
    public List<Object> getKmlSimpleExtension() {
        if (kmlSimpleExtension == null) {
            kmlSimpleExtension = new ArrayList<Object>();
        }
        return this.kmlSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getKmlObjectExtension() {
        if (kmlObjectExtension == null) {
            kmlObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.kmlObjectExtension;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((networkLinkControl == null)? 0 :networkLinkControl.hashCode()));
        result = ((prime*result)+((feature == null)? 0 :feature.hashCode()));
        result = ((prime*result)+((kmlSimpleExtension == null)? 0 :kmlSimpleExtension.hashCode()));
        result = ((prime*result)+((kmlObjectExtension == null)? 0 :kmlObjectExtension.hashCode()));
        result = ((prime*result)+((hint == null)? 0 :hint.hashCode()));
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
        if ((obj instanceof Kml) == false) {
            return false;
        }
        Kml other = ((Kml) obj);
        if (networkLinkControl == null) {
            if (other.networkLinkControl!= null) {
                return false;
            }
        } else {
            if (networkLinkControl.equals(other.networkLinkControl) == false) {
                return false;
            }
        }
        if (feature == null) {
            if (other.feature!= null) {
                return false;
            }
        } else {
            if (feature.equals(other.feature) == false) {
                return false;
            }
        }
        if (kmlSimpleExtension == null) {
            if (other.kmlSimpleExtension!= null) {
                return false;
            }
        } else {
            if (kmlSimpleExtension.equals(other.kmlSimpleExtension) == false) {
                return false;
            }
        }
        if (kmlObjectExtension == null) {
            if (other.kmlObjectExtension!= null) {
                return false;
            }
        } else {
            if (kmlObjectExtension.equals(other.kmlObjectExtension) == false) {
                return false;
            }
        }
        if (hint == null) {
            if (other.hint!= null) {
                return false;
            }
        } else {
            if (hint.equals(other.hint) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates a new instance of {@link NetworkLinkControl} and set it to networkLinkControl.
     * 
     * This method is a short version for:
     * <code>
     * NetworkLinkControl networkLinkControl = new NetworkLinkControl();
     * this.setNetworkLinkControl(networkLinkControl); </code>
     * 
     * 
     */
    public NetworkLinkControl createAndSetNetworkLinkControl() {
        NetworkLinkControl newValue = new NetworkLinkControl();
        this.setNetworkLinkControl(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Tour} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * Tour tour = new Tour();
     * this.setFeature(tour); </code>
     * 
     * 
     */
    public Tour createAndSetTour() {
        Tour newValue = new Tour();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ScreenOverlay} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * ScreenOverlay screenOverlay = new ScreenOverlay();
     * this.setFeature(screenOverlay); </code>
     * 
     * 
     */
    public ScreenOverlay createAndSetScreenOverlay() {
        ScreenOverlay newValue = new ScreenOverlay();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PhotoOverlay} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * PhotoOverlay photoOverlay = new PhotoOverlay();
     * this.setFeature(photoOverlay); </code>
     * 
     * 
     */
    public PhotoOverlay createAndSetPhotoOverlay() {
        PhotoOverlay newValue = new PhotoOverlay();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link GroundOverlay} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * GroundOverlay groundOverlay = new GroundOverlay();
     * this.setFeature(groundOverlay); </code>
     * 
     * 
     */
    public GroundOverlay createAndSetGroundOverlay() {
        GroundOverlay newValue = new GroundOverlay();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link NetworkLink} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * NetworkLink networkLink = new NetworkLink();
     * this.setFeature(networkLink); </code>
     * 
     * 
     */
    public NetworkLink createAndSetNetworkLink() {
        NetworkLink newValue = new NetworkLink();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Folder} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * Folder folder = new Folder();
     * this.setFeature(folder); </code>
     * 
     * 
     */
    public Folder createAndSetFolder() {
        Folder newValue = new Folder();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Document} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * Document document = new Document();
     * this.setFeature(document); </code>
     * 
     * 
     */
    public Document createAndSetDocument() {
        Document newValue = new Document();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Placemark} and set it to feature.
     * 
     * This method is a short version for:
     * <code>
     * Placemark placemark = new Placemark();
     * this.setFeature(placemark); </code>
     * 
     * 
     */
    public Placemark createAndSetPlacemark() {
        Placemark newValue = new Placemark();
        this.setFeature(newValue);
        return newValue;
    }

    /**
     * Sets the value of the kmlSimpleExtension property Objects of the following type(s) are allowed in the list List<Object>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withKmlSimpleExtension} instead.
     * 
     * 
     * @param kmlSimpleExtension
     */
    public void setKmlSimpleExtension(final List<Object> kmlSimpleExtension) {
        this.kmlSimpleExtension = kmlSimpleExtension;
    }

    /**
     * add a value to the kmlSimpleExtension property collection
     * 
     * @param kmlSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Kml addToKmlSimpleExtension(final Object kmlSimpleExtension) {
        this.getKmlSimpleExtension().add(kmlSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the kmlObjectExtension property Objects of the following type(s) are allowed in the list List<AbstractObject>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withKmlObjectExtension} instead.
     * 
     * 
     * @param kmlObjectExtension
     */
    public void setKmlObjectExtension(final List<AbstractObject> kmlObjectExtension) {
        this.kmlObjectExtension = kmlObjectExtension;
    }

    /**
     * add a value to the kmlObjectExtension property collection
     * 
     * @param kmlObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Kml addToKmlObjectExtension(final AbstractObject kmlObjectExtension) {
        this.getKmlObjectExtension().add(kmlObjectExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param networkLinkControl
     *     required parameter
     */
    public Kml withNetworkLinkControl(final NetworkLinkControl networkLinkControl) {
        this.setNetworkLinkControl(networkLinkControl);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param feature
     *     required parameter
     */
    public Kml withFeature(final Feature feature) {
        this.setFeature(feature);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param kmlSimpleExtension
     *     required parameter
     */
    public Kml withKmlSimpleExtension(final List<Object> kmlSimpleExtension) {
        this.setKmlSimpleExtension(kmlSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param kmlObjectExtension
     *     required parameter
     */
    public Kml withKmlObjectExtension(final List<AbstractObject> kmlObjectExtension) {
        this.setKmlObjectExtension(kmlObjectExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param hint
     *     required parameter
     */
    public Kml withHint(final String hint) {
        this.setHint(hint);
        return this;
    }

    private JAXBContext getJaxbContext()
        throws JAXBException
    {
        if (jc == null) {
            jc = JAXBContext.newInstance((Kml.class));
        }
        return jc;
    }

    private Marshaller createMarshaller()
        throws JAXBException
    {
        if (m == null) {
            m = this.getJaxbContext().createMarshaller();
        }
        return m;
    }

    /**
     * Java to KML
     * 
     */
    public boolean marshal(final OutputStream outputstream)
        throws FileNotFoundException
    {
        try {
            m = this.createMarshaller();
            JAXBElement<Kml> jaxbRootElement = new JAXBElement<Kml>(new QName("http://www.opengis.net/kml/2.2", "kml"), Kml.class, this);
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(jaxbRootElement, outputstream);
            return true;
        } catch (JAXBException _x) {
            _x.printStackTrace();
            return false;
        }
    }

    /**
     * Java to KML
     * 
     */
    public boolean marshal(final Writer writer) {
        try {
            m = this.createMarshaller();
            JAXBElement<Kml> jaxbRootElement = new JAXBElement<Kml>(new QName("http://www.opengis.net/kml/2.2", "kml"), Kml.class, this);
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(jaxbRootElement, writer);
            return true;
        } catch (JAXBException _x) {
            _x.printStackTrace();
            return false;
        }
    }

    /**
     * Java to KML
     * 
     */
    public boolean marshal(final File filename, final boolean zipped)
        throws FileNotFoundException
    {
        OutputStream out = new FileOutputStream(filename);
        if (zipped == true) {
            out = new ZipOutputStream(out);
        }
        return this.marshal(out);
    }

    private static boolean validate(final Unmarshaller unmarshaller) {
        try {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            File schemaFile = new File(SCHEMA_LOCATION);
            Schema schema = sf.newSchema(schemaFile);
            unmarshaller.setSchema(schema);
            return true;
        } catch (SAXException _x) {
            _x.printStackTrace();
        }
        return false;
    }

    /**
     * KML to Java
     * 
     */
    public static Kml unmarshal(final File file, final boolean validate) {
        try {
            Unmarshaller unmarshaller = JAXBContext.newInstance((Kml.class)).createUnmarshaller();
            if (validate == true) {
                Kml.validate(unmarshaller);
            }
            StreamSource filesource = new StreamSource(file);
            Kml jaxbRootElement = ((Kml) unmarshaller.unmarshal(filesource));
            return jaxbRootElement;
        } catch (JAXBException _x) {
            _x.printStackTrace();
        }
        return null;
    }

    /**
     * KML to Java
     * 
     */
    public static Kml unmarshal(final File file) {
        return Kml.unmarshal(file, false);
    }

    /**
     * KML to Java
     * 
     */
    public static Kml unmarshal(final String content) {
        try {
            StringReader string = new StringReader(content);
            Unmarshaller unmarshaller = JAXBContext.newInstance((Kml.class)).createUnmarshaller();
            Kml jaxbRootElement = ((Kml) unmarshaller.unmarshal(string));
            return jaxbRootElement;
        } catch (JAXBException _x) {
            _x.printStackTrace();
        }
        return null;
    }

}
