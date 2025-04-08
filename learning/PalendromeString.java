package learning;

public class PalendromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg ="abbka abc aa bb cc abccba";
		String[] sarr = msg.split(" ");
		int count =0;
		for(int i =0; i<sarr.length; i++) {
			if(palendrome(sarr[i])) {
				count++;
			}
		}
		
		System.out.println("No of  palendrome String is =  "+count);

	}
	public static boolean palendrome(String s) {
		for(int i =0,j=s.length()-1; i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}

}
