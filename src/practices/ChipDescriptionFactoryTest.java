package practices;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ChipDescriptionFactoryTest  {

	ChipDescription x = null;

	@Test
	public void testCreateChipDescription() {
		x = ChipDescriptionFactory.createChipDescription("Ti1234");
		assertTrue(x instanceof TI1234ChipDesc);
		Class<? extends ChipDescription> c = x.getClass();
		// Our chip description must not be abstract
		assertFalse(Modifier.isAbstract(c.getModifiers()));
	}

	@Test
	public void testCreateChipBadDescription() {
		try {
			ChipDescriptionFactory.createChipDescription("goofus");
			fail("Did not throw expected RTE on bad input");
		} catch (RuntimeException e) {
			// all is well
		}
	}

	@Test
	public void testCreateChipBadClass() {
		try {
			ChipDescriptionFactory.createChipDescription("test1");
			fail("Did not throw expected RTE on bad input");
		} catch (RuntimeException e) {
			// all is well
		}
	}

	@Test
	public void testCreateChipNotDescription() {
		try {
			ChipDescriptionFactory.createChipDescription("test2");
			fail("Did not throw expected RTE on bad input");
		} catch (RuntimeException e) {
			// all is well
		}
	}
}
