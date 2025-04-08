package learning;

public class FindLongestPrefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 ="meaning";
		String st2 = "mpplnllll";
		
		int length = st1.length()>st2.length()?st2.length():st1.length();
		
		System.out.println(length);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length ; i++) {
			if(st1.charAt(i)==st2.charAt(i)) {
				sb.append(st1.charAt(i));
			}
		}
		
		System.out.println("Common Prefix is = "+sb.toString());

	}

}
