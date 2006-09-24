package practices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class LegacyChipSelectorActionListener implements ActionListener{
	private ChipDescription chipper;

	public ChipDescription getChipDescription() {
		return chipper;
	}

	public void actionPerformed(ActionEvent e) {
		String type = (String) chipTypeDropDown.getSelectedItem();
		type = type.toLowerCase();
		if ("ti1234".equals(type)) {
			chipper = new practices.TI1234ChipDesc();
		} else if ("ti5678".equals(type)) {
			chipper = new practices.TI5678ChipDesc();
		}
	}

	// This code would be part of the UI, not the Listener!
	JComboBox chipTypeDropDown = new JComboBox();
	LegacyChipSelectorActionListener() {
		chipTypeDropDown.addItem("TI1234");
		chipTypeDropDown.addItem("TI5678");
		chipTypeDropDown.setSelectedIndex(0);
	}
}
