package de.micromata.jak.internal;

/**
 * <p>
 * Conformance Level 3
 * </p>
 * 
 * <b>Purpose:</b>
 * 
 * Conformance Level 3 includes all Level 2 tests and introduces additional constraints of an informative nature; these are intended to
 * signal the use of deprecated elements or to encourage alignment with existing (non-normative) standards or conventions.
 * 
 * List of Tables
 * <ol>
 * <li>Polygon - rings</li>
 * <li>LinearRing - Simple</li>
 * <li>BalloonStyle - color</li>
 * <li>Metadata</li>
 * <li>Scale - full content</li>
 * <li>Lod - fade extents</li>
 * <li>Orientation - full content</li>
 * <li>Snippet</li>
 * <li>NetworkLink-Url</li>
 * </ol>
 */
public interface IAtsConformanceLevel3 {
	/**
	 * <p>
	 * ATC 69: Polygon - rings
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/PolygonRings<br/>
	 * <b>Test purpose:</b> Confirm that no two rings comprising the boundary of a kml:Polygon geometry cross.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise. The rings may intersect at a single point.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.8.2</li>
	 * <li>OpenGIS Geography Markup Language (GML) Encoding Standard: D.3.6</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc69PolygonRings();
	/**
	 * <p>
	 * ATC 70: LinearRing - Simple
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/SimpleLinearRing<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck that a kml:LinearRing is a simple ring (that is, it does not cross itself).<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.8.2</li>
	 * <li>OpenGIS Geography Markup Language (GML) Encoding Standard: D.3.6</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc70LinearRingSimple();
	/**
	 * <p>
	 * ATC 71: BalloonStyle - color
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/BalloonStyle-color<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck for any occurrences of the (deprecated) kml:color element in kml:BalloonStyle elements.<br/>
	 * <b>Test method:</b> Pass if no kml:color elements occur in this context; fail otherwise. This element is deprecated in favour of
	 * kml:bgColor.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: Annex A</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc71BaloonStyleColor();
	/**
	 * <p>
	 * ATC 72: Metadata
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/Metadata<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck for any occurrences of the (deprecated) kml:Metadata element.<br/>
	 * <b>Test method:</b> Pass if no kml:Metadata elements occur; fail otherwise. This element is deprecated in favour of kml:ExtendedData.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: Annex A</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc72Metadata();
	/**
	 * <p>
	 * ATC 73: Scale - full content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/Scale-Full<br/>
	 * <b>Test purpose:</b> Verify that a kml:Scale element includes all of the following child elements: kml:x, kml:y, and kml:z.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.12.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc73ScaleFullContent();
	/**
	 * <p>
	 * ATC 74: Lod - fade extents
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/Lod-FadeExtents<br/>
	 * <b>Test purpose:</b> Verify the following constraint regarding the evaluation of fade extents: kml:minFadeExtent + kml:maxFadeExtent <=
	 * kml:maxLodPixels - kml:minLodPixels.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 9.18.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc74LodFadeExtents();
	/**
	 * <p>
	 * ATC 75: Orientation - full content
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/Orientation-Full<br/>
	 * <b>Test purpose:</b> Verify that a kml:Orientation element includes the following child elements: kml:heading, kml:tilt, and kml:roll.<br/>
	 * <b>Test method:</b> Pass if the assertion is satisfied; fail otherwise.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: cl. 10.11.2</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc75OrientationFullContent();
	/**
	 * <p>
	 * ATC 76: Snippet
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/Snippet<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck for any occurrences of the (deprecated) kml:Snippet element.<br/>
	 * <b>Test method:</b> Pass if no kml:Snippet elements occur; fail otherwise. This element is deprecated in favour of kml:snippet.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: Annex A</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc76Snippet();
	/**
	 * <p>
	 * ATC 77: NetworkLink-Url
	 * </p>
	 * <b>Identifier:</b> http://www.opengis.net/kml/2.2/atc/level-3/NetworkLink/Url<br/>
	 * <b>Test purpose:</b> KmlReferenceCheck for any occurrences of the (deprecated) kml:Url element.<br/>
	 * <b>Test method:</b> Pass if no kml:Url elements occur as a child of kml:NetworkLink; fail otherwise. This element is deprecated in
	 * favour of kml:Link.<br/>
	 * <b>Reference:</b>
	 * <ul>
	 * <li>OGC-07-147r2: Annex A</li>
	 * </ul>
	 * <b>Test type:</b> Basic
	 */
	public void atc77NetworkLinkUrl();
}
