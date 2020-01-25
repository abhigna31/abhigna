package practice;

import java.util.Scanner;

public class Fibanocci {
	    public static void main(String[] args) {
	    	int a=0;
			Scanner sc=new Scanner(System.in);
			System.out.printf("enter a=",+a);
			a=sc.nextInt();
	        int  n1 = 0, n2 = 1,n3;
	        System.out.print("First " + a + " terms: ");
	        for (int i = 1; i <= a; ++i)
	        {
	        	n3=n1+n2;    
	        	  System.out.print(" "+n3);    
	        	  n1=n2;    
	        	  n2=n3;    
	        }
	    }
	}

