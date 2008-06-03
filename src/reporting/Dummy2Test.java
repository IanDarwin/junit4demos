package reporting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Some tests that pass and some that fail,
 * just to show the Reporting in action.
 */
public class Dummy2Test  {

	@Test public void testSize() {
		assertTrue(true);
	}

	@Test public void testGlumph() {
		assertEquals("etaoin shrdlu", "etaoin shrdlu");
	}
}
