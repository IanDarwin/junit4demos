package testdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class PropertiesFromClasspathTest {

	Properties p = new Properties();

	@Before
	public void setUp() throws Exception {
		InputStream is = getClass().getResourceAsStream("test.properties");
		p.load(is);
	}

	@Test
	public void testOne() {
		assertNotNull(p);
		assertEquals("Ensure properties loaded",
				"1", p.getProperty("testtag"));
	}
}
