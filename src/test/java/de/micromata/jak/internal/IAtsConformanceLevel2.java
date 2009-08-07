package de.micromata.jak.internal;

/**
 * <p>
 * Conformance Level 2
 * </p>
 * 
 * <b>Purpose:</b>
 * 
 * Conformance Level 2 includes all Level 1 tests plus test cases covering requirements that should be satisfied by a KML document.
 * Non-conformance at this level may hinder the utility, portability, or interoperability of the document.
 * 
 * List of Tables
 * <ol>
 * <li>PolyStyle</li>
 * <li>Coordinates - altitudeMode</li>
 * <li>Scale - minimal content</li>
 * <li>KML - minimal content</li>
 * <li>ViewFormat</li>
 * <li>httpQuery</li>
 * <li>LinearRing in Polygon</li>
 * <li>Data</li>
 * <li>ResourceMap - Alias</li>
 * <li>Link refresh values</li>
 * <li>PhotoOverlay</li>
 * <li>GroundOverlay - minimal content</li>
 * <li>Camera</li>
 * <li>Location</li>
 * <li>Overlay</li>
 * <li>ScreenOverlay</li>
 * <li>BalloonStyle</li>
 * <li>ExtendedData</li>
 * <li>Folder</li>
 * <li>IconStyle</li>
 * <li>ImagePyramid</li>
 * <li>LabelStyle</li>
 * <li>ListStyle</li>
 * <li>Style</li>
 * <li>MultiGeometry</li>
 * <li>Placemark</li>
 * <li>StyleMap</li>
 * </ol>
 */
public interface IAtsConformanceLevel2 {
	/**
	 * <p>
	 * ATC 42: PolyStyle
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/PolyStyle<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:PolyStyle element is not a descendant of kml:Update, it contains at least one of the following
	 * elements: kml:color, kml:colorMode, kml:fill, or kml:outline.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.12.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc42PolyStyle();
	/**
	 * <p>
	 * ATC 43: Coordinates - altitudeMode
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Coordinates-altitudeMode<br/>
	 * <b>Test purpose:</b> <br/>
	 * Confirm that a kml:coordinates or kml:Location element includes a third coordinate tuple (altitude) if its sibling kml:altitudeMode
	 * element does NOT have the value "clampToGround". <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. Applies to the
	 * control points in kml:AbstractGeometryType/kml:coordinates and kml:Model/kml:Location.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.17.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc43CoordinatesAltitudeMode();
	/**
	 * <p>
	 * ATC 44: Scale - minimal content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Scale-Minimal<br/>
	 * <b>Test purpose:</b> Verify that if a kml:Scale element is not a descendant of kml:Update, it contains at least one of the following
	 * elements: kml:x, kml:y, or kml:z.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.12.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc44ScaleMinimalContent();
	/**
	 * <p>
	 * ATC 45: KML - minimal content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Kml-Minimal<br/>
	 * <b>Test purpose:</b> Verify that the root element (kml:kml) contains at least one child element: kml:NetworkLinkControl or any element
	 * that substitutes for kml:AbstractFeatureType.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 7.1.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc45KMLMinimalContent();
	/**
	 * <p>
	 * ATC 46: ViewFormat
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/ViewFormat<br/>
	 * <b>Test purpose:</b> Verify a kml:viewFormat contains at least one parameter.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.1.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc46ViewFormat();
	/**
	 * <p>
	 * ATC 47: httpQuery
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/HttpQuery<br/>
	 * <b>Test purpose:</b> Verify a kml:httpQuery contains at least one parameter.<br/>
	 * <b>Test method:</b> Pass if the httpQuery has at least one of the allowable parameters; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.1.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc47HttpQuery();
	/**
	 * <p>
	 * ATC 48: LinearRing in Polygon
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/LinearRingInPolygon<br/>
	 * <b>Test purpose:</b> Verify that a kml:LinearRing element, when appearing within a kml:Polygon, does not contain any of the following
	 * elements: kml:extrude, kml:tesselate, or kml:altitudeMode.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.5.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc48LinearRingInPolygon();
	/**
	 * <p>
	 * ATC 49: Data
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Data<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the kml:Data element has both a 'name' attribute and a kml:value child element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfiedt; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc49Data();
	/**
	 * <p>
	 * ATC 50: ResourceMap - Alias
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/ResourceMap-Alias<br/>
	 * <b>Test purpose:</b> Verify that a kml:ResourceMap element contains at least one kml:Alias child element, and that each Alias element
	 * has a unique kml:sourceHref value.<br/>
	 * <b>Test method:</b> Pass if all assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.13.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc50ResourceMapAlias();
	/**
	 * <p>
	 * ATC 51: Link refresh values
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/LinkRefresh<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:Link or a kml:Icon element (of type kml:LinkType) satisfies all of the following constraints: if the
	 * kml:refreshInterval element is present, the kml:refreshMode value must be "onInterval"; if the kml:viewRefresh element is present, the
	 * kml:refreshMode value must be "onStop". <b>Test method:</b> Pass if all relevant assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.1.3.2.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc51LinkRefreshValues();
	/**
	 * <p>
	 * ATC 52: PhotoOverlay
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/PhotoOverlay<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:PhotoOverlay element includes a kml:Icon/kml:href element containing [x], [y], and [level]
	 * parameters, then it also includes a child kml:ImagePyramid element; the converse must also be true.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. The parameters are embedded within the URL; i.e,
	 * http://server.company.com/bigphoto/$[level]/row_$[x]_column_$[y].jpg. KmlReferenceCheck for the kml:ImagePyramid when the x, y, level parameters
	 * are present, or if the kml:ImagePyramid is present check for the x, y, level parameters.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.4.3</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc52PhotoOverlay();
	/**
	 * <p>
	 * ATC 53: GroundOverlay - minimal content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/GroundOverlay-Minimal<br/>
	 * <b>Test purpose:</b> Verify that if a kml:GroundOverlay element is not a descendant of kml:Update, it contains a kml:LatLonBox element
	 * (with kml:north, kml:south, kml:east, kml:west).<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. The presence of north, south, east, and west indicates the
	 * Overlay draws a polygon.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.2.3.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc53GroundOverlayMinimalContent();
	/**
	 * <p>
	 * ATC 54: Camera
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Camera<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:Camera element satisfies all of the following constraints: if it is not a descendant of kml:Update, then the following
	 * child elements are present: kml:latitude, kml:longitude, and kml:altitude; the value of kml:altitudeMode is not "clampToGround".
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 14.2.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc54Camera();
	/**
	 * <p>
	 * ATC 55: Location
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Location<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:Location element satisfies all of the following constraints: it contains the kml:longitude and kml:latitude elements;
	 * if the parent kml:Model element has a kml:altitudeMode value that is not "clampToGround", then the kml:altitude element must also be
	 * present. <b>Test method:</b> Pass if all applicable assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.17.2</li>
	 * <li>OGC-07-147r2: cl. 10.9.2,</li>
	 * <li>OGC-07-147r2: cl. 10.10.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc55Location();
	/**
	 * <p>
	 * ATC 56: Overlay
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Overlay<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if any element that substitutes for kml:AbstractOverlayType is not a descendant of kml:Update, then it
	 * contains a kml:Icon child element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.2.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc56Overlay();
	/**
	 * <p>
	 * ATC 57: ScreenOverlay
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/ScreenOverlay<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:ScreenOverlay element is not a descendant of kml:Update, then it has a kml:screenXY child
	 * element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.7.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc57ScreenOverlay();
	/**
	 * <p>
	 * ATC 58: BalloonStyle
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/BalloonStyle<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:BalloonStyle element is not a descendant of kml:Update, it is not empty.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.6.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc58BaloonStyle();
	/**
	 * <p>
	 * ATC 59: ExtendedData
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/ExtendedData<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that a kml:ExtendedData element is not empty.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.2.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc59ExtendedData();
	/**
	 * <p>
	 * ATC 60: Folder
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Folder<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:Folder element is not a descendant of kml:Update, then it is not empty.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.10.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc60Folder();
	/**
	 * <p>
	 * ATC 61: IconStyle
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/IconStyle<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:IconStyle element is NOT a descendant of kml:Update, it is not empty.<br/>
	 * <b>Test method:</b> Pass if all applicable assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.8.2</li>
	 * <li>OGC-07-147r2: cl. 12.9.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc61IconStyle();
	/**
	 * <p>
	 * ATC 62: ImagePyramid
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/ImagePyramid<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that if a kml:ImagePyramid element is not a descendantof kml:Update, it satisfies all of the following constraints: it has the
	 * kml:maxWidth and kml:maxHeight child elements; the kml:tileSize value is a power of 2. <b>Test method:</b> Pass if all assertions are
	 * satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.6.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc62ImagePyramid();
	/**
	 * <p>
	 * ATC 63: LabelStyle
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/LabelStyle<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:LabelStyle element is not a descendant of kml:Update, it has at least one of the following
	 * child elements: kml:color, kml:colorMode, or kml:scale.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.10.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc63LabelStyle();
	/**
	 * <p>
	 * ATC 64: ListStyle
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/ListStyle<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:ListStyle element is not a descendant of kml:Update, it has at least one of the following
	 * child elements: kml:listItemType, kml:bgColor, or kml:ItemIcon.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.13.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc64ListStyle();
	/**
	 * <p>
	 * ATC 65: Style
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Style<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:Style element is not a descendant of kml:Update, it is not empty.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.2.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc65Sytle();
	/**
	 * <p>
	 * ATC 66: MultiGeometry
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/MultiGeometry<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:MultiGeometry element is not a descendant of kml:Update, it contains two or more geometry
	 * elements.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.2.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc66MultiGeometry();
	/**
	 * <p>
	 * ATC 67: Placemark
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/Placemark<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:Placemark element is not a descendant of kml:Update, it includes a geometry element (any
	 * element that substitutes for kml:AbstractGeometryGroup.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.11.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc67Placemark();
	/**
	 * <p>
	 * ATC 68: StyleMap
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-2/StyleMap<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:StyleMap element is not a descendant of kml:Update, it contains two kml:Pair elements where
	 * one key value is "normal" and the other key value is "highlight".<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc68StyleMap();
}
