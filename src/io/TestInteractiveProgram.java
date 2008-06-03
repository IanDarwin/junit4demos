package io;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * Test a program that insists on reading from the terminal.
 */
public class TestInteractiveProgram  {

	@Test
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
		
		/** Prompt a user, given a prompt string, and return
		 * what the user types in return to the prompt.
		 */
		public String prompt(String promptString) throws IOException {
			System.out.print(promptString + ": ");
			return new BufferedReader(new InputStreamReader(System.in))
					.readLine();
		}
	}
}
