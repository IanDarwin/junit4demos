package intro;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

public class SetupVsConstrTest extends TestCase{

	public SetupVsConstrTest() {
		super();
		System.out.println("SetupVsConstrTest.SetupVsConstrTest()");
	}

	public SetupVsConstrTest(String arg0) {
		super(arg0);
		System.out.printf("SetupVsConstrTest.SetupVsConstrTest(%s) in %s%n",
			arg0, Thread.currentThread().getName());
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetupVsConstrTest.setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("SetupVsConstrTest.tearDown()");
	}

	public void testOne() {
		System.out.println("SetupVsConstrTest.testOne()");
	}

	public void testTwo() {
		System.out.println("SetupVsConstrTest.testTwo()");
	}

	public void testThree() {
		System.out.println("SetupVsConstrTest.testThree()");
	}
}
