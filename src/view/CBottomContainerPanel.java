package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class CBottomContainerPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CBottomContainerPanel() {
		setLayout(new BorderLayout());
	}

	public void loadCSearchPanel(BSearchPanel bSearchPanel) {
		add(bSearchPanel, BorderLayout.WEST);
	}

	public void loadCExportPanel(BExportPanel bExportPanel) {
		add(bExportPanel, BorderLayout.CENTER);
	}
}
