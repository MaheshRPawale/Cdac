package Array;

import java.util.Arrays;

public class Second_minAndMax {

	
	public static int secondMax(int arr[])
	{
		int n=arr.length;
		int largest =-1, secondMax=-1;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>secondMax && arr[i]!=largest)
			{
				secondMax=arr[i];
			}
		}
		
		return secondMax;
		
	}
	//-----------------------------------secondmin-------------------
	public static int secondMin(int arr[])
	{
		Arrays.sort(arr);
		int secondMin=arr[1];
		
		return secondMin;
	}
	
	public static void main(String[] args) {
		int arr[]= {12,3,4,43,54,65,89,97,55,4,1,32};
		
		
		
		System.out.println("second largest number "+secondMax(arr));
		System.out.println("second smallest number "+secondMin(arr));
	}

}
