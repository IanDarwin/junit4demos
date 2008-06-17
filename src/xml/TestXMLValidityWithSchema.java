package xml;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.junit.Test;
import org.w3c.dom.Document;

public class TestXMLValidityWithSchema {

	public @Test void testValid() throws Exception {
		// create a SchemaFactory capable of understanding WXS schemas - from the Javadoc page
	    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	    // load the W3c XML schema, represented by a Schema instance
	    String schemaLocation = "files/schema.xsd";
		File schemaFile = new File(schemaLocation);
		if (!schemaFile.exists()) {
			throw new IOException("Schema location = " + schemaLocation + " does not exist");
		}
		Schema schema = factory.newSchema(schemaFile);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		dbFactory.setSchema(schema);

		DocumentBuilder parser = dbFactory.newDocumentBuilder();
		String doc = "<?xml version='1.0'?>" +
		"<section><sectiontitle>A Discourse of Numbers</sectiontitle>" +
		"<sectionnumber>1.2</sectionnumber>" +
		"<SC>Introduction</SC><p></p></section>";
		System.out.println("TestXMLValidityWithSchema.testValid(): parsing");
		// XXX This will give an error message as we're parsing a Section/Subsection
		// Document with the "person" schema!
		Document document = parser.parse(new ByteArrayInputStream(doc.getBytes()));
		assertNotNull(document);	// really here to suppress warnings
		System.out.println("TestXMLValidityWithSchema.testValid(): parsed");
	}
}
