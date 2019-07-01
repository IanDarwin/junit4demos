package mocking;

import java.util.List;

import org.junit.Test;

public class TestSearchWithCrashTestDummy {
	
	public interface Search {
		List<Object> search(int category);
	}
	
	public class CrashTestDummySearch implements Search {
		public List<Object> search(int category) {
			throw new NoProductFoundException();
		}
	}
	
	@Test(expected=NoProductFoundException.class)
	public void testSearcherThrowsExceptionWithNoProducts() {
		new SearchEngine(new CrashTestDummySearch()).run();
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

	class NoProductFoundException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}
}
