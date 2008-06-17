import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value=Suite.class)
@SuiteClasses(value={
		intro.AllTests.class,
		common.AllTests.class,
		testdata.AllTests.class,
		xml.AllTests.class,
		mocking.AllTests.class,
})
public class AllAllTests {

}
