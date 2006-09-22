package xml;

import org.custommonkey.xmlunit.XMLTestCase;

public class TestXPathWithXMLUnit extends XMLTestCase {

	public void testSectionNumber() throws Exception {

		String doc = "<?xml version='1.0'?>" +
		"<section><sectiontitle>A Discourse of Numbers</sectiontitle>" +
		"<sectionnumber>1.2</sectionnumber>" +
		"<SC>Introduction</SC><p></p></section>";

		assertXpathExists("/section", doc);
		assertXpathEvaluatesTo("1.2", "/section/sectionnumber", doc);
	}

}
