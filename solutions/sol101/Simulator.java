package sol101;

public class Simulator {
	HardwareBox box;

	public Simulator(HardwareBox box) {
		super();
		this.box = box;
	}

	public static void main(String[] args) {
		HardwareBox hb = new HardwareBoxImpl();
		new Simulator(hb).simulate();
	}

	public void simulate() {
		System.out.println("Starting run with " + box.getModel());
		box.initialize();
		box.doSomeWork();
		box.doSomeWork();
		box.reset();
		System.out.println("All done");
	}
}
