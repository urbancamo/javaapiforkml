package de.micromata.javaapiforkml.incubator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Logger;

import org.xml.sax.SAXException;

import de.micromata.opengis.kml.v_2_2_0.Kml;
import org.custommonkey.xmlunit.*;


public class KmlSamplesGoogleCodeTest  extends XMLTestCase {
  public KmlSamplesGoogleCodeTest(String name) {
    super(name);
}

	private final Logger LOG = Logger.getLogger(getClass().getName());

	public static String TEST_FOLDER = "src/test/resources/kml-samples/";
	public static String TEST_FOLDER_GEN = "src/test/resources/kml-gen/";

	public void testKml12() throws SAXException, IOException {
		Kml kml = Kml.unmarshal(new File(TEST_FOLDER + "./Document/doc-without-id.kml"));
		
		
		
		StringWriter out = new StringWriter();
		kml.marshal(out);
		
		

		String control = getContents(new File(TEST_FOLDER + "./Document/doc-without-id.kml"));
		
//		StreamSource ss = new StreamSource();
//		StringReader string = new StringReader(new File(TEST_FOLDER + "./Document/doc-without-id.kml"));
		LOG.info(control.toString());
		LOG.info(".......");
		LOG.info(out.toString());
		
//assertXMLEqual(control, out.toString());
		
		
	}
	
	
	
  static public String getContents(File aFile) {
    //...checks on aFile are elided
    StringBuilder contents = new StringBuilder();
    
    try {
      //use buffering, reading one line at a time
      //FileReader always assumes default encoding is OK!
      BufferedReader input =  new BufferedReader(new FileReader(aFile));
      try {
        String line = null; //not declared within while loop
        /*
        * readLine is a bit quirky :
        * it returns the content of a line MINUS the newline.
        * it returns null only for the END of the stream.
        * it returns an empty String if two newlines appear in a row.
        */
        while (( line = input.readLine()) != null){
          contents.append(line);
          contents.append(System.getProperty("line.separator"));
        }
      }
      finally {
        input.close();
      }
    }
    catch (IOException ex){
      ex.printStackTrace();
    }
    
    return contents.toString();
  }
	
//
//	public void testForEquality() throws Exception {
//		String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
//		String myTestXML = "<msg><localId>2376</localId></msg>";
//		assertXMLEqual("comparing test xml to control xml", myControlXML, myTestXML);
//
//		assertXMLNotEqual("test xml not similar to control xml", myControlXML, myTestXML);
//	}
//
//	public void testIdentical() throws Exception {
//		String myControlXML = "<struct><int>3</int><boolean>false</boolean></struct>";
//		String myTestXML = "<struct><boolean>false</boolean><int>3</int></struct>";
//		Diff myDiff = new Diff(myControlXML, myTestXML);
//		assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
//		assertTrue("but are they identical? " + myDiff, myDiff.identical());
//	}
//
//	public void testAllDifferences() throws Exception {
//		String myControlXML = "<news><item id=\"1\">War</item>" + "<item id=\"2\">Plague</item><item id=\"3\">Famine</item></news>";
//		String myTestXML = "<news><item id=\"1\">Peace</item>" + "<item id=\"2\">Health</item><item id=\"3\">Plenty</item></news>";
//		DetailedDiff myDiff = new DetailedDiff(compareXML(myControlXML, myTestXML));
//		List allDifferences = myDiff.getAllDifferences();
//		assertEquals(myDiff.toString(), 0, allDifferences.size());
//	}
//
//	public void testCompareToSkeletonXML() throws Exception {
//		String myControlXML = "<location><street-address>22 any street</street-address><postcode>XY00 99Z</postcode></location>";
//		String myTestXML = "<location><street-address>20 east cheap</street-address><postcode>EC3M 1EB</postcode></location>";
//		DifferenceListener myDifferenceListener = new IgnoreTextAndAttributeValuesDifferenceListener();
//		Diff myDiff = new Diff(myControlXML, myTestXML);
//		myDiff.overrideDifferenceListener(myDifferenceListener);
//		assertTrue("test XML matches control skeleton XML " + myDiff, myDiff.similar());
//	}
//
//	public void testRepeatedChildElements() throws Exception {
//		String myControlXML = "<suite><test status=\"pass\">FirstTestCase</test><test status=\"pass\">SecondTestCase</test></suite>";
//		String myTestXML = "<suite><test status=\"pass\">SecondTestCase</test><test status=\"pass\">FirstTestCase</test></suite>";
//
//		assertXMLNotEqual("Repeated child elements in different sequence order are not equal by default", myControlXML, myTestXML);
//
//		Diff myDiff = new Diff(myControlXML, myTestXML);
//		myDiff.overrideElementQualifier(new ElementNameAndTextQualifier());
//		assertXMLEqual("But they are equal when an ElementQualifier controls which test element is compared with each control element", myDiff,
//		    true);
//	}

}
