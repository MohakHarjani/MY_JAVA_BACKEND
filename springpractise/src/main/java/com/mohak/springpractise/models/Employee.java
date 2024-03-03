package com.mohak.springpractise.models;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties("employee")
public class Employee {
	
	private int empId;
	private String empName;
	
	@Value("${employee.salary}")
	private double empSal;
	
	@Autowired
	List<Department> dept;
	
	Logger lg = LoggerFactory.getLogger(this.getClass());
	
	public Employee()
	{
		//.empId = dept.getDeptId();
		System.out.println("Employee default constructor called " );
		System.out.println("Employee inside default constructor = " + this);
	}
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	//=====================================================================================
	public int getEmpId() {
		System.out.println("Inside getter of empId => " + this);
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("Inside setter of empId => " + this);
		this.empId = empId;
	}

	public String getEmpName() {
		System.out.println("Inside getter of empName => " + this);
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("Inside setter of empName => " + this);
		this.empName = empName;
	}

	public double getEmpSal() {
		System.out.println("Inside getter of empSal => " + this);
		return empSal;
	}

	public void setEmpSal(double empSal) {
		System.out.println("Inside setter of empSal => " + this);
		this.empSal = empSal;
	}
	//=============================================================================================

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", department=" +  dept + "]";
	}
	
	//============================================================================================
	
	
	

}
