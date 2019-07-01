package practices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class ImprovedChipSelectorActionListener implements ActionListener{
	private ChipDescription chipper;

	public ChipDescription getChipDescription() {
		return chipper;
	}

	public void actionPerformed(ActionEvent e) {
		String type = (String) chipTypeDropDown.getSelectedItem();		
		chipper = ChipDescriptionFactory.createChipDescription(type);
	}

	// This code would be part of the UI, not the Listener!
	JComboBox chipTypeDropDown = new JComboBox();
	ImprovedChipSelectorActionListener() {
		chipTypeDropDown.addItem("TI1234");
		chipTypeDropDown.addItem("TI5678");
		chipTypeDropDown.setSelectedIndex(0);
	}
}
