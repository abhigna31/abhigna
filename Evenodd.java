package practice;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[]args)
	{
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter a",+a);
		a=sc.nextInt();
		
		if(a%2==0) 
		
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
