[![No Maintenance Intended](http://unmaintained.tech/badge.svg)](http://unmaintained.tech/)

# Java API for KML

> The objective of the Java API for KML is to provide Java interfaces for easy access to KML (Keyhole Markup Language) data.

# Unmaintained for now

See https://github.com/micromata/javaapiforkml/issues/18

---

The main goal of the Java API for KML (JAK) is to provide automatically generated full reference implementation of the KML object model defined by OGC’s KML standard and Google’s GX extensions. It is an object orientated API that enables the convenient and easy use of KML in existing Java environments.

KML is an XML-based language schema that describes and visualizes geographic data. The language is often used in 2D web based maps and 3D virtual globes. Originally developed for Google Earth as a means of maintaining and exchanging geographical data, the language was defined by the Open Geospatial Consortium (OGC) as a standard in April 2008. So far, many virtual globes, like for example NASA’s Earth Wind and Microsoft’s Virtual Earth, have adopted the KML language as their data format of choice.

In order to ensure convenient and easy use of KML in existing Java-systems, an object oriented API is necessary. APIs for XML dialects are implemented using two layers. The current official XML schema of KML in conjunction with the JAXB technology is used to generate Java class representations automatically. KML’s schema is a document describing the correct syntax of KML files and can, therefore, be used for validating the corresponding KML files. The semantic application layer, which is found on top of the JAXB layer, is abstracted from the raw generated classes and defines a well-shaped API.

This API provides easy out-of-the-box access to KML for the user (resp. the developer). This project created, a Java API for KML (short: JAK) in order to enable this.

A high level documentation can be found at: http://labs.micromata.de/projects/jak.html

The current JARs can be obtained via Maven or at the Download page:

```
<dependencies>
    ...
   <dependency>
      <groupId>de.micromata.jak</groupId>
      <artifactId>JavaAPIforKml</artifactId>
      <version>2.2.0-SNAPSHOT</version>
   </dependency>
    ...
</dependencies>
<repositories>
    ...
   <repository>
      <id>maven2-repository.dev.java.net</id>
      <name>Java.net Maven 2 Repository</name>
      <url>http://download.java.net/maven/2</url>
      <layout>default</layout>
      <snapshots>
         <enabled>true</enabled>
      </snapshots>
      </repository>
</repositories>
```
