package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;


/**
 * ContentPanel
 * layout: BorderLayout()
 * include 3 panels:
 * - ContentTopPanel: BorderLayout.NORTH
 * - ContentCenterPanel: BorderLayout.CENTER
 * - ContentBottomPanel: BorderLayout.SOUTH
 *
 */
public class ContentPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ContentTopPanel contentTopPanel;
	ContentCenterPanel contentCenterPanel;
	ContentBottomPanel contentBottomPanel;

	public ContentPanel() {
		// BorderLayout
		setLayout(new BorderLayout());
		
		// Panels
		contentTopPanel = new ContentTopPanel();
		contentCenterPanel = new ContentCenterPanel();
		contentBottomPanel = new ContentBottomPanel();
		
		// add Panels
		add(contentTopPanel, BorderLayout.NORTH);
		add(contentCenterPanel, BorderLayout.CENTER);
		add(contentBottomPanel, BorderLayout.SOUTH);
	}
}
