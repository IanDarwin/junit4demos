package testclasses;

import java.util.Calendar;

public class CardValidatorUtils {

	static Calendar cal = Calendar.getInstance();

	public boolean checkLength(String cardNum) {
		return cardNum.length() == 16;
	}

	public boolean notExpired(int year, int month) {
		return cal.get(Calendar.YEAR) <= year &&
			cal.get(Calendar.MONTH) <= month;
	}
}
