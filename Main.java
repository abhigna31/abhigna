package aa;

 class Outer1 {
 int x=10;
	static int y=20;
	class Inner
		{
			public void display()
			{
				System.out.println(y);
			}
		}
	}

	public class Main {
	public static void main(String[] args)
	{
		Outer1 outer  = new Outer1();
		Outer1.Inner inner=outer.new Inner();
		inner.display();
	}
}