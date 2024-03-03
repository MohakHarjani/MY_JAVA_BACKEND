package com.mohak.springpractise.models;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private int deptId;
	private String deptName;
	private String deptLocation;
	private int empCount;
	
	public Department()
	{
		System.out.println("Inside department defult constructor => " + this);
	}
	public Department(int deptId, String deptName, String deptLocation, int empCount) {
		super();
		
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
		this.empCount = empCount;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		System.out.println("Inside setter of deptId => " + this);
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		System.out.println("Inside setter of deptName => " + this);
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		System.out.println("Inside setter of deptLocation => " + this);
		this.deptLocation = deptLocation;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		System.out.println("Inside setter of empCount => " + this);
		this.empCount = empCount;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLocation=" + deptLocation
				+ ", empCount=" + empCount + "]";
	}
	
	
	

}
