package collection;
import java.util.*;

class GFG {
    // Function to remove duplicates from an array
    public static void remove(int[] a) {
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();

        // Adding elements to LinkedHashSet (automatically removes duplicates)
        for (int i = 0; i < a.length; i++) 
            s.add(a[i]);

        System.out.print(s);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 9,2, 3, 3, 4, 5};

        // Function call
        remove(a);
    }
}


/*LinkedHashSet is used because:
It removes duplicates automatically.
It maintains the order of elements as they appear in the array.
*/