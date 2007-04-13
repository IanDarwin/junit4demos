package ex101;

public class Simulator {

	HardwareBox box;

	public static void main(String[] args) {
		new Simulator(new HardwareBox()).simulate();
	}

	public Simulator(HardwareBox box) {
		this.box = box;
	}

	public void simulate() {
		System.out.println("Starting run with " + box.getModel());
		box.initialize();
		box.doSomeWork();
		box.reset();
		System.out.println("All done");
	}
}
