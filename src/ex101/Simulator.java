package ex101;

public class Simulator {
	HardwareBox box = new HardwareBox();
	public static void main(String[] args) {
		new Simulator().simulate();
	}
	private void simulate() {
		System.out.println("Starting run with " + box.getModel());
		box.initialize();
		box.doSomeWork();
		box.reset();
		System.out.println("All done");
	}
}
