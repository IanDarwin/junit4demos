package common;

import testclasses.CreditCardValidator;
import testclasses.VisaCardValidator;

public class TestVISACardValidator extends TestCardValidator {

	@Override
	public String getGoodNumber() {
		return "4500123456789012";
	}

	@Override
	public String getBadNumber() {
		return "123456789012345";
	}

	@Override
	public CreditCardValidator getValidator() {
		return new VisaCardValidator();
	}

}
