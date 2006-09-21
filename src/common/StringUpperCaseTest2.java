package common;

import junit.framework.TestCase;

public class StringUpperCaseTest2 extends TestCase {
	String y;

	@Override
	protected void setUp() throws Exception {
		String x = "Hello world";
		y = x.toUpperCase();
	}
	public void test1() {
		assertEquals(11, y.length());
	}
	public void test2() {
		assertEquals('E', y.charAt(1));
	}
}
