package com.ems.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToiletProfile {

	private Toilet toilet;
	private int feedbackDataSize;
	private List<EvaluatedUserFeedbacks> list = new ArrayList<EvaluatedUserFeedbacks>();
	private Date dateAndTime;
	private String status;
	private String databaseAPI;
	
	
	public ToiletProfile() {	}

	public ToiletProfile(Toilet toilet, int feedbackDataSize, List<EvaluatedUserFeedbacks> list, Date dateAndTime,
			String status, String databaseAPI) {
		super();
		this.toilet = toilet;
		this.feedbackDataSize = feedbackDataSize;
		this.list = list;
		this.dateAndTime = dateAndTime;
		this.status = status;
		this.databaseAPI = databaseAPI;
	}



	public Toilet getToilet() {
		return toilet;
	}
	public void setToilet(Toilet toilet) {
		this.toilet = toilet;
	}
	public int getFeedbackDataSize() {
		return feedbackDataSize;
	}
	public void setFeedbackDataSize(int feedbackDataSize) {
		this.feedbackDataSize = feedbackDataSize;
	}
	public List<EvaluatedUserFeedbacks> getList() {
		return list;
	}
	public void setList(List<EvaluatedUserFeedbacks> list) {
		this.list = list;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDatabaseAPI() {
		return databaseAPI;
	}
	public void setDatabaseAPI(String databaseAPI) {
		this.databaseAPI = databaseAPI;
	}

	@Override
	public String toString() {
		return "ToiletProfile [toilet=" + toilet + ", feedbackDataSize=" + feedbackDataSize + ", list=" + list
				+ ", dateAndTime=" + dateAndTime + ", status=" + status + ", databaseAPI=" + databaseAPI + "]";
	}	
}
