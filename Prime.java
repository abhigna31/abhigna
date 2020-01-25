package practice;

import java.util.Scanner;

public class Prime {
	public static void main(String args[])
    {
        int a, i, count=0,b;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a Number : "+a);
        a = sc.nextInt();
       
        for(i=2; i<a; i++)
        {
            if(a%i == 0)
        
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }

}
