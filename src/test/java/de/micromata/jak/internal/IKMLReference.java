package de.micromata.jak.internal;

import org.junit.jupiter.api.Test;

public interface IKMLReference
{

  /**
   * BalloonStyle
   * 
   * <pre>
   * &lt;BalloonStyle id=&quot;ID&quot;&gt;
   *   &lt;!-- specific to BalloonStyle --&gt;
   *   &lt;bgColor&gt;ffffffff&lt;/bgColor&gt;            &lt;!-- kml:color --&gt;
   *   &lt;textColor&gt;ff000000&lt;/textColor&gt;        &lt;!-- kml:color --&gt; 
   *   &lt;text&gt;...&lt;/text&gt;                       &lt;!-- string --&gt;
   *   &lt;displayMode&gt;default&lt;/displayMode&gt;     &lt;!-- kml:displayModeEnum --&gt;
   * &lt;/BalloonStyle&gt;
   * </pre>
   */
  @Test
  public abstract void ballonStyle();

  /**
   * BalloonStyle - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   *   &lt;name&gt;BalloonStyle.kml&lt;/name&gt;
   *   &lt;open&gt;1&lt;/open&gt;
   *   &lt;Style id=&quot;exampleBalloonStyle&quot;&gt;
   *     &lt;BalloonStyle&gt;
   *       &lt;!-- a background color for the balloon --&gt;
   *       &lt;bgColor&gt;ffffffbb&lt;/bgColor&gt;
   *       &lt;!-- styling of the balloon text --&gt;
   *       &lt;text&gt;&lt;![CDATA[
   *       &lt;b&gt;&lt;font color='#CC0000' size='+3'&gt;$[name]&lt;/font&gt;&lt;/b&gt;
   *       &lt;br/&gt;&lt;br/&gt;
   *       &lt;font face='Courier'&gt;$[description]&lt;/font&gt;
   *       &lt;br/&gt;&lt;br/&gt;
   *       Extra text that will appear in the description balloon
   *       &lt;br/&gt;&lt;br/&gt;
   *       &lt;!-- insert the to/from hyperlinks --&gt;
   *       $[geDirections]
   *       ]]&gt;&lt;/text&gt;
   *     &lt;/BalloonStyle&gt;
   *   &lt;/Style&gt;
   *   &lt;Placemark&gt;
   *     &lt;name&gt;BalloonStyle&lt;/name&gt;
   *     &lt;description&gt;An example of BalloonStyle&lt;/description&gt;
   *     &lt;styleUrl&gt;#exampleBalloonStyle&lt;/styleUrl&gt;
   *     &lt;Point&gt;
   *       &lt;coordinates&gt;-122.370533,37.823842,0&lt;/coordinates&gt;
   *     &lt;/Point&gt;
   *   &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void ballonStyleExample();

  /**
   * Camera
   * 
   * <pre>
   * &lt;Camera id=&quot;ID&quot;&gt;
   *    &lt;longitude&gt;0&lt;/longitude&gt;          &lt;!-- kml:angle180 --&gt; 
   *    &lt;latitude&gt;0&lt;/latitude&gt;            &lt;!-- kml:angle90 --&gt;
   *    &lt;altitude&gt;0&lt;/altitude&gt;            &lt;!-- double --&gt;
   *    &lt;heading&gt;0&lt;/heading&gt;              &lt;!-- kml:angle360 --&gt;
   *    &lt;tilt&gt;0&lt;/tilt&gt;                    &lt;!-- kml:anglepos180 --&gt;
   *    &lt;roll&gt;0&lt;/roll&gt;                    &lt;!-- kml:angle180 --&gt;
   *    &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;              
   *          &lt;!-- kml:altitudeModeEnum: relativeToGround, clampToGround, or absolute --&gt;
   * &lt;/Camera&gt;
   * </pre>
   */
  @Test
  public abstract void camera();

  /**
   * Document
   * 
   * <pre>
   * &lt;Document id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from Feature element --&gt;
   * &lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * 
   * &lt;!-- specific to Document --&gt;
   * &lt;!-- 0 or more Schema elements --&gt;
   * &lt;!-- 0 or more Feature elements --&gt;
   * &lt;/Document&gt;
   * </pre>
   */
  @Test
  public abstract void document();

  /**
   * Document - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;name&gt;Document.kml&lt;/name&gt;
   * &lt;open&gt;1&lt;/open&gt;
   * &lt;Style id=&quot;exampleStyleDocument&quot;&gt;
   *   &lt;LabelStyle&gt;
   *     &lt;color&gt;ff0000cc&lt;/color&gt;
   *   &lt;/LabelStyle&gt;
   * &lt;/Style&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Document Feature 1&lt;/name&gt;
   *   &lt;styleUrl&gt;#exampleStyleDocument&lt;/styleUrl&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-122.371,37.816,0&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Document Feature 2&lt;/name&gt;
   *   &lt;styleUrl&gt;#exampleStyleDocument&lt;/styleUrl&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-122.370,37.817,0&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void documentExample();

  /**
   * ExtendedData
   * 
   * <pre>
   * &lt;ExtendedData&gt;                       
   * &lt;Data name=&quot;string&quot;&gt;
   *   &lt;displayName&gt;...&lt;/displayName&gt;    &lt;!-- string --&gt;
   *   &lt;value&gt;...&lt;/value&gt;                &lt;!-- string --&gt;
   * &lt;/Data&gt;
   * &lt;SchemaData schemaUrl=&quot;anyURI&quot;&gt;
   *   &lt;SimpleData name=&quot;&quot;&gt; ... &lt;/SimpleData&gt;   &lt;!-- string --&gt;
   * &lt;/SchemaData&gt;
   * &lt;namespace_prefix:other&gt;...&lt;/namespace_prefix:other&gt;
   * &lt;/ExtendedData&gt;
   * </pre>
   */
  @Test
  public abstract void extendedData();

  /**
   * ExtendedData - value
   * 
   * <pre>
   * &lt;Placemark&gt;
   * &lt;name&gt;Club house&lt;/name&gt;
   * &lt;ExtendedData&gt;
   *   &lt;Data name=&quot;holeNumber&quot;&gt;
   *     &lt;value&gt;1&lt;/value&gt;
   *   &lt;/Data&gt;
   *   &lt;Data name=&quot;holeYardage&quot;&gt;
   *     &lt;value&gt;234&lt;/value&gt;
   *   &lt;/Data&gt;
   *   &lt;Data name=&quot;holePar&quot;&gt;
   *     &lt;value&gt;4&lt;/value&gt;
   *   &lt;/Data&gt;
   * &lt;/ExtendedData&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void extendedDataValue();

  /**
   * ExtendedData - SimpleData name="string"
   * 
   * <pre>
   * &lt;Placemark&gt;
   *   &lt;name&gt;Easy trail&lt;/name&gt;
   *   &lt;ExtendedData&gt;
   *     &lt;SchemaData schemaUrl=&quot;#TrailHeadId&quot;&gt;
   *       &lt;SimpleData name=&quot;TrailHeadName&quot;&gt;Pi in the sky&lt;/SimpleData&gt;
   *       &lt;SimpleData name=&quot;TrailLength&quot;&gt;3.14159&lt;/SimpleData&gt;
   *       &lt;SimpleData name=&quot;ElevationGain&quot;&gt;10&lt;/SimpleData&gt;
   *     &lt;/SchemaData&gt;
   *   &lt;/ExtendedData&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-122.000,37.002&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Difficult trail&lt;/name&gt;
   *   &lt;ExtendedData&gt;
   *     &lt;SchemaData schemaUrl=&quot;#TrailHeadId&quot;&gt;
   *       &lt;SimpleData name=&quot;TrailHeadName&quot;&gt;Mount Everest&lt;/SimpleData&gt;
   *       &lt;SimpleData name=&quot;TrailLength&quot;&gt;347.45&lt;/SimpleData&gt;
   *       &lt;SimpleData name=&quot;ElevationGain&quot;&gt;10000&lt;/SimpleData&gt;
   *     &lt;/SchemaData&gt;
   *   &lt;/ExtendedData&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-122.000,37.002&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void extendedDataSimpleData();

  /**
   * ExtendedData - namespace_prefix:other
   * 
   * <pre>
   * &lt;ExtendedData xmlns:prefix=&quot;camp&quot;&gt;
   * &lt;camp:number&gt;14&lt;/camp:number&gt;
   * &lt;camp:parkingSpaces&gt;2&lt;/camp:parkingSpaces&gt;
   * &lt;camp:tentSites&gt;4&lt;/camp:tentSites&gt;
   * &lt;/ExtendedData&gt;
   * </pre>
   */
  // FIXME: <ExtendedData xmlns:prefix="camp">
  @Test
  public abstract void extendedDataNameSapcePrefix();

  /**
   * Feature - Sample Use of Ascription Elements
   * 
   * <pre>
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;       
   *    xmlns:atom=&quot;http://www.w3.org/2005/Atom&quot;&gt;   
   * &lt;Document&gt;         
   *   &lt;atom:author&gt;             
   *     &lt;atom:name&gt;J. K. Rowling&lt;/atom:name&gt;         
   *   &lt;/atom:author&gt;         
   *   &lt;atom:link href=&quot;http://www.harrypotter.com&quot; /&gt;
   *   &lt;Placemark&gt;             
   *     &lt;name&gt;Hogwarts&lt;/name&gt;             
   *     &lt;Point&gt;                 
   *       &lt;coordinates&gt;1,1&lt;/coordinates&gt;             
   *     &lt;/Point&gt;         
   *   &lt;/Placemark&gt;         
   *   &lt;Placemark&gt;       
   *     &lt;name&gt;Little Hangleton&lt;/name&gt;       
   *     &lt;Point&gt;         
   *       &lt;coordinates&gt;1,2&lt;/coordinates&gt;       
   *     &lt;/Point&gt;         
   *   &lt;/Placemark&gt;     
   * &lt;/Document&gt;  
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void featureAscriptionElement();

  /**
   * Folder
   * 
   * <pre>
   * &lt;Folder id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from Feature element --&gt;
   * &lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * 
   * &lt;!-- specific to Folder --&gt;
   * &lt;!-- 0 or more Feature elements --&gt;
   * &lt;/Folder&gt;
   * </pre>
   */
  @Test
  public abstract void folder();

  /**
   * Folder - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Folder&gt;
   * &lt;name&gt;Folder.kml&lt;/name&gt;
   * &lt;open&gt;1&lt;/open&gt;
   * &lt;description&gt;
   *   A folder is a container that can hold multiple other objects
   * &lt;/description&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Folder object 1 (Placemark)&lt;/name&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-122.377588,37.830266,0&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Folder object 2 (Polygon)&lt;/name&gt;
   *   &lt;Polygon&gt;
   *     &lt;outerBoundaryIs&gt;
   *       &lt;LinearRing&gt;
   *         &lt;coordinates&gt;
   *           -122.377830,37.830445,0
   *           -122.377576,37.830631,0
   *           -122.377840,37.830642,0
   *           -122.377830,37.830445,0
   *         &lt;/coordinates&gt;
   *       &lt;/LinearRing&gt;
   *     &lt;/outerBoundaryIs&gt;
   *   &lt;/Polygon&gt;
   * &lt;/Placemark&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Folder object 3 (Path)&lt;/name&gt;
   *   &lt;LineString&gt;
   *     &lt;tessellate&gt;1&lt;/tessellate&gt;
   *     &lt;coordinates&gt;
   *       -122.378009,37.830128,0 -122.377885,37.830379,0
   *     &lt;/coordinates&gt;
   *   &lt;/LineString&gt;
   * &lt;/Placemark&gt;
   * &lt;/Folder&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void folderExample();

  /**
   * GroundOverlay
   * 
   * <pre>
   * &lt;GroundOverlay id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from Feature element --&gt;
   * &lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * 
   * &lt;!-- inherited from Overlay element --&gt;
   * &lt;color&gt;ffffffff&lt;/color&gt;                   &lt;!-- kml:color --&gt;
   * &lt;drawOrder&gt;0&lt;/drawOrder&gt;                  &lt;!-- int --&gt;  
   * &lt;Icon&gt;...&lt;/Icon&gt;
   * 
   * &lt;!-- specific to GroundOverlay --&gt;
   * &lt;altitude&gt;0&lt;/altitude&gt;                    &lt;!-- double --&gt;
   * &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;
   *    &lt;!-- kml:altitudeModeEnum: clampToGround or absolute --&gt; 
   * &lt;LatLonBox&gt;
   *   &lt;north&gt;...&lt;/north&gt;                      &lt;! kml:angle90 --&gt;
   *   &lt;south&gt;...&lt;/south&gt;                      &lt;! kml:angle90 --&gt;
   *   &lt;east&gt;...&lt;/east&gt;                        &lt;! kml:angle180 --&gt;
   *   &lt;west&gt;...&lt;/west&gt;                        &lt;! kml:angle180 --&gt;
   *   &lt;rotation&gt;0&lt;/rotation&gt;                  &lt;! kml:angle180 --&gt;
   * &lt;/LatLonBox&gt;
   * &lt;/GroundOverlay&gt;
   * </pre>
   */
  @Test
  public abstract void groundOverlay();

  /**
   * GroundOverlay - LatLonBox
   * 
   * <pre>
   * &lt;LatLonBox&gt;
   *  &lt;north&gt;48.25475939255556&lt;/north&gt;
   *  &lt;south&gt;48.25207367852141&lt;/south&gt;
   *  &lt;east&gt;-90.86591508839973&lt;/east&gt;
   *  &lt;west&gt;-90.8714285289695&lt;/west&gt;
   *  &lt;rotation&gt;39.37878630116985&lt;/rotation&gt;
   * &lt;/LatLonBox&gt;
   * </pre>
   */
  @Test
  public abstract void groundOverlayLatLonBox();

  /**
   * GroundOverlay - Example
   * 
   * <pre>
   * 	&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * 	&lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * 	&lt;GroundOverlay&gt;
   * 	   &lt;name&gt;GroundOverlay.kml&lt;/name&gt;
   * 	   &lt;color&gt;7fffffff&lt;/color&gt;
   * 	   &lt;drawOrder&gt;1&lt;/drawOrder&gt;
   * 	   &lt;Icon&gt;
   * 	      &lt;href&gt;http://www.google.com/intl/en/images/logo.gif&lt;/href&gt;
   * 	      &lt;refreshMode&gt;onInterval&lt;/refreshMode&gt;
   * 	      &lt;refreshInterval&gt;86400&lt;/refreshInterval&gt;
   * 	      &lt;viewBoundScale&gt;0.75&lt;/viewBoundScale&gt;
   * 	   &lt;/Icon&gt;
   * 	   &lt;LatLonBox&gt;
   * 	      &lt;north&gt;37.83234&lt;/north&gt;
   * 	      &lt;south&gt;37.832122&lt;/south&gt;
   * 	      &lt;east&gt;-122.373033&lt;/east&gt;
   * 	      &lt;west&gt;-122.373724&lt;/west&gt;
   * 	      &lt;rotation&gt;45&lt;/rotation&gt;
   * 	   &lt;/LatLonBox&gt;
   * 	&lt;/GroundOverlay&gt;
   * 	&lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void groundOverlayExample();

  /**
   * Icon
   * 
   * <pre>
   * &lt;Icon id=&quot;ID&quot;&gt;
   * &lt;!-- specific to Icon --&gt;
   * &lt;href&gt;...&lt;/href&gt;                      &lt;!-- anyURI --&gt;
   * &lt;refreshMode&gt;onChange&lt;/refreshMode&gt;   
   *   &lt;!-- kml:refreshModeEnum: onChange, onInterval, or onExpire --&gt;   
   * &lt;refreshInterval&gt;4&lt;/refreshInterval&gt;  &lt;!-- float --&gt;
   * &lt;viewRefreshMode&gt;never&lt;/viewRefreshMode&gt; 
   *   &lt;!-- kml:viewRefreshModeEnum: never, onStop, onRequest, onRegion --&gt;
   * &lt;viewRefreshTime&gt;4&lt;/viewRefreshTime&gt;  &lt;!-- float --&gt;
   * &lt;viewBoundScale&gt;1&lt;/viewBoundScale&gt;    &lt;!-- float --&gt;
   * &lt;viewFormat&gt;...&lt;/viewFormat&gt;          &lt;!-- string --&gt;
   * &lt;httpQuery&gt;...&lt;/httpQuery&gt;            &lt;!-- string --&gt;
   * &lt;/Icon&gt;
   * </pre>
   */
  @Test
  public abstract void icon();

  /**
   * IconStyle
   * 
   * <pre>
   * &lt;IconStyle id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from ColorStyle --&gt;
   * &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
   * &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum:normal or random --&gt;
   * 
   * &lt;!-- specific to IconStyle --&gt;
   * &lt;scale&gt;1&lt;/scale&gt;                   &lt;!-- float --&gt;
   * &lt;heading&gt;0&lt;/heading&gt;               &lt;!-- float --&gt;
   * &lt;Icon&gt;
   *   &lt;href&gt;...&lt;/href&gt;
   * &lt;/Icon&gt; 
   * &lt;hotSpot x=&quot;0.5&quot;  y=&quot;0.5&quot; 
   *   xunits=&quot;fraction&quot; yunits=&quot;fraction&quot;/&gt;    &lt;!-- kml:vec2 --&gt;
   * </IconStyle>
   */
  @Test
  public abstract void iconStyle();

  /**
   * IconStyle - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   *  &lt;Style id=&quot;randomColorIcon&quot;&gt;
   *     &lt;IconStyle&gt;
   *        &lt;color&gt;ff00ff00&lt;/color&gt;
   *        &lt;colorMode&gt;random&lt;/colorMode&gt;
   *        &lt;scale&gt;1.1&lt;/scale&gt;
   *        &lt;Icon&gt;
   *           &lt;href&gt;http://maps.google.com/mapfiles/kml/pal3/icon21.png&lt;/href&gt;
   *        &lt;/Icon&gt;
   *     &lt;/IconStyle&gt;
   *  &lt;/Style&gt;
   *  &lt;Placemark&gt;
   *     &lt;name&gt;IconStyle.kml&lt;/name&gt;
   *     &lt;styleUrl&gt;#randomColorIcon&lt;/styleUrl&gt;
   *     &lt;Point&gt;
   *        &lt;coordinates&gt;-122.36868,37.831145,0&lt;/coordinates&gt;
   *     &lt;/Point&gt;
   *  &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void iconStyleExample();

  /**
   * kml
   * 
   * <pre>
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot; hint=&quot;target=sky&quot;&gt; ... &lt;/kml&gt;
   * </pre>
   * 
   */
  @Test
  public abstract void kml();

  /**
   * LabelStyle
   * 
   * <pre>
   * &lt;LabelStyle id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from ColorStyle --&gt;
   * &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
   * &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum: normal or random --&gt;
   * 
   * &lt;!-- specific to LabelStyle --&gt;
   * &lt;scale&gt;1&lt;/scale&gt;                   &lt;!-- float --&gt;
   * &lt;/LabelStyle&gt;
   * </pre>
   */
  @Test
  public abstract void labelStyle();

  /**
   * LabelStyle - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   *  &lt;Style id=&quot;randomLabelColor&quot;&gt;
   *     &lt;LabelStyle&gt;
   *        &lt;color&gt;ff0000cc&lt;/color&gt;
   *        &lt;colorMode&gt;random&lt;/colorMode&gt;
   *        &lt;scale&gt;1.5&lt;/scale&gt;
   *     &lt;/LabelStyle&gt;
   *  &lt;/Style&gt;
   *  &lt;Placemark&gt;
   *     &lt;name&gt;LabelStyle.kml&lt;/name&gt;
   *     &lt;styleUrl&gt;#randomLabelColor&lt;/styleUrl&gt;
   *     &lt;Point&gt;
   *        &lt;coordinates&gt;-122.367375,37.829192,0&lt;/coordinates&gt;
   *     &lt;/Point&gt;
   *  &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void labelStyleExample();

  /**
   * LinearRing
   * 
   * <pre>
   * &lt;LinearRing id=&quot;ID&quot;&gt;
   * &lt;!-- specific to LinearRing --&gt;
   * &lt;extrude&gt;0&lt;/extrude&gt;                       &lt;!-- boolean --&gt;
   * &lt;tessellate&gt;0&lt;/tessellate&gt;                 &lt;!-- boolean --&gt;
   * &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
   *   &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
   * &lt;coordinates&gt;...&lt;/coordinates&gt;             &lt;!-- lon,lat[,alt] tuples --&gt; 
   * &lt;/LinearRing&gt;
   * </pre>
   */
  @Test
  public abstract void linearRing();

  /**
   * LinearRing - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Placemark&gt;
   * &lt;name&gt;LinearRing.kml&lt;/name&gt;
   * &lt;Polygon&gt;
   *   &lt;outerBoundaryIs&gt;
   *     &lt;LinearRing&gt;
   *       &lt;coordinates&gt;
   *         -122.365662,37.826988,0 
   *         -122.365202,37.826302,0 
   *         -122.364581,37.82655,0 
   *         -122.365038,37.827237,0 
   *         -122.365662,37.826988,0 
   *       &lt;/coordinates&gt;
   *     &lt;/LinearRing&gt;
   *   &lt;/outerBoundaryIs&gt;
   * &lt;/Polygon&gt;
   * &lt;/Placemark&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void linearRingExample();

  /**
   * LineString
   * 
   * <pre>
   * &lt;LineString id=&quot;ID&quot;&gt;
   * &lt;!-- specific to LineString --&gt;
   * &lt;extrude&gt;0&lt;/extrude&gt;                   &lt;!-- boolean --&gt;
   * &lt;tessellate&gt;0&lt;/tessellate&gt;             &lt;!-- boolean --&gt;
   * &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
   *   &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
   * &lt;coordinates&gt;...&lt;/coordinates&gt;         &lt;!-- lon,lat[,alt] --&gt;
   * &lt;/LineString&gt;
   * </pre>
   */
  @Test
  public abstract void lineString();

  /**
   * LineString - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;name&gt;LineString.kml&lt;/name&gt;
   * &lt;open&gt;1&lt;/open&gt;
   * &lt;LookAt&gt;
   *   &lt;longitude&gt;-122.36415&lt;/longitude&gt;
   *   &lt;latitude&gt;37.824553&lt;/latitude&gt;
   *   &lt;altitude&gt;0&lt;/altitude&gt;
   *   &lt;range&gt;150&lt;/range&gt;
   *   &lt;tilt&gt;50&lt;/tilt&gt;
   *   &lt;heading&gt;0&lt;/heading&gt;
   * &lt;/LookAt&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;unextruded&lt;/name&gt;
   *   &lt;LineString&gt;
   *     &lt;extrude&gt;1&lt;/extrude&gt;
   *     &lt;tessellate&gt;1&lt;/tessellate&gt;
   *     &lt;coordinates&gt;
   *       -122.364383,37.824664,0 -122.364152,37.824322,0 
   *     &lt;/coordinates&gt;
   *   &lt;/LineString&gt;
   * &lt;/Placemark&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;extruded&lt;/name&gt;
   *   &lt;LineString&gt;
   *     &lt;extrude&gt;1&lt;/extrude&gt;
   *     &lt;tessellate&gt;1&lt;/tessellate&gt;
   *     &lt;altitudeMode&gt;relativeToGround&lt;/altitudeMode&gt;
   *     &lt;coordinates&gt;
   *       -122.364167,37.824787,50 -122.363917,37.824423,50 
   *     &lt;/coordinates&gt;
   *   &lt;/LineString&gt;
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void lineStringExample();

  /**
   * LineStyle
   * 
   * <pre>
   * &lt;LineStyle id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from ColorStyle --&gt;
   * &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
   * &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- colorModeEnum: normal or random --&gt;
   * 
   * &lt;!-- specific to LineStyle --&gt;
   * &lt;width&gt;1&lt;/width&gt;                   &lt;!-- float --&gt;
   * &lt;/LineStyle&gt;
   * </pre>
   */
  @Test
  public abstract void lineStyle();

  /**
   * LineStyle - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;name&gt;LineStyle.kml&lt;/name&gt;
   * &lt;open&gt;1&lt;/open&gt;
   * &lt;Style id=&quot;linestyleExample&quot;&gt;
   *   &lt;LineStyle&gt;
   *     &lt;color&gt;7f0000ff&lt;/color&gt;
   *     &lt;width&gt;4&lt;/width&gt;
   *   &lt;/LineStyle&gt;
   * &lt;/Style&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;LineStyle Example&lt;/name&gt;
   *   &lt;styleUrl&gt;#linestyleExample&lt;/styleUrl&gt;
   *   &lt;LineString&gt;
   *     &lt;extrude&gt;1&lt;/extrude&gt;
   *     &lt;tessellate&gt;1&lt;/tessellate&gt;
   *     &lt;coordinates&gt;
   *       -122.364383,37.824664,0 -122.364152,37.824322,0 
   *     &lt;/coordinates&gt;
   *   &lt;/LineString&gt;
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void lineStyleExample();

  /**
   * Link
   * 
   * <pre>
   * &lt;Link id=&quot;ID&quot;&gt;
   * &lt;!-- specific to Link --&gt;
   * &lt;href&gt;...&lt;/href&gt;                      &lt;!-- string --&gt;
   * &lt;refreshMode&gt;onChange&lt;/refreshMode&gt;   
   *   &lt;!-- refreshModeEnum: onChange, onInterval, or onExpire --&gt;   
   * &lt;refreshInterval&gt;4&lt;/refreshInterval&gt;  &lt;!-- float --&gt;
   * &lt;viewRefreshMode&gt;never&lt;/viewRefreshMode&gt; 
   *   &lt;!-- viewRefreshModeEnum: never, onStop, onRequest, onRegion --&gt;
   * &lt;viewRefreshTime&gt;4&lt;/viewRefreshTime&gt;  &lt;!-- float --&gt;
   * &lt;viewBoundScale&gt;1&lt;/viewBoundScale&gt;    &lt;!-- float --&gt;
   * &lt;viewFormat&gt;BBOX=[bboxWest],[bboxSouth],[bboxEast],[bboxNorth]&lt;/viewFormat&gt;
   *                                       &lt;!-- string --&gt;
   * &lt;httpQuery&gt;...&lt;/httpQuery&gt;            &lt;!-- string --&gt;
   * &lt;/Link&gt;
   * </pre>
   */
  @Test
  public abstract void link();

  /**
   * Link - Example
   * 
   * <pre>
   * &lt;NetworkLink&gt;
   *   &lt;name&gt;NE US Radar&lt;/name&gt;
   *   &lt;flyToView&gt;1&lt;/flyToView&gt;
   *   &lt;Link&gt;
   *     &lt;href&gt;http://www.example.com/geotiff/NE/MergedReflectivityQComposite.kml&lt;/href&gt;
   *     &lt;refreshMode&gt;onInterval&lt;/refreshMode&gt;
   *     &lt;refreshInterval&gt;30&lt;/refreshInterval&gt;
   *     &lt;viewRefreshMode&gt;onStop&lt;/viewRefreshMode&gt;
   *     &lt;viewRefreshTime&gt;7&lt;/viewRefreshTime&gt;
   *     &lt;viewFormat&gt;BBOX=[bboxWest],[bboxSouth],[bboxEast],[bboxNorth];CAMERA=\
   *       [lookatLon],[lookatLat],[lookatRange],[lookatTilt],[lookatHeading];VIEW=\
   *       [horizFov],[vertFov],[horizPixels],[vertPixels],[terrainEnabled]&lt;/viewFormat&gt;
   *  &lt;/Link&gt;
   * &lt;/NetworkLink&gt;
   * </pre>
   */
  @Test
  public abstract void linkExample();

  /**
   * ListStyle
   * 
   * <pre>
   * &lt;ListStyle id=&quot;ID&quot;&gt;
   * &lt;!-- specific to ListStyle --&gt;
   * &lt;listItem&gt;check&lt;/listItem&gt; &lt;!-- kml:listItemEnum:check,
   *                                         checkOffOnly,checkHideChildren,
   *                                        radioFolder --&gt;
   * &lt;bgColor&gt;ffffffff&lt;/bgColor&gt;        &lt;!-- kml:color --&gt;
   * &lt;ItemIcon&gt;                         &lt;!-- 0 or more ItemIcon elements --&gt;
   *   &lt;state&gt;open&lt;/state&gt;   
   *     &lt;!-- kml:itemIconModeEnum:open, closed, error, fetching0, fetching1, or fetching2 --&gt;
   *   &lt;href&gt;...&lt;/href&gt;                 &lt;!-- anyURI --&gt;
   * &lt;/ItemIcon&gt;
   * &lt;/ListStyle&gt;
   * </pre>
   */
  @Test
  public abstract void listStyle();

  /**
   * LookAt
   * 
   * <pre>
   * &lt;LookAt&gt;
   *   &lt;longitude&gt;-90.86879847669974&lt;/longitude&gt;
   *   &lt;latitude&gt;48.25330383601299&lt;/latitude&gt;
   *   &lt;range&gt;440.8&lt;/range&gt;
   *   &lt;tilt&gt;8.3&lt;/tilt&gt;
   *   &lt;heading&gt;2.7&lt;/heading&gt;
   * &lt;/LookAt&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void lookAt();

  /**
   * LookAt - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Placemark&gt;
   * &lt;name&gt;LookAt.kml&lt;/name&gt;
   * &lt;LookAt&gt;
   *   &lt;longitude&gt;-122.363&lt;/longitude&gt;
   *   &lt;latitude&gt;37.81&lt;/latitude&gt;
   *   &lt;altitude&gt;2000&lt;/altitude&gt;
   *   &lt;range&gt;500&lt;/range&gt;
   *   &lt;tilt&gt;45&lt;/tilt&gt;
   *   &lt;heading&gt;0&lt;/heading&gt;
   *   &lt;altitudeMode&gt;relativeToGround&lt;/altitudeMode&gt;
   * &lt;/LookAt&gt;
   * &lt;Point&gt;
   *   &lt;coordinates&gt;-122.363,37.82,0&lt;/coordinates&gt;
   * &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void lookAtExample();

  /**
   * Model (new child element: ResourceMap)
   * 
   * <pre>
   * &lt;Model id=&quot;ID&quot;&gt;
   * &lt;!-- specific to Model --&gt;
   * &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
   *   &lt;!--kml:altitudeModeEnum: clampToGround,relativeToGround,or absolute --&gt;
   * &lt;Location&gt; 
   *   &lt;longitude&gt;&lt;/longitude&gt; &lt;!-- kml:angle180 --&gt;
   *   &lt;latitude&gt;&lt;/latitude&gt;   &lt;!-- kml:angle90 --&gt;  
   *   &lt;altitude&gt;0&lt;/altitude&gt;  &lt;!-- double --&gt; 
   * &lt;/Location&gt; 
   * &lt;Orientation&gt;               
   *   &lt;heading&gt;0&lt;/heading&gt;    &lt;!-- kml:angle360 --&gt;
   *   &lt;tilt&gt;0&lt;/tilt&gt;          &lt;!-- kml:angle360 --&gt;
   *   &lt;roll&gt;0&lt;/roll&gt;          &lt;!-- kml:angle360 --&gt;
   * &lt;/Orientation&gt; 
   * &lt;Scale&gt; 
   *   &lt;x&gt;1&lt;/x&gt;                &lt;!-- double --&gt;
   *   &lt;y&gt;1&lt;/y&gt;                &lt;!-- double --&gt;
   *   &lt;z&gt;1&lt;/z&gt;                &lt;!-- double --&gt;
   * &lt;/Scale&gt; 
   * &lt;Link&gt;...&lt;/Link&gt;
   * &lt;ResourceMap&gt;
   *   &lt;Alias&gt;
   *     &lt;targetHref&gt;...&lt;/targetHref&gt;   &lt;!-- anyURI --&gt;
   *     &lt;sourceHref&gt;...&lt;/sourceHref&gt;   &lt;!-- anyURI --&gt;
   *   &lt;/Alias&gt;
   * &lt;/ResourceMap&gt;
   * &lt;/Model&gt;
   * </pre>
   */
  @Test
  public abstract void model();

  /**
   * Model - Location
   * 
   * <pre>
   * &lt;Location&gt;
   * &lt;longitude&gt;39.55375305703105&lt;/longitude&gt;  
   * &lt;latitude&gt;-118.9813220168456&lt;/latitude&gt; 
   * &lt;altitude&gt;1223&lt;/altitude&gt; 
   * &lt;/Location&gt;
   * </pre>
   */
  @Test
  public abstract void modelLocation();

  /**
   * Model - Orientation
   * 
   * <pre>
   * &lt;Orientation&gt; 
   * &lt;heading&gt;45.0&lt;/heading&gt; 
   * &lt;tilt&gt;10.0&lt;/tilt&gt; 
   * &lt;roll&gt;0.0&lt;/roll&gt; 
   * &lt;/Orientation&gt;
   * </pre>
   */
  @Test
  public abstract void modelOrientation();

  /**
   * Model - Scale
   * 
   * <pre>
   * &lt;Scale&gt;
   * &lt;x&gt;2.5&lt;/x&gt;
   * &lt;y&gt;2.5&lt;/y&gt;
   * &lt;z&gt;3.5&lt;/z&gt;
   * &lt;/Scale&gt;
   * </pre>
   */
  @Test
  public abstract void modelScale();

  /**
   * Model - ResourceMap (Alias)
   * 
   * <pre>
   * &lt;Alias&gt;
   * &lt;targetHref&gt;../images/foo.jpg&lt;/targetHref&gt;
   * &lt;sourceHref&gt;c:\mytextures\foo.jpg&lt;/sourceHref&gt; 
   * &lt;/Alias&gt;
   * </pre>
   */
  @Test
  public abstract void modelResourceMap();

  /**
   * Model - Example
   * 
   * <pre>
   * &lt;Model id=&quot;khModel543&quot;&gt; 
   * &lt;altitudeMode&gt;relativeToGround&lt;/altitudeMode&gt; 
   * &lt;Location&gt; 
   *   &lt;longitude&gt;39.55375305703105&lt;/longitude&gt; 
   *   &lt;latitude&gt;-118.9813220168456&lt;/latitude&gt; 
   *   &lt;altitude&gt;1223&lt;/altitude&gt; 
   * &lt;/Location&gt; 
   * &lt;Orientation&gt; 
   *   &lt;heading&gt;45.0&lt;/heading&gt; 
   *   &lt;tilt&gt;10.0&lt;/tilt&gt; 
   *   &lt;roll&gt;0.0&lt;/roll&gt; 
   * &lt;/Orientation&gt; 
   * &lt;Scale&gt; 
   *   &lt;x&gt;1.0&lt;/x&gt; 
   *   &lt;y&gt;1.0&lt;/y&gt; 
   *   &lt;z&gt;1.0&lt;/z&gt; 
   * &lt;/Scale&gt; 
   * &lt;Link&gt; 
   *   &lt;href&gt;house.dae&lt;/href&gt; 
   *   &lt;refreshMode&gt;once&lt;/refreshMode&gt; 
   * &lt;/Link&gt; 
   * &lt;ResourceMap&gt;
   *   &lt;Alias&gt;
   *     &lt;targetHref&gt;../files/CU-Macky---Center-StairsnoCulling.jpg&lt;/targetHref&gt;
   *     &lt;sourceHref&gt;CU-Macky---Center-StairsnoCulling.jpg&lt;/sourceHref&gt;
   *   &lt;/Alias&gt;
   *   &lt;Alias&gt;
   *     &lt;targetHref&gt;../files/CU-Macky-4sideturretnoCulling.jpg&lt;/targetHref&gt;
   *     &lt;sourceHref&gt;CU-Macky-4sideturretnoCulling.jpg&lt;/sourceHref&gt;
   *   &lt;/Alias&gt;
   *   &lt;Alias&gt;
   *     &lt;targetHref&gt;../files/CU-Macky-Back-NorthnoCulling.jpg&lt;/targetHref&gt;
   *     &lt;sourceHref&gt;CU-Macky-Back-NorthnoCulling.jpg&lt;/sourceHref&gt;
   *   &lt;/Alias&gt;
   * &lt;/ResourceMap&gt;
   * &lt;/Model&gt;
   * </pre>
   */
  @Test
  public abstract void modelExample();

  /**
   * MultiGeometry
   * 
   * <pre>
   * &lt;MultiGeometry id=&quot;ID&quot;&gt;
   * &lt;!-- specific to MultiGeometry --&gt;
   * &lt;!-- 0 or more Geometry elements --&gt;
   * &lt;/MultiGeometry&gt;
   * </pre>
   */
  @Test
  public abstract void multiGeometry();

  /**
   * MultiGeometry - Example
   * 
   * <pre>
   * &lt;Placemark&gt;
   * &lt;name&gt;SF Marina Harbor Master&lt;/name&gt;
   * &lt;visibility&gt;0&lt;/visibility&gt;
   * &lt;MultiGeometry&gt;
   *   &lt;LineString&gt;
   *     &lt;!-- north wall --&gt;
   *     &lt;coordinates&gt;
   *       -122.4425587930444,37.80666418607323,0
   *       -122.4428379594768,37.80663578323093,0
   *     &lt;/coordinates&gt;
   *   &lt;/LineString&gt;
   *   &lt;LineString&gt;
   *     &lt;!-- south wall --&gt;
   *     &lt;coordinates&gt;
   *       -122.4425509770566,37.80662588061205,0
   *       -122.4428340530617,37.8065999493009,0
   *     &lt;/coordinates&gt;
   *   &lt;/LineString&gt;
   * &lt;/MultiGeometry&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void multiGeometryExample();

  /**
   * NetworkLink
   * 
   * <pre>
   * &lt;NetworkLink id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from Feature element --&gt;&lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * &lt;!-- specific to NetworkLink --&gt;
   * &lt;refreshVisibility&gt;0&lt;/refreshVisibility&gt; &lt;!-- boolean --&gt;
   * &lt;flyToView&gt;0&lt;/flyToView&gt;                 &lt;!-- boolean --&gt;
   * &lt;Link&gt;...&lt;/Link&gt;
   * &lt;/NetworkLink&gt;
   * </pre>
   */
  @Test
  public abstract void networkLink();

  /**
   * NetworkLink - Example
   * 
   * <pre>
   * &lt;Document&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;
   * &lt;NetworkLink&gt;
   *   &lt;name&gt;NE US Radar&lt;/name&gt;
   *   &lt;refreshVisibility&gt;1&lt;/refreshVisibility&gt;
   *   &lt;flyToView&gt;1&lt;/flyToView&gt;
   *   &lt;Link&gt;...&lt;/Link&gt;&lt;/NetworkLink&gt;
   * &lt;/Document&gt;
   * </pre>
   */
  @Test
  public abstract void networkLinkExample();

  /**
   * NetworkLinkControl
   * 
   * <pre>
   * &lt;NetworkLinkControl&gt;
   * &lt;minRefreshPeriod&gt;0&lt;/minRefreshPeriod&gt;           &lt;!-- float --&gt;
   * &lt;maxSessionLength&gt;-1&lt;/maxSessionLength&gt;          &lt;!-- float --&gt; 
   * &lt;cookie&gt;...&lt;/cookie&gt;                             &lt;!-- string --&gt;                             
   * &lt;message&gt;...&lt;/message&gt;                           &lt;!-- string --&gt;
   * &lt;linkName&gt;...&lt;/linkName&gt;                         &lt;!-- string --&gt;                          
   * &lt;linkDescription&gt;...&lt;/linkDescription&gt;           &lt;!-- string --&gt;              
   * &lt;linkSnippet maxLines=&quot;2&quot;&gt;...&lt;/linkSnippet&gt;      &lt;!-- string --&gt;                      
   * &lt;expires&gt;...&lt;/expires&gt;                           &lt;!-- kml:dateTime --&gt;
   * &lt;Update&gt;...&lt;/Update&gt;                             &lt;!-- Change,Create,Delete --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;                 &lt;!-- LookAt or Camera --&gt;
   * &lt;/NetworkLinkControl&gt;
   * </pre>
   */
  @Test
  public abstract void networkLinkControl();

  /**
   * NetworkLinkControl - Example
   * 
   * <pre>
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;NetworkLinkControl&gt;
   *  &lt;message&gt;This is a pop-up message. You will only see this once&lt;/message&gt;
   *  &lt;cookie&gt;cookie=sometext&lt;/cookie&gt;
   *  &lt;linkName&gt;New KML features&lt;/linkName&gt;
   *  &lt;linkDescription&gt;&lt;![CDATA[KML now has new features available!]]&gt;&lt;/linkDescription&gt;
   * &lt;/NetworkLinkControl&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void networkLinkControlExample();

  /**
   * Overlay - Icon
   * 
   * <pre>
   * &lt;Icon&gt;
   *  &lt;href&gt;icon.jpg&lt;/href&gt;
   * &lt;/Icon&gt;
   * </pre>
   */
  @Test
  public abstract void overlayIcon();

  /**
   * PhotoOverlay
   * 
   * <pre>
   * &lt;PhotoOverlay&gt;
   * &lt;!-- inherited from Feature element --&gt;
   * &lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * 
   * &lt;!-- inherited from Overlay element --&gt;   
   * &lt;color&gt;ffffffff&lt;/color&gt;               &lt;!-- kml:color --&gt;   
   * &lt;drawOrder&gt;0&lt;/drawOrder&gt;              &lt;!-- int --&gt;     
   * &lt;Icon&gt;
   *   &lt;href&gt;...&lt;/href&gt;                    &lt;!-- anyURI --&gt;
   *   ...
   * &lt;/Icon&gt;         
   * 
   * &lt;!-- specific to PhotoOverlay --&gt;
   * &lt;rotation&gt;0&lt;/rotation&gt;                &lt;!-- kml:angle180 --&gt;
   * &lt;ViewVolume&gt;
   *   &lt;leftFov&gt;0&lt;/leftFov&gt;                &lt;!-- kml:angle180 --&gt;
   *   &lt;rightFov&gt;0&lt;/rightFov&gt;              &lt;!-- kml:angle180 --&gt;
   *   &lt;bottomFov&gt;0&lt;/bottomFov&gt;            &lt;!-- kml:angle90 --&gt;
   *   &lt;topFov&gt;0&lt;/topFov&gt;                  &lt;!-- kml:angle90 --&gt;
   *   &lt;near&gt;0&lt;/near&gt;                      &lt;!-- double --&gt;
   * &lt;/ViewVolume&gt;
   * &lt;ImagePyramid&gt;
   *   &lt;tileSize&gt;256&lt;/tileSize&gt;            &lt;!-- int --&gt;
   *   &lt;maxWidth&gt;...&lt;/maxWidth&gt;            &lt;!-- int --&gt;
   *   &lt;maxHeight&gt;...&lt;/maxHeight&gt;          &lt;!-- int --&gt;
   *   &lt;gridOrigin&gt;lowerLeft&lt;/gridOrigin&gt; &lt;!-- lowerLeft or upperLeft --&gt;
   * &lt;/ImagePyramid&gt;
   * &lt;Point&gt;
   *   &lt;coordinates&gt;...&lt;/coordinates&gt;      &lt;!-- lon,lat[,alt] --&gt;
   * &lt;/Point&gt;
   * &lt;shape&gt;rectangle&lt;/shape&gt;               &lt;!-- kml:shape --&gt;
   * &lt;/PhotoOverlay&gt;
   * </pre>
   */
  @Test
  public abstract void photoOverlay();

  /**
   * PhotoOverlay - Example
   * 
   * <pre>
   * &lt;PhotoOverlay&gt;
   * &lt;!-- Feature elements --&gt;
   * &lt;name&gt;A simple non-pyramidal photo&lt;/name&gt;
   * &lt;description&gt;High above the ocean&lt;/description&gt;
   * &lt;!-- Overlay elements --&gt;
   * &lt;Icon&gt;
   * &lt;!-- A simple normal jpeg image --&gt;
   * &lt;href&gt;small-photo.jpg&lt;/href&gt;
   * &lt;/Icon&gt;
   * &lt;!-- PhotoOverlay elements --&gt;
   * &lt;!-- default: &lt;rotation&gt; default is 0 --&gt;
   * &lt;ViewVolume&gt;
   *   &lt;near&gt;1000&lt;/near&gt;
   *   &lt;leftFov&gt;-60&lt;/leftFov&gt;
   *   &lt;rightFov&gt;60&lt;/rightFov&gt;
   *   &lt;bottomFov&gt;-45&lt;/bottomFov&gt;
   *   &lt;topFov&gt;45&lt;/topFov&gt;
   * &lt;/ViewVolume&gt;
   * &lt;!-- if no ImagePyramid only level 0 is shown,
   *      fine for a non-pyramidal image --&gt;
   * &lt;Point&gt;
   *   &lt;coordinates&gt;1,1&lt;/coordinates&gt;
   * &lt;/Point&gt;
   * &lt;!-- default: &lt;shape&gt; --&gt;
   * &lt;/PhotoOverlay&gt;
   * </pre>
   */
  @Test
  public abstract void photoOverlayExample();

  /**
   * Placemark
   * 
   * <pre>
   * &lt;Placemark id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from Feature element --&gt;
   * &lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * 
   * &lt;!-- specific to Placemark element --&gt;
   * &lt;Geometry&gt;...&lt;/Geometry&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void placemark();

  /**
   * Placemark - Example
   * 
   * <pre>
   * &lt;Placemark&gt;
   *   &lt;name&gt;Google Earth - New Placemark&lt;/name&gt;
   *   &lt;description&gt;Some Descriptive text.&lt;/description&gt;
   *   &lt;LookAt&gt;
   *     &lt;longitude&gt;-90.86879847669974&lt;/longitude&gt;
   *     &lt;latitude&gt;48.25330383601299&lt;/latitude&gt;
   *     &lt;range&gt;440.8&lt;/range&gt;
   *     &lt;tilt&gt;8.3&lt;/tilt&gt;
   *     &lt;heading&gt;2.7&lt;/heading&gt;
   *   &lt;/LookAt&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-90.86948943473118,48.25450093195546,0&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void placemarkExample();

  /**
   * Point
   * 
   * <pre>
   * &lt;Point id=&quot;ID&quot;&gt;
   * &lt;!-- specific to Point --&gt;
   * &lt;extrude&gt;0&lt;/extrude&gt;                        &lt;!-- boolean --&gt;
   * &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;  &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
   * &lt;coordinates&gt;...&lt;/coordinates&gt;              &lt;!-- lon,lat[,alt] --&gt;
   * &lt;/Point&gt;
   * </pre>
   */
  @Test
  public abstract void point();

  /**
   * Point - Example
   * 
   * <pre>
   * &lt;Point&gt;
   *   &lt;coordinates&gt;-90.86948943473118,48.25450093195546&lt;/coordinates&gt;
   * &lt;/Point&gt;
   * </pre>
   */
  @Test
  public abstract void pointExample();

  /**
   * Polygon
   * 
   * <pre>
   * &lt;Polygon id=&quot;ID&quot;&gt;
   * &lt;!-- specific to Polygon --&gt;
   * &lt;extrude&gt;0&lt;/extrude&gt;                       &lt;!-- boolean --&gt;
   * &lt;tessellate&gt;0&lt;/tessellate&gt;                 &lt;!-- boolean --&gt;
   * &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
   *   &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt;
   * &lt;outerBoundaryIs&gt;
   *   &lt;LinearRing&gt;
   *     &lt;coordinates&gt;...&lt;/coordinates&gt;         &lt;!-- lon,lat[,alt] --&gt;
   *   &lt;/LinearRing&gt;
   * &lt;/outerBoundaryIs&gt;
   * &lt;innerBoundaryIs&gt;
   *   &lt;LinearRing&gt;
   *     &lt;coordinates&gt;...&lt;/coordinates&gt;         &lt;!-- lon,lat[,alt] --&gt;
   *   &lt;/LinearRing&gt;
   * &lt;/innerBoundaryIs&gt;
   * &lt;/Polygon&gt;
   * </pre>
   */
  @Test
  public abstract void polygon();

  /**
   * Polygon - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;name&gt;Polygon.kml&lt;/name&gt;
   * &lt;open&gt;0&lt;/open&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;hollow box&lt;/name&gt;
   *   &lt;Polygon&gt;
   *     &lt;extrude&gt;1&lt;/extrude&gt;
   *     &lt;altitudeMode&gt;relativeToGround&lt;/altitudeMode&gt;
   *     &lt;outerBoundaryIs&gt;
   *       &lt;LinearRing&gt;
   *         &lt;coordinates&gt;
   *           -122.366278,37.818844,30
   *           -122.365248,37.819267,30
   *           -122.365640,37.819861,30
   *           -122.366669,37.819429,30
   *           -122.366278,37.818844,30
   *         &lt;/coordinates&gt;
   *       &lt;/LinearRing&gt;
   *     &lt;/outerBoundaryIs&gt;
   *     &lt;innerBoundaryIs&gt;
   *       &lt;LinearRing&gt;
   *         &lt;coordinates&gt;
   *           -122.366212,37.818977,30
   *           -122.365424,37.819294,30
   *           -122.365704,37.819731,30
   *           -122.366488,37.819402,30
   *           -122.366212,37.818977,30
   *         &lt;/coordinates&gt;
   *       &lt;/LinearRing&gt;
   *     &lt;/innerBoundaryIs&gt;
   *   &lt;/Polygon&gt;
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void polygonExample();

  /**
   * PolyStyle
   * 
   * <pre>
   * &lt;PolyStyle id=&quot;ID&quot;&gt;
   *   &lt;!-- inherited from ColorStyle --&gt;
   *   &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
   *   &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum: normal or random --&gt;
   * 
   *   &lt;!-- specific to PolyStyle --&gt;
   *   &lt;fill&gt;1&lt;/fill&gt;                     &lt;!-- boolean --&gt;
   *   &lt;outline&gt;1&lt;/outline&gt;               &lt;!-- boolean --&gt;
   * &lt;/PolyStyle&gt;
   * </pre>
   */
  @Test
  public abstract void polyStyle();

  /**
   * PolyStyle - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;name&gt;PolygonStyle.kml&lt;/name&gt;
   * &lt;open&gt;1&lt;/open&gt;
   * &lt;Style id=&quot;examplePolyStyle&quot;&gt;
   *   &lt;PolyStyle&gt;
   *     &lt;color&gt;ff0000cc&lt;/color&gt;
   *     &lt;colorMode&gt;random&lt;/colorMode&gt;
   *   &lt;/PolyStyle&gt;
   * &lt;/Style&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;hollow box&lt;/name&gt;
   *   &lt;styleUrl&gt;#examplePolyStyle&lt;/styleUrl&gt;
   *   &lt;Polygon&gt;
   *     &lt;extrude&gt;1&lt;/extrude&gt;
   *     &lt;altitudeMode&gt;relativeToGround&lt;/altitudeMode&gt;
   *     &lt;outerBoundaryIs&gt;
   *       &lt;LinearRing&gt;
   *         &lt;coordinates&gt;
   *           -122.3662784465226,37.81884427772081,30 
   *           -122.3652480684771,37.81926777010555,30 
   *           -122.365640222455,37.81986126286519,30 
   *           -122.36666937925,37.81942987753481,30 
   *           -122.3662784465226,37.81884427772081,30 
   *         &lt;/coordinates&gt;
   *       &lt;/LinearRing&gt;
   *     &lt;/outerBoundaryIs&gt;
   *     &lt;innerBoundaryIs&gt;
   *       &lt;LinearRing&gt;
   *         &lt;coordinates&gt;
   *           -122.366212593918,37.81897719083808,30 
   *           -122.3654241733188,37.81929450992014,30 
   *           -122.3657048517827,37.81973175302663,30 
   *           -122.3664882465854,37.81940249291773,30 
   *           -122.366212593918,37.81897719083808,30 
   *         &lt;/coordinates&gt;
   *       &lt;/LinearRing&gt;
   *     &lt;/innerBoundaryIs&gt;
   *   &lt;/Polygon&gt;
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void polyStyleExample();

  /**
   * Region
   * 
   * <pre>
   * &lt;Region id=&quot;ID&quot;&gt; 
   * &lt;LatLonAltBox&gt; 
   *   &lt;north&gt;&lt;/north&gt;                            &lt;!-- required; kml:angle90 --&gt;
   *   &lt;south&gt;&lt;/south&gt;                            &lt;!-- required; kml:angle90 --&gt; 
   *   &lt;east&gt;&lt;/east&gt;                              &lt;!-- required; kml:angle180 --&gt;
   *   &lt;west&gt;&lt;/west&gt;                              &lt;!-- required; kml:angle180 --&gt;
   *   &lt;minAltitude&gt;0&lt;/minAltitude&gt;               &lt;!-- float --&gt;
   *   &lt;maxAltitude&gt;0&lt;/maxAltitude&gt;               &lt;!-- float --&gt;
   *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt; 
   *     &lt;!-- kml:altitudeModeEnum: clampToGround, relativeToGround, or absolute --&gt; 
   * &lt;/LatLonAltBox&gt; 
   * &lt;Lod&gt;
   *   &lt;minLodPixels&gt;0&lt;/minLodPixels&gt;             &lt;!-- float --&gt;
   *   &lt;maxLodPixels&gt;-1&lt;/maxLodPixels&gt;            &lt;!-- float --&gt;
   *   &lt;minFadeExtent&gt;0&lt;/minFadeExtent&gt;           &lt;!-- float --&gt; 
   *   &lt;maxFadeExtent&gt;0&lt;/maxFadeExtent&gt;           &lt;!-- float --&gt;
   * &lt;/Lod&gt;
   * &lt;/Region&gt;
   * </pre>
   */
  @Test
  public abstract void region();

  /**
   * Region - LatLonAltBox
   * 
   * <pre>
   * &lt;LatLonAltBox&gt;
   * &lt;north&gt;43.374&lt;/north&gt;
   * &lt;south&gt;42.983&lt;/south&gt;
   * &lt;east&gt;-0.335&lt;/east&gt;
   * &lt;west&gt;-1.423&lt;/west&gt;
   * &lt;minAltitude&gt;0&lt;/minAltitude&gt;
   * &lt;maxAltitude&gt;0&lt;/maxAltitude&gt;
   * &lt;/LatLonAltBox&gt;
   * </pre>
   */
  @Test
  public abstract void regionLatLonAltBox();

  /**
   * Region - Lod
   * 
   * <pre>
   * &lt;Lod&gt;
   * &lt;minLodPixels&gt;256&lt;/minLodPixels&gt;
   * &lt;maxLodPixels&gt;-1&lt;/maxLodPixels&gt;
   * &lt;minFadeExtent&gt;0&lt;/minFadeExtent&gt;
   * &lt;maxFadeExtent&gt;0&lt;/maxFadeExtent&gt;
   * &lt;/Lod&gt;
   * </pre>
   */
  @Test
  public abstract void regionLod();

  /**
   * Region - Example
   * 
   * <pre>
   * &lt;Region&gt; 
   * &lt;LatLonAltBox&gt; 
   *   &lt;north&gt;50.625&lt;/north&gt; 
   *   &lt;south&gt;45&lt;/south&gt; 
   *   &lt;east&gt;28.125&lt;/east&gt; 
   *   &lt;west&gt;22.5&lt;/west&gt; 
   *   &lt;minAltitude&gt;10&lt;/minAltitude&gt; 
   *   &lt;maxAltitude&gt;50&lt;/maxAltitude&gt; 
   * &lt;/LatLonAltBox&gt; 
   * &lt;Lod&gt; 
   *   &lt;minLodPixels&gt;128&lt;/minLodPixels&gt; 
   *   &lt;maxLodPixels&gt;1024&lt;/maxLodPixels&gt; 
   *   &lt;minFadeExtent&gt;128&lt;/minFadeExtent&gt; 
   *   &lt;maxFadeExtent&gt;128&lt;/maxFadeExtent&gt; 
   * &lt;/Lod&gt; 
   * &lt;/Region&gt;
   * </pre>
   */
  @Test
  public abstract void regionExample();

  /**
   * Schema
   * 
   * <pre>
   * &lt;Schema name=&quot;string&quot; id=&quot;ID&quot;&gt;
   * &lt;SimpleField =&quot;string&quot; name=&quot;string&quot;&gt;
   *   &lt;displayName&gt;...&lt;/displayName&gt;            &lt;!-- string --&gt;
   * &lt;/SimpleField&gt;
   * &lt;/Schema&gt;
   * </pre>
   */
  @Test
  public abstract void schema();

  /**
   * Schema - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;Schema name=&quot;TrailHead&quot; id=&quot;TrailHeadId&quot;&gt;          
   *   &lt;SimpleField =&quot;string&quot; name=&quot;TrailHeadName&quot;&gt;       
   *     &lt;displayName&gt;&lt;![CDATA[&lt;b&gt;Trail Head Name&lt;/b&gt;]]&gt;&lt;/displayName&gt;     
   *   &lt;/SimpleField&gt;     
   *   &lt;SimpleField =&quot;double&quot; name=&quot;TrailLength&quot;&gt;       
   *     &lt;displayName&gt;&lt;![CDATA[&lt;i&gt;The length in miles&lt;/i&gt;]]&gt;&lt;/displayName&gt;     
   *   &lt;/SimpleField&gt;
   *   &lt;SimpleField =&quot;int&quot; name=&quot;ElevationGain&quot;&gt;       
   *     &lt;displayName&gt;&lt;![CDATA[&lt;i&gt;change in altitude&lt;/i&gt;]]&gt;&lt;/displayName&gt;     
   *   &lt;/SimpleField&gt;   
   * &lt;/Schema&gt; 
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void schemaExample();

  /**
   * ScreenOverlay
   * 
   * <pre>
   * &lt;ScreenOverlay id=&quot;ID&quot;&gt;
   * &lt;!-- inherited from Feature element --&gt;
   * &lt;name&gt;...&lt;/name&gt;                      &lt;!-- string --&gt;
   * &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
   * &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
   * &lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
   * &lt;atom:link&gt;...&lt;/atom:link&gt;            &lt;!-- xmlns:atom --&gt;
   * &lt;address&gt;...&lt;/address&gt;                &lt;!-- string --&gt;
   * &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;
   * &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;
   * &lt;Snippet maxLines=&quot;2&quot;&gt;...&lt;/Snippet&gt;   &lt;!-- string --&gt;
   * &lt;description&gt;...&lt;/description&gt;        &lt;!-- string --&gt;
   * &lt;AbstractView&gt;...&lt;/AbstractView&gt;      &lt;!-- Camera or LookAt --&gt;
   * &lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;
   * &lt;styleUrl&gt;...&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
   * &lt;StyleSelector&gt;...&lt;/StyleSelector&gt;
   * &lt;Region&gt;...&lt;/Region&gt;
   * &lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
   * &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;
   * 
   * &lt;!-- inherited from Overlay element --&gt;
   * &lt;color&gt;ffffffff&lt;/color&gt;                  &lt;!-- kml:color --&gt;
   * &lt;drawOrder&gt;0&lt;/drawOrder&gt;                 &lt;!-- int --&gt;
   * &lt;Icon&gt;...&lt;/Icon&gt;
   * 
   * &lt;!-- specific to ScreenOverlay --&gt;
   * &lt;overlayXY x=&quot;double&quot; y=&quot;double&quot; xunits=&quot;fraction&quot; yunits=&quot;fraction&quot;/&gt;    
   *   &lt;!-- vec2 --&gt;
   *   &lt;!-- xunits and yunits can be one of: fraction, pixels, or insetPixels --&gt;
   * &lt;screenXY x=&quot;double&quot; y=&quot;double&quot; xunits=&quot;fraction&quot; yunits=&quot;fraction&quot;/&gt;      
   *   &lt;!-- vec2 --&gt;
   * &lt;rotationXY x=&quot;double&quot; y=&quot;double&quot; xunits=&quot;fraction&quot; yunits&quot;fraction&quot;/&gt;  
   *   &lt;!-- vec2 --&gt;
   * &lt;size x=&quot;double&quot; y=&quot;double&quot; xunits=&quot;fraction&quot; yunits=&quot;fraction&quot;/&gt;              
   *   &lt;!-- vec2 --&gt; 
   * &lt;rotation&gt;0&lt;/rotation&gt;                   &lt;!-- float --&gt;
   * &lt;/ScreenOverlay&gt;
   * </pre>
   */
  @Test
  public abstract void screenOverlay();

  /**
   * ScreenOverlay - Example
   * 
   * <pre>
   * &lt;ScreenOverlay id=&quot;khScreenOverlay756&quot;&gt;
   * &lt;name&gt;Simple crosshairs&lt;/name&gt;
   * &lt;description&gt;This screen overlay uses fractional positioning
   *  to put the image in the exact center of the screen&lt;/description&gt;
   * &lt;Icon&gt;
   *   &lt;href&gt;http://myserver/myimage.jpg&lt;/href&gt;
   * &lt;/Icon&gt;
   * &lt;overlayXY x=&quot;0.5&quot; y=&quot;0.5&quot; xunits=&quot;fraction&quot; yunits=&quot;fraction&quot;/&gt;
   * &lt;screenXY x=&quot;0.5&quot; y=&quot;0.5&quot; xunits=&quot;fraction&quot; yunits=&quot;fraction&quot;/&gt;
   * &lt;rotation&gt;39.37878630116985&lt;/rotation&gt;
   * &lt;size x=&quot;0&quot; y=&quot;0&quot; xunits=&quot;pixels&quot; yunits=&quot;pixels&quot;/&gt;
   * &lt;/ScreenOverlay&gt;
   * </pre>
   */
  @Test
  public abstract void screenOverlayExample();

  /**
   * Style
   * 
   * <pre>
   * &lt;Style id=&quot;ID&quot;&gt;
   * &lt;!-- extends StyleSelector --&gt;
   * 
   * &lt;!-- specific to Style --&gt;
   * &lt;IconStyle&gt;...&lt;/IconStyle&gt;
   * &lt;LabelStyle&gt;...&lt;/LabelStyle&gt;
   * &lt;LineStyle&gt;...&lt;/LineStyle&gt;
   * &lt;PolyStyle&gt;...&lt;/PolyStyle&gt;
   * &lt;BalloonStyle&gt;...&lt;/BalloonStyle&gt;
   * &lt;ListStyle&gt;...&lt;/ListStyle&gt;
   * &lt;/Style&gt;
   * </pre>
   */
  @Test
  public abstract void style();

  /**
   * Style - Example
   * 
   * <pre>
   * &lt;Document&gt;
   * &lt;!-- Begin Style Definitions --&gt;
   * &lt;Style id=&quot;myDefaultStyles&quot;&gt;
   *   &lt;IconStyle&gt;
   *     &lt;color&gt;a1ff00ff&lt;/color&gt;
   *     &lt;scale&gt;1.399999976158142&lt;/scale&gt;
   *     &lt;Icon&gt;
   *       &lt;href&gt;http://myserver.com/icon.jpg&lt;/href&gt;
   *     &lt;/Icon&gt;
   *   &lt;/IconStyle&gt;
   *   &lt;LabelStyle&gt;
   *     &lt;color&gt;7fffaaff&lt;/color&gt;
   *     &lt;scale&gt;1.5&lt;/scale&gt;
   *   &lt;/LabelStyle&gt;
   *   &lt;LineStyle&gt;
   *     &lt;color&gt;ff0000ff&lt;/color&gt;
   *     &lt;width&gt;15&lt;/width&gt;
   *   &lt;/LineStyle&gt;
   *   &lt;PolyStyle&gt;
   *     &lt;color&gt;7f7faaaa&lt;/color&gt;
   *     &lt;colorMode&gt;random&lt;/colorMode&gt;
   *   &lt;/PolyStyle&gt;
   * &lt;/Style&gt;
   * &lt;!-- End Style Definitions --&gt;
   * &lt;!-- Placemark #1 --&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Google Earth - New Polygon&lt;/name&gt;
   *   &lt;description&gt;Here is some descriptive text&lt;/description&gt;
   *   &lt;styleUrl&gt;#myDefaultStyles&lt;/styleUrl&gt;
   *   . . .
   * &lt;/Placemark&gt;
   * &lt;!-- Placemark #2 --&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;Google Earth - New Path&lt;/name&gt;
   *   &lt;styleUrl&gt;#myDefaultStyles&lt;/styleUrl&gt;
   *     . . . .
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void styleExample();

  /**
   * StyleMap
   * 
   * <pre>
   * &lt;StyleMap id=&quot;ID&quot;&gt;
   * &lt;!-- extends StyleSelector --&gt;
   * &lt;!-- elements specific to StyleMap --&gt;
   * &lt;Pair id=&quot;ID&quot;&gt;
   *   &lt;key&gt;normal&lt;/key&gt;              &lt;!-- kml:styleStateEnum:  normal or highlight --&gt;
   *   &lt;styleUrl&gt;...&lt;/styleUrl&gt; or &lt;Style&gt;...&lt;/Style&gt;
   * &lt;/Pair&gt;
   * &lt;/StyleMap&gt;
   * </pre>
   */
  @Test
  public abstract void styleMap();

  /**
   * StyleMap - Pair
   * 
   * <pre>
   * &lt;Pair&gt; 
   * &lt;key&gt;normal&lt;/key&gt; 
   * &lt;styleUrl&gt;http://myserver.com/populationProject.xml#example_style_off&lt;/styleUrl&gt; 
   * &lt;/Pair&gt;
   * </pre>
   */
  @Test
  public abstract void styleMapPair();

  /**
   * StyleMap - Example
   * 
   * <pre>
   * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
   * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot;&gt;
   * &lt;Document&gt;
   * &lt;name&gt;StyleMap.kml&lt;/name&gt;
   * &lt;open&gt;1&lt;/open&gt;
   * &lt;Style id=&quot;normalState&quot;&gt;
   *   &lt;IconStyle&gt;
   *     &lt;scale&gt;1.0&lt;/scale&gt;
   *     &lt;Icon&gt;
   *       &lt;href&gt;http://maps.google.com/mapfiles/kml/pal3/icon55.png&lt;/href&gt;
   *     &lt;/Icon&gt;
   *   &lt;/IconStyle&gt;
   *   &lt;LabelStyle&gt;
   *     &lt;scale&gt;1.0&lt;/scale&gt;
   *   &lt;/LabelStyle&gt;
   * &lt;/Style&gt;
   * &lt;Style id=&quot;highlightState&quot;&gt;
   *   &lt;IconStyle&gt;
   *     &lt;Icon&gt;
   *       &lt;href&gt;http://maps.google.com/mapfiles/kml/pal3/icon60.png&lt;/href&gt;
   *     &lt;/Icon&gt;
   *     &lt;scale&gt;1.1&lt;/scale&gt;
   *   &lt;/IconStyle&gt;
   *   &lt;LabelStyle&gt;
   *     &lt;scale&gt;1.1&lt;/scale&gt;
   *     &lt;color&gt;ff0000c0&lt;/color&gt;
   *   &lt;/LabelStyle&gt;
   * &lt;/Style&gt;
   * &lt;StyleMap id=&quot;styleMapExample&quot;&gt;
   *   &lt;Pair&gt;
   *     &lt;key&gt;normal&lt;/key&gt;
   *     &lt;styleUrl&gt;#normalState&lt;/styleUrl&gt;
   *   &lt;/Pair&gt;
   *   &lt;Pair&gt;
   *     &lt;key&gt;highlight&lt;/key&gt;
   *     &lt;styleUrl&gt;#highlightState&lt;/styleUrl&gt;
   *   &lt;/Pair&gt;
   * &lt;/StyleMap&gt;
   * &lt;Placemark&gt;
   *   &lt;name&gt;StyleMap example&lt;/name&gt;
   *   &lt;styleUrl&gt;#styleMapExample&lt;/styleUrl&gt;
   *   &lt;Point&gt;
   *     &lt;coordinates&gt;-122.368987,37.817634,0&lt;/coordinates&gt;
   *   &lt;/Point&gt;
   * &lt;/Placemark&gt;
   * &lt;/Document&gt;
   * &lt;/kml&gt;
   * </pre>
   */
  @Test
  public abstract void styleMapExample();

  /**
   * TimeSpan
   * 
   * <pre>
   * &lt;Placemark&gt;
   * &lt;name&gt;Colorado&lt;/name&gt;
   * .
   * .
   * .
   * &lt;TimeSpan id&quot;ID&quot;&gt;
   *   &lt;begin&gt;1876-08-01&lt;/begin&gt;
   * &lt;/TimeSpan&gt;
   * &lt;/Placemark&gt;
   * </pre>
   */
  @Test
  public abstract void timeSpan();

  /**
   * TimeStamp
   * 
   * <pre>
   * &lt;TimeStamp id=ID&gt;
   * &lt;when&gt;...&lt;/when&gt;      &lt;!-- kml:dateTime --&gt;
   * &lt;/TimeStamp&gt; 
   * 
   * &lt;TimeStamp&gt;
   * &lt;when&gt;1997&lt;/when&gt;
   * &lt;/TimeStamp&gt;
   * 
   * &lt;TimeStamp&gt;
   * &lt;when&gt;1997-07&lt;/when&gt;
   * &lt;/TimeStamp&gt; 
   * 
   * &lt;TimeStamp&gt;
   * &lt;when&gt;1997-07-16&lt;/when&gt;
   * &lt;/TimeStamp&gt; 
   * 
   * &lt;TimeStamp&gt;
   * &lt;when&gt;1997-07-16T07:30:15Z&lt;/when&gt;
   * &lt;/TimeStamp&gt;
   * 
   * &lt;TimeStamp&gt;
   * &lt;when&gt;1997-07-16T10:30:15+03:00&lt;/when&gt;
   * &lt;/TimeStamp&gt;
   * </pre>
   */
  @Test
  public abstract void timeStamp();

  /**
   * Update - Change
   * 
   * <pre>
   * &lt;NetworkLinkControl&gt; 
   * &lt;Update&gt; 
   *   &lt;targetHref&gt;http://www/&tilde;sam/January14Data/Point.kml&lt;/targetHref&gt; 
   *   &lt;Change&gt; 
   *     &lt;Point targetId=&quot;point123&quot;&gt; 
   *       &lt;coordinates&gt;-95.48,40.43,0&lt;/coordinates&gt;
   *     &lt;/Point&gt; 
   *   &lt;/Change&gt; 
   * &lt;/Update&gt; 
   * &lt;/NetworkLinkControl&gt;
   * </pre>
   */
  @Test
  public abstract void updateChange();

  /**
   * Update - Create
   * 
   * <pre>
   * &lt;Update&gt; 
   * &lt;targetHref&gt;http://myserver.com/Point.kml&lt;/targetHref&gt; 
   * &lt;Create&gt;
   *   &lt;Document targetId=&quot;region24&quot;&gt;
   *     &lt;Placemark id=&quot;placemark891&quot;&gt; 
   *       &lt;Point&gt; 
   *         &lt;coordinates&gt;-95.48,40.43,0&lt;/coordinates&gt; 
   *       &lt;/Point&gt;
   *     &lt;/Placemark&gt;
   *   &lt;/Document&gt; 
   * &lt;/Create&gt; 
   * &lt;/Update&gt;
   * </pre>
   */
  @Test
  public abstract void updateCreate();

  /**
   * Update - Delete
   * 
   * <pre>
   * &lt;Update&gt; 
   * &lt;targetHref&gt;http://www.foo.com/Point.kml&lt;/targetHref&gt; 
   * &lt;Delete&gt;
   *   &lt;Placemark targetId=&quot;pa3556&quot;&gt;&lt;/Placemark&gt;
   * &lt;/Delete&gt; 
   * &lt;/Update&gt;
   * </pre>
   */
  @Test
  public abstract void updateDelete();

}