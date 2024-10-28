package com.sample;

public class Customer {
	private long id;
	private String name;
	private String aadhar;
	private String pan;
	private int age;
	
	public Customer() {}

	public Customer(long id, String name, String aadhar, String pan, int age) {
		super();
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
		this.pan = pan;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return id+" " + name + " " + aadhar +" "+ pan +" "+age +" ";
	}
	
	
}
