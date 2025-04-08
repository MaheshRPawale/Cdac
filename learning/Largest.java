package learning;

public class Largest {

	public static void main(String[] args) 
	{
		
		//int max;
		
		int arr[]= {-0,-2,-85,-1,-4};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
				if(max<=arr[i])
				{
					max=arr[i];
				}
		}
		
		System.out.println(max);
		
	}

}
