package intro;

import java.io.IOException;

import org.junit.Test;

/** To show how different Exception classes get reported */
public class WhatThrows {
	
	@Test
	/** Should get reported as a JUnit Failure, iff run with
	 * the Java Language assertions enabled (e.g., java -ea ...)
	 */
	public void failsAssertion() {
		assert false : "test";
	}
	
	@Test
	/** Should get reported as a JUnit Failure */
	public void throwsAssertionError() {
		throw new AssertionError("test");
	}
	
	@Test
	/** Should get reported as an Error */
	public void throwsRuntimeException() {
		throw new RuntimeException("test");
	}
	

	
	@Test
	/** Should get reported as an Error */
	public void throwsCheckException () throws Exception {
		throw new IOException("test");
	}
}
