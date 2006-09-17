package suites;

import junit.framework.Test;
import junit.framework.TestCase;

import com.gargoylesoftware.base.testing.OrderedTestSuite;

/**
 * Tests should be order-independent in general, but in this case,
 * testInsert must run before testFetch (others don't matter)
 */
public class SomeOrderTest extends TestCase {

	public SomeOrderTest(String name) {
		super(name);
	}

	public void testInsert() {
		System.out.println("SomeOrderTest.testInsert()");
	}
	public void testFetch() {
		System.out.println("SomeOrderTest.testFetch()");
	}
	public void testTwo() {
		System.out.println("SomeOrderTest.testTwo()");
	}
	public void testOne() {
		System.out.println("SomeOrderTest.testOne()");
	}
	public static Test suite() {
		return new OrderedTestSuite(SomeOrderTest.class,
			new String[] {
				"testInsert", "testFetch"
			}
		);
	}

}
