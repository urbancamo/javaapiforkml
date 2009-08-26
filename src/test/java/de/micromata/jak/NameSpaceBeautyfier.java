/////////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project   JavaAPIforKML
//
// Author    Flori (f.bachmann@micromata.de)
// Created   Aug 25, 2009
// Copyright Micromata Aug 25, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
/////////////////////////////////////////////////////////////////////////////
package de.micromata.jak;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public final class NameSpaceBeautyfier
   extends NamespacePrefixMapper
{


   /**
    * Internal method!
    * <p>Customizing Namespace Prefixes During Marshalling to a more readable format.</p>
    * <p>The default output is like:</p>
    * <pre>{@code&lt;kml ... xmlns:ns2="http://www.w3.org/2005/Atom" xmlns:ns3="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0" xmlns:ns4="http://www.google.com/kml/ext/2.2"&gt;}</pre>
    * <p>is changed to:</p>
    * <pre>{@code &lt;kml ... xmlns:atom="http://www.w3.org/2005/Atom" xmlns:xal="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0" xmlns:gx="http://www.google.com/kml/ext/2.2"&gt;}</pre><p>What it does:</p>
    * <p>namespaceUri: http://www.w3.org/2005/Atom              prefix: atom</p><p>namespaceUri: urn:oasis:names:tc:ciq:xsdschema:xAL:2.0 prefix: xal</p><p>namespaceUri: http://www.google.com/kml/ext/2.2        prefix: gx</p><p>namespaceUri: anything else prefix: null</p>
    * 
    */
   @Override
   public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
       if (namespaceUri.matches("http://www.w3.org/\\d{4}/Atom")) {
           return "atom";
       }
       if (namespaceUri.matches("urn:oasis:names:tc:ciq:xsdschema:xAL:.*?")) {
           return "xal";
       }
       if (namespaceUri.matches("http://www.google.com/kml/ext/.*?")) {
           return "gx";
       }
//       if (namespaceUri.matches("http://www.opengis.net/kml/.*?")) {
//           return "kml";
//       }
       return null;
   }

}