// ///////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project JavaAPIforKML
//
// Author Flori (f.bachmann@micromata.de)
// Created Jun 28, 2009
// Copyright Micromata Jun 28, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
// ///////////////////////////////////////////////////////////////////////////
package de.micromata.jak;

import java.lang.reflect.Field;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Test;

import de.micromata.jak.internal.IAtsConformanceLevel1;
import de.micromata.opengis.kml.v_2_2_0.AbstractLatLonBox;
import de.micromata.opengis.kml.v_2_2_0.AbstractView;
import de.micromata.opengis.kml.v_2_2_0.Alias;
import de.micromata.opengis.kml.v_2_2_0.BasicLink;
import de.micromata.opengis.kml.v_2_2_0.Boundary;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Data;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Feature;
import de.micromata.opengis.kml.v_2_2_0.Geometry;
import de.micromata.opengis.kml.v_2_2_0.Icon;
import de.micromata.opengis.kml.v_2_2_0.ImagePyramid;
import de.micromata.opengis.kml.v_2_2_0.ItemIcon;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LinearRing;
import de.micromata.opengis.kml.v_2_2_0.Link;
import de.micromata.opengis.kml.v_2_2_0.Location;
import de.micromata.opengis.kml.v_2_2_0.Lod;
import de.micromata.opengis.kml.v_2_2_0.Model;
import de.micromata.opengis.kml.v_2_2_0.NetworkLinkControl;
import de.micromata.opengis.kml.v_2_2_0.Orientation;
import de.micromata.opengis.kml.v_2_2_0.Pair;
import de.micromata.opengis.kml.v_2_2_0.PhotoOverlay;
import de.micromata.opengis.kml.v_2_2_0.Point;
import de.micromata.opengis.kml.v_2_2_0.Polygon;
import de.micromata.opengis.kml.v_2_2_0.Region;
import de.micromata.opengis.kml.v_2_2_0.ResourceMap;
import de.micromata.opengis.kml.v_2_2_0.Scale;
import de.micromata.opengis.kml.v_2_2_0.Schema;
import de.micromata.opengis.kml.v_2_2_0.SchemaData;
import de.micromata.opengis.kml.v_2_2_0.SimpleField;
import de.micromata.opengis.kml.v_2_2_0.Style;
import de.micromata.opengis.kml.v_2_2_0.StyleMap;
import de.micromata.opengis.kml.v_2_2_0.StyleSelector;
import de.micromata.opengis.kml.v_2_2_0.SubStyle;
import de.micromata.opengis.kml.v_2_2_0.TimePrimitive;
import de.micromata.opengis.kml.v_2_2_0.TimeSpan;
import de.micromata.opengis.kml.v_2_2_0.TimeStamp;
import de.micromata.opengis.kml.v_2_2_0.Update;
import de.micromata.opengis.kml.v_2_2_0.ViewVolume;
import de.micromata.opengis.kml.v_2_2_0.gx.LatLonQuad;
import de.micromata.opengis.kml.v_2_2_0.gx.Playlist;
import de.micromata.opengis.kml.v_2_2_0.gx.TourPrimitive;

/**
 * @author Flori (f.bachmann@micromata.de)
 * 
 */
public class AtsConformanceLevel1Test implements IAtsConformanceLevel1 {
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(KmlReferencePojoTest.class.getName());

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc01RootElement()
	 */
	@Test
	public void atc01RootElement() {
		final XmlRootElement annotation = Kml.class.getAnnotation(XmlRootElement.class);

		Assert.assertEquals("kml", annotation.name());
		Assert.assertEquals("http://www.opengis.net/kml/2.2", annotation.namespace());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc02XMLSchemaconstraints()
	 */
	@Test
	public void atc02XMLSchemaconstraints() {
		// TODO: Check that the document is well-formed and schema-valid.

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc03GeometryCoordinates()
	 */
	@Test
	public void atc03GeometryCoordinates() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc04TimeSpan()
	 */
	@Test
	public void atc04TimeSpan() {
		Assert.assertNotNull(Utils.findField(TimeSpan.class, "begin"));
		Assert.assertNotNull(Utils.findField(TimeSpan.class, "end"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc05TimeStamp()
	 */
	@Test
	public void atc05TimeStamp() {
		Assert.assertNotNull(Utils.findField(TimeStamp.class, "when"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc06StyleReference()
	 */
	@Test
	public void atc06StyleReference() {
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc07SharedStyleDefintion()
	 */
	@Test
	public void atc07SharedStyleDefintion() {
		Assert.assertNull(Utils.findClass(Document.class, "styleSelector"));

		Assert.assertNotNull(Utils.findField(StyleSelector.class, "id"));
		Assert.assertNotNull(Utils.findField(Style.class, "id"));
		Assert.assertNotNull(Utils.findField(StyleMap.class, "id"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc08RegionLatLonAltBox()
	 */
	@Test
	public void atc08RegionLatLonAltBox() {
		// kml:north > kml:south;
		// kml:east > kml:west;
		// kml:minAltitude <= kml:maxAltitude;
		// if kml:minAltitude and kml:maxAltitude are both present, then kml:altitudeMode does not have the value "clampToGround".
		// By testing north > south and east > west, we are testing for a non-zero area.
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc09LinkElements()
	 */
	@Test
	public void atc09LinkElements() {
		// Check that a link element (of type kml:LinkType) satisfies all of the following constraints:
		// if present, the child kml:refreshInterval element has a positive value (> 0);
		// if present, the child kml:viewRefreshTime element has a positive value (> 0);
		// if present, the child kml:viewBoundScale element has a positive value (> 0).

		Assert.assertNotNull(Utils.findField(Link.class, "refreshInterval"));
		Assert.assertNotNull(Utils.findField(Link.class, "viewRefreshTime"));
		Assert.assertNotNull(Utils.findField(Link.class, "viewBoundScale"));

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc10LinkReferent()
	 */
	@Test
	public void atc10LinkReferent() {
		// Confirm that a link element refers to the correct resource type, according to one of the following cases:
		// if the parent element is kml:NetworkLink - a KML or KMZ resource;
		// if the parent element is kml:Model - a textured 3D object resource;
		// if the parent element is kml:GroundOverlay, kml:ScreenOverlay, or kml:PhotoOverlay - an image resource (see Icon - href).

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc11LatLonBox()
	 */
	@Test
	public void atc11LatLonBox() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc12GeometryExtrude()
	 */
	@Test
	public void atc12GeometryExtrude() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc13GeometryTessellate()
	 */
	@Test
	public void atc13GeometryTessellate() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc14Point()
	 */
	@Test
	public void atc14Point() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc15LineString()
	 */
	@Test
	public void atc15LineString() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc16LinearRingControlPoints()
	 */
	@Test
	public void atc16LinearRingControlPoints() {
		// Check that the kml:coordinates element in a kml:LinearRing geometry contains at least 4 coordinate tuples,
		// where the first and last are identical (i.e. they constitute a closed figure).
		final LinearRing linearring = new LinearRing();
		List<Coordinate> coord = linearring.createAndSetCoordinates();
		coord.add(new Coordinate(-122.365662, 37.826988, 0));
		coord.add(new Coordinate(-122.365202, 37.826302, 0));
		coord.add(new Coordinate(-122.364581, 37.82655, 0));
		coord.add(new Coordinate(-122.365038, 37.827237, 0));
		coord.add(new Coordinate(-122.365662, 37.826988, 0));

		Assert.assertEquals(coord.get(0), coord.get(coord.size() - 1));

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc17PolygonBoundary()
	 */
	@Test
	public void atc17PolygonBoundary() {
		Assert.assertNull(Utils.findClass(Boundary.class, "Update"));

		Assert.assertNotNull(Utils.findField(Polygon.class, "outerBoundaryIs"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc18IconHref()
	 */
	@Test
	public void atc18IconHref() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc19ViewVolumeMinimalContent()
	 */
	@Test
	public void atc19ViewVolumeMinimalContent() {
		Assert.assertNotNull(Utils.findField(ViewVolume.class, "leftFov"));
		Assert.assertNotNull(Utils.findField(ViewVolume.class, "rightFov"));
		Assert.assertNotNull(Utils.findField(ViewVolume.class, "bottomFov"));
		Assert.assertNotNull(Utils.findField(ViewVolume.class, "topFov"));
		Assert.assertNotNull(Utils.findField(ViewVolume.class, "near"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc20NetworkLinkControlMinRefreshPeriod()
	 */
	@Test
	public void atc20NetworkLinkControlMinRefreshPeriod() {
		Assert.assertNotNull(Utils.findField(NetworkLinkControl.class, "minRefreshPeriod"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc21EmptyObject()
	 */
	@Test
	public void atc21EmptyObject() {
		Assert.assertNull(Utils.findClass(Playlist.class, "id"));
		Assert.assertNull(Utils.findClass(LatLonQuad.class, "id"));
		Assert.assertNull(Utils.findClass(TourPrimitive.class, "id"));
		Assert.assertNull(Utils.findClass(Region.class, "id"));
		Assert.assertNull(Utils.findClass(TimePrimitive.class, "id"));
		Assert.assertNull(Utils.findClass(ItemIcon.class, "id"));
		Assert.assertNull(Utils.findClass(Scale.class, "id"));
		Assert.assertNull(Utils.findClass(Pair.class, "id"));
		Assert.assertNull(Utils.findClass(ViewVolume.class, "id"));
		Assert.assertNull(Utils.findClass(Alias.class, "id"));
		Assert.assertNull(Utils.findClass(Location.class, "id"));
		Assert.assertNull(Utils.findClass(Lod.class, "id"));
		Assert.assertNull(Utils.findClass(ResourceMap.class, "id"));
		Assert.assertNull(Utils.findClass(ImagePyramid.class, "id"));
		Assert.assertNull(Utils.findClass(SchemaData.class, "id"));
		Assert.assertNull(Utils.findClass(Orientation.class, "id"));
		Assert.assertNull(Utils.findClass(Feature.class, "id"));
		Assert.assertNull(Utils.findClass(StyleSelector.class, "id"));
		Assert.assertNull(Utils.findClass(AbstractView.class, "id"));
		Assert.assertNull(Utils.findClass(SubStyle.class, "id"));
		Assert.assertNull(Utils.findClass(Data.class, "id"));
		Assert.assertNull(Utils.findClass(Geometry.class, "id"));
		Assert.assertNull(Utils.findClass(AbstractLatLonBox.class, "id"));
		Assert.assertNull(Utils.findClass(BasicLink.class, "id"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc22UpdateTargetHref()
	 */
	@Test
	public void atc22UpdateTargetHref() {
		Assert.assertNull(Utils.findClass(Update.class, "targetHref"));
		
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc23IdentificationOfUpdateTarget()
	 */
	@Test
	public void atc23IdentificationOfUpdateTarget() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc24Phonenumber()
	 */
	@Test
	public void atc24Phonenumber() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc25Schema()
	 */
	@Test
	public void atc25Schema() {
		Assert.assertNull(Utils.findClass(Schema.class, "id"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc26SchemaSimpleField()
	 */
	@Test
	public void atc26SchemaSimpleField() {
		Field simpleField = Utils.findField(SimpleField.class, "name");
		Assert.assertNotNull(simpleField);
		Assert.assertEquals("String", simpleField.getType().getSimpleName());

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc27ExtendedDataSchemaData()
	 */
	@Test
	public void atc27ExtendedDataSchemaData() {
		Assert.assertNull(Utils.findClass(SimpleField.class, "name"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc28ExtendedDataData()
	 */
	@Test
	public void atc28ExtendedDataData() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc29Alias()
	 */
	@Test
	public void atc29Alias() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc30AtomAuthor()
	 */
	@Test
	public void atc30AtomAuthor() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc31AtomLink()
	 */
	@Test
	public void atc31AtomLink() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc32OrientationMinimalContent()
	 */
	@Test
	public void atc32OrientationMinimalContent() {
	 	// Verify that if a kml:Orientation element is not a descendant of kml:Update, 
		// then it contains at least one of the following elements: kml:heading, kml:tilt, or kml:roll.
		
		Assert.assertNull(Utils.findClass(Orientation.class, "Update"));

		Assert.assertNotNull(Utils.findField(Orientation.class, "heading"));
		Assert.assertNotNull(Utils.findField(Orientation.class, "tilt"));
		Assert.assertNotNull(Utils.findField(Orientation.class, "roll"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc33GroundOverlay()
	 */
	@Test
	public void atc33GroundOverlay() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc34Model()
	 */
	@Test
	public void atc34Model() {
		Assert.assertNull(Utils.findClass(Model.class, "Update"));
		
		Field linkModel = Utils.findField(Model.class, "link");
		Assert.assertNotNull(linkModel);
		Assert.assertEquals(Link.class, linkModel.getType());

		Field locationModel = Utils.findField(Model.class, "location");
		Assert.assertNotNull(locationModel);
		Assert.assertEquals(Location.class, locationModel.getType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc35PhotoOverlayMinimalContent()
	 */
	@Test
	public void atc35PhotoOverlayMinimalContent() {
		Assert.assertNull(Utils.findClass(PhotoOverlay.class, "Update"));
		
		Field icon = Utils.findField(PhotoOverlay.class, "icon");
		Assert.assertNotNull(icon);
		Assert.assertEquals(Icon.class, icon.getType());

		Field viewVolume = Utils.findField(PhotoOverlay.class, "viewVolume");
		Assert.assertNotNull(viewVolume);
		Assert.assertEquals(ViewVolume.class, viewVolume.getType());

		Field point = Utils.findField(PhotoOverlay.class, "point");
		Assert.assertNotNull(point);
		Assert.assertEquals(Point.class, point.getType());
		
		//abstractView con contain Camera
		Field camera = Utils.findField(PhotoOverlay.class, "abstractView");
		Assert.assertNotNull(camera);
		Assert.assertEquals(AbstractView.class, camera.getType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc36Pair()
	 */
	@Test
	public void atc36Pair() {
		Assert.assertNull(Utils.findClass(Pair.class, "Update"));
		
		Assert.assertNotNull(Utils.findField(Pair.class, "key"));
		Assert.assertNotNull(Utils.findField(Pair.class, "styleUrl"));
		Assert.assertNotNull(Utils.findField(Pair.class, "styleSelector"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc37ItemIcon()
	 */
	@Test
	public void atc37ItemIcon() {
		Assert.assertNull(Utils.findClass(ItemIcon.class, "Update"));
		Assert.assertNotNull(Utils.findField(ItemIcon.class, "href"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc38LookAt()
	 */
	@Test
	public void atc38LookAt() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc39Lod()
	 */
	@Test
	public void atc39Lod() {

	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc40Link()
	 */
	@Test
	public void atc40Link() {
		Assert.assertNull(Utils.findClass(Link.class, "Update"));
		Assert.assertNull(Utils.findClass(Icon.class, "Update"));
		
		Assert.assertNotNull(Utils.findField(Link.class, "href"));
		Assert.assertNotNull(Utils.findField(Icon.class, "href"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel1#atc41Region()
	 */
	@Test
	public void atc41Region() {
		Assert.assertNull(Utils.findClass(Region.class, "Update"));

		Assert.assertNotNull(Utils.findField(Region.class, "latLonAltBox"));
		Assert.assertNotNull(Utils.findField(Region.class, "lod"));
	}

}
