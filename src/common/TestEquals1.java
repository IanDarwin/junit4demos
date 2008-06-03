package common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import testclasses.Foo;

public class TestEquals1  {
	Foo x, y;

	@Test public void testReflexive() {
		assertNotNull(x);	// loaded in setUp()
		assertTrue(x.equals(x));
	}
	@Test public void testSymmetric() {
		assertTrue(x.equals(y) && y.equals(x));
	}
	@Test public void testNull() {
		assertFalse(x.equals(null));
	}

	// Do not include in printing
	public void setUp() {
		x = new Foo();
		y = new Foo();
	}
}
