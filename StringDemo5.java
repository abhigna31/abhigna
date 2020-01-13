package aa;
import java.util.*;
public class StringDemo5 
{ 
 public static void main(String[] args) 
 { 
	 System.out.println("java 5000"); 
	 System.out.println("c 2000"); 
	 System.out.println("c++ 1000");
	 System.out.println("angular 10000"); 
	 String choice;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter no.of choices");
	 int i=sc.nextInt();
	 System.out.println("Enter the course");
	 StringBuffer sb=new StringBuffer();
     choice=sc.nextLine();
     switch(choice) 
     { 
         case "java": 
             System.out.println("java 5000"); 
             break; 
         case "c": 
             System.out.println("c 2000"); 
             break; 
         case "c++": 
             System.out.println("c++ 1000"); 
             break; 
         default: 
             System.out.println("angular 10000"); 
     } 
 } 
} 