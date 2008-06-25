package sol101;

/**
 * Part of the assignment is to recognize that you need to change the
 * type HardwareBox from a class to an interface so it can be mocked.
 */
public interface HardwareBox {

	public void initialize();

	public String getModel();

	public void reset();

	public void doSomeWork();
}
