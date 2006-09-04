package common;

import testclasses.Foo;
import junit.framework.TestCase;

public class TestConstructor extends TestCase {

	public void testFoo() {
		Foo f = new Foo();
		assertEquals(Foo.DEFAULT_VALUE, f.getValue());
	}

	public void testFooInt() {
		Foo f = new Foo(123);
		assertEquals(123, f.getValue());
	}

}
