package com.cts.training.thread;

import javax.annotation.Resource;

import com.cts.training.thread.FirstThread.SecondThread;

public class ThreadDemo2 {

	public static void main(String args[]) {
		Resource resource =new Resource();
		
		FirstThread firstthread=new FirstThread(resource);
		SecondThread secondthread=new SecondThread(resource);
		Thread threadone=new Thread(firstthread);
		Thread threadtwo=new Thread(secondthread);
		
	
		threadone.start();
		threadtwo.start();
		
	}

}
class FirstThread implements Runnable{
	Resource resource;{
		this.resource();
	}
 public void run(){
 {
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println("First Thread;"+i);
		 try
		 {
			 Thread.sleep(2000);
		 }
			 catch(InterruptedException e)
			 {
			
			 e.printStackTrace();
			 }
 }
	
}

}
class SecondThread implements Runnable{
Resource resource;
public SecondThread(Resource resource){
	this.resource=resource;
}
	public  void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("second thread"+i);
				 try
				 {
					 Thread.sleep(2000);
				 }
					 catch(InterruptedException e)
					 {
					
					 e.printStackTrace();
				
			}
		}
	}
}
}

 class Resource{
	 public void display(String message) {
		 for(int i=1;1<=5;i++)
			 System.out.println(message+" "+i);
	 }
 
 
		// TODO Auto-generated method stub
		
	}
}
 