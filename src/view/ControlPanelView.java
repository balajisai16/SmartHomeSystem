package view;

import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.Color;

import java.awt.Font;

import java.util.*;

import java.text.DateFormat;

import javax.swing.UIManager;

import javax.swing.border.SoftBevelBorder;

import javax.swing.border.BevelBorder;

import javax.swing.JComboBox;

import javax.swing.JButton;

import com.toedter.calendar.JDateChooser;

import com.toedter.calendar.JDayChooser;

import com.toedter.components.JLocaleChooser;

import javax.swing.JSpinner;

import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;

public class ControlPanelView extends JPanel {
	
	JButton btnSchedule;
	JComboBox selectedComboBox;
	JComboBox EnabledArea;
	JSpinner spinner_from;
	JButton btnBack;
	JSpinner spinner_to;
	JButton btnDisable;
	JButton btnFireDetect;
	JButton btnIntrusionDetect;
	private JButton btnBillGenrator;
	JButton btnDisableAllSensors;
	
	

	public JButton getBtnDisableAllSensors() {
		return btnDisableAllSensors;
	}

	public void setBtnDisableAllSensors(JButton btnDisableAllSensors) {
		this.btnDisableAllSensors = btnDisableAllSensors;
	}

	public JButton getBtnBillGenrator() {
		return btnBillGenrator;
	}

	public void setBtnBillGenrator(JButton btnBillGenrator) {
		this.btnBillGenrator = btnBillGenrator;
	}

	public JButton getBtnFireDetect() {
		return btnFireDetect;
	}

	public void setBtnFireDetect(JButton btnFireDetect) {
		this.btnFireDetect = btnFireDetect;
	}

	public JButton getBtnIntrusionDetect() {
		return btnIntrusionDetect;
	}

	public void setBtnIntrusionDetect(JButton btnIntrusionDetect) {
		this.btnIntrusionDetect = btnIntrusionDetect;
	}

	public JButton getBtnDisable() {
		return btnDisable;
	}

	public void setBtnDisable(JButton btnDisable) {
		this.btnDisable = btnDisable;
	}

	public JSpinner getSpinner_to() {
		return spinner_to;
	}

	public void setSpinner_to(JSpinner spinner_to) {
		this.spinner_to = spinner_to;
	}

	public JButton getBtnSchedule() {
		return btnSchedule;
	}

	public void setBtnSchedule(JButton btnSchedule) {
		this.btnSchedule = btnSchedule;
	}

	public JComboBox getSelectedComboBox() {
		return selectedComboBox;
	}

	public void setSelectedComboBox(JComboBox selectedComboBox) {
		this.selectedComboBox = selectedComboBox;
	}

	public JComboBox getEnabledArea() {
		return EnabledArea;
	}

	public void setEnabledArea(JComboBox enabledArea) {
		EnabledArea = enabledArea;
	}

	public JSpinner getSpinner_from() {
		return spinner_from;
	}

	public void setSpinner_from(JSpinner spinner_from) {
		this.spinner_from = spinner_from;
	}

	

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	/**
	 * 
	 * Create the panel.
	 * 
	 */

	String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",

			"Saturday" };
	private JButton btnGraphicalLayout;
	private JPanel panel_2;
	private JLabel lblStatus;
	
	public JLabel getLblStatus() {
		return lblStatus;
	}

	public void setLblStatus(JLabel lblStatus) {
		this.lblStatus = lblStatus;
	}

	private JLabel label_2;
	

	public JButton getBtnGraphicalLayout() {
		return btnGraphicalLayout;
	}

	public void setBtnGraphicalLayout(JButton btnGraphicalLayout) {
		this.btnGraphicalLayout = btnGraphicalLayout;
	}

	public ControlPanelView() {

		setLayout(null);
		setBounds(100, 100, 921, 581);
		JPanel panel = new JPanel();

		panel.setForeground(new Color(47, 79, 79));

		panel.setBackground(new Color(224, 255, 255));

		panel.setBounds(0, 6, 925, 587);

		add(panel);

		panel.setLayout(null);

		JLabel lblSelectedList = new JLabel("Choose the Area to Schedule Sensors");

		lblSelectedList.setForeground(new Color(47, 79, 79));

		lblSelectedList.setFont(new Font("Heiti TC", Font.PLAIN, 15));

		lblSelectedList.setBounds(34, 86, 294, 44);

		panel.add(lblSelectedList);

		JLabel lblTimeScheduled = new JLabel("Time Scheduled");

		lblTimeScheduled.setForeground(new Color(47, 79, 79));

		lblTimeScheduled.setFont(new Font("Heiti TC", Font.PLAIN, 15));

		lblTimeScheduled.setBounds(455, 97, 126, 22);

		panel.add(lblTimeScheduled);

		JPanel panel_1 = new JPanel();

		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		panel_1.setBounds(0, 0, 925, 44);

		panel.add(panel_1);

		JLabel label = new JLabel("SoSafe Home Security System");

		label.setForeground(new Color(47, 79, 79));

		label.setFont(new Font("Heiti TC", Font.BOLD, 24));

		panel_1.add(label);

		selectedComboBox = new JComboBox();

		selectedComboBox.setBounds(34, 142, 169, 27);

		panel.add(selectedComboBox);

		JLabel lblAvailableActiveSensors = new JLabel("Current Sensor Enabled Areas");

		lblAvailableActiveSensors.setForeground(new Color(47, 79, 79));

		lblAvailableActiveSensors.setFont(new Font("Heiti TC", Font.PLAIN, 15));

		lblAvailableActiveSensors.setBounds(34, 215, 250, 35);

		panel.add(lblAvailableActiveSensors);

		EnabledArea = new JComboBox();

		EnabledArea.setBounds(34, 284, 169, 27);

		panel.add(EnabledArea);

		btnDisable = new JButton("Disable");

		btnDisable.setBounds(23, 362, 117, 29);

		panel.add(btnDisable);

		btnDisableAllSensors = new JButton("Disable All Sensors");

		btnDisableAllSensors.setBounds(192, 365, 169, 22);

		panel.add(btnDisableAllSensors);

		btnSchedule = new JButton("Schedule");

		btnSchedule.setBounds(464, 223, 117, 29);

		panel.add(btnSchedule);

		// JComboBox dayComboBox = new JComboBox();

		Date dateF = new Date();
		Date dateT = new Date();

		SpinnerDateModel dateModel = new SpinnerDateModel(dateF, null, null, Calendar.HOUR_OF_DAY);
		SpinnerDateModel dateModel1 = new SpinnerDateModel(dateT, null, null, Calendar.HOUR_OF_DAY);

		spinner_from = new JSpinner(dateModel);

		//JSpinner.DateEditor from = new JSpinner.DateEditor(spinner_from, "HH:MM:SS");
		
		
		
		
		//spinner_from.setEditor(from);

		spinner_from.setBounds(528, 141, 149, 26);

		panel.add(spinner_from);

		JLabel lblNewLabel_1 = new JLabel("FROM:");

		lblNewLabel_1.setBounds(436, 146, 61, 16);

		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("TO:");

		lblNewLabel_2.setBounds(436, 190, 61, 16);

		panel.add(lblNewLabel_2);

		spinner_to = new JSpinner(dateModel1);

	//	JSpinner.DateEditor to = new JSpinner.DateEditor(spinner_to, "");

		//spinner_to.setEditor(to);

		spinner_to.setBounds(528, 185, 149, 26);

		panel.add(spinner_to);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(23, 472, 117, 29);
		panel.add(btnBack);
		
		btnIntrusionDetect = new JButton("Intrusion Detect");
		btnIntrusionDetect.setBounds(192, 472, 136, 29);
		panel.add(btnIntrusionDetect);
		
		btnFireDetect = new JButton("Fire Detect");
		btnFireDetect.setBounds(366, 472, 117, 29);
		panel.add(btnFireDetect);
		
		btnBillGenrator = new JButton("Bill Genrator");
		btnBillGenrator.setBounds(510, 472, 117, 29);
		panel.add(btnBillGenrator);
		
		btnGraphicalLayout = new JButton("Graphical Layout");
		btnGraphicalLayout.setBounds(423, 362, 180, 29);
		panel.add(btnGraphicalLayout);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(411, 264, 250, 70);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		lblStatus = new JLabel("");
		lblStatus.setForeground(Color.GREEN);
		lblStatus.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblStatus.setBounds(165, 27, 61, 16);
		panel_2.add(lblStatus);
		
		label_2 = new JLabel("System Status");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_2.setBounds(27, 25, 109, 22);
		panel_2.add(label_2);

		// DateFormat df = new SimpleDateFormat("DD-MM-YYYY");

		// DateFormat my = new SimpleDateFormat("MM-YYYY");

	}
	

}