package Multithreading;

public class NamingThreds extends Thread{

	public void run()
	{
	
	 // Thread.currentThread().setName("MAhesh Thread");  // second way to set and get name 
	   // System.out.println("Thread Name ="+ Thread.currentThread().getName());
		System.out.println("hi");
	}
	public static void main(String[] args) {
		System.out.println("Thread Name ="+ Thread.currentThread().getName());
      NamingThreds obj=new NamingThreds();   // ha main block aahe to main execute kto jvm chya help ni
     
      obj.start();   // ha thread run method execute krtat
      
      
      NamingThreds obj1=new NamingThreds();
      
      obj1.setName("maheshTHreads");
      obj1.start();
	}

}
