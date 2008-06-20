package hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import testclasses.Foo;

public class HamcrestDemo {
	
	@Test
	public void testEquals() {
		Foo first = new Foo(100);
		Foo second = new Foo(100);
		assertThat("equalTo() works", first, equalTo(second));
	}
}