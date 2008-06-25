package sol101;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;

public class SimulatorTest extends MockObjectTestCase {

	public void setUp() throws Exception {
	}

	public void test1() {
		// create mock
		Mock hbmock = mock(HardwareBox.class);
		HardwareBox hb = (HardwareBox) hbmock.proxy();

		// set up expectations
		hbmock.expects(once()).method("getModel");
		hbmock.expects(once()).method("initialize");
		hbmock.expects(once()).method("doSomeWork");
		hbmock.expects(once()).method("reset");

		// run it
		new Simulator(hb).simulate();

		hbmock.verify();

	}
}
