package practice;

import java.util.Scanner;

public class Power {
	public static void main(String[]args)
	{
	int a,b,c=1;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("a ="+a);
	b=sc.nextInt();
	System.out.println("b ="+b);
		while(b!=0)
		{
			 c=c*a;
		b--;
			}
		System.out.println("result="+c);
	}
}

