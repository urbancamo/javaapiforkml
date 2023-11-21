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




