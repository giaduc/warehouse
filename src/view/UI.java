package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * main frame
 * layout: BorderLayout
 * size: 850 x  600
 * include 2 panels:
 * - LeftPanel: BorderLayout.WEST
 * - ContentPanel: BorderLayout.CENTER
 */
public class UI extends JFrame {

	private LeftPanel leftPanel;
	private ContentPanel contentPanel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UI() {
		
		// config jframe
		setLayout(new BorderLayout());
		setTitle("Quản lý kho hàng");
		setSize(850, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		// add panels
		addLeftPanel();
		addContentPanel();
		
		setVisible(true);
	}

	private void addLeftPanel() {
		leftPanel = new LeftPanel();
		add(leftPanel, BorderLayout.WEST);
	}

	private void addContentPanel() {
		contentPanel = new ContentPanel();
		add(contentPanel, BorderLayout.CENTER);
	}

}
