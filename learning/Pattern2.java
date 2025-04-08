package learning;

public class Pattern2 {

	public static void main(String[] args) 
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i==4 || j==4 || i==0 && j>4 || j==0 && i<4 || i==8 && j<4 || j==8 && i>4)
				{
					System.out.print("*"+ " ");
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
