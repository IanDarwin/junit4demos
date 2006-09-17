package suites;

import java.io.File;
import java.io.IOException;

import junit.framework.Test;

import com.gargoylesoftware.base.testing.RecursiveTestSuite;
import com.gargoylesoftware.base.testing.TestFilter;

public class AllICETests {

	public static Test suite() throws IOException {
		File file = new File("build");
		TestFilter filt = new TestFilter() {
			public boolean accept(Class aClass) {
				// "Reflectionese" for anAClass instanceof ICETest
				return ICETest.class.isAssignableFrom(aClass);
			}
		};
		return new RecursiveTestSuite(file, filt);
	}
}
