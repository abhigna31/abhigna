package practice;

import java.util.Scanner;

public class Countdigits {
	public static void main(String [] args)
	{
		int a,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		
		while(a>0)
        {
            a =a/10;
           
           count++;
           
          
        }
	{
	System.out.println("number of digits="+count);

}
}
}