package intro;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** Running this can show you something about how tests
 * get run - notice when the constructor is called.
 */
public class SetupVsConstrTest {

	public SetupVsConstrTest() {
		super();
		System.out.println("SetupVsConstrTest.SetupVsConstrTest()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetupVsConstrTest.setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("SetupVsConstrTest.tearDown()");
	}

	@Test
	public void testOne() {
		System.out.println("SetupVsConstrTest.testOne()");
	}

	@Test
	public void testTwo() {
		System.out.println("SetupVsConstrTest.testTwo()");
	}

	@Test
	public void testThree() {
		System.out.println("SetupVsConstrTest.testThree()");
	}
}
