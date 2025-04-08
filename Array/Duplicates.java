package Array;
import java.util.*;

public class Duplicates {

    static void findDuplicates(int arr[]) {
        boolean hasDuplicates = false;
        System.out.print("Duplicates in the array: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                   hasDuplicates = true;
                    break; // Move to the next element once a duplicate is found
                }
            }
        }
        
        if (!hasDuplicates) {
            System.out.println("No duplicates found in the array.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        
        findDuplicates(arr);
       // obj.close();
    }
}
