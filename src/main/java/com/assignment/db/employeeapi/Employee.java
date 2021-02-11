package com.assignment.db.employeeapi;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	
	private int pincode;
	private String company;
	private String technology;
	private int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int id, int pincode, String company, String technology, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pincode = pincode;
		this.company = company;
		this.technology = technology;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
