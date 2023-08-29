package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer employeeID;
	private String firstname;
	private String lastname;
	private Integer salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer employeeID, String firstname, String lastname, Integer salary) {
		super();
		this.employeeID = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
