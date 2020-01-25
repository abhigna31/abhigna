package practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String []args)
	{
		
	int rev=0;
	Scanner x=new Scanner(System.in);
	int a=x.nextInt();
	System.out.println("a ="+a);
	
	
	while(a>0)
	{
		int b=a%10;
		rev=rev*10+b;
		a=a/10;
		
	}

	System.out.println("reverse is"+rev);	
}
}