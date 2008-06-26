package sol41;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectTest {
	Object o = new Object();
	
	@Test
	public final void testHashCode() {
		assertEquals(o.hashCode(), o.hashCode());
	}

	@Test
	public final void testToString() {
		assertTrue(o.toString().contains("Object"));
	}

}
