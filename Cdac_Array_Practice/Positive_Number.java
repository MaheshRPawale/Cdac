
					//Count Positive Numbers: Count how many positive numbers are in an array.

package Cdac_Array_Practice;
public class Positive_Number
{
		public void positiveCount(int[] arr)
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=0)
				{
					count++;
				}
				
			}
			System.out.println("Total positive NUmber of Array "+count);
		}
	
			public static void main(String[] args)
			{
				
				int arr[]={11,33,-4,45,55,43,76,-33,-44};
				Positive_Number obj=new Positive_Number();
				obj.positiveCount(arr);
			}			
}
