package Array;

public class AVGOfArray {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			
		}
		System.out.println("SUM OF ARRAY "+sum);
		double avg=(double)sum/arr.length;
		System.out.println(avg);
		
	}

}
