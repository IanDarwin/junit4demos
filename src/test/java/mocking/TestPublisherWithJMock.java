package mocking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;

/**
 * Demonstrate use of JMock to test the Publisher of a pub/sub
 * communications package, using a mock Subscriber.
 * @author Adapted from a tutorial on the JMock web site.
 */
public class TestPublisherWithJMock extends MockObjectTestCase {

	/** The general contract of a Subscriber */
	interface Subscriber {
		public void receive(String message);
	}
	/** The general contract of a Publisher */
	interface Publisher {
		public void add(Subscriber sub);
		public void publish(String message);
	}

	public void testOneSubscriberReceivesAMessage() {

		// set up
		Mock mockSubscriber = mock(Subscriber.class);
		Publisher publisher = new PublisherImpl();
		publisher.add((Subscriber) mockSubscriber.proxy());

		String message = "message";

		// expectations
		mockSubscriber.expects(once()).method("receive").with( eq(message));

		// To watch it fail, uncomment this line:
		// message = "mensaje";

		// execute - the purpose of this test
		publisher.publish(message);
	}

	// This would normally already exist - the thing we are testing
	class PublisherImpl implements Publisher {

		List<String> messages = new ArrayList<String>();
		Set<Subscriber> subscribers = new HashSet<Subscriber>();

		public void add(Subscriber sub) {
			// Might need to send any previous messages...

			// Add them to the list
			subscribers.add(sub);
		}

		public void publish(String message) {
			// Add message to list of messages
			messages.add(message);
			for (Subscriber sub : subscribers) {
				System.out.println("Sending to " + sub);
				sub.receive(message);
			}
		}
	}
}
