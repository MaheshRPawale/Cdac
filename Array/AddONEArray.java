package Array;

public class AddONEArray {
		
	
	public static void main(String[] args) {
			
		int arr[]= {1,2,3};
		
		int num=0;
		
		for(int i=0;i<arr.length;i++)
		{
			num=num*10+arr[i];
		}
		num+=1;
		System.out.println(num);
		}
}
