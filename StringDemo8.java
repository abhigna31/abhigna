package aa; 
public class StringDemo8
{
public static void main(String []args)
{
  String s=new String("Global Warming");
  String s1=new String("Global Warming");
  String s3=new String("Global Warming");
  String s4=new String("Global Warming");
  String s5=new String("Global Warming");
  String s6=new String("Global Warming");
  String s7=new String("Global Warming");
  
{
	s = s.substring(s.length() - 4);
	s1= s1.substring(4,8);
	boolean a= s3.matches("[a-zA-Z0-9]+");
	s4 = s4.substring(0,s4.length() - 4);
	s5 = s5.substring(4);
	 int b = s6.indexOf("Wa");
	 s7=s7.toUpperCase();
	
{
System.out.println("s="+s);
System.out.println("s1="+s1);
System.out.println(a);
System.out.println("s4="+s4);
System.out.println("s5="+s5);
System.out.println(b);
System.out.println(s7);
}
}
}
}