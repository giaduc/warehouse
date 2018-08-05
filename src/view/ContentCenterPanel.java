package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ContentCenterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContentCenterPanel() {
		setLayout(new BorderLayout());
	}

	public void loadCCenterPanel(CCenterPanel cCenterPanel) {
		add(cCenterPanel, BorderLayout.CENTER);
	}

	public void loadCBottomPanel(CBottomContainerPanel cBottomContainerPanel) {
		add(cBottomContainerPanel, BorderLayout.SOUTH);
	}

}
