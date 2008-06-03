package reporting;

import java.util.logging.Level;

import org.junit.Test;

public class LoggingTest extends LoggingBaseTestCase {

	protected LoggingTest() throws Exception {
		logger.log(Level.INFO, "Hello");
	}
	@Test public void testOne() {
		logger.log(Level.SEVERE, "Demonstration error message");
	}
}
