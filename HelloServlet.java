package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet{
	

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		PrintWriter out=response.getWriter();
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String remember=request.getParameter("remember me");
		
		
		
		out.println("username:"+username);
		out.println("<br>password:"+password);
		out.println("<br>email:"+email);
		out.println("<br>gender:"+gender);
		
	}
		
}
	


