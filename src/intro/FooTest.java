package intro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
	 * to show that the method name doesn't matter!
	 * It *might* be a good idea to stick with the testXXX
	 * method name convention, or not...
	 */
	@Test
	public void foo() throws Exception {
		System.out.println("FooTest.foo()");
	}
	
	/** This is a 3.8-style test method; it will not get
	 * run by default when using JUnit 4!
	 */
	public void testFoo() {
		fail("FooTest.testFoo()");
	}

	/** This is missing its @After tag deliberately, to show
	 * that with out it, *this method does not get called in JUnit 4*
	 */
	public void tearDown() {
		fail("FooTest.tearDown()");
	}

	/** This is missing its @AfterClass tag deliberately, to show
	 * that with out it, *this method does not get called in JUnit 4*
	 */
	public static void tearDownAfterClass() throws Exception {
		fail("FooTest.tearDownAfterClass()");
	}
}
