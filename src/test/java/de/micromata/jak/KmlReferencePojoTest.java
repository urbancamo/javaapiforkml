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
public final class KmlReferencePojoTest implements IKMLReference {
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(KmlReferencePojoTest.class.getName());

	/**
	 * @see de.micromata.jak.internal.IKmlReference#ballonStyle()
	 */
	@Test
	public void ballonStyle() {
		final BalloonStyle balloonstyle = new BalloonStyle();
		balloonstyle.setId("ID");
		// <!-- specific to BalloonStyle -->
		balloonstyle.setBgColor("ffffffff");
		balloonstyle.setTextColor("ff000000");
		balloonstyle.setText("...");
		balloonstyle.setDisplayMode(DisplayMode.DEFAULT);

		KmlReferenceCheck.ballonStyle(balloonstyle);
		final BalloonStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(balloonstyle);
		KmlReferenceCheck.ballonStyle(marshalledAndBackAgain);

		KmlReferenceCheck.ballonStyle(balloonstyle, marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#ballonStyleExample()
	 */
	@Test
	public void ballonStyleExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);

		document.setName("BalloonStyle.kml");
		document.setOpen(true);

		final Style style = new Style();
		document.getStyleSelector().add(style);
		style.setId("exampleBalloonStyle");

		final BalloonStyle balloonstyle = new BalloonStyle();
		style.setBalloonStyle(balloonstyle);
		balloonstyle.setId("ID");
		balloonstyle.setBgColor("ffffffbb");
		balloonstyle.setTextColor("ff000000");
		balloonstyle
		    .setText("<![CDATA[" + "<b><font color='#CC0000' size='+3'>$[name]</font></b>" + "<br/><br/>" + "<font face='Courier'>$[description]</font>" + "<br/><br/>" + "Extra text that will appear in the description balloon" + "<br/><br/>" + "<!-- insert the to/from hyperlinks -->" + "$[geDirections]]]>");

		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("BalloonStyle");
		placemark.setDescription("An example of BalloonStyle");
		placemark.setStyleUrl("#exampleBalloonStyle");

		final Point point = new Point();
		placemark.setGeometry(point);
		final List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-122.370533, 37.823842, 0));

		KmlReferenceCheck.ballonStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.ballonStyleExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#camera()
	 */
	@Test
	public void camera() {
		final Camera camera = new Camera();
		camera.setId("ID");
		camera.setLongitude(0.0);
		camera.setLatitude(0.0);
		camera.setAltitude(0.0);
		camera.setHeading(0.0);
		camera.setTilt(0.0);
		camera.setRoll(0.0);
		camera.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		KmlReferenceCheck.camera(camera);
		final Camera marshalledAndBackAgain = Utils.marshalAndUnmarshall(camera);
		KmlReferenceCheck.camera(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#document()
	 */
	@Test
	public void document() {
		final Document document = new Document();
		document.setId("ID");
		document.setName("...");
		document.setVisibility(true);
		document.setOpen(false);
		final Author author = new Author();
		// author.setName("...");
		author.getNameOrUriOrEmail().add("...");
		document.setAtomAuthor(author);
		document.setAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."));
		document.setAddress("...");
		document.setXalAddressDetails(createAddressDetails());
		document.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		snippet.setMaxLines(2);
		snippet.setValue("...");
		document.setSnippet(snippet);
		document.setDescription("...");

		document.setAbstractView(new Camera());
		document.setTimePrimitive(new TimeSpan());
		document.setStyleUrl("...");
		document.getStyleSelector().add(new Style());
		document.setRegion(new Region());
		document.setMetadata(new Metadata());
		document.setExtendedData(new ExtendedData());

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
	 * @see de.micromata.jak.internal.IKmlReference#documentExample()
	 */
	@Test
	public void documentExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);

		document.setName("Document.kml");
		document.setOpen(true);

		final Style style = new Style();
		document.getStyleSelector().add(style);
		style.setId("exampleStyleDocument");

		final LabelStyle labelStyle = new LabelStyle();
		style.setLabelStyle(labelStyle);

		labelStyle.setColor("ff0000cc");

		final Placemark placemark1 = new Placemark();
		document.getFeature().add(placemark1);
		placemark1.setName("Document Feature 1");
		placemark1.setStyleUrl("#exampleStyleDocument");

		final Point point1 = new Point();
		placemark1.setGeometry(point1);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		point1.setCoordinates(coord1);
		coord1.add(new Coordinate(-122.371, 37.816, 0));

		final Placemark placemark2 = new Placemark();
		document.getFeature().add(placemark2);
		placemark2.setName("Document Feature 2");
		placemark2.setDescription("An example of BalloonStyle");
		placemark2.setStyleUrl("#exampleStyleDocument");

		final Point point2 = new Point();
		placemark2.setGeometry(point2);
		List<Coordinate> coord2 = new ArrayList<Coordinate>();
		point2.setCoordinates(coord2);
		coord2.add(new Coordinate(-122.370, 37.817, 0));

		KmlReferenceCheck.documentExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.documentExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#extendedData()
	 */
	@Test
	public void extendedData() {
		final ExtendedData extendedData = new ExtendedData();
		final Data data = new Data("...");
		extendedData.getData().add(data);

		data.setName("string");
		data.setDisplayName("...");
		// data.setValue("...");

		final SchemaData schemaData = new SchemaData();
		extendedData.getSchemaData().add(schemaData);

		schemaData.setSchemaUrl("anyURI");
		final SimpleData sd = new SimpleData("");
		// sd.setName("");
		sd.setValue("...");
		schemaData.getSimpleData().add(sd);

		// FIXME: rename to: <namespace_prefix:other>...</namespace_prefix:other>
		// extendedData.addToAny("...");

		KmlReferenceCheck.extendedData(extendedData);
		final ExtendedData marshalledAndBackAgain = Utils.marshalAndUnmarshall(extendedData);
		KmlReferenceCheck.extendedData(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#extendedDataValue()
	 */
	@Test
	public void extendedDataValue() {
		final Placemark placemark = new Placemark();
		placemark.setName("Club house");
		final ExtendedData extendedData = new ExtendedData();
		placemark.setExtendedData(extendedData);

		final Data data1 = new Data("1");
		extendedData.getData().add(data1);
		data1.setName("holeNumber");

		final Data data2 = new Data("4");
		extendedData.getData().add(data2);
		data2.setName("holePar");

		KmlReferenceCheck.extendedDataValue(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.extendedDataValue(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#extendedDataSimpleData()
	 */
	@Test
	public void extendedDataSimpleData() {
		final Document document = new Document();
		final Placemark placemark1 = new Placemark();
		document.getFeature().add(placemark1);
		placemark1.setName("Easy trail");
		final ExtendedData extendedData1 = new ExtendedData();
		placemark1.setExtendedData(extendedData1);

		final SchemaData schemaData1 = new SchemaData();
		schemaData1.setSchemaUrl("#TrailHeadTypeId");
		extendedData1.getSchemaData().add(schemaData1);
		final SimpleData sd11 = new SimpleData("TrailHeadName");
		sd11.setValue("Pi in the sky");
		final SimpleData sd12 = new SimpleData("TrailLength");
		sd12.setValue("3.14159");
		final SimpleData sd13 = new SimpleData("ElevationGain");
		sd13.setValue("10");
		schemaData1.getSimpleData().add(sd11);
		schemaData1.getSimpleData().add(sd12);
		schemaData1.getSimpleData().add(sd13);

		final Point point1 = new Point();
		placemark1.setGeometry(point1);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		point1.setCoordinates(coord1);
		coord1.add(new Coordinate(-122.000, 37.002));

		final Placemark placemark2 = new Placemark();
		document.getFeature().add(placemark2);
		placemark2.setName("Difficult trail");
		final ExtendedData extendedData2 = new ExtendedData();
		placemark2.setExtendedData(extendedData2);

		final SchemaData schemaData2 = new SchemaData();
		schemaData2.setSchemaUrl("#TrailHeadTypeId");
		extendedData2.getSchemaData().add(schemaData2);

		final SimpleData sd21 = new SimpleData("TrailHeadName");
		sd21.setValue("Mount Everest");
		final SimpleData sd22 = new SimpleData("TrailLength");
		sd22.setValue("347.45");
		final SimpleData sd23 = new SimpleData("ElevationGain");
		sd23.setValue("10000");
		schemaData2.getSimpleData().add(sd21);
		schemaData2.getSimpleData().add(sd22);
		schemaData2.getSimpleData().add(sd23);

		final Point point2 = new Point();
		placemark2.setGeometry(point2);
		List<Coordinate> coord2 = new ArrayList<Coordinate>();
		point2.setCoordinates(coord2);
		coord2.add(new Coordinate(-122.000, 37.002));

		KmlReferenceCheck.extendedDataSimpleData(document);
		final Document marshalledAndBackAgain = Utils.marshalAndUnmarshall(document);
		KmlReferenceCheck.extendedDataSimpleData(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#extendedDataNameSapcePrefix()
	 */
	// FIXME: <ExtendedData xmlns:prefix="camp">
	// FIXME: <camp:number>14</camp:number>
	// FIXME: <camp:parkingSpaces>2</camp:parkingSpaces>
	// FIXME: <camp:tentSites>4</camp:tentSites>
	@Test
	public void extendedDataNameSapcePrefix() {
		final ExtendedData extendedData = new ExtendedData();
		// FIXME: rename to: <namespace_prefix:other>...</namespace_prefix:other>
		// extendedData.

		KmlReferenceCheck.extendedDataNameSapcePrefix(extendedData);
		final ExtendedData marshalledAndBackAgain = Utils.marshalAndUnmarshall(extendedData);
		KmlReferenceCheck.extendedDataNameSapcePrefix(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#featureAscriptionElement()
	 */
	@Test
	public void featureAscriptionElement() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);

		final Author author = new Author();
		document.setAtomAuthor(author);
		author.getNameOrUriOrEmail().add("J. K. Rowling");
		final de.micromata.opengis.kml.v_2_2_0.atom.Link link = new de.micromata.opengis.kml.v_2_2_0.atom.Link("http://www.harrypotter.com");
		document.setAtomLink(link);

		final Placemark placemark1 = new Placemark();
		document.getFeature().add(placemark1);
		placemark1.setName("Hogwarts");

		final Point point1 = new Point();
		placemark1.setGeometry(point1);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		point1.setCoordinates(coord1);
		coord1.add(new Coordinate(1, 1));

		final Placemark placemark2 = new Placemark();
		document.getFeature().add(placemark2);
		placemark2.setName("Little Hangleton");

		final Point point2 = new Point();
		placemark2.setGeometry(point2);
		List<Coordinate> coord2 = new ArrayList<Coordinate>();
		point2.setCoordinates(coord2);
		coord2.add(new Coordinate(1, 2));

		KmlReferenceCheck.featureAscriptionElement(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.featureAscriptionElement(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#folder()
	 */
	@Test
	public void folder() {
		final Folder folder = new Folder();
		folder.setId("ID");
		folder.setVisibility(true);
		folder.setOpen(false);
		folder.setName("...");

		final Author author = new Author();
		// FIXME:
		// author.setName("...");
		author.getNameOrUriOrEmail().add("...");
		folder.setAtomAuthor(author);
		final de.micromata.opengis.kml.v_2_2_0.atom.Link link = new de.micromata.opengis.kml.v_2_2_0.atom.Link("...");
		folder.setAtomLink(link);
		folder.setAddress("...");
		final AddressDetails addressDetails = createAddressDetails();
		folder.setXalAddressDetails(addressDetails);
		folder.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		snippet.setMaxLines(2);
		snippet.setValue("...");
		folder.setSnippet(snippet);
		folder.setDescription("...");

		folder.setAbstractView(new Camera());
		folder.setTimePrimitive(new TimeSpan());
		folder.setStyleUrl("...");
		folder.getStyleSelector().add(new Style());
		final Region region = new Region();
		folder.setRegion(region);
		final Metadata metaData = new Metadata();
		folder.setMetadata(metaData);
		final ExtendedData extendedData = new ExtendedData();
		folder.setExtendedData(extendedData);

		KmlReferenceCheck.folder(folder);
		final Folder marshalledAndBackAgain = Utils.marshalAndUnmarshall(folder);
		KmlReferenceCheck.folder(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#folderExample()
	 */
	@Test
	public void folderExample() {
		final Kml kml = new Kml();
		final Folder folder = new Folder();
		kml.setFeature(folder);

		folder.setName("Folder.kml");
		folder.setOpen(true);
		folder.setDescription("A folder is a container that can hold multiple other objects");

		final Placemark placemark1 = new Placemark();
		folder.getFeature().add(placemark1);
		placemark1.setName("Folder object 1 (Placemark)");

		final Point point1 = new Point();
		placemark1.setGeometry(point1);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		point1.setCoordinates(coord1);
		coord1.add(new Coordinate(-122.377588, 37.830266, 0));

		final Placemark placemark2 = new Placemark();
		folder.getFeature().add(placemark2);
		placemark2.setName("Folder object 2 (Polygon)");

		final Polygon polygon = new Polygon();
		placemark2.setGeometry(polygon);
		final Boundary boundary = new Boundary();
		polygon.setOuterBoundaryIs(boundary);

		final LinearRing linearRing = new LinearRing();
		boundary.setLinearRing(linearRing);
		List<Coordinate> coord2 = new ArrayList<Coordinate>();
		linearRing.setCoordinates(coord2);
		coord2.add(new Coordinate(-122.377830, 37.830445, 0));
		coord2.add(new Coordinate(-122.377576, 37.830631, 0));
		coord2.add(new Coordinate(-122.377840, 37.830642, 0));
		coord2.add(new Coordinate(-122.377830, 37.830445, 0));

		final Placemark placemark3 = new Placemark();
		folder.getFeature().add(placemark3);
		placemark3.setName("Folder object 3 (Path)");

		final LineString lineString = new LineString();
		placemark3.setGeometry(lineString);
		lineString.setTessellate(true);
		List<Coordinate> coord3 = new ArrayList<Coordinate>();
		lineString.setCoordinates(coord3);
		coord3.add(new Coordinate(-122.378009, 37.830128, 0));
		coord3.add(new Coordinate(-122.377885, 37.830379, 0));

		KmlReferenceCheck.folderExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.folderExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#groundOverlay()
	 */
	@Test
	public void groundOverlay() {
		final GroundOverlay groundoverlay = new GroundOverlay();
		// inherited from Feature element
		groundoverlay.setId("ID");
		groundoverlay.setName("...");
		groundoverlay.setVisibility(true);
		groundoverlay.setOpen(false);

		final Author author = new Author();
		// FIXME: author.setName("...");
		author.getNameOrUriOrEmail().add("...");
		groundoverlay.setAtomAuthor(author);
		final de.micromata.opengis.kml.v_2_2_0.atom.Link link = new de.micromata.opengis.kml.v_2_2_0.atom.Link("...");
		groundoverlay.setAtomLink(link);
		groundoverlay.setAddress("...");
		final AddressDetails addressDetails = createAddressDetails();
		groundoverlay.setXalAddressDetails(addressDetails);
		groundoverlay.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		snippet.setMaxLines(2);
		snippet.setValue("...");
		groundoverlay.setSnippet(snippet);
		groundoverlay.setDescription("...");

		groundoverlay.setAbstractView(new Camera());
		groundoverlay.setTimePrimitive(new TimeSpan());
		groundoverlay.setStyleUrl("...");
		groundoverlay.getStyleSelector().add(new Style());
		final Region region = new Region();
		groundoverlay.setRegion(region);
		final Metadata metaData = new Metadata();
		groundoverlay.setMetadata(metaData);
		final ExtendedData extendedData = new ExtendedData();
		groundoverlay.setExtendedData(extendedData);

		// inherited from Overlay element
		groundoverlay.setColor("ffffffff");
		groundoverlay.setDrawOrder(0);
		final Icon icon = new Icon();
		icon.setHref("...");
		groundoverlay.setIcon(icon);

		// specific to GroundOverlay
		groundoverlay.setAltitude(0.0d);
		groundoverlay.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		final LatLonBox latlonBox = new LatLonBox();
		groundoverlay.setLatLonBox(latlonBox);
		latlonBox.setNorth(0.0d);
		latlonBox.setSouth(0.0d);
		latlonBox.setEast(0.0d);
		latlonBox.setWest(0.0d);
		latlonBox.setRotation(0.0d);

		KmlReferenceCheck.groundoverlay(groundoverlay);
		final GroundOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(groundoverlay, true);
		Utils.marshal(marshalledAndBackAgain);
		KmlReferenceCheck.groundoverlay(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#groundOverlayLatLonBox()
	 */
	@Test
	public void groundOverlayLatLonBox() {
		final LatLonBox latlonBox = new LatLonBox();
		latlonBox.setNorth(48.25475939255556d);
		latlonBox.setSouth(48.25207367852141d);
		latlonBox.setEast(-90.86591508839973d);
		latlonBox.setWest(-90.8714285289695d);
		latlonBox.setRotation(39.37878630116985d);

		KmlReferenceCheck.groundOverlayLatLonBox(latlonBox);
		final LatLonBox marshalledAndBackAgain = Utils.marshalAndUnmarshall(latlonBox);
		KmlReferenceCheck.groundOverlayLatLonBox(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#groundOverlayExample()
	 */
	@Test
	public void groundOverlayExample() {
		final Kml kml = new Kml();
		final GroundOverlay groundoverlay = new GroundOverlay();
		kml.setFeature(groundoverlay);

		groundoverlay.setName("GroundOverlay.kml");
		groundoverlay.setColor("7fffffff");
		groundoverlay.setDrawOrder(1);

		final Icon icon = new Icon();
		groundoverlay.setIcon(icon);
		icon.setHref("http://www.google.com/intl/en/images/logo.gif");
		icon.setRefreshMode(RefreshMode.ON_INTERVAL);
		icon.setRefreshInterval(86400d);
		icon.setViewBoundScale(0.75d);

		final LatLonBox latlonBox = new LatLonBox();
		groundoverlay.setLatLonBox(latlonBox);
		latlonBox.setNorth(37.83234d);
		latlonBox.setSouth(37.832122d);
		latlonBox.setEast(-122.373033d);
		latlonBox.setWest(-122.373724d);
		latlonBox.setRotation(45d);

		KmlReferenceCheck.groundOverlayExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.groundOverlayExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#icon()
	 */
	@Test
	public void icon() {
		final Icon icon = new Icon();
		icon.setHref("...");
		icon.setRefreshMode(RefreshMode.ON_CHANGE);
		icon.setRefreshInterval(4d);
		icon.setViewRefreshMode(ViewRefreshMode.NEVER);
		icon.setViewRefreshTime(4d);
		icon.setViewBoundScale(1d);
		icon.setHttpQuery("...");

		KmlReferenceCheck.icon(icon);
		final Icon marshalledAndBackAgain = Utils.marshalAndUnmarshall(icon);
		KmlReferenceCheck.icon(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#iconStyle()
	 */
	@Test
	public void iconStyle() {
		// <!-- inherited from ColorStyle -->
		final IconStyle iconstyle = new IconStyle();
		iconstyle.setColor("ffffffff");
		iconstyle.setColorMode(ColorMode.NORMAL);

		// <!-- specific to IconStyle -->
		iconstyle.setScale(1.0d);
		iconstyle.setHeading(0d);

		final Icon icon = new Icon();
		iconstyle.setIcon(icon);
		icon.setHref("...");
		final Vec2 hotspot = new Vec2();
		hotspot.setX(0.5d);
		hotspot.setY(0.5d);
		hotspot.setXunits(Units.FRACTION);
		hotspot.setYunits(Units.FRACTION);
		iconstyle.setHotSpot(hotspot);

		KmlReferenceCheck.iconStyle(iconstyle);
		final IconStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(iconstyle);
		KmlReferenceCheck.iconStyle(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#iconStyleExample()
	 */
	@Test
	public void iconStyleExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		final Style style = new Style();
		document.getStyleSelector().add(style);
		style.setId("randomColorIcon");

		final IconStyle iconstyle = new IconStyle();
		style.setIconStyle(iconstyle);
		iconstyle.setColor("ff00ff00");
		iconstyle.setColorMode(ColorMode.RANDOM);
		iconstyle.setScale(1.1d);

		final Icon icon = new Icon();
		iconstyle.setIcon(icon);
		icon.setHref("http://maps.google.com/mapfiles/kml/pal3/icon21.png");

		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("IconStyle.kml");
		placemark.setStyleUrl("#randomColorIcon");
		final Point point = new Point();
		placemark.setGeometry(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-122.36868, 37.831145, 0));

		KmlReferenceCheck.iconStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.iconStyleExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#kml()
	 */
	@Test
	public void kml() {
		final Kml kml = new Kml();
		kml.setHint("sky");

		KmlReferenceCheck.kml(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.kml(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#labelStyle()
	 */
	@Test
	public void labelStyle() {
		final LabelStyle labelstyle = new LabelStyle();
		// <!-- inherited from ColorStyle -->
		labelstyle.setColor("ffffffff");
		labelstyle.setColorMode(ColorMode.NORMAL);

		// <!-- specific to LabelStyle -->
		labelstyle.setScale(1.0d);

		KmlReferenceCheck.labelStyle(labelstyle);
		final LabelStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(labelstyle);
		KmlReferenceCheck.labelStyle(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#labelStyleExample()
	 */
	@Test
	public void labelStyleExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		final Style style = new Style();
		document.getStyleSelector().add(style);
		style.setId("randomLabelColor");

		final LabelStyle labelstyle = new LabelStyle();
		style.setLabelStyle(labelstyle);
		labelstyle.setColor("ff0000cc");
		labelstyle.setColorMode(ColorMode.RANDOM);
		labelstyle.setScale(1.5d);

		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("LabelStyle.kml");
		placemark.setStyleUrl("#randomLabelColor");
		final Point point = new Point();
		placemark.setGeometry(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-122.367375, 37.829192, 0));

		KmlReferenceCheck.labelStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.labelStyleExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#linearRing()
	 */
	@Test
	public void linearRing() {
		final LinearRing linearring = new LinearRing();
		linearring.setId("ID");
		// <!-- specific to LinearRing -->
		linearring.setExtrude(true);
		linearring.setTessellate(true);
		linearring.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);// setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		linearring.setCoordinates(coord);
		coord.add(new Coordinate(0.0, 0.0, 0.0));

		KmlReferenceCheck.linearRing(linearring);
		final LinearRing marshalledAndBackAgain = Utils.marshalAndUnmarshall(linearring);
		KmlReferenceCheck.linearRing(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#linearRingExample()
	 */
	@Test
	public void linearRingExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);

		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("LinearRing.kml");

		final Polygon polygon = new Polygon();
		placemark.setGeometry(polygon);
		final Boundary boundary = new Boundary();
		polygon.setOuterBoundaryIs(boundary);

		final LinearRing linearring = new LinearRing();
		boundary.setLinearRing(linearring);

		List<Coordinate> coord = new ArrayList<Coordinate>();
		linearring.setCoordinates(coord);
		coord.add(new Coordinate(-122.365662, 37.826988, 0));
		coord.add(new Coordinate(-122.365202, 37.826302, 0));
		coord.add(new Coordinate(-122.364581, 37.82655, 0));
		coord.add(new Coordinate(-122.365038, 37.827237, 0));
		coord.add(new Coordinate(-122.365662, 37.826988, 0));

		KmlReferenceCheck.linearRingExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.linearRingExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#lineString()
	 */
	@Test
	public void lineString() {
		final LineString linestring = new LineString();
		linestring.setId("ID");
		linestring.setExtrude(false);
		linestring.setTessellate(false);
		linestring.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		List<Coordinate> coord = new ArrayList<Coordinate>();
		linestring.setCoordinates(coord);
		coord.add(new Coordinate(0.0, 0.0, 0.0));

		KmlReferenceCheck.lineString(linestring);
		final LineString marshalledAndBackAgain = Utils.marshalAndUnmarshall(linestring);
		KmlReferenceCheck.lineString(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#lineStringExample()
	 */
	@Test
	public void lineStringExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		document.setName("LineString.kml");
		document.setOpen(true);

		final LookAt lookat = new LookAt();
		lookat.setLongitude(-122.36415);
		lookat.setLatitude(37.824553);
		lookat.setRange(150.0d);
		lookat.setTilt(50.0d);
		lookat.setHeading(0.0d);

		document.setAbstractView(lookat);

		final Placemark placemark1 = new Placemark();
		document.getFeature().add(placemark1);
		placemark1.setName("unextruded");
		final LineString linestring1 = new LineString();
		placemark1.setGeometry(linestring1);
		linestring1.setExtrude(false);
		linestring1.setTessellate(true);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		linestring1.setCoordinates(coord1);
		coord1.add(new Coordinate(-122.364383, 37.824664, 0));
		coord1.add(new Coordinate(-122.364152, 37.824322, 0));

		final Placemark placemark2 = new Placemark();
		document.getFeature().add(placemark2);
		placemark2.setName("extruded");
		final LineString linestring2 = new LineString();
		placemark2.setGeometry(linestring2);
		linestring2.setExtrude(true);
		linestring2.setTessellate(true);
		List<Coordinate> coord2 = new ArrayList<Coordinate>();
		linestring2.setCoordinates(coord2);
		coord2.add(new Coordinate(-122.364167, 37.824787, 50));
		coord2.add(new Coordinate(-122.363917, 37.824423, 50));

		KmlReferenceCheck.lineStringExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.lineStringExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#lineStyle()
	 */
	@Test
	public void lineStyle() {
		final LineStyle linestyle = new LineStyle();
		linestyle.setId("ID");
		// <!-- inherited from ColorStyle -->
		linestyle.setColor("ffffffff");
		linestyle.setColorMode(ColorMode.NORMAL);
		// <!-- specific to LineStyle -->
		linestyle.setWidth(1.0d);

		KmlReferenceCheck.lineStyle(linestyle);
		final LineStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(linestyle);
		KmlReferenceCheck.lineStyle(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#lineStyleExample()
	 */
	@Test
	public void lineStyleExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		document.setName("LineStyle.kml");
		document.setOpen(true);

		final Style style = new Style();
		document.getStyleSelector().add(style);
		style.setId("linestyleExample");

		final LineStyle linestyle = new LineStyle();
		style.setLineStyle(linestyle);
		linestyle.setColor("7f0000ff");
		linestyle.setWidth(4.0d);

		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("LineStyle Example");
		placemark.setStyleUrl("#linestyleExample");
		final LineString linestring = new LineString();
		placemark.setGeometry(linestring);
		linestring.setExtrude(true);
		linestring.setTessellate(true);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		linestring.setCoordinates(coord1);
		coord1.add(new Coordinate(-122.364383, 37.824664, 0));
		coord1.add(new Coordinate(-122.364152, 37.824322, 0));

		KmlReferenceCheck.lineStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.lineStyleExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#link()
	 */
	@Test
	public void link() {
		final Link link = new Link();
		link.setId("ID");
		link.setHref("...");
		link.setRefreshMode(RefreshMode.ON_CHANGE);
		link.setRefreshInterval(4.0d);
		link.setViewRefreshMode(ViewRefreshMode.NEVER);
		link.setViewRefreshTime(4.0d);
		link.setViewBoundScale(1.0d);
		link.setViewFormat("BBOX=bboxWest");
		link.setHttpQuery("...");

		KmlReferenceCheck.link(link);
		final Link marshalledAndBackAgain = Utils.marshalAndUnmarshall(link);
		KmlReferenceCheck.link(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#linkExample()
	 */
	@Test
	public void linkExample() {
		final NetworkLink networklink = new NetworkLink();
		networklink.setName("NE US Radar");
		networklink.setFlyToView(true);

		final Link link = new Link();
		networklink.setLink(link);
		link.setHref("http://www.example.com/geotiff/NE/MergedReflectivityQComposite.kml");
		link.setRefreshMode(RefreshMode.ON_INTERVAL);
		link.setRefreshInterval(30.0d);
		link.setViewRefreshMode(ViewRefreshMode.ON_STOP);
		link.setViewRefreshTime(7.0d);
		link.setViewFormat("BBOX=bboxWest");

		link.setHttpQuery("...");

		KmlReferenceCheck.linkExample(networklink);
		final NetworkLink marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklink);
		KmlReferenceCheck.linkExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#listStyle()
	 */
	@Test
	public void listStyle() {
		final ListStyle liststyle = new ListStyle();
		liststyle.setId("ID");
		// <!-- specific to ListStyle -->
		liststyle.setListItemType(ListItemType.CHECK);
		liststyle.setBgColor("ffffffff");

		final ItemIcon itemicon = new ItemIcon();
		liststyle.getItemIcon().add(itemicon);

		itemicon.getState().add(ItemIconState.OPEN);
		itemicon.setHref("...");

		KmlReferenceCheck.listStyle(liststyle);
		final ListStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(liststyle);
		KmlReferenceCheck.listStyle(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#lookAt()
	 */
	@Test
	public void lookAt() {
		final LookAt lookat = new LookAt();
		// <!-- inherited from AbstractView element -->
		// TODO <TimePrimitive>...</TimePrimitive> <!-- gx:TimeSpan or gx:TimeStamp -->

		// <!-- specific to LookAt -->
		lookat.setLongitude(0.0);
		lookat.setLatitude(0.0);
		lookat.setRange(0.0);
		lookat.setTilt(0.0);
		lookat.setHeading(0.0);
		lookat.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		KmlReferenceCheck.lookAt(lookat);
		final LookAt marshalledAndBackAgain = Utils.marshalAndUnmarshall(lookat);
		KmlReferenceCheck.lookAt(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#lookAtExample()
	 */
	@Test
	public void lookAtExample() {
		final Kml kml = new Kml();
		final Placemark placemark = new Placemark();
		kml.setFeature(placemark);
		placemark.setName("LookAt.kml");
		final LookAt lookat = new LookAt();
		placemark.setAbstractView(lookat);

		lookat.setLongitude(-122.363);
		lookat.setLatitude(37.81);
		lookat.setAltitude(2000.0d);
		lookat.setRange(500.0);
		lookat.setTilt(45.0);
		lookat.setHeading(0.0);
		lookat.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);

		final Point point = new Point();
		placemark.setGeometry(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-122.363, 37.82, 0));

		KmlReferenceCheck.lookAtExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.lookAtExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#model()
	 */
	@Test
	public void model() {
		final Model model = new Model();
		model.setId("ID");
		model.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		final Location location = new Location();
		model.setLocation(location);
		location.setLongitude(0.0);
		location.setLatitude(0.0);
		location.setAltitude(0.0);

		final Orientation orientation = new Orientation();
		model.setOrientation(orientation);
		orientation.setHeading(0.0);
		orientation.setTilt(0.0);
		orientation.setRoll(0.0);

		final Scale scale = new Scale();
		model.setScale(scale);
		scale.setX(1.0);
		scale.setY(1.0);
		scale.setZ(1.0);

		final Link link = new Link();
		link.setHref("...");
		model.setLink(link);

		final ResourceMap resourcemap = new ResourceMap();
		model.setResourceMap(resourcemap);
		final Alias alias = new Alias();
		resourcemap.getAlias().add(alias);
		alias.setTargetHref("...");
		alias.setSourceHref("...");

		KmlReferenceCheck.model(model);
		final Model marshalledAndBackAgain = Utils.marshalAndUnmarshall(model);
		KmlReferenceCheck.model(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#modelLocation()
	 */
	@Test
	public void modelLocation() {
		final Location location = new Location();
		location.setLongitude(39.55375305703105);
		location.setLatitude(-118.9813220168456);
		location.setAltitude(1223.0);

		KmlReferenceCheck.modelLocation(location);
		final Location marshalledAndBackAgain = Utils.marshalAndUnmarshall(location);
		KmlReferenceCheck.modelLocation(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#modelOrientation()
	 */
	@Test
	public void modelOrientation() {
		final Orientation orientation = new Orientation();
		orientation.setHeading(45.0);
		orientation.setTilt(10.0);
		orientation.setRoll(0.0);

		KmlReferenceCheck.modelOrientation(orientation);
		final Orientation marshalledAndBackAgain = Utils.marshalAndUnmarshall(orientation);
		KmlReferenceCheck.modelOrientation(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#modelScale()
	 */
	@Test
	public void modelScale() {

		final Scale scale = new Scale();
		scale.setX(2.5);
		scale.setY(2.5);
		scale.setZ(3.5);

		KmlReferenceCheck.modelScale(scale);
		final Scale marshalledAndBackAgain = Utils.marshalAndUnmarshall(scale);
		KmlReferenceCheck.modelScale(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#modelResourceMap()
	 */
	@Test
	public void modelResourceMap() {
		final Alias alias = new Alias();
		alias.setTargetHref("../images/foo.jpg");
		alias.setSourceHref("c:\\mytextures\\foo.jpg");

		KmlReferenceCheck.modelResourceMap(alias);
		final Alias marshalledAndBackAgain = Utils.marshalAndUnmarshall(alias);
		KmlReferenceCheck.modelResourceMap(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#modelExample()
	 */
	@Test
	public void modelExample() {
		final Model model = new Model();
		model.setId("khModel543");
		model.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);
		final Location location = new Location();
		model.setLocation(location);
		location.setLongitude(39.55375305703105);
		location.setLatitude(-118.9813220168456);
		location.setAltitude(1223.0);

		final Orientation orientation = new Orientation();
		model.setOrientation(orientation);
		orientation.setHeading(45.0);
		orientation.setTilt(10.0);
		orientation.setRoll(0.0);

		final Scale scale = new Scale();
		model.setScale(scale);
		scale.setX(1.0);
		scale.setY(1.0);
		scale.setZ(1.0);

		final Link link = new Link();
		model.setLink(link);
		link.setHref("house.dae");
		link.setRefreshMode(RefreshMode.ON_CHANGE);

		final ResourceMap resourcemap = new ResourceMap();
		model.setResourceMap(resourcemap);
		final Alias alias1 = new Alias();
		resourcemap.getAlias().add(alias1);
		alias1.setTargetHref("../files/CU-Macky---Center-StairsnoCulling.jpg");
		alias1.setSourceHref("CU-Macky---Center-StairsnoCulling.jpg");

		final Alias alias2 = new Alias();
		resourcemap.getAlias().add(alias2);
		alias2.setTargetHref("../files/CU-Macky-4sideturretnoCulling.jpg");
		alias2.setSourceHref("CU-Macky-4sideturretnoCulling.jpg");

		final Alias alias3 = new Alias();
		resourcemap.getAlias().add(alias3);
		alias3.setTargetHref("../files/CU-Macky-Back-NorthnoCulling.jpg");
		alias3.setSourceHref("CU-Macky-Back-NorthnoCulling.jpg");

		KmlReferenceCheck.modelExample(model);
		final Model marshalledAndBackAgain = Utils.marshalAndUnmarshall(model);
		KmlReferenceCheck.modelExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#multiGeometry()
	 */
	@Test
	public void multiGeometry() {
		final MultiGeometry multigeometry = new MultiGeometry();
		multigeometry.setId("ID");

		KmlReferenceCheck.multiGeometry(multigeometry);
		final MultiGeometry marshalledAndBackAgain = Utils.marshalAndUnmarshall(multigeometry);
		KmlReferenceCheck.multiGeometry(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#multiGeometryExample()
	 */
	@Test
	public void multiGeometryExample() {
		final Placemark placemark = new Placemark();
		placemark.setName("SF Marina Harbor Master");
		placemark.setVisibility(false);
		final MultiGeometry multigeometry = new MultiGeometry();
		placemark.setGeometry(multigeometry);

		final LineString linestring1 = new LineString();
		multigeometry.getGeometry().add(linestring1);
		List<Coordinate> coord1 = new ArrayList<Coordinate>();
		linestring1.setCoordinates(coord1);
		coord1.add(new Coordinate(-122.4425587930444, 37.80666418607323, 0));
		coord1.add(new Coordinate(-122.4428379594768, 37.80663578323093, 0));

		final LineString linestring2 = new LineString();
		multigeometry.getGeometry().add(linestring2);
		List<Coordinate> coord2 = new ArrayList<Coordinate>();
		linestring2.setCoordinates(coord2);
		coord2.add(new Coordinate(-122.4425509770566, 37.80662588061205, 0));
		coord2.add(new Coordinate(-122.4428340530617, 37.8065999493009, 0));

		KmlReferenceCheck.multiGeometryExample(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.multiGeometryExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#networkLink()
	 */
	@Test
	public void networkLink() {
		final NetworkLink networklink = new NetworkLink();
		networklink.setId("ID");
		// <!-- inherited from Feature element -->
		networklink.setName("...");
		networklink.setVisibility(true);
		networklink.setOpen(false);
		final Author author = new Author();
		networklink.setAtomAuthor(author);
		author.getNameOrUriOrEmail().add("...");
		final de.micromata.opengis.kml.v_2_2_0.atom.Link atomLink = new de.micromata.opengis.kml.v_2_2_0.atom.Link("...");
		atomLink.setHref("...");
		networklink.setAtomLink(atomLink);
		networklink.setAddress("...");
		final AddressDetails addressDetails = createAddressDetails();
		networklink.setXalAddressDetails(addressDetails);
		networklink.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		networklink.setSnippet(snippet);
		snippet.setMaxLines(2);
		snippet.setValue("...");
		networklink.setDescription("...");
		final Camera camera = new Camera();
		networklink.setAbstractView(camera);
		final TimeSpan timeprimitive = new TimeSpan();
		networklink.setTimePrimitive(timeprimitive);
		networklink.setStyleUrl("...");
		networklink.getStyleSelector().add(new Style());
		networklink.setRegion(new Region());
		networklink.setMetadata(new Metadata());
		networklink.setExtendedData(new ExtendedData());

		// <!-- specific to NetworkLink -->
		networklink.setRefreshVisibility(false);
		networklink.setFlyToView(false);
		final Link link = new Link();
		link.setHref("...");
		networklink.setLink(link);

		KmlReferenceCheck.networkLink(networklink);
		final NetworkLink marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklink);
		KmlReferenceCheck.networkLink(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#networkLinkExample()
	 */
	@Test
	public void networkLinkExample() {
		final Document document = new Document();
		document.setVisibility(true);
		final NetworkLink networklink = new NetworkLink();
		document.getFeature().add(networklink);
		networklink.setName("NE US Radar");
		networklink.setRefreshVisibility(true);
		networklink.setFlyToView(true);
		final Link link = new Link();
		link.setHref("...");
		networklink.setLink(link);

		KmlReferenceCheck.networkLinkExample(document);
		final Document marshalledAndBackAgain = Utils.marshalAndUnmarshall(document);
		KmlReferenceCheck.networkLinkExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#networkLinkControl()
	 */
	@Test
	public void networkLinkControl() {
		final NetworkLinkControl networklinkcontrol = new NetworkLinkControl();
		networklinkcontrol.setMinRefreshPeriod(0.0);
		networklinkcontrol.setMaxSessionLength(-1.0);
		networklinkcontrol.setCookie("...");
		networklinkcontrol.setMessage("...");
		networklinkcontrol.setLinkName("...");
		networklinkcontrol.setLinkDescription("...");
		final Snippet snippet = new Snippet();
		snippet.setMaxLines(2);
		snippet.setValue("...");
		networklinkcontrol.setLinkSnippet(snippet);
		networklinkcontrol.setExpires("...");
		networklinkcontrol.setUpdate(new Update("", new ArrayList<Object>()));
		networklinkcontrol.setAbstractView(new LookAt());

		KmlReferenceCheck.networkLinkControl(networklinkcontrol);
		final NetworkLinkControl marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklinkcontrol);
		KmlReferenceCheck.networkLinkControl(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#networkLinkControlExample()
	 */
	@Test
	public void networkLinkControlExample() {
		final Kml kml = new Kml();
		final NetworkLinkControl networklinkcontrol = new NetworkLinkControl();
		kml.setNetworkLinkControl(networklinkcontrol);
		networklinkcontrol.setMessage("This is a pop-up message. You will only see this once");
		networklinkcontrol.setCookie("cookie=sometext");
		networklinkcontrol.setLinkName("New KML features");
		networklinkcontrol.setLinkDescription("<![CDATA[KML now has new features available!]]>");

		KmlReferenceCheck.networkLinkControlExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.networkLinkControlExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#overlayIcon()
	 */
	@Test
	public void overlayIcon() {
		final Icon icon = new Icon();
		icon.setHref("icon.jpg");

		KmlReferenceCheck.overlayIcon(icon);
		final Icon marshalledAndBackAgain = Utils.marshalAndUnmarshall(icon);
		KmlReferenceCheck.overlayIcon(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#photoOverlay()
	 */
	@Test
	public void photoOverlay() {
		final PhotoOverlay photooverlay = new PhotoOverlay();
		photooverlay.setId("ID");
		// <!-- inherited from Feature element -->
		photooverlay.setName("...");
		photooverlay.setVisibility(true);
		photooverlay.setOpen(false);
		photooverlay.setAtomAuthor(new Author());
		photooverlay.setAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link("..."));
		photooverlay.setAddress("...");
		photooverlay.setXalAddressDetails(createAddressDetails());
		photooverlay.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		photooverlay.setSnippet(snippet);
		snippet.setMaxLines(2);
		snippet.setValue("...");
		photooverlay.setDescription("...");
		photooverlay.setAbstractView(new Camera());
		photooverlay.setTimePrimitive(new TimeSpan());
		photooverlay.setStyleUrl("...");
		photooverlay.getStyleSelector().add(new Style());
		photooverlay.setRegion(new Region());
		photooverlay.setMetadata(new Metadata());
		photooverlay.setExtendedData(new ExtendedData());

		// <!-- inherited from Overlay element -->
		photooverlay.setColor("ffffffff");
		photooverlay.setDrawOrder(0);
		final Icon icon = new Icon();
		icon.setHref("...");
		photooverlay.setIcon(icon);

		// <!-- specific to PhotoOverlay -->
		photooverlay.setRotation(0.0);
		final ViewVolume viewvolume = new ViewVolume();
		photooverlay.setViewVolume(viewvolume);
		viewvolume.setLeftFov(0.0);
		viewvolume.setRightFov(0.0);
		viewvolume.setBottomFov(0.0);
		viewvolume.setTopFov(0.0);
		viewvolume.setNear(0.0);

		final ImagePyramid imagepyramid = new ImagePyramid();
		photooverlay.setImagePyramid(imagepyramid);
		imagepyramid.setTileSize(0);
		imagepyramid.setMaxWidth(0);
		imagepyramid.setMaxHeight(0);
		imagepyramid.setGridOrigin(GridOrigin.LOWER_LEFT);

		final Point point = new Point();
		photooverlay.setPoint(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(0.0, 0.0, 0.0));

		photooverlay.setShape(Shape.RECTANGLE);

		KmlReferenceCheck.photoOverlay(photooverlay);
		final PhotoOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(photooverlay);
		KmlReferenceCheck.photoOverlay(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#photoOverlayExample()
	 */
	@Test
	public void photoOverlayExample() {
		final PhotoOverlay photooverlay = new PhotoOverlay();
		photooverlay.setName("A simple non-pyramidal photo");
		photooverlay.setDescription("High above the ocean");
		// <!-- Overlay elements -->
		final Icon icon = new Icon();
		icon.setHref("small-photo.jpg");
		photooverlay.setIcon(icon);

		// <!-- PhotoOverlay elements -->
		photooverlay.setRotation(0.0);
		photooverlay.setShape(Shape.RECTANGLE);
		final ViewVolume viewvolume = new ViewVolume();
		photooverlay.setViewVolume(viewvolume);
		viewvolume.setNear(1000.0);
		viewvolume.setLeftFov(-60.0);
		viewvolume.setRightFov(60.0);
		viewvolume.setBottomFov(-45.0);
		viewvolume.setTopFov(45.0);

		final ImagePyramid imagepyramid = new ImagePyramid();
		photooverlay.setImagePyramid(imagepyramid);
		imagepyramid.setTileSize(0);
		imagepyramid.setMaxWidth(0);
		imagepyramid.setMaxHeight(0);
		imagepyramid.setGridOrigin(GridOrigin.LOWER_LEFT);

		final Point point = new Point();
		photooverlay.setPoint(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(1, 1));

		KmlReferenceCheck.photoOverlayExample(photooverlay);
		final PhotoOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(photooverlay);
		KmlReferenceCheck.photoOverlayExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#placemark()
	 */
	@Test
	public void placemark() {
		final Placemark placemark = new Placemark();
		placemark.setId("ID");
		// <!-- inherited from Feature element -->
		placemark.setName("...");
		placemark.setVisibility(true);
		placemark.setOpen(false);
		placemark.setAtomAuthor(new Author());
		placemark.setAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link(""));
		placemark.setAddress("...");
		placemark.setXalAddressDetails(createAddressDetails());
		placemark.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		placemark.setSnippet(snippet);
		snippet.setValue("...");
		snippet.setMaxLines(2);
		placemark.setDescription("...");
		placemark.setAbstractView(new Camera());
		placemark.setTimePrimitive(new TimeSpan());
		placemark.setStyleUrl("...");
		placemark.getStyleSelector().add(new Style());
		placemark.setRegion(new Region());
		placemark.setMetadata(new Metadata());
		placemark.setExtendedData(new ExtendedData());

		// <!-- specific to Placemark element -->
		placemark.setGeometry(new Point());

		KmlReferenceCheck.placemark(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.placemark(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#placemarkExample()
	 */
	@Test
	public void placemarkExample() {
		final Placemark placemark = new Placemark();
		placemark.setName("Google Earth - New Placemark");
		placemark.setDescription("Some Descriptive text.");

		final LookAt lookat = new LookAt();
		lookat.setLongitude(-90.86879847669974);
		lookat.setLatitude(48.25330383601299);
		lookat.setRange(440.8);
		lookat.setTilt(8.3);
		lookat.setHeading(2.7);

		placemark.setAbstractView(lookat);

		final Point point = new Point();
		placemark.setGeometry(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-90.86948943473118, 48.25450093195546, 0));

		KmlReferenceCheck.placemarkExample(placemark);
		final Placemark marshalledAndBackAgain = Utils.marshalAndUnmarshall(placemark);
		KmlReferenceCheck.placemarkExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#point()
	 */
	@Test
	public void point() {
		final Point point = new Point();
		point.setId("ID");
		point.setExtrude(false);
		point.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(0.0, 0.0, 0.0));

		KmlReferenceCheck.point(point);
		final Point marshalledAndBackAgain = Utils.marshalAndUnmarshall(point);
		KmlReferenceCheck.point(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#pointExample()
	 */
	@Test
	public void pointExample() {
		final Point point = new Point();
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-90.86948943473118, 48.25450093195546));

		KmlReferenceCheck.pointExample(point);
		final Point marshalledAndBackAgain = Utils.marshalAndUnmarshall(point);
		KmlReferenceCheck.pointExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#polygon()
	 */
	@Test
	public void polygon() {
		final Polygon polygon = new Polygon();
		polygon.setId("ID");
		polygon.setExtrude(false);
		polygon.setTessellate(false);
		polygon.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		final Boundary outerboundary = new Boundary();
		polygon.setOuterBoundaryIs(outerboundary);

		final LinearRing outerlinearring = new LinearRing();
		outerboundary.setLinearRing(outerlinearring);

		List<Coordinate> outercoord = new ArrayList<Coordinate>();
		outerlinearring.setCoordinates(outercoord);
		outercoord.add(new Coordinate(0.0, 0.0, 0.0));

		final Boundary innerboundary = new Boundary();
		polygon.getInnerBoundaryIs().add(innerboundary);

		final LinearRing innerlinearring = new LinearRing();
		innerboundary.setLinearRing(innerlinearring);

		List<Coordinate> innercoord = new ArrayList<Coordinate>();
		innerlinearring.setCoordinates(innercoord);
		innercoord.add(new Coordinate(0.0, 0.0, 0.0));

		KmlReferenceCheck.polygon(polygon);
		final Polygon marshalledAndBackAgain = Utils.marshalAndUnmarshall(polygon);
		KmlReferenceCheck.polygon(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#polygonExample()
	 */
	@Test
	public void polygonExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		document.setName("Polygon.kml");
		document.setOpen(false);
		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("hollow box");

		final Polygon polygon = new Polygon();
		placemark.setGeometry(polygon);

		polygon.setExtrude(true);
		polygon.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);

		final Boundary outerboundary = new Boundary();
		polygon.setOuterBoundaryIs(outerboundary);

		final LinearRing outerlinearring = new LinearRing();
		outerboundary.setLinearRing(outerlinearring);

		List<Coordinate> outercoord = new ArrayList<Coordinate>();
		outerlinearring.setCoordinates(outercoord);
		outercoord.add(new Coordinate(-122.366278, 37.818844, 30));
		outercoord.add(new Coordinate(-122.365248, 37.819267, 30));
		outercoord.add(new Coordinate(-122.365640, 37.819861, 30));
		outercoord.add(new Coordinate(-122.366669, 37.819429, 30));
		outercoord.add(new Coordinate(-122.366278, 37.818844, 30));

		final Boundary innerboundary = new Boundary();
		polygon.getInnerBoundaryIs().add(innerboundary);

		final LinearRing innerlinearring = new LinearRing();
		innerboundary.setLinearRing(innerlinearring);

		List<Coordinate> innercoord = new ArrayList<Coordinate>();
		innerlinearring.setCoordinates(innercoord);
		innercoord.add(new Coordinate(-122.366212, 37.818977, 30));
		innercoord.add(new Coordinate(-122.365424, 37.819294, 30));
		innercoord.add(new Coordinate(-122.365704, 37.819731, 30));
		innercoord.add(new Coordinate(-122.366488, 37.819402, 30));
		innercoord.add(new Coordinate(-122.366212, 37.818977, 30));

		KmlReferenceCheck.polygonExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.polygonExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#polyStyle()
	 */
	@Test
	public void polyStyle() {
		final PolyStyle polystyle = new PolyStyle();
		polystyle.setId("ID");
		// <!-- inherited from ColorStyle -->
		polystyle.setColor("ffffffff");
		polystyle.setColorMode(ColorMode.NORMAL);

		// <!-- specific to PolyStyle -->
		polystyle.setFill(true);
		polystyle.setOutline(true);

		KmlReferenceCheck.polyStyle(polystyle);
		final PolyStyle marshalledAndBackAgain = Utils.marshalAndUnmarshall(polystyle);
		KmlReferenceCheck.polyStyle(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#polyStyleExample()
	 */
	@Test
	public void polyStyleExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);
		document.setName("PolygonStyle.kml");
		document.setOpen(true);

		final Style style = new Style();
		document.getStyleSelector().add(style);
		style.setId("examplePolyStyle");

		final PolyStyle polyStyle = new PolyStyle();
		style.setPolyStyle(polyStyle);

		polyStyle.setColor("ff0000cc");
		polyStyle.setColorMode(ColorMode.RANDOM);

		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setName("hollow box");
		placemark.setStyleUrl("#examplePolyStyle");

		final Polygon polygon = new Polygon();
		placemark.setGeometry(polygon);

		polygon.setExtrude(true);
		polygon.setAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);

		final Boundary outerboundary = new Boundary();
		polygon.setOuterBoundaryIs(outerboundary);

		final LinearRing outerlinearring = new LinearRing();
		outerboundary.setLinearRing(outerlinearring);

		List<Coordinate> outercoord = new ArrayList<Coordinate>();
		outerlinearring.setCoordinates(outercoord);
		outercoord.add(new Coordinate(-122.3662784465226, 37.81884427772081, 30));
		outercoord.add(new Coordinate(-122.3652480684771, 37.81926777010555, 30));
		outercoord.add(new Coordinate(-122.365640222455, 37.81986126286519, 30));
		outercoord.add(new Coordinate(-122.36666937925, 37.81942987753481, 30));
		outercoord.add(new Coordinate(-122.3662784465226, 37.81884427772081, 30));

		final Boundary innerboundary = new Boundary();
		polygon.getInnerBoundaryIs().add(innerboundary);

		final LinearRing innerlinearring = new LinearRing();
		innerboundary.setLinearRing(innerlinearring);

		List<Coordinate> innercoord = new ArrayList<Coordinate>();
		innerlinearring.setCoordinates(innercoord);
		innercoord.add(new Coordinate(-122.366212593918, 37.81897719083808, 30));
		innercoord.add(new Coordinate(-122.3654241733188, 37.81929450992014, 30));
		innercoord.add(new Coordinate(-122.3657048517827, 37.81973175302663, 30));
		innercoord.add(new Coordinate(-122.3664882465854, 37.81940249291773, 30));
		innercoord.add(new Coordinate(-122.366212593918, 37.81897719083808, 30));

		KmlReferenceCheck.polyStyleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.polyStyleExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#region()
	 */
	@Test
	public void region() {
		final Region region = new Region();
		region.setId("ID");

		final LatLonAltBox latlonBox = new LatLonAltBox();
		region.setLatLonAltBox(latlonBox);
		latlonBox.setNorth(0.0d);
		latlonBox.setSouth(0.0d);
		latlonBox.setEast(0.0d);
		latlonBox.setWest(0.0d);
		latlonBox.setMinAltitude(0.0);
		latlonBox.setMaxAltitude(0.0);
		latlonBox.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		final Lod lod = new Lod();
		region.setLod(lod);
		lod.setMinLodPixels(0.0);
		lod.setMaxLodPixels(-1.0);
		lod.setMinFadeExtent(0.0);
		lod.setMaxFadeExtent(0.0);

		KmlReferenceCheck.region(region);
		final Region marshalledAndBackAgain = Utils.marshalAndUnmarshall(region);
		KmlReferenceCheck.region(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#regionLatLonAltBox()
	 */
	@Test
	public void regionLatLonAltBox() {
		final LatLonAltBox latlonAltBox = new LatLonAltBox();
		latlonAltBox.setNorth(43.374);
		latlonAltBox.setSouth(42.983);
		latlonAltBox.setEast(-0.335);
		latlonAltBox.setWest(-1.423d);
		latlonAltBox.setMinAltitude(0.0);
		latlonAltBox.setMaxAltitude(0.0);
		latlonAltBox.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		KmlReferenceCheck.regionLatLonAltBox(latlonAltBox);
		final LatLonAltBox marshalledAndBackAgain = Utils.marshalAndUnmarshall(latlonAltBox);
		KmlReferenceCheck.regionLatLonAltBox(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#regionLod()
	 */
	@Test
	public void regionLod() {
		final Lod lod = new Lod();
		lod.setMinLodPixels(256.0);
		lod.setMaxLodPixels(-1.0);
		lod.setMinFadeExtent(0.0);
		lod.setMaxFadeExtent(0.0);

		KmlReferenceCheck.regionLod(lod);
		final Lod marshalledAndBackAgain = Utils.marshalAndUnmarshall(lod);
		KmlReferenceCheck.regionLod(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#regionExample()
	 */
	@Test
	public void regionExample() {
		final Region region = new Region();

		final LatLonAltBox latlonBox = new LatLonAltBox();
		region.setLatLonAltBox(latlonBox);
		latlonBox.setNorth(50.625);
		latlonBox.setSouth(45.0d);
		latlonBox.setEast(28.125);
		latlonBox.setWest(22.5);
		latlonBox.setMinAltitude(10.0);
		latlonBox.setMaxAltitude(50.0);
		latlonBox.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);

		final Lod lod = new Lod();
		region.setLod(lod);
		lod.setMinLodPixels(128.0);
		lod.setMaxLodPixels(1024.0);
		lod.setMinFadeExtent(128.0);
		lod.setMaxFadeExtent(128.0);

		KmlReferenceCheck.regionExample(region);
		final Region marshalledAndBackAgain = Utils.marshalAndUnmarshall(region);
		KmlReferenceCheck.regionExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#schema()
	 */
	@Test
	public void schema() {
		final Schema schema = new Schema();
		schema.setName("string");
		schema.setId("ID");

		final SimpleField s1 = new SimpleField();
		schema.getSimpleField().add(s1);
		s1.setType("string");
		s1.setName("string");
		s1.setDisplayName("...");

		KmlReferenceCheck.schema(schema);
		final Schema marshalledAndBackAgain = Utils.marshalAndUnmarshall(schema);
		KmlReferenceCheck.schema(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#schemaExample()
	 */
	@Test
	public void schemaExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);

		final Schema schema = new Schema();
		document.getSchema().add(schema);
		schema.setName("TrailHeadType");
		schema.setId("TrailHeadTypeId");

		final SimpleField s1 = new SimpleField();
		schema.getSimpleField().add(s1);
		s1.setType("string");
		s1.setName("TrailHeadName");
		s1.setDisplayName("<![CDATA[<b>Trail Head Name</b>]]>");

		final SimpleField s2 = new SimpleField();
		schema.getSimpleField().add(s2);
		s2.setType("double");
		s2.setName("TrailLength");
		s2.setDisplayName("<![CDATA[<i>The length in miles</i>]]>");

		final SimpleField s3 = new SimpleField();
		schema.getSimpleField().add(s3);
		s3.setType("int");
		s3.setName("ElevationGain");
		s3.setDisplayName("<![CDATA[<i>change in altitude</i>]]>");

		KmlReferenceCheck.schemaExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.schemaExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#screenOverlay()
	 */
	@Test
	public void screenOverlay() {
		final ScreenOverlay screenoverlay = new ScreenOverlay();
		screenoverlay.setId("ID");
		// <!-- inherited from Feature element -->
		screenoverlay.setName("...");
		screenoverlay.setVisibility(true);
		screenoverlay.setOpen(false);
		screenoverlay.setAtomAuthor(new Author());
		screenoverlay.setAtomLink(new de.micromata.opengis.kml.v_2_2_0.atom.Link(""));
		screenoverlay.setXalAddressDetails(createAddressDetails());
		screenoverlay.setAddress("...");
		screenoverlay.setPhoneNumber("...");
		final Snippet snippet = new Snippet();
		screenoverlay.setSnippet(snippet);
		snippet.setMaxLines(2);
		snippet.setValue("...");
		screenoverlay.setDescription("...");
		screenoverlay.setAbstractView(new Camera());
		screenoverlay.setTimePrimitive(new TimeSpan());
		screenoverlay.setStyleUrl("...");
		screenoverlay.getStyleSelector().add(new Style());
		screenoverlay.setRegion(new Region());
		screenoverlay.setMetadata(new Metadata());
		screenoverlay.setExtendedData(new ExtendedData());

		// <!-- inherited from Overlay element -->
		screenoverlay.setColor("ffffffff");
		screenoverlay.setDrawOrder(0);
		final Icon icon = new Icon();
		icon.setHref("...");
		screenoverlay.setIcon(icon);

		// <!-- specific to ScreenOverlay -->
		final Vec2 overlayxy = new Vec2();
		overlayxy.setX(0.5);
		overlayxy.setY(0.5);
		overlayxy.setXunits(Units.FRACTION);
		overlayxy.setYunits(Units.FRACTION);
		screenoverlay.setOverlayXY(overlayxy);

		final Vec2 screenyxy = new Vec2();
		screenyxy.setX(0.5);
		screenyxy.setY(0.5);
		screenyxy.setXunits(Units.FRACTION);
		screenyxy.setYunits(Units.FRACTION);
		screenoverlay.setScreenXY(screenyxy);

		screenoverlay.setRotation(0.0);

		final Vec2 dize = new Vec2();
		dize.setX(0.5);
		dize.setY(0.5);
		dize.setXunits(Units.FRACTION);
		dize.setYunits(Units.FRACTION);
		screenoverlay.setSize(dize);

		KmlReferenceCheck.screenOverlay(screenoverlay);
		final ScreenOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(screenoverlay);
		KmlReferenceCheck.screenOverlay(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#screenOverlayExample()
	 */
	@Test
	public void screenOverlayExample() {
		final ScreenOverlay screenoverlay = new ScreenOverlay();
		screenoverlay.setId("khScreenOverlay756");
		// <!-- inherited from Feature element -->
		screenoverlay.setName("Simple crosshairs");
		screenoverlay.setDescription("This screen overlay uses fractional positioning to put the image in the exact center of the screen");

		final Icon icon = new Icon();
		icon.setHref("http://myserver/myimage.jpg");
		screenoverlay.setIcon(icon);

		final Vec2 overlayxy = new Vec2();
		overlayxy.setX(0.5);
		overlayxy.setY(0.5);
		overlayxy.setXunits(Units.FRACTION);
		overlayxy.setYunits(Units.FRACTION);
		screenoverlay.setOverlayXY(overlayxy);

		final Vec2 screenyxy = new Vec2();
		screenyxy.setX(0.5);
		screenyxy.setY(0.5);
		screenyxy.setXunits(Units.FRACTION);
		screenyxy.setYunits(Units.FRACTION);
		screenoverlay.setScreenXY(screenyxy);

		screenoverlay.setRotation(39.37878630116985);

		final Vec2 dize = new Vec2();
		dize.setX(0.0);
		dize.setY(0.0);
		dize.setXunits(Units.PIXELS);
		dize.setYunits(Units.PIXELS);
		screenoverlay.setSize(dize);

		KmlReferenceCheck.screenOverlayExample(screenoverlay);
		final ScreenOverlay marshalledAndBackAgain = Utils.marshalAndUnmarshall(screenoverlay);
		KmlReferenceCheck.screenOverlayExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#style()
	 */
	@Test
	public void style() {
		final Style style = new Style();
		style.setId("ID");

		// <!-- specific to Style -->
		style.setIconStyle(new IconStyle());
		style.setLabelStyle(new LabelStyle());
		style.setLineStyle(new LineStyle());
		style.setPolyStyle(new PolyStyle());
		style.setBalloonStyle(new BalloonStyle());
		style.setListStyle(new ListStyle());

		KmlReferenceCheck.style(style);
		final Style marshalledAndBackAgain = Utils.marshalAndUnmarshall(style);
		KmlReferenceCheck.style(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#styleExample()
	 */
	@Test
	public void styleExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		kml.setFeature(document);

		// <!-- Begin Style Definitions -->
		final Style style = new Style();
		style.setId("myDefaultStyles");
		document.getStyleSelector().add(style);

		final IconStyle iconstyle = new IconStyle();
		iconstyle.setColor("a1ff00ff");
		iconstyle.setScale(1.399999976158142);
		final Icon icon = new Icon();
		icon.setHref("http://myserver.com/icon.jpg");
		iconstyle.setIcon(icon);
		style.setIconStyle(iconstyle);

		final LabelStyle labelstyle = new LabelStyle();
		labelstyle.setColor("7fffaaff");
		labelstyle.setScale(1.5);
		style.setLabelStyle(labelstyle);

		final LineStyle linestyle = new LineStyle();
		linestyle.setColor("ff0000ff");
		linestyle.setWidth(15.0);
		style.setLineStyle(linestyle);

		final PolyStyle polystyle = new PolyStyle();
		polystyle.setColor("7f7faaaa");
		polystyle.setColorMode(ColorMode.RANDOM);
		style.setPolyStyle(polystyle);

		// <!-- Placemark #1 -->
		final Placemark p1 = new Placemark();
		document.getFeature().add(p1);
		p1.setName("Google Earth - New Polygon");
		p1.setDescription("Here is some descriptive text");
		p1.setStyleUrl("#myDefaultStyles");

		// <!-- Placemark #2 -->
		final Placemark p2 = new Placemark();
		document.getFeature().add(p2);
		p2.setName("Google Earth - New Path");
		p2.setStyleUrl("#myDefaultStyles");

		KmlReferenceCheck.styleExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.styleExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#styleMap()
	 */
	@Test
	public void styleMap() {
		final StyleMap stylemap = new StyleMap();
		stylemap.setId("ID");
		// <!-- extends StyleSelector -->
		// <!-- elements specific to StyleMap -->
		final Pair pair = new Pair();
		stylemap.getPair().add(pair);
		pair.setId("ID");
		pair.setKey(StyleState.NORMAL);
		pair.setStyleUrl("...");

		KmlReferenceCheck.styleMap(stylemap);
		final StyleMap marshalledAndBackAgain = Utils.marshalAndUnmarshall(stylemap);
		KmlReferenceCheck.styleMap(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#styleMapPair()
	 */
	@Test
	public void styleMapPair() {
		final Pair pair = new Pair();
		pair.setKey(StyleState.NORMAL);
		pair.setStyleUrl("http://myserver.com/populationProject.xml#example_style_off");

		KmlReferenceCheck.styleMapPair(pair);
		final Pair marshalledAndBackAgain = Utils.marshalAndUnmarshall(pair);
		KmlReferenceCheck.styleMapPair(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#styleMapExample()
	 */
	@Test
	public void styleMapExample() {
		final Kml kml = new Kml();
		final Document document = new Document();
		document.setName("StyleMap.kml");
		document.setOpen(true);
		kml.setFeature(document);

		// <!-- Begin Style Definitions -->
		final Style style1 = new Style();
		style1.setId("normalState");
		document.getStyleSelector().add(style1);

		final IconStyle iconstyle1 = new IconStyle();
		iconstyle1.setScale(1.0);
		final Icon icon1 = new Icon();
		icon1.setHref("http://maps.google.com/mapfiles/kml/pal3/icon55.png");
		iconstyle1.setIcon(icon1);
		style1.setIconStyle(iconstyle1);

		final LabelStyle labelstyle1 = new LabelStyle();
		labelstyle1.setScale(1.0);
		style1.setLabelStyle(labelstyle1);

		final Style style2 = new Style();
		style2.setId("highlightState");
		document.getStyleSelector().add(style2);

		final IconStyle iconstyle2 = new IconStyle();
		final Icon icon2 = new Icon();
		icon2.setHref("http://maps.google.com/mapfiles/kml/pal3/icon60.png");
		iconstyle2.setIcon(icon2);
		iconstyle2.setScale(1.1);
		style2.setIconStyle(iconstyle2);

		final LabelStyle labelstyle2 = new LabelStyle();
		labelstyle2.setScale(1.1);
		labelstyle2.setColor("ff0000c0");
		style2.setLabelStyle(labelstyle2);

		final StyleMap stylemap = new StyleMap();
		document.getStyleSelector().add(stylemap);
		stylemap.setId("styleMapExample");

		final Pair pair1 = new Pair();
		stylemap.getPair().add(pair1);
		pair1.setKey(StyleState.NORMAL);
		pair1.setStyleUrl("#normalState");

		final Pair pair2 = new Pair();
		stylemap.getPair().add(pair2);
		pair2.setKey(StyleState.HIGHLIGHT);
		pair2.setStyleUrl("#highlightState");

		final Placemark p1 = new Placemark();
		document.getFeature().add(p1);
		p1.setName("StyleMap example");
		p1.setStyleUrl("#styleMapExample");
		final Point point = new Point();
		p1.setGeometry(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-122.368987, 37.817634, 0));

		KmlReferenceCheck.styleMapExample(kml);
		final Kml marshalledAndBackAgain = Utils.marshalAndUnmarshall(kml);
		KmlReferenceCheck.styleMapExample(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#timeSpan()
	 */
	@Test
	public void timeSpan() {
		final TimeSpan timespan = new TimeSpan();
		timespan.setBegin("...");
		timespan.setEnd("...");

		KmlReferenceCheck.timeSpan(timespan);
		final TimeSpan marshalledAndBackAgain = Utils.marshalAndUnmarshall(timespan);
		KmlReferenceCheck.timeSpan(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#timeStamp()
	 */
	@Test
	public void timeStamp() {
		final TimeStamp timestamp = new TimeStamp();
		timestamp.setWhen("...");

		KmlReferenceCheck.timeStamp(timestamp);
		final TimeStamp marshalledAndBackAgain = Utils.marshalAndUnmarshall(timestamp);
		KmlReferenceCheck.timeStamp(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#updateChange()
	 */
	@Test
	public void updateChange() {
		final NetworkLinkControl networklink = new NetworkLinkControl();
		final Update update = new Update("http://www/~sam/January14Data/Point.kml", new ArrayList<Object>());
		networklink.setUpdate(update);

		final Change change = new Change();
		update.getCreateOrDeleteOrChange().add(change);

		final Point point = new Point();
		change.getAbstractObject().add(point);
		point.setTargetId("point123");
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-95.48, 40.43, 0));

		KmlReferenceCheck.updateChange(networklink);
		final NetworkLinkControl marshalledAndBackAgain = Utils.marshalAndUnmarshall(networklink);
		KmlReferenceCheck.updateChange(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#updateCreate()
	 */
	@Test
	public void updateCreate() {
		final Update update = new Update("http://myserver.com/Point.kml", new ArrayList<Object>());
		final Create create = new Create();
		update.getCreateOrDeleteOrChange().add(create);

		final Document document = new Document();
		create.getContainer().add(document);
		document.setTargetId("region24");
		final Placemark placemark = new Placemark();
		document.getFeature().add(placemark);
		placemark.setId("placemark891");

		final Point point = new Point();
		placemark.setGeometry(point);
		List<Coordinate> coord = new ArrayList<Coordinate>();
		point.setCoordinates(coord);
		coord.add(new Coordinate(-95.48, 40.43, 0));

		KmlReferenceCheck.updateCreate(update);
		final Update marshalledAndBackAgain = Utils.marshalAndUnmarshall(update);
		KmlReferenceCheck.updateCreate(marshalledAndBackAgain);
	}

	/**
	 * @see de.micromata.jak.internal.IKmlReference#updateDelete()
	 */
	@Test
	public void updateDelete() {
		final Update update = new Update("http://www.foo.com/Point.kml", new ArrayList<Object>());

		final Delete delete = new Delete();
		update.getCreateOrDeleteOrChange().add(delete);

		final Placemark placemark = new Placemark();
		delete.getFeature().add(placemark);
		placemark.setTargetId("pa3556");

		KmlReferenceCheck.updateDelete(update);
		final Update marshalledAndBackAgain = Utils.marshalAndUnmarshall(update);
		KmlReferenceCheck.updateDelete(marshalledAndBackAgain);
	}

}
