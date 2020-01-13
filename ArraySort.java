
package ab;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySort {
	public static void main(String[] args) {
		ArrayList<Employee> list =new ArrayList<Employee>();
		Employee emp1=new Employee(211,"abc","Hyd",22,3654648872L,65879.98);
		Employee emp2=new Employee(221,"a","chennai",22,3654648872L,65879.98);
		Employee emp3=new Employee(241,"b","mumbai",22,3654648872L,65879.98);
		Employee emp4=new Employee(261,"ab","kolkata",22,3654648872L,65879.98);
		Employee emp5=new Employee(271,"bc","Bangalore",22,3654648872L,65879.98);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		SortById sbi=new SortById();
		
		Collections.sort(list,sbi);
		Collections.sort(list,new SortByName());
		
		for(Employee employee: list)
		{
		System.out.println(employee);
	}
	}
}
