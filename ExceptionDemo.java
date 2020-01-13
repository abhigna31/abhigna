package ab;
	
public class ExceptionDemo {
	public static void logic(String arg) throws ArithmeticException
	{
		
	System.out.println("begin");
	int a=Integer.parseInt(arg);
	System.out.println("got value from user");
	if(a==10)
	{
		throw new ArithmeticException();
	}
	int b=10/(10-a);
	System.out.println("b="+b);
	String name="aniket";
	name=null;
	System.out.println("height="+name.length());
	System.out.println("stop");
}

public static void main(String []args) {
	try {
		logic(args[0]);
}
catch(NumberFormatException|ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException ex)
{
	System.out.println("provide number at runtime");
	System.out.println("");
}
}
}
