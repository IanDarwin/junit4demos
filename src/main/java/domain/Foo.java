package domain;

public class Foo {
	public static final int DEFAULT_VALUE = 42;
	private int value;

	public Foo() {
		value = DEFAULT_VALUE;
	}

	public Foo(int value) {
		setValue(value);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o.getClass() == this.getClass()) {
			return this.value == ((Foo)o).value;
		}
		return false;
	}

	public int hashCode() {
		return value << 3;
	}

	public void setValue(int value) {
		if (value < 0) {
			throw new IllegalArgumentException(
				String.format("Value %d must be non-negative", value));
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Foo:" + Integer.toString(value);
	}
}
