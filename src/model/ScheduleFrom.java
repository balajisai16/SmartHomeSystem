package model;

import java.io.Serializable;
import java.util.TimerTask;

public class ScheduleFrom extends TimerTask implements Serializable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ScheduleFrom timer");
		
		SelectedArea selectedAreaTemp;
		
		System.out.println("selected "+GloabalVariables.selectedSchedule);
		selectedAreaTemp = GloabalVariables.selectedAreaG.selectedMap.get(GloabalVariables.selectedSchedule);
		selectedAreaTemp.areaType.setSelected(true);
		selectedAreaTemp.fireSensor.setStatus(true);
		selectedAreaTemp.intrusionSensor.setStatus(true);
		GloabalVariables.gContG.showActiveSensors();
	}

}
