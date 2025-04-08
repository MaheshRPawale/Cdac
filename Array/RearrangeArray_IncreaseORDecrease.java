package Array;

import java.util.Arrays;

public class RearrangeArray_IncreaseORDecrease {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        
        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);

        // Step 2: Reverse the second half of the array using separate loops for i and j
        int n = arr.length;
        int mid = n / 2;
        int[] reversedPart = new int[n - mid];

        // Collect elements from the second half in reverse order
        for (int j = n - 1, k = 0; j >= mid; j--, k++) {
            reversedPart[k] = arr[j];
            System.out.println(reversedPart[k]+"reverse");
        }

        // Place the reversed elements back in the array
        for (int i = mid, k = 0; i < n; i++, k++) {
            arr[i] = reversedPart[k];
            System.out.println(arr[i]+"arrray");
        }

        // Print the rearranged array
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}
