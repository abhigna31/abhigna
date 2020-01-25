package practice;

import java.util.Scanner;

public class Nzp {
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
            System.out.print("Input a: ");
            int a = sc.nextInt();
            
            
	        if (a < 0)
	            System.out.println(a + " is a negative number.");
	        
	        
	      
	        else if ( a > 0.0)
	            System.out.println(a + " is a positive number.");
	        
	        
	        
	        else
	            System.out.println(a + " is 0.");
	    }
	}


