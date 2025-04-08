package Array;

import java.util.Arrays;

public class MedianArray {
	public static void main(String[] args) {
		int arr[]= {7,1,3,9,5};
		Arrays.sort(arr);
		double median=0;
		for(int i=0;i<arr.length;i++)
		{
			median=arr[arr.length/2];
		}
		System.out.println(median);
		//find middle of even array then used this fromula median =arr[n/2−1]+arr[n/2]/2		​

		for(int i=0;i<arr.length;i++)
		{
			median=arr[arr.length/2]+arr[arr.length/2]/2.0;
		}
		System.out.println(median);
	}
}
