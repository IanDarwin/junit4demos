package practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ChipDescriptionFactory {
	private static final String CHIPTYPES_PROPERTIES = "files/chiptypes.properties";
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

        Class chipClass = null;
        try {
            chipClass = Class.forName(chipDescClassName);
        } catch (ClassNotFoundException e) {
            String message = "Error: class " + chipDescClassName + " not found!";
			System.err.println(message);
            throw new RuntimeException(message, e);
        } catch (Exception e) {
            throw new RuntimeException(e.toString(), e);
        }

        if (!ChipDescription.class.isAssignableFrom(chipClass)) {
        	throw new RuntimeException(
        			"Class " + chipClass + " is not a ChipDescription");
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