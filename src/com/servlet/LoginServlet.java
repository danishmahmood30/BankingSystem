package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.*;
import com.dao.*;
import com.service.*;
import com.util.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
		String pass =request.getParameter("password");
		Connection con = DbConnection.getConnection();
		//ServletContext context = getServletContext();
		
		try {
			String query= "select password from testdb.login where username=? ";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				if(rs.getString(1).equals(pass)){
					System.out.println("successful login");
					RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
					rd.forward(request, response);
				}else {
					System.out.println("login failed");
					request.setAttribute("error", "*invalid credentials");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}else {
				System.out.println("login failed");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
