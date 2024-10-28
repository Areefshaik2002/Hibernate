package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int id;
	private String h_no;
	private String street;
	private String city;
	private String pincode;
	private String state;
	
	public Address() {}

	public Address(int id, String h_no, String street, String city, String pincode, String state) {
		super();
		this.id = id;
		this.h_no = h_no;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getH_no() {
		return h_no;
	}

	public void setH_no(String h_no) {
		this.h_no = h_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", h_no=" + h_no + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}

	
	
	
}
