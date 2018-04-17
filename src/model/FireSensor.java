package model;

import java.io.Serializable;

public class FireSensor extends Sensor implements Serializable{
	
	double temperature;
	boolean isInstalled;

	public boolean isInstalled() {
		return isInstalled;
	}

	public void setInstalled(boolean isInstalled) {
		this.isInstalled = isInstalled;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	

}
