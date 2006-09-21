package reporting;

import java.util.logging.Level;

public class LoggingTest extends LoggingBaseTestCase {

	protected void setUp() throws Exception {
		logger.log(Level.INFO, "Hello");
		super.setUp();
	}
	public void testOne() {
		logger.log(Level.SEVERE, "Demonstration error message");
	}
}
