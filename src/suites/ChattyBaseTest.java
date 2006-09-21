package suites;

import junit.framework.TestCase;

public class ChattyBaseTest extends TestCase {
	@Override
	protected void runTest() throws Throwable {
		System.out.println("starting test:  " + toString());
		super.runTest();
		System.out.println("ending of test: " + toString());
	}
}
