package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import model.GloabalVariables;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ConfigView extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblOfSensors;
	private JLabel lblSosafeSystemConfiguration;
	private JCheckBox chckbxFireDetectionSensor;
	private JCheckBox chckbxIntrusionDetectionSensor;
	private JComboBox comboBox;
	private JButton btnAddInfo;
	private JButton btnDone;

	public JCheckBox getChckbxFireDetectionSensor() {
		return chckbxFireDetectionSensor;
	}

	public void setChckbxFireDetectionSensor(JCheckBox chckbxFireDetectionSensor) {
		this.chckbxFireDetectionSensor = chckbxFireDetectionSensor;
	}

	public JCheckBox getChckbxIntrusionDetectionSensor() {
		return chckbxIntrusionDetectionSensor;
	}

	public void setChckbxIntrusionDetectionSensor(JCheckBox chckbxIntrusionDetectionSensor) {
		this.chckbxIntrusionDetectionSensor = chckbxIntrusionDetectionSensor;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtnAddInfo() {
		return btnAddInfo;
	}

	public void setBtnAddInfo(JButton btnAddInfo) {
		this.btnAddInfo = btnAddInfo;
	}

	

	public JButton getBtnDone() {
		return btnDone;
	}

	public void setBtnDone(JButton btnDone) {
		this.btnDone = btnDone;
	}

	/**
	 * Create the panel.
	 */
	public ConfigView() {
		setBounds(100, 100, 921, 581);
		setBorder(new CompoundBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(224, 255, 255), new Color(169, 169, 169)),
				new EtchedBorder(EtchedBorder.LOWERED, null, new Color(220, 220, 220))));
		setBackground(new Color(240, 255, 255));
		setForeground(new Color(176, 224, 230));
		setLayout(null);
		GloabalVariables.configPanelG = this;
		JLabel lblNewLabel = new JLabel("Choose the Area to Install Sensors");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Heiti TC", Font.PLAIN, 17));
		lblNewLabel.setBounds(53, 103, 772, 37);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Select Sensor type");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Heiti TC", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(53, 264, 231, 44);
		add(lblNewLabel_1);

		chckbxFireDetectionSensor = new JCheckBox("Fire Detection Sensor");
		chckbxFireDetectionSensor.setFont(new Font("Heiti TC", Font.BOLD, 15));
		chckbxFireDetectionSensor.setForeground(new Color(47, 79, 79));
		chckbxFireDetectionSensor.setBounds(53, 341, 204, 23);
		add(chckbxFireDetectionSensor);

		chckbxIntrusionDetectionSensor = new JCheckBox("Intrusion Detection Sensor");
		chckbxIntrusionDetectionSensor.setForeground(new Color(47, 79, 79));
		chckbxIntrusionDetectionSensor.setFont(new Font("Heiti TC", Font.BOLD, 15));
		chckbxIntrusionDetectionSensor.setBounds(53, 408, 247, 30);
		add(chckbxIntrusionDetectionSensor);

		//JComboBox comboBox = new JComboBox();
		createBtnTextListFromFileData();
		comboBox.setBounds(53, 167, 167, 30);
		add(comboBox);

		btnAddInfo = new JButton("Enable Sensors");
		btnAddInfo.setFont(new Font("Heiti TC", Font.PLAIN, 15));
		btnAddInfo.setBounds(289, 477, 145, 29);
		add(btnAddInfo);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(6, 6, 913, 44);
		add(panel_1);

		JLabel label_2 = new JLabel("SoSafe Home Security System");
		panel_1.add(label_2);
		label_2.setForeground(new Color(47, 79, 79));
		label_2.setFont(new Font("Heiti TC", Font.BOLD, 24));

		JLabel label_1 = new JLabel("System Configuration");
		label_1.setBounds(349, 62, 205, 22);
		add(label_1);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Heiti TC", Font.BOLD, 20));
		label_1.setBackground(new Color(0, 139, 139));

		btnDone = new JButton("Done");
		btnDone.setBounds(289, 518, 117, 29);
		add(btnDone);

	}

	private void createBtnTextListFromFileData() {

		String[] catagoryList = { "Living Area", "Kitchen", "Master Bedroom" ,"Guest Bedroom" ,"Drawing Room" ,"Backyard"};
//		String filename = "./HomeLayout";
//		File file = new File(filename);
//		try {
//			Scanner scanner = new Scanner(file);
//			if (scanner.hasNextLine()) {
//				String line = scanner.nextLine();
//				catagoryList = line.split(":");
//			}
			comboBox = new JComboBox(catagoryList);
			setComboBox(comboBox);
		} 
		
	
}
