package practice;

import java.util.Scanner;

public class Largestnumber {
	 public static void main(String[] args) {
		 int a,b,c;
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("a ="+a);
			b=sc.nextInt();
			System.out.println("b ="+b);
			c=sc.nextInt();
			System.out.println("c ="+c);
	        if(a >= b) {
	            if(a >= c)
	                System.out.println(a + " is the largest number.");
	            else
	                System.out.println(c + " is the largest number.");
	        } else {
	            if(b >= c)
	                System.out.println(b + " is the largest number.");
	            else
	                System.out.println(c + " is the largest number.");
	        }
	    }
	}



