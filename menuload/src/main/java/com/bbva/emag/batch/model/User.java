package com.bbva.emag.batch.model;

import java.util.List;

public class User {
	
	String userId;
	List <Application> applications;
	List <Operation> favoriteOperations;
	List <Operation> recentOperations;
	List <Preference> preferences;

	
	public List<Application> getApplications() {
		return applications;
	}

	public List<Operation> getFavoriteOperations() {
		return favoriteOperations;
	}

	public List<Preference> getPreferences() {
		return preferences;
	}

	public List<Operation> getRecentOperations() {
		return recentOperations;
	}

	public String getUserId() {
		return userId;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public void setFavoriteOperations(List<Operation> favoriteOperations) {
		this.favoriteOperations = favoriteOperations;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	public void setRecentOperations(List<Operation> recentOperations) {
		this.recentOperations = recentOperations;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
