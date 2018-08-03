package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ContentTopPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// JButton
	private JButton btnThem;
	private JButton btnSua;
	private JButton btnXoa;
	private JButton btnLuu;
	private JButton btnBoQua;

	public ContentTopPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		initButtons();
		add(btnThem);
		add(btnSua);
		add(btnXoa);
		add(btnLuu);
		add(btnBoQua);
	}

	private void initButtons() {
		btnBoQua = new JButton("Skip");
		btnSua = new JButton("Edit");
		btnThem = new JButton("Add");
		btnXoa = new JButton("Delete");
		btnLuu = new JButton("Save");
	}
}
