package view;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LeftPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable tblWarehouse;

	private String column[] = { "No.", "Warehouse" };
	private String data[][] = { { "", "", "" }, { "", "", "" }, { "", "", "" } };

	public LeftPanel() {
		tblWarehouse = new JTable(new DefaultTableModel(data, column));
		JScrollPane jScrollPane = new JScrollPane(tblWarehouse, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPane.setPreferredSize(new Dimension(250, 600));

		add(jScrollPane);

		tblWarehouse.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				tblTonKhoMouseClicked(evt);
			}
		});
	}

	private void tblTonKhoMouseClicked(MouseEvent evt) {
		int selectedRow = tblWarehouse.getSelectedRow();
		String category = (String) tblWarehouse.getValueAt(selectedRow, 0);
		
//		fillToTable(productDAOInit.filterProductByWarehouse(productsInit, category));
	}

}
