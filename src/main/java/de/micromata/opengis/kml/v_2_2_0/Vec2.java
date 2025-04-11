
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.*;

import java.util.Objects;

/**
 * Vec2
 * <p>
 * x=double xunits=kml:unitsEnum y=double yunits=kml:unitsEnum 
 * </p>
 * 
 * See Also: 
 * See {@code <hotSpot>} in {@code <IconStyle>}, {@code <ScreenOverlay>}
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vec2Type")
@XmlRootElement(name = "Vec2", namespace = "http://www.opengis.net/kml/2.2")
public class Vec2 implements Cloneable
{

    /**
     * {@code <x>, <y>, <w>, <h>}
     * <p>
     * Use of these elements within {@code <Icon>}has been deprecated. 
     * </p>
     * 
     * 
     * 
     */
    @XmlAttribute(name = "x")
    protected double x;
    @XmlAttribute(name = "y")
    protected double y;
    /**
     * Units
     * <p>
     * fraction, pixels, insetPixels 
     * </p>
     * 
     * See Also: 
     * See {@code <hotSpot>} in {@code <IconStyle>}, {@code <ScreenOverlay>}
     * 
     * 
     * 
     */
    @XmlAttribute(name = "xunits")
    protected Units xunits;
    /**
     * Units
     * <p>
     * fraction, pixels, insetPixels 
     * </p>
     * 
     * See Also: 
     * See {@code <hotSpot>} in {@code <IconStyle>}, {@code <ScreenOverlay>}
     * 
     * 
     * 
     */
    @XmlAttribute(name = "yunits")
    protected Units yunits;

    public Vec2() {
        super();
    }

    /**
     *
     * 
     */
    public double getX() {
        return x;
    }

    /**
     *
     * 
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     *
     * 
     */
    public double getY() {
        return y;
    }

    /**
     *
     * 
     */
    public void setY(double value) {
        this.y = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Units}
     *     
     */
    public Units getXunits() {
        if (xunits == null) {
            return Units.FRACTION;
        } else {
            return xunits;
        }
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Units}
     *     
     */
    public void setXunits(Units value) {
        this.xunits = value;
    }

    /**
     *
     * 
     * @return
     *     possible object is
     *     {@link Units}
     *     
     */
    public Units getYunits() {
        if (yunits == null) {
            return Units.FRACTION;
        } else {
            return yunits;
        }
    }

    /**
     *
     * 
     * @param value
     *     allowed object is
     *     {@link Units}
     *     
     */
    public void setYunits(Units value) {
        this.yunits = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Vec2 vec2 = (Vec2) object;
        return Double.compare(x, vec2.x) == 0
                && Double.compare(y, vec2.y) == 0
                && xunits == vec2.xunits
                && yunits == vec2.yunits;
    }

    @Override
    public int hashCode()
    {
        int result = Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        result = 31 * result + Objects.hashCode(xunits);
        result = 31 * result + Objects.hashCode(yunits);
        return result;
    }

    /**
     * fluent setter
     *
     * 
     * @param x
     *     required parameter
     */
    public Vec2 withX(final double x) {
        this.setX(x);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param y
     *     required parameter
     */
    public Vec2 withY(final double y) {
        this.setY(y);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param xunits
     *     required parameter
     */
    public Vec2 withXunits(final Units xunits) {
        this.setXunits(xunits);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param yunits
     *     required parameter
     */
    public Vec2 withYunits(final Units yunits) {
        this.setYunits(yunits);
        return this;
    }

    @Override
    public Vec2 clone() {
        Vec2 copy;
        try {
            copy = ((Vec2) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
