package suites;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;

import com.gargoylesoftware.base.testing.RecursiveTestSuite;
import com.gargoylesoftware.base.testing.TestFilter;

import junit.framework.Test;

public class AllNonAbstractTestsRecursively {

	public static Test suite() throws IOException {
		File file = new File("build");
		TestFilter filt = new TestFilter() {
			public boolean accept(Class aClass) {
				return !Modifier.isAbstract(aClass.getModifiers());
			}
		};
		return new RecursiveTestSuite(file, filt);
	}
}