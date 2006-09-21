package testdata;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for testdata");
		//$JUnit-BEGIN$
		suite.addTestSuite(RandomTest.class);
		//$JUnit-END$
		return suite;
	}

}
