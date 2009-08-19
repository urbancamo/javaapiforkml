/////////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project   JavaAPIforKML
//
// Author    Flori (f.bachmann@micromata.de)
// Created   Aug 17, 2009
// Copyright Micromata Aug 17, 2009
//
// $Id: $
// $Revision: $
// $Date: $
//
/////////////////////////////////////////////////////////////////////////////
package de.micromata.jak.incubator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

import de.micromata.opengis.kml.v_2_2_0.Kml;

public class JAXBSample {

    public static void main(String args[]) throws javax.xml.bind.JAXBException{
        try {
            JAXBContext jc = JAXBContext.newInstance("a");            
            JustAType t = new JustAType();
            t.setFoo(true);
            JAXBElement<JustAType> e = new JAXBElement<JustAType>(new QName("http://www.opengis.net/kml/2.2", "kml"), JustAType.class, t);
            marshal(jc, e, null);

            NamespacePrefixMapper m = new PreferredMapper();
            marshal(jc, e, m);

            m = new DeclareOnTopMapper();
            marshal(jc, e, m);
            
            m = new PreDeclaredMapper();
            marshal(jc, e, m);
            
        } catch(javax.xml.bind.JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void marshal(JAXBContext jc, Object toMarshall, NamespacePrefixMapper mapper) {
        System.out.println("Mapper: " + ((mapper == null) ? " not set. " : (mapper.getClass().getSimpleName())));
        try {
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            if (mapper != null) {
                m.setProperty("com.sun.xml.bind.namespacePrefixMapper", mapper);
            }
            m.marshal(toMarshall, System.out);
            System.out.println("-----------------------");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static class PreferredMapper extends NamespacePrefixMapper {
        @Override
        public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
            return "mappedNamespace" + namespaceUri;
        }
    }

    public static class DeclareOnTopMapper extends PreferredMapper {
        @Override
        public String[] getPreDeclaredNamespaceUris() {
            return new String[] {"a", "b"};
        }
    }

    public static class PreDeclaredMapper extends PreferredMapper {
        @Override
        public String[] getContextualNamespaceDecls() {
            return new String[] {"a", "mappedNamespacea"};
        }
    }

}
