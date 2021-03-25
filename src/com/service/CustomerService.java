package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.*;
import com.bean.*;

public class CustomerService {
	
	public int createCustomer(Customer customer) {
		CustomerDao cd = new CustomerDao();
		int x=cd.addCustomer(customer);
		return x;
	}
	
	public Customer viewCustomer(int ssnId) {
		CustomerDao cd =new CustomerDao();
		Customer c = cd.viewCustomer(ssnId);
		return c;
	}
	
	public Customer viewCustomer(int ssnId, boolean update) {
		CustomerDao cd =new CustomerDao();
		Customer c = cd.viewCustomer(ssnId,update);
		return c;
	}
	
	public ArrayList<Customer> viewAll() {
		CustomerDao cd = new CustomerDao();
		ArrayList<Customer> clist = cd.viewAll();
		return clist;
	}
	
	public int updateCustomer(Customer customer) throws SQLException {
		CustomerDao cd = new CustomerDao();
		return cd.updateCustomer(customer);
	}
	
	public Customer deleteCustomer(int ssnId) {
		Customer x=this.viewCustomer(ssnId);
		return x;
	}
	
	public int deleteCustomer(int ssnId, boolean confirmed) {
		CustomerDao cd = new CustomerDao();
		int x= cd.deleteCustomer(ssnId);
		return x;
	}
}
