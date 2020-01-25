package practice;

import java.util.Scanner;

public class GCD {
		public static void main(String[] args) 
		{
			int a, b, GCD = 0;
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("a ="+a);
			b=sc.nextInt();
			System.out.println("b ="+b);
			
			for( int i = 1; i <= a && i <= b; i++)
		    {
		        if(a % i == 0 && b % i == 0)
		        {
		            GCD = i;
		        }
		    }	
			System.out.println("\n GCD of " + a + " and " + b + "  =  " + GCD);
		
	}

}
