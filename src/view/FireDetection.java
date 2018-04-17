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

public class FireDetection extends JPanel {
	
	private JTextField txtEnter;
	public JTextField getTxtEnter() {
		return txtEnter;
	}

	public void setTxtEnter(JTextField txtEnter) {
		this.txtEnter = txtEnter;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLblFireDetected() {
		return lblFireDetected;
	}

	public void setLblFireDetected(JLabel lblFireDetected) {
		this.lblFireDetected = lblFireDetected;
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

	private JPanel panel;
	private JLabel lblFireDetected;
	private JLabel lblCalling;
	private JLabel lblPhonenumber;
	private JLabel lblResponseCodeSent;
	private JButton btnEnter;

	/**
	 * Create the panel.
	 */
	public FireDetection() {
		setLayout(null);
		setBounds(0, 0, 921, 581);
		panel = new JPanel();
		panel.setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 245, 238)), new LineBorder(new Color(244, 164, 96))));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 917, 581);
		add(panel);
		panel.setLayout(null);

		lblFireDetected = new JLabel("FIRE DETECTED !!!!");
		lblFireDetected.setForeground(new Color(178, 34, 34));
		lblFireDetected.setFont(new Font("Heiti TC", Font.BOLD, 28));
		lblFireDetected.setBounds(384, 87, 254, 64);
		panel.add(lblFireDetected);

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
		lblResponseCodeSent.setForeground(new Color(47, 79, 79));
		lblResponseCodeSent.setFont(new Font("Heiti TC", Font.PLAIN, 19));
		lblResponseCodeSent.setBounds(401, 259, 223, 42);
		panel.add(lblResponseCodeSent);

		txtEnter = new JTextField();
		txtEnter.setFont(new Font("Heiti TC", Font.PLAIN, 18));
		txtEnter.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnter.setBounds(384, 329, 228, 42);
		panel.add(txtEnter);
		txtEnter.setColumns(10);

		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Heiti TC", Font.PLAIN, 18));
		btnEnter.setBounds(411, 405, 175, 42);
		panel.add(btnEnter);
		
		JLabel lblSprinklerOn = new JLabel("Sprinkler On");
		lblSprinklerOn.setForeground(new Color(0, 0, 255));
		lblSprinklerOn.setBounds(436, 231, 106, 16);
		panel.add(lblSprinklerOn);
		
		JLabel lblNewLabel = new JLabel("Response Code");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(224, 334, 148, 30);
		panel.add(lblNewLabel);

	}
}