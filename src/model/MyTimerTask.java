package model;

import java.io.Serializable;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask implements Serializable{

	@Override
	public void run() {

		SelectedArea selectedAreaTemp;
		
		System.out.println("selected "+GloabalVariables.selectedSchedule);
		selectedAreaTemp = GloabalVariables.selectedAreaG.selectedMap.get(GloabalVariables.selectedSchedule);
		selectedAreaTemp.areaType.setSelected(false);
		selectedAreaTemp.fireSensor.setStatus(false);
		selectedAreaTemp.intrusionSensor.setStatus(false);
		GloabalVariables.gContG.showActiveSensors();
		
		System.out.println("Intrusion Detection");
	}

}
