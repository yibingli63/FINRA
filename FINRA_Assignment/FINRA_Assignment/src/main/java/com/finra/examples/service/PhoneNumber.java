package com.finra.examples.service;

/*
 * 
 * @author yli
 *
 */

public class PhoneNumber {
	
	public PhoneNumber(int id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	private int id;
	private String number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
