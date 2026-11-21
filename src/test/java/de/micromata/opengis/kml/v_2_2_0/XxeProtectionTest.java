package de.micromata.opengis.kml.v_2_2_0;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * Issue 69 - KML containing a DOCTYPE must be rejected (Kml.unmarshal returns null)
 * so that external entities and external DTDs are never resolved.
 */
public class XxeProtectionTest {

  private static final String SECRET = "TOP-SECRET-LOCAL-FILE-CONTENT";

  @Rule
  public TemporaryFolder temp = new TemporaryFolder();

  private File secretFile;

  @Before
  public void createSecretFile() throws IOException {
    secretFile = write("secret.txt", SECRET);
  }

  private String kmlWithDoctype(String doctype) {
    return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
        + doctype + "\n"
        + "<kml xmlns=\"http://www.opengis.net/kml/2.2\">"
        + "<Document><name>&xxe;</name></Document></kml>";
  }

  // DOCTYPE with an external general entity that points at a local file
  private String fileEntityKml() {
    return kmlWithDoctype("<!DOCTYPE kml [<!ENTITY xxe SYSTEM \"" + secretFile.toURI() + "\">]>");
  }

  private File write(String name, String content) throws IOException {
    File file = temp.newFile(name);
    Files.write(file.toPath(), content.getBytes(StandardCharsets.UTF_8));
    return file;
  }

  private byte[] kmz(String kml) throws IOException {
    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    try (ZipOutputStream zip = new ZipOutputStream(bytes)) {
      zip.putNextEntry(new ZipEntry("doc.kml"));
      zip.write(kml.getBytes(StandardCharsets.UTF_8));
      zip.closeEntry();
    }
    return bytes.toByteArray();
  }

  private void assertRejectedByAllEntryPoints(String kml) throws IOException {
    File file = write("doc.kml", kml);
    assertNull("unmarshal(File)", Kml.unmarshal(file));
    assertNull("unmarshal(File, false)", Kml.unmarshal(file, false));
    assertNull("unmarshal(File, true)", Kml.unmarshal(file, true));
    assertNull("unmarshal(String)", Kml.unmarshal(kml));
    try (FileInputStream in = new FileInputStream(file)) {
      assertNull("unmarshal(InputStream)", Kml.unmarshal(in));
    }

    File kmzFile = temp.newFile("doc.kmz");
    Files.write(kmzFile.toPath(), kmz(kml));
    for (Kml parsed : Kml.unmarshalFromKmz(kmzFile)) {
      assertNull("unmarshalFromKmz", parsed);
    }
  }

  @Test
  public void externalFileEntityIsRejected() throws IOException {
    assertRejectedByAllEntryPoints(fileEntityKml());
  }

  @Test
  public void externalDtdIsRejected() throws IOException {
    File dtd = write("external.dtd", "<!ENTITY xxe SYSTEM \"" + secretFile.toURI() + "\">");
    assertRejectedByAllEntryPoints(kmlWithDoctype("<!DOCTYPE kml SYSTEM \"" + dtd.toURI() + "\">"));
  }

  @Test
  public void externalParameterEntityDtdIsRejected() throws IOException {
    File dtd = write("external.dtd", "<!ENTITY xxe SYSTEM \"" + secretFile.toURI() + "\">");
    assertRejectedByAllEntryPoints(kmlWithDoctype(
        "<!DOCTYPE kml [<!ENTITY % dtd SYSTEM \"" + dtd.toURI() + "\"> %dtd;]>"));
  }

  @Test
  public void entityExpansionIsRejected() throws IOException {
    String doctype = "<!DOCTYPE kml ["
        + "<!ENTITY a \"aaaaaaaaaa\">"
        + "<!ENTITY b \"&a;&a;&a;&a;&a;&a;&a;&a;&a;&a;\">"
        + "<!ENTITY xxe \"&b;&b;&b;&b;&b;&b;&b;&b;&b;&b;\">]>";
    assertRejectedByAllEntryPoints(kmlWithDoctype(doctype));
  }

  @Test
  public void plainKmlStillParses() {
    Kml kml = Kml.unmarshal("<kml xmlns=\"http://www.opengis.net/kml/2.2\">"
        + "<Document><name>hello</name></Document></kml>");
    assertNotNull(kml);
    assertEquals("hello", kml.getFeature().getName());
  }

  @Test
  public void exampleDataStillParses() {
    File dir = new File("src/test/resources/exampledata");
    File[] kmlFiles = dir.listFiles((d, name) -> name.endsWith(".kml"));
    assertNotNull(kmlFiles);
    for (File file : kmlFiles) {
      assertNotNull(file.getName(), Kml.unmarshal(file));
    }
  }
}
