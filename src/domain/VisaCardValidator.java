package testclasses;

public class VisaCardValidator implements CreditCardValidator {

	public boolean validate(
		String cardHolderName, String cardNo, int year, int month) {
		if (!cardNo.startsWith("4"))
			return false;
		if (cardHolderName.contains("Duck"))
			return false;
		System.out.println("more tests needed...");
		return true;
	}

	public CardType getType() {
		return CardType.VISA;
	}
}
