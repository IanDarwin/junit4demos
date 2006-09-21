package suites;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for suites");
		//$JUnit-BEGIN$
		suite.addTestSuite(J3601Test.class);
		suite.addTest(SomeOrderTest.suite());
		//$JUnit-END$
		return suite;
	}

}
