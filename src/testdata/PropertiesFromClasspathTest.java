package testdata;

import java.io.InputStream;
import java.util.Properties;

import junit.framework.TestCase;

public class PropertiesFromClasspathTest extends TestCase {

	Properties p = new Properties();

	@Override
	public void setUp() throws Exception {
		InputStream is = getClass().getResourceAsStream("test.properties");
		p.load(is);
	}

	public void testOne() {
		assertNotNull(p);
		assertEquals("Ensure properties loaded",
				"1", p.getProperty("testtag"));
	}
}
