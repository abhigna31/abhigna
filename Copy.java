package aa;
import java.util.*;
class Copy
{
public static void main(String [] args)
{
int a[],x,i,b[];
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
x=sc.nextInt();
a=new int[x];
b=new int[x];
System.out.println("enter the elements");
for(i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<x;i++)
{
b[i]=a[i];
System.out.println(b[i]);
}
}
}