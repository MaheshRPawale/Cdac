package learning;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of an array ");
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n;i++) {
			arr[i]= sc.nextInt();
			}
		System.out.println("Enter the k value ");
		int k = sc.nextInt();
		Arrays.sort(arr);
		while(k>0) {
			int largest = arr[arr.length-1];
			int j = arr.length-1;
			
			while(arr[j]==largest) {
				j--;
			}
			
		k--;	
		}
		
		
		
	}

}
