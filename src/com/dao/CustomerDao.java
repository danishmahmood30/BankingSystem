package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.util.DbConnection;

public class CustomerDao {
	public static int customerid=0;
	public int addCustomer(Customer customer) {
		int x=0;
		Connection con = DbConnection.getConnection();
		String sql = "insert into customer values(?,null,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customer.getCustomerSsnId());
			ps.setString(2, customer.getCustomerName());
			ps.setInt(3, customer.getAge());
			ps.setString(4, customer.getAddress());
			ps.setString(5, customer.getState());
			ps.setString(6, customer.getCity());
			x= ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return x;
	}
	
	public Customer viewCustomer(int ssnId) {
		Customer c = new Customer();
		Connection con = DbConnection.getConnection();
		String sql = "select * from customer where ssnid=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, ssnId);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				c.setCustomerSsnId(rs.getInt(1));
				c.setCustomerId(rs.getInt(2));
				c.setCustomerName(rs.getString(3));
				c.setAge(rs.getInt(4));
				c.setAddress(rs.getString(5));
				c.setState(rs.getString(6));
				c.setCity(rs.getString(7));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	
	}
	
	public Customer viewCustomer(int ssnId, boolean update) {
		System.out.println(customerid);
		this.customerid=ssnId;
		Customer c= this.viewCustomer(ssnId);
		return c;
	}
	
	public ArrayList<Customer> viewAll() {
		
		ArrayList<Customer> clist = new ArrayList<Customer>();
		Connection con = DbConnection.getConnection();
		String sql = "select * from customer";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Customer c = new Customer();
				c.setCustomerSsnId(rs.getInt(1));
				c.setCustomerId(rs.getInt(2));
				c.setCustomerName(rs.getString(3));
				c.setAge(rs.getInt(4));
				c.setAddress(rs.getString(5));
				c.setState(rs.getString(6));
				c.setCity(rs.getString(7));
				clist.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return clist;
	
	}
	
	public int updateCustomer(Customer customer) {
		int age, x=0;
		String name,address;
		Customer cus = this.viewCustomer(customerid);
		Connection con = DbConnection.getConnection();
		String sql = "update customer set name=?, age=?, address=? where ssnid=?";
		
		if(customer.getCustomerName()==null) {
			name=cus.getCustomerName();
		}else {
			name=customer.getCustomerName();
		}
		if(customer.getAge()==0) {
			age=cus.getAge();
		}else {
			age=customer.getAge();
		}
		if(customer.getAddress()==null) {
			address=cus.getAddress();
		}else {
			address=customer.getAddress();
		}
		PreparedStatement ps;
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, address);
			ps.setInt(4, customerid);
			x=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
	
	public int deleteCustomer(int ssnId) {
		int x=0;
		Connection con = DbConnection.getConnection();
		String sql = "delete from customer where ssnid=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, ssnId);
			x=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
}
