package aa;

import java.util.Scanner;

public class InheritanceDemo {
	public static void main(String args[])
	{
		Employee emp=new Employee();
		Developer dev=new Developer();
		emp.getData();
		emp.display();
		dev.projectname="ticket booking";
		dev.domain="cloudcomputing";
	System.out.println("project name is:"+dev.projectname);
	System.out.println("domain"+dev.domain);
	abhi obj=new abhi();
	obj.behaviour="good";
	System.out.println("behaviour is:"+obj.behaviour);
	}
}
class Employee
		{
			int id;
			String name;
		    String dept;
		    public void display()
		    {
		    	System.out.println(id+ ":" +name+ ":" +dept);
		    }
		     public void getData()
		     {
		    	 Scanner sc=new Scanner(System.in);
		    	 System.out.println("Enter id");
		    	 id=Integer.parseInt(sc.nextLine());
		    	 System.out.println("Enter name");
		    	 name=sc.nextLine();
		    	 System.out.println("Enter dept");
		    	 dept=sc.nextLine();
		    }
		}
class Manager extends Employee
	{
			
		}
class Developer extends Employee
{
	String projectname;
	String domain;
}
class abhi extends Employee
{ 
	String behaviour;
}
