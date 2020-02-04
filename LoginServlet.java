package com.cts.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;


public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Connection conn;
	    String url="jdbc:mysql://localhost:3306/app";
		String username="root";
		String password="admin";
		String query="select * from user2";
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		java.sql.Statement stmt=null;

		RequestDispatcher rd = request.getRequestDispatcher("test.html");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url,username,password);
		stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(query);
	
		
		
		while(rs.next())
		{
			String a=rs.getString(2);
			String b=rs.getString(3);
			if(a==username && b==password) {
			rd.forward(request, response);	
			}
		
		else 
		{
			System.out.print("wrong password");
		}
		}
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}


