package aa;
import java.util.*;
class Minma
{
public static void main(String [] args)
{
int a[],x,i,max,min;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
x=sc.nextInt();
a=new int[x];
System.out.println("enter the elements");
for(i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
max=a[0];
min=a[0];
for(i=1;i>=0;i--)
{
	if(a[i]>a[i-1])
	{
        max=a[i];
	}
	if(a[i]<a[i-1]);
	{
	     min=a[i];
	}
System.out.println(max);
System.out.println(min);
}
}
}
