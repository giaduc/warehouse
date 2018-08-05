package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BExportPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String BUTTON_EXPORT = "Export";

	private JButton btnExport;

	public BExportPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));

		btnExport = new JButton(BUTTON_EXPORT);
		add(btnExport);

		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO btnExport
				System.out.println("btnExport");
			}
		});
	}
}
