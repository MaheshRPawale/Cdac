package Array;

import java.util.Arrays;

public class RemoveSort {
	public static void main(String[] args) {
		
		int arr[]= {2,3,7,5,1,9,7,5,3,2};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					continue;
				}
			}
		}
		
	}
}
