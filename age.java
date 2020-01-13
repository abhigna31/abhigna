package aa;
import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int x;
		    System.out.println("Enter x");
		    Scanner sc = new Scanner(System.in);

		    x = sc.nextInt();
		    
		    if (x<=12)
		     {
		      System.out.println("children");
		      }
		     else if (x>13 && x<=19)
		    {
		      System.out.println("Teenagers");
		      }
		    else if (x>20 && x<=35)
		   {
		      System.out.println("young adults");
		    }
		     else if(x>36 && x<=45)
		   {
		      System.out.println("mature adults");
		    }
		   else 
		      System.out.println("seniors");
		  }
		}

