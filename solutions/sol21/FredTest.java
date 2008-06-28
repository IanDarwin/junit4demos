package sol21;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FredTest {

	@Test
	public void testOne() throws Exception {
		Fred f = new Fred();
		assertNotNull(f.getValue());
	}
}
