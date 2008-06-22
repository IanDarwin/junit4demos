package reporting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value=Suite.class)
// Ignore DummyTest, as it is intended to fail,
// to show how reporting deals with failures.
@SuiteClasses(value={Dummy2Test.class})
public class AllTests {

	// No actual code needed here, for simple cases

}
