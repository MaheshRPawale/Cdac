package Multithreading;

public class DaemonThread extends Thread {
	
	public void run() {
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("daemon thread");
	}
	else {
		System.out.println("child thread");
	}
}
	public static void main(String[] args) {
		System.out.println("main thread ");
		DaemonThread t =new DaemonThread();
		t.setDaemon(true);
		t.start();
	}

}
