package intro;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * AllTests for intro.
 */
@RunWith(value=Suite.class)
@SuiteClasses(value={FooTest.class, FooTest2.class,
			SetupVsConstrTest.class, TestString.class,
			// "WhatThrows" is not a real test, and always fails.
			})
public class AllTests extends TestCase {
	// No code needed!
}
