package domain;

public class CreditCardValidatorFactory {
	public static CreditCardValidator getValidator(CardType type) {
		switch (type) {
		case VISA:
			return new VisaCardValidator();
		case MASTERCARD:
			return new MasterCardValidator();
		default:
			throw new IllegalArgumentException("Invalid card type " + type);
		}
	}
}
