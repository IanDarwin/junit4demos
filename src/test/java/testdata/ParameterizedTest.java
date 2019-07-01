package testdata;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
 * This is a JUnit test for the StringUtils class.  
 */
@RunWith(value=Parameterized.class)
public class ParameterizedTest {
	
	/** This method provides data to the constructor for use in tests */
	@Parameters
	public static List<Object[]> data() {		
		final Object[][] data = new Object[][]  {
				{true,  ""},
				{false, "null"},
				{true,  null},
		};
		return Arrays.asList(data);					
	}
	
	private String s;
	private boolean expected;
	
	/** Constructor, gets arguments from data array; cast as needed */
	public ParameterizedTest(Object expected, Object value) {
		s = (String)value;
		this.expected = (Boolean) expected;
	}
	
	@Test
	public void stringLengthTest() {
		assert (s.length() == 0) == expected;	
	}		
}


