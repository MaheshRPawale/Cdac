package learning;

public class ReverseStringWithWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any sentance ");
		String sts = "hello this is question ";
		String[] sarr = sts.split(" ");
		
		for(int i=0,j=sarr.length-1; i<=j; i++,j--) {
			String temp = sarr[i];
			sarr[i] = sarr[j];
			sarr[j] = temp;
		}
		
		for(int i =0; i<sarr.length; i++) {
			char[] arr = sarr[i].toCharArray();
			
			for(int j=0,k=arr.length-1; j<=k; j++,k--) {
				char t = arr[j];
				arr[j]=arr[k];
				arr[k]=t;
			}
			String str = "";
			for(int m=0; m<arr.length; m++) {
				str+=arr[m];
			}
			sarr[i] =str;
		}
		
		

		for(String val: sarr) {
			System.out.print(val+" ");
		}
	}

}
