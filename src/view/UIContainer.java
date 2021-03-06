package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class UIContainer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String APPLICATION_TITLE = "Quản lý kho hàng";

	public UIContainer() {
		setLayout(new BorderLayout());
		setTitle(APPLICATION_TITLE);
		setSize(850, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public void loadLeftPanel(LeftPanel leftPanel) {
		add(leftPanel, BorderLayout.WEST);
		pack();
	}

	public void loadContentPanel(ContentContainerPanel contentPanel) {
		add(contentPanel, BorderLayout.CENTER);
		pack();
	}

}
