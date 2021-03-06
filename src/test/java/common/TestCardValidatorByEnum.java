package common;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import domain.CardType;
import domain.CreditCardValidator;
import domain.CreditCardValidatorFactory;

public class TestCardValidatorByEnum  {

	protected CreditCardValidator validator;

	@Test public void testValidator() {
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
