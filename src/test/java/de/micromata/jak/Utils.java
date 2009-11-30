// ///////////////////////////////////////////////////////////////////////////
//
// $RCSfile: $
//
// Project JavaAPIforKmlPlayground
//
// Author Flori (f.bachmann@micromata.de)
// Created 03.04.2009
// Copyright Micromata 03.04.2009
//
// $Id: $
// $Revision: $
// $Date: $
//
// ///////////////////////////////////////////////////////////////////////////
package de.micromata.jak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

import de.micromata.opengis.kml.v_2_2_0.Kml;

public final class Utils {
	private static final Logger LOG = Logger.getLogger(Utils.class.getName());

	/**
	 * java.util.List<de.micromata.opengis.kml.v_2_2_0.Coordinate> --> de.micromata.opengis.kml.v_2_2_0.Coordinate
	 * 
	 * @param value
	 * @return
	 */
	public static Class< ? > getClassForGenericList(String value) {
		value = value.replaceAll("(.*?)(<)(.*?)(>)(.*?)", "$3");
		Class< ? > forName = null;
		try {
			forName = Class.forName(value);
		} catch (ClassNotFoundException e) {
		}
		return forName;
	}

	public static Field findField(Class< ? > cls, String fieldName) {
		Field f = null;
		try {
			f = cls.getDeclaredField(fieldName);
		} catch (SecurityException ex) {
		} catch (NoSuchFieldException ex) {
		}
		if (f != null)
			return f;
		if (cls == Object.class || cls.getSuperclass() == null) {
			return null;
		}
		return findField(cls.getSuperclass(), fieldName);
	}

	public static Class< ? > findClass(Class< ? > cls, String className) {
		if (cls.getSimpleName().equals(className)) {
			return cls;
		}

		if (cls == Object.class || cls.getSuperclass() == null) {
			return null;
		}
		return findClass(cls.getSuperclass(), className);
	}

	@SuppressWarnings("unchecked")
	public static <T> T marshalAndUnmarshall(T object, String filename) {
		Class<T> clazz = (Class<T>) object.getClass();
		T unmarshalledKml = null;
		try {
			JAXBContext jc = createJAXBContext(clazz);
			Marshaller m = createMarshaller(jc);
			JAXBElement<T> jaxbRootElement = prepareJaxbElement(object, clazz);
			m.marshal(jaxbRootElement, new FileOutputStream(filename));
			Unmarshaller u = jc.createUnmarshaller();
			jaxbRootElement = u.unmarshal(new StreamSource(new File(filename)), clazz);
			unmarshalledKml = jaxbRootElement.getValue();
			LOG.info("------------ written file: " + filename);
			LOG.info("length : " + getFileSizeInByte(filename));
		} catch (JAXBException _x) {
			_x.printStackTrace();
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		}
		return unmarshalledKml;
	}

	private static Marshaller createMarshaller(JAXBContext jc) throws JAXBException, PropertyException {
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NameSpaceBeautyfier());
		return m;
	}

	private static <T> JAXBElement<T> prepareJaxbElement(T plainRootObject, Class<T> clazz) {
		String name = plainRootObject.getClass().getSimpleName();
		if ("Kml".equals(name)) {
			name = name.toLowerCase();
		}
		JAXBElement<T> jaxbRootElement = new JAXBElement<T>(new QName("http://www.opengis.net/kml/2.2", name), clazz, plainRootObject);
		return jaxbRootElement;
	}

	@SuppressWarnings("unchecked")
	public static <T> T marshalAndUnmarshall(T object, boolean sysout) {
		Class<T> clazz = (Class<T>) object.getClass();
		T unmarshalledKml = null;
		StringWriter out = new StringWriter();

		try {
			JAXBContext jc = createJAXBContext(clazz);
			Marshaller m = createMarshaller(jc);
			JAXBElement<T> jaxbRootElement = prepareJaxbElement(object, clazz);
			if (sysout) {
				m.marshal(jaxbRootElement, System.out);
			}
			m.marshal(jaxbRootElement, out);
			StringReader string = new StringReader(out.toString());
			Unmarshaller u = jc.createUnmarshaller();
			jaxbRootElement = u.unmarshal(new StreamSource(string), clazz);
			unmarshalledKml = jaxbRootElement.getValue();
		} catch (JAXBException e) {
			LOG.info("Exception encountered " + e);
		}
		return unmarshalledKml;
	}

	public static <T> T marshalAndUnmarshall(T object) {
		return marshalAndUnmarshall(object, false);
	}

	public static long getFileSizeInByte(File file) {
		return file.length();
	}

	public static long getFileSizeInByte(String file) {
		return getFileSizeInByte(new File(file));
	}

	@SuppressWarnings("unchecked")
	public static <T> T marshal(T object, String filename) {
		T unmarshalledKml = null;
		Class<T> clazz = (Class<T>) object.getClass();
		try {
			JAXBContext jc = createJAXBContext(clazz);
			Marshaller m = createMarshaller(jc);
			m.marshal(object, new FileOutputStream(filename));
			System.out.println("------------ written file: " + filename);
			System.out.println("length : " + getFileSizeInByte(filename));
			System.out.println("-------------------------------------------------------------------------");
			m.marshal(object, System.out);
			System.out.println("-------------------------------------------------------------------------");
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			LOG.info("Exception encountered " + e);
		}
		return unmarshalledKml;
	}

	@SuppressWarnings("unchecked")
	public static <T> T marshal(T object, File filename) {
		T unmarshalledKml = null;
		Class<T> clazz = (Class<T>) object.getClass();
		try {
			JAXBContext jc = createJAXBContext(clazz);
			Marshaller m = createMarshaller(jc);
			m.marshal(object, new FileOutputStream(filename));
			System.out.println("------------ written file: " + filename);
			System.out.println("length : " + getFileSizeInByte(filename));
			System.out.println("-------------------------------------------------------------------------");
			m.marshal(object, System.out);
			System.out.println("-------------------------------------------------------------------------");
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			LOG.info("Exception encountered " + e);
		}
		return unmarshalledKml;
	}

	@SuppressWarnings("unchecked")
	public static <T> T marshal(T object) {
		T unmarshalledKml = null;
		Class<T> clazz = (Class<T>) object.getClass();
		try {
			JAXBContext jc = createJAXBContext(clazz);
			Marshaller m = createMarshaller(jc);

			m.marshal(object, System.out);
		} catch (JAXBException e) {
			LOG.info("Exception encountered " + e);
		}
		return unmarshalledKml;
	}

	private static <T> JAXBContext createJAXBContext(Class<T> clazz) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(clazz);
		return jc;
	}

	public static String getCurrentMethodName(Object object) {
		String clazz = object.getClass().getCanonicalName();
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		// printWholeStack(stack);
		for (StackTraceElement e : stack) {
			if (clazz.equals(e.getClassName()) && (!"getCurrentMethodName".equals(e.getMethodName()))) {
				// LOG.info("method found: " + object.getClass().getSimpleName() + "_" + e.getMethodName());
				return object.getClass().getSimpleName() + "_" + e.getMethodName();
			}
		}

		return object.getClass().getName() + "_notFound";
	}

}
