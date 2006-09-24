package mocking;

import java.util.List;

import junit.framework.TestCase;

public class TestSearchWithCrashTestDummy extends TestCase {
	public interface Search {
		List search(int category);
	}
	public class CrashTestDummySearch implements Search {
		public List search(int category) {
			throw new NoProductFoundException();
		}
	}
	public void testSearcherThrowsExceptionWithNoProducts() {
		try {
			new SearchEngine(new CrashTestDummySearch()).run();
			fail("SearchEngine failed to throw NPFE");
		} catch (NoProductFoundException e) {
			// all is well
		}
	}

	// These would already exist and are just to make it compile

	public class SearchEngine /* uses Search */ {
		Search search;
		SearchEngine(Search searcher) {
			this.search = searcher;
		}
		void run() {
			search.search(123);
		}
	}

	@SuppressWarnings("serial")
	class NoProductFoundException extends RuntimeException {

	}
}
