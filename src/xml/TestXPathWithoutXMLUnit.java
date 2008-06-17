package xml;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.junit.Test;
import org.w3c.dom.Document;

/**
 * Simple demo of XPath.
 */
public class TestXPathWithoutXMLUnit {

	@Test
	public void testSectionNumber() throws Exception {

		DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		String doc = "<?xml version='1.0'?>" +
		"<section><sectiontitle>A Discourse of Numbers</sectiontitle>" +
		"<sectionnumber>1.2</sectionnumber>" +
		"<SC>Introduction</SC><p></p></section>";
		Document document = parser.parse(new ByteArrayInputStream(doc.getBytes()));

		// evaluate the XPath expression against the Document
		XPath xpath = XPathFactory.newInstance().newXPath();
		String expression = "/section/sectionnumber";
		Double secNum = (Double) xpath.evaluate(expression, document, XPathConstants.NUMBER);
		assertEquals("Section number", 1.2, secNum);
	}

}
