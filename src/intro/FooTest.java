package intro;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testclasses.Foo;

public class FooTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("FooTest.setUpBeforeClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("FooTest.setUp()");
	}

	@Test public void test1() throws Exception {
		System.out.println("FooTest.test1()");
		Foo foo = new Foo();
		int value = foo.getValue();
		assertEquals(42, value);
	}

	/** This method is called foo() instead of testFoo()
	 * to show that you can do that in JUnit 4; just
	 * don't forget the @Test annotation!
	 */
	@Test public void foo() throws Exception {
		System.out.println("FooTest.foo()");
	}

	/** This is missing its @After tag deliberately, to show
	 * that with out it, *this method does not get called in JUnit 4*
	 */
	public void tearDown() {
		System.out.println("FooTest.tearDown()");
	}

	/** This is missing its @After tag deliberately, to show
	 * that with out it, *this method does not get called in JUnit 4*
	 */
	public static void tearDownAfterClass() throws Exception {
		System.out.println("FooTest.tearDownAfterClass()");
	}
}
