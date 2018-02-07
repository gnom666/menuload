package com.bbva.emag.batch.model;

public class Preference {
	
	String language;
	String country;
	long notificationTime;
	
	
	public String getCountry() {
		return country;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public long getNotificationTime() {
		return notificationTime;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void setNotificationTime(long notificationTime) {
		this.notificationTime = notificationTime;
	}
		
}
