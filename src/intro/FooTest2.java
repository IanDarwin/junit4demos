package intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import testclasses.Foo;

public class FooTest2 {

	@Test
	public void test1() throws Exception {
		Foo foo = new Foo();
		int value = foo.getValue();
		assertEquals(42, value);
	}
}
