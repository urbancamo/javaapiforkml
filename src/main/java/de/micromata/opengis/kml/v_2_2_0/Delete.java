
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.gx.Tour;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * {@code <Delete>}
 * <p>
 * Child elements for {@code <Delete>}, which are the only elements that can be deleted, are 
 * Document, Folder, GroundOverlay, Placemark, and ScreenOverlay. 
 * </p>
 * <p>
 * Deletes features from a complex element that has already been loaded via a NetworkLink. 
 * The targetHref element in Update specifies the .kml or .kmz file containing 
 * the data to be deleted. Within that file, the element to be deleted must already 
 * have an explicit id defined for it. The {@code <Delete>} element references this id in the 
 * targetId attribute. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteType", propOrder = {
    "feature"
})
@XmlRootElement(name = "Delete", namespace = "http://www.opengis.net/kml/2.2")
public class Delete implements Cloneable
{

    /**
     * {@code <Feature>}
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
     *
     * 
     * Extended By: 
     *
     *
     *
     *
     *
     * 
     * 
     * 
     */
    @XmlElementRef(name = "AbstractFeatureGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<Feature> feature;

    public Delete() {
        super();
    }

    /**
     *
     * 
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<Feature>();
        }
        return this.feature;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((feature == null)? 0 :feature.hashCode()));
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
        if ((obj instanceof Delete) == false) {
            return false;
        }
        Delete other = ((Delete) obj);
        if (feature == null) {
            if (other.feature!= null) {
                return false;
            }
        } else {
            if (feature.equals(other.feature) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates a new instance of {@link Tour} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Tour tour = new Tour();
     * this.getFeature().add(tour); }
     * 
     * 
     */
    public Tour createAndAddTour() {
        Tour newValue = new Tour();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ScreenOverlay} and adds it to feature.
     * This method is a short version for:
     * {@code
     * ScreenOverlay screenOverlay = new ScreenOverlay();
     * this.getFeature().add(screenOverlay); }
     * 
     * 
     */
    public ScreenOverlay createAndAddScreenOverlay() {
        ScreenOverlay newValue = new ScreenOverlay();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PhotoOverlay} and adds it to feature.
     * This method is a short version for:
     * {@code
     * PhotoOverlay photoOverlay = new PhotoOverlay();
     * this.getFeature().add(photoOverlay); }
     * 
     * 
     */
    public PhotoOverlay createAndAddPhotoOverlay() {
        PhotoOverlay newValue = new PhotoOverlay();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link GroundOverlay} and adds it to feature.
     * This method is a short version for:
     * {@code
     * GroundOverlay groundOverlay = new GroundOverlay();
     * this.getFeature().add(groundOverlay); }
     * 
     * 
     */
    public GroundOverlay createAndAddGroundOverlay() {
        GroundOverlay newValue = new GroundOverlay();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link NetworkLink} and adds it to feature.
     * This method is a short version for:
     * {@code
     * NetworkLink networkLink = new NetworkLink();
     * this.getFeature().add(networkLink); }
     * 
     * 
     */
    public NetworkLink createAndAddNetworkLink() {
        NetworkLink newValue = new NetworkLink();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Folder} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Folder folder = new Folder();
     * this.getFeature().add(folder); }
     * 
     * 
     */
    public Folder createAndAddFolder() {
        Folder newValue = new Folder();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Document} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Document document = new Document();
     * this.getFeature().add(document); }
     * 
     * 
     */
    public Document createAndAddDocument() {
        Document newValue = new Document();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Placemark} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Placemark placemark = new Placemark();
     * this.getFeature().add(placemark); }
     * 
     * 
     */
    public Placemark createAndAddPlacemark() {
        Placemark newValue = new Placemark();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param feature
     *     Objects of the following type are allowed in the list: {@code <}{@link Container}{@code >}{@code <}{@link GroundOverlay}{@code >}{@code <}{@link NetworkLink}{@code >}{@code <}{@link Folder}{@code >}{@code <}{@link PhotoOverlay}{@code >}{@code <}{@link Document}{@code >}{@code <}{@link Tour}{@code >}{@code <}{@link ScreenOverlay}{@code >}{@code <}{@link Feature}{@code >}{@code <}{@link Placemark}{@code >}{@code <}{@link Overlay}{@code >}
     */
    public void setFeature(final List<Feature> feature) {
        this.feature = feature;
    }

    /**
     * add a value to the feature property collection
     * 
     * @param feature
     *     Objects of the following type are allowed in the list: {@code <}{@link Container}{@code >}{@code <}{@link GroundOverlay}{@code >}{@code <}{@link NetworkLink}{@code >}{@code <}{@link Folder}{@code >}{@code <}{@link PhotoOverlay}{@code >}{@code <}{@link Document}{@code >}{@code <}{@link Tour}{@code >}{@code <}{@link ScreenOverlay}{@code >}{@code <}{@link Feature}{@code >}{@code <}{@link Placemark}{@code >}{@code <}{@link Overlay}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Delete addToFeature(final Feature feature) {
        this.getFeature().add(feature);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param feature
     *     required parameter
     */
    public Delete withFeature(final List<Feature> feature) {
        this.setFeature(feature);
        return this;
    }

    @Override
    public Delete clone() {
        Delete copy;
        try {
            copy = ((Delete) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.feature = new ArrayList<Feature>((getFeature().size()));
        for (Feature iter: feature) {
            copy.feature.add(iter.clone());
        }
        return copy;
    }

}
