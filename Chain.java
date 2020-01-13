package ab;

public class Chain {
	public static boolean isValidUser(String name) throws InvalidUser
	{
		if(!name.equals("admin"))
		{
		throw new InvalidUser();
		
		}
		return true;
		
	}

public static void main(String []args)
{
	try
	{
	 isValidUser("Abhi");
	
} 
catch(InvalidUser ex)
    {
	System.out.println(ex.invalid());
    }
}
class InvalidUser extends Exception
{
	InvalidUser()
	{
	}
		
	InvalidUser(String message)
	{
			System.out.println("Invalid user");
	}
	public String invalid()
		{
			return "String invalid";
		}
	}
}