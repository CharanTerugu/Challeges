package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue
	int id;
	String name;
	String fatherName;
	String branch;
	String email;
	String phoneNo;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(int id, String name, String fatherName, String branch, String email, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.branch = branch;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
