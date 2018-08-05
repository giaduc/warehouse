package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ContentTopPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String BUTTON_SKIP = "Skip";
	private static final String BUTTON_EDIT = "Edit";
	private static final String BUTTON_ADD = "Add";
	private static final String BUTTON_DELETE = "Delete";
	private static final String BUTTON_SAVE = "Save";

	// JButton
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnSave;
	private JButton btnSkip;

	public ContentTopPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		initButtons();
		add(btnAdd);
		add(btnEdit);
		add(btnDelete);
		add(btnSave);
		add(btnSkip);
	}

	private void initButtons() {
		btnSkip = new JButton(BUTTON_SKIP);
		btnEdit = new JButton(BUTTON_EDIT);
		btnAdd = new JButton(BUTTON_ADD);
		btnDelete = new JButton(BUTTON_DELETE);
		btnSave = new JButton(BUTTON_SAVE);

		btnSkip.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO btnSkip
				System.out.println("btnSkip");
			}
		});

		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO btnEdit
				System.out.println("btnEdit");
			}
		});

		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO btnAdd
				System.out.println("btnAdd");
			}
		});

		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO btnDelete
				System.out.println("btnDelete");
			}
		});

		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO btnSave
				System.out.println("btnSave");
			}
		});

	}
}
