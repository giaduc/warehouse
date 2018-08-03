package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CCenterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String LABEL_WAREHOUSE = "Warehouse";
	private static final String LABEL_PRODUCT_CODE = "Product code";
	private static final String LABEL_CATEGORY = "Category";
	private static final String LABEL_PRODUCT_NAME = "Product name";
	private static final String LABEL_MANUFACTURER = "Manufacturer";
	private static final String LABEL_EXPIRY_DATE = "Expiry date";
	private static final String LABEL_PRICE = "Price";
	private static final String LABEL_AMOUNT = "Amount";

	// JTextField
	private JTextField txtProductCode;
	private JTextField txtProductName;
	private JTextField txtExpiryDate;
	private JTextField txtPrice;
	private JTextField txtAmount;

	// JComboBox
	private JComboBox<?> cboWarehouse;
	private JComboBox<?> cboCategory;
	private JComboBox<?> cboManufacturer;

	// JLabel
	private JLabel lblWarehouse;
	private JLabel lblProductCode;
	private JLabel lblCategory;
	private JLabel lblProductName;
	private JLabel lblManufacturer;
	private JLabel lblExpiryDate;
	private JLabel lblPrice;
	private JLabel lblAmount;

	public CCenterPanel() {
		setLayout(new GridBagLayout());

		// init components
		initTextField();
		initLabel();
		initComboBox();

		// add components
		addTextField();
		addComboBox();
		addLabel();
	}

	private void initTextField() {
		txtPrice = new JTextField(7);
		txtExpiryDate = new JTextField(7);
		txtProductCode = new JTextField(7);
		txtAmount = new JTextField(7);
		txtProductName = new JTextField(30);
	}

	private void initLabel() {
		lblPrice = new JLabel(LABEL_PRICE, JLabel.LEFT);
		lblExpiryDate = new JLabel(LABEL_EXPIRY_DATE, JLabel.LEFT);
		lblManufacturer = new JLabel(LABEL_MANUFACTURER, JLabel.LEFT);
		lblWarehouse = new JLabel(LABEL_WAREHOUSE);
		lblProductCode = new JLabel(LABEL_PRODUCT_CODE, JLabel.LEFT);
		lblCategory = new JLabel(LABEL_CATEGORY, JLabel.RIGHT);
		lblAmount = new JLabel(LABEL_AMOUNT, JLabel.LEFT);
		lblProductName = new JLabel(LABEL_PRODUCT_NAME, JLabel.LEFT);
	}

	private void initComboBox() {
		cboWarehouse = new JComboBox();
		cboManufacturer = new JComboBox();
		cboCategory = new JComboBox();
	}

	private void addTextField() {
		addItem(this, txtProductCode, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(this, txtProductName, 1, 2, 5, 1, GridBagConstraints.EAST);
		addItem(this, txtExpiryDate, 1, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, txtPrice, 3, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, txtAmount, 5, 4, 1, 1, GridBagConstraints.EAST);
	}

	private void addComboBox() {
		addItem(this, cboWarehouse, 1, 0, 5, 1, GridBagConstraints.WEST);
		addItem(this, cboCategory, 3, 1, 3, 1, GridBagConstraints.WEST);
		addItem(this, cboManufacturer, 1, 3, 5, 1, GridBagConstraints.WEST);
	}

	private void addLabel() {
		addItem(this, lblWarehouse, 0, 0, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblProductCode, 0, 1, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblCategory, 2, 1, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblProductName, 0, 2, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblManufacturer, 0, 3, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblExpiryDate, 0, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblPrice, 2, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblAmount, 4, 4, 1, 1, GridBagConstraints.WEST);
	}

	private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets = new Insets(5, 5, 5, 5);
		gc.anchor = align;
		gc.fill = GridBagConstraints.HORIZONTAL;
		p.add(c, gc);
	}

}
