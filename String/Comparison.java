package String;

public class Comparison {
	public static void main(String[] args) {
		
		String str1="Python Excercises";
		String str2="Python Excercise";
		
		
		String end_str="se";
		boolean obj= str1.endsWith(end_str);
		boolean obj2=str2.endsWith(end_str);		
	
	System.out.println(str1+" "+"ends with  "+ obj);
	System.out.println(str2+" "+"ends with  "+ obj2);
	
	String str3="Mahesh Ramkisan Pawale";
	String str4="Bipin Ramkisan Pawale";
	String end_str1="Ramkisan Pawale";
	
	boolean obj4=str3.endsWith(end_str1);
	boolean obj5=str4.endsWith(end_str1);
	
	System.out.println("This is Ramkisan pawale son "+ str3+" "+ obj4);
	System.out.println("this is Ramkisan Pawale son "+ str4+ " "+ obj5);
	
	
	}
}
