package String;

public class Reverse {

	
	public static String revereseUseingArray(String str)
	{
		char[] charArr = str.toCharArray();
		int left=0 , rigth=str.length()-1;
		
		while(left< rigth)
		{
			
			char temp= charArr[left];
			charArr[left]=charArr[rigth];
			charArr[rigth]=temp;
			
			left++;
			rigth--;
		}
		
		
		return new String(charArr);
		
	}
	
	public static void main(String[] args) {
		
		String str="mahesh";
		
		System.out.println("reverse-  "+ revereseUseingArray(str));
	}
}
