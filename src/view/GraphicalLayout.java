package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class GraphicalLayout extends JPanel {
	
	private JPanel panelMasterBedRoom;
	private JPanel panelKitchen;
	private JLabel lblKitchen;
	private JPanel panelFireKitchen;
	private JPanel panelIntrusionKitchen;
	private JLabel label_1;
	private JLabel label_6;
	private JPanel panelBackyard;
	private JLabel lblBackyard;
	private JPanel panelFireBackyard;
	private JPanel panelIntrusionBackyard;
	private JLabel label_2;
	private JLabel label_7;
	private JPanel panelDR;
	private JLabel lblDrawingRoom;
	private JPanel panelFireDrawingRoom;
	private JPanel panelInstrusionDrawingRoom;
	private JLabel label_3;
	private JLabel label_8;
	private JLabel lblMasterBedRoom;
	private JPanel panelFireMasterBedRoom;
	private JPanel panelIntrusionMasterBedRoom;
	private JLabel label;
	private JLabel label_5;
	private JPanel panelG;
	private JLabel lblGuestBedroom;
	private JPanel panelFireGuestRoom;
	private JLabel label_4;
	private JLabel label_9;
	private JPanel panelLivingArea;
	private JLabel lblLivingArea;
	private JPanel panelFireLivingArea;
	private JLabel lblIntrusionSensor;
	
	
	
	

	public JPanel getPanelMasterBedRoom() {
		return panelMasterBedRoom;
	}





	public void setPanelMasterBedRoom(JPanel panelMasterBedRoom) {
		this.panelMasterBedRoom = panelMasterBedRoom;
	}





	public JPanel getPanelKitchen() {
		return panelKitchen;
	}





	public void setPanelKitchen(JPanel panelKitchen) {
		this.panelKitchen = panelKitchen;
	}





	public JPanel getPanelFireKitchen() {
		return panelFireKitchen;
	}





	public void setPanelFireKitchen(JPanel panelFireKitchen) {
		this.panelFireKitchen = panelFireKitchen;
	}





	public JPanel getPanelIntrusionKitchen() {
		return panelIntrusionKitchen;
	}





	public void setPanelIntrusionKitchen(JPanel panelIntrusionKitchen) {
		this.panelIntrusionKitchen = panelIntrusionKitchen;
	}





	public JPanel getPanelBackyard() {
		return panelBackyard;
	}





	public void setPanelBackyard(JPanel panelBackyard) {
		this.panelBackyard = panelBackyard;
	}





	public JPanel getPanelFireBackyard() {
		return panelFireBackyard;
	}





	public void setPanelFireBackyard(JPanel panelFireBackyard) {
		this.panelFireBackyard = panelFireBackyard;
	}





	public JPanel getPanelIntrusionBackyard() {
		return panelIntrusionBackyard;
	}





	public void setPanelIntrusionBackyard(JPanel panelIntrusionBackyard) {
		this.panelIntrusionBackyard = panelIntrusionBackyard;
	}





	public JPanel getPanelDR() {
		return panelDR;
	}





	public void setPanelDR(JPanel panelDR) {
		this.panelDR = panelDR;
	}





	public JPanel getPanelFireDrawingRoom() {
		return panelFireDrawingRoom;
	}





	public void setPanelFireDrawingRoom(JPanel panelFireDrawingRoom) {
		this.panelFireDrawingRoom = panelFireDrawingRoom;
	}





	public JPanel getPanelInstrusionDrawingRoom() {
		return panelInstrusionDrawingRoom;
	}





	public void setPanelInstrusionDrawingRoom(JPanel panelInstrusionDrawingRoom) {
		this.panelInstrusionDrawingRoom = panelInstrusionDrawingRoom;
	}





	public JPanel getPanelFireMasterBedRoom() {
		return panelFireMasterBedRoom;
	}





	public void setPanelFireMasterBedRoom(JPanel panelFireMasterBedRoom) {
		this.panelFireMasterBedRoom = panelFireMasterBedRoom;
	}





	public JPanel getPanelIntrusionMasterBedRoom() {
		return panelIntrusionMasterBedRoom;
	}





	public void setPanelIntrusionMasterBedRoom(JPanel panelIntrusionMasterBedRoom) {
		this.panelIntrusionMasterBedRoom = panelIntrusionMasterBedRoom;
	}





	public JPanel getPanelG() {
		return panelG;
	}





	public void setPanelG(JPanel panelG) {
		this.panelG = panelG;
	}





	public JPanel getPanelFireGuestRoom() {
		return panelFireGuestRoom;
	}





	public void setPanelFireGuestRoom(JPanel panelFireGuestRoom) {
		this.panelFireGuestRoom = panelFireGuestRoom;
	}





	public JPanel getPanelLivingArea() {
		return panelLivingArea;
	}





	public void setPanelLivingArea(JPanel panelLivingArea) {
		this.panelLivingArea = panelLivingArea;
	}





	public JPanel getPanelFireLivingArea() {
		return panelFireLivingArea;
	}





	public void setPanelFireLivingArea(JPanel panelFireLivingArea) {
		this.panelFireLivingArea = panelFireLivingArea;
	}

	public JPanel getPanelIntrusionGuestRoom() {
		return panelIntrusionGuestRoom;
	}





	public void setPanelIntrusionGuestRoom(JPanel panelIntrusionGuestRoom) {
		this.panelIntrusionGuestRoom = panelIntrusionGuestRoom;
	}





	public JPanel getPanelIntrusionLiving() {
		return panelIntrusionLiving;
	}





	public void setPanelIntrusionLiving(JPanel panelIntrusionLiving) {
		this.panelIntrusionLiving = panelIntrusionLiving;
	}

	JPanel panelIntrusionGuestRoom;
	JPanel panelIntrusionLiving;
	JButton btnBack;



	public JButton getBtnBack() {
		return btnBack;
	}





	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}





	/**
	 * Create the panel.
	 */
	public GraphicalLayout() {
		setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 128, 128)), new BevelBorder(BevelBorder.RAISED, new Color(102, 205, 170), null, null, null)));
		setBackground(new Color(224, 255, 255));
		setLayout(null);
		setBounds(100, 100, 921, 581);
		
		panelKitchen = new JPanel();
		panelKitchen.setBorder(new LineBorder(new Color(255, 182, 193)));
		panelKitchen.setBackground(new Color(255, 228, 196));
		panelKitchen.setBounds(6, 6, 169, 283);
		add(panelKitchen);
		panelKitchen.setLayout(null);
		
		lblKitchen = new JLabel("Kitchen");
		lblKitchen.setFont(new Font("Heiti TC", Font.PLAIN, 14));
		lblKitchen.setBounds(50, 120, 86, 25);
		panelKitchen.add(lblKitchen);
		
		panelFireKitchen = new JPanel();
		panelFireKitchen.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(220, 20, 60)));
		panelFireKitchen.setBounds(6, 31, 10, 10);
		panelKitchen.add(panelFireKitchen);
		
		panelIntrusionKitchen = new JPanel();
		panelIntrusionKitchen.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(47, 79, 79)));
		panelIntrusionKitchen.setBounds(6, 230, 10, 10);
		panelKitchen.add(panelIntrusionKitchen);
		
		label_1 = new JLabel("Fire Sensor");
		label_1.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_1.setBounds(24, 31, 84, 16);
		panelKitchen.add(label_1);
		
		label_6 = new JLabel("Intrusion Sensor");
		label_6.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_6.setBounds(28, 230, 119, 16);
		panelKitchen.add(label_6);
		
		panelBackyard = new JPanel();
		panelBackyard.setBorder(new LineBorder(new Color(127, 255, 212)));
		panelBackyard.setBackground(new Color(102, 205, 170));
		panelBackyard.setBounds(178, 6, 522, 62);
		add(panelBackyard);
		panelBackyard.setLayout(null);
		
		lblBackyard = new JLabel("Backyard");
		lblBackyard.setFont(new Font("Heiti TC", Font.PLAIN, 14));
		lblBackyard.setBounds(211, 6, 93, 26);
		panelBackyard.add(lblBackyard);
		
		panelFireBackyard = new JPanel();
		panelFireBackyard.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(220, 20, 60)));
		panelFireBackyard.setBounds(68, 35, 10, 10);
		panelBackyard.add(panelFireBackyard);
		
		panelIntrusionBackyard = new JPanel();
		panelIntrusionBackyard.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(47, 79, 79)));
		panelIntrusionBackyard.setBounds(439, 35, 10, 10);
		panelBackyard.add(panelIntrusionBackyard);
		
		label_2 = new JLabel("Fire Sensor");
		label_2.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_2.setBounds(37, 11, 84, 16);
		panelBackyard.add(label_2);
		
		label_7 = new JLabel("Intrusion Sensor");
		label_7.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_7.setBounds(386, 11, 119, 16);
		panelBackyard.add(label_7);
		
		panelDR = new JPanel();
		panelDR.setBorder(new LineBorder(new Color(64, 224, 208)));
		panelDR.setBackground(new Color(230, 230, 250));
		panelDR.setBounds(702, 6, 213, 200);
		add(panelDR);
		panelDR.setLayout(null);
		
		lblDrawingRoom = new JLabel("Drawing Room");
		lblDrawingRoom.setFont(new Font("Heiti TC", Font.PLAIN, 14));
		lblDrawingRoom.setBounds(58, 75, 128, 28);
		panelDR.add(lblDrawingRoom);
		
		panelFireDrawingRoom = new JPanel();
		panelFireDrawingRoom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(220, 20, 60)));
		panelFireDrawingRoom.setBounds(33, 163, 10, 10);
		panelDR.add(panelFireDrawingRoom);
		
		panelInstrusionDrawingRoom = new JPanel();
		panelInstrusionDrawingRoom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(47, 79, 79)));
		panelInstrusionDrawingRoom.setBounds(176, 163, 10, 10);
		panelDR.add(panelInstrusionDrawingRoom);
		
		label_3 = new JLabel("Fire Sensor");
		label_3.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_3.setBounds(6, 135, 84, 16);
		panelDR.add(label_3);
		
		label_8 = new JLabel("Intrusion Sensor");
		label_8.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_8.setBounds(109, 135, 98, 16);
		panelDR.add(label_8);
		
		panelMasterBedRoom = new JPanel();
		panelMasterBedRoom.setBorder(new LineBorder(new Color(255, 222, 173)));
		panelMasterBedRoom.setBackground(new Color(255, 240, 245));
		panelMasterBedRoom.setBounds(6, 293, 289, 282);
		add(panelMasterBedRoom);
		panelMasterBedRoom.setLayout(null);
		
		lblMasterBedRoom = new JLabel("Master Bed Room");
		lblMasterBedRoom.setFont(new Font("Heiti TC", Font.PLAIN, 14));
		lblMasterBedRoom.setBounds(79, 126, 129, 26);
		panelMasterBedRoom.add(lblMasterBedRoom);
		
		panelFireMasterBedRoom = new JPanel();
		panelFireMasterBedRoom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(220, 20, 60)));
		panelFireMasterBedRoom.setBounds(35, 205, 10, 10);
		panelMasterBedRoom.add(panelFireMasterBedRoom);
		
		panelIntrusionMasterBedRoom = new JPanel();
		panelIntrusionMasterBedRoom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(47, 79, 79)));
		panelIntrusionMasterBedRoom.setBounds(225, 205, 10, 10);
		panelMasterBedRoom.add(panelIntrusionMasterBedRoom);
		
		label = new JLabel("Fire Sensor");
		label.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label.setBounds(17, 226, 84, 16);
		panelMasterBedRoom.add(label);
		
		label_5 = new JLabel("Intrusion Sensor");
		label_5.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_5.setBounds(170, 226, 119, 16);
		panelMasterBedRoom.add(label_5);
		
		panelG = new JPanel();
		panelG.setBorder(new LineBorder(new Color(143, 188, 143)));
		panelG.setBackground(new Color(255, 255, 224));
		panelG.setBounds(700, 293, 215, 282);
		add(panelG);
		panelG.setLayout(null);
		
		lblGuestBedroom = new JLabel("Guest Room");
		lblGuestBedroom.setFont(new Font("Heiti TC", Font.PLAIN, 14));
		lblGuestBedroom.setBounds(75, 120, 117, 26);
		panelG.add(lblGuestBedroom);
		
		panelFireGuestRoom = new JPanel();
		panelFireGuestRoom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(220, 20, 60)));
		panelFireGuestRoom.setBounds(46, 213, 10, 10);
		panelG.add(panelFireGuestRoom);
		
		panelIntrusionGuestRoom = new JPanel();
		panelIntrusionGuestRoom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(47, 79, 79)));
		panelIntrusionGuestRoom.setBounds(199, 213, 10, 10);
		panelG.add(panelIntrusionGuestRoom);
		
		label_4 = new JLabel("Fire Sensor");
		label_4.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_4.setBounds(16, 192, 84, 16);
		panelG.add(label_4);
		
		 label_9 = new JLabel("Intrusion Sensor");
		label_9.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		label_9.setBounds(112, 192, 103, 16);
		panelG.add(label_9);
		
		 panelLivingArea = new JPanel();
		panelLivingArea.setBorder(new CompoundBorder(new LineBorder(new Color(127, 255, 212)), new MatteBorder(1, 1, 1, 1, (Color) new Color(169, 169, 169))));
		panelLivingArea.setBackground(new Color(245, 255, 250));
		panelLivingArea.setBounds(327, 134, 335, 314);
		add(panelLivingArea);
		panelLivingArea.setLayout(null);
		
		 lblLivingArea = new JLabel("Living Area");
		lblLivingArea.setFont(new Font("Heiti TC", Font.PLAIN, 14));
		lblLivingArea.setBounds(127, 130, 107, 26);
		panelLivingArea.add(lblLivingArea);
		
		 panelFireLivingArea = new JPanel();
		panelFireLivingArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(220, 20, 60)));
		panelFireLivingArea.setBounds(47, 229, 10, 10);
		panelLivingArea.add(panelFireLivingArea);
		
		panelIntrusionLiving = new JPanel();
		panelIntrusionLiving.setBackground(new Color(192, 192, 192));
		panelIntrusionLiving.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(47, 79, 79)));
		panelIntrusionLiving.setBounds(266, 229, 10, 10);
		panelLivingArea.add(panelIntrusionLiving);
		
		JLabel lblFireSensor = new JLabel("Fire Sensor");
		lblFireSensor.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		lblFireSensor.setBounds(29, 256, 84, 16);
		panelLivingArea.add(lblFireSensor);
		
		JLabel lblIntrusionSensor = new JLabel("Intrusion Sensor");
		lblIntrusionSensor.setFont(new Font("Heiti TC", Font.PLAIN, 13));
		lblIntrusionSensor.setBounds(210, 256, 119, 16);
		panelLivingArea.add(lblIntrusionSensor);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(445, 518, 117, 29);
		add(btnBack);
		
	}
}