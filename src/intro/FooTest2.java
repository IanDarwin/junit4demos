package intro;

import testclasses.Foo;
import junit.framework.TestCase;

public class FooTest2 extends TestCase {

	public void test1() throws Exception {
		Foo foo = new Foo();
		int value = foo.getValue();
		assertEquals(42, value);
	}
}
