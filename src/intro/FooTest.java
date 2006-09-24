package junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testclasses.Foo;

public class FooTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test public void test1() throws Exception {
			Foo foo = new Foo();
			int value = foo.getValue();
			assertEquals(42, value);
	}
}
