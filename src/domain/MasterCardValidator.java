package domain;

public class MasterCardValidator implements CreditCardValidator {
	public boolean validate(
		String cardHolderName, String cardNo, int year, int month) {
		if (!cardNo.startsWith("5"))
			return false;
		if (cardHolderName.contains("Mouse"))
			return false;
		// more tests needed...
		return true;
	}
	public CardType getType() {
		return CardType.MASTERCARD;
	}
}
