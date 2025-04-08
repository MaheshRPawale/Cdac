package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 33, 4, 5, 6, 77};

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want to search:");
        int ele = obj.nextInt();
        

        boolean found = false; // Flag to check if element is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("Element " + ele + " found at index " + i);
                found = true;
                break;  // Stop searching after finding the element
            }
        }

        if (!found) {
            System.out.println("Element " + ele + " not found in the array.");
        }
    }
}
