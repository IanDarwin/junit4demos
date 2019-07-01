package xml;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLTestCase;

/** Test XMl documents for equality */
public class TestDocumentsEqualDetailed extends XMLTestCase {
	
	// This test is EXPECTED to fail - it is showing
	// how XMLUnit can show differences when failure comes up.
	public void testDocs() throws Throwable {
		String expected = "<head><title>Ian's Site</title></head>";
		String actual = "<head><title>Ians Site</title></head>";
		Diff diff = new Diff(expected, actual);
		assertTrue(new DetailedDiff(diff).toString(), diff.identical());
	}
}
