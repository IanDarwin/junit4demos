package common;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TestCalendarSettersGetters  {

	protected Calendar c = Calendar.getInstance();
	protected Date d = new Date();

	@Test public void testGetSetTime() {
		c.setTime(d);
		assertEquals(d, c.getTime());
	}

	@Test public void testSetGetTimeInMillis() throws Exception {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(2);
			long m1 = c.getTimeInMillis();
			c.setTimeInMillis(m1 + 10);
			assertEquals(m1 + 10, c.getTimeInMillis());
		}
	}

	@Test @SuppressWarnings("deprecation")
	public void testGet() {
		// One hates to use deprecated methods, but we need a
		// way of getting the year that is system independant
		// and also does not depend on correct working of Calendar.
		// (assumes that Calendar and Date do not use each other internally!)
		assertEquals(c.get(Calendar.YEAR), 1900 + d.getYear());
	}

	@Test @SuppressWarnings("deprecation")
	public void testSetIntInt() {
		c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 31);
		assertEquals("set day_of_month rolls month",
				c.get(Calendar.MONTH), d.getMonth() + 1);
	}
}
