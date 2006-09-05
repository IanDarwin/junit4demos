package testclasses;

public interface CreditCardValidator {
	public boolean validate(
		String cardHolderName, String cardNo, int year, int month);
	public CardType getType();
}
