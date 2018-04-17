package model;

import java.io.Serializable;

public class IntrusionSensor extends Sensor implements Serializable{
	
	double relativeMotion;
	boolean isInstalled;
	
	

	public boolean isInstalled() {
		return isInstalled;
	}

	public void setInstalled(boolean isInstalled) {
		this.isInstalled = isInstalled;
	}

	public double getRelativeMotion() {
		return relativeMotion;
	}

	public void setRelativeMotion(double relativeMotion) {
		this.relativeMotion = relativeMotion;
	}
	
	

}
