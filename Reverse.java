package aa;
import java.util.*;
class Reverse
{
public static void main(String [] args)
{
int a[],x,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
x=sc.nextInt();
a=new int[x];
System.out.println("enter the elements");
for(i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
for(i=x-1;i>=0;i--)
{
System.out.println(a[i]);
}
}
}