package com.bean;

public class Customer {
	private int customerSsnId;
	private int customerId;
	private String customerName;
	private int age;
	private String address;
	private String state;
	private String city;
	
	public Customer() {
		
	}
	public Customer(int customerSsnId, String customerName, int age, String address, String state, String city) {
		super();
		this.customerSsnId = customerSsnId;
		this.customerId=0;
		this.customerName = customerName;
		this.age = age;
		this.address = address;
		this.state = state;
		this.city = city;
	}

	public int getCustomerSsnId() {
		return customerSsnId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}

	public void setCustomerSsnId(int customerSsnId) {
		this.customerSsnId = customerSsnId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
