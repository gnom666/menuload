package com.bbva.emag.batch.model;

import java.util.List;

public class Operation {
	
	String shortName;
	String longName;
	String url;
	List <String> params;
	
	
	public String getLongName() {
		return longName;
	}
	
	public List<String> getParams() {
		return params;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setLongName(String longName) {
		this.longName = longName;
	}
	
	public void setParams(List<String> params) {
		this.params = params;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
}
