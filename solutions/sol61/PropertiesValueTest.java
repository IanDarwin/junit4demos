package ex61;


import junit.framework.TestCase;

import org.junit.Before;

public class PropertiesValueTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	public void testGetValue() {
		int expected = Integer.parseInt(
				System.getProperty("test.value", "0"));
		System.out.println(expected);
		int value = new PropertiesValue().getValue();
		assertEquals("value from test", expected, value);
	}
}
