package aa;

public class StringDemo4
{
   public static void main(String []args)
   {
	   StringBuffer sb=new StringBuffer();
	   sb.append("welcome to java");
	   sb.ensureCapacity(100);
		   System.out.println(sb.capacity());
	   
   }
}             