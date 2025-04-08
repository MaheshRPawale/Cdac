
//Sum of Elements: Write a function to calculate the sum of all elements in an array.

package Cdac_Array_Practice;
import java.util.Arrays;
public class SumOfFunction {
	
	public int SumOfFunction(int[] arr)
	{
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	
	public void SumOfFunction1(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of Array==="+sum);
	}
	
	public static int SumOfFunction2(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		SumOfFunction obj= new SumOfFunction();
		
				int sum1=obj.SumOfFunction(arr);
				System.out.println("Sum Of array using 1 method==="+sum1);
				
				obj.SumOfFunction1(arr);
				
			int sum3=obj.SumOfFunction2(arr);
			System.out.println("Sum of Array using 2 method==="+sum3);
		
	}
	
}
