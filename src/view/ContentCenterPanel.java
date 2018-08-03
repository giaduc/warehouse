package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContentCenterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Jpanel
	private JPanel centerPanel;
	private JPanel bottomPanel;
	private JPanel searchPanel;
	private JPanel exportPanel;

	// JTextField
	private JTextField txtMaHangHoa;
	private JTextField txtTenHangHoa;
	private JTextField txtHanSuDung;
	private JTextField txtGiaNhap;
	private JTextField txtSoLuongTonKho;
	private JTextField txtTimKiem;

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
	private JLabel lblTimKiem;

	private JButton btnKetXuat;
	private JButton btnTim;
	

	public ContentCenterPanel() {
		setLayout(new BorderLayout());
		centerPanel();
		bottomPanel();

		add(centerPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	private void centerPanel() {
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridBagLayout());

		// init components
		initTextField();
		initLabel();
		initComboBox();
		initButton();

		addTextField();
		addComboBox();
		addLabel();
	}

	private void bottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout());

		searchPanel = new JPanel();
		searchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		exportPanel = new JPanel();
		exportPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		bottomPanel.add(searchPanel, BorderLayout.WEST);
		bottomPanel.add(exportPanel, BorderLayout.CENTER);

		searchPanel.add(lblTimKiem);
		searchPanel.add(txtTimKiem);
		searchPanel.add(btnTim);
		
		exportPanel.add(btnKetXuat);
	}

	private void initTextField() {
		txtGiaNhap = new JTextField(7);
		txtHanSuDung = new JTextField(7);
		txtMaHangHoa = new JTextField(7);
		txtSoLuongTonKho = new JTextField(7);
		txtTenHangHoa = new JTextField(30);
		txtTimKiem = new JTextField(10);
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
		lblTimKiem = new JLabel("Search", JLabel.LEFT);

	}

	private void initButton() {
		btnKetXuat = new JButton("Export");
		btnTim = new JButton("Search");
	}

	private void initComboBox() {
		cboKho = new JComboBox();
		cboHangsanxuat = new JComboBox();
		cboPhanLoai = new JComboBox();
	}

	private void addTextField() {
		addItem(centerPanel, txtMaHangHoa, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, txtTenHangHoa, 1, 2, 5, 1, GridBagConstraints.EAST);
		addItem(centerPanel, txtHanSuDung, 1, 4, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, txtGiaNhap, 3, 4, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, txtSoLuongTonKho, 5, 4, 1, 1, GridBagConstraints.EAST);
	}

	private void addComboBox() {
		addItem(centerPanel, cboKho, 1, 0, 5, 1, GridBagConstraints.WEST);
		addItem(centerPanel, cboPhanLoai, 3, 1, 3, 1, GridBagConstraints.WEST);
		addItem(centerPanel, cboHangsanxuat, 1, 3, 5, 1, GridBagConstraints.WEST);
	}

	private void addLabel() {
		addItem(centerPanel, lblKho, 0, 0, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblMaHangHoa, 0, 1, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblPhanLoai, 2, 1, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblTenHangHoa, 0, 2, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblHangSanXuat, 0, 3, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblHanSuDung, 0, 4, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblGiaNhap, 2, 4, 1, 1, GridBagConstraints.WEST);
		addItem(centerPanel, lblSoLuongTonKho, 4, 4, 1, 1, GridBagConstraints.WEST);
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
