# Java API for KML

_The objective of the Java API for KML is to provide Java interfaces for easy access to KML (Keyhole Markup Language) data._

Thank you to the Micromata for open sourcing this project.
The repository has been transferred to [urbancamo](mailto:mark@wickensonline.co.uk) for onward maintenance.
He will endeavour to keep dependencies security patched moving forward.
Thank you to those who previously submitted pull requests or bug reports.


> If you are currently running version `2.x.x` then you will need to change the `groupId` from 
`de.micromata.jak` to `uk.m0nom` to be able to use versions `3.x.x` onwards.

Version 3+ of the library supports Java 11+ and is built with Java 11.

```xml
<!-- https://mvnrepository.com/artifact/uk.m0nom/javaapiforkml -->
<dependency>
    <groupId>uk.m0nom</groupId>
    <artifactId>javaapiforkml</artifactId>
    <version>${project.version}</version>
</dependency>
```

The maven repository entry is https://mvnrepository.com/artifact/uk.m0nom/javaapiforkml

---

The main goal of the Java API for KML (JAK) is to provide automatically generated full reference implementation of the 
KML object model defined by OGC’s KML standard and Google’s GX extensions. It is an object orientated API that enables 
the convenient and easy use of KML in existing Java environments.

KML is an XML-based language schema that describes and visualizes geographic data. The language is often used in 2D web 
based maps and 3D virtual globes. Originally developed for Google Earth as a means of maintaining and exchanging 
geographical data, the language was defined by the Open Geospatial Consortium (OGC) as a standard in April 2008. 
So far, many virtual globes, like for example NASA’s Earth Wind and Microsoft’s Virtual Earth, have adopted the KML
language as their data format of choice.

In order to ensure convenient and easy use of KML in existing Java-systems, an object oriented API is necessary. 
APIs for XML dialects are implemented using two layers. The current official XML schema of KML in conjunction with the
JAXB technology is used to generate Java class representations automatically. KML’s schema is a document describing 
the correct syntax of KML files and can, therefore, be used for validating the corresponding KML files. The semantic
application layer, which is found on top of the JAXB layer, is abstracted from the raw generated classes and defines
a well-shaped API.

This API provides easy out-of-the-box access to KML for the user (resp. the developer). This project created, a Java
API for KML (short: JAK) in order to enable this.

An archive of high level documentation can be found at:
https://web.archive.org/web/20170316194859/http://labs.micromata.de/projects/jak.html

---

## Namespace prefix in output

Between version `2.x` and `3.x` the library migrated from `javax.xml.bind` to
`jakarta.xml.bind` and switched to the Glassfish Jakarta JAXB runtime. That runtime
honours the `@XmlNs(prefix = "kml", ...)` hint in `package-info.java` that the older
Sun/Metro JAXB RI silently ignored, so identical source code that used to emit:

```xml
<kml xmlns="http://www.opengis.net/kml/2.2">
  <Document>...</Document>
</kml>
```

began emitting the fully-prefixed form:

```xml
<kml:kml xmlns:kml="http://www.opengis.net/kml/2.2">
  <kml:Document>...</kml:Document>
</kml:kml>
```

Google Maps and several other consumers reject the prefixed form with `INVALID_KML`
even though it is technically valid XML. (Simply removing the `@XmlNs` hint is *not*
enough — the Jakarta runtime will then auto-assign a prefix like `ns4:`, which is
worse.)

As of this release, `Kml.createMarshaller()` installs a default
`NamespacePrefixMapper` that forces the KML namespace to be emitted as the default
(unprefixed) namespace. The `gx`, `atom` and `xal` extension namespaces still get
their conventional prefixes when referenced, so output now looks like:

```xml
<kml xmlns:gx="http://www.google.com/kml/ext/2.2"
     xmlns:atom="http://www.w3.org/2005/Atom"
     xmlns:xal="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0"
     xmlns="http://www.opengis.net/kml/2.2">
  <Document>...</Document>
</kml>
```

which matches the `2.x` behaviour that Google Maps accepts.

### Restoring the `kml:` prefix

If you actually want the prefixed form, subclass `Kml` and override
`decorateMarshaller(JAXBContext, Marshaller)`. It is called *after* the default
prefix mapper is installed, so your replacement wins:

```java
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;
import de.micromata.opengis.kml.v_2_2_0.Kml;

public class PrefixedKml extends Kml {
    @Override
    protected void decorateMarshaller(JAXBContext context, Marshaller marshaller) {
        try {
            marshaller.setProperty(
                "org.glassfish.jaxb.namespacePrefixMapper",
                new NamespacePrefixMapper() {
                    @Override
                    public String getPreferredPrefix(String namespaceUri,
                                                     String suggestion,
                                                     boolean requirePrefix) {
                        if ("http://www.opengis.net/kml/2.2".equals(namespaceUri)) {
                            return "kml";
                        }
                        return suggestion;
                    }
                });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
```




