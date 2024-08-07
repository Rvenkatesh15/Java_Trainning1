package com.org.
model;

public class Address {
	
	private String addLine;
	private String city;
	private String state;
	private String zipCode;
	public Address(String addLine, String city, String state, String zipCode) {
		super();
		this.addLine = addLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getAddLine() {
		return addLine;
	}
	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

}
