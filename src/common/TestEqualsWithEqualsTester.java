package common;

import testclasses.Foo;
import junit.framework.TestCase;
import com.gargoylesoftware.base.testing.EqualsTester;

public class TestEqualsWithEqualsTester extends TestCase {

	public void testEquals() {
		Foo f = new Foo();	// original
		System.out.println(f);
		Foo g = new Foo();	// equal
		Foo h = new Foo(55); //notequal
		Foo i = new Foo() {	// subclass
		};
		System.out.println(i);

		new EqualsTester(f, g, h, i);
	}
}
