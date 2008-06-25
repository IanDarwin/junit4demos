package sol21;


import junit.framework.TestCase;

public class FredTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testOne() throws Exception {
		Fred f = new Fred();
		assertNotNull(f.getValue());
	}
}
