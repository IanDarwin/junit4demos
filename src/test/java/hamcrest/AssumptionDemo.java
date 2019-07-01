package hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assume.assumeThat;

import org.junit.Test;

import domain.Foo;

public class AssumptionDemo {

	Foo foo;
	
	@Test public void testSilly() {
		assumeThat(foo, notNullValue());
		System.out.println("TheoryDemo.testSilly()");
		assertThat(foo.getValue(), is(Foo.DEFAULT_VALUE));
	}
}
