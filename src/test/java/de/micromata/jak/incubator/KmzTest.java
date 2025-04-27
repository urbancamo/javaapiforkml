// ///////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project JavaAPIforKML
//
// Author Flori (f.bachmann@micromata.de)
// Created Aug 15, 2009
// Copyright Micromata Aug 15, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
// ///////////////////////////////////////////////////////////////////////////
package de.micromata.jak.incubator;

import org.junit.jupiter.api.Test;

import de.micromata.opengis.kml.v_2_2_0.Kml;

public class KmzTest {
	@Test
	public void helloKML() {

		final Kml kml = new Kml();
		kml.createAndSetPlacemark().withName("London, UK").withOpen(true).createAndSetPoint().addToCoordinates(-0.126236, 51.500152);
		kml.marshal();
	}
}
