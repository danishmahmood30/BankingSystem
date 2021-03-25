package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer;
import com.dao.CustomerDao;
import com.service.CustomerService;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CustomerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//the response from CustomerServlet/action=viewAll came to doGet by default
		//so i had to redirect it to doPost method
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService cs = new CustomerService();
		String action= request.getParameter("action");
		String button = request.getParameter("button");
		PrintWriter pw = response.getWriter();
		System.out.println("hi");
		
		if(action!=null) {
			
			if(action.equals("submit")) {
				
				int ssnId = Integer.parseInt(request.getParameter("ssnId"));
				String customerName = request.getParameter("customer name");
				int age =Integer.parseInt(request.getParameter("age"));
				String address = request.getParameter("address");
				String state = request.getParameter("state");
				String city = request.getParameter("city");
				Customer customer = new Customer(ssnId,customerName,age,address,state,city);
				int x= cs.createCustomer(customer);
				
				if(x>0) {
					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					request.setAttribute("ssnId", ssnId);
					request.setAttribute("status", "create");
					rd.forward(request, response);
				}else {
					pw.println("<h1>Cannot Create Customer</h1>");
					RequestDispatcher rd = request.getRequestDispatcher("createCustomer.jsp");
					rd.forward(request, response);
				}
			}
			else if(action.equals("view")) {
				
				int ssnId = Integer.parseInt(request.getParameter("ssnId"));
				System.out.println("hi");
				Customer c= cs.viewCustomer(ssnId);
				RequestDispatcher rd = request.getRequestDispatcher("displayCustomer.jsp");
				request.setAttribute("customer", c);
				rd.forward(request, response);
			}
			else if(action.equals("viewAll")) {
				ArrayList<Customer> clist=cs.viewAll();
				RequestDispatcher rd = request.getRequestDispatcher("viewAll.jsp");
				request.setAttribute("customerList", clist);
				rd.forward(request, response);
			}
			else if(action.equals("update")) {
				int ssnId = Integer.parseInt(request.getParameter("ssnId"));
				Customer c= cs.viewCustomer(ssnId,true);
				RequestDispatcher rd = request.getRequestDispatcher("updateDetails.jsp");
				request.setAttribute("customer", c);
				rd.forward(request, response);
			}
			else if(action.equals("submitUpdate")) {
				int x=0,age;
				Customer c = new Customer();
				String name = request.getParameter("name");
				String age_update =request.getParameter("age");
				if(age_update.isEmpty()) {
					age=0;
				}else {
					age=Integer.parseInt(age_update);
				}
				String address = request.getParameter("address");
				System.out.println(name);
				System.out.println(age);
				System.out.println(address);
				if(!name.isEmpty()) {
					System.out.println(name);
					c.setCustomerName(name);
				}
				if(age!=0) {
					System.out.println(age);
					c.setAge(age);
				}
				if(!address.isEmpty()) {
					System.out.println(address);
					c.setAddress(address);
				}
				try {
					x=cs.updateCustomer(c);
					if(x>0) {
						System.out.println("updated successfully");
						RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
						request.setAttribute("ssnId", CustomerDao.customerid);
						request.setAttribute("status", "update");
						rd.forward(request, response);
					}else {
						System.out.println("error in update");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			else if(action.equals("delete")) {
				int ssnId = Integer.parseInt(request.getParameter("ssnId"));
				Customer customer = cs.deleteCustomer(ssnId);
				RequestDispatcher rd =request.getRequestDispatcher("confirmDelete.jsp");
				request.setAttribute("customer", customer);
				rd.forward(request, response);
			}
			else if(action.equals("confirm delete")) {
				int ssnId = Integer.parseInt(request.getParameter("ssnId"));
				int x = cs.deleteCustomer(ssnId, true);
				if(x>0) {
					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					request.setAttribute("ssnId", ssnId);
					request.setAttribute("status", "delete");
					rd.forward(request, response);
				} else {
					System.out.println("error in deleting");
				}
			}
		}
		
		if(button!=null) {
			if(button.equals("home")) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else if(button.equals("cancel")) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
		}
		
			
	}

}
