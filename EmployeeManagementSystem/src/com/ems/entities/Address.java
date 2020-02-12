package com.ems.entities;

public class Address {

	private String plot;
	private String locality;
	private String district;
	private String state;
	private String county;
	private int pinCode;
	
	public Address() {
	}

	public Address(String plot, String locality, String district, String state, String county, int pinCode) {
		super();
		this.plot = plot;
		this.locality = locality;
		this.district = district;
		this.state = state;
		this.county = county;
		this.pinCode = pinCode;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [plot=" + plot + ", locality=" + locality + ", district=" + district + ", state=" + state
				+ ", county=" + county + ", pinCode=" + pinCode + "]";
	}
}
