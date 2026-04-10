// No @XmlNs prefix hint is declared for the KML namespace: Kml.createMarshaller()
// installs a NamespacePrefixMapper that forces the KML namespace to be emitted as
// the default (unprefixed) namespace, because Google Maps rejects the prefixed
// form (e.g. <kml:kml>) as INVALID_KML. See README, "Namespace prefix in output".
@jakarta.xml.bind.annotation.XmlSchema(
    namespace = "http://www.opengis.net/kml/2.2",
    elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)
package de.micromata.opengis.kml.v_2_2_0;
