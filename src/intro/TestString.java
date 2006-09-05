package intro;

import junit.framework.TestCase;

/**
 * One or two simple tests on java.lang.String, just so
 * I can build a TestSuite in this directory :-)
 */
public class TestString extends TestCase {
	public void testStringLength() {
		assertEquals("empty string length", 0, "".length());
		assertEquals("1-char string", 1, "X".length());
	}
}
