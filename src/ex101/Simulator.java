package ex101;

public class Simulator {

	HardwareBox box = new HardwareBox(); // object we will mock

	public static void main(String[] args) {
		new Simulator().simulate();
	}

	public void simulate() { // method we want to test
		System.out.println("Starting run with " + box.getModel());
		box.initialize();
		box.doSomeWork();
		box.reset();
		System.out.println("All done");
	}
}
