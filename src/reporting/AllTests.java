package reporting;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for reporting");
		//$JUnit-BEGIN$
		suite.addTestSuite(DummyTest.class);
		suite.addTestSuite(Dummy2Test.class);
		//$JUnit-END$
		return suite;
	}

}
