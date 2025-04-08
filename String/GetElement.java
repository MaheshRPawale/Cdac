package String;

public class GetElement {

	public static void main(String[] args) {
	
		String str="mahesh pawale";
		
		int index1=str.charAt(0);
		int index3=str.charAt(10);
		
		int index2=str.codePointAt(6);
		System.out.println((char)index1 +" "+(char) index3);
		
		System.out.println( index3);
		
	}
}
