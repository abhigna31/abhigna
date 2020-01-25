package practice;

import java.util.Scanner;

public class Div {
	public static void main(String[]args)
	{
		int num1,num2,quo=0,rem=0;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("a ="+num1);
		num2=sc.nextInt();
		System.out.println("b ="+num2);
		
		
		if(num1>num2) 
			
		{
			quo=num1/num2;
			rem=num1%num2;
		}
		System.out.println("quotient is="+quo);
		System.out.println("remainder is="+rem);

	}

}
