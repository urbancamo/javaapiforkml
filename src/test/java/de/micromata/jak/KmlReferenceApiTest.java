package de.micromata.jak;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

import de.micromata.jak.internal.IKMLReference;
import de.micromata.opengis.kml.v_2_2_0.Alias;
import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.BalloonStyle;
import de.micromata.opengis.kml.v_2_2_0.Boundary;
import de.micromata.opengis.kml.v_2_2_0.Camera;
import de.micromata.opengis.kml.v_2_2_0.Change;
import de.micromata.opengis.kml.v_2_2_0.ColorMode;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Create;
import de.micromata.opengis.kml.v_2_2_0.Data;
import de.micromata.opengis.kml.v_2_2_0.Delete;
import de.micromata.opengis.kml.v_2_2_0.DisplayMode;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.ExtendedData;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.GridOrigin;
import de.micromata.opengis.kml.v_2_2_0.GroundOverlay;
import de.micromata.opengis.kml.v_2_2_0.Icon;
import de.micromata.opengis.kml.v_2_2_0.IconStyle;
import de.micromata.opengis.kml.v_2_2_0.ImagePyramid;
import de.micromata.opengis.kml.v_2_2_0.ItemIcon;
import de.micromata.opengis.kml.v_2_2_0.ItemIconState;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.KmlFactory;
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
import de.micromata.opengis.kml.v_2_2_0.Metadata;
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
import de.micromata.opengis.kml.v_2_2_0.ResourceMap;
import de.micromata.opengis.kml.v_2_2_0.Scale;
import de.micromata.opengis.kml.v_2_2_0.Schema;
import de.micromata.opengis.kml.v_2_2_0.SchemaData;
import de.micromata.opengis.kml.v_2_2_0.ScreenOverlay;
import de.micromata.opengis.kml.v_2_2_0.Shape;
import de.micromata.opengis.kml.v_2_2_0.SimpleData;
import de.micromata.opengis.kml.v_2_2_0.SimpleField;
import de.micromata.opengis.kml.v_2_2_0.Snippet;
import de.micromata.opengis.kml.v_2_2_0.Style;
import de.micromata.opengis.kml.v_2_2_0.StyleMap;
import de.micromata.opengis.kml.v_2_2_0.StyleState;
import de.micromata.opengis.kml.v_2_2_0.TimeSpan;
import de.micromata.opengis.kml.v_2_2_0.TimeStamp;
import de.micromata.opengis.kml.v_2_2_0.Units;
import de.micromata.opengis.kml.v_2_2_0.Update;
import de.micromata.opengis.kml.v_2_2_0.Vec2;
import de.micromata.opengis.kml.v_2_2_0.ViewRefreshMode;
import de.micromata.opengis.kml.v_2_2_0.ViewVolume;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressDetails;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressLine;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressLines;
import de.micromata.opengis.kml.v_2_2_0.xal.AdministrativeArea;
import de.micromata.opengis.kml.v_2_2_0.xal.DependentLocality;
import de.micromata.opengis.kml.v_2_2_0.xal.Firm;
import de.micromata.opengis.kml.v_2_2_0.xal.LargeMailUser;
import de.micromata.opengis.kml.v_2_2_0.xal.Locality;
import de.micromata.opengis.kml.v_2_2_0.xal.PostBox;
import de.micromata.opengis.kml.v_2_2_0.xal.PostOffice;
import de.micromata.opengis.kml.v_2_2_0.xal.PostalCode;
import de.micromata.opengis.kml.v_2_2_0.xal.PostalRoute;
import de.micromata.opengis.kml.v_2_2_0.xal.Premise;
import de.micromata.opengis.kml.v_2_2_0.xal.PremiseNumber;
import de.micromata.opengis.kml.v_2_2_0.xal.Thoroughfare;

@SuppressWarnings("deprecation")
public final class KmlReferenceApiTest implements IKMLReference
{
	@SuppressWarnings("unused")
  private static final Logger LOG = Logger.getLogger(KmlReferenceApiTest.class.getName());

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#ballonStyle()
	 */
	@Test
	public void ballonStyle() {
		final BalloonStyle balloonstyle = new BalloonStyle()
		.withId("ID")
		// <!-- specific to BalloonStyle -->
		.withBgColor("ffffffff")
		.withTextColor("ff000000")
		.withText("...")
		.withDisplayMode(DisplayMode.DEFAULT);

		KmlReferenceCheck.ballonStyle(balloonstyle);
		final BalloonStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(balloonstyle);
		KmlReferenceCheck.ballonStyle(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#ballonStyleExample()
	 */
	@Test
	public void ballonStyleExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument()
		.withName("BalloonStyle.kml").withOpen(true);

		document.createAndAddStyle()
		.withId("exampleBalloonStyle")

		.createAndSetBalloonStyle()
		.withId("ID")
		.withBgColor("ffffffbb")
		.withTextColor("ff000000")
		.withText("<![CDATA[" + "<b><font color='#CC0000' size='+3'>$[name]</font></b>" + "<br/><br/>" + "<font face='Courier'>$[description]</font>" + "<br/><br/>" + "Extra text that will appear in the description balloon" + "<br/><br/>" + "<!-- insert the to/from hyperlinks -->" + "$[geDirections]]]>");

		final Placemark placemark = document.createAndAddPlacemark()
		.withName("BalloonStyle")
		.withDescription("An example of BalloonStyle")
		.withStyleUrl("#exampleBalloonStyle");
		
		final Point point = placemark.createAndSetPoint();
		List<Coordinate> coord = point.createAndSetCoordinates();
		coord.add(new Coordinate(-122.370533,37.823842,0));

		KmlReferenceCheck.ballonStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.ballonStyleExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#camera()
	 */
	@Test
	public void camera() {
		final Camera camera = KmlFactory.createCamera()
		.withId("ID")
		.withLongitude(0.0)
		.withLatitude(0.0)
		.withAltitude(0.0)
		.withHeading(0.0)
		.withTilt(0.0)
		.withRoll(0.0)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		KmlReferenceCheck.camera(camera);
		final Camera marshalledAndBackAgain = Utils.marshalAndUnmarshall(camera);
		KmlReferenceCheck.camera(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#document()
	 */
	@Test
	public void document() {
		final Document document = KmlFactory.createDocument()
		.withId("ID")
		.withName("...")
		.withVisibility(true)
		.withOpen(false)
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("..."))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withAddress("...")
		.withXalAddressDetails(createAddressDetails())
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData());

		KmlReferenceCheck.document(document);
		final Document marshalledAndBackAgain = Utils.marshalAndUnmarshall(document);
		KmlReferenceCheck.document(marshalledAndBackAgain);
	}

	private AddressDetails createAddressDetails() {
		PostBox postBox = new PostBox(new PostBox.PostBoxNumber());
		PostalRoute postalRoute = new PostalRoute(new ArrayList<PostalRoute.PostalRouteName>(), new PostalRoute.PostalRouteNumber());
		Premise.PremiseNumberRange premisenumberrange = new Premise.PremiseNumberRange(new Premise.PremiseNumberRange.PremiseNumberRangeFrom(
		    new ArrayList<PremiseNumber>()), new Premise.PremiseNumberRange.PremiseNumberRangeTo(new ArrayList<PremiseNumber>()));
		Premise premise = new Premise(new Premise.PremiseLocation(), new ArrayList<PremiseNumber>(), premisenumberrange);

		AddressDetails.Address xalAddress = new AddressDetails.Address();
		AddressLines addressLines = new AddressLines(new ArrayList<AddressLine>());
		
		Locality locality = new Locality(postBox, new LargeMailUser(), new PostOffice(), postalRoute);
		AdministrativeArea administrativeArea = new AdministrativeArea(locality, new PostOffice(), new PostalCode());
		Thoroughfare thoroughfare = new Thoroughfare(new DependentLocality(postBox, new LargeMailUser(), new PostOffice(), postalRoute),
		    premise, new Firm(), new PostalCode());
		AddressDetails.Country country = new AddressDetails.Country(administrativeArea, locality, thoroughfare);

		return new AddressDetails(xalAddress, addressLines, country, administrativeArea, locality, thoroughfare);
	}


	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#documentExample()
	 */
	@Test
	public void documentExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument().withName("Document.kml").withOpen(true);
		final Style style = document.createAndAddStyle().withId("exampleStyleDocument");
		style.createAndSetLabelStyle().withColor("ff0000cc");

		final Placemark placemark1 = document.createAndAddPlacemark().withName("Document Feature 1").withStyleUrl("#exampleStyleDocument");
		placemark1.createAndSetPoint().createAndSetCoordinates().add(new Coordinate(-122.371,37.816,0));

		final Placemark placemark2 = document.createAndAddPlacemark().withName("Document Feature 2").withDescription("An example of BalloonStyle").withStyleUrl("#exampleStyleDocument");
		placemark2.createAndSetPoint().createAndSetCoordinates().add(new Coordinate(-122.370,37.817,0));

		KmlReferenceCheck.documentExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.documentExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#extendedData()
	 */
	@Test
	public void extendedData() {
		final ExtendedData extendedData = KmlFactory.createExtendedData().addToData(new Data("...").withName("string").withDisplayName("..."))
		.addToSchemaData(KmlFactory.createSchemaData().withSchemaUrl("anyURI").addToSimpleData(KmlFactory.createSimpleData("").withValue("...")));

		// FIXME: rename to: <namespace_prefix:other>...</namespace_prefix:other>
		// extendedData.addToAny("...")

		KmlReferenceCheck.extendedData(extendedData);
		final ExtendedData marshalledAndBackAgain = Utils.marshalAndUnmarshall(extendedData);
		KmlReferenceCheck.extendedData(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#extendedDataValue()
	 */
	@Test
	public void extendedDataValue() {
		final Placemark placemark = KmlFactory.createPlacemark().withName("Club house");
		placemark.createAndSetExtendedData()
		.addToData(KmlFactory.createData("1").withName("holeNumber"))
		.addToData(KmlFactory.createData("4").withName("holePar"));

		KmlReferenceCheck.extendedDataValue(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.extendedDataValue(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#extendedDataSimpleData()
	 */
	@Test
	public void extendedDataSimpleData() {
		final Document document = KmlFactory.createDocument();
		final Placemark placemark1 = document.createAndAddPlacemark().withName("Easy trail");
		placemark1.createAndSetExtendedData()
		.addToSchemaData(new SchemaData().withSchemaUrl("#TrailHeadTypeId")
				.addToSimpleData(KmlFactory.createSimpleData("TrailHeadName").withValue("Pi in the sky"))
				.addToSimpleData(KmlFactory.createSimpleData("TrailLength").withValue("3.14159"))
				.addToSimpleData(KmlFactory.createSimpleData("ElevationGain").withValue("10"))
		);
		placemark1.createAndSetPoint().createAndSetCoordinates().add(new Coordinate(-122.000,37.002));
	
		final Placemark placemark2 = document.createAndAddPlacemark().withName("Difficult trail");
		placemark2.createAndSetExtendedData()
		.addToSchemaData(new SchemaData().withSchemaUrl("#TrailHeadTypeId")
				.addToSimpleData(KmlFactory.createSimpleData("TrailHeadName").withValue("Mount Everest"))
				.addToSimpleData(KmlFactory.createSimpleData("TrailLength").withValue("347.45"))
				.addToSimpleData(KmlFactory.createSimpleData("ElevationGain").withValue("10000"))
		);
		placemark2.createAndSetPoint().createAndSetCoordinates().add(new Coordinate(-122.000,37.002));

		KmlReferenceCheck.extendedDataSimpleData(document);
		final Document marshalledAndBackAgain = Utils.marshalAndUnmarshall(document);
		KmlReferenceCheck.extendedDataSimpleData(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#extendedDataNameSapcePrefix()
	 */
	// FIXME: <ExtendedData xmlns:prefix="camp">
	// FIXME: <camp:number>14</camp:number>
	// FIXME: <camp:parkingSpaces>2</camp:parkingSpaces>
	// FIXME: <camp:tentSites>4</camp:tentSites>
	@Test
	public void extendedDataNameSapcePrefix() {
		final ExtendedData extendedData = KmlFactory.createExtendedData();
		// FIXME: rename to: <namespace_prefix:other>...</namespace_prefix:other>
		// extendedData.

		KmlReferenceCheck.extendedDataNameSapcePrefix(extendedData);
		final ExtendedData marshalledAndBackAgain = Utils.marshalAndUnmarshall(extendedData);
		KmlReferenceCheck.extendedDataNameSapcePrefix(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#featureAscriptionElement()
	 */
	@Test
	public void featureAscriptionElement() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument();

		document.createAndSetAtomAuthor().addToNameOrUriOrEmail("J. K. Rowling");
		document.createAndSetAtomLink("http://www.harrypotter.com");

		document.createAndAddPlacemark().withName("Hogwarts")
		.createAndSetPoint().createAndSetCoordinates().add(new Coordinate(1,1));
		
		document.createAndAddPlacemark().withName("Little Hangleton")
		.createAndSetPoint().createAndSetCoordinates().add(new Coordinate(1,2));

		KmlReferenceCheck.featureAscriptionElement(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.featureAscriptionElement(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#folder()
	 */
	@Test
	public void folder() {
		final Folder folder = KmlFactory.createFolder()
		.withId("ID")
		.withVisibility(true)
		.withOpen(false)
		.withName("...")
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("..."))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withXalAddressDetails(createAddressDetails())
		.withAddress("...")
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData());

		KmlReferenceCheck.folder(folder);
		final Folder marshalledAndBackAgain = Utils.marshalAndUnmarshall(folder);
		KmlReferenceCheck.folder(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#folderExample()
	 */
	@Test
	public void folderExample() {
		final Kml kml = KmlFactory.createKml();
		final Folder folder = kml.createAndSetFolder()
		.withName("Folder.kml")
		.withOpen(true)
		.withDescription("A folder is a container that can hold multiple other objects");

		folder.createAndAddPlacemark().withName("Folder object 1 (Placemark)")
		.createAndSetPoint().addToCoordinates("-122.377588,37.830266,0");

		folder.createAndAddPlacemark().withName("Folder object 2 (Polygon)")
		.createAndSetPolygon().createAndSetOuterBoundaryIs()
		.createAndSetLinearRing()
		.addToCoordinates("-122.377830,37.830445,0")
		.addToCoordinates("-122.377576,37.830631,0")
		.addToCoordinates("-122.377840,37.830642,0")
		.addToCoordinates("-122.377830,37.830445,0");
		
		folder.createAndAddPlacemark().withName("Folder object 3 (Path)")
		.createAndSetLineString().withTessellate(true)
		.addToCoordinates("-122.378009,37.830128,0")
		.addToCoordinates("-122.377885,37.830379,0");
		
		KmlReferenceCheck.folderExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.folderExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#groundOverlay()
	 */
	@Test
	public void groundOverlay() {
		final GroundOverlay groundoverlay = KmlFactory.createGroundOverlay()
		// inherited from Feature element
		.withId("ID")
		.withVisibility(true)
		.withOpen(false)
		.withName("...")
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("..."))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withXalAddressDetails(createAddressDetails())
		.withAddress("...")
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData())

		// inherited from Overlay element
		.withColor("ffffffff")
		.withDrawOrder(0)
		.withIcon(new Icon().withHref("..."))

		// specific to GroundOverlay
		.withAltitude(0.0d)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		
		groundoverlay.createAndSetLatLonBox()
		.withNorth(0.0d)
		.withSouth(0.0d)
		.withEast(0.0d)
		.withWest(0.0d)
		.withRotation(0.0d);

		KmlReferenceCheck.groundoverlay(groundoverlay);
		final GroundOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(groundoverlay);
		KmlReferenceCheck.groundoverlay(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#groundOverlayLatLonBox()
	 */
	@Test
	public void groundOverlayLatLonBox() {
		final LatLonBox latlonBox = KmlFactory.createLatLonBox()
		.withNorth(48.25475939255556d)
		.withSouth(48.25207367852141d)
		.withEast(-90.86591508839973d)
		.withWest(-90.8714285289695d)
		.withRotation(39.37878630116985d);

		KmlReferenceCheck.groundOverlayLatLonBox(latlonBox);
		final LatLonBox marshalledAndBackAgain = Utils.marshalAndUnmarshall(latlonBox);
		KmlReferenceCheck.groundOverlayLatLonBox(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#groundOverlayExample()
	 */
	@Test
	public void groundOverlayExample() {
		final Kml kml = KmlFactory.createKml();
		final GroundOverlay groundoverlay = kml.createAndSetGroundOverlay()

		.withName("GroundOverlay.kml")
		.withColor("7fffffff")
		.withDrawOrder(1);

		groundoverlay.createAndSetIcon()
		.withHref("http://www.google.com/intl/en/images/logo.gif")
		.withRefreshMode(RefreshMode.ON_INTERVAL)
		.withRefreshInterval(86400d)
		.withViewBoundScale(0.75d);

		groundoverlay.createAndSetLatLonBox()
		.withNorth(37.83234d)
		.withSouth(37.832122d)
		.withEast(-122.373033d)
		.withWest(-122.373724d)
		.withRotation(45d);

		KmlReferenceCheck.groundOverlayExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.groundOverlayExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#icon()
	 */
	@Test
	public void icon() {
		final Icon icon = (Icon) new Icon()
		.withHref("...")
		.withRefreshMode(RefreshMode.ON_CHANGE)
		.withRefreshInterval(4d)
		.withViewRefreshMode(ViewRefreshMode.NEVER)
		.withViewRefreshTime(4d)
		.withViewBoundScale(1d)
		.withHttpQuery("...");

		KmlReferenceCheck.icon(icon);
		final Icon marshalledAndBackAgain = Utils.marshalAndUnmarshall(icon);
		KmlReferenceCheck.icon(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#iconStyle()
	 */
	@Test
	public void iconStyle() {
		// <!-- inherited from ColorStyle -->
		final IconStyle iconstyle = KmlFactory.createIconStyle()
		.withColor("ffffffff")
		.withColorMode(ColorMode.NORMAL)

		// <!-- specific to IconStyle -->
		.withScale(1.0d)
		.withHeading(0d);
		
		iconstyle.createAndSetIcon().withHref("...");
		
		iconstyle.createAndSetHotSpot()
		.withX(0.5d)
		.withY(0.5d)
		.withXunits(Units.FRACTION)
		.withYunits(Units.FRACTION);

		KmlReferenceCheck.iconStyle(iconstyle);
		final IconStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(iconstyle);
		KmlReferenceCheck.iconStyle(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#iconStyleExample()
	 */
	@Test
	public void iconStyleExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument();
		final Style style = document.createAndAddStyle().withId("randomColorIcon");

		final IconStyle iconstyle = style.createAndSetIconStyle()
		.withColor("ff00ff00")
		.withColorMode(ColorMode.RANDOM)
		.withScale(1.1d);

		iconstyle.createAndSetIcon().withHref("http://maps.google.com/mapfiles/kml/pal3/icon21.png");

		
		document.createAndAddPlacemark().withName("IconStyle.kml").withStyleUrl("#randomColorIcon")
		.createAndSetPoint().addToCoordinates("-122.36868,37.831145,0");
		
		KmlReferenceCheck.iconStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.iconStyleExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#kml()
	 */
	@Test
	public void kml() {
		final Kml kml = KmlFactory.createKml().withHint("sky");

		KmlReferenceCheck.kml(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.kml(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#labelStyle()
	 */
	@Test
	public void labelStyle() {
		final LabelStyle labelstyle = KmlFactory.createLabelStyle()
		// <!-- inherited from ColorStyle -->
		.withColor("ffffffff")
		.withColorMode(ColorMode.NORMAL)

		// <!-- specific to LabelStyle -->
		.withScale(1.0d);

		KmlReferenceCheck.labelStyle(labelstyle);
		final LabelStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(labelstyle);
		KmlReferenceCheck.labelStyle(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#labelStyleExample()
	 */
	@Test
	public void labelStyleExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument();
		final Style style = document.createAndAddStyle().withId("randomLabelColor");

		style.createAndSetLabelStyle()
		.withColor("ff0000cc")
		.withColorMode(ColorMode.RANDOM)
		.withScale(1.5d);

		document.createAndAddPlacemark().withName("LabelStyle.kml").withStyleUrl("#randomLabelColor")
		.createAndSetPoint().addToCoordinates("-122.367375,37.829192,0");
		
		KmlReferenceCheck.labelStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.labelStyleExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#linearRing()
	 */
	@Test
	public void linearRing() {
		final LinearRing linearring = KmlFactory.createLinearRing()
		.withId("ID")
		// <!-- specific to LinearRing -->
		.withExtrude(true)
		.withTessellate(true)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND)
		.addToCoordinates("0.0,0.0,0.0");

		KmlReferenceCheck.linearRing(linearring);
		final LinearRing marshalledAndBackAgain = Utils.marshalAndUnmarshall(linearring);
		KmlReferenceCheck.linearRing(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#linearRingExample()
	 */
	@Test
	public void linearRingExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument();
		
		document.createAndAddPlacemark().withName("LinearRing.kml")
		.createAndSetPolygon().createAndSetOuterBoundaryIs().createAndSetLinearRing()
		.addToCoordinates(-122.365662,37.826988,0)
		.addToCoordinates(-122.365202,37.826302,0)
		.addToCoordinates(-122.364581,37.82655,0)
		.addToCoordinates(-122.365038,37.827237,0)
		.addToCoordinates(-122.365662,37.826988,0);
		
		KmlReferenceCheck.linearRingExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.linearRingExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#lineString()
	 */
	@Test
	public void lineString() {
		final LineString linestring = KmlFactory.createLineString()
		.withId("ID")
		.withExtrude(false)
		.withTessellate(false)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND)
		.addToCoordinates("0.0,0.0,0.0");
		
		KmlReferenceCheck.lineString(linestring);
		final LineString marshalledAndBackAgain = Utils.marshalAndUnmarshall(linestring);
		KmlReferenceCheck.lineString(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#lineStringExample()
	 */
	@Test
	public void lineStringExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument().withName("LineString.kml").withOpen(true);

		document.createAndSetLookAt()
		.withLongitude(-122.36415)
		.withLatitude(37.824553)
		.withRange(150.0d)
		.withTilt(50.0d)
		.withHeading(0.0d);

		document.createAndAddPlacemark().withName("unextruded")
		.createAndSetLineString().withExtrude(false).withTessellate(true)
		.addToCoordinates("-122.364383,37.824664,0")
		.addToCoordinates("-122.364152,37.824322,0");
		
		document.createAndAddPlacemark().withName("extruded")
		.createAndSetLineString().withExtrude(true).withTessellate(true)
		.addToCoordinates("-122.364167,37.824787,50")
		.addToCoordinates("-122.363917,37.824423,50");
		
		KmlReferenceCheck.lineStringExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.lineStringExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#lineStyle()
	 */
	@Test
	public void lineStyle() {
		final LineStyle linestyle = KmlFactory.createLineStyle()
		.withId("ID")
		// <!-- inherited from ColorStyle -->
		.withColor("ffffffff")
		.withColorMode(ColorMode.NORMAL)
		// <!-- specific to LineStyle -->
		.withWidth(1.0d);

		KmlReferenceCheck.lineStyle(linestyle);
		final LineStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(linestyle);
		KmlReferenceCheck.lineStyle(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#lineStyleExample()
	 */
	@Test
	public void lineStyleExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument().withName("LineStyle.kml").withOpen(true);
		final Style style = document.createAndAddStyle().withId("linestyleExample");

		style.createAndSetLineStyle()
		.withColor("7f0000ff")
		.withWidth(4.0d);

		document.createAndAddPlacemark().withName("LineStyle Example").withStyleUrl("#linestyleExample")
		.createAndSetLineString().withExtrude(true).withTessellate(true)
		.addToCoordinates("-122.364383,37.824664,0")
		.addToCoordinates("-122.364152,37.824322,0");
		
		KmlReferenceCheck.lineStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.lineStyleExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#link()
	 */
	@Test
	public void link() {
		final Link link = KmlFactory.createLink()
		.withId("ID")
		.withHref("...")
		.withRefreshMode(RefreshMode.ON_CHANGE)
		.withRefreshInterval(4.0d)
		.withViewRefreshMode(ViewRefreshMode.NEVER)
		.withViewRefreshTime(4.0d)
		.withViewBoundScale(1.0d)
		.withViewFormat("BBOX=bboxWest")
		.withHttpQuery("...");

		KmlReferenceCheck.link(link);
		final Link marshalledAndBackAgain = Utils.marshalAndUnmarshall(link);
		KmlReferenceCheck.link(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#linkExample()
	 */
	@Test
	public void linkExample() {
		final NetworkLink networklink = KmlFactory.createNetworkLink()
		.withName("NE US Radar")
		.withFlyToView(true);
		
		networklink.createAndSetLink()
		.withHref("http://www.example.com/geotiff/NE/MergedReflectivityQComposite.kml")
		.withRefreshMode(RefreshMode.ON_INTERVAL)
		.withRefreshInterval(30.0d)
		.withViewRefreshMode(ViewRefreshMode.ON_STOP)
		.withViewRefreshTime(7.0d)
		.withViewFormat("BBOX=bboxWest")

		.withHttpQuery("...");

		KmlReferenceCheck.linkExample(networklink);
		final NetworkLink marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklink);
		KmlReferenceCheck.linkExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#listStyle()
	 */
	@Test
	public void listStyle() {
		final ListStyle liststyle = KmlFactory.createListStyle()
		.withId("ID")
		// <!-- specific to ListStyle -->
		.withListItemType(ListItemType.CHECK)
		.withBgColor("ffffffff");
		
		liststyle.createAndAddItemIcon().addToState(ItemIconState.OPEN).withHref("...");

		KmlReferenceCheck.listStyle(liststyle);
		final ListStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(liststyle);
		KmlReferenceCheck.listStyle(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#lookAt()
	 */
	@Test
	public void lookAt() {
		final LookAt lookat = KmlFactory.createLookAt()
		// <!-- inherited from AbstractView element -->
		// TODO <TimePrimitive>...</TimePrimitive> <!-- gx:TimeSpan or gx:TimeStamp -->

		// <!-- specific to LookAt -->
		.withLongitude(0.0)
		.withLatitude(0.0)
		.withRange(0.0)
		.withTilt(0.0)
		.withHeading(0.0)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		KmlReferenceCheck.lookAt(lookat);
		final LookAt marshalledAndBackAgain = Utils.marshalAndUnmarshall(lookat);
		KmlReferenceCheck.lookAt(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#lookAtExample()
	 */
	@Test
	public void lookAtExample() {
		final Kml kml = KmlFactory.createKml();
		final Placemark placemark = kml.createAndSetPlacemark().withName("LookAt.kml");
		placemark.createAndSetLookAt()
		// TODO <gx:TimeStamp> <when>1994</when> </gx:TimeStamp>
		.withLongitude(-122.363)
		.withLatitude(37.81)
		.withAltitude(2000.0d)
		.withRange(500.0)
		.withTilt(45.0)
		.withHeading(0.0)
		.withAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);

		placemark.createAndSetPoint().addToCoordinates("-122.363,37.82,0");

		KmlReferenceCheck.lookAtExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.lookAtExample(marshalledAndBackAgain);
	}
	
	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#model()
	 */
	@Test
	public void model() {
		final Model model = KmlFactory.createModel().withId("ID").withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		model.createAndSetLocation().withLongitude(0.0).withLatitude(0.0).withAltitude(0.0);
		model.createAndSetOrientation().withHeading(0.0).withTilt(0.0).withRoll(0.0);
		model.createAndSetScale().withX(1.0).withY(1.0).withZ(1.0);
		model.createAndSetLink().withHref("...");
		model.createAndSetResourceMap().createAndAddAlias().withTargetHref("...").withSourceHref("...");

		KmlReferenceCheck.model(model);
		final Model marshalledAndBackAgain = Utils.marshalAndUnmarshall(model);
		KmlReferenceCheck.model(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#modelLocation()
	 */
	@Test
	public void modelLocation() {
		final Location location = KmlFactory.createLocation()
		.withLongitude(39.55375305703105)
		.withLatitude(-118.9813220168456)
		.withAltitude(1223.0);

		KmlReferenceCheck.modelLocation(location);
		final Location marshalledAndBackAgain = Utils.marshalAndUnmarshall(location);
		KmlReferenceCheck.modelLocation(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#modelOrientation()
	 */
	@Test
	public void modelOrientation() {
		final Orientation orientation = KmlFactory.createOrientation()
		.withHeading(45.0)
		.withTilt(10.0)
		.withRoll(0.0);

		KmlReferenceCheck.modelOrientation(orientation);
		final Orientation marshalledAndBackAgain = Utils.marshalAndUnmarshall(orientation);
		KmlReferenceCheck.modelOrientation(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#modelScale()
	 */
	@Test
	public void modelScale() {

		final Scale scale = KmlFactory.createScale()
		.withX(2.5)
		.withY(2.5)
		.withZ(3.5);

		KmlReferenceCheck.modelScale(scale);
		final Scale marshalledAndBackAgain = Utils.marshalAndUnmarshall(scale);
		KmlReferenceCheck.modelScale(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#modelResourceMap()
	 */
	@Test
	public void modelResourceMap() {
		final Alias alias = KmlFactory.createAlias()
		.withTargetHref("../images/foo.jpg")
		.withSourceHref("c:\\mytextures\\foo.jpg");

		KmlReferenceCheck.modelResourceMap(alias);
		final Alias marshalledAndBackAgain = Utils.marshalAndUnmarshall(alias);
		KmlReferenceCheck.modelResourceMap(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#modelExample()
	 */
	@Test
	public void modelExample() {
		final Model model = KmlFactory.createModel()
		.withId("khModel543")
		.withAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);
		
		model.createAndSetLocation().withLongitude(39.55375305703105).withLatitude(-118.9813220168456).withAltitude(1223.0);
		model.createAndSetOrientation().withHeading(45.0).withTilt(10.0).withRoll(0.0);

		model.createAndSetScale().withX(1.0).withY(1.0).withZ(1.0);

		model.createAndSetLink().withHref("house.dae").withRefreshMode(RefreshMode.ON_CHANGE);

		final ResourceMap resourcemap = model.createAndSetResourceMap();
		resourcemap.createAndAddAlias()
		.withTargetHref("../files/CU-Macky---Center-StairsnoCulling.jpg")
		.withSourceHref("CU-Macky---Center-StairsnoCulling.jpg");

		resourcemap.createAndAddAlias()
		.withTargetHref("../files/CU-Macky-4sideturretnoCulling.jpg")
		.withSourceHref("CU-Macky-4sideturretnoCulling.jpg");
		
		resourcemap.createAndAddAlias()
		.withTargetHref("../files/CU-Macky-Back-NorthnoCulling.jpg")
		.withSourceHref("CU-Macky-Back-NorthnoCulling.jpg");
		
		KmlReferenceCheck.modelExample(model);
		final Model marshalledAndBackAgain = Utils.marshalAndUnmarshall(model);
		KmlReferenceCheck.modelExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#multiGeometry()
	 */
	@Test
	public void multiGeometry() {
		final MultiGeometry multigeometry = KmlFactory.createMultiGeometry().withId("ID");

		KmlReferenceCheck.multiGeometry(multigeometry);
		final MultiGeometry marshalledAndBackAgain = Utils.marshalAndUnmarshall(multigeometry);
		KmlReferenceCheck.multiGeometry(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#multiGeometryExample()
	 */
	@Test
	public void multiGeometryExample() {
		final Placemark placemark = KmlFactory.createPlacemark()
		.withName("SF Marina Harbor Master")
		.withVisibility(false);
		final MultiGeometry multigeometry = placemark.createAndSetMultiGeometry();
		
		multigeometry.createAndAddLineString()
		.addToCoordinates("-122.4425587930444,37.80666418607323,0")
		.addToCoordinates("-122.4428379594768,37.80663578323093,0");
		
		multigeometry.createAndAddLineString()
		.addToCoordinates("-122.4425509770566,37.80662588061205,0")
		.addToCoordinates("-122.4428340530617,37.8065999493009,0");
		
		KmlReferenceCheck.multiGeometryExample(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.multiGeometryExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#networkLink()
	 */
	@Test
	public void networkLink() {
		final NetworkLink networklink = KmlFactory.createNetworkLink()
		// inherited from Feature element
		.withId("ID")
		.withVisibility(true)
		.withOpen(false)
		.withName("...")
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("..."))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withXalAddressDetails(createAddressDetails())
		.withAddress("...")
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData())

				// <!-- specific to NetworkLink -->
		.withRefreshVisibility(false)
		.withFlyToView(false);
		
		networklink.createAndSetLink().withHref("...");

		KmlReferenceCheck.networkLink(networklink);
		final NetworkLink marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklink);
		KmlReferenceCheck.networkLink(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#networkLinkExample()
	 */
	@Test
	public void networkLinkExample() {
		final Document document = KmlFactory.createDocument().withVisibility(true);
		final NetworkLink networklink = document.createAndAddNetworkLink()
		.withName("NE US Radar").withRefreshVisibility(true).withFlyToView(true);
		networklink.createAndSetLink().withHref("...");

		KmlReferenceCheck.networkLinkExample(document);
		final Document marshalledAndBackAgain = Utils.marshalAndUnmarshall(document);
		KmlReferenceCheck.networkLinkExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#networkLinkControl()
	 */
	@Test
	public void networkLinkControl() {
		final NetworkLinkControl networklinkcontrol = KmlFactory.createNetworkLinkControl()
		.withMinRefreshPeriod(0.0)
		.withMaxSessionLength(-1.0)
		.withCookie("...")
		.withMessage("...")
		.withLinkName("...")
		.withLinkDescription("...")
		.withLinkSnippet(new Snippet().withMaxLines(2).withValue("..."))
		.withExpires("...")
		.withUpdate(KmlFactory.createUpdate("", new ArrayList<Object>()))
		.withAbstractView(KmlFactory.createLookAt());
		
		networklinkcontrol.createAndSetLinkSnippet().withMaxLines(2).withValue("...");

		KmlReferenceCheck.networkLinkControl(networklinkcontrol);
		final NetworkLinkControl marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklinkcontrol);
		KmlReferenceCheck.networkLinkControl(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#networkLinkControlExample()
	 */
	@Test
	public void networkLinkControlExample() {
		final Kml kml = KmlFactory.createKml();
		kml.createAndSetNetworkLinkControl()
		.withMessage("This is a pop-up message. You will only see this once")
		.withCookie("cookie=sometext")
		.withLinkName("New KML features")
		.withLinkDescription("<![CDATA[KML now has new features available!]]>");

		KmlReferenceCheck.networkLinkControlExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.networkLinkControlExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#overlayIcon()
	 */
	@Test
	public void overlayIcon() {
		final Icon icon = (Icon) new Icon().withHref("icon.jpg");

		KmlReferenceCheck.overlayIcon(icon);
		final Icon marshalledAndBackAgain = Utils.marshalAndUnmarshall(icon);
		KmlReferenceCheck.overlayIcon(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#photoOverlay()
	 */
	@Test
	public void photoOverlay() {
		final PhotoOverlay photooverlay = KmlFactory.createPhotoOverlay()
		// inherited from Feature element
		.withId("ID")
		.withVisibility(true)
		.withOpen(false)
		.withName("...")
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("0.0,0.0,0.0"))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withXalAddressDetails(createAddressDetails())
		.withAddress("...")
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData())

		// <!-- inherited from Overlay element -->
		.withColor("ffffffff")
		.withDrawOrder(0)
		.withIcon(new Icon().withHref("..."))

		// <!-- specific to PhotoOverlay -->
		.withShape(Shape.RECTANGLE)
		.withRotation(0.0);
		
		photooverlay.createAndSetViewVolume()
		.withLeftFov(0.0)
		.withRightFov(0.0)
		.withBottomFov(0.0)
		.withTopFov(0.0)
		.withNear(0.0);

		photooverlay.createAndSetImagePyramid()
		.withTileSize(0)
		.withMaxWidth(0)
		.withMaxHeight(0)
		.withGridOrigin(GridOrigin.LOWER_LEFT);

		photooverlay.createAndSetPoint().addToCoordinates("0.0,0.0,0.0");

		KmlReferenceCheck.photoOverlay(photooverlay);
		final PhotoOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(photooverlay);
		KmlReferenceCheck.photoOverlay(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#photoOverlayExample()
	 */
	@Test
	public void photoOverlayExample() {
		final PhotoOverlay photooverlay = KmlFactory.createPhotoOverlay()
		.withName("A simple non-pyramidal photo")
		.withDescription("High above the ocean")
		// <!-- Overlay elements -->
		.withIcon(new Icon().withHref("small-photo.jpg"))
	
		// <!-- PhotoOverlay elements -->
		.withShape(Shape.RECTANGLE)
		.withRotation(0.0);

		photooverlay.createAndSetViewVolume()
		.withNear(1000.0)
		.withLeftFov(-60.0)
		.withRightFov(60.0)
		.withBottomFov(-45.0)
		.withTopFov(45.0);

		photooverlay.createAndSetImagePyramid()
		.withTileSize(0)
		.withMaxWidth(0)
		.withMaxHeight(0)
		.withGridOrigin(GridOrigin.LOWER_LEFT);

		photooverlay.createAndSetPoint().addToCoordinates("1,1");

		KmlReferenceCheck.photoOverlayExample(photooverlay);
		final PhotoOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(photooverlay);
		KmlReferenceCheck.photoOverlayExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#placemark()
	 */
	@Test
	public void placemark() {
		final Placemark placemark = KmlFactory.createPlacemark()
		.withId("ID")
		.withVisibility(true)
		.withOpen(false)
		.withName("...")
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("0.0,0.0,0.0"))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withXalAddressDetails(createAddressDetails())
		.withAddress("...")
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData())

		// <!-- specific to Placemark element -->
		.withGeometry(KmlFactory.createPoint());

		KmlReferenceCheck.placemark(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.placemark(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#placemarkExample()
	 */
	@Test
	public void placemarkExample() {
		Placemark placemark = new Placemark()
		    .withName("Google Earth - New Placemark")
		    .withDescription("Some Descriptive text.");
		
		placemark.createAndSetLookAt()
 		    .withLongitude(-90.86879847669974)
		    .withLatitude(48.25330383601299)
		    .withRange(440.8)
		    .withTilt(8.3)
		    .withHeading(2.7);

		placemark.createAndSetPoint()
		    .addToCoordinates("-90.86948943473118,48.25450093195546,0");

		KmlReferenceCheck.placemarkExample(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.placemarkExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#point()
	 */
	@Test
	public void point() {
		final Point point = KmlFactory.createPoint()
		.withId("ID")
		.withExtrude(false)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND)
		.addToCoordinates("0.0,0.0,0.0");

		KmlReferenceCheck.point(point);
		final Point marshalledAndBackAgain = Utils.marshalAndUnmarshall(point);
		KmlReferenceCheck.point(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#pointExample()
	 */
	@Test
	public void pointExample() {
		final Point point = KmlFactory.createPoint()
		.addToCoordinates("-90.86948943473118,48.25450093195546");

		KmlReferenceCheck.pointExample(point);
		final Point marshalledAndBackAgain = Utils.marshalAndUnmarshall(point);
		KmlReferenceCheck.pointExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#polygon()
	 */
	@Test
	public void polygon() {
		final Polygon polygon = KmlFactory.createPolygon()
		.withId("ID")
		.withExtrude(false)
		.withTessellate(false)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		
		polygon.createAndSetOuterBoundaryIs()
		.createAndSetLinearRing()
		.addToCoordinates("0.0,0.0,0.0");
				
		polygon.createAndAddInnerBoundaryIs()
		.createAndSetLinearRing()
		.addToCoordinates("0.0,0.0,0.0");

		KmlReferenceCheck.polygon(polygon);
		final Polygon marshalledAndBackAgain = Utils.marshalAndUnmarshall(polygon);
		KmlReferenceCheck.polygon(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#polygonExample()
	 */
	@Test
	public void polygonExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument().withName("Polygon.kml").withOpen(false);
		Polygon polygon = document.createAndAddPlacemark().withName("hollow box").createAndSetPolygon().withExtrude(true).withAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);
		
		polygon.createAndSetOuterBoundaryIs().createAndSetLinearRing()
		.addToCoordinates("-122.366278,37.818844,30")
		.addToCoordinates("-122.365248,37.819267,30")
		.addToCoordinates("-122.365640,37.819861,30")
		.addToCoordinates("-122.366669,37.819429,30")
		.addToCoordinates("-122.366278,37.818844,30");

		polygon.createAndAddInnerBoundaryIs().createAndSetLinearRing()
		.addToCoordinates("-122.366212,37.818977,30")
		.addToCoordinates("-122.365424,37.819294,30")
		.addToCoordinates("-122.365704,37.819731,30")
		.addToCoordinates("-122.366488,37.819402,30")
		.addToCoordinates("-122.366212,37.818977,30");
	
		KmlReferenceCheck.polygonExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.polygonExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#polyStyle()
	 */
	@Test
	public void polyStyle() {
		final PolyStyle polystyle = KmlFactory.createPolyStyle()
		.withId("ID")
		// <!-- inherited from ColorStyle -->
		.withColor("ffffffff")
		.withColorMode(ColorMode.NORMAL)

		// <!-- specific to PolyStyle -->
		.withFill(true)
		.withOutline(true);

		KmlReferenceCheck.polyStyle(polystyle);
		final PolyStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(polystyle);
		KmlReferenceCheck.polyStyle(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#polyStyleExample()
	 */
	@Test
	public void polyStyleExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument().withName("PolygonStyle.kml").withOpen(true);
		document.createAndAddStyle().withId("examplePolyStyle")
		.createAndSetPolyStyle().withColor("ff0000cc").withColorMode(ColorMode.RANDOM);
		
		final Placemark placemark = document.createAndAddPlacemark().withName("hollow box").withStyleUrl("#examplePolyStyle");
		final Polygon polygon = placemark.createAndSetPolygon().withExtrude(true).withAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);
		
		polygon.createAndSetOuterBoundaryIs().createAndSetLinearRing()
		.addToCoordinates(-122.3662784465226,37.81884427772081,30)
		.addToCoordinates(-122.3652480684771,37.81926777010555,30)
		.addToCoordinates(-122.365640222455,37.81986126286519,30)
		.addToCoordinates(-122.36666937925,37.81942987753481,30)
		.addToCoordinates(-122.3662784465226,37.81884427772081,30);

		polygon.createAndAddInnerBoundaryIs().createAndSetLinearRing()
		.addToCoordinates("-122.366212593918,37.81897719083808,30")
		.addToCoordinates("-122.3654241733188,37.81929450992014,30")
		.addToCoordinates("-122.3657048517827,37.81973175302663,30")
		.addToCoordinates("-122.3664882465854,37.81940249291773,30")
		.addToCoordinates("-122.366212593918,37.81897719083808,30");
	
		KmlReferenceCheck.polyStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.polyStyleExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#region()
	 */
	@Test
	public void region() {
		final Region region = KmlFactory.createRegion().withId("ID");

		region.createAndSetLatLonAltBox()
		.withNorth(0.0d)
		.withSouth(0.0d)
		.withEast(0.0d)
		.withWest(0.0d)
		.withMinAltitude(0.0)
		.withMaxAltitude(0.0)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		region.createAndSetLod()
		.withMinLodPixels(0.0)
		.withMaxLodPixels(-1.0)
		.withMinFadeExtent(0.0)
		.withMaxFadeExtent(0.0);

		KmlReferenceCheck.region(region);
		final Region marshalledAndBackAgain = Utils.marshalAndUnmarshall(region);
		KmlReferenceCheck.region(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#regionLatLonAltBox()
	 */
	@Test
	public void regionLatLonAltBox() {
		final LatLonAltBox latlonAltBox = KmlFactory.createLatLonAltBox()
		.withNorth(43.374)
		.withSouth(42.983)
		.withEast(-0.335)
		.withWest(-1.423d)
		.withMinAltitude(0.0)
		.withMaxAltitude(0.0)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		KmlReferenceCheck.regionLatLonAltBox(latlonAltBox);
		final LatLonAltBox marshalledAndBackAgain = Utils.marshalAndUnmarshall(latlonAltBox);
		KmlReferenceCheck.regionLatLonAltBox(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#regionLod()
	 */
	@Test
	public void regionLod() {
		final Lod lod = KmlFactory.createLod()
		.withMinLodPixels(256.0)
		.withMaxLodPixels(-1.0)
		.withMinFadeExtent(0.0)
		.withMaxFadeExtent(0.0);

		KmlReferenceCheck.regionLod(lod);
		final Lod marshalledAndBackAgain = Utils.marshalAndUnmarshall(lod);
		KmlReferenceCheck.regionLod(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#regionExample()
	 */
	@Test
	public void regionExample() {
		final Region region = KmlFactory.createRegion();

		region.createAndSetLatLonAltBox()
		.withNorth(50.625)
		.withSouth(45.0d)
		.withEast(28.125)
		.withWest(22.5)
		.withMinAltitude(10.0)
		.withMaxAltitude(50.0)
		.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		region.createAndSetLod()
		.withMinLodPixels(128.0)
		.withMaxLodPixels(1024.0)
		.withMinFadeExtent(128.0)
		.withMaxFadeExtent(128.0);

		KmlReferenceCheck.regionExample(region);
		final Region marshalledAndBackAgain = Utils.marshalAndUnmarshall(region);
		KmlReferenceCheck.regionExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#schema()
	 */
	@Test
	public void schema() {
		final Schema schema = KmlFactory.createSchema()
		.withName("string")
		.withId("ID");

		schema.createAndAddSimpleField()
		.withType("string")
		.withName("string")
		.withDisplayName("...");

		KmlReferenceCheck.schema(schema);
		final Schema marshalledAndBackAgain = Utils.marshalAndUnmarshall(schema);
		KmlReferenceCheck.schema(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#schemaExample()
	 */
	@Test
	public void schemaExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument();

		final Schema schema = document.createAndAddSchema()
		.withName("TrailHeadType")
		.withId("TrailHeadTypeId");

		schema.createAndAddSimpleField()
		.withType("string")
		.withName("TrailHeadName")
		.withDisplayName("<![CDATA[<b>Trail Head Name</b>]]>");

		schema.createAndAddSimpleField()
		.withType("double")
		.withName("TrailLength")
		.withDisplayName("<![CDATA[<i>The length in miles</i>]]>");

		schema.createAndAddSimpleField()
		.withType("int")
		.withName("ElevationGain")
		.withDisplayName("<![CDATA[<i>change in altitude</i>]]>");

		KmlReferenceCheck.schemaExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.schemaExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#screenOverlay()
	 */
	@Test
	public void screenOverlay() {
		final ScreenOverlay screenoverlay = KmlFactory.createScreenOverlay()
		.withId("ID")
		.withVisibility(true)
		.withOpen(false)
		.withName("...")
		.withAtomAuthor(new Author().addToNameOrUriOrEmail("0.0,0.0,0.0"))
		.withAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."))
		.withXalAddressDetails(createAddressDetails())
		.withAddress("...")
		.withPhoneNumber("...")
		.withSnippet(new Snippet().withMaxLines(2).withMaxLines(2).withValue("..."))
		.withDescription("...")
		.withAbstractView(KmlFactory.createCamera())
		.withTimePrimitive(KmlFactory.createTimeSpan())
		.withStyleUrl("...")
		.addToStyleSelector(KmlFactory.createStyle())
		.withRegion(KmlFactory.createRegion())
		.withMetadata(KmlFactory.createMetadata())
		.withExtendedData(KmlFactory.createExtendedData())

		// <!-- inherited from Overlay element -->
		.withColor("ffffffff")
		.withDrawOrder(0)
		.withIcon(new Icon().withHref("..."))
		.withRotation(0.0);

		// <!-- specific to ScreenOverlay -->
		screenoverlay.createAndSetOverlayXY()
		.withX(0.5).withY(0.5)
		.withXunits(Units.FRACTION).withYunits(Units.FRACTION);

		screenoverlay.createAndSetScreenXY()
		.withX(0.5).withY(0.5)
		.withXunits(Units.FRACTION).withYunits(Units.FRACTION);

		screenoverlay.createAndSetSize()
		.withX(0.5).withY(0.5)
		.withXunits(Units.FRACTION).withYunits(Units.FRACTION);

		KmlReferenceCheck.screenOverlay(screenoverlay);
		final ScreenOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(screenoverlay);
		KmlReferenceCheck.screenOverlay(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#screenOverlayExample()
	 */
	@Test
	public void screenOverlayExample() {
		final ScreenOverlay screenoverlay = KmlFactory.createScreenOverlay()
		.withId("khScreenOverlay756")
		// <!-- inherited from Feature element -->
		.withName("Simple crosshairs")
		.withDescription("This screen overlay uses fractional positioning to put the image in the exact center of the screen")

		.withIcon(new Icon().withHref("http://myserver/myimage.jpg"))
		.withRotation(39.37878630116985);

		screenoverlay.createAndSetOverlayXY()
		.withX(0.5)
		.withY(0.5)
		.withXunits(Units.FRACTION)
		.withYunits(Units.FRACTION);

		screenoverlay.createAndSetScreenXY()
		.withX(0.5)
		.withY(0.5)
		.withXunits(Units.FRACTION)
		.withYunits(Units.FRACTION);

		screenoverlay.createAndSetSize()
		.withX(0.0)
		.withY(0.0)
		.withXunits(Units.PIXELS)
		.withYunits(Units.PIXELS);

		KmlReferenceCheck.screenOverlayExample(screenoverlay);
		final ScreenOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(screenoverlay);
		KmlReferenceCheck.screenOverlayExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#style()
	 */
	@Test
	public void style() {
		final Style style = KmlFactory.createStyle()
		.withId("ID")

		// <!-- specific to Style -->
		.withIconStyle(KmlFactory.createIconStyle())
		.withLabelStyle(KmlFactory.createLabelStyle())
		.withLineStyle(KmlFactory.createLineStyle())
		.withPolyStyle(KmlFactory.createPolyStyle())
		.withBalloonStyle(KmlFactory.createBalloonStyle())
		.withListStyle(KmlFactory.createListStyle());

		KmlReferenceCheck.style(style);
		final Style marshalledAndBackAgain = Utils.marshalAndUnmarshall(style);
		KmlReferenceCheck.style(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#styleExample()
	 */
	@Test
	public void styleExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument();

		// <!-- Begin Style Definitions -->
		final Style style = document.createAndAddStyle().withId("myDefaultStyles");

		style.createAndSetIconStyle().withColor("a1ff00ff").withScale(1.399999976158142).withIcon(new Icon().withHref("http://myserver.com/icon.jpg"));
		style.createAndSetLabelStyle().withColor("7fffaaff").withScale(1.5);
		style.createAndSetLineStyle().withColor("ff0000ff").withWidth(15.0);
		style.createAndSetPolyStyle().withColor("7f7faaaa").withColorMode(ColorMode.RANDOM);

		// <!-- Placemark #1 -->
		document.createAndAddPlacemark()
		.withName("Google Earth - New Polygon")
		.withDescription("Here is some descriptive text")
		.withStyleUrl("#myDefaultStyles");

		// <!-- Placemark #2 -->
		document.createAndAddPlacemark()
		.withName("Google Earth - New Path")
		.withStyleUrl("#myDefaultStyles");

		KmlReferenceCheck.styleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.styleExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#styleMap()
	 */
	@Test
	public void styleMap() {
		final StyleMap stylemap = KmlFactory.createStyleMap().withId("ID");
		// <!-- extends StyleSelector -->
		// <!-- elements specific to StyleMap -->
		stylemap.createAndAddPair().withId("ID").withKey(StyleState.NORMAL).withStyleUrl("...");

		KmlReferenceCheck.styleMap(stylemap);
		final StyleMap marshalledAndBackAgain = Utils.marshalAndUnmarshall(stylemap);
		KmlReferenceCheck.styleMap(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#styleMapPair()
	 */
	@Test
	public void styleMapPair() {
		final Pair pair = KmlFactory.createPair()
		.withKey(StyleState.NORMAL)
		.withStyleUrl("http://myserver.com/populationProject.xml#example_style_off");

		KmlReferenceCheck.styleMapPair(pair);
		final Pair marshalledAndBackAgain = Utils.marshalAndUnmarshall(pair);
		KmlReferenceCheck.styleMapPair(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#styleMapExample()
	 */
	@Test
	public void styleMapExample() {
		final Kml kml = KmlFactory.createKml();
		final Document document = kml.createAndSetDocument().withName("StyleMap.kml").withOpen(true);

		// <!-- Begin Style Definitions -->
		final Style style1 = document.createAndAddStyle().withId("normalState");
		style1.createAndSetIconStyle().withScale(1.0).withIcon(new Icon().withHref("http://maps.google.com/mapfiles/kml/pal3/icon55.png"));
		style1.createAndSetLabelStyle().withScale(1.0);

		final Style style2 = document.createAndAddStyle().withId("highlightState");
		style2.createAndSetIconStyle().withScale(1.1).withIcon(new Icon().withHref("http://maps.google.com/mapfiles/kml/pal3/icon60.png"));
		style2.createAndSetLabelStyle().withColor("ff0000c0").withScale(1.1);

		final StyleMap stylemap = document.createAndAddStyleMap().withId("styleMapExample");
		stylemap.createAndAddPair().withKey(StyleState.NORMAL).withStyleUrl("#normalState");
		stylemap.createAndAddPair().withKey(StyleState.HIGHLIGHT).withStyleUrl("#highlightState");

		
		document.createAndAddPlacemark().withName("StyleMap example").withStyleUrl("#styleMapExample")
		.createAndSetPoint().addToCoordinates("-122.368987,37.817634,0");
		
		KmlReferenceCheck.styleMapExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.styleMapExample(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#timeSpan()
	 */
	@Test
	public void timeSpan() {
		final TimeSpan timespan = KmlFactory.createTimeSpan()
		.withBegin("...")
		.withEnd("...");

		KmlReferenceCheck.timeSpan(timespan);
		final TimeSpan marshalledAndBackAgain = Utils.marshalAndUnmarshall(timespan);
		KmlReferenceCheck.timeSpan(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#timeStamp()
	 */
	@Test
	public void timeStamp() {
		final TimeStamp timestamp = KmlFactory.createTimeStamp()
		.withWhen("...");

		KmlReferenceCheck.timeStamp(timestamp);
		final TimeStamp marshalledAndBackAgain = Utils.marshalAndUnmarshall(timestamp);
		KmlReferenceCheck.timeStamp(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#updateChange()
	 */
	@Test
	public void updateChange() {
		final Change change = KmlFactory.createChange();
		final NetworkLinkControl networklink = KmlFactory.createNetworkLinkControl();
		networklink.createAndSetUpdate("http://www/~sam/January14Data/Point.kml",  new ArrayList<Object>())
		.addToCreateOrDeleteOrChange(change);
		
		final Point point = new Point().withTargetId("point123").addToCoordinates("-95.48,40.43,0");
		change.addToAbstractObject(point);
		
		KmlReferenceCheck.updateChange(networklink);
		final NetworkLinkControl marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklink);
		KmlReferenceCheck.updateChange(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#updateCreate()
	 */
	@Test
	public void updateCreate() {
		
		final Create create = KmlFactory.createCreate();
		final Update update = KmlFactory.createUpdate("http://myserver.com/Point.kml",  new ArrayList<Object>()).addToCreateOrDeleteOrChange(create);
		
		create.createAndAddDocument().withTargetId("region24").createAndAddPlacemark().withId("placemark891")
		.createAndSetPoint().addToCoordinates("-95.48,40.43,0");

		KmlReferenceCheck.updateCreate(update);
		final Update marshalledAndBackAgain = Utils.marshalAndUnmarshall(update);
		KmlReferenceCheck.updateCreate(marshalledAndBackAgain);
	}

	/**
	 * 
	 * @see de.micromata.jak.internal.IKmlReference#updateDelete()
	 */
	@Test
	public void updateDelete() {
		final Delete delete = new Delete();
		final Update update = KmlFactory.createUpdate("http://www.foo.com/Point.kml",  new ArrayList<Object>()).addToCreateOrDeleteOrChange(delete);
		final Placemark placemark = new Placemark().withTargetId("pa3556");
		
		delete.addToFeature(placemark);

		KmlReferenceCheck.updateDelete(update);
		final Update marshalledAndBackAgain = Utils.marshalAndUnmarshall(update);
		KmlReferenceCheck.updateDelete(marshalledAndBackAgain);
	}

}
