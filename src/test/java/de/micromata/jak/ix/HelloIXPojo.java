package de.micromata.jak.ix;

import java.io.FileNotFoundException;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Point;

public class HelloIXPojo {

	public static void main(String[] args) throws FileNotFoundException {

		Kml kml = new Kml();
		Placemark placemark = new Placemark();
		kml.setFeature(placemark);
		placemark.setName("iX");

		Point point = new Point();
		placemark.setGeometry(point);
		point.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		point.getCoordinates().add(new Coordinate(9.806794999999999, 52.38052399999999));
		kml.marshal();

	}
}
