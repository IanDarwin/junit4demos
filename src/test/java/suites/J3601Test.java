package suites;

import junit.framework.TestCase;

/** Example of a (rather minimal) test that uses the
 * marker interface ICETest to identify itself as being
 * in the (hypothetical) category of ICE Tests.
 */
public class J3601Test extends TestCase implements ICETest {

	public void test1() {
		System.out.println("Running ICETest J3601");
	}

}
