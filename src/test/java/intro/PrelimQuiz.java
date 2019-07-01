package intro;

import java.util.List;
import java.util.Vector;

/**
 * A kind of mini-test: how much of this code could you
 * explain to a Java newbie?
 * @version Java 1.5 version!
 */
public class PrelimQuiz extends AnotherClass implements Runnable {

	List<String> stuff = new Vector<String>();

    Foo bar = new Foo() {
            @Override
            void methodX() {
                    System.out.println( // Hard question
                    		"What does this print: " + getClass().getName());
                    super.methodX();        // where does this go?
            }
    };

    // Seem incomplete? Keep reading...












    // When does this get called?
    void methodX() {
    	System.out.println("PrelimQuiz.methodX()");
    }

    // Everything below this line is just to make the example compile.
    public static void main(String[] args) {
		new PrelimQuiz().bar.methodX();
	}

	public void run() {
		System.out.println("PreTest.run()");
	}
	
	private abstract class Foo {
		void methodX() {
			System.out.println("Foo.methodX()");
		}
	}
}

class AnotherClass {
}