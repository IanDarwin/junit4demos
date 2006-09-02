package common;

import testclasses.Foo;
import junit.framework.TestCase;
import com.gargoylesoftware.base.testing.EqualsTester;

public class TestEqualsWithEqualsTester extends TestCase {

	public void testEquals() {
		Foo f = new Foo();
		System.out.println(f);
		Foo g = new Foo();
		Foo h = new Foo(55);
		Foo i = new Foo() {
		};
		System.out.println(i);

		new EqualsTester(f, g, h, i);
	}
}
