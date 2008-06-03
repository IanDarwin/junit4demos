package common;

import static org.junit.Assert.fail;

import org.junit.Test;

import testclasses.Foo;

public class TestShouldThrow  {

	@Test(expected=IllegalArgumentException.class)
	public void testShouldThrow() {
		// Ensure that new Foo(-1) throws IAE
		new Foo(-1);
		fail("Did not throw IAE");
	}
}
