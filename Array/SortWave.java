package Array;

import java.util.Arrays;

public class SortWave {
	
		public static void convertToWave(int arr[])
		{
			int n=arr.length;
			for(int i=0;i<n-1;i+=2)
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array "+Arrays.toString(arr));
		convertToWave(arr);
		System.out.println("Final  Array "+Arrays.toString(arr));
		
	}
}
