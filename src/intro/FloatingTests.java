package intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FloatingTests {

	@Test
	public void doubles() {
		double a = 1.23;
		double b = 1.234;
		assertEquals("double", a, b, 0.1);
	}
	
	@Test
	public void floats() {
		float a = 1.23f;
		float b = 1.234f;
		assertEquals("float", a, b, 0.1);
	}
}
