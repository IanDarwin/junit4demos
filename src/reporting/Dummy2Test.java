package reporting;

import junit.framework.TestCase;

/**
 * Some tests that pass and some that fail,
 * just to show the Reporting in action.
 */
public class Dummy2Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSize() {
		assertTrue(true);
	}

	public void testGlumph() {
		assertEquals("etaoin shrdlu", "etaoin shrdlu");
	}
}
