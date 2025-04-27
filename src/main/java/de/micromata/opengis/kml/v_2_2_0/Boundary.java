
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundaryType", propOrder = {
    "linearRing",
    "boundarySimpleExtension",
    "boundaryObjectExtension"
})
@XmlRootElement(name = "Boundary", namespace = "http://www.opengis.net/kml/2.2")
public class Boundary implements Cloneable
{

    @XmlElement(name = "LinearRing")
    protected LinearRing linearRing;
    @XmlElement(name = "BoundarySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> boundarySimpleExtension;
    @XmlElement(name = "BoundaryObjectExtensionGroup")
    protected List<AbstractObject> boundaryObjectExtension;

    public Boundary() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link LinearRing}
     *     
     */
    public LinearRing getLinearRing() {
        return linearRing;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link LinearRing}
     *     
     */
    public void setLinearRing(LinearRing value) {
        this.linearRing = value;
    }

    /**
     * 
     */
    public List<Object> getBoundarySimpleExtension() {
        if (boundarySimpleExtension == null) {
            boundarySimpleExtension = new ArrayList<Object>();
        }
        return this.boundarySimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getBoundaryObjectExtension() {
        if (boundaryObjectExtension == null) {
            boundaryObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.boundaryObjectExtension;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Boundary boundary = (Boundary) object;
        return Objects.equals(linearRing, boundary.linearRing)
                && Objects.equals(boundarySimpleExtension, boundary.boundarySimpleExtension)
                && Objects.equals(boundaryObjectExtension, boundary.boundaryObjectExtension);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(linearRing);
        result = 31 * result + Objects.hashCode(boundarySimpleExtension);
        result = 31 * result + Objects.hashCode(boundaryObjectExtension);
        return result;
    }

    /**
     * Creates a new instance of {@link LinearRing} and set it to linearRing.
     * 
     * This method is a short version for:
     * {@code
     * LinearRing linearRing = new LinearRing();
     * this.setLinearRing(linearRing); }
     * 
     * 
     */
    public LinearRing createAndSetLinearRing() {
        LinearRing newValue = new LinearRing();
        this.setLinearRing(newValue);
        return newValue;
    }

    /**
     * Sets the value of the boundarySimpleExtension property Objects of the following type(s) are allowed in the list {@code List<Object>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withBoundarySimpleExtension} instead.
     * 
     * 
     * @param boundarySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     */
    public void setBoundarySimpleExtension(final List<Object> boundarySimpleExtension) {
        this.boundarySimpleExtension = boundarySimpleExtension;
    }

    /**
     * add a value to the boundarySimpleExtension property collection
     * 
     * @param boundarySimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Boundary addToBoundarySimpleExtension(final Object boundarySimpleExtension) {
        this.getBoundarySimpleExtension().add(boundarySimpleExtension);
        return this;
    }

    /**
     * Sets the value of the boundaryObjectExtension property Objects of the following type(s) are allowed in the list {@code List<AbstractObject>}.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withBoundaryObjectExtension} instead.
     * 
     * 
     * @param boundaryObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     */
    public void setBoundaryObjectExtension(final List<AbstractObject> boundaryObjectExtension) {
        this.boundaryObjectExtension = boundaryObjectExtension;
    }

    /**
     * add a value to the boundaryObjectExtension property collection
     * 
     * @param boundaryObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Boundary addToBoundaryObjectExtension(final AbstractObject boundaryObjectExtension) {
        this.getBoundaryObjectExtension().add(boundaryObjectExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param linearRing
     *     required parameter
     * @return
     *     Boundary
     */
    public Boundary withLinearRing(final LinearRing linearRing) {
        this.setLinearRing(linearRing);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param boundarySimpleExtension
     *     required parameter
     * @return
     *     Boundary
     */
    public Boundary withBoundarySimpleExtension(final List<Object> boundarySimpleExtension) {
        this.setBoundarySimpleExtension(boundarySimpleExtension);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param boundaryObjectExtension
     *     required parameter
     * @return
     *     Boundary
     */
    public Boundary withBoundaryObjectExtension(final List<AbstractObject> boundaryObjectExtension) {
        this.setBoundaryObjectExtension(boundaryObjectExtension);
        return this;
    }

    @Override
    public Boundary clone() {
        Boundary copy;
        try {
            copy = ((Boundary) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.linearRing = ((linearRing == null)?null:((LinearRing) linearRing.clone()));
        copy.boundarySimpleExtension = new ArrayList<Object>((getBoundarySimpleExtension().size()));
        for (Object iter: boundarySimpleExtension) {
            copy.boundarySimpleExtension.add(iter);
        }
        copy.boundaryObjectExtension = new ArrayList<AbstractObject>((getBoundaryObjectExtension().size()));
        for (AbstractObject iter: boundaryObjectExtension) {
            copy.boundaryObjectExtension.add(iter.clone());
        }
        return copy;
    }

}
