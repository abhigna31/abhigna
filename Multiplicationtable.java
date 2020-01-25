package practice;

import java.util.Scanner;

public class Multiplicationtable {
	public static void main(String []args) 
	{
	 int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter a=",+a);
		a=sc.nextInt();
	
	
	for(int i = 1; i <= 10; ++i)
    {
        System.out.printf("%d * %d = %d \n", a, i, a * i);
    }

	}
}
