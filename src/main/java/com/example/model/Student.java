package com.example.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String studentId;
	private String firstName;
	private String lastName;
	private String gmail;
	
	
	
	public String getstudentId() {
		return studentId;
	}

	public void setId(String studentId) {
		this.studentId = studentId;
	}

	public Student() {
		super();
	}

	public Student(String studentId, String firstName, String lastName, String gmail) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getgmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
}
