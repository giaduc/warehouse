package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContentBottomPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable tblProduct;

	String data[][] = { { "", "", "", "" }, { "", "", "", "" }, { "", "", "", "" }, { "", "", "", "" } };

	String column[] = { "Product code", "Product name", "Expiry date", "Amount" };

	public ContentBottomPanel() {
		tblProduct = new JTable(new DefaultTableModel(data, column));
		// tblProduct.setSize(600, 300);
		JScrollPane jScrollPane = new JScrollPane(tblProduct, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPane.setPreferredSize(new Dimension(600, 300));

		add(jScrollPane);
	}
}
