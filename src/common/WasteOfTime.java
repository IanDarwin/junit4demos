package common;

import java.util.List;

import testclasses.Foo;
import testclasses.Util;

import junit.framework.TestCase;

public class WasteOfTime extends TestCase {

	List<Foo> list1 = Util.getListOfFoo(5);
	List<Foo> list2 = Util.getListOfFoo(5);


	public void testWastingTime() {
		for (int i = 0; i < list1.size(); i++) {
			assertEquals(list1.get(i), list2.get(i));
		}
	}
	public void testBetterWay() {
		assertEquals(list1, list2);
	}
}
