package common;

import testclasses.Foo;
import junit.framework.TestCase;

public class TestEquals1 extends TestCase {
	Foo x, y;

	public void testReflexive() {
		assertNotNull(x);	// loaded in setUp()
		assertTrue(x.equals(x));
	}
	public void testSymmetric() {
		assertTrue(x.equals(y) && y.equals(x));
	}
	public void testNull() {
		assertFalse(x.equals(null));
	}

	// Do not include in printing
	public void setUp() {
		x = new Foo();
		y = new Foo();
	}
}
