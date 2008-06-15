package intro;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import testclasses.Foo;

public class FooTest3 {

	Foo foo;
	
	public FooTest3() {
		System.out.println("FooTest3.createFixture()");
	}

	@Before
	public void createFixture() {
		System.out.printf("createFixture in %s%n", toString());
		foo = new Foo();
	}

	@Test
	public void test1() throws Exception {
		Foo foo = new Foo();
		int value = foo.getValue();
		assertEquals(42, value);
	}

	@Test
	public void test2() throws Exception {
		System.out.printf("CreateFixture in %s%n", toString());
	}
}
