package hamcrest;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import static org.hamcrest.Matchers.*;
import static org.junit.Assume.assumeThat;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.runner.RunWith;

/** Show use of Theories.
 * @author Borrowed from the JUnit 4.4 Release notes
 */
@RunWith(Theories.class)
public class TheoriesMultipleArguments {

	@DataPoint public static Object[] GOOD = {42, "Ferdinand"};

	@DataPoint public static Object[] BAD = {-1, "/I/the_invincible"};

	@Theory @SuppressWarnings("unused")
	public void filenameIncludesUsername(Object[] data) {
		Integer i = (Integer) data[0];
		String username = (String) data[1];
		assumeThat(username, not(containsString("/")));
		assertThat(new User(username).getConfigurationFileName(),
			containsString(username));
	}
	
	// This would already exist and is what we are testing.
	private class User {
		private String userName;

		// Constructor
		User(String userName) {
			if (userName.contains("/")) {
				throw new IllegalArgumentException("Invalid username " + userName);
			}
			this.userName = userName;
		}
		String getConfigurationFileName() {
			return "/opt/MyClass/" + userName;
		}
	}
}
