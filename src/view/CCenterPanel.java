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

	// JTextField
	private JTextField txtMaHangHoa;
	private JTextField txtTenHangHoa;
	private JTextField txtHanSuDung;
	private JTextField txtGiaNhap;
	private JTextField txtSoLuongTonKho;

	// JComboBox
	private JComboBox<?> cboKho;
	private JComboBox<?> cboPhanLoai;
	private JComboBox<?> cboHangsanxuat;

	// JLabel
	private JLabel lblKho;
	private JLabel lblMaHangHoa;
	private JLabel lblPhanLoai;
	private JLabel lblTenHangHoa;
	private JLabel lblHangSanXuat;
	private JLabel lblHanSuDung;
	private JLabel lblGiaNhap;
	private JLabel lblSoLuongTonKho;

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
		txtGiaNhap = new JTextField(7);
		txtHanSuDung = new JTextField(7);
		txtMaHangHoa = new JTextField(7);
		txtSoLuongTonKho = new JTextField(7);
		txtTenHangHoa = new JTextField(30);
	}

	private void initLabel() {
		lblGiaNhap = new JLabel("Price", JLabel.LEFT);
		lblHanSuDung = new JLabel("Expiry date", JLabel.LEFT);
		lblHangSanXuat = new JLabel("Manufacturer", JLabel.LEFT);
		lblKho = new JLabel("Kho");
		lblMaHangHoa = new JLabel("Product code", JLabel.LEFT);
		lblPhanLoai = new JLabel("Category", JLabel.RIGHT);
		lblSoLuongTonKho = new JLabel("Amount", JLabel.LEFT);
		lblTenHangHoa = new JLabel("Product name", JLabel.LEFT);
	}

	private void initComboBox() {
		cboKho = new JComboBox();
		cboHangsanxuat = new JComboBox();
		cboPhanLoai = new JComboBox();
	}

	private void addTextField() {
		addItem(this, txtMaHangHoa, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(this, txtTenHangHoa, 1, 2, 5, 1, GridBagConstraints.EAST);
		addItem(this, txtHanSuDung, 1, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, txtGiaNhap, 3, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, txtSoLuongTonKho, 5, 4, 1, 1, GridBagConstraints.EAST);
	}

	private void addComboBox() {
		addItem(this, cboKho, 1, 0, 5, 1, GridBagConstraints.WEST);
		addItem(this, cboPhanLoai, 3, 1, 3, 1, GridBagConstraints.WEST);
		addItem(this, cboHangsanxuat, 1, 3, 5, 1, GridBagConstraints.WEST);
	}

	private void addLabel() {
		addItem(this, lblKho, 0, 0, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblMaHangHoa, 0, 1, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblPhanLoai, 2, 1, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblTenHangHoa, 0, 2, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblHangSanXuat, 0, 3, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblHanSuDung, 0, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblGiaNhap, 2, 4, 1, 1, GridBagConstraints.WEST);
		addItem(this, lblSoLuongTonKho, 4, 4, 1, 1, GridBagConstraints.WEST);
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
