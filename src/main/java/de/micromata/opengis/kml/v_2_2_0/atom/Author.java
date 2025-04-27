
package de.micromata.opengis.kml.v_2_2_0.atom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * KML 2.2 supports new elements for including data about the author and related website 
 * in your KML file. This information is displayed in geo search results, both in Earth 
 * browsers such as Google Earth, and in other applications such as Google Maps. The 
 * ascription elements used in KML are as follows: 
 * </p>
 * <p>
 * The {@code <atom:author>} element is the parent element for {@code <atom:name>}, which specifies
 * the author of the KML feature. 
 * </p>
 * <p>
 * These elements are defined in the Atom Syndication Format. The complete specification 
 * is found at http://atompub.org. (see the sample that follows). 
 * </p>
 * <p>
 * These elements are defined in the Atom Syndication Format. The complete specification 
 * is found at http://atompub.org. (see the sample that follows). 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameOrUriOrEmail"
})
@XmlRootElement(name = "author")
public class Author implements Cloneable
{

    protected List<String> nameOrUriOrEmail;

    public Author() {
        super();
    }

    public List<String> getNameOrUriOrEmail() {
        if (nameOrUriOrEmail == null) {
            nameOrUriOrEmail = new ArrayList<String>();
        }
        return this.nameOrUriOrEmail;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        Author author = (Author) object;
        return Objects.equals(nameOrUriOrEmail, author.nameOrUriOrEmail);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(nameOrUriOrEmail);
    }

    public void setNameOrUriOrEmail(final List<String> nameOrUriOrEmail) {
        this.nameOrUriOrEmail = nameOrUriOrEmail;
    }

    /**
     * add a value to the nameOrUriOrEmail property collection
     * 
     * @param nameOrUriOrEmail
     *     Objects of the following type are allowed in the list: {@code <}{@link String}{@code >}{@code <}{@link String}{@code >}{@code <}{@link String}{@code >}
     * @return
     *     true (as general contract of Collection.add). 
     */
    public Author addToNameOrUriOrEmail(final String nameOrUriOrEmail) {
        this.getNameOrUriOrEmail().add(nameOrUriOrEmail);
        return this;
    }

    /**
     * fluent setter
     *
     * 
     * @param nameOrUriOrEmail
     *     required parameter
     */
    public Author withNameOrUriOrEmail(final List<String> nameOrUriOrEmail) {
        this.setNameOrUriOrEmail(nameOrUriOrEmail);
        return this;
    }

    @Override
    public Author clone() {
        Author copy;
        try {
            copy = ((Author) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        copy.nameOrUriOrEmail = new ArrayList<String>((getNameOrUriOrEmail().size()));
        for (String iter: nameOrUriOrEmail) {
            copy.nameOrUriOrEmail.add(iter);
        }
        return copy;
    }

}
