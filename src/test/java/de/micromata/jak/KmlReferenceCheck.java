package de.micromata.jak;

import java.util.List;

import org.junit.Assert;

import de.micromata.opengis.kml.v_2_2_0.Alias;
import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.BalloonStyle;
import de.micromata.opengis.kml.v_2_2_0.Camera;
import de.micromata.opengis.kml.v_2_2_0.Change;
import de.micromata.opengis.kml.v_2_2_0.ColorMode;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Create;
import de.micromata.opengis.kml.v_2_2_0.Delete;
import de.micromata.opengis.kml.v_2_2_0.DisplayMode;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.ExtendedData;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Geometry;
import de.micromata.opengis.kml.v_2_2_0.GridOrigin;
import de.micromata.opengis.kml.v_2_2_0.GroundOverlay;
import de.micromata.opengis.kml.v_2_2_0.Icon;
import de.micromata.opengis.kml.v_2_2_0.IconStyle;
import de.micromata.opengis.kml.v_2_2_0.ItemIconState;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LabelStyle;
import de.micromata.opengis.kml.v_2_2_0.LatLonAltBox;
import de.micromata.opengis.kml.v_2_2_0.LatLonBox;
import de.micromata.opengis.kml.v_2_2_0.LineString;
import de.micromata.opengis.kml.v_2_2_0.LineStyle;
import de.micromata.opengis.kml.v_2_2_0.LinearRing;
import de.micromata.opengis.kml.v_2_2_0.Link;
import de.micromata.opengis.kml.v_2_2_0.ListItemType;
import de.micromata.opengis.kml.v_2_2_0.ListStyle;
import de.micromata.opengis.kml.v_2_2_0.Location;
import de.micromata.opengis.kml.v_2_2_0.Lod;
import de.micromata.opengis.kml.v_2_2_0.LookAt;
import de.micromata.opengis.kml.v_2_2_0.Model;
import de.micromata.opengis.kml.v_2_2_0.MultiGeometry;
import de.micromata.opengis.kml.v_2_2_0.NetworkLink;
import de.micromata.opengis.kml.v_2_2_0.NetworkLinkControl;
import de.micromata.opengis.kml.v_2_2_0.Orientation;
import de.micromata.opengis.kml.v_2_2_0.Pair;
import de.micromata.opengis.kml.v_2_2_0.PhotoOverlay;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Point;
import de.micromata.opengis.kml.v_2_2_0.PolyStyle;
import de.micromata.opengis.kml.v_2_2_0.Polygon;
import de.micromata.opengis.kml.v_2_2_0.RefreshMode;
import de.micromata.opengis.kml.v_2_2_0.Region;
import de.micromata.opengis.kml.v_2_2_0.Scale;
import de.micromata.opengis.kml.v_2_2_0.Schema;
import de.micromata.opengis.kml.v_2_2_0.ScreenOverlay;
import de.micromata.opengis.kml.v_2_2_0.Shape;
import de.micromata.opengis.kml.v_2_2_0.Style;
import de.micromata.opengis.kml.v_2_2_0.StyleMap;
import de.micromata.opengis.kml.v_2_2_0.StyleState;
import de.micromata.opengis.kml.v_2_2_0.TimeSpan;
import de.micromata.opengis.kml.v_2_2_0.TimeStamp;
import de.micromata.opengis.kml.v_2_2_0.Units;
import de.micromata.opengis.kml.v_2_2_0.Update;
import de.micromata.opengis.kml.v_2_2_0.ViewRefreshMode;

public final class KmlReferenceCheck {

	public static void ballonStyle(final BalloonStyle balloonstyle) {
		Assert.assertEquals("ID", balloonstyle.getId());
		Assert.assertEquals("ffffffff", balloonstyle.getBgColor());
		Assert.assertEquals("ff000000", balloonstyle.getTextColor());
		Assert.assertEquals("...", balloonstyle.getText());
		Assert.assertEquals(DisplayMode.DEFAULT, balloonstyle.getDisplayMode());
	}
	
	public static void ballonStyle(BalloonStyle balloonstyle, BalloonStyle marshalledAndBackAgain) {
		Assert.assertEquals(balloonstyle, marshalledAndBackAgain);
  }
	
	public static void ballonStyleExample(final Kml kml) {
		Assert.assertEquals("BalloonStyle.kml", kml.getFeature().getName());
		Assert.assertTrue("Document.isOpen(): ", kml.getFeature().isOpen());
		Assert.assertEquals("exampleBalloonStyle", kml.getFeature().getStyleSelector().get(0).getId());

		final BalloonStyle balloonstyle = ((Style) kml.getFeature().getStyleSelector().get(0)).getBalloonStyle();
		Assert.assertEquals("ffffffbb", balloonstyle.getBgColor());
		Assert
		    .assertEquals(
		        "<![CDATA[" + "<b><font color='#CC0000' size='+3'>$[name]</font></b>" + "<br/><br/>" + "<font face='Courier'>$[description]</font>" + "<br/><br/>" + "Extra text that will appear in the description balloon" + "<br/><br/>" + "<!-- insert the to/from hyperlinks -->" + "$[geDirections]]]>",
		        balloonstyle.getText());

		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("BalloonStyle", placemark.getName());
		Assert.assertEquals("An example of BalloonStyle", placemark.getDescription());
		Assert.assertEquals("#exampleBalloonStyle", placemark.getStyleUrl());
		Assert.assertEquals(new Coordinate(-122.370533, 37.823842, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(0));
	}

	public static void camera(final Camera camera) {
		Assert.assertEquals(0.0d, camera.getLongitude(), 0.00001d);
		Assert.assertEquals(0.0d, camera.getLatitude(), 0.00001d);
		Assert.assertEquals(0.0d, camera.getAltitude(), 0.00001d);
		Assert.assertEquals(0.0d, camera.getHeading(), 0.00001d);
		Assert.assertEquals(0.0d, camera.getTilt(), 0.00001d);
		Assert.assertEquals(0.0d, camera.getRoll(), 0.00001d);
		Assert.assertEquals(0.0d, camera.getHeading(), 0.00001d);
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, camera.getAltitudeMode());
	}

	@SuppressWarnings("deprecation")
  public static void document(final Document document) {
		Assert.assertEquals("...", document.getName());
		Assert.assertTrue(document.isVisibility());
		Assert.assertFalse(document.isOpen());
		Assert.assertEquals("...", document.getAtomAuthor().getNameOrUriOrEmail().get(0));
		Assert.assertNotNull(document.getAtomLink());
		Assert.assertEquals("...", document.getAddress());
		Assert.assertNotNull(document.getXalAddressDetails());
		Assert.assertEquals("...", document.getPhoneNumber());
		Assert.assertEquals(2, document.getSnippet().getMaxLines());
		Assert.assertEquals("...", document.getSnippet().getValue());
		Assert.assertNotNull(document.getAbstractView());
		Assert.assertNotNull(document.getTimePrimitive());
		Assert.assertEquals("...", document.getStyleUrl());
		Assert.assertNotNull(document.getStyleSelector());
		Assert.assertNotNull(document.getRegion());
		Assert.assertNotNull(document.getMetadata());
		Assert.assertNotNull(document.getExtendedData());
	}

	public static void documentExample(final Kml kml) {
		Assert.assertEquals("Document.kml", ((Document) kml.getFeature()).getName());
		Assert.assertTrue(((Document) kml.getFeature()).isOpen());

		Assert.assertEquals("exampleStyleDocument", kml.getFeature().getStyleSelector().get(0).getId());

		final LabelStyle labelstyle = ((Style) kml.getFeature().getStyleSelector().get(0)).getLabelStyle();
		Assert.assertEquals("ff0000cc", labelstyle.getColor());

		final Placemark placemark1 = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("Document Feature 1", placemark1.getName());
		Assert.assertEquals("#exampleStyleDocument", placemark1.getStyleUrl());
		Assert.assertEquals(new Coordinate(-122.371, 37.816, 0.0), ((Point) placemark1.getGeometry()).getCoordinates().get(0));

		final Placemark placemark2 = (Placemark) ((Document) kml.getFeature()).getFeature().get(1);
		Assert.assertEquals("Document Feature 2", placemark2.getName());
		Assert.assertEquals("#exampleStyleDocument", placemark2.getStyleUrl());
		Assert.assertEquals(new Coordinate(-122.370, 37.817, 0.0), ((Point) placemark2.getGeometry()).getCoordinates().get(0));
	}

	public static void extendedData(final ExtendedData extendedData) {
		Assert.assertEquals("string", extendedData.getData().get(0).getName());
		Assert.assertEquals("...", extendedData.getData().get(0).getDisplayName());
		Assert.assertEquals("...", extendedData.getData().get(0).getValue());

		Assert.assertEquals("anyURI", extendedData.getSchemaData().get(0).getSchemaUrl());
		Assert.assertEquals("", extendedData.getSchemaData().get(0).getSimpleData().get(0).getName());
		Assert.assertEquals("...", extendedData.getSchemaData().get(0).getSimpleData().get(0).getValue());
	}

	public static void extendedDataValue(final Placemark placemark) {
		Assert.assertEquals("Club house", placemark.getName());
		Assert.assertEquals("holeNumber", placemark.getExtendedData().getData().get(0).getName());
		Assert.assertEquals("1", placemark.getExtendedData().getData().get(0).getValue());
		Assert.assertEquals("holePar", placemark.getExtendedData().getData().get(1).getName());
		Assert.assertEquals("4", placemark.getExtendedData().getData().get(1).getValue());
	}

	public static void extendedDataSimpleData(final Document document) {
		final Placemark p1 = (Placemark) document.getFeature().get(0);
		Assert.assertEquals("Easy trail", p1.getName());
		Assert.assertEquals("#TrailHeadTypeId", p1.getExtendedData().getSchemaData().get(0).getSchemaUrl());
		Assert.assertEquals("TrailHeadName", p1.getExtendedData().getSchemaData().get(0).getSimpleData().get(0).getName());
		Assert.assertEquals("Pi in the sky", p1.getExtendedData().getSchemaData().get(0).getSimpleData().get(0).getValue());
		Assert.assertEquals("TrailLength", p1.getExtendedData().getSchemaData().get(0).getSimpleData().get(1).getName());
		Assert.assertEquals("3.14159", p1.getExtendedData().getSchemaData().get(0).getSimpleData().get(1).getValue());
		Assert.assertEquals("ElevationGain", p1.getExtendedData().getSchemaData().get(0).getSimpleData().get(2).getName());
		Assert.assertEquals("10", p1.getExtendedData().getSchemaData().get(0).getSimpleData().get(2).getValue());
		Assert.assertEquals(new Coordinate(-122.000, 37.002), ((Point) p1.getGeometry()).getCoordinates().get(0));

		final Placemark p2 = (Placemark) document.getFeature().get(1);
		Assert.assertEquals("Difficult trail", p2.getName());
		Assert.assertEquals("#TrailHeadTypeId", p2.getExtendedData().getSchemaData().get(0).getSchemaUrl());
		Assert.assertEquals("TrailHeadName", p2.getExtendedData().getSchemaData().get(0).getSimpleData().get(0).getName());
		Assert.assertEquals("Mount Everest", p2.getExtendedData().getSchemaData().get(0).getSimpleData().get(0).getValue());
		Assert.assertEquals("TrailLength", p2.getExtendedData().getSchemaData().get(0).getSimpleData().get(1).getName());
		Assert.assertEquals("347.45", p2.getExtendedData().getSchemaData().get(0).getSimpleData().get(1).getValue());
		Assert.assertEquals("ElevationGain", p2.getExtendedData().getSchemaData().get(0).getSimpleData().get(2).getName());
		Assert.assertEquals("10000", p2.getExtendedData().getSchemaData().get(0).getSimpleData().get(2).getValue());
		Assert.assertEquals(new Coordinate(-122.000, 37.002), ((Point) p2.getGeometry()).getCoordinates().get(0));
	}

	public static void extendedDataNameSapcePrefix(final ExtendedData extendedData) {
		// FIXME:!!!
	}

	public static void featureAscriptionElement(final Kml kml) {
		Assert.assertEquals("J. K. Rowling", kml.getFeature().getAtomAuthor().getNameOrUriOrEmail().get(0));
		Assert.assertEquals("http://www.harrypotter.com", kml.getFeature().getAtomLink().getHref());

		final Placemark p1 = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("Hogwarts", p1.getName());
		Assert.assertEquals(new Coordinate(1.0, 1.0, 0.0), ((Point) p1.getGeometry()).getCoordinates().get(0));

		final Placemark p2 = (Placemark) ((Document) kml.getFeature()).getFeature().get(1);
		Assert.assertEquals("Little Hangleton", p2.getName());
		Assert.assertEquals(new Coordinate(1.0, 2.0, 0.0), ((Point) p2.getGeometry()).getCoordinates().get(0));
	}

	@SuppressWarnings("deprecation")
  public static void folder(final Folder folder) {
		Assert.assertEquals("ID", folder.getId());
		Assert.assertEquals("...", folder.getName());
		Assert.assertTrue(folder.isVisibility());
		Assert.assertFalse(folder.isOpen());
		Assert.assertEquals("...", folder.getAtomAuthor().getNameOrUriOrEmail().get(0));
		Assert.assertNotNull(folder.getAtomLink());
		Assert.assertEquals("...", folder.getAddress());
		Assert.assertNotNull(folder.getXalAddressDetails());
		Assert.assertEquals("...", folder.getPhoneNumber());
		Assert.assertEquals(2, folder.getSnippet().getMaxLines());
		Assert.assertEquals("...", folder.getSnippet().getValue());
		Assert.assertNotNull(folder.getAbstractView());
		Assert.assertNotNull(folder.getTimePrimitive());
		Assert.assertEquals("...", folder.getStyleUrl());
		Assert.assertNotNull(folder.getStyleSelector());
		Assert.assertNotNull(folder.getRegion());
		Assert.assertNotNull(folder.getMetadata());
		Assert.assertNotNull(folder.getExtendedData());
	}

	public static void folderExample(final Kml kml) {
		final Folder folder = (Folder) kml.getFeature();
		Assert.assertEquals("Folder.kml", folder.getName());
		Assert.assertTrue(folder.isOpen());
		Assert.assertEquals("A folder is a container that can hold multiple other objects", folder.getDescription());

		final Placemark p1 = (Placemark) folder.getFeature().get(0);
		Assert.assertEquals("Folder object 1 (Placemark)", p1.getName());
		Assert.assertEquals(new Coordinate(-122.377588, 37.830266, 0.0), ((Point) p1.getGeometry()).getCoordinates().get(0));

		final Placemark p2 = (Placemark) folder.getFeature().get(1);
		Assert.assertEquals("Folder object 2 (Polygon)", p2.getName());
		Assert.assertEquals(new Coordinate("-122.377830,37.830445,0.0"), ((Polygon) p2.getGeometry()).getOuterBoundaryIs().getLinearRing().getCoordinates()
		    .get(0));
		Assert.assertEquals(new Coordinate("-122.377576,37.830631,0.0"), ((Polygon) p2.getGeometry()).getOuterBoundaryIs().getLinearRing().getCoordinates()
		    .get(1));
		Assert.assertEquals(new Coordinate("-122.377840,37.830642,0.0"), ((Polygon) p2.getGeometry()).getOuterBoundaryIs().getLinearRing().getCoordinates()
		    .get(2));
		Assert.assertEquals(new Coordinate("-122.377830,37.830445,0.0"), ((Polygon) p2.getGeometry()).getOuterBoundaryIs().getLinearRing().getCoordinates()
		    .get(3));

		final Placemark p3 = (Placemark) folder.getFeature().get(2);
		Assert.assertEquals("Folder object 3 (Path)", p3.getName());
		Assert.assertEquals(new Coordinate(-122.378009, 37.830128, 0.0), ((LineString) p3.getGeometry()).getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(-122.377885, 37.830379, 0.0), ((LineString) p3.getGeometry()).getCoordinates().get(1));
	}

	@SuppressWarnings("deprecation")
  public static void groundoverlay(final GroundOverlay groundoverlay) {
		// <!-- inherited from Feature element -->
		Assert.assertEquals("ID", groundoverlay.getId());
		Assert.assertEquals("...", groundoverlay.getName());
		Assert.assertTrue(groundoverlay.isVisibility());
		Assert.assertFalse(groundoverlay.isOpen());
		Assert.assertEquals("...", groundoverlay.getAtomAuthor().getNameOrUriOrEmail().get(0));
		Assert.assertNotNull(groundoverlay.getAtomLink());
		Assert.assertEquals("...", groundoverlay.getAddress());
		Assert.assertNotNull(groundoverlay.getXalAddressDetails());
		Assert.assertEquals("...", groundoverlay.getPhoneNumber());
		Assert.assertEquals(2, groundoverlay.getSnippet().getMaxLines());
		Assert.assertEquals("...", groundoverlay.getSnippet().getValue());
		Assert.assertNotNull(groundoverlay.getAbstractView());
		Assert.assertNotNull(groundoverlay.getTimePrimitive());
		Assert.assertEquals("...", groundoverlay.getStyleUrl());
		Assert.assertNotNull(groundoverlay.getStyleSelector());
		Assert.assertNotNull(groundoverlay.getRegion());
		Assert.assertNotNull(groundoverlay.getMetadata());
		Assert.assertNotNull(groundoverlay.getExtendedData());

		// <!-- inherited from Overlay element -->
		Assert.assertEquals("ffffffff", groundoverlay.getColor());
		Assert.assertEquals(0, groundoverlay.getDrawOrder());
		Assert.assertEquals("...", groundoverlay.getIcon().getHref());

		// <!-- specific to GroundOverlay -->
		Assert.assertEquals(0.0d, groundoverlay.getAltitude(), 0.0001d);
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, groundoverlay.getAltitudeMode());
		Assert.assertEquals(0.0d, groundoverlay.getLatLonBox().getNorth(), 0.0001d);
		Assert.assertEquals(0.0d, groundoverlay.getLatLonBox().getSouth(), 0.0001d);
		Assert.assertEquals(0.0d, groundoverlay.getLatLonBox().getEast(), 0.0001d);
		Assert.assertEquals(0.0d, groundoverlay.getLatLonBox().getWest(), 0.0001d);
		Assert.assertEquals(0.0d, groundoverlay.getLatLonBox().getRotation(), 0.0001d);
	}

	public static void groundOverlayLatLonBox(final LatLonBox latlonBox) {
		Assert.assertEquals(48.25475939255556d, latlonBox.getNorth(), 0.0001d);
		Assert.assertEquals(48.25207367852141d, latlonBox.getSouth(), 0.0001d);
		Assert.assertEquals(-90.86591508839973d, latlonBox.getEast(), 0.0001d);
		Assert.assertEquals(-90.8714285289695d, latlonBox.getWest(), 0.0001d);
		Assert.assertEquals(39.37878630116985d, latlonBox.getRotation(), 0.0001d);
	}

	public static void groundOverlayExample(final Kml kml) {
		final GroundOverlay groundoverlay = (GroundOverlay) kml.getFeature();
		Assert.assertEquals("GroundOverlay.kml", groundoverlay.getName());
		Assert.assertEquals("7fffffff", groundoverlay.getColor());
		Assert.assertEquals(1, groundoverlay.getDrawOrder());

		Assert.assertEquals("http://www.google.com/intl/en/images/logo.gif", groundoverlay.getIcon().getHref());
		Assert.assertEquals(RefreshMode.ON_INTERVAL, groundoverlay.getIcon().getRefreshMode());
		Assert.assertEquals(86400d, groundoverlay.getIcon().getRefreshInterval(), 0.0001);
		Assert.assertEquals(0.75d, groundoverlay.getIcon().getViewBoundScale(), 0.0001);

		Assert.assertEquals(37.83234d, groundoverlay.getLatLonBox().getNorth(), 0.0001d);
		Assert.assertEquals(37.832122d, groundoverlay.getLatLonBox().getSouth(), 0.0001d);
		Assert.assertEquals(-122.373033d, groundoverlay.getLatLonBox().getEast(), 0.0001d);
		Assert.assertEquals(-122.373724d, groundoverlay.getLatLonBox().getWest(), 0.0001d);
		Assert.assertEquals(45.0d, groundoverlay.getLatLonBox().getRotation(), 0.0001d);
	}

	public static void icon(final Icon icon) {
		Assert.assertEquals("...", icon.getHref());
		Assert.assertEquals(RefreshMode.ON_CHANGE, icon.getRefreshMode());
		Assert.assertEquals(4d, icon.getRefreshInterval(), 0.0001);
		Assert.assertEquals(ViewRefreshMode.NEVER, icon.getViewRefreshMode());
		Assert.assertEquals(4d, icon.getViewRefreshTime(), 0.0001);
		Assert.assertEquals(1d, icon.getViewBoundScale(), 0.0001);
		Assert.assertEquals("...", icon.getHttpQuery());
	}

	public static void iconStyle(final IconStyle iconstyle) {
		Assert.assertEquals("ffffffff", iconstyle.getColor());
		Assert.assertEquals(ColorMode.NORMAL, iconstyle.getColorMode());

		Assert.assertEquals(1d, iconstyle.getScale(), 0.0001);
		Assert.assertEquals(0, iconstyle.getHeading(), 0.0001);
		Assert.assertEquals("...", iconstyle.getIcon().getHref());

		Assert.assertEquals(0.5d, iconstyle.getHotSpot().getX(), 0.0001);
		Assert.assertEquals(0.5d, iconstyle.getHotSpot().getY(), 0.0001);
		Assert.assertEquals(Units.FRACTION, iconstyle.getHotSpot().getXunits());
		Assert.assertEquals(Units.FRACTION, iconstyle.getHotSpot().getYunits());
	}

	public static void iconStyleExample(final Kml kml) {
		final Style style = (Style) ((Document) kml.getFeature()).getStyleSelector().get(0);
		Assert.assertEquals("randomColorIcon", style.getId());
		Assert.assertEquals("ff00ff00", style.getIconStyle().getColor());
		Assert.assertEquals(ColorMode.RANDOM, style.getIconStyle().getColorMode());
		Assert.assertEquals(1.1d, style.getIconStyle().getScale(), 0.0001);
		Assert.assertEquals("http://maps.google.com/mapfiles/kml/pal3/icon21.png", style.getIconStyle().getIcon().getHref());

		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("IconStyle.kml", placemark.getName());
		Assert.assertEquals("#randomColorIcon", placemark.getStyleUrl());
		Assert.assertEquals(new Coordinate(-122.36868, 37.831145, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(0));
	}

	public static void kml(final Kml kml) {
		Assert.assertEquals("sky", kml.getHint());
	}

	public static void labelStyle(final LabelStyle labelstyle) {
		// <!-- inherited from ColorStyle -->
		Assert.assertEquals("ffffffff", labelstyle.getColor());
		Assert.assertEquals(ColorMode.NORMAL, labelstyle.getColorMode());

		// <!-- specific to LabelStyle -->
		Assert.assertEquals(1d, labelstyle.getScale(), 0.0001);
	}

	public static void labelStyleExample(final Kml kml) {
		final Style style = (Style) ((Document) kml.getFeature()).getStyleSelector().get(0);
		Assert.assertEquals("randomLabelColor", style.getId());
		Assert.assertEquals("ff0000cc", style.getLabelStyle().getColor());
		Assert.assertEquals(ColorMode.RANDOM, style.getLabelStyle().getColorMode());
		Assert.assertEquals(1.5d, style.getLabelStyle().getScale(), 0.0001);

		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("LabelStyle.kml", placemark.getName());
		Assert.assertEquals("#randomLabelColor", placemark.getStyleUrl());
		Assert.assertEquals(new Coordinate(-122.367375, 37.829192, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(0));
	}

	public static void linearRing(final LinearRing linearring) {
		Assert.assertEquals("ID", linearring.getId());

		// <!-- specific to LinearRing -->
		Assert.assertTrue(linearring.isExtrude());
		Assert.assertTrue(linearring.isTessellate());
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, linearring.getAltitudeMode());
		Assert.assertEquals(new Coordinate(0.0, 0.0, 0.0), linearring.getCoordinates().get(0));
	}

	public static void linearRingExample(final Kml kml) {
		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("LinearRing.kml", placemark.getName());
		Assert.assertEquals(new Coordinate("-122.365662,37.826988,0.0"), ((Polygon) placemark.getGeometry()).getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(0));
		Assert.assertEquals(new Coordinate("-122.365202,37.826302,0.0"), ((Polygon) placemark.getGeometry()).getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(1));
		Assert.assertEquals(new Coordinate("-122.364581,37.82655,0.0"), ((Polygon) placemark.getGeometry()).getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(2));
		Assert.assertEquals(new Coordinate("-122.365038,37.827237,0.0"), ((Polygon) placemark.getGeometry()).getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(3));
		Assert.assertEquals(new Coordinate("-122.365662,37.826988,0.0"), ((Polygon) placemark.getGeometry()).getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(4));
	}

	public static void lineString(final LineString linestring) {
		Assert.assertEquals("ID", linestring.getId());

		// <!-- specific to LineString -->
		Assert.assertFalse(linestring.isExtrude());
		Assert.assertFalse(linestring.isTessellate());
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, linestring.getAltitudeMode());
		Assert.assertEquals(new Coordinate(0.0, 0.0, 0.0), linestring.getCoordinates().get(0));
	}

	public static void lineStringExample(final Kml kml) {
		Assert.assertEquals("LineString.kml", kml.getFeature().getName());
		Assert.assertTrue(kml.getFeature().isOpen());

		final LookAt lookat = ((LookAt) kml.getFeature().getAbstractView());
		Assert.assertEquals(-122.36415, lookat.getLongitude(), 0.0001);
		Assert.assertEquals(37.824553, lookat.getLatitude(), 0.0001);
		Assert.assertEquals(50.0, lookat.getTilt(), 0.0001);
		Assert.assertEquals(150.0, lookat.getRange(), 0.0001);
		Assert.assertEquals(0.0, lookat.getHeading(), 0.0001);

		final Placemark p1 = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("unextruded", p1.getName());
		Assert.assertFalse(((LineString) p1.getGeometry()).isExtrude());
		Assert.assertTrue(((LineString) p1.getGeometry()).isTessellate());
		Assert.assertEquals(new Coordinate(-122.364383, 37.824664, 0.0), ((LineString) p1.getGeometry()).getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(-122.364152, 37.824322, 0.0), ((LineString) p1.getGeometry()).getCoordinates().get(1));

		final Placemark p2 = (Placemark) ((Document) kml.getFeature()).getFeature().get(1);
		Assert.assertEquals("extruded", p2.getName());
		Assert.assertTrue(((LineString) p2.getGeometry()).isExtrude());
		Assert.assertTrue(((LineString) p2.getGeometry()).isTessellate());
		Assert.assertEquals(new Coordinate(-122.364167, 37.824787, 50), ((LineString) p2.getGeometry()).getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(-122.363917, 37.824423, 50), ((LineString) p2.getGeometry()).getCoordinates().get(1));

	}

	public static void lineStyle(final LineStyle linestyle) {
		Assert.assertEquals("ID", linestyle.getId());

		// <!-- inherited from ColorStyle -->
		Assert.assertEquals("ffffffff", linestyle.getColor());
		Assert.assertEquals(ColorMode.NORMAL, linestyle.getColorMode());

		// <!-- specific to LineStyle -->
		Assert.assertEquals(1.0, linestyle.getWidth(), 0.0001);

	}

	public static void lineStyleExample(final Kml kml) {
		Assert.assertEquals("LineStyle.kml", kml.getFeature().getName());
		Assert.assertTrue(kml.getFeature().isOpen());

		final Style style = (Style) ((Document) kml.getFeature()).getStyleSelector().get(0);
		Assert.assertEquals("linestyleExample", style.getId());
		Assert.assertEquals("7f0000ff", style.getLineStyle().getColor());
		Assert.assertEquals(4.0d, style.getLineStyle().getWidth(), 0.0001);

		final Placemark p1 = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("LineStyle Example", p1.getName());
		Assert.assertEquals("#linestyleExample", p1.getStyleUrl());
		Assert.assertTrue(((LineString) p1.getGeometry()).isExtrude());
		Assert.assertTrue(((LineString) p1.getGeometry()).isTessellate());
		Assert.assertEquals(new Coordinate(-122.364383, 37.824664, 0.0), ((LineString) p1.getGeometry()).getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(-122.364152, 37.824322, 0.0), ((LineString) p1.getGeometry()).getCoordinates().get(1));
	}

	public static void link(final Link link) {
		Assert.assertEquals("ID", link.getId());
		Assert.assertEquals("...", link.getHref());
		Assert.assertEquals(RefreshMode.ON_CHANGE, link.getRefreshMode());
		Assert.assertEquals(4.0d, link.getRefreshInterval(), 0.0001);
		Assert.assertEquals(ViewRefreshMode.NEVER, link.getViewRefreshMode());
		Assert.assertEquals(4.0d, link.getViewRefreshTime(), 0.0001);
		Assert.assertEquals(1.0d, link.getViewBoundScale(), 0.0001);
		Assert.assertEquals("BBOX=bboxWest", link.getViewFormat());
		Assert.assertEquals("...", link.getHttpQuery());
	}

	public static void linkExample(final NetworkLink networklink) {
		Assert.assertEquals("NE US Radar", networklink.getName());
		Assert.assertTrue(networklink.isFlyToView());
		final Link link = networklink.getLink();
		Assert.assertEquals("http://www.example.com/geotiff/NE/MergedReflectivityQComposite.kml", link.getHref());
		Assert.assertEquals(RefreshMode.ON_INTERVAL, link.getRefreshMode());
		Assert.assertEquals(30.0d, link.getRefreshInterval(), 0.0001);
		Assert.assertEquals(ViewRefreshMode.ON_STOP, link.getViewRefreshMode());
		Assert.assertEquals(7.0d, link.getViewRefreshTime(), 0.0001);
		Assert.assertEquals("BBOX=bboxWest", link.getViewFormat());
	}

	public static void listStyle(final ListStyle liststyle) {
		Assert.assertEquals("ID", liststyle.getId());
		Assert.assertEquals(ListItemType.CHECK, liststyle.getListItemType());
		Assert.assertEquals("ffffffff", liststyle.getBgColor());
		Assert.assertEquals(ItemIconState.OPEN, liststyle.getItemIcon().get(0).getState().get(0));
		Assert.assertEquals("...", liststyle.getItemIcon().get(0).getHref());

	}

	public static void lookAt(final LookAt lookat) {
		Assert.assertEquals(0.0, lookat.getLongitude(), 0.0001);
		Assert.assertEquals(0.0, lookat.getLatitude(), 0.0001);
		Assert.assertEquals(0.0, lookat.getRange(), 0.0001);
		Assert.assertEquals(0.0, lookat.getTilt(), 0.0001);
		Assert.assertEquals(0.0, lookat.getHeading(), 0.0001);
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, lookat.getAltitudeMode());
	}

	public static void lookAtExample(final Kml kml) {
		Assert.assertEquals("LookAt.kml", kml.getFeature().getName());

		final LookAt lookat = ((LookAt) kml.getFeature().getAbstractView());
		// FIXME: <gx:TimeStamp>
		// FIXME: <when>1994</when>
		// FIXME: </gx:TimeStamp>

		Assert.assertEquals(-122.363, lookat.getLongitude(), 0.0001);
		Assert.assertEquals(37.81, lookat.getLatitude(), 0.0001);
		Assert.assertEquals(2000.0, lookat.getAltitude(), 0.0001);
		Assert.assertEquals(500.0, lookat.getRange(), 0.0001);
		Assert.assertEquals(45.0, lookat.getTilt(), 0.0001);
		Assert.assertEquals(0.0, lookat.getHeading(), 0.0001);
		Assert.assertEquals(AltitudeMode.RELATIVE_TO_GROUND, lookat.getAltitudeMode());

		final Placemark placemark = (Placemark) kml.getFeature();
		Assert.assertEquals(new Coordinate(-122.363, 37.82, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(0));
	}

	public static void model(final Model model) {
		Assert.assertEquals("ID", model.getId());
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, model.getAltitudeMode());

		Assert.assertEquals(0.0, model.getLocation().getLongitude(), 0.0001);
		Assert.assertEquals(0.0, model.getLocation().getLatitude(), 0.0001);
		Assert.assertEquals(0.0, model.getLocation().getAltitude(), 0.0001);

		Assert.assertEquals(0.0, model.getOrientation().getHeading(), 0.0001);
		Assert.assertEquals(0.0, model.getOrientation().getTilt(), 0.0001);
		Assert.assertEquals(0.0, model.getOrientation().getRoll(), 0.0001);

		Assert.assertEquals(1.0, model.getScale().getX(), 0.0001);
		Assert.assertEquals(1.0, model.getScale().getY(), 0.0001);
		Assert.assertEquals(1.0, model.getScale().getZ(), 0.0001);

		Assert.assertEquals("...", model.getLink().getHref());

		Assert.assertEquals("...", model.getResourceMap().getAlias().get(0).getTargetHref());
		Assert.assertEquals("...", model.getResourceMap().getAlias().get(0).getSourceHref());

	}

	public static void modelLocation(final Location location) {
		Assert.assertEquals(39.55375305703105, location.getLongitude(), 0.0001);
		Assert.assertEquals(-118.9813220168456, location.getLatitude(), 0.0001);
		Assert.assertEquals(1223.0, location.getAltitude(), 0.0001);

	}

	public static void modelOrientation(final Orientation orientation) {
		Assert.assertEquals(45.0, orientation.getHeading(), 0.0001);
		Assert.assertEquals(10.0, orientation.getTilt(), 0.0001);
		Assert.assertEquals(0.0, orientation.getRoll(), 0.0001);

	}

	public static void modelScale(final Scale scale) {
		Assert.assertEquals(2.5, scale.getX(), 0.0001);
		Assert.assertEquals(2.5, scale.getY(), 0.0001);
		Assert.assertEquals(3.5, scale.getZ(), 0.0001);

	}

	public static void modelResourceMap(final Alias alias) {
		Assert.assertEquals("../images/foo.jpg", alias.getTargetHref());
		Assert.assertEquals("c:\\mytextures\\foo.jpg", alias.getSourceHref());
	}

	public static void modelExample(final Model model) {
		Assert.assertEquals("khModel543", model.getId());
		Assert.assertEquals(AltitudeMode.RELATIVE_TO_GROUND, model.getAltitudeMode());

		Assert.assertEquals(39.55375305703105, model.getLocation().getLongitude(), 0.0001);
		Assert.assertEquals(-118.9813220168456, model.getLocation().getLatitude(), 0.0001);
		Assert.assertEquals(1223.0, model.getLocation().getAltitude(), 0.0001);

		Assert.assertEquals(45.0, model.getOrientation().getHeading(), 0.0001);
		Assert.assertEquals(10.0, model.getOrientation().getTilt(), 0.0001);
		Assert.assertEquals(0.0, model.getOrientation().getRoll(), 0.0001);

		Assert.assertEquals(1.0, model.getScale().getX(), 0.0001);
		Assert.assertEquals(1.0, model.getScale().getY(), 0.0001);
		Assert.assertEquals(1.0, model.getScale().getZ(), 0.0001);

		Assert.assertEquals("house.dae", model.getLink().getHref());
		// FIXME: TODO <refreshMode>once</refreshMode>
		Assert.assertEquals(RefreshMode.ON_CHANGE, model.getLink().getRefreshMode());

		Assert.assertEquals("../files/CU-Macky---Center-StairsnoCulling.jpg", model.getResourceMap().getAlias().get(0).getTargetHref());
		Assert.assertEquals("CU-Macky---Center-StairsnoCulling.jpg", model.getResourceMap().getAlias().get(0).getSourceHref());

		Assert.assertEquals("../files/CU-Macky-4sideturretnoCulling.jpg", model.getResourceMap().getAlias().get(1).getTargetHref());
		Assert.assertEquals("CU-Macky-4sideturretnoCulling.jpg", model.getResourceMap().getAlias().get(1).getSourceHref());

		Assert.assertEquals("../files/CU-Macky-Back-NorthnoCulling.jpg", model.getResourceMap().getAlias().get(2).getTargetHref());
		Assert.assertEquals("CU-Macky-Back-NorthnoCulling.jpg", model.getResourceMap().getAlias().get(2).getSourceHref());
	}

	public static void multiGeometry(final MultiGeometry multigeometry) {
		Assert.assertEquals("ID", multigeometry.getId());
	}

	public static void multiGeometryExample(final Placemark placemark) {
		Assert.assertEquals("SF Marina Harbor Master", placemark.getName());
		Assert.assertFalse(placemark.isVisibility());
		final List<Geometry> multigeometry = ((MultiGeometry) placemark.getGeometry()).getGeometry();
		Assert.assertEquals(new Coordinate(-122.4425587930444, 37.80666418607323, 0.0), ((LineString) multigeometry.get(0)).getCoordinates()
		    .get(0));
		Assert.assertEquals(new Coordinate(-122.4428379594768, 37.80663578323093, 0.0), ((LineString) multigeometry.get(0)).getCoordinates()
		    .get(1));
		Assert.assertEquals(new Coordinate(-122.4425509770566, 37.80662588061205, 0.0), ((LineString) multigeometry.get(1)).getCoordinates()
		    .get(0));
		Assert.assertEquals(new Coordinate(-122.4428340530617, 37.8065999493009, 0.0), ((LineString) multigeometry.get(1)).getCoordinates()
		    .get(1));
	}

	@SuppressWarnings("deprecation")
  public static void networkLink(final NetworkLink networklink) {
		Assert.assertEquals("ID", networklink.getId());
		// <!-- inherited from Feature element -->
		Assert.assertEquals("...", networklink.getName());
		Assert.assertTrue(networklink.isVisibility());
		Assert.assertFalse(networklink.isOpen());
		Assert.assertEquals("...", networklink.getAtomAuthor().getNameOrUriOrEmail().get(0));
		Assert.assertNotNull(networklink.getAtomLink());
		Assert.assertEquals("...", networklink.getAddress());
		Assert.assertNotNull(networklink.getXalAddressDetails());
		Assert.assertEquals("...", networklink.getPhoneNumber());
		Assert.assertEquals(2, networklink.getSnippet().getMaxLines());
		Assert.assertEquals("...", networklink.getSnippet().getValue());
		Assert.assertNotNull(networklink.getAbstractView());
		Assert.assertNotNull(networklink.getTimePrimitive());
		Assert.assertEquals("...", networklink.getStyleUrl());
		Assert.assertNotNull(networklink.getStyleSelector());
		Assert.assertNotNull(networklink.getRegion());
		Assert.assertNotNull(networklink.getMetadata());
		Assert.assertNotNull(networklink.getExtendedData());

		// <!-- specific to NetworkLink -->
		Assert.assertFalse(networklink.isRefreshVisibility());
		Assert.assertFalse(networklink.isFlyToView());
		Assert.assertEquals("...", networklink.getLink().getHref());
	}

	public static void networkLinkExample(final Document document) {
		Assert.assertTrue(document.isVisibility());
		final NetworkLink networklink = (NetworkLink) document.getFeature().get(0);
		Assert.assertEquals("NE US Radar", networklink.getName());
		Assert.assertTrue(networklink.isRefreshVisibility());
		Assert.assertTrue(networklink.isFlyToView());
		Assert.assertEquals("...", networklink.getLink().getHref());
	}

	@SuppressWarnings("deprecation")
	public static void networkLinkControl(final NetworkLinkControl networklinkcontrol) {
		Assert.assertEquals(0.0, networklinkcontrol.getMinRefreshPeriod(), 0.0001);
		Assert.assertEquals(-1.0, networklinkcontrol.getMaxSessionLength(), 0.0001);
		Assert.assertEquals("...", networklinkcontrol.getCookie());
		Assert.assertEquals("...", networklinkcontrol.getMessage());
		Assert.assertEquals("...", networklinkcontrol.getLinkName());
		Assert.assertEquals("...", networklinkcontrol.getLinkDescription());
		Assert.assertEquals(2, networklinkcontrol.getLinkSnippet().getMaxLines());
		Assert.assertEquals("...", networklinkcontrol.getLinkSnippet().getValue());
		Assert.assertEquals("...", networklinkcontrol.getExpires());
		Assert.assertNotNull(networklinkcontrol.getUpdate());
		Assert.assertNotNull(networklinkcontrol.getAbstractView());

	}

	public static void networkLinkControlExample(final Kml kml) {
		Assert.assertEquals("This is a pop-up message. You will only see this once", kml.getNetworkLinkControl().getMessage());
		Assert.assertEquals("cookie=sometext", kml.getNetworkLinkControl().getCookie());
		Assert.assertEquals("New KML features", kml.getNetworkLinkControl().getLinkName());
		Assert.assertEquals("<![CDATA[KML now has new features available!]]>", kml.getNetworkLinkControl().getLinkDescription());

	}

	public static void overlayIcon(final Icon icon) {
		Assert.assertEquals("icon.jpg", icon.getHref());
	}

	@SuppressWarnings("deprecation")
	public static void photoOverlay(final PhotoOverlay photooverlay) {
		// <!-- inherited from Feature element -->
		Assert.assertEquals("...", photooverlay.getName());
		Assert.assertTrue(photooverlay.isVisibility());
		Assert.assertFalse(photooverlay.isOpen());
		Assert.assertNotNull(photooverlay.getAtomAuthor());
		Assert.assertNotNull(photooverlay.getAtomLink());
		Assert.assertEquals("...", photooverlay.getAddress());
		Assert.assertNotNull(photooverlay.getXalAddressDetails());
		Assert.assertEquals("...", photooverlay.getPhoneNumber());
		Assert.assertEquals(2, photooverlay.getSnippet().getMaxLines());
		Assert.assertEquals("...", photooverlay.getSnippet().getValue());
		Assert.assertNotNull(photooverlay.getAbstractView());
		Assert.assertNotNull(photooverlay.getTimePrimitive());
		Assert.assertEquals("...", photooverlay.getStyleUrl());
		Assert.assertNotNull(photooverlay.getStyleSelector());
		Assert.assertNotNull(photooverlay.getRegion());
		Assert.assertNotNull(photooverlay.getMetadata());
		Assert.assertNotNull(photooverlay.getExtendedData());

		// <!-- inherited from Overlay element -->
		Assert.assertEquals("ffffffff", photooverlay.getColor());
		Assert.assertEquals(0, photooverlay.getDrawOrder());
		Assert.assertEquals("...", photooverlay.getIcon().getHref());

		// <!-- specific to PhotoOverlay -->
		Assert.assertEquals(0, photooverlay.getRotation(), 0.0001);
		Assert.assertEquals(0.0, photooverlay.getViewVolume().getLeftFov(), 0.0001);
		Assert.assertEquals(0.0, photooverlay.getViewVolume().getRightFov(), 0.0001);
		Assert.assertEquals(0.0, photooverlay.getViewVolume().getBottomFov(), 0.0001);
		Assert.assertEquals(0.0, photooverlay.getViewVolume().getTopFov(), 0.0001);
		Assert.assertEquals(0.0, photooverlay.getViewVolume().getNear(), 0.0001);

		Assert.assertEquals(0, photooverlay.getImagePyramid().getTileSize());
		Assert.assertEquals(0, photooverlay.getImagePyramid().getMaxWidth());
		Assert.assertEquals(0, photooverlay.getImagePyramid().getMaxHeight());
		Assert.assertEquals(GridOrigin.LOWER_LEFT, photooverlay.getImagePyramid().getGridOrigin());
		Assert.assertEquals(new Coordinate(0.0, 0.0, 0.0), photooverlay.getPoint().getCoordinates().get(0));
		Assert.assertEquals(Shape.RECTANGLE, photooverlay.getShape());
	}

	public static void photoOverlayExample(final PhotoOverlay photooverlay) {
		// <!-- inherited from Feature element -->
		Assert.assertEquals("A simple non-pyramidal photo", photooverlay.getName());
		Assert.assertEquals("High above the ocean", photooverlay.getDescription());

		// <!-- Overlay elements -->
		// <!-- A simple normal jpeg image -->
		Assert.assertEquals("small-photo.jpg", photooverlay.getIcon().getHref());

		// <!-- PhotoOverlay elements -->
		// <!-- default: <rotation> default is 0 -->
		Assert.assertEquals(0, photooverlay.getRotation(), 0.0001);
		Assert.assertEquals(1000.0, photooverlay.getViewVolume().getNear(), 0.0001);
		Assert.assertEquals(-60.0, photooverlay.getViewVolume().getLeftFov(), 0.0001);
		Assert.assertEquals(60.0, photooverlay.getViewVolume().getRightFov(), 0.0001);
		Assert.assertEquals(-45.0, photooverlay.getViewVolume().getBottomFov(), 0.0001);
		Assert.assertEquals(45.0, photooverlay.getViewVolume().getTopFov(), 0.0001);

		Assert.assertEquals(new Coordinate(1.0, 1.0, 0.0), photooverlay.getPoint().getCoordinates().get(0));
		// <!-- default: <shape> -->
		Assert.assertEquals(Shape.RECTANGLE, photooverlay.getShape());
	}

	@SuppressWarnings("deprecation")
	public static void placemark(final Placemark placemark) {
		// <!-- inherited from Feature element -->
		Assert.assertEquals("...", placemark.getName());
		Assert.assertTrue(placemark.isVisibility());
		Assert.assertFalse(placemark.isOpen());
		Assert.assertNotNull(placemark.getAtomAuthor());
		Assert.assertNotNull(placemark.getAtomLink());
		Assert.assertEquals("...", placemark.getAddress());
		Assert.assertNotNull(placemark.getXalAddressDetails());
		Assert.assertEquals("...", placemark.getPhoneNumber());
		Assert.assertEquals(2, placemark.getSnippet().getMaxLines());
		Assert.assertEquals("...", placemark.getSnippet().getValue());
		Assert.assertNotNull(placemark.getAbstractView());
		Assert.assertNotNull(placemark.getTimePrimitive());
		Assert.assertEquals("...", placemark.getStyleUrl());
		Assert.assertNotNull(placemark.getStyleSelector());
		Assert.assertNotNull(placemark.getRegion());
		Assert.assertNotNull(placemark.getMetadata());
		Assert.assertNotNull(placemark.getExtendedData());

		// <!-- specific to Placemark element -->
		Assert.assertNotNull(placemark.getGeometry());
	}

	public static void placemarkExample(final Placemark placemark) {
		Assert.assertEquals("Google Earth - New Placemark", placemark.getName());
		Assert.assertEquals("Some Descriptive text.", placemark.getDescription());

		final LookAt lookat = (LookAt) placemark.getAbstractView();
		Assert.assertEquals(-90.86879847669974, lookat.getLongitude(), 0.0001);
		Assert.assertEquals(48.25330383601299, lookat.getLatitude(), 0.0001);
		Assert.assertEquals(440.8, lookat.getRange(), 0.0001);
		Assert.assertEquals(8.3, lookat.getTilt(), 0.0001);
		Assert.assertEquals(2.7, lookat.getHeading(), 0.0001);

		Assert.assertEquals(new Coordinate(-90.86948943473118, 48.25450093195546, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(
		    0));
	}

	public static void point(final Point point) {
		Assert.assertEquals("ID", point.getId());

		// <!-- specific to Point -->
		Assert.assertFalse(point.isExtrude());
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, point.getAltitudeMode());

		Assert.assertEquals(new Coordinate(0.0, 0.0, 0.0), point.getCoordinates().get(0));
	}

	public static void pointExample(final Point point) {
		Assert.assertEquals(new Coordinate(-90.86948943473118, 48.25450093195546), point.getCoordinates().get(0));
	}

	public static void polygon(final Polygon polygon) {
		Assert.assertEquals("ID", polygon.getId());

		// <!-- specific to Polygon -->
		Assert.assertFalse(polygon.isExtrude());
		Assert.assertFalse(polygon.isTessellate());
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, polygon.getAltitudeMode());

		Assert.assertEquals(new Coordinate(0.0, 0.0, 0.0), polygon.getOuterBoundaryIs().getLinearRing().getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(0.0, 0.0, 0.0), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates().get(0));

	}

	public static void polygonExample(final Kml kml) {
		Assert.assertEquals("Polygon.kml", kml.getFeature().getName());
		Assert.assertFalse(kml.getFeature().isOpen());

		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("hollow box", placemark.getName());
		final Polygon polygon = (Polygon) placemark.getGeometry();
		Assert.assertTrue(polygon.isExtrude());
		Assert.assertEquals(AltitudeMode.RELATIVE_TO_GROUND, polygon.getAltitudeMode());

		Assert.assertEquals(new Coordinate(-122.366278, 37.818844, 30.0), polygon.getOuterBoundaryIs().getLinearRing().getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(-122.365248, 37.819267, 30.0), polygon.getOuterBoundaryIs().getLinearRing().getCoordinates().get(1));
		Assert.assertEquals(new Coordinate(-122.365640, 37.819861, 30.0), polygon.getOuterBoundaryIs().getLinearRing().getCoordinates().get(2));
		Assert.assertEquals(new Coordinate(-122.366669, 37.819429, 30.0), polygon.getOuterBoundaryIs().getLinearRing().getCoordinates().get(3));
		Assert.assertEquals(new Coordinate(-122.366278, 37.818844, 30.0), polygon.getOuterBoundaryIs().getLinearRing().getCoordinates().get(4));

		Assert.assertEquals(new Coordinate(-122.366212, 37.818977, 30.0), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(0));
		Assert.assertEquals(new Coordinate(-122.365424, 37.819294, 30.0), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(1));
		Assert.assertEquals(new Coordinate(-122.365704, 37.819731, 30.0), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(2));
		Assert.assertEquals(new Coordinate(-122.366488, 37.819402, 30.0), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(3));
		Assert.assertEquals(new Coordinate(-122.366212, 37.818977, 30.0), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(4));

	}

	public static void polyStyle(final PolyStyle polystyle) {
		Assert.assertEquals("ID", polystyle.getId());

		// <!-- inherited from ColorStyle -->
		Assert.assertEquals("ffffffff", polystyle.getColor());
		Assert.assertEquals(ColorMode.NORMAL, polystyle.getColorMode());

		// <!-- specific to PolyStyle -->
		Assert.assertTrue(polystyle.isFill());
		Assert.assertTrue(polystyle.isOutline());
	}

	public static void polyStyleExample(final Kml kml) {
		Assert.assertEquals("PolygonStyle.kml", kml.getFeature().getName());
		Assert.assertTrue(kml.getFeature().isOpen());

		final Style style = ((Style) kml.getFeature().getStyleSelector().get(0));
		Assert.assertEquals("examplePolyStyle", style.getId());
		Assert.assertEquals("ff0000cc", style.getPolyStyle().getColor());
		Assert.assertEquals(ColorMode.RANDOM, style.getPolyStyle().getColorMode());

		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("hollow box", placemark.getName());
		Assert.assertEquals("#examplePolyStyle", placemark.getStyleUrl());

		final Polygon polygon = (Polygon) placemark.getGeometry();
		Assert.assertTrue(polygon.isExtrude());
		Assert.assertEquals(AltitudeMode.RELATIVE_TO_GROUND, polygon.getAltitudeMode());

		Assert.assertEquals(new Coordinate(-122.3662784465226, 37.81884427772081, 30.0), polygon.getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(0));
		Assert.assertEquals(new Coordinate(-122.3652480684771, 37.81926777010555, 30.0), polygon.getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(1));
		Assert.assertEquals(new Coordinate(-122.365640222455, 37.81986126286519, 30.0), polygon.getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(2));
		Assert.assertEquals(new Coordinate(-122.36666937925, 37.81942987753481, 30.0), polygon.getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(3));
		Assert.assertEquals(new Coordinate(-122.3662784465226, 37.81884427772081, 30.0), polygon.getOuterBoundaryIs().getLinearRing()
		    .getCoordinates().get(4));

		Assert.assertEquals(new Coordinate("-122.366212593918,37.81897719083808,30.0"), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(0));
		Assert.assertEquals(new Coordinate("-122.3654241733188,37.81929450992014,30.0"), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(1));
		Assert.assertEquals(new Coordinate("-122.3657048517827,37.81973175302663,30.0"), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(2));
		Assert.assertEquals(new Coordinate("-122.3664882465854,37.81940249291773,30.0"), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(3));
		Assert.assertEquals(new Coordinate("-122.366212593918,37.81897719083808,30.0"), polygon.getInnerBoundaryIs().get(0).getLinearRing().getCoordinates()
		    .get(4));
	}

	public static void region(final Region region) {
		Assert.assertEquals("ID", region.getId());

		Assert.assertEquals(0.0, region.getLatLonAltBox().getNorth(), 0.0001);
		Assert.assertEquals(0.0, region.getLatLonAltBox().getSouth(), 0.0001);
		Assert.assertEquals(0.0, region.getLatLonAltBox().getEast(), 0.0001);
		Assert.assertEquals(0.0, region.getLatLonAltBox().getWest(), 0.0001);
		Assert.assertEquals(0.0, region.getLatLonAltBox().getMinAltitude(), 0.0001);
		Assert.assertEquals(0.0, region.getLatLonAltBox().getMaxAltitude(), 0.0001);
		Assert.assertEquals(AltitudeMode.CLAMP_TO_GROUND, region.getLatLonAltBox().getAltitudeMode());

		Assert.assertEquals(0.0, region.getLod().getMinLodPixels(), 0.0001);
		Assert.assertEquals(-1.0, region.getLod().getMaxLodPixels(), 0.0001);
		Assert.assertEquals(0.0, region.getLod().getMinFadeExtent(), 0.0001);
		Assert.assertEquals(0.0, region.getLod().getMaxFadeExtent(), 0.0001);

	}

	public static void regionLatLonAltBox(final LatLonAltBox latlonAltBox) {
		Assert.assertEquals(43.374, latlonAltBox.getNorth(), 0.0001);
		Assert.assertEquals(42.983, latlonAltBox.getSouth(), 0.0001);
		Assert.assertEquals(-0.335, latlonAltBox.getEast(), 0.0001);
		Assert.assertEquals(-1.423, latlonAltBox.getWest(), 0.0001);
		Assert.assertEquals(0.0, latlonAltBox.getMinAltitude(), 0.0001);
		Assert.assertEquals(0.0, latlonAltBox.getMaxAltitude(), 0.0001);
	}

	public static void regionLod(final Lod lod) {
		Assert.assertEquals(256.0, lod.getMinLodPixels(), 0.0001);
		Assert.assertEquals(-1.0, lod.getMaxLodPixels(), 0.0001);
		Assert.assertEquals(0.0, lod.getMinFadeExtent(), 0.0001);
		Assert.assertEquals(0.0, lod.getMaxFadeExtent(), 0.0001);

	}

	public static void regionExample(final Region region) {
		Assert.assertEquals(50.625, region.getLatLonAltBox().getNorth(), 0.0001);
		Assert.assertEquals(45.0, region.getLatLonAltBox().getSouth(), 0.0001);
		Assert.assertEquals(28.125, region.getLatLonAltBox().getEast(), 0.0001);
		Assert.assertEquals(22.5, region.getLatLonAltBox().getWest(), 0.0001);
		Assert.assertEquals(10.0, region.getLatLonAltBox().getMinAltitude(), 0.0001);
		Assert.assertEquals(50.0, region.getLatLonAltBox().getMaxAltitude(), 0.0001);

		Assert.assertEquals(128.0, region.getLod().getMinLodPixels(), 0.0001);
		Assert.assertEquals(1024.0, region.getLod().getMaxLodPixels(), 0.0001);
		Assert.assertEquals(128.0, region.getLod().getMinFadeExtent(), 0.0001);
		Assert.assertEquals(128.0, region.getLod().getMaxFadeExtent(), 0.0001);
	}

	public static void schema(final Schema schema) {
		Assert.assertEquals("ID", schema.getId());
		Assert.assertEquals("string", schema.getName());
		Assert.assertEquals("string", schema.getSimpleField().get(0).getType());
		Assert.assertEquals("string", schema.getSimpleField().get(0).getName());
		Assert.assertEquals("...", schema.getSimpleField().get(0).getDisplayName());
	}

	public static void schemaExample(final Kml kml) {
		final Schema schema = ((Document) kml.getFeature()).getSchema().get(0);
		Assert.assertEquals("TrailHeadTypeId", schema.getId());
		Assert.assertEquals("TrailHeadType", schema.getName());

		Assert.assertEquals("string", schema.getSimpleField().get(0).getType());
		Assert.assertEquals("TrailHeadName", schema.getSimpleField().get(0).getName());
		Assert.assertEquals("<![CDATA[<b>Trail Head Name</b>]]>", schema.getSimpleField().get(0).getDisplayName());

		Assert.assertEquals("double", schema.getSimpleField().get(1).getType());
		Assert.assertEquals("TrailLength", schema.getSimpleField().get(1).getName());
		Assert.assertEquals("<![CDATA[<i>The length in miles</i>]]>", schema.getSimpleField().get(1).getDisplayName());

		Assert.assertEquals("int", schema.getSimpleField().get(2).getType());
		Assert.assertEquals("ElevationGain", schema.getSimpleField().get(2).getName());
		Assert.assertEquals("<![CDATA[<i>change in altitude</i>]]>", schema.getSimpleField().get(2).getDisplayName());

	}

	@SuppressWarnings("deprecation")
	public static void screenOverlay(final ScreenOverlay screenoverlay) {
		// <!-- inherited from Feature element -->
		Assert.assertEquals("...", screenoverlay.getName());
		Assert.assertTrue(screenoverlay.isVisibility());
		Assert.assertFalse(screenoverlay.isOpen());
		Assert.assertNotNull(screenoverlay.getAtomAuthor());
		Assert.assertNotNull(screenoverlay.getAtomLink());
		Assert.assertEquals("...", screenoverlay.getAddress());
		Assert.assertNotNull(screenoverlay.getXalAddressDetails());
		Assert.assertEquals("...", screenoverlay.getPhoneNumber());
		Assert.assertEquals(2, screenoverlay.getSnippet().getMaxLines());
		Assert.assertEquals("...", screenoverlay.getSnippet().getValue());
		Assert.assertNotNull(screenoverlay.getAbstractView());
		Assert.assertNotNull(screenoverlay.getTimePrimitive());
		Assert.assertEquals("...", screenoverlay.getStyleUrl());
		Assert.assertNotNull(screenoverlay.getStyleSelector());
		Assert.assertNotNull(screenoverlay.getRegion());
		Assert.assertNotNull(screenoverlay.getMetadata());
		Assert.assertNotNull(screenoverlay.getExtendedData());

		// <!-- inherited from Overlay element -->
		Assert.assertEquals("ffffffff", screenoverlay.getColor());
		Assert.assertEquals(0, screenoverlay.getDrawOrder());
		Assert.assertEquals("...", screenoverlay.getIcon().getHref());

		// <!-- specific to ScreenOverlay -->
		Assert.assertEquals(0.5, screenoverlay.getOverlayXY().getX(), 0.0001);
		Assert.assertEquals(0.5, screenoverlay.getOverlayXY().getY(), 0.0001);
		Assert.assertEquals(Units.FRACTION, screenoverlay.getOverlayXY().getXunits());
		Assert.assertEquals(Units.FRACTION, screenoverlay.getOverlayXY().getYunits());

		Assert.assertEquals(0.5, screenoverlay.getScreenXY().getX(), 0.0001);
		Assert.assertEquals(0.5, screenoverlay.getScreenXY().getY(), 0.0001);
		Assert.assertEquals(Units.FRACTION, screenoverlay.getScreenXY().getXunits());
		Assert.assertEquals(Units.FRACTION, screenoverlay.getScreenXY().getYunits());

		Assert.assertEquals(0.5, screenoverlay.getSize().getX(), 0.0001);
		Assert.assertEquals(0.5, screenoverlay.getSize().getY(), 0.0001);
		Assert.assertEquals(Units.FRACTION, screenoverlay.getSize().getXunits());
		Assert.assertEquals(Units.FRACTION, screenoverlay.getSize().getYunits());

		Assert.assertEquals(0, screenoverlay.getRotation(), 0.0001);

	}

	public static void screenOverlayExample(final ScreenOverlay screenoverlay) {
		Assert.assertEquals("khScreenOverlay756", screenoverlay.getId());
		Assert.assertEquals("Simple crosshairs", screenoverlay.getName());
		Assert.assertEquals("This screen overlay uses fractional positioning to put the image in the exact center of the screen", screenoverlay
		    .getDescription());

		Assert.assertEquals("http://myserver/myimage.jpg", screenoverlay.getIcon().getHref());

		// <!-- specific to ScreenOverlay -->
		Assert.assertEquals(0.5, screenoverlay.getOverlayXY().getX(), 0.0001);
		Assert.assertEquals(0.5, screenoverlay.getOverlayXY().getY(), 0.0001);
		Assert.assertEquals(Units.FRACTION, screenoverlay.getOverlayXY().getXunits());
		Assert.assertEquals(Units.FRACTION, screenoverlay.getOverlayXY().getYunits());

		Assert.assertEquals(0.5, screenoverlay.getScreenXY().getX(), 0.0001);
		Assert.assertEquals(0.5, screenoverlay.getScreenXY().getY(), 0.0001);
		Assert.assertEquals(Units.FRACTION, screenoverlay.getScreenXY().getXunits());
		Assert.assertEquals(Units.FRACTION, screenoverlay.getScreenXY().getYunits());

		Assert.assertEquals(39.37878630116985, screenoverlay.getRotation(), 0.0001);

		Assert.assertEquals(0, screenoverlay.getSize().getX(), 0.0001);
		Assert.assertEquals(0, screenoverlay.getSize().getY(), 0.0001);
		Assert.assertEquals(Units.PIXELS, screenoverlay.getSize().getXunits());
		Assert.assertEquals(Units.PIXELS, screenoverlay.getSize().getYunits());
	}

	public static void style(final Style style) {
		Assert.assertEquals("ID", style.getId());

		// <!-- specific to Style -->
		Assert.assertNotNull(style.getIconStyle());
		Assert.assertNotNull(style.getLabelStyle());
		Assert.assertNotNull(style.getLineStyle());
		Assert.assertNotNull(style.getPolyStyle());
		Assert.assertNotNull(style.getBalloonStyle());
		Assert.assertNotNull(style.getListStyle());
	}

	public static void styleExample(final Kml kml) {
		final Style style = ((Style) kml.getFeature().getStyleSelector().get(0));
		Assert.assertEquals("myDefaultStyles", style.getId());

		Assert.assertEquals("a1ff00ff", style.getIconStyle().getColor());
		Assert.assertEquals(1.399999976158142, style.getIconStyle().getScale(), 0.0001);
		Assert.assertEquals("http://myserver.com/icon.jpg", style.getIconStyle().getIcon().getHref());

		Assert.assertEquals("7fffaaff", style.getLabelStyle().getColor());
		Assert.assertEquals(1.5, style.getLabelStyle().getScale(), 0.0001);

		Assert.assertEquals("ff0000ff", style.getLineStyle().getColor());
		Assert.assertEquals(15.0, style.getLineStyle().getWidth(), 0.0001);

		Assert.assertEquals("7f7faaaa", style.getPolyStyle().getColor());
		Assert.assertEquals(ColorMode.RANDOM, style.getPolyStyle().getColorMode());

		final Placemark p1 = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("Google Earth - New Polygon", p1.getName());
		Assert.assertEquals("Here is some descriptive text", p1.getDescription());
		Assert.assertEquals("#myDefaultStyles", p1.getStyleUrl());

		final Placemark p2 = (Placemark) ((Document) kml.getFeature()).getFeature().get(1);
		Assert.assertEquals("Google Earth - New Path", p2.getName());
		Assert.assertEquals("#myDefaultStyles", p2.getStyleUrl());

	}

	public static void styleMap(final StyleMap stylemap) {
		Assert.assertEquals("ID", stylemap.getId());

		// <!-- extends StyleSelector -->
		// <!-- elements specific to StyleMap -->
		Assert.assertEquals("ID", stylemap.getPair().get(0).getId());
		Assert.assertEquals(StyleState.NORMAL, stylemap.getPair().get(0).getKey());
		Assert.assertEquals("...", stylemap.getPair().get(0).getStyleUrl());

	}

	public static void styleMapPair(final Pair pair) {
		Assert.assertEquals(StyleState.NORMAL, pair.getKey());
		Assert.assertEquals("http://myserver.com/populationProject.xml#example_style_off", pair.getStyleUrl());
	}

	public static void styleMapExample(final Kml kml) {
		Assert.assertEquals("StyleMap.kml", kml.getFeature().getName());
		Assert.assertTrue(kml.getFeature().isOpen());

		final Style style1 = ((Style) kml.getFeature().getStyleSelector().get(0));
		Assert.assertEquals("normalState", style1.getId());
		Assert.assertEquals(1.0, style1.getIconStyle().getScale(), 0.0001);
		Assert.assertEquals("http://maps.google.com/mapfiles/kml/pal3/icon55.png", style1.getIconStyle().getIcon().getHref());
		Assert.assertEquals(1.0, style1.getLabelStyle().getScale(), 0.0001);

		final Style style2 = ((Style) kml.getFeature().getStyleSelector().get(1));
		Assert.assertEquals("highlightState", style2.getId());
		Assert.assertEquals(1.1, style2.getIconStyle().getScale(), 0.0001);
		Assert.assertEquals("http://maps.google.com/mapfiles/kml/pal3/icon60.png", style2.getIconStyle().getIcon().getHref());
		Assert.assertEquals(1.1, style2.getLabelStyle().getScale(), 0.0001);
		Assert.assertEquals("ff0000c0", style2.getLabelStyle().getColor());

		final StyleMap stylemap = (StyleMap) kml.getFeature().getStyleSelector().get(2);
		Assert.assertEquals("styleMapExample", stylemap.getId());
		Assert.assertEquals(StyleState.NORMAL, stylemap.getPair().get(0).getKey());
		Assert.assertEquals("#normalState", stylemap.getPair().get(0).getStyleUrl());
		Assert.assertEquals(StyleState.HIGHLIGHT, stylemap.getPair().get(1).getKey());
		Assert.assertEquals("#highlightState", stylemap.getPair().get(1).getStyleUrl());

		final Placemark placemark = (Placemark) ((Document) kml.getFeature()).getFeature().get(0);
		Assert.assertEquals("StyleMap example", placemark.getName());
		Assert.assertEquals("#styleMapExample", placemark.getStyleUrl());
		Assert.assertEquals(new Coordinate(-122.368987, 37.817634, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(0));

	}

	public static void timeSpan(final TimeSpan timespan) {
		Assert.assertEquals("...", timespan.getBegin());
		Assert.assertEquals("...", timespan.getEnd());

	}

	public static void timeStamp(final TimeStamp timestamp) {
		Assert.assertEquals("...", timestamp.getWhen());
	}

	public static void updateChange(final NetworkLinkControl networklink) {
		final Update update = networklink.getUpdate();
		Assert.assertEquals("http://www/~sam/January14Data/Point.kml", update.getTargetHref());

		final Change change = (Change) update.getCreateOrDeleteOrChange().get(0);
		final Point point = (Point) change.getAbstractObject().get(0);
		Assert.assertEquals("point123", point.getTargetId());
		Assert.assertEquals(new Coordinate(-95.48, 40.43, 0.0), point.getCoordinates().get(0));

	}

	public static void updateCreate(final Update update) {
		Assert.assertEquals("http://myserver.com/Point.kml", update.getTargetHref());

		final Create create = (Create) update.getCreateOrDeleteOrChange().get(0);
		final Document document = (Document) create.getContainer().get(0);
		Assert.assertEquals("region24", document.getTargetId());
		final Placemark placemark = (Placemark) document.getFeature().get(0);
		Assert.assertEquals("placemark891", placemark.getId());
		Assert.assertEquals(new Coordinate(-95.48, 40.43, 0.0), ((Point) placemark.getGeometry()).getCoordinates().get(0));
	}

	public static void updateDelete(final Update update) {
		Assert.assertEquals("http://www.foo.com/Point.kml", update.getTargetHref());

		final Delete delete = (Delete) update.getCreateOrDeleteOrChange().get(0);
		final Placemark placemark = (Placemark) delete.getFeature().get(0);
		Assert.assertEquals("pa3556", placemark.getTargetId());
	}



}
