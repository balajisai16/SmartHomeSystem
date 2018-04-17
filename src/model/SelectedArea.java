package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.DefaultComboBoxModel;

public class SelectedArea  implements Serializable{
	
	AreaType areaType;
	FireSensor fireSensor;
	IntrusionSensor intrusionSensor;
	SelectedArea selectedArea;
	Schedule schedule;
	
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	Map<String,SelectedArea> selectedMap = new LinkedHashMap<>();
	HashMap<String, Schedule> scheduleMap = new LinkedHashMap<>();
	DefaultComboBoxModel<String> areaSelected;
	
	public DefaultComboBoxModel<String> getAreaSelected() {
		return areaSelected;
	}
	public void setAreaSelected(DefaultComboBoxModel<String> areaSelected) {
		this.areaSelected = areaSelected;
	}
	public SelectedArea getSelectedArea() {
		return selectedArea;
	}
	public void setSelectedArea(SelectedArea selectedArea) {
		this.selectedArea = selectedArea;
	}
	public Map<String, SelectedArea> getSelectedMap() {
		return selectedMap;
	}
	public void setSelectedMap(Map<String, SelectedArea> selectedMap) {
		this.selectedMap = selectedMap;
	}
	public HashMap<String, Schedule> getScheduleMap() {
		return scheduleMap;
	}
	public void setScheduleMap(HashMap<String, Schedule> scheduleMap) {
		this.scheduleMap = scheduleMap;
	}
	public FireSensor getFireSensor() {
		return fireSensor;
	}
	public void setFireSensor(FireSensor fireSensor) {
		this.fireSensor = fireSensor;
	}
	public IntrusionSensor getIntrusionSensor() {
		return intrusionSensor;
	}
	public void setIntrusionSensor(IntrusionSensor intrusionSensor) {
		this.intrusionSensor = intrusionSensor;
	}
	
	public AreaType getAreaType() {
		return areaType;
	}
	public void setAreaType(AreaType areaType) {
		this.areaType = areaType;
	}
	
	public void onAddClicked(String selected, boolean fireSensor2, boolean intrusion) {
		
		
			areaType = new AreaType();
			areaType.setName(selected);
			areaType.setSelected(true);
			areaType.setInstalled(true);
			fireSensor = new FireSensor();
			fireSensor.setTemperature(35);
			fireSensor.setStatus(fireSensor2);
			fireSensor.setInstalled(true);
			intrusionSensor = new IntrusionSensor();
			intrusionSensor.setRelativeMotion(25);
			intrusionSensor.setStatus(intrusion);
			intrusionSensor.setInstalled(true);
			Schedule schedule = new Schedule();
			selectedArea = new SelectedArea();			
			selectedArea.setAreaType(areaType);
			selectedArea.setFireSensor(fireSensor);
			selectedArea.setIntrusionSensor(intrusionSensor);
			selectedArea.setSchedule(schedule);
			selectedMap.put(selected, selectedArea);
			
		//System.out.println("Hash Map");
		GloabalVariables.logger.info(areaType.getName() + " Area added ");
		
	}
	
	public DefaultComboBoxModel<String> selectedList()
	{
		areaSelected = new DefaultComboBoxModel<>();
		for (Map.Entry<String,SelectedArea> map : selectedMap.entrySet()) {
			
			if(map.getValue().areaType.isSelected())
			{
				areaSelected.addElement(map.getKey());
			}		
		}
		
		return areaSelected;
	}
	
	public void onScheduleClicked(String selected , Date dateFrom ,Date dateTo)
	{				
//		Schedule schedule = new Schedule();
//		schedule.setDateFrom(dateFrom);
//		schedule.setDateTo(dateTo);
//		scheduleMap.put(selected, schedule);
		System.out.println("onScheduleClicked");
		//TimerTask tasknew = new MyTimerTask();
		//Timer timer = new Timer();
	//	dateFrom.setMinutes(dateFrom.getMinutes() + 1);
		//timer.schedule(tasknew , dateTo);
		Date date = new Date();
		if(dateFrom.getMinutes() > date.getMinutes())
		{
			SelectedArea selectedAreaTemp1;
			selectedAreaTemp1 = GloabalVariables.selectedAreaG.selectedMap.get(GloabalVariables.selectedSchedule);
			selectedAreaTemp1.areaType.setSelected(false);
			selectedAreaTemp1.fireSensor.setStatus(false);
			selectedAreaTemp1.intrusionSensor.setStatus(false);
		}
		
		SelectedArea selectedTempSchedule = selectedMap.get(selected);		
		selectedTempSchedule.schedule.setDateFrom(dateFrom);
		selectedTempSchedule.schedule.setDateTo(dateTo);
		TimerTask tasknew = new MyTimerTask();
		ScheduleFrom from = new ScheduleFrom();
		Timer timer = new Timer();
		timer.schedule(tasknew , dateTo);
		timer.schedule(from, dateFrom);
		
		GloabalVariables.logger.info(selected +" Scheduled" + " From " + dateFrom.toString() + " To " + dateTo.toString());
	}
	
	public void onDisableSensor(String selected)
	{
		SelectedArea selectedAreaTemp;
		selectedAreaTemp = selectedMap.get(selected);
		selectedAreaTemp.areaType.setSelected(false);
		selectedAreaTemp.fireSensor.setStatus(false);
		selectedAreaTemp.intrusionSensor.setStatus(false);
		//System.out.println();
		GloabalVariables.logger.info( selected +"Disabled");
	}
	
	public void disableAll()
	{
		for(Map.Entry<String, SelectedArea> map: selectedMap.entrySet())
		{
			SelectedArea selectedAreaTemp;
			selectedAreaTemp = selectedMap.get(map.getKey());
			selectedAreaTemp.areaType.setSelected(false);
			selectedAreaTemp.fireSensor.setStatus(false);
			selectedAreaTemp.intrusionSensor.setStatus(false);
		}
	}
	
	public boolean onFireDetected(String selected)
	{
		SelectedArea selectedAreaTemp;
		selectedAreaTemp = selectedMap.get(selected);
		if(selectedAreaTemp.fireSensor.getStatus())
		{
			selectedAreaTemp.fireSensor.setTemperature(50);
			GloabalVariables.fireDetectCount++;
			//System.out.println("fire Detected");
			GloabalVariables.logger.info("Fire Detected at " + selected);
			return true;
		}
		return false;
	}
	
	public boolean onIntrusionDetect(String selected)
	{
		SelectedArea selectedAreaTemp;
		selectedAreaTemp = selectedMap.get(selected);
		if(selectedAreaTemp.intrusionSensor.getStatus())
		{
			selectedAreaTemp.intrusionSensor.setRelativeMotion(35);
			GloabalVariables.intrusionDetectedCount++;
			//System.out.println("Intrusion Detected");
			GloabalVariables.logger.info("Intrusion Detected at " + selected);
			return true;
		}
		return false;
	}
}
