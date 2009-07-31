// ///////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project JavaAPIforKML
//
// Author Flori (f.bachmann@micromata.de)
// Created Jun 9, 2009
// Copyright Micromata Jun 9, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
// ///////////////////////////////////////////////////////////////////////////
package de.micromata.javaapiforkml.incubator;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLTestCase;

public class KmlUnit extends XMLTestCase {
	public KmlUnit(String name) {
		super(name);
	}

	public void testForEquality() throws Exception {
		String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
		String myTestXML = "<msg><localId>2376</localId></msg>";
		assertXMLEqual("comparing test xml to control xml", myControlXML, myTestXML);

		assertXMLNotEqual("test xml not similar to control xml", myControlXML, myTestXML);
	}

	public void testIdentical() throws Exception {
		String myControlXML = "<struct><int>3</int><boolean>false</boolean></struct>";
		String myTestXML = "<struct><boolean>false</boolean><int>3</int></struct>";
		Diff myDiff = new Diff(myControlXML, myTestXML);
		assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
		assertTrue("but are they identical? " + myDiff, myDiff.identical());
	}

	public void testIdentical3() throws Exception {
		String myControlXML = "<struct><int>3</int><boolean>false</boolean></struct>";
		String myTestXML = "<struct><int>3</int><boolean>false</boolean></struct>";
		Diff myDiff = new Diff(myControlXML, myTestXML);
		assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
		assertTrue("but are they identical? " + myDiff, myDiff.identical());
	}

}
