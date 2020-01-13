package aa;
import java.util.Scanner;
public class One {
	    public static void  main(String []args)
	    {
	        int  n=1, count=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        n = s.nextInt();
	        while(n < 12)
	        {
	           if(n==1)
	           {
	            count++;
	        }
	        System.out.println("nymber of ones"+count);
	    }
	}

}

