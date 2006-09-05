package common;

import junit.framework.TestCase;
import testclasses.CreditCardValidator;

public abstract class TestCardValidator extends TestCase {

	protected CreditCardValidator validator;

	public abstract CreditCardValidator getValidator();
	public abstract String getGoodNumber();
	public abstract String getBadNumber();

	public void testValidator() {
		System.out.println("Testing using " + getClass().getName());
		validator = getValidator();
		String goodName = "Ian";
		String goodNumber = getGoodNumber();
		String badNumber = getBadNumber();
		assertTrue(validator.validate(goodName, goodNumber, 2009, 05));
		assertFalse(validator.validate(goodName, badNumber, 2009, 05));
		// etc...
	}
}
