package testclasses;

public class CardData {
	CardType type;
	String cardHolder;
	String cardNumber;
	int year;
	int month;

	public CardData(String cardHolder, CardType type, String cardNumber, int year, int month) {
		super();
		this.cardHolder = cardHolder;
		this.type = type;
		this.cardNumber = cardNumber;
		this.year = year;
		this.month = month;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o.getClass() == this.getClass()) {
			CardData co = (CardData)o;
			if (type != co.type ||
				unequal(cardHolder, co.cardHolder) ||
				unequal(cardNumber, co.cardNumber) ||
				year != co.year ||
				month != co.month) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	/**
	 * package up: test both for null and a.equals(b)
	 */
	private boolean unequal(Object o1, Object o2) {
		if (o1 == null || o2 == null)
			return true;
		return !o1.equals(o2);
	}

	@Override
	public String toString() {
		return cardHolder + type + cardNumber + year + month;
	}

	@Override
	public int hashCode() {
		return cardHolder.hashCode()|cardNumber.hashCode()|year<<10|month;
	}
}
