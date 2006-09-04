package common;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

public class TestCalendarGetInstance extends TestCase {

	Date d = new Date();

	public void testGetInstance() {
		Calendar c = Calendar.getInstance();
		assertEquals("day of month", d.getDate(), c.get(Calendar.MONTH));
	}

	public void testGetInstanceTimeZone() {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		assertEquals("day of month", d.getDate(), c.get(Calendar.MONTH));
	}


	public void testGetInstanceLocale() {
		Calendar c = Calendar.getInstance(Locale.CANADA);
		assertEquals("day of month", d.getDate(), c.get(Calendar.MONTH));
	}


}
