package aa;

public class Area {
	public static void main(String[] args)
	{
	Shape a=new Shape();
	a.area(2,2);
}
}
class Shape
{

public void area(double a,double b)
{
	System.out.println("area"+(a*b));
}
public void area(int a,float b)
{
	System.out.println("Triarea"+(a*b)/2);
}
}