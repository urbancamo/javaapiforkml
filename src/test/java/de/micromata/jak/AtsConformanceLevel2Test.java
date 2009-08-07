package de.micromata.jak;

import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Test;

import de.micromata.jak.internal.IAtsConformanceLevel2;
import de.micromata.opengis.kml.v_2_2_0.Alias;
import de.micromata.opengis.kml.v_2_2_0.BalloonStyle;
import de.micromata.opengis.kml.v_2_2_0.Camera;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Data;
import de.micromata.opengis.kml.v_2_2_0.ExtendedData;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Geometry;
import de.micromata.opengis.kml.v_2_2_0.GroundOverlay;
import de.micromata.opengis.kml.v_2_2_0.Icon;
import de.micromata.opengis.kml.v_2_2_0.IconStyle;
import de.micromata.opengis.kml.v_2_2_0.ImagePyramid;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LabelStyle;
import de.micromata.opengis.kml.v_2_2_0.LatLonBox;
import de.micromata.opengis.kml.v_2_2_0.LineString;
import de.micromata.opengis.kml.v_2_2_0.LinearRing;
import de.micromata.opengis.kml.v_2_2_0.Link;
import de.micromata.opengis.kml.v_2_2_0.ListStyle;
import de.micromata.opengis.kml.v_2_2_0.Location;
import de.micromata.opengis.kml.v_2_2_0.Model;
import de.micromata.opengis.kml.v_2_2_0.MultiGeometry;
import de.micromata.opengis.kml.v_2_2_0.Overlay;
import de.micromata.opengis.kml.v_2_2_0.Pair;
import de.micromata.opengis.kml.v_2_2_0.PhotoOverlay;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Point;
import de.micromata.opengis.kml.v_2_2_0.PolyStyle;
import de.micromata.opengis.kml.v_2_2_0.ResourceMap;
import de.micromata.opengis.kml.v_2_2_0.Scale;
import de.micromata.opengis.kml.v_2_2_0.ScreenOverlay;
import de.micromata.opengis.kml.v_2_2_0.Style;
import de.micromata.opengis.kml.v_2_2_0.StyleMap;
import de.micromata.opengis.kml.v_2_2_0.StyleState;
import de.micromata.opengis.kml.v_2_2_0.ViewRefreshMode;

/**
 * @author Flori (f.bachmann@micromata.de)
 * 
 */
public class AtsConformanceLevel2Test implements IAtsConformanceLevel2 {
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(KmlReferencePojoTest.class.getName());

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc42PolyStyle()
	 */
	@Test
	public void atc42PolyStyle() {
		// a kml:Scale element is not a descendant of kml:Update
		Assert.assertNull(Utils.findClass(PolyStyle.class, "update"));
		
		Assert.assertNotNull(Utils.findField(PolyStyle.class, "color"));
		Assert.assertNotNull(Utils.findField(PolyStyle.class, "colorMode"));
		Assert.assertNotNull(Utils.findField(PolyStyle.class, "fill"));
		Assert.assertNotNull(Utils.findField(PolyStyle.class, "outline"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc43CoordinatesAltitudeMode()
	 */
	@Test
	public void atc43CoordinatesAltitudeMode() {
		// Applies to the control points 
		// in kml:AbstractGeometryType/kml:coordinates 
		// and kml:Model/kml:Location.
		Field location = Utils.findField(Model.class, "location");
		Assert.assertNotNull(location);
		Assert.assertEquals(Location.class, location.getType());
		
		// check if LinearRing contains coordinats
		Field coordinatesLinerarRing = Utils.findField(LinearRing.class, "coordinates");
		Assert.assertNotNull(coordinatesLinerarRing);
		Assert.assertEquals(Coordinate.class, Utils.getClassForGenericList(coordinatesLinerarRing.getGenericType().toString()));
		
		// check if Point contains coordinats
		Field coordinatesPoint = Utils.findField(Point.class, "coordinates");
		Assert.assertNotNull(coordinatesPoint);
		Assert.assertEquals(Coordinate.class, Utils.getClassForGenericList(coordinatesPoint.getGenericType().toString()));
		
		// check if Model contains coordinats
		Field locationModel = Utils.findField(Model.class, "location");
		Assert.assertNotNull(locationModel);
		Assert.assertEquals(Location.class, locationModel.getType());
		
		// check if LineString contains coordinats
		Field coordinatesLineString = Utils.findField(LineString.class, "coordinates");
		Assert.assertNotNull(coordinatesLineString);
		Assert.assertEquals(Coordinate.class, Utils.getClassForGenericList(coordinatesLineString.getGenericType().toString()));
		
		// check if Location contains altitude as double type
		Field locationAltitude = Utils.findField(Location.class, "altitude");
		Assert.assertNotNull(locationAltitude);
		Assert.assertEquals("double", locationAltitude.getType().getSimpleName());

		// check if Location contains altitude as double type
		Field coordinateAltitude = Utils.findField(Coordinate.class, "altitude");
		Assert.assertNotNull(coordinateAltitude);
		Assert.assertEquals("double", coordinateAltitude.getType().getSimpleName());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc44ScaleMinimalContent()
	 */
	@Test
	public void atc44ScaleMinimalContent() {
		// a kml:Scale element is not a descendant of kml:Update
		Assert.assertNull(Utils.findClass(Scale.class, "Update"));
		
		Assert.assertNotNull(Utils.findField(Scale.class, "x"));
		Assert.assertNotNull(Utils.findField(Scale.class, "y"));
		Assert.assertNotNull(Utils.findField(Scale.class, "z"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc45KMLMinimalContent()
	 */
	@Test
	public void atc45KMLMinimalContent() {
		Assert.assertNotNull(Utils.findField(Kml.class, "networkLinkControl"));
		Assert.assertNotNull(Utils.findField(Kml.class, "feature"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc46ViewFormat()
	 */
	@Test
	public void atc46ViewFormat() {
		Assert.assertNotNull(Utils.findField(Link.class, "viewFormat"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc47HttpQuery()
	 */
	@Test
	public void atc47HttpQuery() {
		Assert.assertNotNull(Utils.findField(Link.class, "httpQuery"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc48LinearRingInPolygon()
	 */
	@Test
	public void atc48LinearRingInPolygon() {
		//TODO: take a second look
		Assert.assertNotNull(Utils.findField(LinearRing.class, "extrude"));
		Assert.assertNotNull(Utils.findField(LinearRing.class, "tessellate"));
		Assert.assertNotNull(Utils.findField(LinearRing.class, "altitudeMode"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc49Data()
	 */
	@Test
	public void atc49Data() {
		Assert.assertNotNull(Utils.findField(Data.class, "displayName"));
		Assert.assertNotNull(Utils.findField(Data.class, "value"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc50ResourceMapAlias()
	 */
	@Test
	public void atc50ResourceMapAlias() {
		Assert.assertNotNull(Utils.findField(ResourceMap.class, "alias"));
		Assert.assertNotNull(Utils.findField(Alias.class, "sourceHref"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc51LinkRefreshValues()
	 */
	@Test
	public void atc51LinkRefreshValues() {
		//TODO: take a second look
		Assert.assertNotNull(Utils.findField(Link.class, "refreshInterval"));
		Assert.assertNotNull(Utils.findField(Link.class, "viewRefreshTime"));
		Assert.assertNotNull(Utils.findField(ViewRefreshMode.class, "ON_STOP"));
		Assert.assertNotNull(Utils.findField(Icon.class, "refreshInterval"));
		Assert.assertNotNull(Utils.findField(Icon.class, "viewRefreshTime"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc52PhotoOverlay()
	 */
	@Test
	public void atc52PhotoOverlay() {
		//TODO: take a second look
		Assert.assertNotNull(Utils.findField(PhotoOverlay.class, "icon"));
		// The parameters are embedded within the URL; 
		// i.e, http://server.company.com/bigphoto/$[level]/row_$[x]_column_$[y].jpg. 
		// Check for the kml:ImagePyramid when the x, y, level parameters are present, 
		// or if the kml:ImagePyramid is present check for the x, y, level parameters.
		
		Icon icon = new Icon();
		icon.setHref("http://server.company.com/bigphoto/$[level]/row_$[x]_column_$[y].jpg");
		Assert.assertEquals(icon.getHref(), "http://server.company.com/bigphoto/$[level]/row_$[x]_column_$[y].jpg");
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc53GroundOverlayMinimalContent()
	 */
	@Test
	public void atc53GroundOverlayMinimalContent() {
		// a kml:GroundOverlay element is not a descendant of kml:Update
		Assert.assertNull(Utils.findClass(GroundOverlay.class, "Update"));
		
		Field latlonBoxGroundOverlay = Utils.findField(GroundOverlay.class, "latLonBox");
		Assert.assertNotNull(latlonBoxGroundOverlay);
		Assert.assertEquals(LatLonBox.class, latlonBoxGroundOverlay.getType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc54Camera()
	 */
	@Test
	public void atc54Camera() {
		//TODO: take a second look
		//TODO: if set to altitude is present the altitudeMode is not clmapToGround"
		
		Assert.assertNull(Utils.findClass(Camera.class, "Update"));
		Assert.assertNotNull(Utils.findField(Camera.class, "longitude"));
		Assert.assertNotNull(Utils.findField(Camera.class, "latitude"));
		Assert.assertNotNull(Utils.findField(Camera.class, "altitude"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc55Location()
	 */
	@Test
	public void atc55Location() {
		Assert.assertNotNull(Utils.findField(Location.class, "longitude"));
		Assert.assertNotNull(Utils.findField(Location.class, "latitude"));
		Assert.assertNotNull(Utils.findField(Location.class, "altitude"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc56Overlay()
	 */
	@Test
	public void atc56Overlay() {
		Assert.assertNull(Utils.findClass(Overlay.class, "Update"));
		Assert.assertNull(Utils.findClass(ScreenOverlay.class, "Update"));
		Assert.assertNull(Utils.findClass(PhotoOverlay.class, "Update"));
		Assert.assertNull(Utils.findClass(GroundOverlay.class, "Update"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc57ScreenOverlay()
	 */
	@Test
	public void atc57ScreenOverlay() {
		Assert.assertNull(Utils.findClass(ScreenOverlay.class, "Update"));
		Assert.assertNotNull(Utils.findField(ScreenOverlay.class, "screenXY"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc58BaloonStyle()
	 */
	@Test
	public void atc58BaloonStyle() {
		Assert.assertNull(Utils.findClass(BalloonStyle.class, "Update"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc59ExtendedData()
	 */
	@Test
	public void atc59ExtendedData() {
		Assert.assertNotNull(Utils.findField(ExtendedData.class, "data"));
		Assert.assertNotNull(Utils.findField(ExtendedData.class, "schemaData"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc60Folder()
	 */
	@Test
	public void atc60Folder() {
		Assert.assertNull(Utils.findClass(Folder.class, "Update"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc61IconStyle()
	 */
	@Test
	public void atc61IconStyle() {
		Assert.assertNull(Utils.findClass(IconStyle.class, "Update"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc62ImagePyramid()
	 */
	@Test
	public void atc62ImagePyramid() {
		Assert.assertNull(Utils.findClass(ImagePyramid.class, "Update"));
		
		Assert.assertNotNull(Utils.findField(ImagePyramid.class, "tileSize"));
		Assert.assertNotNull(Utils.findField(ImagePyramid.class, "maxWidth"));
		Assert.assertNotNull(Utils.findField(ImagePyramid.class, "maxHeight"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc63LabelStyle()
	 */
	@Test
	public void atc63LabelStyle() {
		Assert.assertNull(Utils.findClass(LabelStyle.class, "Update"));
		
		Assert.assertNotNull(Utils.findField(LabelStyle.class, "color"));
		Assert.assertNotNull(Utils.findField(LabelStyle.class, "colorMode"));
		Assert.assertNotNull(Utils.findField(LabelStyle.class, "scale"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc64ListStyle()
	 */
	@Test
	public void atc64ListStyle() {
		Assert.assertNull(Utils.findClass(ListStyle.class, "Update"));

		Assert.assertNotNull(Utils.findField(ListStyle.class, "listItemType"));
		Assert.assertNotNull(Utils.findField(ListStyle.class, "bgColor"));
		Assert.assertNotNull(Utils.findField(ListStyle.class, "itemIcon"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc65Sytle()
	 */
	@Test
	public void atc65Sytle() {
		Assert.assertNull(Utils.findClass(Style.class, "Update"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc66MultiGeometry()
	 */
	@Test
	public void atc66MultiGeometry() {
		Assert.assertNull(Utils.findClass(MultiGeometry.class, "Update"));
		
		Field geometryList = Utils.findField(MultiGeometry.class, "geometry");
		Assert.assertNotNull(geometryList);
		Assert.assertEquals(List.class, geometryList.getType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc67Placemark()
	 */
	@Test
	public void atc67Placemark() {
		Assert.assertNull(Utils.findClass(Placemark.class, "Update"));
		
		Field geometry = Utils.findField(Placemark.class, "geometry");
		Assert.assertNotNull(geometry);
		Assert.assertEquals(Geometry.class, geometry.getType());
		
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel2#atc68StyleMap()
	 */
	@Test
	public void atc68StyleMap() {
		Assert.assertNull(Utils.findClass(StyleMap.class, "Update"));
		
		// check if StyleMap contains pair
		Field pair = Utils.findField(StyleMap.class, "pair");
		Assert.assertNotNull(pair);
		Assert.assertEquals(List.class, pair.getType());
		Assert.assertEquals(Pair.class, Utils.getClassForGenericList(pair.getGenericType().toString()));
		
		Assert.assertNotNull(Utils.findField(StyleState.class, "NORMAL"));
		Assert.assertNotNull(Utils.findField(StyleState.class, "HIGHLIGHT"));
	}

}
