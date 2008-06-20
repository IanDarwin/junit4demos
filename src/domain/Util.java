package domain;

import java.util.ArrayList;
import java.util.List;


public class Util {

	public static List<Foo> getListOfFoo(int n) {
		List<Foo> list = new ArrayList<Foo>();
		for (int i = 0; i < n; i++) {
			list.add(new Foo(i * i));
		}
		return list;
	}

}
