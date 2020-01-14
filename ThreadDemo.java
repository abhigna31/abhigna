package com.cts.training.thread;

public class ThreadDemo {
	public static void main(String args [])
	{
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		System.out.println("thread name:"+thread.getName());
		thread.setName("CTS thread");
		System.out.println("thread name:"+thread.getName());
		System.out.println("is thread deamon?:"+thread.isDaemon());
		System.out.println("is thread alive:"+thread.isAlive());
		System.out.println("thread state"+thread.getState());
        System.out.println("thread id"+thread.getId());		
	}
}

