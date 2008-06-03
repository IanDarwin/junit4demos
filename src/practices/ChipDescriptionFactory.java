package practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/** A fairly simple implementation of the Factory pattern,
 * for creating ChipDescription objects.
 */
public class ChipDescriptionFactory {
	
	private static final String CHIPTYPES_PROPERTIES =
		"files/chiptypes.properties";
	static Properties properties = new Properties();

	static {
		try {
			properties.load(new FileInputStream(CHIPTYPES_PROPERTIES));
		} catch (IOException e) {
			throw new RuntimeException(
				"Error: couldn't read from the " + CHIPTYPES_PROPERTIES + " file.", e);
		}
	}

	static public ChipDescription createChipDescription(String type) {
        ChipDescription chip = null;

        String chipDescClassName =
        	properties.getProperty(type.toLowerCase());

        if (chipDescClassName == null || chipDescClassName.equals("")) {
        	throw new RuntimeException("Error: no chip class for type: " + type);
        }

        Class<? extends ChipDescription> chipClass = null;
        try {
            chipClass = (Class<? extends ChipDescription>) Class.forName(chipDescClassName);
        } catch (ClassNotFoundException e) {
            String message = "Error: class " + chipDescClassName + " not found!";
			System.err.println(message);
            throw new RuntimeException(message, e);
        } catch (Exception e) {
            throw new RuntimeException(e.toString(), e);
        }

        try {
        	chip = (ChipDescription) chipClass.newInstance();
        } catch (Exception e) {
        	System.err.println(e);
        	throw new RuntimeException(e.toString(), e);
        }
        return chip;
    }
}