package common;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class TestCalendarSettersGetters extends TestCase {

	Calendar c = Calendar.getInstance();
	Date d = new Date();

	public void testGetSetTime() {
		c.setTime(d);
		assertEquals(d, c.getTime());
	}

	public void testSetGetTimeInMillis() throws Exception {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(2);
			long m1 = c.getTimeInMillis();
			c.setTimeInMillis(m1 + 10);
			assertEquals(m1 + 10, c.getTimeInMillis());
		}
	}

	public void testGet() {
		// One hates to use deprecated methods, but we need a
		// way of getting the year that is system independant
		// and also does not depend on correct working of Calendar.
		// (assumes that Calendar and Date do not use each other internally!)
		assertEquals(c.get(Calendar.YEAR), 1900 + d.getYear());
	}

	public void testSetIntInt() {
		c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 30);
		assertEquals("set day_of_month rolls month",
				c.get(Calendar.MONTH), d.getMonth() + 1);
	}
}
