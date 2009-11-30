package de.micromata.jak.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests fot the reading CSV files
 */
public class ReadCsvFileTest {

  @Ignore
  public void printAlphabeticalOrder() throws IOException {

    HashMap<String, Double> data = Utils.readCSVDoubleData("src/main/resources/exampledata/mobile_phone_2008.csv", 0, 3);
    ArrayList<String> keys = new ArrayList<String>();
    keys.addAll(data.keySet());
    Collections.sort(keys);
    Iterator<String> iterator = keys.iterator();
    while (iterator.hasNext())
      System.out.println(iterator.next());
  }

  @Test
  public void readCsvFileTest() throws IOException {
    HashMap<String, Double> data = Utils.readCSVDoubleData("src/main/resources/exampledata/mobile_phone_2008.csv", 0, 3);
    data.remove("maximum");
    data.remove("minimum");

    Assert.assertEquals(153, data.size()); // check size

    ArrayList<String> keys = new ArrayList<String>();
    keys.addAll(data.keySet());
    Collections.sort(keys);
    Iterator<String> iterator = keys.iterator();
    String code = null;
    int counter = 0;
    while (iterator.hasNext()) {
      code = iterator.next();
      // check first and last element
      switch (counter) {
      case 0:
        Assert.assertEquals("ABW", code);
        break;
      case 153:
        Assert.assertEquals("ZWE", code);
        break;
      }
      counter++;
    }
  }

  @Test
  public void readMultiDataFromCsvFile() throws IOException {

    HashMap<String, HashMap<String, Double>> result = Utils.readMultiDataFromCVS(
        "src/main/resources/exampledata/mobile_phone.csv", 0, 3, 2);
    result.remove("info");
    Assert.assertEquals(217, result.size()); // check size

    HashMap<String, Double> afg = result.get("AFG");
    Assert.assertNotNull(afg);
    ArrayList<String> afg_keys = new ArrayList<String>();
    afg_keys.addAll(afg.keySet());
    Collections.sort(afg_keys);
    Iterator<String> afg_iterator = afg_keys.iterator();
    String year = null;
    while (afg_iterator.hasNext()) {
      year = afg_iterator.next();
      int year_int = Integer.parseInt(year);
      switch (year_int) {
      case 2002:
        Assert.assertEquals(25000.0, afg.get(year), 0.1);
        break;
      case 2003:
        Assert.assertEquals(200000.0, afg.get(year), 0.1);
        break;
      case 2004:
        Assert.assertEquals(600000.0, afg.get(year), 0.1);
        break;
      case 2005:
        Assert.assertEquals(1200000.0, afg.get(year), 0.1);
        break;
      case 2006:
        Assert.assertEquals(2520366.0, afg.get(year), 0.1);
        break;
      case 2007:
        Assert.assertEquals(4668096.0, afg.get(year), 0.1);
        break;
      case 2008:
        Assert.assertEquals(7898909.0, afg.get(year), 0.1);
        break;
      default:
        Assert.assertEquals(0.0, afg.get(year), 0.1); // 1960 - 2001
      }
    }

  }

}
