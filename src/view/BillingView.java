package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;


public class BillingView extends JPanel {

	///String billing = "";
	
	JTextArea textAreaBill;
	JButton btnBack;
	private JPanel panel_1;
	private JLabel lblCustomerBillInformation;
	private JScrollPane scrollPane;
	
	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JTextArea getTextAreaBill() {
		return textAreaBill;
	}

	public void setTextAreaBill(JTextArea textAreaBill) {
		this.textAreaBill = textAreaBill;
	}

	
	/**
	 * Create the panel.
	 */
	public BillingView() {
		setBounds(100, 100, 921, 581);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(213, 73, 618, 444);
		add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 0, 606, 438);
		panel.add(scrollPane);
		
		textAreaBill = new JTextArea();
		scrollPane.setViewportView(textAreaBill);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(414, 529, 117, 29);
		add(btnBack);
		
		panel_1 = new JPanel();
		panel_1.setBounds(260, 26, 382, 35);
		add(panel_1);
		panel_1.setLayout(null);
		
		lblCustomerBillInformation = new JLabel("Customer Bill Information");
		lblCustomerBillInformation.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblCustomerBillInformation.setBounds(104, 6, 202, 16);
		panel_1.add(lblCustomerBillInformation);
	}
}
