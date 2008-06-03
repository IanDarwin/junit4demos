package common;

import junitx.extensions.ComparabilityTestCase;

public class IntegerCompareTest extends ComparabilityTestCase {

	public IntegerCompareTest(String arg0) {
		super(arg0);
	}

	@Override
	protected Comparable<Integer> createLessInstance() throws Exception {
		return new Integer(14);
	}

	@Override
	protected Comparable<Integer> createEqualInstance() throws Exception {
		return new Integer(30);
	}

	@Override
	protected Comparable<Integer> createGreaterInstance() throws Exception {
		return new Integer(65);
	}
}
