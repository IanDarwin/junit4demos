package common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import domain.CreditCardValidator;

public abstract class TestCardValidator  {

	protected CreditCardValidator validator;

	public abstract CreditCardValidator getValidator();
	public abstract String getGoodNumber();
	public abstract String getBadNumber();

	@Test
	public void testValidator() {
		System.out.println("Testing using " + getClass().getName());
		validator = getValidator();
		assertTrue(validator.validate("Ian", getGoodNumber(), 2009, 05));
		assertFalse(validator.validate("Ian", getBadNumber(), 2009, 05));
		// etc...
	}
}
