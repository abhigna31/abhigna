package ab;
import java.util.*;

class ArrayListDemo
{
  public static void main(String [] args)
  {
     ArrayList list=new ArrayList();
	 list.add("hello");
	 list.add(2020);
	 list.add("january");
	 list.add(true);
	 list.add(1,"1st");
	 list.remove(true);
	 
	 
	 System.out.println(list.size());
	System.out.println(list);
	ArrayList names=new ArrayList();
	
	names.add("abhi");
	names.add("divya");
	names.add("tanu");
	
	//Iterator itr=list.iterator();
	//while(itr.hasNext())
	//{
		//Object obj=itr.next();
		
	//}
	 
	 for(Object data : list)
	 {
		 System.out.println(data); 
	 }
  }
}
