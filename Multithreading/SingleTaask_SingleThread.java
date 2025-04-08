package Multithreading;

public class SingleTaask_SingleThread extends Thread {

	public void run()
	{
		System.out.println("task 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTaask_SingleThread obj= new SingleTaask_SingleThread();
		obj.start();
	}

}
