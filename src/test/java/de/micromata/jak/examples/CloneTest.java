package de.micromata.jak.examples;

import java.io.File;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import de.micromata.opengis.kml.v_2_2_0.Boundary;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.MultiGeometry;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Polygon;

public class CloneTest {

  @Test
  public void testClonePlacemark() {
    String path = "src/main/resources/exampledata/worldBorders.kml";
    Kml kml = Kml.unmarshal(new File(path));
    Document document = (Document) kml.getFeature();
    Folder folder = (Folder) document.getFeature().get(0);
    Placemark pm = (Placemark) folder.getFeature().get(17);

    Placemark placemark = pm.clone();//Utils.clonePlacemark(pm);
    Assert.assertEquals(placemark,pm); // country with multipolygon, outer and inner linear ring objects
    
    Assert.assertEquals(pm.getId(), "BGD"); // country with multipolygon, outer and inner linear ring objects
    Assert.assertNotSame(pm, placemark);
    Assert.assertEquals(pm.getId(), placemark.getId());
    Assert.assertEquals(pm.getName(), placemark.getName());

    MultiGeometry multiGeometry = new MultiGeometry();
    MultiGeometry mg = ((MultiGeometry) pm.getGeometry());
    for (int i = 0; i < mg.getGeometry().size(); i++) {

      Polygon p = (Polygon) mg.getGeometry().get(i);
      Polygon polygon = new Polygon();
      polygon.withAltitudeMode(p.getAltitudeMode()).withExtrude(p.isExtrude());
      Assert.assertEquals(p.getAltitudeMode(), polygon.getAltitudeMode());
      Assert.assertEquals(p.isExtrude(), polygon.isExtrude());

      Boundary outerBoundaryIs = new Boundary();
      List<Coordinate> coordinates = outerBoundaryIs.createAndSetLinearRing().createAndSetCoordinates();

      // set the altitude of all vertices (height of the polygon)
      for (int j = 0; j < p.getOuterBoundaryIs().getLinearRing().getCoordinates().size(); j++) {
        Coordinate c = p.getOuterBoundaryIs().getLinearRing().getCoordinates().get(j);
        coordinates.add(j, new Coordinate(c.getLongitude(), c.getLatitude(), c.getAltitude()));
        double longitude = c.getLongitude();
        double latitude = c.getLatitude();
        double altitude = c.getAltitude();
        Assert.assertEquals(c.getLongitude(), coordinates.get(j).getLongitude());
        Assert.assertEquals(c.getLatitude(), coordinates.get(j).getLatitude());
        Assert.assertEquals(c.getAltitude(), coordinates.get(j).getAltitude());
        c.setLongitude(0);
        c.setLatitude(0);
        c.setAltitude(0);
        Assert.assertEquals(longitude, coordinates.get(j).getLongitude());
        Assert.assertEquals(latitude, coordinates.get(j).getLatitude());
        Assert.assertEquals(altitude, coordinates.get(j).getAltitude());

      }
      if (!p.getInnerBoundaryIs().isEmpty()) {
        for (int j = 0; j < p.getInnerBoundaryIs().size(); j++) {
          Boundary innerBoundary = new Boundary();
          List<Coordinate> coordinatesInner = innerBoundary.createAndSetLinearRing().createAndSetCoordinates();
          for (int k = 0; k < p.getInnerBoundaryIs().get(j).getLinearRing().getCoordinates().size(); k++) {
            Coordinate c = p.getInnerBoundaryIs().get(j).getLinearRing().getCoordinates().get(k);
            coordinatesInner.add(k, new Coordinate(c.getLongitude(), c.getLatitude(), c.getAltitude()));
            double longitude = c.getLongitude();
            double latitude = c.getLatitude();
            double altitude = c.getAltitude();
            Assert.assertEquals(c.getLongitude(), coordinatesInner.get(k).getLongitude());
            Assert.assertEquals(c.getLatitude(), coordinatesInner.get(k).getLatitude());
            Assert.assertEquals(c.getAltitude(), coordinatesInner.get(k).getAltitude());
            c.setLongitude(0);
            c.setLatitude(0);
            c.setAltitude(0);
            Assert.assertEquals(longitude, coordinatesInner.get(k).getLongitude());
            Assert.assertEquals(latitude, coordinatesInner.get(k).getLatitude());
            Assert.assertEquals(altitude, coordinatesInner.get(k).getAltitude());
          }
          polygon.addToInnerBoundaryIs(innerBoundary);
        }
      }
      polygon.setOuterBoundaryIs(outerBoundaryIs);
      multiGeometry.addToGeometry(polygon);
    }

    placemark.setGeometry(multiGeometry);

  }

}
