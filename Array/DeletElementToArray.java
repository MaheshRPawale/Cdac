package Array;

import java.util.Arrays;

public class DeletElementToArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 54, 6, 7};
        int[] arr2 = new int[arr.length - 1]; 
                   
                   // Create a new array with one less element
        int j = 3; // Index to remove (4th element, value 4 in this case)

        // Copy elements except the one at index `j`
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != j) { // Skip the element at index `j`
                arr2[k++] = arr[i];
            }
        }

        // Print arrays before and after deletion
        System.out.println("Before deletion: " + Arrays.toString(arr));
        System.out.println("After deletion: " + Arrays.toString(arr2));
    }
}

