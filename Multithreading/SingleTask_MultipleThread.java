package Multithreading;

public class SingleTask_MultipleThread extends Thread {

	public void run()
	{
		System.out.println("task 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTask_MultipleThread obj= new SingleTask_MultipleThread();
		obj.start();
		//obj.start();
		SingleTask_MultipleThread obj1= new SingleTask_MultipleThread();
		obj1.start();
		SingleTask_MultipleThread obj2= new SingleTask_MultipleThread();
		obj2.start();
		SingleTask_MultipleThread obj3= new SingleTask_MultipleThread();
		obj3.start();
		
	}

}
