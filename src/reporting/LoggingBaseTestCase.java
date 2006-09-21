package reporting;

import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.TestCase;

public class LoggingBaseTestCase extends TestCase {
	Logger logger = Logger.getLogger(getClass().getName());

	public LoggingBaseTestCase() {
		String logLevel = System.getProperty("loglevel");
		if (logLevel == null) {
			logger.setLevel(Level.WARNING);
		} else {
			logger.setLevel(Level.parse(logLevel));
		}
	}
}
