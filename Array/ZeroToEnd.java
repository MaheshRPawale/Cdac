package Array;

public class ZeroToEnd {
	
	public static void zeroToEnd(int arr[])
	{
		int n=arr.length;
		int j = 0;
		int temp[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				temp[j]=arr[i];
				j++;
			}
			
		}
		
		for(j=0;j<n;j++)
		{
			System.out.println(temp[j]);
		}
		
	}
	
	
	   public static void main(String[] args) {
			
		   int arr[]= {1,2,0,4,5,0,3,0};
		   
		   zeroToEnd(arr);
		 //  System.out.println();
			
		}
}
