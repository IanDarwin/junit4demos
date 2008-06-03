package common;

import static org.junit.Assert.fail;

import org.junit.Test;

import testclasses.Foo;

public class TestShouldThrow  {

	@Test public void testShouldThrow() {
		// Ensure that new Foo(-1) throws IAE
		try {
			new Foo(-1);
			fail("Did not throw IAE");
		} catch (IllegalArgumentException e) {
			System.out.println("Caught expected exception: " + e);
		}
	}
}
