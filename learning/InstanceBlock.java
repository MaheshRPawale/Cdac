package learning;

public class InstanceBlock {
	int i=0;
	 
	 {	m1();
		 System.out.println("first instance block");
	 }
	 
	 InstanceBlock() 
	 {
			System.out.println("constructore");
     }
	public static void main(String[] args) {
		
		InstanceBlock obj=new InstanceBlock();
		System.out.println("main");
		InstanceBlock obj1=new InstanceBlock();
		
	}
	public void m1()
	{
		System.out.println(j);
	}
	
	{
		System.out.println("Second instance block");
	}
	int j=90;

}
