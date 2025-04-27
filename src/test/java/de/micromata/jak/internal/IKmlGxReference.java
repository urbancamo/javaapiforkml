package de.micromata.jak.internal;

import org.junit.jupiter.api.Test;

public interface IKmlGxReference {

	/**
	 * gx:altitudeMode
	 * 
	 * <pre>
	 * 
	 * &lt;gx:altitudeMode&gt;clampToGround&lt;/gx:altitudeMode&gt;    
	 * &lt;!-- gx:altitudeModeEnum: relativeToSeaFloor, clampToSeaFloor, relativeToGround, clampToGround, absolute --&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void altitudeMode();

	/**
	 * gx:altitudeMode
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;
	 *  xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot;&gt;   &lt;!-- required when using gx-prefixed elements --&gt;
	 * 
	 * &lt;Placemark&gt;
	 *   &lt;name&gt;gx:altitudeMode Example&lt;/name&gt;
	 *   &lt;LookAt&gt;
	 *     &lt;longitude&gt;146.806&lt;/longitude&gt;
	 *     &lt;latitude&gt;12.219&lt;/latitude&gt;
	 *     &lt;heading&gt;-60&lt;/heading&gt;
	 *     &lt;tilt&gt;70&lt;/tilt&gt;
	 *     &lt;range&gt;6300&lt;/range&gt;
	 *     &lt;gx:altitudeMode&gt;relativeToSeaFloor&lt;/gx:altitudeMode&gt;
	 *   &lt;/LookAt&gt;
	 *   &lt;LineString&gt;
	 *     &lt;extrude&gt;1&lt;/extrude&gt;
	 *     &lt;gx:altitudeMode&gt;relativeToSeaFloor&lt;/gx:altitudeMode&gt;
	 *     &lt;coordinates&gt;
	 *       146.825,12.233,400
	 *       146.820,12.222,400
	 *       146.812,12.212,400
	 *       146.796,12.209,400
	 *       146.788,12.205,400
	 *     &lt;/coordinates&gt;
	 *   &lt;/LineString&gt;
	 * &lt;/Placemark&gt;
	 * 
	 * &lt;/kml&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void altitudeModeReference();

	/**
	 * gx:AnimatedUpdate
	 * 
	 * <pre>
	 * 
	 * &lt;gx:AnimatedUpdate&gt;
	 *   &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;    &lt;!-- double, specifies time in seconds --&gt;
	 *   &lt;Update&gt;
	 *     &lt;targetHref&gt;...&lt;/targetHref&gt;    &lt;!-- required; can contain a URL or be left blank --&gt;
	 *                                                 &lt;!-- (to target elements within the same file --&gt;
	 *     &lt;Change&gt;...&lt;/Change&gt;
	 *     &lt;Create&gt;...&lt;/Create&gt;
	 *     &lt;Delete&gt;...&lt;/Delete&gt;
	 *   &lt;/Update&gt;
	 * &lt;/gx:AnimatedUpdate&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void animatedUpdate();

	/**
	 * gx:AnimatedUpdate Example
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;
	 *  xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot;&gt;
	 * 
	 * &lt;Document&gt;
	 *   &lt;name&gt;gx:AnimatedUpdate example&lt;/name&gt;
	 * 
	 *   &lt;Style id=&quot;pushpin&quot;&gt;
	 *     &lt;IconStyle id=&quot;mystyle&quot;&gt;
	 *       &lt;Icon&gt;
	 *         &lt;href&gt;http://maps.google.com/mapfiles/kml/pushpin/ylw-pushpin.png&lt;/href&gt;
	 *         &lt;scale&gt;1.0&lt;/scale&gt;
	 *       &lt;/Icon&gt;
	 *     &lt;/IconStyle&gt;
	 *   &lt;/Style&gt;
	 * 
	 *   &lt;Placemark id=&quot;mountainpin1&quot;&gt;
	 *     &lt;name&gt;Pin on a mountaintop&lt;/name&gt;
	 *     &lt;styleUrl&gt;#pushpin&lt;/styleUrl&gt;
	 *     &lt;Point&gt;
	 *       &lt;coordinates&gt;170.1435558771009,-43.60505741890396,0&lt;/coordinates&gt;
	 *     &lt;/Point&gt;
	 *   &lt;/Placemark&gt;
	 * 
	 *   &lt;gx:Tour&gt;
	 *     &lt;name&gt;Play me!&lt;/name&gt;
	 * 
	 *     &lt;gx:Playlist&gt;
	 * 
	 *       &lt;gx:FlyTo&gt;
	 *         &lt;gx:flyToMode&gt;bounce&lt;/gx:flyToMode&gt;
	 *         &lt;gx:duration&gt;3&lt;/gx:duration&gt;
	 *         &lt;Camera&gt;
	 *           &lt;longitude&gt;170.157&lt;/longitude&gt;
	 *           &lt;latitude&gt;-43.671&lt;/latitude&gt;
	 *           &lt;altitude&gt;9700&lt;/altitude&gt;
	 *           &lt;heading&gt;-6.333&lt;/heading&gt;
	 *           &lt;tilt&gt;33.5&lt;/tilt&gt;
	 *         &lt;/Camera&gt;
	 *       &lt;/gx:FlyTo&gt;
	 * 
	 *       &lt;gx:AnimatedUpdate&gt;
	 *         &lt;gx:duration&gt;5&lt;/gx:duration&gt;
	 *         &lt;Update&gt;
	 *           &lt;targetHref&gt;&lt;/targetHref&gt;
	 *           &lt;Change&gt;
	 *             &lt;IconStyle targetId=&quot;mystyle&quot;&gt;
	 *               &lt;scale&gt;10.0&lt;/scale&gt;
	 *             &lt;/IconStyle&gt;
	 *           &lt;/Change&gt;
	 *         &lt;/Update&gt;
	 *       &lt;/gx:AnimatedUpdate&gt;
	 * 
	 *       &lt;gx:Wait&gt;
	 *         &lt;gx:duration&gt;5&lt;/gx:duration&gt;
	 *       &lt;/gx:Wait&gt;
	 * 
	 *     &lt;/gx:Playlist&gt;
	 *   &lt;/gx:Tour&gt;
	 * 
	 * &lt;/Document&gt;
	 * &lt;/kml&gt;
	 * </pre>
	 */
	@Test
	public abstract void animatedUpdateExample();

	/**
	 * gx:balloonVisibility
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;
	 *  xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot;&gt;
	 *   
	 *   &lt;Placemark&gt;
	 *     &lt;name&gt;Eiffel Tower&lt;/name&gt;
	 *     &lt;description&gt;
	 *         Located in Paris, France. 
	 *         
	 *         This description balloon opens 
	 *         when the Placemark is loaded.
	 *     &lt;/description&gt;
	 *     &lt;gx:balloonVisibility&gt;1&lt;/gx:balloonVisibility&gt;
	 *     &lt;Point&gt;
	 *       &lt;coordinates&gt;2.294785,48.858093,0&lt;/coordinates&gt;
	 *     &lt;/Point&gt;
	 *   &lt;/Placemark&gt;
	 * 
	 * &lt;/kml&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void balloonVisibilityExample();

	/**
	 * gx:balloonVisibility
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;
	 *  xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot;&gt;
	 *   
	 *   &lt;Document&gt;
	 *     &lt;name&gt;balloonVisibility Example&lt;/name&gt;
	 *     &lt;open&gt;1&lt;/open&gt;
	 *     
	 *     &lt;gx:Tour&gt;
	 *       &lt;name&gt;Play me&lt;/name&gt;
	 *       &lt;gx:Playlist&gt;
	 *         
	 *         &lt;gx:FlyTo&gt;
	 *           &lt;gx:duration&gt;8.0&lt;/gx:duration&gt;
	 *           &lt;gx:flyToMode&gt;bounce&lt;/gx:flyToMode&gt;
	 *           &lt;LookAt&gt;
	 *             &lt;longitude&gt;-119.748584&lt;/longitude&gt;
	 *             &lt;latitude&gt;33.736266&lt;/latitude&gt;
	 *             &lt;altitude&gt;0&lt;/altitude&gt;
	 *             &lt;heading&gt;-9.295926&lt;/heading&gt;
	 *             &lt;tilt&gt;84.0957450&lt;/tilt&gt;
	 *             &lt;range&gt;4469.850414&lt;/range&gt;
	 *             &lt;gx:altitudeMode&gt;relativeToSeaFloor&lt;/gx:altitudeMode&gt;
	 *           &lt;/LookAt&gt;
	 *         &lt;/gx:FlyTo&gt;
	 *         
	 *         &lt;gx:AnimatedUpdate&gt;
	 *           &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;
	 *           &lt;Update&gt;
	 *             &lt;targetHref/&gt;
	 *             &lt;Change&gt;
	 *               &lt;Placemark targetId=&quot;underwater1&quot;&gt;
	 *                 &lt;gx:balloonVisibility&gt;1&lt;/gx:balloonVisibility&gt;
	 *               &lt;/Placemark&gt;
	 *             &lt;/Change&gt;
	 *           &lt;/Update&gt;
	 *         &lt;/gx:AnimatedUpdate&gt;
	 *         
	 *         &lt;gx:Wait&gt;
	 *           &lt;gx:duration&gt;4.0&lt;/gx:duration&gt;
	 *         &lt;/gx:Wait&gt;
	 * 
	 *         &lt;gx:AnimatedUpdate&gt;
	 *           &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;
	 *           &lt;Update&gt;
	 *             &lt;targetHref/&gt;
	 *             &lt;Change&gt;
	 *               &lt;Placemark targetId=&quot;underwater1&quot;&gt;
	 *                 &lt;gx:balloonVisibility&gt;0&lt;/gx:balloonVisibility&gt;
	 *               &lt;/Placemark&gt;
	 *             &lt;/Change&gt;
	 *           &lt;/Update&gt;
	 *         &lt;/gx:AnimatedUpdate&gt;
	 *         
	 *         &lt;gx:FlyTo&gt;
	 *           &lt;gx:duration&gt;3&lt;/gx:duration&gt;
	 *           &lt;gx:flyToMode&gt;smooth&lt;/gx:flyToMode&gt;
	 *           &lt;LookAt&gt;
	 *             &lt;longitude&gt;-119.782630&lt;/longitude&gt;
	 *             &lt;latitude&gt;33.862855&lt;/latitude&gt;
	 *             &lt;altitude&gt;0&lt;/altitude&gt;
	 *             &lt;heading&gt;-9.314858&lt;/heading&gt;
	 *             &lt;tilt&gt;84.117317&lt;/tilt&gt;
	 *             &lt;range&gt;6792.665540&lt;/range&gt;
	 *             &lt;gx:altitudeMode&gt;relativeToSeaFloor&lt;/gx:altitudeMode&gt;
	 *           &lt;/LookAt&gt;
	 *         &lt;/gx:FlyTo&gt;
	 *         
	 *         &lt;gx:AnimatedUpdate&gt;
	 *           &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;
	 *           &lt;Update&gt;
	 *             &lt;targetHref/&gt;
	 *             &lt;Change&gt;
	 *               &lt;Placemark targetId=&quot;underwater2&quot;&gt;
	 *                 &lt;gx:balloonVisibility&gt;1&lt;/gx:balloonVisibility&gt;
	 *               &lt;/Placemark&gt;
	 *             &lt;/Change&gt;
	 *           &lt;/Update&gt;
	 *         &lt;/gx:AnimatedUpdate&gt;
	 *         
	 *         &lt;gx:Wait&gt;
	 *           &lt;gx:duration&gt;4.0&lt;/gx:duration&gt;
	 *         &lt;/gx:Wait&gt;
	 * 
	 *         &lt;gx:AnimatedUpdate&gt;
	 *           &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;
	 *           &lt;Update&gt;
	 *             &lt;targetHref/&gt;
	 *             &lt;Change&gt;
	 *               &lt;Placemark targetId=&quot;underwater2&quot;&gt;
	 *                 &lt;gx:balloonVisibility&gt;0&lt;/gx:balloonVisibility&gt;
	 *               &lt;/Placemark&gt;
	 *             &lt;/Change&gt;
	 *           &lt;/Update&gt;
	 *         &lt;/gx:AnimatedUpdate&gt;
	 *         
	 *         &lt;gx:FlyTo&gt;
	 *           &lt;gx:duration&gt;3&lt;/gx:duration&gt;
	 *           &lt;gx:flyToMode&gt;smooth&lt;/gx:flyToMode&gt;
	 *           &lt;LookAt&gt;
	 *             &lt;longitude&gt;-119.849578&lt;/longitude&gt;
	 *             &lt;latitude&gt;33.968515&lt;/latitude&gt;
	 *             &lt;altitude&gt;0&lt;/altitude&gt;
	 *             &lt;heading&gt;-173.948935&lt;/heading&gt;
	 *             &lt;tilt&gt;23.063392&lt;/tilt&gt;
	 *             &lt;range&gt;3733.666023&lt;/range&gt;
	 *             &lt;altitudeMode&gt;relativeToGround&lt;/altitudeMode&gt;
	 *           &lt;/LookAt&gt;
	 *         &lt;/gx:FlyTo&gt;
	 *         
	 *         &lt;gx:AnimatedUpdate&gt;
	 *           &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;
	 *           &lt;Update&gt;
	 *             &lt;targetHref/&gt;
	 *             &lt;Change&gt;
	 *               &lt;Placemark targetId=&quot;onland&quot;&gt;
	 *                 &lt;gx:balloonVisibility&gt;1&lt;/gx:balloonVisibility&gt;
	 *               &lt;/Placemark&gt;
	 *             &lt;/Change&gt;
	 *           &lt;/Update&gt;
	 *         &lt;/gx:AnimatedUpdate&gt;
	 *         
	 *         &lt;gx:Wait&gt;
	 *           &lt;gx:duration&gt;4.0&lt;/gx:duration&gt;
	 *         &lt;/gx:Wait&gt;
	 *         
	 *       &lt;/gx:Playlist&gt;
	 *     &lt;/gx:Tour&gt;
	 *     
	 *     &lt;Placemark id=&quot;underwater1&quot;&gt;
	 *       &lt;name&gt;Underwater off the California Coast&lt;/name&gt;
	 *       &lt;description&gt;
	 *         The tour begins near the Santa Cruz Canyon, 
	 *         off the coast of California, USA.
	 *       &lt;/description&gt;
	 *       &lt;Point&gt;
	 *         &lt;gx:altitudeMode&gt;clampToSeaFloor&lt;/gx:altitudeMode&gt;
	 *         &lt;coordinates&gt;-119.749531,33.715059,0&lt;/coordinates&gt;
	 *       &lt;/Point&gt;
	 *     &lt;/Placemark&gt;
	 *     
	 *     &lt;Placemark id=&quot;underwater2&quot;&gt;
	 *       &lt;name&gt;Still swimming...&lt;/name&gt;
	 *       &lt;description&gt;We're about to leave the ocean, and visit the coast...&lt;/description&gt;
	 *       &lt;Point&gt;
	 *         &lt;gx:altitudeMode&gt;clampToSeaFloor&lt;/gx:altitudeMode&gt;
	 *         &lt;coordinates&gt;-119.779550,33.829268,0&lt;/coordinates&gt;
	 *       &lt;/Point&gt;
	 *     &lt;/Placemark&gt;
	 *     
	 *     &lt;Placemark id=&quot;onland&quot;&gt;
	 *       &lt;name&gt;The end&lt;/name&gt;
	 *       &lt;description&gt;
	 *         &lt;![CDATA[The end of our simple tour. 
	 *         Use &lt;gx:balloonVisibility&gt;1&lt;/gx:balloonVisibility&gt; 
	 *         to show description balloons.]]&gt;
	 *       &lt;/description&gt;
	 *       &lt;Point&gt;
	 *         &lt;coordinates&gt;-119.849578,33.968515,0&lt;/coordinates&gt;
	 *       &lt;/Point&gt;
	 *     &lt;/Placemark&gt;
	 *     
	 *     
	 *   &lt;/Document&gt;
	 * &lt;/kml&gt;
	 * </pre>
	 */
	@Test
	public abstract void balloonVisibilityTourExample();

	/**
	 * gx:duration
	 * 
	 * <pre>
	 * 
	 * &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;            &lt;!-- double --&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void duration();

	/**
	 * gx:FlyTo
	 * 
	 * <pre>
	 * 
	 * &lt;gx:FlyTo&gt;
	 *   &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;         &lt;!-- double --&gt;
	 *   &lt;gx:flyToMode&gt;bounce&lt;/gx:duration&gt;      &lt;!-- smooth or bounce --&gt;
	 *   &lt;!-- AbstractView --&gt;                   &lt;!-- Camera or LookAt --&gt; 
	 *     ...
	 *   &lt;!-- /AbstractView --&gt;
	 * </gx:FlyTo>
	 */
	@Test
	public abstract void flyto();

	/**
	 * gx:FlyTo Example
	 * 
	 * <pre>
	 * 
	 * &lt;gx:FlyTo&gt;
	 *   &lt;gx:duration&gt;2.55&lt;/gx:duration&gt;
	 *   &lt;gx:flyToMode&gt;smooth&lt;/gx:flyToMode&gt;
	 *   &lt;Camera&gt;
	 *     &lt;longitude&gt;-113.084448&lt;/longitude&gt;
	 *     &lt;latitude&gt;36.567081&lt;/latitude&gt;
	 *     &lt;altitude&gt;41277.571403&lt;/altitude&gt;
	 *     &lt;heading&gt;116.150227&lt;/heading&gt;
	 *     &lt;altitudeMode&gt;absolute&lt;/altitudeMode&gt;
	 *   &lt;/Camera&gt;
	 * </gx:FlyTo>
	 */
	@Test
	public abstract void flytoExample();

	/**
	 * gx:duration AnimatedUpdate
	 * 
	 * <pre>
	 * 
	 * &lt;gx:AnimatedUpdate&gt;
	 *   &lt;gx:duration&gt;5.0&lt;/gx:duration&gt;
	 *   &lt;Update&gt;
	 * 
	 *     ....
	 * 
	 *   &lt;/Update&gt;
	 * &lt;/gx:AnimatedUpdate&gt;
	 * </pre>
	 */
	@Test
	public abstract void durationAnimatedUpdate();

	/**
	 * gx:LatLonQuad
	 * 
	 * <pre>
	 * 
	 * &lt;GroundOverlay id=&quot;ID&quot;&gt;
	 *   ...
	 *   &lt;Icon&gt;...&lt;/Icon&gt;
	 *   &lt;altitude&gt;0&lt;/altitude&gt;
	 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;                   &lt;!-- or absolute --&gt;
	 *          &lt;!-- can substitute &lt;gx:altitudeMode&gt;clampToSeaFloor&lt;/gx:altitudeMode&gt; --&gt;
	 * 
	 *   &lt;gx:LatLonQuad&gt;
	 *     &lt;coordinates&gt;...&lt;/coordinates&gt;              &lt;!-- four lon,lat tuples --&gt;
	 *   &lt;/gx:LatLonQuad&gt;
	 * &lt;/GroundOverlay&gt;
	 * </pre>
	 */
	@Test
	public abstract void latLonQuad();

	/**
	 * gx:LatLonQuad Example
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;
	 *  xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot;&gt;
	 * &lt;GroundOverlay&gt;
	 *   &lt;name&gt;gx:LatLonQuad Example&lt;/name&gt;
	 *   &lt;Icon&gt;
	 *     &lt;href&gt;http://developers.google.com/kml/documentation/images/rectangle.gif&lt;/href&gt;
	 *     &lt;viewBoundScale&gt;0.75&lt;/viewBoundScale&gt;
	 *   &lt;/Icon&gt;
	 *   &lt;gx:LatLonQuad&gt;
	 *     &lt;coordinates&gt;
	 *       81.601884,44.160723 83.529902,43.665148 82.947737,44.248831 81.509322,44.321015
	 *     &lt;/coordinates&gt;
	 *   &lt;/gx:LatLonQuad&gt;
	 * &lt;/GroundOverlay&gt;
	 * &lt;/kml&gt;
	 * </pre>
	 */
	@Test
	public abstract void latLonQuadExample();

	/**
	 * gx:TimeSpan and gx:TimeStamp Example
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;
	 *  xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot;&gt;
	 * 
	 *   &lt;Document&gt;
	 *     &lt;name&gt;Views with Time&lt;/name&gt;
	 *     &lt;open&gt;1&lt;/open&gt;
	 *     &lt;description&gt;
	 *       In Google Earth, enable historical imagery and sunlight,
	 *       then click on each placemark to fly to that point in time.
	 *     &lt;/description&gt;
	 * 
	 *     &lt;Placemark&gt;
	 *       &lt;name&gt;Sutro Baths in 1946&lt;/name&gt;
	 *       &lt;Camera&gt;
	 *         &lt;gx:TimeStamp&gt;
	 *           &lt;when&gt;1946-07-29T05:00:00-08:00&lt;/when&gt;
	 *         &lt;/gx:TimeStamp&gt;
	 *         &lt;longitude&gt;-122.518172&lt;/longitude&gt;
	 *         &lt;latitude&gt;37.778036&lt;/latitude&gt;
	 *         &lt;altitude&gt;221.0&lt;/altitude&gt;
	 *         &lt;heading&gt;70.0&lt;/heading&gt;
	 *         &lt;tilt&gt;75.0&lt;/tilt&gt;
	 *       &lt;/Camera&gt;
	 *     &lt;/Placemark&gt;
	 * 
	 *     &lt;Placemark&gt;
	 *       &lt;name&gt;Palace of Fine Arts in 2002&lt;/name&gt;
	 *       &lt;Camera&gt;
	 *         &lt;gx:TimeStamp&gt;
	 *           &lt;when&gt;2002-07-09T19:00:00-08:00&lt;/when&gt;
	 *         &lt;/gx:TimeStamp&gt;
	 *         &lt;longitude&gt;-122.444633&lt;/longitude&gt;
	 *         &lt;latitude&gt;37.801899&lt;/latitude&gt;
	 *         &lt;altitude&gt;139.629438&lt;/altitude&gt;
	 *         &lt;heading&gt;-70.0&lt;/heading&gt;
	 *         &lt;tilt&gt;75&lt;/tilt&gt;
	 *       &lt;/Camera&gt;
	 *     &lt;/Placemark&gt;
	 * 
	 *   &lt;/Document&gt;
	 * &lt;/kml&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void timeSpanAndGxTimeStampExample();

	/**
	 * gx:Tour
	 * 
	 * <pre>
	 * 
	 * &lt;gx:Tour&gt;
	 *   &lt;name&gt;...&lt;/name&gt;
	 *   &lt;description&gt;...&lt;/description&gt;
	 *   &lt;gx:Playlist&gt;
	 * 
	 *     &lt;!-- any number of gx:TourPrimitive elements --&gt;
	 * 
	 *   &lt;/gx:Playlist&gt;
	 * &lt;/gx:Tour&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void tour();

	/**
	 * gx:altitudeMode
	 * 
	 * <pre>
	 * 
	 * &lt;gx:Tour&gt;
	 *   &lt;gx:Playlist&gt;
	 *     &lt;!-- gx:TourPrimitive --&gt;
	 *       ...
	 *     &lt;!-- /gx:TourPrimitive --&gt;
	 * 
	 *     &lt;!--- Any number of gx:TourPrimitive elements can be included ---&gt;
	 *   &lt;/gx:Playlist&gt;
	 * &lt;/gx:Tour&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void playlist();

	/**
	 * gx:TourPrimitive
	 * 
	 * <pre>
	 * 
	 * &lt;gx:Tour&gt;
	 *   &lt;gx:Playlist&gt;
	 * 
	 *     &lt;!-- abstract element; do not create --&gt;
	 *     &lt;!-- gx:TourPrimitive --&gt;    &lt;!-- gx:AnimatedUpdate, gx:FlyTo, gx:TourControl, gx:SoundCue, gx:Wait --&gt;
	 *         &lt;!-- extends Object --&gt;
	 *     &lt;!-- /gx:TourPrimitive --&gt;
	 * 
	 *   &lt;/gx:Playlist&gt;
	 * &lt;/gx:Tour&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void tourPrimitive();

	/**
	 * gx:TourPrimitive Example
	 * 
	 * <pre>
	 * 
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
	 * 
	 *   &lt;Document&gt;
	 *     &lt;name&gt;gx:AnimatedUpdate example&lt;/name&gt;
	 *     &lt;open&gt;1&lt;/open&gt;
	 * 
	 *     &lt;Style&gt;
	 *       &lt;IconStyle id=&quot;iconstyle&quot;&gt;
	 *         &lt;scale&gt;1.0&lt;/scale&gt;
	 *       &lt;/IconStyle&gt;
	 *     &lt;/Style&gt;
	 * 
	 *     &lt;Placemark id=&quot;mountainpin1&quot;&gt;
	 *       &lt;name&gt;New Zealand's Southern Alps&lt;/name&gt;
	 *       &lt;styleUrl&gt;#style&lt;/styleUrl&gt;
	 *       &lt;Point&gt;
	 *         &lt;coordinates&gt;170.144,-43.605,0&lt;/coordinates&gt;
	 *       &lt;/Point&gt;
	 *     &lt;/Placemark&gt;
	 * 
	 *     &lt;gx:Tour&gt;
	 *       &lt;name&gt;Play me!&lt;/name&gt;
	 *       &lt;gx:Playlist&gt;
	 * 
	 *         &lt;!-- The order and duration of TourPrimitives is important;
	 *              in this example, the AnimatedUpdate needs
	 *              6.5 seconds to complete. The FlyTo provides 4.1,
	 *              and the Wait 2.4, giving the update time to
	 *              complete before the Tour ends. AnimatedUpdates
	 *              don't hold Tours open, but FlyTos and Waits do.
	 * 
	 *              For more information, refer to:
	 *              https://developers.google.com/kml/documentation/touring#tourtimelines
	 *         --&gt;
	 * 
	 *         &lt;gx:AnimatedUpdate&gt;
	 *           &lt;gx:duration&gt;6.5&lt;/gx:duration&gt;
	 *           &lt;Update&gt;
	 *             &lt;targetHref&gt;&lt;/targetHref&gt;
	 *             &lt;Change&gt;
	 *                 &lt;IconStyle id=&quot;iconstyle&quot;&gt;
	 *                   &lt;scale&gt;10.0&lt;/scale&gt;
	 *                 &lt;/IconStyle&gt;
	 *             &lt;/Change&gt;
	 *           &lt;/Update&gt;
	 *         &lt;/gx:AnimatedUpdate&gt;
	 * 
	 *         &lt;gx:FlyTo&gt;
	 *           &lt;gx:duration&gt;4.1&lt;/gx:duration&gt;
	 *           &lt;Camera&gt;
	 *             &lt;longitude&gt;170.157&lt;/longitude&gt;
	 *             &lt;latitude&gt;-43.671&lt;/latitude&gt;
	 *             &lt;altitude&gt;9700&lt;/altitude&gt;
	 *             &lt;heading&gt;-6.333&lt;/heading&gt;
	 *             &lt;tilt&gt;33.5&lt;/tilt&gt;
	 *             &lt;roll&gt;0&lt;/roll&gt;
	 *           &lt;/Camera&gt;
	 *         &lt;/gx:FlyTo&gt;
	 * 
	 *         &lt;gx:Wait&gt;
	 *           &lt;gx:duration&gt;2.4&lt;/gx:duration&gt;  &lt;!-- waiting for the AnimatedUpdate to complete --&gt;
	 *         &lt;/gx:Wait&gt;
	 * 
	 *       &lt;/gx:Playlist&gt;
	 *     &lt;/gx:Tour&gt;
	 *   &lt;/Document&gt;
	 * &lt;/kml&gt;
	 * 
	 * </pre>
	 */
	@Test
	public abstract void tourPrimitiveExample();

	/**
	 * gx:SoundCue
	 * 
	 * <pre>
	 * &lt;gx:SoundCue&gt;
	 *   &lt;href&gt;http://www.example.com/audio/trumpets.mp3&lt;/href&gt;   &lt;!-- any URI --&gt;
	 * &lt;/gx:SoundCue&gt;
	 * </pre>
	 */
	@Test
	public abstract void soundCue();

	/**
	 * gx:TourControl
	 * 
	 * <pre>
	 * &lt;gx:TourControl&gt;
	 *   &lt;gx:playMode&gt;pause&lt;/gx:playMode&gt;    &lt;!-- gx:playModeEnum: pause --&gt;
	 * &lt;/gx:TourControl&gt;	 
	 * </pre>
	 */
	@Test
	public abstract void tourControl();

	/**
	 * gx:Wait
	 * 
	 * <pre>
	 * &lt;gx:Wait&gt;
	 *   &lt;gx:duration&gt;0.0&lt;/gx:duration&gt;    &lt;!-- double --&gt;
	 * &lt;/gx:Wait&gt;	 
	 * </pre>
	 */
	@Test
	public abstract void waitgx();

}