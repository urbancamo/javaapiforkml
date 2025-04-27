
package de.micromata.opengis.kml.v_2_2_0.atom;

import jakarta.xml.bind.annotation.*;

import java.util.Objects;

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
 * Syntax: 
 * <pre><strong>&lt;Link id="ID"&gt;</strong>
 *   &lt;!-- specific to Link --&gt;
 *   &lt;href&gt;<em>...</em>&lt;/href&gt;                      &lt;!-- <span>string</span> --&gt;
 *   &lt;refreshMode&gt;onChange&lt;/refreshMode&gt;   
 *     &lt;!-- refreshModeEnum: onChange, onInterval, <em>or</em> onExpire --&gt;   
 *   &lt;refreshInterval&gt;4&lt;/refreshInterval&gt;  &lt;!-- float --&gt;
 *   &lt;viewRefreshMode&gt;never&lt;/viewRefreshMode&gt; 
 *     &lt;!-- viewRefreshModeEnum: never, onStop, onRequest, onRegion --&gt;
 *   &lt;viewRefreshTime&gt;4&lt;/viewRefreshTime&gt;  &lt;!-- float --&gt;
 *   &lt;viewBoundScale&gt;1&lt;/viewBoundScale&gt;    &lt;!-- float --&gt;
 *   &lt;viewFormat&gt;BBOX=[bboxWest],[bboxSouth],[bboxEast],[bboxNorth]&lt;<strong>/</strong>viewFormat&gt;
 *                                         &lt;!-- string --&gt;
 *   &lt;httpQuery&gt;...&lt;/httpQuery&gt;            &lt;!-- string --&gt;
 * <strong>&lt;/Link&gt;</strong></pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "link")
public class Link implements Cloneable
{

    /**
     * <p>
     * A URL (either an HTTP address or a local file specification). When the parent of 
     * {@code <Link>} is a NetworkLink, {@code <href>}is a KML file. When the parent of {@code <Link>} is a Model, 
     * {@code <href>}is a COLLADA file. When the parent of {@code <Icon>}(same fields as {@code <Link>}) is an 
     * Overlay, {@code <href>}is an image. Relative URLs can be used in this tag and are evaluated 
     * relative to the enclosing KML file. 
     * </p>
     * <p>
     * An HTTP address or a local file specification used to load an icon. 
     * </p>
     * <p>
     * Specifies the URI of the image used in the List View for the Feature. 
     * </p>
     */
    @XmlAttribute(name = "href", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(name = "rel")
    @XmlSchemaType(name = "anySimpleType")
    protected String rel;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "hreflang")
    protected String hreflang;
    @XmlAttribute(name = "title")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "length")
    @XmlSchemaType(name = "anySimpleType")
    protected String length;

    /**
     * Value constructor with only mandatory fields
     * 
     * @param href
     *     required parameter
     */
    public Link(final String href) {
        super();
        this.href = href;
    }

    /**
     * Default no-arg constructor is private. Use overloaded constructor instead! (Temporary solution, till a better and more suitable ObjectFactory is created.) 
     * 
     */
    @Deprecated
    private Link() {
        super();
    }

    /**
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getRel() {
        return rel;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setRel(String value) {
        this.rel = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getHreflang() {
        return hreflang;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setHreflang(String value) {
        this.hreflang = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Link link = (Link) object;
        return Objects.equals(href, link.href)
                && Objects.equals(rel, link.rel)
                && Objects.equals(type, link.type)
                && Objects.equals(hreflang, link.hreflang)
                && Objects.equals(title, link.title)
                && Objects.equals(length, link.length);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(href);
        result = 31 * result + Objects.hashCode(rel);
        result = 31 * result + Objects.hashCode(type);
        result = 31 * result + Objects.hashCode(hreflang);
        result = 31 * result + Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(length);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param rel
     *     required parameter
     */
    public Link withRel(final String rel) {
        this.setRel(rel);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param type
     *     required parameter
     */
    public Link withType(final String type) {
        this.setType(type);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param hreflang
     *     required parameter
     */
    public Link withHreflang(final String hreflang) {
        this.setHreflang(hreflang);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param title
     *     required parameter
     */
    public Link withTitle(final String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param length
     *     required parameter
     */
    public Link withLength(final String length) {
        this.setLength(length);
        return this;
    }

    @Override
    public Link clone() {
        Link copy;
        try {
            copy = ((Link) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
