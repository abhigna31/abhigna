package practice;

import java.util.Scanner;

public class Naturalnumbersum {
	public static void main (String []args)
	{
  int a=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.printf("enter a=",+a);
	a=sc.nextInt();
    for(int i = 1; i <= a; ++i)
    {
     
        sum=sum+i;
    }

    System.out.println("Sum = " + sum);
}

	
}
