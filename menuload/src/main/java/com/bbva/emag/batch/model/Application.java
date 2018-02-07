package com.bbva.emag.batch.model;

import java.util.List;

public class Application {

	String shortName;
	String longName;
	List <Stage> stages;

	public String getLongName() {
		return longName;
	}

	public String getShortName() {
		return shortName;
	}

	public List<Stage> getStages() {
		return stages;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}

}
