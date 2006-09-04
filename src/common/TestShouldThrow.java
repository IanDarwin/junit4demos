package common;

import testclasses.Foo;
import junit.framework.TestCase;

public class TestShouldThrow extends TestCase {

	public void testShouldThrow() {
		// Ensure that new Foo(-1) throws IAE
		try {
			new Foo(-1);
			fail("Did not throw IAE");
		} catch (IllegalArgumentException e) {
			System.out.println("Caught expected exception: " + e);
		}
	}
}
