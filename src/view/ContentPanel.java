package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ContentPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContentPanel() {
		setLayout(new BorderLayout());
	}

	public void loadContentTopPanel(ContentTopPanel contentTopPanel) {
		add(contentTopPanel, BorderLayout.NORTH);
	}

	public void loadContentCenterPanel(ContentCenterPanel contentCenterPanel) {
		add(contentCenterPanel, BorderLayout.CENTER);
	}

	public void loadContentBottomPanel(ContentBottomPanel contentBottomPanel) {
		add(contentBottomPanel, BorderLayout.SOUTH);
	}
	
}
