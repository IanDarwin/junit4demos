package hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import domain.Foo;

public class HamcrestDemo {
	
	@Test
	public void testEquals() {
		Foo first = new Foo(100);
		Foo second = new Foo(100);
		assertThat("equalTo() works", first, equalTo(second));
	}

	@Test
	public void testNameConcat() {
	Person p = new Person("Ian", "Darwin");
	String f = p.getFullName();
	assertThat(f, containsString("Ian"));
	assertThat(f, equalTo("Ian Darwin"));
	assertThat(f, not(containsString("/"))); // contrived, just shows syntax
}
}
