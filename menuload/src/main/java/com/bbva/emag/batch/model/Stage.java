package com.bbva.emag.batch.model;

import java.util.List;

public class Stage {

	String shortName;
	String longName;
	List <Menu> menus;

	public String getLongName() {
		return longName;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public String getShortName() {
		return shortName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
}
