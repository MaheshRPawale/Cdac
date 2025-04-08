package Array;

public class Sum_Into_SingleDigit {
		
	//n=1234  ----> 10  1+0--> 1   o/p=1  
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		
		for(;sum>=10;)
		{
			int tempsum=0;
			for(int i=sum;i>0;i/=10)
			{
				tempsum+=i%10;
			}
			sum =tempsum;
		}
	
		System.out.println("finale "+sum);
	}
}
