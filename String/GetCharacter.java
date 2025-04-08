package String;

import java.util.Scanner;  // Import Scanner class

public class GetCharacter {
    
    public void characterAtGivenIndex(String a) {   
        Scanner sc = new Scanner(System.in);  // Initialize Scanner
        System.out.println("Enter the index of the character you want:");

        int index = sc.nextInt();

        // Check for valid index to avoid exceptions
        if (index >= 0 && index < a.length()) {
            char c = a.charAt(index);
            System.out.println("Character at index " + index + " is: " + c);
        } else {
            System.out.println("Invalid index! Please enter an index between 0 and " + (a.length() - 1));
        }

        sc.close();  // Close Scanner to prevent resource leak
    }

    public static void main(String[] args) {
        GetCharacter obj = new GetCharacter();
        obj.characterAtGivenIndex("Omkar");
    }
}
