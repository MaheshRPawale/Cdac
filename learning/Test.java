package learning;

public class Test extends Thread {

	public void run()
	{
		System.out.println("thread task");
	}
	public static void main(String[] args)
	{
		Test obj =new Test();
		obj.start();
	//	obj.start();  java.lang.IllegalThreadStateException
		obj.run();
		
	}
}
