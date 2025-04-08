package Array;
public class FrequencyCounter {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 2, 1, 4, 1, 2, 3, 5};

        // Visited array to keep track of counted elements
        boolean[] visited = new boolean[array.length];

        System.out.println("Element Frequencies:");

        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue; // Skip already counted elements
            }

            int count = 1; // Initialize count for the current element

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true; // Mark element as visited if we not used this then count jalela part seprate count hotoy
                }
            }

            // Print the element and its frequency
            System.out.println(array[i] + " -> " + count);
        }
    }
}
// int arr[]={11,22,33,4,5,66,77,77,55,55,55,5,4,5,5,5};