
package de.micromata.opengis.kml.v_2_2_0;

import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

final class NamespaceFilterXMLReader
    implements XMLReader
{

    private XMLReader xmlReader;

    public NamespaceFilterXMLReader(boolean validate)
        throws ParserConfigurationException, SAXException
    {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        parserFactory.setNamespaceAware(true);
        parserFactory.setValidating(validate);
        // KML never needs a DOCTYPE. Refusing it blocks XXE, external DTD fetches (SSRF)
        // and entity expansion attacks (Issue 69). Unsupported features fail closed.
        parserFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        parserFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        parserFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        parserFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        parserFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        xmlReader = parserFactory.newSAXParser().getXMLReader();
    }

    public ContentHandler getContentHandler() {
        return xmlReader.getContentHandler();
    }

    public DTDHandler getDTDHandler() {
        return xmlReader.getDTDHandler();
    }

    public EntityResolver getEntityResolver() {
        return xmlReader.getEntityResolver();
    }

    public ErrorHandler getErrorHandler() {
        return xmlReader.getErrorHandler();
    }

    public boolean getFeature(String name)
        throws SAXNotRecognizedException, SAXNotSupportedException
    {
        return xmlReader.getFeature(name);
    }

    public Object getProperty(String name)
        throws SAXNotRecognizedException, SAXNotSupportedException
    {
        return xmlReader.getProperty(name);
    }

    public void parse(InputSource input)
        throws IOException, SAXException
    {
        xmlReader.parse(input);
    }

    public void parse(String systemId)
        throws IOException, SAXException
    {
        xmlReader.parse(systemId);
    }

    public void setContentHandler(ContentHandler handler) {
        xmlReader.setContentHandler(new NamespaceFilterHandler(handler));
    }

    public void setDTDHandler(DTDHandler handler) {
        xmlReader.setDTDHandler(handler);
    }

    public void setEntityResolver(EntityResolver handler) {
        xmlReader.setEntityResolver(handler);
    }

    public void setErrorHandler(ErrorHandler handler) {
        xmlReader.setErrorHandler(handler);
    }

    public void setFeature(String name, boolean value)
        throws SAXNotRecognizedException, SAXNotSupportedException
    {
        xmlReader.setFeature(name, value);
    }

    public void setProperty(String name, Object value)
        throws SAXNotRecognizedException, SAXNotSupportedException
    {
        xmlReader.setProperty(name, value);
    }

}
