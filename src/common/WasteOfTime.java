package common;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import testclasses.Foo;
import testclasses.Util;

public class WasteOfTime  {

	List<Foo> list1 = Util.getListOfFoo(5);
	List<Foo> list2 = Util.getListOfFoo(5);

	@Test public void testWastingTime() {
		for (int i = 0; i < list1.size(); i++) {
			assertEquals(list1.get(i), list2.get(i));
		}
	}
	@Test public void testBetterWay() {
		assertEquals(list1, list2);
	}
	
	// prove that assertEquals does note differences
	@Test(expected=AssertionError.class) 
	public void testFailureInBetterWay() {
		list2.set(3, new Foo(123));
		assertEquals(list1, list2);
	}
}
