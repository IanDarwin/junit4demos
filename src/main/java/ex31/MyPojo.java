package ex31;

public class MyPojo {
	String firstName;
	String lastName;
	String telNumber;
	int birthYear;

	/**
	 * package up: test both for null and a.equals(b)
	 */
	private boolean unequal(Object o1, Object o2) {
		if (o1 == null || o2 == null)
			return true;
		return !o1.equals(o2);
	}




	// No peeking
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o.getClass() == this.getClass()) {
			MyPojo po = (MyPojo) o;
			if (unequal(firstName, po.firstName))
				return false;
			if (unequal(lastName, po.firstName))
				return false;
			if (unequal(telNumber, po.telNumber))
				return false;
			if (birthYear != po.birthYear) {
				return false;
			}
		}
		return super.equals(o);
	}


}
