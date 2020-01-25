package practice;

import java.util.Scanner;

public class Swap {
	public static void main(String []args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("a ="+a);
		b=sc.nextInt();
		System.out.println("b ="+b);
		
		a = a + b; 
	    b = a - b; 
	    a = a- b;
	    
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
