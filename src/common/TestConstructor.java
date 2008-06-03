package common;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import testclasses.Foo;

public class TestConstructor  {

	@Test public void testFoo() {
		Foo f = new Foo();
		assertEquals(Foo.DEFAULT_VALUE, f.getValue());
	}

	@Test public void testFooInt() {
		Foo f = new Foo(123);
		assertEquals(123, f.getValue());
	}

}
