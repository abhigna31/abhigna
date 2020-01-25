package practice;

import java.util.Scanner;

public class Checkingalphabet {
		    public static void main(String[] args) {
		    	char ch;
				Scanner sc=new Scanner(System.in);
				ch=sc.next().charAt(0);
				if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		      
		            System.out.println(ch + " is alphabet");
		        else
		            System.out.println(ch + " not an alphabet");
		    }
		}

	





































