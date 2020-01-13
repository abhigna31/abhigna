package aa;

public class Overriding {
            public static void main(String[]args)
            {
            	Test employee=new Man();
            	employee.display();
            }
}
class Student
{ 
	public void display()
	{
		System.out.println("Employee class");
	}
}
class Man extends Test
{
	public void display()
{
		System.out.println("Manager class");
}
}