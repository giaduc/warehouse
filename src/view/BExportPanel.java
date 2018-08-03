package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BExportPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnKetXuat;
	
	public BExportPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		btnKetXuat = new JButton("Export");
		add(btnKetXuat);
	}
}
