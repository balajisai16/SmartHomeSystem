package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import model.SelectedArea;
import view.ControlPanelView;
import view.GraphicalLayout;

public class GraphicViewController {

	GraphicalLayout gView;
	SelectedArea selectedArea;
	ControlPanelView view;
	public GraphicViewController(GraphicalLayout gView2, SelectedArea selectedArea2 , ControlPanelView v) {

		gView = gView2;
		selectedArea = selectedArea2;
		view = v;
		initController();
	}

	private void initController() {
		// TODO Auto-generated method stub
		gView.getBtnBack().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				gView.setVisible(false);
				view.setVisible(true);
			}
		});
	}

	public void showActiveSensors() {
		for (Map.Entry<String, SelectedArea> map : selectedArea.getSelectedMap().entrySet()) {
			SelectedArea selectedAreaTemp = map.getValue();

			switch (map.getKey()) {
			case "Living Area":
				if (selectedAreaTemp.getFireSensor().getStatus()) {
					gView.getPanelFireLivingArea().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelFireLivingArea().setBackground(new Color(255, 0, 0));
				}
				if (selectedAreaTemp.getIntrusionSensor().getStatus()) {
					gView.getPanelIntrusionLiving().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelIntrusionLiving().setBackground(new Color(255, 0, 0));
				}
				System.out.println("Living Room");
				break;
			case "Drawing Room":
				if (selectedAreaTemp.getFireSensor().getStatus()) {
					gView.getPanelFireDrawingRoom().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelFireDrawingRoom().setBackground(new Color(255, 0, 0));
				}
				if (selectedAreaTemp.getIntrusionSensor().getStatus()) {
					gView.getPanelInstrusionDrawingRoom().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelInstrusionDrawingRoom().setBackground(new Color(255, 0, 0));
				}
				System.out.println("Drawing Room");
				break;
			case "Kitchen":
				if (selectedAreaTemp.getFireSensor().getStatus()) {
					gView.getPanelFireKitchen().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelFireKitchen().setBackground(new Color(255, 0, 0));
				}
				if (selectedAreaTemp.getIntrusionSensor().getStatus()) {
					gView.getPanelIntrusionKitchen().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelIntrusionKitchen().setBackground(new Color(255, 0, 0));
				}
				System.out.println("Kitchen");
				break;
			case "Master Bedroom":
				if (selectedAreaTemp.getFireSensor().getStatus()) {
					gView.getPanelFireMasterBedRoom().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelFireMasterBedRoom().setBackground(new Color(255, 0, 0));
				}
				if (selectedAreaTemp.getIntrusionSensor().getStatus()) {
					gView.getPanelIntrusionMasterBedRoom().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelIntrusionMasterBedRoom().setBackground(new Color(255, 0, 0));
				}
				System.out.println("Master Bedroom");
				break;
			case "Guest Bedroom":
				if (selectedAreaTemp.getFireSensor().getStatus()) {
					gView.getPanelFireGuestRoom().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelFireGuestRoom().setBackground(new Color(255, 0, 0));
				}
				if (selectedAreaTemp.getIntrusionSensor().getStatus()) {
					gView.getPanelIntrusionGuestRoom().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelIntrusionGuestRoom().setBackground(new Color(255, 0, 0));
				}
				System.out.println("Guest Bedroom");
				break;
			case "Backyard":
				if (selectedAreaTemp.getFireSensor().getStatus()) {
					gView.getPanelFireBackyard().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelFireBackyard().setBackground(new Color(255, 0, 0));
				}
				if (selectedAreaTemp.getIntrusionSensor().getStatus()) {
					gView.getPanelIntrusionBackyard().setBackground(new Color(0, 255, 0));
				} else {
					gView.getPanelIntrusionBackyard().setBackground(new Color(255, 0, 0));
				}
				System.out.println("Guest Bedroom");
				break;
			case "":
			}

		}

	}
	
	
	

}
