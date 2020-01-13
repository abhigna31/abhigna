package com.cts.activity.main;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class EmployeeMain {
	public static void main(String []args) throws ClassNotFoundException,SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("age");
		String age=sc.nextLine();
		System.out.println("phone");
		int phone=Integer.parseInt(sc.nextLine());
		System.out.println("dept");
		String dept=sc.nextLine();
		System.out.println("location");
		String location=sc.nextLine();
		System.out.println("sal");
		int sal=Integer.parseInt(sc.nextLine());
		
		

	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/cts";
	String username="root";
	String password="admin";
	
	
	Connection conn=DriverManager.getConnection(url,username,password);
	//Statement stmt= conn.createStatement();
	//String query="insert into employee values(103,'ABHI',22,1284784,'cse','chennai',500000)";
	//String query="delete from employee  where empid=103";
	
//	int result=stmt.executeUpdate(query);
	//if(result>0)
	//{
	//	System.out.println("data updated successfully");
	//}
	//System.out.println("connection established");
	
//	String query="select * from employee";
	//ResultSet rs=stmt.executeQuery(query);
	//while (rs.next())
//
	//{
		//System.out.println(rs.getInt(1)+ " :"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getString(4));
		//}
	//}

//}
	String query="insert into employee values(?,?,?,?,?,?,?)";
    PreparedStatement ps=conn.prepareStatement(query);
	ps.setInt(1,id);
	ps.setString(2,name);
	ps.setString(3,age);
	ps.setInt(4,phone);
	ps.setString(5,dept);
	ps.setString(6,location);
	ps.setInt(7,sal);
	
	
	
	int result=ps.executeUpdate();
	if(result>0)
	{
		System.out.println("data inserted successfully");
	}
		else
		{
			System.out.println("try again");
		
		}
		}
	}




