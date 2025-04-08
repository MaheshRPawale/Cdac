package String;

public class OperationString {
	
	public static void main(String[] args) {
		
		String sentence="HI AM PRACTICING STRING PROBLEM";
		
		int obj=sentence.codePointAt(0);
		//// Get the ASCII value of the character at position 0.
		int obj1=sentence.codePointAt(10);
		// Get the ASCII value of the character at position 10.
		System.out.println("Frist index character"+" "+obj +" "+" second last index"+obj1);
		
		
		int obj2=sentence.codePointBefore(1);
		int obj3=sentence.codePointBefore(8);
		System.out.println("Character(unicode point) = " + obj2);
        // Print the Unicode code point representing the character before index 9 in the string.
        
		System.out.println("Character(unicode point) = " + obj3);
        // Print the Unicode code point representing the character before index 9 in the string.
        
		String str = "maheshPawale  123456789";
		int count=str.codePointCount(1, 14);
		  // Print the count of Unicode code points from index 1 to index 10 in the string.
	       
		System.out.println("Count"+count);
		
		
		String str1="Mahesh";
		String str2="mahesh"
				;
		
		int result= str1.compareTo(str2);		
		if(result<0)
		{
			 // If the result is less than 0, print that the first string is less than the second.
            System.out.println("\"" + str1 + "\"" +" is less than " + "\"" + str2 + "\"");
		}else if (result == 0) {
            // If the result is 0, print that the first string is equal to the second.
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        } else { // if (result > 0)
            // If the result is greater than 0, print that the first string is greater than the second.
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
		
		
		// CONTAIN 
		
		
		String str4="Mahesh Ramkisan Pawale";
		String str5="Mahesh";
		boolean present=str4.contains(str5);
		System.out.println("Present Or NOT "+ present);
		System.out.println(str4.contains(str5));
		
		 String str11 = "PHP Exercises and Python Exercises";
	        String str22 = "and";
	        // Check if str1 contains the sequence specified in str2 and print the result.
	        System.out.println(str11.contains(str22));   
		
	}

}
