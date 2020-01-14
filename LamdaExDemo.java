package com.cts.training.lamda;

public class LamdaExDemo 
{
	
	public static void main(String []args)
	{
	    Hello h=(int a,int b)->a+b;
	   System.out.println(h.add(10,20));
	}
	 
	}
interface Hello
{
	public int add(int a,int b);
}
