package common;

import org.junit.Test;

import testclasses.Foo;

public class TestShouldThrow  {

	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrow() {
		// Ensure that new Foo(-1) throws IAE
		new Foo(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetValueShouldThrow() {
		// Ensure that new Foo(-1) throws IAE
		new Foo().setValue(-1);
	}
}
