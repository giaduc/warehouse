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

	private JTextField txtTimKiem;
	private JLabel lblTimKiem;
	private JButton btnTim;

	public BSearchPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		initComponents();
		addComponents();
	}

	private void initComponents() {
		btnTim = new JButton("Search");
		txtTimKiem = new JTextField(10);
		lblTimKiem = new JLabel("Search", JLabel.LEFT);
	}

	private void addComponents() {
		add(lblTimKiem);
		add(txtTimKiem);
		add(btnTim);
	}

}
