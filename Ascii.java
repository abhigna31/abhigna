package practice;

import java.util.Scanner;

public class Ascii {
	public static void main(String args[])

	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		 System.out.println("The ASCII value of " + ch + " is: " + ch);
	        int castAscii = (int) ch;
	        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
	    }
	}


