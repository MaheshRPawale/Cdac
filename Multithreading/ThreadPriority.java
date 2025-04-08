package Multithreading;

import learning.Test;

public class ThreadPriority extends Thread {

	public void run()
	{
		System.out.println("child Thread");
		System.out.println("Child thread priority :"+ Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		System.out.println("main thread old priority :"+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("main thraed new priority :"+ Thread.currentThread().getPriority());
	
		
		ThreadPriority t=new ThreadPriority();
		//t.start();
		t.setPriority(10);
		t.start();
	}
}
