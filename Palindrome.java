package practice;

import java.util.Scanner;

public class Palindrome {
		public static void main(String []args)
		{
			
		int rev=0,temp;
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		System.out.println("a ="+a);
		
		temp=a;
		while(a>0)
		{
			int b=a%10;
			rev=rev*10+b;
			a=a/10;
	
			
		}

		System.out.println("reverse is"+rev);
		
		 if(temp==rev)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
	}
}


