package reporting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Some tests that pass and some that fail,
 * just to show the Reporting in action.
 */
public class DummyTest  {

	@Test public void testSize() {
		assertTrue(true);
	}

	// EXPECTED TO FAIL, to show reporting.
	@Test public void testGlumph() {
		assertEquals("etaoin shrdlu", "etaoin shurdlu");
	}
}
