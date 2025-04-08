package String;

public class Compaire {

	public static void main(String[] args) {
		/*When to Use Which?
			Use equals() → When checking if two strings are exactly the same.
			Use compareTo() → When sorting strings or checking their relative order.
		 */
		
		String str="mahesh pawale";
		String str2="Check whether two String objects contain the same data";
		
		String str3="Hello";
		String str4="hello";
		
		boolean obj=str.contains(str2);
		
		System.out.println(obj);
		boolean obj1=str3.contains(str4);
		boolean obj3=str3.equals(str4);//✔ Returns true if both strings have identical characters. means same pahije
		System.out.println(str3.equalsIgnoreCase(str4)+" ingnorecase");
		
		System.out.println(obj3);
		
		
		// compareTo() – Lexicographical Comparison
		/*
		  
		  This method compares two strings based on Unicode values.
		It returns:
			0 if both strings are equal.
			A positive number if the first string is greater.
			A negative number if the first string is smaller.
		  */
		
		String str5="apple";
		String str6="Banana";
		String str7="apple";
		
		
		System.out.println(" ... "+str5.compareTo(str7)+ "  compareto str5 compaire to str6");
		
		
		
		// == Operator – Compares Memory References
		String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2); // true (same memory location - String pool)
        System.out.println(s1 == s3); // false (different memory locations)
		
		
		// When used compareTo() and equals in string
        
        /* 0 → Strings are equal.
		Negative (-ve) value → First string is smaller.
		Positive (+ve) value → First string is greater.
		When to use?
		✔ When you need to sort strings in alphabetical order.
		✔ When you need to compare based on Unicode values.*/
		
	
        /*Used when you want to check if two strings contain exactly the same characters.
    	Returns true or false.
	Case-sensitive.
	When to use?
	✔ When you need to check for exact equality between two strings.*/
        
	}
}
