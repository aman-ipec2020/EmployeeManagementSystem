package com.ems.entities;

public class Employee {

	private String empID;
	private String empName;
	private String contact1;
	private String contact2;
	private String guardianName;
	private String bGroup;
	private String dob;
	private Address address;

	public Employee()	{	}

	public Employee(String empID, String empName, String contact1, String contact2, String guardianName, String bGroup,
			String dob, Address address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.contact1 = contact1;
		this.contact2 = contact2;
		this.guardianName = guardianName;
		this.bGroup = bGroup;
		this.dob = dob;
		this.address = address;
	}

	public String getEmpID() {	return empID;	}

	public void setEmpID(String empID) {	this.empID = empID;	}

	public String getEmpName() {	return empName;	}

	public void setEmpName(String empName) {	this.empName = empName;	}

	public String getContact1() {	return contact1;	}

	public void setContact1(String contact1) {	this.contact1 = contact1;	}

	public String getContact2() {	return contact2;	}

	public void setContact2(String contact2) {	this.contact2 = contact2;	}

	public String getGuardianName() {	return guardianName;	}

	public void setGuardianName(String guardianName) {	this.guardianName = guardianName;	}

	public String getbGroup() {	return bGroup;	}

	public void setbGroup(String bGroup) {	this.bGroup = bGroup;	}

	public String getDob() {	return dob;	}

	public void setDob(String dob) {	this.dob = dob;	}

	public Address getAddress() {	return address;	}

	public void setAddress(Address address) {	this.address = address;	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", contact1=" + contact1 + ", contact2=" + contact2
				+ ", guardianName=" + guardianName + ", bGroup=" + bGroup + ", dob=" + dob + ", address=" + address
				+ "]";
	}	
}
