package io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import junit.framework.TestCase;

/**
 * Test a program that insists on reading from the terminal.
 */
public class TestInteractiveProgram extends TestCase {

	public void testPrompt() throws Exception {
		String resultString = "answer";
		InputStream inf =
			new ByteArrayInputStream(resultString.getBytes("ISO8859-1"));
		System.setIn(inf);
		PasswdReader t = new PasswdReader();
		String promptResult = t.prompt("Question");
		System.out.println();	// fix prompt's line ending
		System.out.println("Prompt result was: " + promptResult);
		assertEquals(resultString, promptResult);
		inf.close();
	}

	/** Toy PasswdReader, just reads a line from System.in */
	public class PasswdReader {
		public String prompt(String promptString) throws IOException {
			System.out.print(promptString + ": ");
			return new BufferedReader(new InputStreamReader(System.in))
					.readLine();
		}
	}
}
