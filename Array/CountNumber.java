package Array;

import java.util.Scanner;

public class CountNumber {

	
	static void CountNumber(int[] arr,int choiceno) {
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			
				if(choiceno==arr[i])
				{
					count++;
				}
			
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		int arr[]= {1,22,33,44,44,44,44,44,3,22};
		System.out.println("Enter the number for count");
		Scanner obj =new Scanner(System.in);
		int choiceno=obj.nextInt();
		
		CountNumber(arr,choiceno);
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(" ");
//		}
	}

}
