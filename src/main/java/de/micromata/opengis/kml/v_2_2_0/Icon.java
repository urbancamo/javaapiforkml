
package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <icon> see also <icon>.
 * <p>
 * Defines an image associated with an Icon style or overlay. <Icon> has the same child 
 * elements as <Link>. The required <href> child element defines the location of the 
 * image to be used as the overlay or as the icon for the placemark. This location 
 * can either be on a local file system or a remote web server. 
 * </p>
 * <p>
 * <Icon> <href>Sunset.jpg</href> </Icon> 
 * </p>
 * <p>
 * A custom Icon. In <IconStyle>, the only child element of <Icon> is <href>: <href>: 
 * An HTTP address or a local file specification used to load an icon. 
 * </p>
 * <p>
 * Defines the image associated with the Overlay. The <href> element defines the location 
 * of the image to be used as the Overlay. This location can be either on a local file 
 * system or on a web server. If this element is omitted or contains no <href>, a rectangle 
 * is drawn using the color and size defined by the ground or screen overlay. <Icon> 
 * <href>icon.jpg</href> </Icon> 
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
 * @see: <GroundOverlay>
 * @see: <ScreenOverlay>
 * @see: <IconStyle>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Icon")
@XmlRootElement(name = "Icon", namespace = "http://www.opengis.net/kml/2.2")
public class Icon
    extends Link
{


    public Icon() {
        super();
    }

}
