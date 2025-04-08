package Array;

import java.util.Scanner;

public class LinearSearch_Position {
		/*Input: arr[] = [1, 2, 3, 4], x = 3
	Output: 2
	Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is present at index 2, the output is 2.
*/

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,45,6,7,8};
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of array  ");
		int ele=obj.nextInt();
		
		boolean found=false; // 
		int index = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("The Value of Array position is "+i);
			}
		}
		System.out.println(index);
	}
}
