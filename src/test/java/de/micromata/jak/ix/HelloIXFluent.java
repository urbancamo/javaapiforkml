package de.micromata.jak.ix;

import java.io.File;
import java.io.FileNotFoundException;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.KmlFactory;

public class HelloIXFluent {

	public static void main(String[] args) throws FileNotFoundException {

		final Kml kml = KmlFactory.createKml();
		kml.createAndSetPlacemark()
		   .withName("iX")
		   .withDescription("Peter")
			 .createAndSetPoint()
			     .withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND)
			     .addToCoordinates(9.806794999999999,52.38052399999999);
		//marshals to console
		kml.marshal();
		//marshals into file
		kml.marshal(new File("HelloIXFluent.kml"));
		kml.marshal(new File("HelloIXFluent.xml"));
		
		Kml.unmarshal(new File("HelloIXFluent.xml"));
	}
}
