package com.bbva.emag.batch.model;

import java.util.List;

public class Menu {

	String shortName;
	String longName;
	String url;
	List <String> params;
	List <Menu> menus;
	List <Operation> operations;
	
	
	public String getLongName() {
		return longName;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public List<Operation> getOperations() {
		return operations;
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
	
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
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
