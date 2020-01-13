package ab;
import java.util.Scanner;
public class Chaining
{
	public boolean is ValidUser(String name)throws InvalidUser
	{
		(!name.equals("admin"))
		{
			throw new InvalidUser();
			return false;
		}
	}
public static void main(String [] args)
{
	try {
		
	isValidUser("abhi");
        }
catch(InvalidUser ex)
{
	System.out.println(ex.Invalid());
     }
   }
}
class InvaliUser
{
	InvalidUser()
	{
		InvalidUser(String message)
		{
			System.out.println("Invalid user");
		}
		public String invalid()
		{
			return "string invalid";
		}
	}
I
		}
	}
}
