package com.ems.entities;

import java.util.Date;

public class EmployeeInfo {
	
	private String empID;
	private String empName;
	private String toiletID;
	private Address workLocation;
	private String designation;
	private String shift;
	private Date doj;		//	D.O.J (Date of Joining)
	private Date dol;		//	D.O.L (Date of Leaving)
	private double salary;
	
	public EmployeeInfo() {		}

	public EmployeeInfo(String empID, String empName, String toiletID, Address workLocation, String designation,
			String shift, Date doj, Date dol, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.toiletID = toiletID;
		this.workLocation = workLocation;
		this.designation = designation;
		this.shift = shift;
		this.doj = doj;
		this.dol = dol;
		this.salary = salary;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getToiletID() {
		return toiletID;
	}

	public void setToiletID(String toiletID) {
		this.toiletID = toiletID;
	}

	public Address getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDol() {
		return dol;
	}

	public void setDol(Date dol) {
		this.dol = dol;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empID=" + empID + ", empName=" + empName + ", toiletID=" + toiletID + ", workLocation="
				+ workLocation + ", designation=" + designation + ", shift=" + shift + ", doj=" + doj + ", dol=" + dol
				+ ", salary=" + salary + "]";
	}
}
