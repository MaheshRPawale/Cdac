package Array;

public class MaxMin {
	
	public static int max(int []arr, int n)
	{
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int min(int []arr,int n)
	{int min=arr[0];
	for(int i=0;i<n;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
		return min;
	}
	public static void main(String[] args) {
		
	int arr[]= {2,34,5,667,7,1};
		int n=arr.length;
		System.out.println("minimum element is:"+min(arr,n));
		System.out.println("maximum element is:"+max(arr,n));
	}
}
