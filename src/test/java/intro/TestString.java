package intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * One or two simple tests on java.lang.String, just so
 * I can build a TestSuite in this directory :-)
 */
public class TestString {
	
	@Test
	public void testStringLength() {
		assertEquals("empty string length", 0, "".length());
		assertEquals("1-char string", 1, "X".length());
	}
}
