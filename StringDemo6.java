package aa;
import java.util.*;
public class StringDemo6 
{ 
 public static void main(String[] args) 
 { 
	 System.out.println("java 5000"); 
	 System.out.println("c 2000"); 
	 System.out.println("c++ 1000");
	 System.out.println("angular 10000"); 
	 String choice;
	 Scanner sc=new Scanner(System.in);
	 StringBuffer sb=new StringBuffer();
     choice=sc.nextLine();
     int price=0;
	 if(choice.contains("java"))
	 {
		 System.out.println("java    5000\n");
		 price=price+5000;
	 }
	 if(choice.contains("c"))
	 {
		 System.out.println("c    2000\n");
		 price=price+2000;
	 }
	 if(choice.contains("c++"))
	 {
		 System.out.println("c++    1000\n");
		 price=price+5000;
	 }
	 if(choice.contains("angular"))
	 {
		 System.out.println("angular    5000\n");
		 price=price+5000;
	 }
	 System.out.println(price);
 }
 
}
