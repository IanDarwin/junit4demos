package intro;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for intro");
		//$JUnit-BEGIN$
		suite.addTestSuite(FooTest.class);
		suite.addTestSuite(TestString.class);
		//$JUnit-END$
		return suite;
	}

}
