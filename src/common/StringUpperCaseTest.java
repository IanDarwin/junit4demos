package common;

import junit.framework.TestCase;

public class StringUpperCaseTest extends TestCase {
	public void test1() {
		String x = "Hello world";
		String y = x.toUpperCase();
		assertEquals(11, y.length());
	}
	public void test2() {
		String x = "Hello world";
		String y = x.toUpperCase();
		assertEquals('E', y.charAt(1));
	}
}
