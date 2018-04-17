package model;

import java.io.Serializable;

public class AreaType implements Serializable {
	
	private String name;
	private boolean isSelected;
	private boolean isInstalled;
	
	public boolean isInstalled() {
		return isInstalled;
	}
	public void setInstalled(boolean isInstalled) {
		this.isInstalled = isInstalled;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
			

}
