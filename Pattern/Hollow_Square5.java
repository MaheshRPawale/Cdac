package Pattern;

public class Hollow_Square5 {
public static void main(String[] args) {

	int n=6;
	for(int i=1; i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==n   || i==1|| j==n||j==1)
			{
				System.out.print("*");
			}
			
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
