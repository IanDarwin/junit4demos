package common;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class TestCalendarGetInstance  {

	Date d = new Date();

	@Test public void testGetInstance() {
		Calendar c = Calendar.getInstance();
		assertEquals("day of month", d.getDate(), c.get(Calendar.DAY_OF_MONTH));
	}

	/* Removed the @Test from this method as it necessarily fails
	 * when run within (our time zone - GMT) hours of midnight!
	 */
	public void testGetInstanceTimeZone() {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		assertEquals("day of month", d.getDate(), c.get(Calendar.DAY_OF_MONTH));
	}


	@Test public void testGetInstanceLocale() {
		Calendar c = Calendar.getInstance(Locale.CANADA);
		assertEquals("day of month", d.getDate(), c.get(Calendar.DAY_OF_MONTH));
	}


}
