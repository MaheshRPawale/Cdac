package learning;

public class pattern {

	public static void main(String[] args)
	{
		for(int i=0;i<9;i++)
		{
		  for(int j=0;j<9;j++)
		  {
			  if(i==0|| j==0 || j==8||i==8 || i==4 || j==4)
			  {
				  System.out.print("*"+" ");
			  }
			  else
			  {
				  System.out.print(" "+" ");
			  }
		  }
		  System.out.println();
		}
	}

}
