package common;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUpperCaseTest  {
	@Test public void test1() {
		String x = "Hello world";
		String y = x.toUpperCase();
		assertEquals(11, y.length());
	}
	@Test public void test2() {
		String x = "Hello world";
		String y = x.toUpperCase();
		assertEquals('E', y.charAt(1));
	}
}
