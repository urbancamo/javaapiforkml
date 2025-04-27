
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import de.micromata.opengis.kml.v_2_2_0.atom.Author;
import de.micromata.opengis.kml.v_2_2_0.atom.Link;
import de.micromata.opengis.kml.v_2_2_0.gx.Tour;
import de.micromata.opengis.kml.v_2_2_0.xal.AddressDetails;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <Document>}
 * <p>
 * {@code <Document> <Style id="myPrettyDocument"> <ListStyle> ... </ListStyle> </Style> <styleUrl#myPrettyDocument">
 * ... </Document> }
 * </p>
 * <p>
 * A Document is a container for features and styles. This element is required if your 
 * KML file uses shared styles. It is recommended that you use shared styles, which 
 * require the following steps: 
 * </p>
 * <p>
 * Define all Styles in a Document. Assign a unique ID to each Style. Within a given 
 * Feature or StyleMap, reference the Style's ID using a {@code <styleUrl>} element.
 * </p>
 * <p>
 * Do not put shared styles within a Folder. 
 * </p>
 * <p>
 * Each Feature must explicitly reference the styles it uses in a {@code <styleUrl>} element. 
 * For a Style that applies to a Document (such as ListStyle), the Document itself 
 * must explicitly reference the {@code <styleUrl>}. For example:
 * </p>
 * <p>
 * Note that shared styles are not inherited by the Features in the Document. 
 * </p>
 * <p>
 * The following example illustrates use of a shared style. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Document id="ID"&gt;</strong>
 *   &lt;!-- inherited from <em>Feature</em> element --&gt;
 *   &lt;name&gt;<em>...</em>&lt;/name&gt;                      &lt;!-- string --&gt;
 *   &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
 *   &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
 *   <span>&lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
 *   &lt;atom:link&gt;...&lt;/atom:link&gt;</span><span>            &lt;!-- xmlns:atom --&gt;</span>
 *   &lt;address&gt;<em>...</em>&lt;/address&gt;                &lt;!-- string --&gt;
 *   &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;<br>  &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;<br>  &lt;Snippet maxLines="2"&gt;<em>...</em>&lt;/Snippet&gt;   &lt;!-- string --&gt;
 *   &lt;description&gt;<em>...</em>&lt;/description&gt;        &lt;!-- string --&gt;
 *   <span><em>&lt;AbstractView&gt;...&lt;/AbstractView&gt;</em>      &lt;!-- Camera <em>or</em> LookAt --&gt;</span>
 *   &lt;<em>TimePrimitive</em>&gt;...&lt;/<em>TimePrimitive</em>&gt;
 *   &lt;styleUrl&gt;<em>...</em>&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
 *   &lt;<em>StyleSelector&gt;...&lt;/StyleSelector&gt;</em>
 *   &lt;Region&gt;...&lt;/Region&gt;
 *   <span>&lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
 *   &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;</span>
 * 
 *   &lt;!-- specific to Document --&gt;
 *   &lt;!-- 0 or more Schema elements --&gt;
 *   &lt;!-- 0 or more <em>Feature</em> elements --&gt;
 * <strong>&lt;/Document&gt;</strong></pre>
 * 
 * Extends: 
 *
 * 
 * Contains: 
 *
 *
 *
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "schema",
    "feature",
    "documentSimpleExtension",
    "documentObjectExtension"
})
@XmlRootElement(name = "Document", namespace = "http://www.opengis.net/kml/2.2")
public class Document
    extends Container
    implements Cloneable
{

    /**
     * {@code <Schema>}
     * <p>
     * Specifies a custom KML schema that is used to add custom data to KML Features. The 
     * "id" attribute is required and must be unique within the KML file. {@code <Schema>} is always 
     * a child of {@code <Document>}. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;Schema name="string" id="ID"&gt;
     *   &lt;SimpleField type="string" name="string"&gt;
     *     &lt;displayName&gt;...&lt;/displayName&gt;            &lt;!-- string --&gt;
     *   &lt;/SimpleField&gt;
     * &lt;/Schema&gt;</pre>
     * 
     * Extends: 
     *
     * 
     * Contained By: 
     *
     * 
     * See Also: 
     * {@code <SchemaData>}
     * 
     * 
     * 
     */
    @XmlElement(name = "Schema")
    protected List<Schema> schema;
    /**
     * {@code <Feature>}
     * <p>
     * This is an abstract element and cannot be used directly in a KML file. The following 
     * diagram shows how some of a Feature's elements appear in Google Earth. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;
     * <strong>&lt;!--<em> Feature</em> id="ID" --&gt;</strong>                &lt;!-- Document,Folder,
     *                                              NetworkLink,Placemark,
     *                                              GroundOverlay,PhotoOverlay,ScreenOverlay --&gt;
     *   &lt;name&gt;<em>...</em>&lt;/name&gt;                      &lt;!-- string --&gt;
     *   &lt;visibility&gt;1&lt;/visibility&gt;            &lt;!-- boolean --&gt;
     *   &lt;open&gt;0&lt;/open&gt;                        &lt;!-- boolean --&gt;
     *   <span>&lt;atom:author&gt;...&lt;atom:author&gt;         &lt;!-- xmlns:atom --&gt;
     *   &lt;atom:link&gt;...&lt;/atom:link&gt;</span><span>            &lt;!-- xmlns:atom --&gt;</span>
     *   &lt;address&gt;<em>...</em>&lt;/address&gt;                &lt;!-- string --&gt;
     *   &lt;xal:AddressDetails&gt;...&lt;/xal:AddressDetails&gt;  &lt;!-- xmlns:xal --&gt;<br>  &lt;phoneNumber&gt;...&lt;/phoneNumber&gt;        &lt;!-- string --&gt;<br>  &lt;Snippet maxLines="2"&gt;<em>...</em>&lt;/Snippet&gt;   &lt;!-- string --&gt;
     *   &lt;description&gt;<em>...</em>&lt;/description&gt;        &lt;!-- string --&gt;
     *   <span><em>&lt;AbstractView&gt;...&lt;/AbstractView&gt;</em>      &lt;!-- Camera <em>or</em> LookAt --&gt;</span>
     *   &lt;<em>TimePrimitive</em>&gt;...&lt;/<em>TimePrimitive</em>&gt;    &lt;!-- TimeStamp or TimeSpan --&gt;
     *   &lt;styleUrl&gt;<em>...</em>&lt;/styleUrl&gt;              &lt;!-- anyURI --&gt;
     *   &lt;<em>StyleSelector&gt;...&lt;/StyleSelector&gt;</em>
     *   &lt;Region&gt;...&lt;/Region&gt;
     *   <span>&lt;Metadata&gt;...&lt;/Metadata&gt;              &lt;!-- deprecated in KML 2.2 --&gt;
     *   &lt;ExtendedData&gt;...&lt;/ExtendedData&gt;      &lt;!-- new in KML 2.2 --&gt;<br></span>&lt;-- /<em>Feature</em> --&gt;</pre>
     * 
     * Extends: 
     *
     * 
     * Extended By: 
     *
     *
     *
     *
     *
     * 
     * 
     * 
     */
    @XmlElementRef(name = "AbstractFeatureGroup", namespace = "http://www.opengis.net/kml/2.2", required = false)
    protected List<Feature> feature;
    @XmlElement(name = "DocumentSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> documentSimpleExtension;
    /**
     * {@code <Object>}
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the Update mechanism is to 
     * be used. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;<strong>
     * &lt;!-- <em>Object</em> id="ID" targetId="NCName" --&gt;
     * &lt;!-- /<em>Object</em>&gt; --&gt;</strong></pre>
     * 
     * 
     * 
     */
    @XmlElement(name = "DocumentObjectExtensionGroup")
    protected List<AbstractObject> documentObjectExtension;

    public Document() {
        super();
    }

    /**
     *
     * 
     */
    public List<Schema> getSchema() {
        if (schema == null) {
            schema = new ArrayList<Schema>();
        }
        return this.schema;
    }

    /**
     *
     * 
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<Feature>();
        }
        return this.feature;
    }

    /**
     *
     * 
     */
    public List<Object> getDocumentSimpleExtension() {
        if (documentSimpleExtension == null) {
            documentSimpleExtension = new ArrayList<Object>();
        }
        return this.documentSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getDocumentObjectExtension() {
        if (documentObjectExtension == null) {
            documentObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.documentObjectExtension;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;

        Document document = (Document) object;
        return Objects.equals(schema, document.schema)
                && Objects.equals(feature, document.feature)
                && Objects.equals(documentSimpleExtension, document.documentSimpleExtension)
                && Objects.equals(documentObjectExtension, document.documentObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(schema);
        result = 31 * result + Objects.hashCode(feature);
        result = 31 * result + Objects.hashCode(documentSimpleExtension);
        result = 31 * result + Objects.hashCode(documentObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link Schema} and adds it to schema.
     * This method is a short version for:
     * {@code
     * Schema schema = new Schema();
     * this.getSchema().add(schema); }
     * 
     * 
     */
    public Schema createAndAddSchema() {
        Schema newValue = new Schema();
        this.getSchema().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Tour} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Tour tour = new Tour();
     * this.getFeature().add(tour); }
     * 
     * 
     */
    public Tour createAndAddTour() {
        Tour newValue = new Tour();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link ScreenOverlay} and adds it to feature.
     * This method is a short version for:
     * {@code
     * ScreenOverlay screenOverlay = new ScreenOverlay();
     * this.getFeature().add(screenOverlay); }
     * 
     * 
     */
    public ScreenOverlay createAndAddScreenOverlay() {
        ScreenOverlay newValue = new ScreenOverlay();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link PhotoOverlay} and adds it to feature.
     * This method is a short version for:
     * {@code
     * PhotoOverlay photoOverlay = new PhotoOverlay();
     * this.getFeature().add(photoOverlay); }
     * 
     * 
     */
    public PhotoOverlay createAndAddPhotoOverlay() {
        PhotoOverlay newValue = new PhotoOverlay();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link GroundOverlay} and adds it to feature.
     * This method is a short version for:
     * {@code
     * GroundOverlay groundOverlay = new GroundOverlay();
     * this.getFeature().add(groundOverlay); }
     * 
     * 
     */
    public GroundOverlay createAndAddGroundOverlay() {
        GroundOverlay newValue = new GroundOverlay();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link NetworkLink} and adds it to feature.
     * This method is a short version for:
     * {@code
     * NetworkLink networkLink = new NetworkLink();
     * this.getFeature().add(networkLink); }
     * 
     * 
     */
    public NetworkLink createAndAddNetworkLink() {
        NetworkLink newValue = new NetworkLink();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Folder} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Folder folder = new Folder();
     * this.getFeature().add(folder); }
     * 
     * 
     */
    public Folder createAndAddFolder() {
        Folder newValue = new Folder();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of Document and adds it to feature.
     * This method is a short version for:
     * {@code
     * Document document = new Document();
     * this.getFeature().add(document); }
     * 
     * 
     */
    public Document createAndAddDocument() {
        Document newValue = new Document();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     * Creates a new instance of {@link Placemark} and adds it to feature.
     * This method is a short version for:
     * {@code
     * Placemark placemark = new Placemark();
     * this.getFeature().add(placemark); }
     * 
     * 
     */
    public Placemark createAndAddPlacemark() {
        Placemark newValue = new Placemark();
        this.getFeature().add(newValue);
        return newValue;
    }

    /**
     *
     * 
     * @param schema
     *     Objects of the following type are allowed in the list: {@link Schema}
     */
    public void setSchema(final List<Schema> schema) {
        this.schema = schema;
    }

    /**
     * add a value to the schema property collection
     * 
     * @param schema
     *     Objects of the following type are allowed in the list: {@link Schema}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Document addToSchema(final Schema schema) {
        this.getSchema().add(schema);
        return this;
    }

    /**
     *
     * 
     * @param feature
     *     Objects of the following type are allowed in the list: {@code <}{@link Container}{@code >}{@code <}{@link GroundOverlay}{@code >}{@code <}{@link NetworkLink}{@code >}{@code <}{@link Folder}{@code >}{@code <}{@link PhotoOverlay}{@code >}{@code <}Document{@code >}{@code <}{@link Tour}{@code >}{@code <}{@link ScreenOverlay}{@code >}{@code <}{@link Feature}{@code >}{@code <}{@link Placemark}{@code >}{@code <}{@link Overlay}{@code >}
     */
    public void setFeature(final List<Feature> feature) {
        this.feature = feature;
    }

    /**
     * add a value to the feature property collection
     * 
     * @param feature
     *     Objects of the following type are allowed in the list: {@code <}{@link Container}{@code >}{@code <}{@link GroundOverlay}{@code >}{@code <}{@link NetworkLink}{@code >}{@code <}{@link Folder}{@code >}{@code <}{@link PhotoOverlay}{@code >}{@code <}Document{@code >}{@code <}{@link Tour}{@code >}{@code <}{@link ScreenOverlay}{@code >}{@code <}{@link Feature}{@code >}{@code <}{@link Placemark}{@code >}{@code <}{@link Overlay}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Document addToFeature(final Feature feature) {
        this.getFeature().add(feature);
        return this;
    }

    /**
     *
     * 
     * @param documentSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setDocumentSimpleExtension(final List<Object> documentSimpleExtension) {
        this.documentSimpleExtension = documentSimpleExtension;
    }

    /**
     * add a value to the documentSimpleExtension property collection
     * 
     * @param documentSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Document addToDocumentSimpleExtension(final Object documentSimpleExtension) {
        this.getDocumentSimpleExtension().add(documentSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param documentObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setDocumentObjectExtension(final List<AbstractObject> documentObjectExtension) {
        this.documentObjectExtension = documentObjectExtension;
    }

    /**
     * add a value to the documentObjectExtension property collection
     * 
     * @param documentObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Document addToDocumentObjectExtension(final AbstractObject documentObjectExtension) {
        this.getDocumentObjectExtension().add(documentObjectExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Document addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setStyleSelector(final List<StyleSelector> styleSelector) {
        super.setStyleSelector(styleSelector);
    }

    @Obvious
    @Override
    public Document addToStyleSelector(final StyleSelector styleSelector) {
        super.getStyleSelector().add(styleSelector);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.setFeatureSimpleExtension(featureSimpleExtension);
    }

    @Obvious
    @Override
    public Document addToFeatureSimpleExtension(final Object featureSimpleExtension) {
        super.getFeatureSimpleExtension().add(featureSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.setFeatureObjectExtension(featureObjectExtension);
    }

    @Obvious
    @Override
    public Document addToFeatureObjectExtension(final AbstractObject featureObjectExtension) {
        super.getFeatureObjectExtension().add(featureObjectExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setContainerSimpleExtension(final List<Object> containerSimpleExtension) {
        super.setContainerSimpleExtension(containerSimpleExtension);
    }

    @Obvious
    @Override
    public Document addToContainerSimpleExtension(final Object containerSimpleExtension) {
        super.getContainerSimpleExtension().add(containerSimpleExtension);
        return this;
    }

    /**
     *
     * 
     */
    @Obvious
    @Override
    public void setContainerObjectExtension(final List<AbstractObject> containerObjectExtension) {
        super.setContainerObjectExtension(containerObjectExtension);
    }

    @Obvious
    @Override
    public Document addToContainerObjectExtension(final AbstractObject containerObjectExtension) {
        super.getContainerObjectExtension().add(containerObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param schema
     *     required parameter
     */
    public Document withSchema(final List<Schema> schema) {
        this.setSchema(schema);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param feature
     *     required parameter
     */
    public Document withFeature(final List<Feature> feature) {
        this.setFeature(feature);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param documentSimpleExtension
     *     required parameter
     */
    public Document withDocumentSimpleExtension(final List<Object> documentSimpleExtension) {
        this.setDocumentSimpleExtension(documentSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param documentObjectExtension
     *     required parameter
     */
    public Document withDocumentObjectExtension(final List<AbstractObject> documentObjectExtension) {
        this.setDocumentObjectExtension(documentObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Document withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Document withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Document withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Document withName(final String name) {
        super.withName(name);
        return this;
    }

    @Obvious
    @Override
    public Document withVisibility(final Boolean visibility) {
        super.withVisibility(visibility);
        return this;
    }

    @Obvious
    @Override
    public Document withOpen(final Boolean open) {
        super.withOpen(open);
        return this;
    }

    @Obvious
    @Override
    public Document withAtomAuthor(final Author atomAuthor) {
        super.withAtomAuthor(atomAuthor);
        return this;
    }

    @Obvious
    @Override
    public Document withAtomLink(final Link atomLink) {
        super.withAtomLink(atomLink);
        return this;
    }

    @Obvious
    @Override
    public Document withAddress(final String address) {
        super.withAddress(address);
        return this;
    }

    @Obvious
    @Override
    public Document withXalAddressDetails(final AddressDetails xalAddressDetails) {
        super.withXalAddressDetails(xalAddressDetails);
        return this;
    }

    @Obvious
    @Override
    public Document withPhoneNumber(final String phoneNumber) {
        super.withPhoneNumber(phoneNumber);
        return this;
    }

    @Obvious
    @Override
    public Document withSnippet(final Snippet snippet) {
        super.withSnippet(snippet);
        return this;
    }

    @Obvious
    @Override
    public Document withSnippetd(final String snippetd) {
        super.withSnippetd(snippetd);
        return this;
    }

    @Obvious
    @Override
    public Document withDescription(final String description) {
        super.withDescription(description);
        return this;
    }

    @Obvious
    @Override
    public Document withAbstractView(final AbstractView abstractView) {
        super.withAbstractView(abstractView);
        return this;
    }

    @Obvious
    @Override
    public Document withTimePrimitive(final TimePrimitive timePrimitive) {
        super.withTimePrimitive(timePrimitive);
        return this;
    }

    @Obvious
    @Override
    public Document withStyleUrl(final String styleUrl) {
        super.withStyleUrl(styleUrl);
        return this;
    }

    @Obvious
    @Override
    public Document withStyleSelector(final List<StyleSelector> styleSelector) {
        super.withStyleSelector(styleSelector);
        return this;
    }

    @Obvious
    @Override
    public Document withRegion(final Region region) {
        super.withRegion(region);
        return this;
    }

    @Obvious
    @Override
    public Document withMetadata(final Metadata metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Obvious
    @Override
    public Document withExtendedData(final ExtendedData extendedData) {
        super.withExtendedData(extendedData);
        return this;
    }

    @Obvious
    @Override
    public Document withFeatureSimpleExtension(final List<Object> featureSimpleExtension) {
        super.withFeatureSimpleExtension(featureSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Document withFeatureObjectExtension(final List<AbstractObject> featureObjectExtension) {
        super.withFeatureObjectExtension(featureObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Document withContainerSimpleExtension(final List<Object> containerSimpleExtension) {
        super.withContainerSimpleExtension(containerSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Document withContainerObjectExtension(final List<AbstractObject> containerObjectExtension) {
        super.withContainerObjectExtension(containerObjectExtension);
        return this;
    }

    @Override
    public Document clone() {
        Document copy;
        copy = ((Document) super.clone());
        copy.schema = new ArrayList<Schema>((getSchema().size()));
        for (Schema iter: schema) {
            copy.schema.add(iter.clone());
        }
        copy.feature = new ArrayList<Feature>((getFeature().size()));
        for (Feature iter: feature) {
            copy.feature.add(iter.clone());
        }
        copy.documentSimpleExtension = new ArrayList<Object>((getDocumentSimpleExtension().size()));
        for (Object iter: documentSimpleExtension) {
            copy.documentSimpleExtension.add(iter);
        }
        copy.documentObjectExtension = new ArrayList<AbstractObject>((getDocumentObjectExtension().size()));
        for (AbstractObject iter: documentObjectExtension) {
            copy.documentObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
