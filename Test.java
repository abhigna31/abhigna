package aa;
import java.util.Scanner;
import java.util.*;
public class Test {
public static void main(String[] args) {	
	int x;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
    switch(x)
    {
      case 1 :Student s=new Student();
               s.getData();
               s.display();
               break;
      case 2 :Employee e=new Employee();
                 e.getData();
                 e.display();
                 break;
               
    }
}
}

class Student
{
 String firstname;
 String lastname;
 int age;
 String course;
 int stuid;
 public void getData()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("firstname");
	 firstname=sc.nextLine();
	 System.out.println("lastname");
	 lastname=sc.nextLine();
	 System.out.println("age");
	 age=sc.nextInt();
	 System.out.println("course");
	 course=sc.nextLine();
	 System.out.println("stuid");
	 stuid=sc.nextInt();	
 }
 public void display() {
 System.out.println("firstname"+firstname);
 System.out.println("lastname"+lastname);
 System.out.println("age"+age);
 System.out.println("course"+course);
 System.out.println("stuid"+stuid);
 }
}
class Employee
{
	String firstname;
	 String lastname;
	 int age;
	 int sal;
	 String dept;
	 String desig;
	 int empid;
public void getData()
{ 
	Scanner sc=new Scanner(System.in);
	 System.out.println("firstname");
	 firstname=sc.nextLine();
	 System.out.println("lastname");
	 lastname=sc.nextLine();
	 System.out.println("age");
	 age=sc.nextInt();
	 System.out.println("sal");
	 sal=sc.nextInt();
	 System.out.println("dept");
	 dept=sc.nextLine();
	 System.out.println(desig);
	 desig=sc.nextLine();
}
public void display()
{
	 System.out.println("firstname");
	 System.out.println("lastname");
	 System.out.println("age");
	 System.out.println("sal");
	 System.out.println("dept");
	 System.out.println("desig");
	
}
}
}
