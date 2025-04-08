package Array;

public class Naresh {

	
		public static void dublicate(int arr[]){
				
			int j=0;
			int n=arr.length;
			int temp[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				//System.out.println(arr[i]);
					if(arr[i]==arr[j]&& i!=j)
					{
						temp[j]=arr[j];
					}
			}
			for(int k=0;k<n;k++)
			{
				System.out.println(temp[k]);
			}
			
			/*
			 * if(i!=j)
			 * {
			 * if( arr[i]!=arr[j]
			 * {
			 * 			count++;
			 * }
			 * 
			 * }
			 * 
			 * */
			
		}
		
	public static void main(String[] args) {
		 
		int arr[] = {1,2,1,3,2,1,1,2,2,2,2,3,4};
		dublicate(arr);
		//System.out.println("hi");
	}
}
