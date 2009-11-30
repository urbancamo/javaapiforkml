package de.micromata.jak.ix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Style;

public class HelloIXStyled2 {

	public static void main(String[] args) throws FileNotFoundException {
final Kml kml = Kml.unmarshal(new File("HelloIXFluent.kml"));

//get <Placemark>
final Placemark placemark = (Placemark) kml.getFeature();

// Create and add <Style> with an <id>. <IconStyle> and <LabelStyle>.
final Style style = placemark.createAndAddStyle().withId("iX_style");
style.createAndSetIconStyle().withScale(1.8).createAndSetIcon().setHref("iX_logo.png");
style.createAndSetLabelStyle().withScale(1.8);

placemark.withDescription("<em>Magazin für professionelle Informationstechnik</em><br /><img src=\"heise_logo.png\"/><img src=\"iX_logo.png\"/>").withStyleUrl(style.getId());

placemark.createAndSetLookAt().withLongitude(9.806794999999999).withLatitude(52.38052399999999).withRange(10000.0).withAltitudeMode(AltitudeMode.RELATIVE_TO_GROUND);
//9.806794999999999, 52.38052399999999
//marshals to console
//kml.marshal();
////marshals into file
//kml.marshal(new File("HelloIXStyled.kml"));
//kml.marshal(new File("HelloIXStyled.xml"));

StringWriter sw = new StringWriter();

 kml.marshal(sw);

 System.out.println(sw.getBuffer().delete(0, 56));


	}
	

}

