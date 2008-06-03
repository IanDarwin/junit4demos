package intro;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value=Suite.class)
@SuiteClasses(value={FooTest.class, TestString.class})
public class AllTests extends TestCase {
	// No code needed!
}
