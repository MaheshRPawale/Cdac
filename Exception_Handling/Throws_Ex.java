package Exception_Handling;

public class Throws_Ex {
	public static void main(String[] args)  {
		try {
			int num=divide(1010,0);
			System.out.println("result"+num);
		}
		catch (Exception e) {
	
			  System.out.println("Exception caught: " + e.getMessage());
		}	
	}
	public static int divide(int a,int b) {
	
		if(b==0)
		{
			throw new ArithmeticException("cannot divide by zero");
		}
		return a/b;
	}
}
