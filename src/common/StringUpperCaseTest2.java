package common;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringUpperCaseTest2  {
	String y;

	@Before
	protected void setUp() throws Exception {
		String x = "Hello world";
		y = x.toUpperCase();
	}
	
	@Test
	public void test1() {
		assertEquals(11, y.length());
	}
	
	@Test
	public void test2() {
		assertEquals('E', y.charAt(1));
	}
}
