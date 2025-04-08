package Pattern;

public class Hollow_Diamond7 {
public static void main(String[] args) {
	
	int i,j,n=8;
	for(i=1;i<=n;i++)
	{
		for(j=n;j>=i;j--)
		{
			System.out.print(" ");
		}
		
		for( j=1;j<=(2*i-1);j++)
		{
				if(i==n|| j==1|| j==(2*i-1))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
		}
		System.out.println();
	}
}
}
