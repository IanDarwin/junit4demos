package xml;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.TestCase;

import org.w3c.dom.Document;

public class TestXMLWellFormed extends TestCase {

	/**
	 * If it does not throw an Exception, the file is valid
	 */
	public void testXmlValid() throws Exception {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder parser = dbFactory.newDocumentBuilder();
		String doc = "<?xml version='1.0'?>" +
		"<section><sectiontitle>A Discourse of Numbers</sectiontitle>" +
		"<sectionnumber>1.2</sectionnumber>" +
		"<SC>Introduction</SC><p></p></section>";
		Document document = parser.parse(new ByteArrayInputStream(doc.getBytes()));
		assertNotNull(document);	// really here to suppress warnings
		System.err.println("Parsed OK");
	}
}