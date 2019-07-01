package testdata;

import junit.swingui.TestRunner;

public class SwingRunnerWithOneTimeSetup {

	public static void main(String[] args) {
		onetimeGlobalSetup();
		TestRunner runner = new TestRunner() {
			public void terminate() {
				onetimeGlobalTeardown();
				super.terminate();	// waits
			}
		};
		runner.start(new String[] { "testdata.AllTests" });
	}

	private static void onetimeGlobalSetup() {
		// TODO Auto-generated method stub
	}

	private static void onetimeGlobalTeardown() {
		// TODO Auto-generated method stub
	}
}
