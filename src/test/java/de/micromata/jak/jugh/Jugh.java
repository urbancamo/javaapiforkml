// ///////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project JavaAPIforKML
//
// Author Flori (f.bachmann@micromata.de)
// Created Jun 28, 2009
// Copyright Micromata Jun 28, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
// ///////////////////////////////////////////////////////////////////////////
package de.micromata.jak.jugh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

import org.junit.Test;

import de.micromata.opengis.kml.v_2_2_0.AltitudeMode;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.KmlFactory;
import de.micromata.opengis.kml.v_2_2_0.NetworkLink;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Point;
import de.micromata.opengis.kml.v_2_2_0.Style;

public class Jugh {
	private static final Logger LOG = Logger.getLogger(Jugh.class.getName());

	private static final String JUGH_KML_URL = "http://www.jugh.de/kml/";

	/**
	 * <pre>
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot; xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot; xmlns:kml=&quot;http://www.opengis.net/kml/2.2&quot; xmlns:atom=&quot;http://www.w3.org/2005/Atom&quot;&gt;
	 * &lt;Placemark&gt;
	 *    &lt;name&gt;Java User Group Hessen - JUGH!&lt;/name&gt;
	 *   	&lt;Style id=&quot;jugh_style&quot;&gt;
	 * 		&lt;IconStyle&gt;
	 * 			&lt;scale&gt;1.4&lt;/scale&gt;
	 * 			&lt;Icon&gt;
	 * 				&lt;href&gt;http://www.jugh.de/kml/jugh_icon.png&lt;/href&gt;
	 * 			&lt;/Icon&gt;
	 * 		&lt;/IconStyle&gt;
	 * 		&lt;LabelStyle&gt;
	 * 		  	&lt;scale&gt;1.4&lt;/scale&gt;
	 * 		  &lt;/LabelStyle&gt;
	 * 	  &lt;/Style&gt;
	 *    &lt;description&gt;&lt;![CDATA[ 
	 * 
	 * 	&lt;img src=&quot;http://www.jugh.de/kml/jugh_logo.png&quot; alt=&quot;Java User Group Hessen - JUGH!&quot;/&gt;
	 * 	&lt;p&gt;Ist Java für dich weit mehr als eine IT-Technologie? Dann hast du jetzt Gelegenheit, deine Begeisterung mit uns zu teilen:
	 * 	Als überzeugte Java-Freunde haben wir endlich die Java User Group Hessen ins Leben gerufen.&lt;/p&gt;
	 * 	
	 * 	&lt;p&gt;&lt;b&gt;&lt;em&gt;Unsere Passion:&lt;/em&gt;&lt;/b&gt;
	 * 	Java und alles, was dazugehört.&lt;/p&gt;
	 * 	
	 * 	&lt;p&gt;&lt;b&gt;&lt;em&gt;Unsere Mission:&lt;/em&gt;&lt;/b&gt;
	 * 	Kreatives Potential bündeln und Hessens Softwareentwickler mit dem Java-Fieber infizieren.&lt;/p&gt;
	 * 	
	 * 	&lt;p&gt;&lt;b&gt;&lt;em&gt;Unsere Vision:&lt;/em&gt;&lt;/b&gt;
	 * 	Eine große und lebendige Java-Community.&lt;/p&gt;
	 * 
	 * 	&lt;p&gt;Wenn deine Leidenschaft für Java ebenfalls weit über reine Profession hinausgeht, bist du herzlich eingeladen dabei zu sein!&lt;/p&gt;
	 * 
	 * 	&lt;p&gt;&lt;b&gt;Java User Group Hessen&lt;/b&gt;&lt;br/&gt;
	 * 	&lt;em&gt;Initiator:&lt;/em&gt;&lt;br/&gt;
	 * 	&lt;img src=&quot;http://www.jugh.de/kml/jugh_micromata.png&quot; alt=&quot;Micromata GmbH&quot;/&gt;&lt;a href=&quot;http://www.micromata.de/&quot;&gt;Micromata GmbH&lt;/a&gt;&lt;br/&gt;
	 * 	Marie-Calm-Str. 1-5&lt;br/&gt;
	 * 	34131 Kassel&lt;br/&gt;
	 * 	&lt;br/&gt;
	 * 	&lt;em&gt;Site:&lt;/em&gt; &lt;a href=&quot;http://www.jugh.de/&quot;&gt;http://www.jugh.de/&lt;/a&gt;
	 * 	&lt;/p&gt;
	 *     ]]&gt;
	 *     &lt;/description&gt;
	 * 	&lt;styleUrl&gt;#jugh_style&lt;/styleUrl&gt;	
	 *     &lt;Point&gt;
	 *         &lt;coordinates&gt;9.444652669565212,51.30473589438118,0&lt;/coordinates&gt;
	 *     &lt;/Point&gt;
	 * &lt;/Placemark&gt;
	 * &lt;/kml&gt;
	 * </pre>
	 * @throws FileNotFoundException 
	 */
	
	@Test
	public void createJughKmzFileWithBallonDescriptionWithOutFluent2() throws FileNotFoundException {
	  // Create <coordinates>
		Coordinate coordinates = new Coordinate("9.444652669565212,51.30473589438118,0");
		
		//  Create <Point> set Extrude, AltitudeMode, and give it <coordinates>.
		Point point = KmlFactory.createPoint();
		point.setExtrude(false);
		point.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		point.getCoordinates().add(coordinates); // <-- point takes ownership

		
		// Create <Placemark> configure its values and set the <Point>.
		Placemark placemark = KmlFactory.createPlacemark();
		placemark.setName("Java User Group Hessen - JUGH!");
		placemark.setVisibility(true);
		placemark.setOpen(false);
		placemark.setDescription("die Java User Group Hessen");
		placemark.setStyleUrl("#jugh_style");
		placemark.setGeometry(point);            // <-- placemark takes ownership

		// Create <kml> and give it <Placemark>.
		Kml kml = KmlFactory.createKml();
		kml.setFeature(placemark);               // <-- kml takes ownership.
		kml.marshal(System.out);
	}

	@Test
	public void createJughKmzFileWithBallonDescriptionWithOutFluent() throws FileNotFoundException {
		// The all encapsulating kml element.
		Kml kml = KmlFactory.createKml();
		// Create <Placemark> and set values.
		Placemark placemark = KmlFactory.createPlacemark();
		placemark.setName("Java User Group Hessen - JUGH!");
		placemark.setVisibility(true);
		placemark.setOpen(false);
		placemark.setDescription("die Java User Group Hessen");
		placemark.setStyleUrl("#jugh_style");
		
		// Create <Point> and set values.
		Point point = KmlFactory.createPoint();
		point.setExtrude(false);
		point.setAltitudeMode(AltitudeMode.CLAMP_TO_GROUND);
		// Add <coordinates>9.444652669565212,51.30473589438118,0<coordinates>.
		point.getCoordinates().add(new Coordinate("9.444652669565212,51.30473589438118,0"));

		// Add <Point> 
		placemark.setGeometry(point);            // <-- placemark takes ownership
		kml.setFeature(placemark);               // <-- kml takes ownership.
		kml.marshal(System.out);
	}

	@Test
	public void createJughKmzFileWithBallonDescriptionWithFluent() throws FileNotFoundException {
			Kml kml = KmlFactory.createKml();
			kml.createAndSetPlacemark()
				.withName("Java User Group Hessen - JUGH!")
				.withVisibility(true)
				.withOpen(false)
				.withDescription("die Java User Group Hessen")
				.withStyleUrl("#jugh_style")
					.createAndSetPoint()
						.withExtrude(false)
						.withAltitudeMode(AltitudeMode.CLAMP_TO_GROUND)
						.addToCoordinates("9.444652669565212,51.30473589438118,0");
		 
		 kml.marshal(System.out);
	}

	@Test
	public void createJughKmzFileWithBallonDescription() {
		final Kml kml = new Kml();
		final Placemark placemark = kml.createAndSetPlacemark().withName("Java User Group Hessen - JUGH!");

		final Style style = placemark.createAndAddStyle().withId("jugh_style");
		style.createAndSetIconStyle().withScale(1.4).createAndSetIcon().setHref("http://www.jugh.de/kml/jugh_icon.png");
		style.createAndSetLabelStyle().withScale(1.4);

		// placemark.setDescription(Jugh.getBallonText());
		placemark.setDescription("die Java User Group Hessen");
		placemark.setStyleUrl("#jugh_style");
		placemark.createAndSetPoint().addToCoordinates("9.444652669565212,51.30473589438118,0");

		try {
			kml.marshal(System.out);
			// kml.marshal(new File("jughBallon.kml"), false);
		} catch (FileNotFoundException e) {
			LOG.info("Can't create file");
		}
	}

	public static String getBallonText() {
		StringBuffer sb = new StringBuffer();
		sb.append("<![CDATA[");
		sb.append("<img src=\"" + JUGH_KML_URL + "jugh_logo.png\" alt=\"Java User Group Hessen - JUGH!\"/>");
		sb
		    .append("<p>Ist Java für dich weit mehr als eine IT-Technologie? Dann hast du jetzt Gelegenheit, deine Begeisterung mit uns zu teilen:");
		sb.append("Als überzeugte Java-Freunde haben wir endlich die Java User Group Hessen ins Leben gerufen.</p>");
		sb.append("");
		sb.append("<p><b><em>Unsere Passion:</em></b>");
		sb.append("Java und alles, was dazugehört.</p>");
		sb.append("");
		sb.append("<p><b><em>Unsere Mission:</em></b>");
		sb.append("Kreatives Potential bündeln und Hessens Softwareentwickler mit dem Java-Fieber infizieren.</p>");
		sb.append("");
		sb.append("<p><b><em>Unsere Vision:</em></b>");
		sb.append("Eine große und lebendige Java-Community.</p>");
		sb.append("");
		sb
		    .append("<p>Wenn deine Leidenschaft für Java ebenfalls weit über reine Profession hinausgeht, bist du herzlich eingeladen dabei zu sein!</p>");
		sb.append("");
		sb.append("<p><b>Java User Group Hessen</b><br/>");
		sb.append("<em>Initiator:</em><br/>");
		sb
		    .append("<img src=\"" + JUGH_KML_URL + "jugh_micromata.png\" alt=\"Micromata GmbH\"/><a href=\"http://www.micromata.de/\">Micromata GmbH</a><br/>");
		sb.append("Marie-Calm-Str. 1-5<br/>");
		sb.append("34131 Kassel<br/>");
		sb.append("<br/>");
		sb.append("<em>Site:</em> <a href=\"http://www.jugh.de/\">http://www.jugh.de/</a>");
		sb.append("</p>");
		sb.append("]]>");
		return sb.toString();
	}

	/**
	 * <pre>
	 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
	 * &lt;kml xmlns=&quot;http://www.opengis.net/kml/2.2&quot; xmlns:gx=&quot;http://www.google.com/kml/ext/2.2&quot; xmlns:kml=&quot;http://www.opengis.net/kml/2.2&quot; xmlns:atom=&quot;http://www.w3.org/2005/Atom&quot;&gt;
	 *   &lt;NetworkLink&gt;
	 *      &lt;name&gt;Java User Group Hessen - JUGH!&lt;/name&gt;
	 *      &lt;visibility&gt;1&lt;/visibility&gt;
	 *      &lt;open&gt;1&lt;/open&gt;
	 *      &lt;description&gt;Refresh for latest version&lt;/description&gt;
	 *      &lt;refreshVisibility&gt;0&lt;/refreshVisibility&gt;
	 *      &lt;flyToView&gt;1&lt;/flyToView&gt;
	 *      &lt;Link&gt;
	 *        &lt;href&gt;http://www.jugh.de/kml/jugh.kmz&lt;/href&gt;
	 *      &lt;/Link&gt;
	 *   &lt;/NetworkLink&gt;
	 * </kml>
	 * 
	 * <pre>
	 */
	@Test
	public void createJughKmlFileWhichPointsToKmzFile() {
		final Kml kml = new Kml();
		final NetworkLink networklink = kml.createAndSetNetworkLink();
		networklink.withVisibility(true).withOpen(true).withRefreshVisibility(false).withFlyToView(true);
		networklink.setName("Java User Group Hessen - JUGH!");
		networklink.setDescription("Refresh for latest version");
		networklink.createAndSetLink().withHref(JUGH_KML_URL + "jugh.kmz");

		try {
			kml.marshal(System.out);
			// kml.marshal(new File("jugh.kml"), false);
		} catch (FileNotFoundException e) {
			LOG.info("Can't create file");
		}
	}

	public void testJughExample() throws FileNotFoundException {
		// The all encapsulating kml element.
		final Kml kml = new Kml();

		// Create and add <Placemark> with a <name>.
		final Placemark placemark = kml.createAndSetPlacemark().withName("Java User Group Hessen - JUGH!");

		// Create and add <Style> with an <id>. <IconStyle> and <LabelStyle> are configured.
		final Style style = placemark.createAndAddStyle().withId("jugh_style");
		style.createAndSetIconStyle().withScale(1.4).createAndSetIcon().setHref("jugh_icon.png");
		style.createAndSetLabelStyle().withScale(1.4);

		// Apply style to placemark and set description.
		placemark.setDescription("die Java User Group Hessen [...]");
		placemark.setStyleUrl(style.getId());

		// Create <Point> and set it to <coordinates>9.444652669565212,51.30473589438118,0<coordinates>.
		placemark.createAndSetPoint().addToCoordinates("9.444652669565212,51.30473589438118,0");

		// Print KML document to the console.
		//kml.marshal(System.out);
	}

}
