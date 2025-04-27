
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.util.DoubleCompare;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Icon>}see also {@code <icon>}.
 * <p>
 * {@code <Icon><href>Sunset.jpg</href> </Icon> }
 * </p>
 * <p>
 * A custom Icon. In {@code <IconStyle>}, the only child element of {@code <Icon>} is {@code <href>: <href>:}
 * An HTTP address or a local file specification used to load an icon. 
 * </p>
 * <p>
 * Defines an image associated with an Icon style or overlay. {@code <Icon>}has the same child 
 * elements as {@code <Link>}. The required {@code <href>}child element defines the location of the 
 * image to be used as the overlay or as the icon for the placemark. This location 
 * can either be on a local file system or a remote web server. 
 * </p>
 * <p>
 * Defines the image associated with the Overlay. The {@code <href>}element defines the location 
 * of the image to be used as the Overlay. This location can be either on a local file 
 * system or on a web server. If this element is omitted or contains no {@code <href>}, a rectangle
 * is drawn using the color and size defined by the ground or screen overlay. {@code <Icon>
 * <href>icon.jpg</href> </Icon>}
 * </p>
 *
 * Syntax:
 * <pre><strong>&lt;Icon id="ID"&gt;</strong>
 *   &lt;!-- specific to Icon --&gt;
 *   &lt;href&gt;<em>...</em>&lt;/href&gt;                      &lt;!-- anyURI --&gt;
 *   &lt;refreshMode&gt;onChange&lt;/refreshMode&gt;
 *     &lt;!-- kml:refreshModeEnum: onChange, onInterval, <em>or</em> onExpire --&gt;
 *   &lt;refreshInterval&gt;4&lt;/refreshInterval&gt;  &lt;!-- float --&gt;
 *   &lt;viewRefreshMode&gt;never&lt;/viewRefreshMode&gt;
 *     &lt;!-- kml:viewRefreshModeEnum: never, onStop, onRequest, onRegion --&gt;
 *   &lt;viewRefreshTime&gt;4&lt;/viewRefreshTime&gt;  &lt;!-- float --&gt;
 *   &lt;viewBoundScale&gt;1&lt;/viewBoundScale&gt;    &lt;!-- float --&gt;
 *   &lt;viewFormat&gt;...&lt;/viewFormat&gt;          &lt;!-- string --&gt;
 *   &lt;httpQuery&gt;...&lt;/httpQuery&gt;            &lt;!-- string --&gt;
 *   <strong>&lt;/Icon&gt;</strong></pre>
 * 
 * Contained By: 
 *
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Icon", namespace = "", propOrder = {
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
@XmlRootElement(name = "Icon", namespace = "http://www.opengis.net/kml/2.2")
public class Icon
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
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "onChange")
    protected RefreshMode refreshMode;
    /**
     * {@code {@code <refreshInterval>}}
     * <p>
     * Indicates to refresh the file every n seconds.
     * </p>
     *
     *
     *
     */
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "4.0")
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
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "never")
    protected ViewRefreshMode viewRefreshMode;
    /**
     * {@code <viewrefreshtime>}
     * <p>
     * After camera movement stops, specifies the number of seconds to wait before refreshing 
     * the view. (See {@code {@code <viewRefreshMode>}} and onStop above.)
     * </p>
     *
     *
     *
     */
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "4.0")
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
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2", defaultValue = "1.0")
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
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
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
    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected String httpQuery;
    @XmlElement(name = "LinkSimpleExtensionGroup", namespace = "http://www.opengis.net/kml/2.2")
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
    @XmlElement(name = "LinkObjectExtensionGroup", namespace = "http://www.opengis.net/kml/2.2")
    protected List<AbstractObject> linkObjectExtension;

    public Icon() {
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
            linkSimpleExtension = new ArrayList<>();
        }
        return this.linkSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getLinkObjectExtension() {
        if (linkObjectExtension == null) {
            linkObjectExtension = new ArrayList<>();
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

        Icon icon = (Icon) object;
        return refreshMode == icon.refreshMode
                && viewRefreshMode == icon.viewRefreshMode
                && Objects.equals(refreshInterval, icon.refreshInterval)
                && Objects.equals(viewRefreshTime, icon.viewRefreshTime)
                && Objects.equals(viewBoundScale, icon.viewBoundScale)
                && Objects.equals(viewFormat, icon.viewFormat)
                && Objects.equals(httpQuery, icon.httpQuery)
                && Objects.equals(linkSimpleExtension, icon.linkSimpleExtension)
                && Objects.equals(linkObjectExtension, icon.linkObjectExtension);
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
    public Icon addToLinkSimpleExtension(final Object linkSimpleExtension) {
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
    public Icon addToLinkObjectExtension(final AbstractObject linkObjectExtension) {
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
    public Icon addToObjectSimpleExtension(final Object objectSimpleExtension) {
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
    public Icon addToBasicLinkSimpleExtension(final Object basicLinkSimpleExtension) {
        super.getBasicLinkSimpleExtension().add(basicLinkSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setBasicLinkObjectExtension(final List<AbstractObject> basicLinkObjectExtension) {
        super.setBasicLinkObjectExtension(basicLinkObjectExtension);
    }

    @Obvious
    @Override
    public Icon addToBasicLinkObjectExtension(final AbstractObject basicLinkObjectExtension) {
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
    public Icon withRefreshMode(final RefreshMode refreshMode) {
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
    public Icon withRefreshInterval(final Double refreshInterval) {
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
    public Icon withViewRefreshMode(final ViewRefreshMode viewRefreshMode) {
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
    public Icon withViewRefreshTime(final Double viewRefreshTime) {
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
    public Icon withViewBoundScale(final Double viewBoundScale) {
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
    public Icon withViewFormat(final String viewFormat) {
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
    public Icon withHttpQuery(final String httpQuery) {
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
    public Icon withLinkSimpleExtension(final List<Object> linkSimpleExtension) {
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
    public Icon withLinkObjectExtension(final List<AbstractObject> linkObjectExtension) {
        this.setLinkObjectExtension(linkObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Icon withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Icon withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Icon withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Icon withHref(final String href) {
        super.withHref(href);
        return this;
    }

    @Obvious
    @Override
    public Icon withBasicLinkSimpleExtension(final List<Object> basicLinkSimpleExtension) {
        super.withBasicLinkSimpleExtension(basicLinkSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Icon withBasicLinkObjectExtension(final List<AbstractObject> basicLinkObjectExtension) {
        super.withBasicLinkObjectExtension(basicLinkObjectExtension);
        return this;
    }

    @Override
    public Icon clone() {
        Icon copy;
        copy = ((Icon) super.clone());
        copy.linkSimpleExtension = new ArrayList<>((getLinkSimpleExtension().size()));
        copy.linkSimpleExtension.addAll(linkSimpleExtension);
        copy.linkObjectExtension = new ArrayList<>((getLinkObjectExtension().size()));
        for (AbstractObject iter: linkObjectExtension) {
            copy.linkObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
