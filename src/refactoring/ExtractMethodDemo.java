package refactoring;

public class ExtractMethodDemo {
	String name;

	/**
	 * To refactor this code to have a printDetails method,
	 * in Eclipse, select the two lines after the comment, down
	 * to the call to getOutstanding, go to the Refactor Menu,
	 * select Extract Method. Type printDetails in the Method
	 * Name box. Click Preview to see how it will look.
	 * If it's right click OK. Delete the now-redundant comment.
	 * To gain practice with Refactorings, use the inverse refactoring
	 * (Inline) to put things back the way they were...
	 */
	void printOwing() {
        printBanner();

        //print details
        System.out.println ("name:      " + name);
		System.out.println ("amount     " + getOutstanding());
	}

	void printBanner() {

	}
	double getOutstanding() {
		return 42;
	}
}
