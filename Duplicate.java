package aa;
import java.util.*;
class Duplicate
{
public static void main(String [] args)
{
int a[],x,i,b[],count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of a ");
System.out.println("enter the size of b ");
x=sc.nextInt();
a=new int[x];
b=new int[x];
System.out.println("enter the elements of a");
System.out.println("enter the elements of b");
for(i=0;i<x;i++)
{
a[i]=sc.nextInt();
b[i]=sc.nextInt();
}
for(i=0;i<x;i++)
if(b[i]==a[i])
{
	count++;
}
System.out.println(count);
}
}