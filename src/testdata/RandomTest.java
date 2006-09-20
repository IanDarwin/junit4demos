package testdata;

import java.util.Properties;
import java.util.Random;

import junit.framework.TestCase;

import com.darwinsys.util.FileProperties;

public class RandomTest extends TestCase {
	Properties fp;

	protected void setUp() throws Exception {
		super.setUp();
		fp = new FileProperties("config/randomtest.properties");
	}

	public void testRandomDoubleRepeatability() throws Exception {
		long seed = Long.parseLong(fp.getProperty("random.seed"));
		double result = new Random(seed).nextDouble();
		double expected = Double.parseDouble(fp.getProperty("double.expected"));
		assertEquals(expected, result);
	}
}
