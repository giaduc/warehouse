package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BSearchPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String BUTTON_SEARCH = "Search";
	private static final String LABEL_SEARCH = "Search";

	private JTextField txtSearch;
	private JLabel lblSearch;
	private JButton btnSearch;

	public BSearchPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		initComponents();
		addComponents();
	}

	private void initComponents() {
		btnSearch = new JButton(BUTTON_SEARCH);
		txtSearch = new JTextField(10);
		lblSearch = new JLabel(LABEL_SEARCH, JLabel.LEFT);
	}

	private void addComponents() {
		add(lblSearch);
		add(txtSearch);
		add(btnSearch);
	}

}
