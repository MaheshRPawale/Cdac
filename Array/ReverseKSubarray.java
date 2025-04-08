package Array;
import java.util.Arrays;

public class ReverseKSubarray {
    
    public static void reverseInGroups(int arr[], int k) {
        int n = arr.length;
        
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Handle last group if k > n
            
            // Reverse subarray
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseInGroups(arr1, 3); // Output: [3, 2, 1, 6, 5, 4, 9, 8, 7]

        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseInGroups(arr2, 5); // Output: [5, 4, 3, 2, 1, 8, 7, 6]

        int arr3[] = {1, 2, 3, 4, 5, 6};
        reverseInGroups(arr3, 1); // Output: [1, 2, 3, 4, 5, 6]

        int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseInGroups(arr4, 10); // Output: [8, 7, 6, 5, 4, 3, 2, 1]
    }
}
