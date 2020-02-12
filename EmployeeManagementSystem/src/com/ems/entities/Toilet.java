package com.ems.entities;

import java.util.ArrayList;
import java.util.List;

public class Toilet {
	
	private String toiletID;
	private String toiletType;
	private List<EmployeeInfo> deployedEmployee = new ArrayList<>();
	private ToiletLocation location;

	
	public Toilet() {	}

	public Toilet(String toiletID, String toiletType, ToiletLocation location, List<EmployeeInfo> deployedEmployee) {
		super();
		this.toiletID = toiletID;
		this.toiletType = toiletType;
		this.location = location;
		this.deployedEmployee = deployedEmployee;
	}

	public String getToiletID() {
		return toiletID;
	}

	public void setToiletID(String toiletID) {
		this.toiletID = toiletID;
	}

	public String getToiletType() {
		return toiletType;
	}

	public void setToiletType(String toiletType) {
		this.toiletType = toiletType;
	}

	public ToiletLocation getLocation() {
		return location;
	}

	public void setLocation(ToiletLocation location) {
		this.location = location;
	}

	public List<EmployeeInfo> getDeployedEmployee() {
		return deployedEmployee;
	}

	public void setDeployedEmployee(List<EmployeeInfo> deployedEmployee) {
		this.deployedEmployee = deployedEmployee;
	}
	
	@Override
	public String toString() {
		return "Toilet [toiletID=" + toiletID + ", toiletType=" + toiletType + ", location=" + location
				+ ", deployedEmployee=" + deployedEmployee + "]";
	}
}
