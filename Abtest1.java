package aa;

abstract class Abtest {
 abstract public void display();
 {
	 System.out.println("hello");
 }
 }
public class Abtest1
{ 
	public static void main(String[] args) {
		Abtest t=new Abtest()
				{
			//@override
			public void display()
			{
				System.out.println("good morning");
			}
			};
				t.display();
	}
}
