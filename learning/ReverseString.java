package learning;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the strring ");
		String str = "hwllo world";
		char[] arr = str.toCharArray();
		for(int i =0, j=arr.length-1 ; i<=j; i++,j--) {
			char temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}

		System.out.println(sb.toString());
	}

}
