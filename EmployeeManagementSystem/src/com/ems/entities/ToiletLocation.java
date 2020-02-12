package com.ems.entities;

public class ToiletLocation {
	
	private String plot;
	private String locality;
	private String district;
	private String state;
	
	private String landmark;
	private String longitude;
	private String latitude;
	private String wardNo;
	private String wardName;
	private String municipalBoard;
	
	public ToiletLocation() {	}

	public ToiletLocation(String plot, String locality, String district, String state, String landmark,
			String longitude, String latitude, String wardNo, String wardName, String municipalBoard) {
		super();
		this.plot = plot;
		this.locality = locality;
		this.district = district;
		this.state = state;
		this.landmark = landmark;
		this.longitude = longitude;
		this.latitude = latitude;
		this.wardNo = wardNo;
		this.wardName = wardName;
		this.municipalBoard = municipalBoard;
	}

	public String getPlot() {	return plot;	}

	public void setPlot(String plot) {	this.plot = plot;	}

	public String getLocality() {	return locality;	}

	public void setLocality(String locality) {	this.locality = locality;	}

	public String getDistrict() {	return district;	}

	public void setDistrict(String district) {	this.district = district;	}

	public String getState() {	return state;	}

	public void setState(String state) {
		this.state = state;
	}

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public String getMunicipalBoard() {
		return municipalBoard;
	}

	public void setMunicipalBoard(String municipalBoard) {
		this.municipalBoard = municipalBoard;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
