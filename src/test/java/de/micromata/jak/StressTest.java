package de.micromata.jak;

import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LineString;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

// needs vm-argument: -Xms2g -Xmx2g
public final class StressTest {
	private static final String LOG4J_LOCATION = "src/main/java/log4j.properties";

	private final Logger LOG = Logger.getLogger(getClass().getName());

	private final Random randomElement = new Random();;

	@Before
	public void setUp() {
		PropertyConfigurator.configure(LOG4J_LOCATION);
	}

	@Test
	public void stess() throws FileNotFoundException {
		coordinates(1);
		coordinates(5);
		// coordinates(10);
		// coordinates(50);
		// coordinates(100);
		// coordinates(500);
		// coordinates(1000);
		// coordinates(5000);
		// coordinates(10000);
		// coordinates(50000);
		// coordinates(100000);
		// coordinates(500000);
		// coordinates(1000000);
		// coordinates(5000000);
	}

	private void coordinates(int coordinates) throws FileNotFoundException {
		int repeat = 2;
		coordinates(repeat, coordinates, true);
		coordinates(repeat, coordinates, false);
	}

	private void coordinates(int repeat, int coordinates, boolean useStringConstructor) throws FileNotFoundException {
		String filename = null;
		List<Statistics> stats = new ArrayList<Statistics>();
		for (int i = 0; i < repeat; i++) {
			filename = "coordinates_" + useStringConstructor + "_" + coordinates + "_" + i + ".kml";
			stats.add(coordinates(filename, coordinates, useStringConstructor));
		}

		double timeCreate = 0;
		double timeMarshal = 0;
		double timeUnmarshal = 0;
		double fileSize = 0;
		for (Statistics stat : stats) {
			timeCreate += stat.getTimeCreate().current();
			timeMarshal += stat.getTimeMarhsal().current();
			timeUnmarshal += stat.getTimeUnmarhsal().current();
			fileSize += stat.getFileSize();
		}

		timeCreate /= (double) repeat;
		timeMarshal /= (double) repeat;
		timeUnmarshal /= (double) repeat;
		fileSize /= (double) repeat;

		LOG.info("----------------> " + filename);
		LOG.info("Coordinates:      " + coordinates);
		LOG.info("File size   [MB]: " + fileSize);
		LOG.info("Time create:      " + timeCreate);
		LOG.info("Time marshal:     " + timeMarshal);
		LOG.info("Time unmarshal:   " + timeUnmarshal);

	}

	private Statistics coordinates(String filename, int coordinates, boolean useStringConstructor) throws FileNotFoundException {
		Runtime r = Runtime.getRuntime();
		r.gc();

		Statistics stats = new Statistics(filename, coordinates);

		// measure the create part
		stats.getTimeCreate().start();
		Kml kml = new Kml();
		final Document document = kml.createAndSetDocument().withName("StressTest-Test");
		final Placemark p1 = document.createAndAddPlacemark().withName(filename);
		final LineString ls = p1.createAndSetLineString().withTessellate(true);
		final List<Coordinate> coords = ls.createAndSetCoordinates();

		if (useStringConstructor) {
			for (int i = 0; i < coordinates; i++) {
				coords.add(new Coordinate(getRandomCoordinate()));
			}
		} else {
			for (int i = 0; i < coordinates; i++) {
				coords.add(new Coordinate(randLongitude(), randLongitude(), 0));
			}

		}
		stats.getTimeCreate().end();

		StringWriter out = new StringWriter();
		// measure the marshal part
		stats.getTimeMarhsal().start();
		// kml.marshal(new File(filename), false);
		kml.marshal(out);
		stats.getTimeMarhsal().end();
		coords.clear();
		kml = null;

		// measure the unmarshal part
		stats.getTimeUnmarhsal().start();
		// Kml.unmarshal(new File(filename), false);
		Kml.unmarshal(out.toString());
		stats.getTimeUnmarhsal().end();
		return stats;
	}

	/**
	 * Longitude and latitude values are in degrees, where
	 * <ul>
	 * <li>longitude => −180 and <= 180</li>
	 * <li>latitude => −90 and <= 90</li>
	 * <li>altitude values (optional) are in meters above sea level</li>
	 * </ul>
	 */
	private String getRandomCoordinate() {
		final StringBuilder random = new StringBuilder();
		random.append(randLongitude() + ",");
		random.append(randLatitude() + ",");
		random.append("0 ");

		return random.toString();
	}

	/**
	 * longitude => −180 and <= 180
	 */
	private double randLongitude() {
		final int minRandom = -180;
		final int maxRandom = +180 * 2;
		return (randomElement.nextDouble() * maxRandom) + minRandom;
	}

	/**
	 * latitude => −90 and <= 90
	 */
	private double randLatitude() {
		final int minRandom = -90;
		final int maxRandom = +90 * 2;

		return (randomElement.nextDouble() * maxRandom) + minRandom;
	}

	final class Statistics {
		final private Time timeCreate = new Time();

		final private Time timeMarhsal = new Time();

		final private Time timeUnmarhsal = new Time();

		private String filename;

		private int coordinates;

		public String getFilename() {
			return filename;
		}

		public int getCoordinates() {
			return coordinates;
		}

		public float getFileSize() {
			return fileSize;
		}

		private float fileSize;

		public Statistics(String filename, int coordinates) {
			this.filename = filename;
			this.coordinates = coordinates;
		}

		public Time getTimeCreate() {
			return timeCreate;
		}

		public Time getTimeMarhsal() {
			return timeMarhsal;
		}

		public Time getTimeUnmarhsal() {
			return timeUnmarhsal;
		}

		public void setFileSize(float f) {
			fileSize = f;
		}

	}

	class Time {
		private long start = 0; // start timing

		private long end = 0; // start timing

		private long current = 0;

		public void start() {
			start = System.currentTimeMillis();
		}

		public void end() {
			end = System.currentTimeMillis();
			current = (end - start);
		}

		public double current() {
			return (double) (current / 1000.0d);
		}
	}
}
