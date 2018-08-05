package view;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Product;

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

		tblProduct.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				// TODO call event method
				tblProductMouseClicked(evt);
			}
		});
	}

	private void tblProductMouseClicked(MouseEvent evt) {
		// get selected product
		int selectedRow = tblProduct.getSelectedRow();
		String code = (String) tblProduct.getValueAt(selectedRow, 0);

		System.out.println(selectedRow);
		// Tim product by code on click
		// Product p = productDAOInit.find(productsInit, code);

		// Fill product to form
		// filProductToForm(p);
	}
}
