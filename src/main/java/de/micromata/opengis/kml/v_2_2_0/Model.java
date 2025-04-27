
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Model>}
 * <p>
 * A 3D object described in a COLLADA file (referenced in the {@code <Link>} tag). COLLADA 
 * files have a .dae file extension. Models are created in their own coordinate space 
 * and then located, positioned, and scaled in Google Earth. See the "Topics in KML" 
 * page on Regions for more detail. 
 * </p>
 * <p>
 * Google Earth supports only triangles and lines as primitive types. The maximum number 
 * of triangles allowed is 21845. Google Earth does not support animation or skinning. 
 * Google Earth does not support external geometry references. 
 * </p>
 * <p>
 * Google Earth supports the COLLADA common profile, with the following exceptions: 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Model id="ID"&gt;</strong>
 *   &lt;!-- specific to Model --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
 *       &lt;!-- kml:altitudeModeEnum: clampToGround,relativeToGround,<em>or</em> absolute --&gt;
 *       &lt;!-- or, substitute gx:altitudeMode: clampToSeaFloor, relativeToSeaFloor --&gt;
 *   &lt;Location&gt; 
 *     &lt;longitude&gt;&lt;/longitude&gt; &lt;!-- kml:angle180 --&gt;
 *     &lt;latitude&gt;&lt;/latitude&gt;   &lt;!-- kml:angle90 --&gt;  
 *     &lt;altitude&gt;0&lt;/altitude&gt;  &lt;!-- double --&gt; 
 *   &lt;/Location&gt; 
 *   &lt;Orientation&gt;               
 *     &lt;heading&gt;0&lt;/heading&gt;    &lt;!-- kml:angle360 --&gt;
 *     &lt;tilt&gt;0&lt;/tilt&gt;          &lt;!-- kml:angle360 --&gt;
 *     &lt;roll&gt;0&lt;/roll&gt;          &lt;!-- kml:angle360 --&gt;
 *   &lt;/Orientation&gt; 
 *   &lt;Scale&gt; 
 *     &lt;x&gt;1&lt;/x&gt;                &lt;!-- double --&gt;
 *     &lt;y&gt;1&lt;/y&gt;                &lt;!-- double --&gt;
 *     &lt;z&gt;1&lt;/z&gt;                &lt;!-- double --&gt;
 *   &lt;/Scale&gt; 
 *   &lt;Link&gt;...&lt;/Link&gt;
 *   <span>&lt;ResourceMap&gt;
 *     &lt;Alias&gt;
 *       &lt;targetHref&gt;...&lt;/targetHref&gt;   &lt;!-- anyURI --&gt;
 *       &lt;sourceHref&gt;...&lt;/sourceHref&gt;   &lt;!-- anyURI --&gt;
 *     &lt;/Alias&gt;
 *   &lt;/ResourceMap&gt;</span>
 * <strong>&lt;/Model&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Contained By: 
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelType", propOrder = {
    "altitudeMode",
    "location",
    "orientation",
    "scale",
    "link",
    "resourceMap",
    "modelSimpleExtension",
    "modelObjectExtension"
})
@XmlRootElement(name = "Model", namespace = "http://www.opengis.net/kml/2.2")
public class Model
    extends Geometry
    implements Cloneable
{

    /**
     * AltitudeMode
     * <p>
     * clampToGround, relativeToGround, absolute 
     * </p>
     * 
     * See Also: 
     * See LookAt and {@code <Region>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "clampToGround")
    protected AltitudeMode altitudeMode;
    /**
     * {@code <location>}
     * <p>
     * Specifies the exact coordinates of the Model's origin in latitude, longitude, and 
     * altitude. Latitude and longitude measurements are standard lat-lon projection with 
     * WGS84 datum. Altitude is distance above the earth's surface, in meters, and is interpreted 
     * according to altitudeMode or gx:altitudeMode. {@code <Location> <longitude>39.55375305703105</longitude>
     * <latitude>-118.9813220168456</latitude> <altitude>1223</altitude> </Location> }
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "Location")
    protected Location location;
    /**
     * {@code <orientation>}
     * <p>
     * Describes rotation of a 3D model's coordinate system to position the object in Google 
     * Earth. See diagram below. {@code <Orientation> <heading>45.0</heading> <tilt>10.0</tilt>
     * <roll>0.0</roll> </Orientation> }
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "Orientation")
    protected Orientation orientation;
    /**
     * {@code <scale>}
     * <p>
     * Note: The {@code <geomScale>} tag has been deprecated. Use {@code <scale>} instead. 
     * </p>
     * <p>
     * Resizes the icon. 
     * </p>
     * <p>
     * Scales a model along the x, y, and z axes in the model's coordinate space. {@code <scale>
     * <x>2.5</x> <y>2.5</y> <z>3.5</z> </Scale> }
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(name = "Scale")
    protected Scale scale;
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
    @XmlElement(name = "Link")
    protected Link link;
    /**
     * {@code <resourcemap>}
     * 
     * 
     */
    @XmlElement(name = "ResourceMap")
    protected ResourceMap resourceMap;
    @XmlElement(name = "ModelSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> modelSimpleExtension;
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
    @XmlElement(name = "ModelObjectExtensionGroup")
    protected List<AbstractObject> modelObjectExtension;

    public Model() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@code <}{@link Object}{@code >}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.AltitudeMode}{@code >}
     *     
     *     
     */
    public AltitudeMode getAltitudeMode() {
        return altitudeMode;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link Object}{@code >}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.AltitudeMode}{@code >}
     *     
     *     
     */
    public void setAltitudeMode(AltitudeMode value) {
        this.altitudeMode = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Location}
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Location}
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Orientation}
     *     
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Orientation}
     *     
     */
    public void setOrientation(Orientation value) {
        this.orientation = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Scale}
     *     
     */
    public Scale getScale() {
        return scale;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Scale}
     *     
     */
    public void setScale(Scale value) {
        this.scale = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Link}
     *     
     */
    public Link getLink() {
        return link;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Link}
     *     
     */
    public void setLink(Link value) {
        this.link = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link ResourceMap}
     *     
     */
    public ResourceMap getResourceMap() {
        return resourceMap;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceMap}
     *     
     */
    public void setResourceMap(ResourceMap value) {
        this.resourceMap = value;
    }

    /**
     *
     * 
     */
    public List<Object> getModelSimpleExtension() {
        if (modelSimpleExtension == null) {
            modelSimpleExtension = new ArrayList<Object>();
        }
        return this.modelSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getModelObjectExtension() {
        if (modelObjectExtension == null) {
            modelObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.modelObjectExtension;
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

        Model model = (Model) object;
        return altitudeMode == model.altitudeMode
                && Objects.equals(location, model.location)
                && Objects.equals(orientation, model.orientation)
                && Objects.equals(scale, model.scale)
                && Objects.equals(link, model.link)
                && Objects.equals(resourceMap, model.resourceMap)
                && Objects.equals(modelSimpleExtension, model.modelSimpleExtension)
                && Objects.equals(modelObjectExtension, model.modelObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(altitudeMode);
        result = 31 * result + Objects.hashCode(location);
        result = 31 * result + Objects.hashCode(orientation);
        result = 31 * result + Objects.hashCode(scale);
        result = 31 * result + Objects.hashCode(link);
        result = 31 * result + Objects.hashCode(resourceMap);
        result = 31 * result + Objects.hashCode(modelSimpleExtension);
        result = 31 * result + Objects.hashCode(modelObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Location} and set it to location.
     * 
     * This method is a short version for:
     * {@code
     * Location location = new Location();
     * this.setLocation(location); }
     * 
     * 
     */
    public Location createAndSetLocation() {
        Location newValue = new Location();
        this.setLocation(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Orientation} and set it to orientation.
     * 
     * This method is a short version for:
     * {@code
     * Orientation orientation = new Orientation();
     * this.setOrientation(orientation); }
     * 
     * 
     */
    public Orientation createAndSetOrientation() {
        Orientation newValue = new Orientation();
        this.setOrientation(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Scale} and set it to scale.
     * 
     * This method is a short version for:
     * {@code
     * Scale scale = new Scale();
     * this.setScale(scale); }
     * 
     * 
     */
    public Scale createAndSetScale() {
        Scale newValue = new Scale();
        this.setScale(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Link} and set it to link.
     * 
     * This method is a short version for:
     * {@code
     * Link link = new Link();
     * this.setLink(link); }
     * 
     * 
     */
    public Link createAndSetLink() {
        Link newValue = new Link();
        this.setLink(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ResourceMap} and set it to resourceMap.
     * 
     * This method is a short version for:
     * {@code
     * ResourceMap resourceMap = new ResourceMap();
     * this.setResourceMap(resourceMap); }
     * 
     * 
     */
    public ResourceMap createAndSetResourceMap() {
        ResourceMap newValue = new ResourceMap();
        this.setResourceMap(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param modelSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setModelSimpleExtension(final List<Object> modelSimpleExtension) {
        this.modelSimpleExtension = modelSimpleExtension;
    }

    /**
     * add a value to the modelSimpleExtension property collection
     * 
     * @param modelSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Model addToModelSimpleExtension(final Object modelSimpleExtension) {
        this.getModelSimpleExtension().add(modelSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param modelObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setModelObjectExtension(final List<AbstractObject> modelObjectExtension) {
        this.modelObjectExtension = modelObjectExtension;
    }

    /**
     * add a value to the modelObjectExtension property collection
     * 
     * @param modelObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Model addToModelObjectExtension(final AbstractObject modelObjectExtension) {
        this.getModelObjectExtension().add(modelObjectExtension);
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
    public Model addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.setGeometrySimpleExtension(geometrySimpleExtension);
    }

    @Obvious
    @Override
    public Model addToGeometrySimpleExtension(final Object geometrySimpleExtension) {
        super.getGeometrySimpleExtension().add(geometrySimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.setGeometryObjectExtension(geometryObjectExtension);
    }

    @Obvious
    @Override
    public Model addToGeometryObjectExtension(final AbstractObject geometryObjectExtension) {
        super.getGeometryObjectExtension().add(geometryObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param altitudeMode
     *     required parameter
     */
    public Model withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param location
     *     required parameter
     */
    public Model withLocation(final Location location) {
        this.setLocation(location);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param orientation
     *     required parameter
     */
    public Model withOrientation(final Orientation orientation) {
        this.setOrientation(orientation);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param scale
     *     required parameter
     */
    public Model withScale(final Scale scale) {
        this.setScale(scale);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param link
     *     required parameter
     */
    public Model withLink(final Link link) {
        this.setLink(link);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param resourceMap
     *     required parameter
     */
    public Model withResourceMap(final ResourceMap resourceMap) {
        this.setResourceMap(resourceMap);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param modelSimpleExtension
     *     required parameter
     */
    public Model withModelSimpleExtension(final List<Object> modelSimpleExtension) {
        this.setModelSimpleExtension(modelSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param modelObjectExtension
     *     required parameter
     */
    public Model withModelObjectExtension(final List<AbstractObject> modelObjectExtension) {
        this.setModelObjectExtension(modelObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Model withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Model withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Model withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Model withGeometrySimpleExtension(final List<Object> geometrySimpleExtension) {
        super.withGeometrySimpleExtension(geometrySimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Model withGeometryObjectExtension(final List<AbstractObject> geometryObjectExtension) {
        super.withGeometryObjectExtension(geometryObjectExtension);
        return this;
    }

    @Override
    public Model clone() {
        Model copy;
        copy = ((Model) super.clone());
        copy.location = ((location == null)?null:((Location) location.clone()));
        copy.orientation = ((orientation == null)?null:((Orientation) orientation.clone()));
        copy.scale = ((scale == null)?null:((Scale) scale.clone()));
        copy.link = ((link == null)?null:((Link) link.clone()));
        copy.resourceMap = ((resourceMap == null)?null:((ResourceMap) resourceMap.clone()));
        copy.modelSimpleExtension = new ArrayList<Object>((getModelSimpleExtension().size()));
        for (Object iter: modelSimpleExtension) {
            copy.modelSimpleExtension.add(iter);
        }
        copy.modelObjectExtension = new ArrayList<AbstractObject>((getModelObjectExtension().size()));
        for (AbstractObject iter: modelObjectExtension) {
            copy.modelObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
