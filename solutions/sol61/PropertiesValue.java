package sol61;

public class PropertiesValue {

	public int getValue() {
		return Integer.parseInt(System.getProperty("test.value", "0"));
	}
}
