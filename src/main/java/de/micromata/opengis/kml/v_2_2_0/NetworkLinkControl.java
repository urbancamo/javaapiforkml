
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <NetworkLinkControl>}
 * <p>
 * Controls the behavior of files fetched by a NetworkLink. 
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
 * NetworkLink
 * Update
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLinkControlType", propOrder = {
    "minRefreshPeriod",
    "maxSessionLength",
    "cookie",
    "message",
    "linkName",
    "linkDescription",
    "linkSnippet",
    "expires",
    "update",
    "abstractView",
    "networkLinkControlSimpleExtension",
    "networkLinkControlObjectExtension"
})
@XmlRootElement(name = "NetworkLinkControl", namespace = "http://www.opengis.net/kml/2.2")
public class NetworkLinkControl implements Cloneable
{

    /**
     * {@code <minrefreshperiod>}
     * <p>
     * Specified in seconds, {@code <minRefreshPeriod>} is the minimum allowed time between fetches
     * of the file. This parameter allows servers to throttle fetches of a particular file 
     * and to tailor refresh rates to the expected rate of change to the data. For example, 
     * a user might set a link refresh to 5 seconds, but you could set your minimum refresh 
     * period to 3600 to limit refresh updates to once every hour. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double minRefreshPeriod;
    /**
     * {@code <maxsessionlength>}
     * <p>
     * Specified in seconds, {@code <maxSessionLength>} is the maximum amount of time for which
     * the client NetworkLink can remain connected. The default value of -1 indicates not 
     * to terminate the session explicitly. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "-1.0")
    protected double maxSessionLength;
    /**
     * {@code <cookie>}
     * <p>
     * Use this element to append a string to the URL query on the next refresh of the 
     * network link. You can use this data in your script to provide more intelligent handling 
     * on the server side, including version querying and conditional file delivery. 
     * </p>
     * 
     * 
     * 
     */
    protected String cookie;
    /**
     * {@code <message>}
     * <p>
     * You can deliver a pop-up message, such as usage guidelines for your network link. 
     * The message appears when the network link is first loaded into Google Earth, or 
     * when it is changed in the network link control. 
     * </p>
     * 
     * 
     * 
     */
    protected String message;
    /**
     * {@code <linkname>}
     * <p>
     * You can control the name of the network link from the server, so that changes made 
     * to the name on the client side are overridden by the server. 
     * </p>
     * 
     * 
     * 
     */
    protected String linkName;
    /**
     * {@code <linkdescription>}
     * <p>
     * You can control the description of the network link from the server, so that changes 
     * made to the description on the client side are overridden by the server. 
     * </p>
     * 
     * 
     * 
     */
    protected String linkDescription;
    /**
     * {@code <linksnippet maxlines="2" >}
     * <p>
     * You can control the snippet for the network link from the server, so that changes 
     * made to the snippet on the client side are overridden by the server. {@code <linkSnippet> }
     * has a maxLines attribute, an integer that specifies the maximum number of lines 
     * to display. 
     * </p>
     * 
     * 
     * 
     */
    protected Snippet linkSnippet;
    /**
     * {@code <expires>}
     * <p>
     * You can specify a date/time at which the link should be refreshed. This specification 
     * takes effect only if the {@code <refreshMode>} in {@code <Link>} has a value of onExpire. See {@code <refreshMode>} 
     * </p>
     * 
     * 
     * 
     */
    protected String expires;
    /**
     * {@code <Update>}
     * <p>
     * Specifies an addition, change, or deletion to KML data that has already been loaded 
     * using the specified URL. The targetHref specifies the .kml or .kmz file whose 
     * data (within Google Earth) is to be modified. Update is always contained in a 
     * NetworkLinkControl. Furthermore, the file containing the NetworkLinkControl must 
     * have been loaded by a NetworkLink. See the "Topics in KML" page on Updates for a 
     * detailed example of how Update works. 
     * </p>
     * <p>
     * With Update, you can specify any number of Change, Create, and Delete tags for 
     * a .kml file or .kmz archive that has previously been loaded with a network link. 
     * See Update. 
     * </p>
     * 
     * Syntax: 
     * <pre><strong>&lt;Update&gt;
     *   </strong>&lt;targetHref&gt;...&lt;targetHref&gt;    &lt;!-- URL --&gt;
     *   &lt;Change&gt;...&lt;/Change&gt;
     *   &lt;Create&gt;...&lt;/Create&gt;
     *   &lt;Delete&gt;...&lt;/Delete&gt;
     * <strong>&lt;/Update&gt;</strong></pre>
     * 
     * Contained By: 
     *
     *
     *
     * 
     * 
     * 
     */
    @XmlElement(name = "Update")
    protected Update update;
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
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;
     * <strong>&lt;!--<em> AbstractView</em> --&gt;</strong>                   &lt;!-- Camera, LookAt --&gt;                
     *   &lt;!-- extends <span class="style1">Object</span> --&gt;
     *   <em>&lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;</em>                        &lt;!-- gx:TimeSpan or gx:TimeStamp --&gt;
     * <strong>&lt;-- /<em>AbstractView</em> --&gt;</strong></pre>
     * 
     * Extends: 
     *
     * 
     * Extended By: 
     *
     *
     * 
     * 
     * 
     */
    @XmlElementRef(name = "AbstractViewGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected AbstractView abstractView;
    @XmlElement(name = "NetworkLinkControlSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> networkLinkControlSimpleExtension;
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
    @XmlElement(name = "NetworkLinkControlObjectExtensionGroup")
    protected List<AbstractObject> networkLinkControlObjectExtension;

    public NetworkLinkControl() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getMinRefreshPeriod() {
        return minRefreshPeriod;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMinRefreshPeriod(double value) {
        this.minRefreshPeriod = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getMaxSessionLength() {
        return maxSessionLength;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setMaxSessionLength(double value) {
        this.maxSessionLength = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getLinkDescription() {
        return linkDescription;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setLinkDescription(String value) {
        this.linkDescription = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Snippet}
     *     
     */
    public Snippet getLinkSnippet() {
        return linkSnippet;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Snippet}
     *     
     */
    public void setLinkSnippet(Snippet value) {
        this.linkSnippet = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link String}
     *     
     */
    public String getExpires() {
        return expires;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link String}
     *     
     */
    public void setExpires(String value) {
        this.expires = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Update}
     *     
     */
    public Update getUpdate() {
        return update;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Update}
     *     
     */
    public void setUpdate(Update value) {
        this.update = value;
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
     */
    public List<Object> getNetworkLinkControlSimpleExtension() {
        if (networkLinkControlSimpleExtension == null) {
            networkLinkControlSimpleExtension = new ArrayList<Object>();
        }
        return this.networkLinkControlSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getNetworkLinkControlObjectExtension() {
        if (networkLinkControlObjectExtension == null) {
            networkLinkControlObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.networkLinkControlObjectExtension;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        NetworkLinkControl that = (NetworkLinkControl) object;
        return Double.compare(minRefreshPeriod, that.minRefreshPeriod) == 0
                && Double.compare(maxSessionLength, that.maxSessionLength) == 0
                && Objects.equals(cookie, that.cookie)
                && Objects.equals(message, that.message)
                && Objects.equals(linkName, that.linkName)
                && Objects.equals(linkDescription, that.linkDescription)
                && Objects.equals(linkSnippet, that.linkSnippet)
                && Objects.equals(expires, that.expires)
                && Objects.equals(update, that.update)
                && Objects.equals(abstractView, that.abstractView)
                && Objects.equals(networkLinkControlSimpleExtension, that.networkLinkControlSimpleExtension)
                && Objects.equals(networkLinkControlObjectExtension, that.networkLinkControlObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = Double.hashCode(minRefreshPeriod);
        result = 31 * result + Double.hashCode(maxSessionLength);
        result = 31 * result + Objects.hashCode(cookie);
        result = 31 * result + Objects.hashCode(message);
        result = 31 * result + Objects.hashCode(linkName);
        result = 31 * result + Objects.hashCode(linkDescription);
        result = 31 * result + Objects.hashCode(linkSnippet);
        result = 31 * result + Objects.hashCode(expires);
        result = 31 * result + Objects.hashCode(update);
        result = 31 * result + Objects.hashCode(abstractView);
        result = 31 * result + Objects.hashCode(networkLinkControlSimpleExtension);
        result = 31 * result + Objects.hashCode(networkLinkControlObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Snippet} and set it to linkSnippet.
     * 
     * This method is a short version for:
     * {@code
     * Snippet snippet = new Snippet();
     * this.setLinkSnippet(snippet); }
     * 
     * 
     */
    public Snippet createAndSetLinkSnippet() {
        Snippet newValue = new Snippet();
        this.setLinkSnippet(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Update} and set it to update.
     * 
     * This method is a short version for:
     * {@code
     * Update update = new Update();
     * this.setUpdate(update); }
     * 
     * 
     * @param createOrDeleteOrChange
     *     required parameter
     * @param targetHref
     *     required parameter
     */
    public Update createAndSetUpdate(final String targetHref, final List<Object> createOrDeleteOrChange) {
        Update newValue = new Update(targetHref, createOrDeleteOrChange);
        this.setUpdate(newValue);
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
     *
     * 
     * @param networkLinkControlSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setNetworkLinkControlSimpleExtension(final List<Object> networkLinkControlSimpleExtension) {
        this.networkLinkControlSimpleExtension = networkLinkControlSimpleExtension;
    }

    /**
     * add a value to the networkLinkControlSimpleExtension property collection
     * 
     * @param networkLinkControlSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public NetworkLinkControl addToNetworkLinkControlSimpleExtension(final Object networkLinkControlSimpleExtension) {
        this.getNetworkLinkControlSimpleExtension().add(networkLinkControlSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param networkLinkControlObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setNetworkLinkControlObjectExtension(final List<AbstractObject> networkLinkControlObjectExtension) {
        this.networkLinkControlObjectExtension = networkLinkControlObjectExtension;
    }

    /**
     * add a value to the networkLinkControlObjectExtension property collection
     * 
     * @param networkLinkControlObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public NetworkLinkControl addToNetworkLinkControlObjectExtension(final AbstractObject networkLinkControlObjectExtension) {
        this.getNetworkLinkControlObjectExtension().add(networkLinkControlObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param minRefreshPeriod
     *     required parameter
     */
    public NetworkLinkControl withMinRefreshPeriod(final double minRefreshPeriod) {
        this.setMinRefreshPeriod(minRefreshPeriod);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param maxSessionLength
     *     required parameter
     */
    public NetworkLinkControl withMaxSessionLength(final double maxSessionLength) {
        this.setMaxSessionLength(maxSessionLength);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param cookie
     *     required parameter
     */
    public NetworkLinkControl withCookie(final String cookie) {
        this.setCookie(cookie);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param message
     *     required parameter
     */
    public NetworkLinkControl withMessage(final String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param linkName
     *     required parameter
     */
    public NetworkLinkControl withLinkName(final String linkName) {
        this.setLinkName(linkName);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param linkDescription
     *     required parameter
     */
    public NetworkLinkControl withLinkDescription(final String linkDescription) {
        this.setLinkDescription(linkDescription);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param linkSnippet
     *     required parameter
     */
    public NetworkLinkControl withLinkSnippet(final Snippet linkSnippet) {
        this.setLinkSnippet(linkSnippet);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param expires
     *     required parameter
     */
    public NetworkLinkControl withExpires(final String expires) {
        this.setExpires(expires);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param update
     *     required parameter
     */
    public NetworkLinkControl withUpdate(final Update update) {
        this.setUpdate(update);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractView
     *     required parameter
     */
    public NetworkLinkControl withAbstractView(final AbstractView abstractView) {
        this.setAbstractView(abstractView);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param networkLinkControlSimpleExtension
     *     required parameter
     */
    public NetworkLinkControl withNetworkLinkControlSimpleExtension(final List<Object> networkLinkControlSimpleExtension) {
        this.setNetworkLinkControlSimpleExtension(networkLinkControlSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param networkLinkControlObjectExtension
     *     required parameter
     */
    public NetworkLinkControl withNetworkLinkControlObjectExtension(final List<AbstractObject> networkLinkControlObjectExtension) {
        this.setNetworkLinkControlObjectExtension(networkLinkControlObjectExtension);
        return this;
    }

    @Override
    public NetworkLinkControl clone() {
        NetworkLinkControl copy;
        try {
            copy = ((NetworkLinkControl) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.linkSnippet = ((linkSnippet == null)?null:((Snippet) linkSnippet.clone()));
        copy.update = ((update == null)?null:((Update) update.clone()));
        copy.abstractView = ((abstractView == null)?null:((AbstractView ) abstractView.clone()));
        copy.networkLinkControlSimpleExtension = new ArrayList<Object>((getNetworkLinkControlSimpleExtension().size()));
        for (Object iter: networkLinkControlSimpleExtension) {
            copy.networkLinkControlSimpleExtension.add(iter);
        }
        copy.networkLinkControlObjectExtension = new ArrayList<AbstractObject>((getNetworkLinkControlObjectExtension().size()));
        for (AbstractObject iter: networkLinkControlObjectExtension) {
            copy.networkLinkControlObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
