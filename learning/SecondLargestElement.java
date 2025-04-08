package learning;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente size of an array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements in array ");
		
		for(int i =0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int j = arr.length-1;
		while(arr[size-1]==arr[j]) {
			j--;
		}
		int secondMax = arr[j];
		
		int sum =0;
		for(int i =0; i<size ; i++) {
			if(arr[i]<secondMax) {
				sum +=secondMax-arr[i];
			}
		}
		
		System.out.println("ans = "+sum);
		sc.close();
		
	}

}
