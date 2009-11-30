package de.micromata.jak.ix;

import java.io.File;
import java.io.FileNotFoundException;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Style;

public class HelloIXStyled {

	public static void main(String[] args) throws FileNotFoundException {
		final Kml kml = new Kml();
		final Placemark placemark = kml.createAndSetPlacemark();
		
	  // Create and add <Style> with an <id>. <IconStyle> and <LabelStyle>.
		final Style style = placemark.createAndAddStyle().withId("iX_style");
		style.createAndSetIconStyle().withScale(1.4).createAndSetIcon().setHref("iX_logo.png");
		style.createAndSetLabelStyle().withScale(1.4);
		
		placemark.withName("iX")
		   .withDescription("<![CDATA[<b>Magazin für professionelle Informationstechnik</b> <img src=\"iX_logo.png\"/>]]>")
			 .withStyleUrl(style.getId())
			 .createAndSetPoint()
			     .withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND)
			     .addToCoordinates(9.806794999999999,52.38052399999999);
		
		//marshals to console
		kml.marshal();
		//marshals into file
		kml.marshal(new File("HelloIXStyled.kml"));
		kml.marshal(new File("HelloIXStyled.xml"));
	}
}

