package common;

import java.util.Arrays;
import java.util.List;

import testclasses.CardData;
import testclasses.CardType;

import com.diasparsoftware.util.junit.ValueObjectEqualsTest;

/** Example for "equals-test a big object" - lots of fields -
 * using ValueObjectEqualsTest.
 */
public class TestCardData extends ValueObjectEqualsTest {

	private static final int REF_EXP_MONTH = 8;
	private static final int REF_EXP_YEAR = 2008;
	private static final String REF_CARD_NUMBER = "4567890123456789";
	private static final CardType REF_CARD_TYPE = CardType.VISA;
	private static final String REF_CARD_HOLDER = "Card. H. Older";

	@Override
	protected List<String> keyPropertyNames() {
		return Arrays.asList(
			new String[] { "type", "cardHolder", "cardNumber", "year", "month"});
	}

	@Override
	protected Object createControlInstance() {
		return new CardData(
				REF_CARD_HOLDER, REF_CARD_TYPE, REF_CARD_NUMBER, REF_EXP_YEAR, REF_EXP_MONTH);
	}

	/** This has to create a copy of the target that differs
	 * ONLY in the field named in "key" from the Control Instance.
	 * Try to make this resilient to changes in the Control Instance!
	 */
	@Override
	protected Object createInstanceDiffersIn(String key) throws Exception {
		CardData ref = (CardData) createControlInstance();
		if ("cardHolder".equals(key)) {
			ref.setCardHolder("Donald Duck");
			return ref;
		}
		if ("type".equals(key)) {
			switch(ref.getCardType()) {
			case VISA:
				ref.setCardType(CardType.MASTERCARD);
				break;
			case MASTERCARD:
				ref.setCardType(CardType.VISA);
			}
			return ref;
		}
		if ("cardNumber".equals(key)) {
			ref.setCardNumber("123");
			return ref;
		}
		if ("year".equals(key)) {
			ref.setYear(REF_EXP_YEAR + 1);
			return ref;
		}
		if ("month".equals(key)) {
			ref.setMonth(REF_EXP_MONTH + 1);
			return ref;
		}
		throw new AssertionError(
			String.format("createInstanceDiffersIn(%s) - no case for key", key));

	}
}
