package de.micromata.jak.internal;

/**
 * <p>
 * Conformance Level 1
 * </p>
 * 
 * <b>Purpose:</b>
 * 
 * Conformance Level 1 includes test cases corresponding to absolute requirements; a KML document must satisfy all assertions at this level
 * to be minimally conformant.
 * 
 * List of Tables
 * <ol>
 * <li>Root element</li>
 * <li>XML Schema constraints</li>
 * <li>Geometry coordinates</li>
 * <li>TimeSpan</li>
 * <li>TimeStamp</li>
 * <li>Style reference</li>
 * <li>Shared style definition</li>
 * <li>Region - LatLonAltBox</li>
 * <li>Link elements</li>
 * <li>Link referent</li>
 * <li>LatLonBox</li>
 * <li>Geometry - extrude</li>
 * <li>Geometry - tessellate</li>
 * <li>Point</li>
 * <li>LineString</li>
 * <li>LinearRing - control points</li>
 * <li>Polygon boundary</li>
 * <li>Icon - href</li>
 * <li>ViewVolume - minimal content</li>
 * <li>NetworkLinkControl - minRefreshPeriod</li>
 * <li>Empty object</li>
 * <li>Update - targetHref</li>
 * <li>Identification of update target</li>
 * <li>PhoneNumber</li>
 * <li>Schema</li>
 * <li>Schema - SimpleField</li>
 * <li>ExtendedData - SchemaData</li>
 * <li>ExtendedData - Data</li>
 * <li>Alias</li>
 * <li>atom:author</li>
 * <li>atom:link</li>
 * <li>Orientation - minimal content</li>
 * <li>GroundOverlay</li>
 * <li>Model</li>
 * <li>PhotoOverlay - minimal content</li>
 * <li>Pair</li>
 * <li>ItemIcon</li>
 * <li>LookAt</li>
 * <li>Lod</li>
 * <li>Link</li>
 * <li>Region</li>
 * </ol>
 */
public interface IAtsConformanceLevel1 {
	/**
	 * <p>
	 * ATC 1: Root element
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/RootElement<br/>
	 * <b>Test purpose:</b> Verify that the root element of the document has [local name] = "kml" and [namespace name] =
	 * "http://www.opengis.net/kml/2.2".<br/>
	 * <b>Test method:</b> Pass if all assertions are satisfied; fail otherwise. This test checks that the XML document is indeed an OGC KML
	 * document. If this test fails, all remaining tests are skipped.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 7.1.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc01RootElement();
	/**
	 * <p>
	 * ATC 2: XML Schema constraints
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/XmlSchemaConstraints<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the document is well-formed and schema-valid.<br/>
	 * <b>Test method:</b> Pass if the document satisfies all schema constraints; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: Annex A (KML Schemas)</li>
	 * <li>XML 1.0: Well-Formed XML Documents</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc02XMLSchemaconstraints();
	/**
	 * <p>
	 * ATC 3: Geometry coordinates
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Geometry-Coordinates<br/>
	 * <b>Test purpose:</b> Verify that a kml:coordinates element contains a list of white space-separated 2D or 3D tuples that contain
	 * comma-separated decimal values (lon,lat[,hgt]).<br/>
	 * <b>Test method:</b> Pass if all kml:coordinates elements contain 2D/3D tuples containing decimal values conforming to the xsd:decimal
	 * type; fail otherwise. White space consists of one or more of the following characters: space (U+0020), carriage return (U+000D), line
	 * feed (U+000A), or tab (U+0009). The relevant coordinate reference system (CRS) is defined in Annex B of the OGC KML 2.2 specification.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 16.1</li>
	 * <li>XML Schema Part 2 - Datatypes (2e): decimal</li>
	 * <li>OGC-07-147r2: Annex B</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc03GeometryCoordinates();
	/**
	 * <p>
	 * ATC 4: TimeSpan
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/TimeSpan<br/>
	 * <b>Test purpose:</b> <br/>
	 * Verify that a TimeSpan element satisfies all of the following constraints: it includes at least one child element (kml:begin or
	 * kml:end); if it is a definite interval (both kml:begin and kml:end are present), then the begin value is earlier than the end value.
	 * <b>Test method:</b> Pass if all assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 15.2.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc04TimeSpan();
	/**
	 * <p>
	 * ATC 5: TimeStamp
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/TimeStamp<br/>
	 * <b>Test purpose:</b> Verify that a kml:TimeStamp element has a child kml:when element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 15.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc05TimeStamp();
	/**
	 * <p>
	 * ATC 6: Style reference
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/StyleReference<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:styleUrl element satisfies all of the following constraints: its value is a valid relative or absolute URL that refers
	 * to a shared style definition (any element that substitutes for kml:AbstractStyleSelectorGroup); if the reference is an absolute URI,
	 * the value conforms to the 'http' or 'file' URI schemes; it includes a fragment identifier conforming to the shorthand pointer syntax as
	 * defined in the W3C XPointer framework. <b>Test method:</b> Pass if all applicable assertions are satisfied; fail otherwise. A relative
	 * URL is resolved according to the reference resolution algorithm described in section 5 of RFC 3986.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 6.4</li>
	 * <li>OGC-07-147r2: cl. 9.1.3.13.1</li>
	 * <li>XPointer Framework: Shorthand Pointer</li>
	 * <li>RFC 3986: Reference Resolution</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc06StyleReference();
	/**
	 * <p>
	 * ATC 7: Shared style definition
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/SharedStyle<br/>
	 * <b>Test purpose:</b> <br/>
	 * Confirm that a 'shared' style definition (any element that may substitute for kml:AbstractStyleSelectorGroup) satisfies all of the
	 * following constraints: its parent element is kml:Document; it has an 'id' attribute value. <b>Test method:</b> Pass if all assertions
	 * are satisfied; fail otherwise. Shared styles include kml:Style and kml:StyleMap elements.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 6.4</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc07SharedStyleDefintion();
	/**
	 * <p>
	 * ATC 8: Region - LatLonAltBox
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Region-LatLonAltBox<br/>
	 * <b>Test purpose:</b> <br/>
	 * Verify that the content of a kml:LatLonAltBox element satisfies all of the following constraints: kml:north > kml:south; kml:east >
	 * kml:west; kml:minAltitude <= kml:maxAltitude; if kml:minAltitude and kml:maxAltitude are both present, then kml:altitudeMode does not
	 * have the value "clampToGround". <b>Test method:</b> Pass if all applicable assertions are satisfied; fail otherwise. The default
	 * envelope for a region of interest is the entire surface of the EGM96 geoid. By testing north > south and east > west, we are testing
	 * for a non-zero area.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.15.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc08RegionLatLonAltBox();
	/**
	 * <p>
	 * ATC 9: Link elements
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Link-Elements<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a link element (of type kml:LinkType) satisfies all of the following constraints: if present, the child kml:refreshInterval
	 * element has a positive value (> 0); if present, the child kml:viewRefreshTime element has a positive value (> 0); if present, the child
	 * kml:viewBoundScale element has a positive value (> 0). <b>Test method:</b> Pass if a link element (kml:Link,
	 * kml:AbstractOverlayType/kml:Icon) satisfies all applicable constraints; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.1.3.3.1</li>
	 * <li>OGC-07-147r2: cl. 13.1.3.5.1</li>
	 * <li>OGC-07-147r2: cl. 13.1.3.6.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc09LinkElements();
	/**
	 * <p>
	 * ATC 10: Link referent
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/LinkReferent<br/>
	 * <b>Test purpose:</b> <br/>
	 * Confirm that a link element refers to the correct resource type, according to one of the following cases: if the parent element is
	 * kml:NetworkLink - a KML or KMZ resource; if the parent element is kml:Model - a textured 3D object resource; if the parent element is
	 * kml:GroundOverlay, kml:ScreenOverlay, or kml:PhotoOverlay - an image resource <b>Test method:</b> Pass if all link elements (kml:Link,
	 * kml:AbstractOverlayType/kml:Icon) have correct referents; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.12.3.3</li>
	 * <li>OGC-07-147r2: cl. 10.9.3.5.1</li>
	 * <li>OGC-07-147r2: cl. 11.1.3.3</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc10LinkReferent();
	/**
	 * <p>
	 * ATC 11: LatLonBox
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/LatLonBox<br/>
	 * <b>Test purpose:</b> <br/>
	 * Verify that a kml:LatLonBox element satisfies all of the following constraints: it contains the kml:north, kml:south, kml:east, and
	 * kml:west elements; kml:north > kml:south (compare character information items); kml:east > kml:west (compare character information
	 * items). <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. The default envelope for a kml:GroundOverlay is the
	 * entire surface of the WGS 84 ellipsoid. By testing north > south and east > west, we are testing for a non-zero area.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc11LatLonBox();
	/**
	 * <p>
	 * ATC 12: Geometry - extrude
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Geometry-Extrude<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that if the kml:extrude element has the value "true", then the value of kml:altitudeMode is not "clampToGround". <b>Test
	 * method:</b> Pass if the assertion is satisfied; fail otherwise. This applies to the following elements: kml:Point, kml:LineString,
	 * kml:LinearRing (but NOT if it occurs within a Polygon), and kml:Polygon.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.4.1.1.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc12GeometryExtrude();
	/**
	 * <p>
	 * ATC 13: Geometry - tessellate
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Geometry-Tessellate<br/>
	 * <b>Test purpose:</b> <br/>
	 * Confirm that if the kml:tessellate element has the value "true", then the value of kml:altitudeMode is "clampToGround" (default value).
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. This applies to the following elements: kml:LineString,
	 * kml:LinearRing (but NOT if it occurs within a Polygon), and kml:Polygon.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.6.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc13GeometryTessellate();
	/**
	 * <p>
	 * ATC 14: Point
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Point<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the kml:coordinates element in a kml:Point geometry contains exactly one coordinate tuple.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc14Point();
	/**
	 * <p>
	 * ATC 15: LineString
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/LineString<br/>
	 * <b>Test purpose:</b> Verify that the kml:coordinates element in a kml:LineString geometry contains at least two coordinate tuples.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.7.3.4.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc15LineString();
	/**
	 * <p>
	 * ATC 16: LinearRing - control points
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/LinearRing-ControlPoints<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the kml:coordinates element in a kml:LinearRing geometry contains at least 4 coordinate tuples, where
	 * the first and last are identical (i.e. they constitute a closed figure).<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.7.5.4.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc16LinearRingControlPoints();
	/**
	 * <p>
	 * ATC 17: Polygon boundary
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/PolygonBoundary<br/>
	 * <b>Test purpose:</b> <br/>
	 * Verify that the boundary of a kml:Polygon element satisfies all of the following constraints: if it is not a descendant of kml:Update,
	 * then the kml:Polygon has a child kml:outerBoundaryIs element; each interior boundary defines a hole in the Polygon (that is, each inner
	 * ring lies within the exterior boundary). <b>Test method:</b> Pass if all assertions are satisfied; fail otherwise. This test case
	 * reflects the essential definition of a polygon; no particular line orientations are assumed. The relevant polygons can be identified
	 * using this XPath expression: //kml:Polygon[not(ancestor::kml:Update)].<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.8.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc17PolygonBoundary();
	/**
	 * <p>
	 * ATC 18: Icon - href
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Icon-href<br/>
	 * <b>Test purpose:</b> Verify that the kml:Icon/kml:href element refers to an image resource.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. The image format must correspond to a registered image media
	 * type (PNG, JPEG, and GIF images are commonly used for this purpose). Applies to kml:Icon elements in both kml:IconStyle and
	 * kml:AbstractOverlayType contexts.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.1.2</li>
	 * Image Media Types
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc18IconHref();
	/**
	 * <p>
	 * ATC 19: ViewVolume - minimal content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/ViewVolume-Minimal<br/>
	 * <b>Test purpose:</b> Verify that a kml:ViewVolume element includes at least the following child elements: kml:leftFov, kml:rightFov,
	 * kml:bottomFov, kml:topFov, and kml:near (non-negative value).<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.5.2</li>
	 * <li>OGC-07-147r2: cl. 11.5.3.5</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc19ViewVolumeMinimalContent();
	/**
	 * <p>
	 * ATC 20: NetworkLinkControl - minRefreshPeriod
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/NetworkLinkControl-MinRefreshPeriod<br/>
	 * <b>Test purpose:</b> Verify that a kml:minRefreshPeriod element (occurs in kml:NetworkLinkControl) is non-negative (>=0).<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.2.3.1.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc20NetworkLinkControlMinRefreshPeriod();
	/**
	 * <p>
	 * ATC 21: Empty object
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/EmptyObject<br/>
	 * <b>Test purpose:</b> Verify that a KML object that is not a descendant of kml:Update is either (a) not empty, or (b) has an 'id'
	 * attribute value (so it can be easily updated).<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. The relevant context is
	 * //kml:AbstractObjectType[not(ancestor::kml:Update)].<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 8.1.3.1.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc21EmptyObject();
	/**
	 * <p>
	 * ATC 22: Update - targetHref
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Update-targetHref<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that the value of the kml:Update/kml:targetHref element satisfies all of the following constraints: it is an absolute URL that
	 * refers to a KML or KMZ resource; the value matches the retrieval URI for an existing NetworkLink element
	 * (kml:NetworkLink/kml:Link/kml:href). <b>Test method:</b> Pass if all applicable assertions are satisfied; fail otherwise. This modifies
	 * the behaviour of a referring NetworkLink.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.4.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc22UpdateTargetHref();
	/**
	 * <p>
	 * ATC 23: Identification of update target
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/UpdateTarget<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that a KML object which is a grandchild of kml:Update satisfies the following constraints: (a) it includes a
	 * 'targetId' attribute value that identifies the object to be updated, and (b) it does not have an 'id' attribute.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. Examine the content of all kml:Create, kml:Delete and
	 * kml:Change elements.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc23IdentificationOfUpdateTarget();
	/**
	 * <p>
	 * ATC 24: PhoneNumber
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/PhoneNumber<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the value of the kml:phoneNumber element is a 'tel' URI that conforms to RFC 3966.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.1.3.8.1</li>
	 * <li>RFC 3966: The tel URI for Telephone Numbers</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc24Phonenumber();
	/**
	 * <p>
	 * ATC 25: Schema
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Schema<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that a kml:Schema element has an 'id' attribute value.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.8.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc25Schema();
	/**
	 * <p>
	 * ATC 26: Schema - SimpleField
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Schema-SimpleField<br/>
	 * <b>Test purpose:</b> <br/>
	 * Verify that a kml:SimpleField element satisfies all of the following constraints: it has a 'name' attribute; the value of the 'type'
	 * attribute is one of the following XML Schema data types: <li>xsd:string</li> <li>xsd:int</li> <li>xsd:unsignedInt</li> <li>xsd:short</li>
	 * <li>xsd:unsignedShort</li> <li>xsd:float</li> <li>xsd:double</li> <li>xsd:boolean</li> <b>Test method:</b> Pass if all assertions are
	 * satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.9.2,</li>
	 * <li>OGC-07-147r2: cl. 9.9.4.2.1</li>
	 * <li>XML Schema Part 2 - Datatypes (2e): Built-in datatypes</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc26SchemaSimpleField();
	/**
	 * <p>
	 * ATC 27: ExtendedData - SchemaData
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/ExtendedData-SchemaData<br/>
	 * <b>Test purpose:</b> <br/>
	 * Confirm that a kml:SchemaData element satisfies all of the following constraints: the 'schemaUrl' attribute value is a URL with a
	 * fragment component that refers to a kml:Schema element; all kml:SimpleData child elements have a 'name' attribute that matches the name
	 * of a declared kml:SimpleField element in the corresponding Schema; the values of all kml:SimpleData child elements conform to their
	 * declared types. <b>Test method:</b> Pass if all assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.4.2</li>
	 * <li>OGC-07-147r2: cl. 9.5.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc27ExtendedDataSchemaData();
	/**
	 * <p>
	 * ATC 28: ExtendedData - Data
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/ExtendedData-Data<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the value of the 'name' attribute is unique within the context of the parent kml:ExtendedData element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.3.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc28ExtendedDataData();
	/**
	 * <p>
	 * ATC 29: Alias
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Alias<br/>
	 * <b>Test purpose:</b> <br/>
	 * Verify that a kml:Alias element satisfies the following assertions: the value of the child kml:targetHref element is a URI reference to
	 * an image (texture) resource; the value of the child kml:sourceHref element corresponds to a file reference appearing within the 3D
	 * object resource referenced in the preceding sibling kml:Link element. <b>Test method:</b> Pass if all assertions are satisfied; fail
	 * otherwise. The source is expected to be a textual (possibly XML) resource.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.14.3.1.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc29Alias();
	/**
	 * <p>
	 * ATC 30: atom:author
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/atom-author<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that an atom:author element satisfies all of the following assertions: the content of the child atom:uri element is an IRI
	 * reference; the content of the child atom:email element conforms to the "addr-spec" production in RFC 2822. <b>Test method:</b> Pass if
	 * all assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.1.3.4.2</li>
	 * <li>RFC 4287: Person Constructs</li>
	 * <li>RFC 3987: Internationalized Resource Identifiers (IRIs)</li>
	 * <li>RFC 2822: Addr-spec specification</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc30AtomAuthor();
	/**
	 * <p>
	 * ATC 31: atom:link
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/atom-link<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that the value of the atom:link/@rel attribute is "related".<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. If the attribute is not present, the link must be interpreted
	 * as if @rel = "alternate" (i.e. the referent is an alternate version of the resource). The value "related" simply signifies a generic
	 * relationship.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.1.3.5.1</li>
	 * <li>RFC 4287: The "rel" Attribute</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc31AtomLink();
	/**
	 * <p>
	 * ATC 32: Orientation - minimal content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Orientation-Minimum<br/>
	 * <b>Test purpose:</b> Verify that if a kml:Orientation element is not a descendant of kml:Update, then it contains at least one of the
	 * following elements: kml:heading, kml:tilt, or kml:roll.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.11.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc32OrientationMinimalContent();
	/**
	 * <p>
	 * ATC 33: GroundOverlay
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/GroundOverlay<br/>
	 * <b>Test purpose:</b> Verify that a kml:GroundOverlay with an kml:altitudeMode value of "absolute" includes a kml:altitude element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.17.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc33GroundOverlay();
	/**
	 * <p>
	 * ATC 34: Model
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Model<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:Model element satisfies all of the following constraints: it contains the kml:Link and kml:Location elements; if it is
	 * not a descendant of kml:Update and the target resource refers to any texture files, then there must be a kml:ResourceMap/kml:Alias for
	 * each related texture file. <b>Test method:</b> Pass if all applicable assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.9.3</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc34Model();
	/**
	 * <p>
	 * ATC 35: PhotoOverlay - minimal content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/PhotoOverlay-Minimal<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:PhotoOverlay element is not a descendant of kml:Update, then it includes all of the following
	 * child elements: kml:Icon, kml:ViewVolume, kml:Point, and kml:Camera.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 11.4.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc35PhotoOverlayMinimalContent();
	/**
	 * <p>
	 * ATC 36: Pair
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Pair<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:Pair element is not a descendant of kml:Update, then it contains (a) a kml:key element, and
	 * (b) at least one of kml:styleURL element or any element that substitutes for kml:AbstractStyleSelectorGroup.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. kml:AbstractStyleSelectorGroup elements are typically kml:Style
	 * or kml:StyleMap.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.4.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc36Pair();
	/**
	 * <p>
	 * ATC 37: ItemIcon
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/ItemIcon<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:ItemIcon element is not a descendant of kml:Update, then it has a kml:href child element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 12.14.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc37ItemIcon();
	/**
	 * <p>
	 * ATC 38: LookAt
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/LookAt<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:LookAt element satisfies all of the following constraints: if it is not a descendant of kml:Update, it contains all of
	 * the following child elements: kml:longitude, kml:latitude, and kml:range; 0 <= kml:tilt <= 90; if kml:altitudeMode does not have the
	 * value "clampToGround", then the kml:altitude element is present. <b>Test method:</b> Pass if the applicable assertions are satisfied;
	 * fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.17.2</li>
	 * <li>OGC-07-147r2: cl. 14.3.2</li>
	 * <li>OGC-07-147r2: cl. 14.3.4.5.1</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc38LookAt();
	/**
	 * <p>
	 * ATC 39: Lod
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Lod<br/>
	 * <b>Test purpose:</b> <br/>
	 * KmlReferenceCheck that a kml:Lod element satisfies all of the following constraints: if it is not a descendant of kml:Update, it contains the
	 * kml:minLodPixels element; kml:minLodPixels < kml:maxLodPixels (where a value of -1 denotes infinity). <b>Test method:</b> Pass if all
	 * assertions are satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.18.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc39Lod();
	/**
	 * <p>
	 * ATC 40: Link
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Link<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that if a kml:Link or a kml:Icon element is not a descendant of kml:Update, then it contains a kml:href
	 * child element.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 13.1.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc40Link();
	/**
	 * <p>
	 * ATC 41: Region
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-1/Region<br/>
	 * <b>Test purpose:</b> Confirm that if a kml:Region element is not a descendant of kml:Update, it contains the kml:LatLonAltBox and
	 * kml:Lod elements.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.13.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc41Region();
}
