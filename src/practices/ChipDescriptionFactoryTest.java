package practices;

import java.lang.reflect.Modifier;

import junit.framework.TestCase;

public class ChipDescriptionFactoryTest extends TestCase {

	ChipDescription x = null;

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCreateChipDescription() {
		x = ChipDescriptionFactory.createChipDescription("Ti1234");
		assertTrue(x instanceof TI1234ChipDesc);
		Class c = x.getClass();
		// Our chip description must not be abstract
		assertFalse(Modifier.isAbstract(c.getModifiers()));
	}

	public void testCreateChipBadDescription() {
		try {
			ChipDescriptionFactory.createChipDescription("goofus");
			fail("Did not throw expected RTE on bad input");
		} catch (RuntimeException e) {
			// all is well
		}
	}

	public void testCreateChipBadClass() {
		try {
			ChipDescriptionFactory.createChipDescription("test1");
			fail("Did not throw expected RTE on bad input");
		} catch (RuntimeException e) {
			// all is well
		}
	}

	public void testCreateChipNotDescription() {
		try {
			ChipDescriptionFactory.createChipDescription("test2");
			fail("Did not throw expected RTE on bad input");
		} catch (RuntimeException e) {
			// all is well
		}
	}
}
