package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Schedule implements Serializable{
	
//	String day;
//	String from;
//	String to;
//	
//	
//	public String getDay() {
//		return day;
//	}
//	public void setDay(String day) {
//		this.day = day;
//	}
//	public String getFrom() {
//		return from;
//	}
//	public void setFrom(String from) {
//		this.from = from;
//	}
//	public String getTo() {
//		return to;
//	}
//	public void setTo(String to) {
//		this.to = to;
//	}
	
	Date dateFrom;
	Date dateTo;
	
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

}
