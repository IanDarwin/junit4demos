package xml;

import java.io.File;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.custommonkey.xmlunit.XMLTestCase;

public class TestXSLTwithXPath extends XMLTestCase {
	String INPUT_FILE = "files/personlist1.xml";
	String STYLE_FILE = "files/people.xsl";

	public void testOne() throws Throwable {
		StringWriter out = new StringWriter();
		// Create a transformer object
		Transformer tx = TransformerFactory.newInstance().newTransformer(
				new StreamSource(new File(STYLE_FILE)));

		// Use its transform() method to perform the transformation
		tx.transform(new StreamSource(new File(INPUT_FILE)), // not 1
				new StreamResult(out));

		// Get the result
		String document = out.toString();

		// work around a JDK bug - META end tag is deleted(!)
		document = document.replaceFirst("(<META[^>]+>)", "$1</META>");

		System.out.println(document);

		// Now use XMLUnit over XPath
		assertXpathExists("//th", document);
		assertXpathEvaluatesTo("Name", "//th", document);
	}
}
