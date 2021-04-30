package com.app.dto;

import org.springframework.stereotype.Component;

@Component
public class RequestDTO {

	private String name;
	private String contactNumber;
	private String make;
	private int yrs;
	
	public RequestDTO() {
		// TODO Auto-generated constructor stub
	}

	public RequestDTO(String name, String contactNumber, String make, int yrs) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.make = make;
		this.yrs = yrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYrs() {
		return yrs;
	}

	public void setYrs(int yrs) {
		this.yrs = yrs;
	}

	@Override
	public String toString() {
		return "RequestDTO [name=" + name + ", contactNumber=" + contactNumber + ", make=" + make + ", yrs=" + yrs
				+ "]";
	}
	
}
