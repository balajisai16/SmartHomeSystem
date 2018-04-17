package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import model.GloabalVariables;
import model.SelectedArea;
import view.ConfigView;
import view.ControlPanelView;

public class ConfigControl {
	
	SelectedArea selectedArea;
	ConfigView view1;
	String selected;
	boolean fireSensor = false;
	boolean intrusion = false;
	
	public ConfigControl(SelectedArea s, ConfigView v) {
		
		selectedArea = s;
		view1 = v;
		initController();
		
	}

	private void initController() {
		
		selectedItem();
		slectedSensor();
		view1.getBtnAddInfo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				selectedArea.onAddClicked(selected , fireSensor , intrusion);
			}
		});
		view1.getBtnDone().addActionListener(e->done());
	}

	private void done() {
		
		view1.setVisible(false);
		
		ControlPanelView controlView = new ControlPanelView();
		GloabalVariables.container.add(controlView);
		ControlPanel cc  = new ControlPanel(controlView, selectedArea);
		
	}

	private void slectedSensor() {
		
		view1.getChckbxFireDetectionSensor().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fireSensor = view1.getChckbxFireDetectionSensor().isSelected();
				System.out.println("fire sensor is selected"+ fireSensor);
			}
		});
		
		view1.getChckbxIntrusionDetectionSensor().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				intrusion = view1.getChckbxIntrusionDetectionSensor().isSelected();
				
				System.out.println("intrusion sensor is selected " + intrusion);
			}
		});
		
		//intrusion = view1.getChckbxIntrusionDetectionSensor().isSelected();	
		
	}

	private void selectedItem() {
		
		
		view1.getComboBox().setSelectedItem(1);
		view1.getComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComboBox cb = (JComboBox) e.getSource();
				selected = (String) cb.getSelectedItem();
				System.out.println("selected " + selected);
			}
		});
		
		
	}
	
    

}
