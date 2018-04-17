package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class IntrusionDetect extends JPanel {
	private JTextField txtResponseCode;
	private JPanel panel;
	private JLabel lblIntrusionDetected;
	private JLabel lblCalling;
	private JLabel lblPhonenumber;
	private JLabel lblResponseCodeSent;
	private JButton btnEnter;
	private JLabel label;
	
	

	public JTextField getTxtResponseCode() {
		return txtResponseCode;
	}



	public void setTxtResponseCode(JTextField txtResponseCode) {
		this.txtResponseCode = txtResponseCode;
	}



	public JPanel getPanel() {
		return panel;
	}



	public void setPanel(JPanel panel) {
		this.panel = panel;
	}



	public JLabel getLblIntrusionDetected() {
		return lblIntrusionDetected;
	}



	public void setLblIntrusionDetected(JLabel lblIntrusionDetected) {
		this.lblIntrusionDetected = lblIntrusionDetected;
	}



	public JLabel getLblCalling() {
		return lblCalling;
	}



	public void setLblCalling(JLabel lblCalling) {
		this.lblCalling = lblCalling;
	}



	public JLabel getLblPhonenumber() {
		return lblPhonenumber;
	}



	public void setLblPhonenumber(JLabel lblPhonenumber) {
		this.lblPhonenumber = lblPhonenumber;
	}



	public JLabel getLblResponseCodeSent() {
		return lblResponseCodeSent;
	}



	public void setLblResponseCodeSent(JLabel lblResponseCodeSent) {
		this.lblResponseCodeSent = lblResponseCodeSent;
	}



	public JButton getBtnEnter() {
		return btnEnter;
	}



	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}



	/**
	 * Create the panel.
	 */
	public IntrusionDetect() {
		setLayout(null);
		setBounds(0, 0, 921, 581);
		panel = new JPanel();
		panel.setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 245, 238)), new LineBorder(new Color(244, 164, 96))));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 917, 581);
		add(panel);
		panel.setLayout(null);

		lblIntrusionDetected = new JLabel("INTRUSION DETECTED !!!!");
		lblIntrusionDetected.setForeground(new Color(128, 0, 128));
		lblIntrusionDetected.setFont(new Font("Heiti TC", Font.BOLD, 28));
		lblIntrusionDetected.setBounds(346, 88, 324, 64);
		panel.add(lblIntrusionDetected);

		lblCalling = new JLabel("Calling . . .");
		lblCalling.setForeground(new Color(75, 0, 130));
		lblCalling.setFont(new Font("Heiti TC", Font.PLAIN, 20));
		lblCalling.setBounds(363, 188, 120, 32);
		panel.add(lblCalling);

		lblPhonenumber = new JLabel("PhoneNumber");
		lblPhonenumber.setFont(new Font("Heiti TC", Font.PLAIN, 20));
		lblPhonenumber.setBounds(516, 188, 148, 32);
		panel.add(lblPhonenumber);

		lblResponseCodeSent = new JLabel("Response Code Sent");
		lblResponseCodeSent.setForeground(new Color(240, 128, 128));
		lblResponseCodeSent.setFont(new Font("Heiti TC", Font.PLAIN, 19));
		lblResponseCodeSent.setBounds(396, 257, 223, 42);
		panel.add(lblResponseCodeSent);

		txtResponseCode = new JTextField();
		txtResponseCode.setFont(new Font("Heiti TC", Font.PLAIN, 18));
		txtResponseCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtResponseCode.setBounds(412, 333, 175, 42);
		panel.add(txtResponseCode);
		txtResponseCode.setColumns(10);

		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Heiti TC", Font.PLAIN, 18));
		btnEnter.setBounds(412, 416, 175, 42);
		panel.add(btnEnter);
		
		label = new JLabel("Response Code");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label.setBounds(228, 338, 148, 30);
		panel.add(label);

	}

}
