package aa;

public class Cons {
	public static void main(String []args)
	{
	B b=new B(); 	
	}

}
class A
{
	A()
	{
		super();
		System.out.println("1");
	}
  A(int a)
  { 
	this();
	  System.out.println("2");
}
  {
	  System.out.println("3");
}
}
  class B extends A
  {
	  B()
	  {
		  super(10);
		  System.out.println("4");
		  
	  }

  {
	  System.out.println("5");
  }
}
  