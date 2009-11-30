/////////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project   JavaAPIforKML
//
// Author    Flori (f.bachmann@micromata.de)
// Created   Jun 28, 2009
// Copyright Micromata Jun 28, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
/////////////////////////////////////////////////////////////////////////////
package de.micromata.jak;

import java.lang.reflect.Field;

import junit.framework.Assert;

import org.junit.Test;

import de.micromata.jak.internal.IAtsConformanceLevel3;
import de.micromata.opengis.kml.v_2_2_0.BalloonStyle;
import de.micromata.opengis.kml.v_2_2_0.Metadata;
import de.micromata.opengis.kml.v_2_2_0.NetworkLink;
import de.micromata.opengis.kml.v_2_2_0.Orientation;
import de.micromata.opengis.kml.v_2_2_0.Scale;
import de.micromata.opengis.kml.v_2_2_0.Snippet;


/**
 * @author Flori (f.bachmann@micromata.de)
 *
 */
@SuppressWarnings("deprecation")
public class AtsConformanceLevel3Test implements IAtsConformanceLevel3 {

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc69PolygonRings()
	 */
	@Test
	public void atc69PolygonRings() {
		//TODO: take a second look
		//Confirm that no two rings comprising the boundary of a kml:Polygon geometry cross.
		//Pass if the assertion is satisfied; fail otherwise. The rings may intersect at a single point.
		//A kml:Polygon shall have an outer boundary ring outside of an update context, that is when 
		//not a descendant of kml:Update.  It may have 0 or more inner boundary rings.  Each ring is 
		//defined by a kml:LinearRing.  It is advised that the rings not cross each other. 
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc70LinearRingSimple()
	 */
	@Test
	public void atc70LinearRingSimple() {
		//TODO: take a second look
	 	//Check that a kml:LinearRing is a simple ring (that is, it does not cross itself).
		
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc71BaloonStyleColor()
	 */
	@Test
	public void atc71BaloonStyleColor() {
		Field color = Utils.findField(BalloonStyle.class, "color");
		Assert.assertNotNull(color);
		
  	final Deprecated annotation = color.getAnnotation(Deprecated.class);
  	Assert.assertEquals(Deprecated.class, annotation.annotationType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc72Metadata()
	 */
  @Test
	public void atc72Metadata() {
  	final Deprecated annotation = Metadata.class.getAnnotation(Deprecated.class);
  	Assert.assertEquals(Deprecated.class, annotation.annotationType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc73ScaleFullContent()
	 */
	@Test
	public void atc73ScaleFullContent() {
		Assert.assertNotNull(Utils.findField(Scale.class, "x"));
		Assert.assertNotNull(Utils.findField(Scale.class, "y"));
		Assert.assertNotNull(Utils.findField(Scale.class, "z"));
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc74LodFadeExtents()
	 */
	@Test
	public void atc74LodFadeExtents() {
		//TODO: take a second look
		//Verify the following constraint regarding the evaluation of fade extents: kml:minFadeExtent + kml:maxFadeExtent <= kml:maxLodPixels - kml:minLodPixels.
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc75OrientationFullContent()
	 */
	@Test
	public void atc75OrientationFullContent() {
		Assert.assertNotNull(Utils.findField(Orientation.class, "heading"));
		Assert.assertNotNull(Utils.findField(Orientation.class, "tilt"));
		Assert.assertNotNull(Utils.findField(Orientation.class, "roll"));
	} 
	
	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc76Snippet()
	 */
  @Test
	public void atc76Snippet() {
	 	Deprecated annotation = Snippet.class.getAnnotation(Deprecated.class);
  	Assert.assertEquals(Deprecated.class, annotation.annotationType());
	}

	/**
	 * @see de.micromata.jak.internal.IAtsConformanceLevel3#atc77NetworkLinkUrl()
	 */
  @Test
	public void atc77NetworkLinkUrl() {
		Field url = Utils.findField(NetworkLink.class, "url");
		Assert.assertNotNull(url);
		
	 	Deprecated annotation = url.getAnnotation(Deprecated.class);
  	Assert.assertEquals(Deprecated.class, annotation.annotationType());
	}

}
