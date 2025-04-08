package Array;

import java.util.Arrays;

public class GetSecondLargest {

	static int getSecondLargest(int arr[])
	{
		int n=arr.length;
		Arrays.sort(arr);
		
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]!=arr[n-1])
			{
				return arr[i];
			}
			
		}
		
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,36,10,333,445,6543,6543};
		System.out.println(getSecondLargest(arr));
	}
}
