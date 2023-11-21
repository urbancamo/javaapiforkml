
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.gx.*;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * {@code <Change>}
 * <p>
 * Children of this element are the element(s) to be modified, which are identified 
 * by the targetId attribute. 
 * </p>
 * <p>
 * Modifies the values in an element that has already been loaded with a NetworkLink. 
 * Within the Change element, the child to be modified must include a targetId attribute 
 * that references the original element's id. 
 * </p>
 * <p>
 * This update can be considered a "sparse update": in the modified element, only the 
 * values listed in {@code <Change>} are replaced; all other values remained untouched. When 
 * {@code <Change>} is applied to a set of coordinates, the new coordinates replace the current 
 * coordinates. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeType", propOrder = {
    "abstractObject"
})
@XmlRootElement(name = "Change", namespace = "http://www.opengis.net/kml/2.2")
public class Change implements Cloneable
{

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
    @XmlElementRef(name = "AbstractObjectGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<AbstractObject> abstractObject;

    public Change() {
        super();
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getAbstractObject() {
        if (abstractObject == null) {
            abstractObject = new ArrayList<AbstractObject>();
        }
        return this.abstractObject;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((abstractObject == null)? 0 :abstractObject.hashCode()));
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
        if ((obj instanceof Change) == false) {
            return false;
        }
        Change other = ((Change) obj);
        if (abstractObject == null) {
            if (other.abstractObject!= null) {
                return false;
            }
        } else {
            if (abstractObject.equals(other.abstractObject) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * 
     * @param abstractObject
     *     Objects of the following type are allowed in the list: {@code <}{@link LatLonAltBox}{@code >}{@code <}{@link Alias}{@code >}{@code <}{@link Camera}{@code >}{@code <}{@link Placemark}{@code >}{@code <}{@link Orientation}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Folder}{@code >}{@code <}{@link PhotoOverlay}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeSpan}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeStamp}{@code >}{@code <}{@link ResourceMap}{@code >}{@code <}{@link ScreenOverlay}{@code >}{@code <}{@link Scale}{@code >}{@code <}{@link FlyTo}{@code >}{@code <}{@link LabelStyle}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link ViewVolume}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TourPrimitive}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Data}{@code >}{@code <}{@link PolyStyle}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link ItemIcon}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Wait}{@code >}{@code <}{@link MultiTrack}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TourControl}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Link}{@code >}{@code <}{@link Geometry}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link NetworkLink}{@code >}{@code <}{@link Model}{@code >}{@code <}{@link ColorStyle}{@code >}{@code <}{@link ViewerOptions}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link SubStyle}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link MultiGeometry}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link LinearRing}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Document}{@code >}{@code <}{@link TimeStamp}{@code >}{@code <}{@link ListStyle}{@code >}{@code <}{@link Location}{@code >}{@code <}{@link Feature}{@code >}{@code <}{@link StyleSelector}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Link}{@code >}{@code <}{@link Style}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeSpan}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link IconStyle}{@code >}{@code <}{@link StyleMap}{@code >}{@code <}{@link Overlay}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link GroundOverlay}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link SoundCue}{@code >}{@code <}{@link Polygon}{@code >}{@code <}{@link Track}{@code >}{@code <}{@link AnimatedUpdate}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Playlist}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Link}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link ImagePyramid}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Point}{@code >}{@code <}{@link LatLonBox}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link LineString}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimePrimitive}{@code >}{@code <}{@link LineStyle}{@code >}{@code <}{@link Container}{@code >}{@code <}{@link Lod}{@code >}{@code <}{@link Tour}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link LatLonQuad}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Pair}{@code >}{@code <}{@link AbstractView}{@code >}{@code <}{@link LookAt}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link BalloonStyle}{@code >}{@code <}{@link Region}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link SchemaData}{@code >}
     */
    public void setAbstractObject(final List<AbstractObject> abstractObject) {
        this.abstractObject = abstractObject;
    }

    /**
     * add a value to the abstractObject property collection
     * 
     * @param abstractObject
     *     Objects of the following type are allowed in the list: {@code <}{@link LatLonAltBox}{@code >}{@code <}{@link Alias}{@code >}{@code <}{@link Camera}{@code >}{@code <}{@link Placemark}{@code >}{@code <}{@link Orientation}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Folder}{@code >}{@code <}{@link PhotoOverlay}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeSpan}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeStamp}{@code >}{@code <}{@link ResourceMap}{@code >}{@code <}{@link ScreenOverlay}{@code >}{@code <}{@link Scale}{@code >}{@code <}{@link FlyTo}{@code >}{@code <}{@link LabelStyle}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link ViewVolume}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TourPrimitive}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Data}{@code >}{@code <}{@link PolyStyle}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link ItemIcon}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Wait}{@code >}{@code <}{@link MultiTrack}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TourControl}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Link}{@code >}{@code <}{@link Geometry}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link NetworkLink}{@code >}{@code <}{@link Model}{@code >}{@code <}{@link ColorStyle}{@code >}{@code <}{@link ViewerOptions}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link SubStyle}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link MultiGeometry}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link LinearRing}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Document}{@code >}{@code <}{@link TimeStamp}{@code >}{@code <}{@link ListStyle}{@code >}{@code <}{@link Location}{@code >}{@code <}{@link Feature}{@code >}{@code <}{@link StyleSelector}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Link}{@code >}{@code <}{@link Style}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimeSpan}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link IconStyle}{@code >}{@code <}{@link StyleMap}{@code >}{@code <}{@link Overlay}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link GroundOverlay}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link SoundCue}{@code >}{@code <}{@link Polygon}{@code >}{@code <}{@link Track}{@code >}{@code <}{@link AnimatedUpdate}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Playlist}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Link}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link ImagePyramid}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Point}{@code >}{@code <}{@link LatLonBox}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link LineString}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link TimePrimitive}{@code >}{@code <}{@link LineStyle}{@code >}{@code <}{@link Container}{@code >}{@code <}{@link Lod}{@code >}{@code <}{@link Tour}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link LatLonQuad}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link Pair}{@code >}{@code <}{@link AbstractView}{@code >}{@code <}{@link LookAt}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link BalloonStyle}{@code >}{@code <}{@link Region}{@code >}{@code <}{@link AbstractObject}{@code >}{@code <}{@link SchemaData}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Change addToAbstractObject(final AbstractObject abstractObject) {
        this.getAbstractObject().add(abstractObject);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param abstractObject
     *     required parameter
     * @return
     *     Change
     */
    public Change withAbstractObject(final List<AbstractObject> abstractObject) {
        this.setAbstractObject(abstractObject);
        return this;
    }

    @Override
    public Change clone() {
        Change copy;
        try {
            copy = ((Change) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.abstractObject = new ArrayList<AbstractObject>((getAbstractObject().size()));
        for (AbstractObject iter: abstractObject) {
            copy.abstractObject.add(iter.clone());
        }
        return copy;
    }

}
