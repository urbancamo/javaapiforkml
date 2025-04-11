
package de.micromata.opengis.kml.v_2_2_0;

import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@code <imagepyramid>}
 * <p>
 * For very large images, you'll need to construct an image pyramid, which is a hierarchical 
 * set of images, each of which is an increasingly lower resolution version of the 
 * original image. Each image in the pyramid is subdivided into tiles, so that only 
 * the portions in view need to be loaded. Google Earth calculates the current viewpoint 
 * and loads the tiles that are appropriate to the user's distance from the image. 
 * As the viewpoint moves closer to the PhotoOverlay, Google Earth loads higher resolution 
 * tiles. Since all the pixels in the original image can't be viewed on the screen 
 * at once, this preprocessing allows Google Earth to achieve maximum performance because 
 * it loads only the portions of the image that are in view, and only the pixel details 
 * that can be discerned by the user at the current viewpoint. 
 * </p>
 * <p>
 * When you specify an image pyramid, you also modify the {@code <href>}in the {@code <Icon>}element 
 * to include specifications for which tiles to load. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagePyramidType", propOrder = {
    "tileSize",
    "maxWidth",
    "maxHeight",
    "gridOrigin",
    "imagePyramidSimpleExtension",
    "imagePyramidObjectExtension"
})
@XmlRootElement(name = "ImagePyramid", namespace = "http://www.opengis.net/kml/2.2")
public class ImagePyramid
    extends AbstractObject
    implements Cloneable
{

    /**
     * {@code <tileSize>}
     * <p>
     * Size of the tiles, in pixels. Tiles must be square, and {@code <tileSize>} must be a power
     * of 2. A tile size of 256 (the default) or 512 is recommended. The original image 
     * is divided into tiles of this size, at varying resolutions. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "256")
    protected int tileSize;
    /**
     * {@code <maxwidth>}
     * <p>
     * Width in pixels of the original image. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0")
    protected int maxWidth;
    /**
     * {@code <maxheight>}
     * <p>
     * Height in pixels of the original image. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0")
    protected int maxHeight;
    /**
     * GridOrigin
     * <p>
     * lowerLeft, upperLeft 
     * </p>
     * 
     * See Also: 
     * See {@code <PhotoOverlay>}
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "lowerLeft")
    protected GridOrigin gridOrigin;
    @XmlElement(name = "ImagePyramidSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> imagePyramidSimpleExtension;
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
    @XmlElement(name = "ImagePyramidObjectExtensionGroup")
    protected List<AbstractObject> imagePyramidObjectExtension;

    public ImagePyramid() {
        super();
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Integer}
     *     
     */
    public int getTileSize() {
        return tileSize;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Integer}
     *     
     */
    public void setTileSize(int value) {
        this.tileSize = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Integer}
     *     
     */
    public int getMaxWidth() {
        return maxWidth;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Integer}
     *     
     */
    public void setMaxWidth(int value) {
        this.maxWidth = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Integer}
     *     
     */
    public int getMaxHeight() {
        return maxHeight;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Integer}
     *     
     */
    public void setMaxHeight(int value) {
        this.maxHeight = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link GridOrigin}
     *     
     */
    public GridOrigin getGridOrigin() {
        return gridOrigin;
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link GridOrigin}
     *     
     */
    public void setGridOrigin(GridOrigin value) {
        this.gridOrigin = value;
    }

    /**
     *
     * 
     */
    public List<Object> getImagePyramidSimpleExtension() {
        if (imagePyramidSimpleExtension == null) {
            imagePyramidSimpleExtension = new ArrayList<Object>();
        }
        return this.imagePyramidSimpleExtension;
    }

    /**
     *
     * 
     */
    public List<AbstractObject> getImagePyramidObjectExtension() {
        if (imagePyramidObjectExtension == null) {
            imagePyramidObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.imagePyramidObjectExtension;
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

        ImagePyramid that = (ImagePyramid) object;
        return tileSize == that.tileSize
                && maxWidth == that.maxWidth
                && maxHeight == that.maxHeight
                && gridOrigin == that.gridOrigin
                && Objects.equals(imagePyramidSimpleExtension, that.imagePyramidSimpleExtension)
                && Objects.equals(imagePyramidObjectExtension, that.imagePyramidObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + tileSize;
        result = 31 * result + maxWidth;
        result = 31 * result + maxHeight;
        result = 31 * result + Objects.hashCode(gridOrigin);
        result = 31 * result + Objects.hashCode(imagePyramidSimpleExtension);
        result = 31 * result + Objects.hashCode(imagePyramidObjectExtension);
        return result;
    }

    /**
     *
     * 
     * @param imagePyramidSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setImagePyramidSimpleExtension(final List<Object> imagePyramidSimpleExtension) {
        this.imagePyramidSimpleExtension = imagePyramidSimpleExtension;
    }

    /**
     * add a value to the imagePyramidSimpleExtension property collection
     * 
     * @param imagePyramidSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ImagePyramid addToImagePyramidSimpleExtension(final Object imagePyramidSimpleExtension) {
        this.getImagePyramidSimpleExtension().add(imagePyramidSimpleExtension);
        return this;
    }

    /**
     *
     * 
     * @param imagePyramidObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setImagePyramidObjectExtension(final List<AbstractObject> imagePyramidObjectExtension) {
        this.imagePyramidObjectExtension = imagePyramidObjectExtension;
    }

    /**
     * add a value to the imagePyramidObjectExtension property collection
     * 
     * @param imagePyramidObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public ImagePyramid addToImagePyramidObjectExtension(final AbstractObject imagePyramidObjectExtension) {
        this.getImagePyramidObjectExtension().add(imagePyramidObjectExtension);
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
    public ImagePyramid addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param tileSize
     *     required parameter
     */
    public ImagePyramid withTileSize(final int tileSize) {
        this.setTileSize(tileSize);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param maxWidth
     *     required parameter
     */
    public ImagePyramid withMaxWidth(final int maxWidth) {
        this.setMaxWidth(maxWidth);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param maxHeight
     *     required parameter
     */
    public ImagePyramid withMaxHeight(final int maxHeight) {
        this.setMaxHeight(maxHeight);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param gridOrigin
     *     required parameter
     */
    public ImagePyramid withGridOrigin(final GridOrigin gridOrigin) {
        this.setGridOrigin(gridOrigin);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param imagePyramidSimpleExtension
     *     required parameter
     */
    public ImagePyramid withImagePyramidSimpleExtension(final List<Object> imagePyramidSimpleExtension) {
        this.setImagePyramidSimpleExtension(imagePyramidSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param imagePyramidObjectExtension
     *     required parameter
     */
    public ImagePyramid withImagePyramidObjectExtension(final List<AbstractObject> imagePyramidObjectExtension) {
        this.setImagePyramidObjectExtension(imagePyramidObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public ImagePyramid withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public ImagePyramid withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public ImagePyramid withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Override
    public ImagePyramid clone() {
        ImagePyramid copy;
        copy = ((ImagePyramid) super.clone());
        copy.imagePyramidSimpleExtension = new ArrayList<Object>((getImagePyramidSimpleExtension().size()));
        for (Object iter: imagePyramidSimpleExtension) {
            copy.imagePyramidSimpleExtension.add(iter);
        }
        copy.imagePyramidObjectExtension = new ArrayList<AbstractObject>((getImagePyramidObjectExtension().size()));
        for (AbstractObject iter: imagePyramidObjectExtension) {
            copy.imagePyramidObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
