package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
      
      // Function to Remove the element from the array
      public static int[] remove(int[] arr, int i){
        
          if (arr == null || i < 0 || i >= arr.length)
            return arr;

      
         List<Integer> al = IntStream.of(arr).boxed()
                                    .collect(Collectors.toList());

          // Removing element from the index
        al.remove(i);

        return al.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 2;

          // Removing index i from arr
          arr = remove(arr, i);

        System.out.println(Arrays.toString(arr));
    }
}