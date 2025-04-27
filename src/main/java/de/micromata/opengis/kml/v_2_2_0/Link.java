
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
 * whether to scale the bounding box parameters that are sent to the server ({@code <viewBoundScale> }
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
 * Extends: 
 *
 * 
 * Contained By: 
 *
 *
 * 
 * See Also: 
 * {@code <NetworkLinkControl>}
 * {@code <Region>}
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", propOrder = {
    "refreshMode",
    "refreshInterval",
    "viewRefreshMode",
    "viewRefreshTime",
    "viewBoundScale",
    "viewFormat",
    "httpQuery",
    "linkSimpleExtension",
    "linkObjectExtension"
})
@XmlRootElement(name = "Link", namespace = "http://www.opengis.net/kml/2.2")
public class Link
    extends BasicLink
    implements Cloneable
{

    /**
     * RefreshMode
     * <p>
     * onChange, onInterval, onExpire
     * </p>
     * 
     * See Also: 
     * See {@code <Link>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "onChange")
    protected RefreshMode refreshMode;
    /**
     * {@code <refreshInterval>}
     * <p>
     * Indicates to refresh the file every n seconds.
     * </p>
     *
     *
     *
     */
    @XmlElement(defaultValue = "4.0")
    protected Double refreshInterval;
    /**
     * ViewRefreshMode
     * <p>
     * never, onRequest, onStop, onRegion
     * </p>
     * 
     * See Also: 
     * See {@code <Link>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "never")
    protected ViewRefreshMode viewRefreshMode;
    /**
     * {@code <viewrefreshtime>}
     * <p>
     * After camera movement stops, specifies the number of seconds to wait before refreshing 
     * the view. (See {@code <viewRefreshMode>} and onStop above.) 
     * </p>
     *
     *
     *
     */
    @XmlElement(defaultValue = "4.0")
    protected Double viewRefreshTime;
    /**
     * {@code <viewboundscale>}
     * <p>
     * Scales the BBOX parameters before sending them to the server. A value less than
     *  1 specifies to use less than the full view (screen). A value greater than 1 specifies
     * to fetch an area that extends beyond the edges of the current view.
     * </p>
     *
     *
     *
     */
    @XmlElement(defaultValue = "1.0")
    protected Double viewBoundScale;
    /**
     * {@code <viewFormat>}
     * <p>
     * BBOX=[bboxWest],[bboxSouth],[bboxEast],[bboxNorth]
     * </p>
     * <p>
     * If you specify a {@code <viewRefreshMode>} of onStop and do not include the {@code <viewFormat>} 
     * tag in the file, the following information is automatically appended to the query 
     * string: 
     * </p>
     * <p>
     * If you specify an empty {@code <viewFormat>} tag, no information is appended to the query 
     * string. 
     * </p>
     * <p>
     * Specifies the format of the query string that is appended to the Link's {@code <href>}before 
     * the file is fetched.(If the {@code <href>}specifies a local file, this element is ignored.) 
     * </p>
     * <p>
     * This information matches the Web Map Service (WMS) bounding box specification.
     * </p>
     * <p>
     * You can also specify a custom set of viewing parameters to add to the query string.
     * If you supply a format string, it is used instead of the BBOX information. If you
     * also want the BBOX information, you need to add those parameters along with the
     * custom parameters.
     * </p>
     * <p>
     * You can use any of the following parameters in your format string (and Google Earth 
     * will substitute the appropriate current value at the time it creates the query string): 
     * [lookatLon], [lookatLat] - longitude and latitude of the point that LookAt is 
     * viewing [lookatRange], [lookatTilt], [lookatHeading] - values used by the LookAt 
     * element (see descriptions of {@code <range>}, {@code <tilt>}, and {@code <heading>} in LookAt) [lookatTerrainLon],
     * [lookatTerrainLat], [lookatTerrainAlt] - point on the terrain in degrees/meters 
     * that LookAt is viewing [cameraLon], [cameraLat], [cameraAlt] - degrees/meters 
     * of the eyepoint for the camera [horizFov], [vertFov] - horizontal, vertical field 
     * of view for the camera [horizPixels], [vertPixels] - size in pixels of the 3D viewer 
     * [terrainEnabled] - indicates whether the 3D viewer is showing terrain 
     * </p>
     *
     *
     *
     */
    protected String viewFormat;
    /**
     * {@code <httpQuery>}
     * <p>
     * Appends information to the query string, based on the parameters specified. (Google
     * Earth substitutes the appropriate current value at the time it creates the query
     * string.) The following parameters are supported: [clientVersion] [kmlVersion] [clientName]
     * [language]
     * </p>
     *
     *
     *
     */
    protected String httpQuery;
    @XmlElement(name = "LinkSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> linkSimpleExtension;
    /**
     * {@code <Object>}
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the Update mechanism is to 
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
    @XmlElement(name = "LinkObjectExtensionGroup")
    protected List<AbstractObject> linkObjectExtension;

    public Link() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link RefreshMode}
     *
     */
    public RefreshMode getRefreshMode() {
        return refreshMode;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshMode}
     *
     */
    public void setRefreshMode(RefreshMode value) {
        this.refreshMode = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *
     */
    public Double getRefreshInterval() {
        return refreshInterval;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *
     */
    public void setRefreshInterval(Double value) {
        this.refreshInterval = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link ViewRefreshMode}
     *
     */
    public ViewRefreshMode getViewRefreshMode() {
        return viewRefreshMode;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link ViewRefreshMode}
     *
     */
    public void setViewRefreshMode(ViewRefreshMode value) {
        this.viewRefreshMode = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *
     */
    public Double getViewRefreshTime() {
        return viewRefreshTime;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *
     */
    public void setViewRefreshTime(Double value) {
        this.viewRefreshTime = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *
     */
    public Double getViewBoundScale() {
        return viewBoundScale;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *
     */
    public void setViewBoundScale(Double value) {
        this.viewBoundScale = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *
     */
    public String getViewFormat() {
        return viewFormat;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *
     */
    public void setViewFormat(String value) {
        this.viewFormat = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *
     */
    public String getHttpQuery() {
        return httpQuery;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *
     */
    public void setHttpQuery(String value) {
        this.httpQuery = value;
    }

    /**
     *
     * 
     */
    public List<Object> getLinkSimpleExtension() {
        if (linkSimpleExtension == null) {
            linkSimpleExtension = new ArrayList<Object>();
        }
        return this.linkSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLinkObjectExtension() {
        if (linkObjectExtension == null) {
            linkObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.linkObjectExtension;
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

        Link link = (Link) object;
        return refreshMode == link.refreshMode
                && viewRefreshMode == link.viewRefreshMode
                && Objects.equals(refreshInterval, link.refreshInterval)
                && Objects.equals(viewRefreshTime, link.viewRefreshTime)
                && Objects.equals(viewBoundScale, link.viewBoundScale)
                && Objects.equals(viewFormat, link.viewFormat)
                && Objects.equals(httpQuery, link.httpQuery)
                && Objects.equals(linkSimpleExtension, link.linkSimpleExtension)
                && Objects.equals(linkObjectExtension, link.linkObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(refreshMode);
        result = 31 * result + Objects.hashCode(refreshInterval);
        result = 31 * result + Objects.hashCode(viewRefreshMode);
        result = 31 * result + Objects.hashCode(viewRefreshTime);
        result = 31 * result + Objects.hashCode(viewBoundScale);
        result = 31 * result + Objects.hashCode(viewFormat);
        result = 31 * result + Objects.hashCode(httpQuery);
        result = 31 * result + Objects.hashCode(linkSimpleExtension);
        result = 31 * result + Objects.hashCode(linkObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param linkSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setLinkSimpleExtension(final List<Object> linkSimpleExtension) {
        this.linkSimpleExtension = linkSimpleExtension;
    }

    /**
     * add a value to the linkSimpleExtension property collection
     *
     * @param linkSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Link addToLinkSimpleExtension(final Object linkSimpleExtension) {
        this.getLinkSimpleExtension().add(linkSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param linkObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setLinkObjectExtension(final List<AbstractObject> linkObjectExtension) {
        this.linkObjectExtension = linkObjectExtension;
    }

    /**
     * add a value to the linkObjectExtension property collection
     *
     * @param linkObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Link addToLinkObjectExtension(final AbstractObject linkObjectExtension) {
        this.getLinkObjectExtension().add(linkObjectExtension);
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
    public Link addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setBasicLinkSimpleExtension(final List<Object> basicLinkSimpleExtension) {
        super.setBasicLinkSimpleExtension(basicLinkSimpleExtension);
    }

    @Obvious
    @Override
    public Link addToBasicLinkSimpleExtension(final Object basicLinkSimpleExtension) {
        super.getBasicLinkSimpleExtension().add(basicLinkSimpleExtension);
        return this;
    }

    /**
     * @see basicLinkObjectExtension
     *
     */
    @Obvious
    @Override
    public void setBasicLinkObjectExtension(final List<AbstractObject> basicLinkObjectExtension) {
        super.setBasicLinkObjectExtension(basicLinkObjectExtension);
    }

    @Obvious
    @Override
    public Link addToBasicLinkObjectExtension(final AbstractObject basicLinkObjectExtension) {
        super.getBasicLinkObjectExtension().add(basicLinkObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param refreshMode
     *     required parameter
     */
    public Link withRefreshMode(final RefreshMode refreshMode) {
        this.setRefreshMode(refreshMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param refreshInterval
     *     required parameter
     */
    public Link withRefreshInterval(final Double refreshInterval) {
        this.setRefreshInterval(refreshInterval);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewRefreshMode
     *     required parameter
     */
    public Link withViewRefreshMode(final ViewRefreshMode viewRefreshMode) {
        this.setViewRefreshMode(viewRefreshMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewRefreshTime
     *     required parameter
     */
    public Link withViewRefreshTime(final Double viewRefreshTime) {
        this.setViewRefreshTime(viewRefreshTime);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewBoundScale
     *     required parameter
     */
    public Link withViewBoundScale(final Double viewBoundScale) {
        this.setViewBoundScale(viewBoundScale);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param viewFormat
     *     required parameter
     */
    public Link withViewFormat(final String viewFormat) {
        this.setViewFormat(viewFormat);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param httpQuery
     *     required parameter
     */
    public Link withHttpQuery(final String httpQuery) {
        this.setHttpQuery(httpQuery);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param linkSimpleExtension
     *     required parameter
     */
    public Link withLinkSimpleExtension(final List<Object> linkSimpleExtension) {
        this.setLinkSimpleExtension(linkSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param linkObjectExtension
     *     required parameter
     */
    public Link withLinkObjectExtension(final List<AbstractObject> linkObjectExtension) {
        this.setLinkObjectExtension(linkObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Link withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Link withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Link withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Link withHref(final String href) {
        super.withHref(href);
        return this;
    }

    @Obvious
    @Override
    public Link withBasicLinkSimpleExtension(final List<Object> basicLinkSimpleExtension) {
        super.withBasicLinkSimpleExtension(basicLinkSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Link withBasicLinkObjectExtension(final List<AbstractObject> basicLinkObjectExtension) {
        super.withBasicLinkObjectExtension(basicLinkObjectExtension);
        return this;
    }

    @Override
    public Link clone() {
        Link copy;
        copy = ((Link) super.clone());
        copy.linkSimpleExtension = new ArrayList<Object>((getLinkSimpleExtension().size()));
        for (Object iter: linkSimpleExtension) {
            copy.linkSimpleExtension.add(iter);
        }
        copy.linkObjectExtension = new ArrayList<AbstractObject>((getLinkObjectExtension().size()));
        for (AbstractObject iter: linkObjectExtension) {
            copy.linkObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
