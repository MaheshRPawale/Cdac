package Array;

public class Smollest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {-21,3222,335,447,-5,46,67,-8,9991};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];
			}
		}
		System.out.println("smallest number "+min);
	}

}
//-------------------------------------------------------------------------------
