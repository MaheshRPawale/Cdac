package Array;
import java.util.Arrays;

public class Remove_Duplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
        	return 0; // Edge case: Empty array

        int uniqueIndex = 0; // Position for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) { // Found a new unique element
                uniqueIndex++;
                arr[uniqueIndex] = arr[i]; // Place it next to the last unique element
            }
        }

        return uniqueIndex + 1; // New length of unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        Arrays.sort(arr); // Sorting required for this approach
        int newLength = removeDuplicates(arr);

        // Print unique elements
        System.out.println("Unique Array: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
