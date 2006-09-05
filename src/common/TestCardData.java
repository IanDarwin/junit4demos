package common;

import java.util.Arrays;
import java.util.List;

import testclasses.CardData;
import testclasses.CardType;

import com.diasparsoftware.util.junit.ValueObjectEqualsTest;

public class TestCardData extends ValueObjectEqualsTest {

	private static final int REF_EXP_MONTH = 8;
	private static final int REF_EXP_YEAR = 2008;
	private static final String REF_CARD_NUMBER = "4567890123456789";
	private static final CardType REF_CARD_TYPE = CardType.VISA;
	private static final String REF_CARD_HOLDER = "Card. H. Older";

	protected List<String> keyPropertyNames() {
		return Arrays.asList(
			new String[] { "type", "cardHolder", "cardNumber", "year", "month"});
	}

	protected Object createControlInstance() throws Exception {
		return new CardData(
				REF_CARD_HOLDER, REF_CARD_TYPE, REF_CARD_NUMBER, REF_EXP_YEAR, REF_EXP_MONTH);
	}

	protected Object createInstanceDiffersIn(String key) throws Exception {
		if ("cardHolder".equals(key)) {
			return new CardData("Donald Duck", REF_CARD_TYPE, REF_CARD_NUMBER, REF_EXP_YEAR, REF_EXP_MONTH);
		}
		if ("type".equals(key)) {
			return new CardData(REF_CARD_HOLDER, CardType.MASTERCARD, REF_CARD_NUMBER, REF_EXP_YEAR, REF_EXP_MONTH);
		}
		if ("cardNumber".equals(key)) {
			return new CardData(REF_CARD_HOLDER, REF_CARD_TYPE, "123", REF_EXP_YEAR, REF_EXP_MONTH);
		}
		if ("year".equals(key)) {
			return new CardData(REF_CARD_HOLDER, REF_CARD_TYPE, REF_CARD_NUMBER, 2112, REF_EXP_MONTH);
		}
		if ("month".equals(key)) {
			return new CardData(REF_CARD_HOLDER, REF_CARD_TYPE, REF_CARD_NUMBER, REF_EXP_YEAR, 1);
		}
		System.out.println("WARNING did not match " + key);
		return null;
	}
}
