package testdata;

import junit.textui.TestRunner;

public class TextRunnerWithOneTimeSetup {

	public static void main(String[] args) {
		onetimeGlobalSetup();
		TestRunner.run(AllTests.suite());
		onetimeGlobalTeardown();
	}

	private static void onetimeGlobalSetup() {
		// TODO Auto-generated method stub
	}

	private static void onetimeGlobalTeardown() {
		// TODO Auto-generated method stub
	}
}
