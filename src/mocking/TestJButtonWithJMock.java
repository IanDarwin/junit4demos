package mocking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.jmock.Mock;
import org.jmock.MockObjectTestCase;

/**
 * Test the JButton to be sure it calls the mock ActionListener correctly
 */
public class TestJButtonWithJMock extends MockObjectTestCase {

	public void testJButtonListenerGetsNotified() {

		// set up
		Mock mockListener = mock(ActionListener.class);
		JButton eventSource = new JButton("Hello");
		eventSource.addActionListener((ActionListener) mockListener.proxy());

		// expectations
		mockListener.expects(once()).method("actionPerformed").with(isA(ActionEvent.class));

		// execute
		eventSource.doClick();

		// Uncomment this to watch it fail with "unexpected invocation"
		// eventSource.doClick();
	}
}
