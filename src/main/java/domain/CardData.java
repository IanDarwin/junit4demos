package domain;

public class CardData {
	private CardType cardType;
	private String cardHolder;
	private String cardNumber;
	private int year;
	private int month;

	public CardData(String cardHolder, CardType type, String cardNumber, int year, int month) {
		super();
		this.cardHolder = cardHolder;
		this.cardType = type;
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
			if (cardType != co.cardType ||
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
		return cardHolder + cardType + cardNumber + year + month;
	}

	@Override
	public int hashCode() {
		return cardHolder.hashCode()|cardNumber.hashCode()|year<<10|month;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType type) {
		this.cardType = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
