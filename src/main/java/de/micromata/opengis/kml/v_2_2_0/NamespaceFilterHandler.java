
package de.micromata.opengis.kml.v_2_2_0;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class NamespaceFilterHandler
    implements ContentHandler
{
    private final static String KML_20 = "http://earth.google.com/kml/2.0";
    private final static String KML_21 = "http://earth.google.com/kml/2.1";
    private final static String E_KML_22 = "http://earth.google.com/kml/2.2";
    private final static String KML_22 = "http://www.opengis.net/kml/2.2";
    private final static List<String> KML_2_SPECS = new ArrayList<>();

    static {
        KML_2_SPECS.add(KML_20);
        KML_2_SPECS.add(KML_21);
        KML_2_SPECS.add(E_KML_22);
        KML_2_SPECS.add(KML_22);
    }

    /**
     * Adds a URI of a known KML 2.X compatible specification.
     *
     * @param uri URI to a compatible KML 2.X implementation.
     */
    public static void addKml2SpecUri(String uri) {
        KML_2_SPECS.add(uri);
    }

    /**
     * @return List of known/supported KML 2.X specification URIs.
     */
    public List<String> getKml2SpecUris() {
        return Collections.unmodifiableList(KML_2_SPECS);
    }

    private final ContentHandler contentHandler;

    public NamespaceFilterHandler(ContentHandler contentHandler) {
        this.contentHandler = contentHandler;
    }

    public void startElement(String uri, String localName, String qName, Attributes atts)
        throws SAXException
    {
        if (KML_2_SPECS.contains(uri))
        {
            contentHandler.startElement(KML_22, localName, qName, atts);
        } else
        {
            contentHandler.startElement(uri, localName, qName, atts);
        }
    }

    public void characters(char[] ch, int start, int length)
        throws SAXException
    {
        contentHandler.characters(ch, start, length);
    }

    public void endDocument()
        throws SAXException
    {
        contentHandler.endDocument();
    }

    public void endElement(String uri, String localName, String qName)
        throws SAXException
    {
        contentHandler.endElement(uri, localName, qName);
    }

    public void endPrefixMapping(String prefix)
        throws SAXException
    {
        contentHandler.endPrefixMapping(prefix);
    }

    public void ignorableWhitespace(char[] ch, int start, int length)
        throws SAXException
    {
        contentHandler.ignorableWhitespace(ch, start, length);
    }

    public void processingInstruction(String target, String data)
        throws SAXException
    {
        contentHandler.processingInstruction(target, data);
    }

    public void setDocumentLocator(Locator locator) {
        contentHandler.setDocumentLocator(locator);
    }

    public void skippedEntity(String name)
        throws SAXException
    {
        contentHandler.skippedEntity(name);
    }

    public void startDocument()
        throws SAXException
    {
        contentHandler.startDocument();
    }

    public void startPrefixMapping(String prefix, String uri)
        throws SAXException
    {
        contentHandler.startPrefixMapping(prefix, uri);
    }

}
