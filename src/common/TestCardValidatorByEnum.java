package common;

import junit.framework.TestCase;
import testclasses.CardType;
import testclasses.CreditCardValidator;
import testclasses.CreditCardValidatorFactory;

public class TestCardValidatorByEnum extends TestCase {

	protected CreditCardValidator validator;

	public void testValidator() {
		String goodName = "Ian";

		for (CardType type : CardType.values()) {
			validator = CreditCardValidatorFactory.getValidator(type);
			if (validator.getType() == CardType.VISA)
				assertTrue(validator.validate(goodName, "4500123456789012",
						2009, 05));
				// etc...
		}
	}
}
