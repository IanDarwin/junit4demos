package intro;

import java.util.List;
import java.util.Vector;

/**
 * A kind of mini-test: how much of this code could you
 * explain to a Java newbie?
 * @version Java 1.5 version!
 */
public class PreTest extends AnotherClass implements Runnable {

	List<String> stuff = new Vector<String>();

    Foo bar = new Foo() {
            @Override
            void methodX() {
                    System.out.println( // Hard question
                    		"What does this print: " + getClass().getName());
                    super.methodX();        // why?
            }
    };

    // Seem incomplete? Keep reading...














    // Everything below this line is just to make the example compile.
    public static void main(String[] args) {
		new PreTest().bar.methodX();
	}

	public void run() {
		System.out.println("PreTest.run()");
	}
	private abstract class Foo {
		void methodX() { }
	}
}

class AnotherClass {
}