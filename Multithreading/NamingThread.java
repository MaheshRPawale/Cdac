package Multithreading;

public class NamingThread extends Thread {

	public void run()
	{
		//System.out.println("namming convention");
		//start();
	}
	
	public static void main(String[] args) {
	NamingThread obj =new NamingThread();
	obj.start();
	//obj.run();
	//obj.sleep(1000);

	}

}
