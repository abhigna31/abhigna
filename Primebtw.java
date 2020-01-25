package practice;

import java.util.Scanner;

public class Primebtw {
	public static void main(String []args)
	{
		


     Scanner sc = new Scanner(System.in);
      int  a = sc.nextInt();
      System.out.print("Enter a Number : "+a);
     while(a!=2)
     for( int i=2; i<a; i++)
     {
         if(a%i == 0)
         	a--;
     }
        	 System.out.println("print prime numbers:"+a);
            
	}
}