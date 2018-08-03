package view;

import java.awt.Dimension;

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

	String column[] = { "No.", "Warehouse" };
	String data[][] = { { "", "", "" }, { "", "", "" }, { "", "", "" } };

	public LeftPanel() {
		tblWarehouse = new JTable(new DefaultTableModel(data, column));
		JScrollPane jScrollPane = new JScrollPane(tblWarehouse, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension(250, 600));
        
        add(jScrollPane);
	}

}
