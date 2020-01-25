package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String []args) 
	{
	 int a=0,sum=0,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter a=",+a);
		a=sc.nextInt();
 
		 for(int i=1;i<=a;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+a+" is: "+fact);    
		 }  
}