package Array;

public class CountUnique {
	
	public static int removeElement(int arr[] ,int ele)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=ele)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {0,1,3,0,2,2,4,2};
		int ele=2;
		
		removeElement(arr,ele);
		System.out.println(" final count "+ removeElement(arr, ele));
	}
}
