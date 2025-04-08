package collection;
import java.util.*;

class SecondLargest {
    public static void main(String[] args) {  // FIX: Added proper method signature
        TreeSet<Integer> setValue = new TreeSet<>();

        setValue.add(5);
        setValue.add(77);
        setValue.add(3);
        setValue.add(4);
        setValue.add(434);
        setValue.add(344);

        System.out.println("Sorted TreeSet: " + setValue); // Elements are already sorted in ascending order

        // Convert TreeSet to an array or list
        List<Integer> list = new ArrayList<>(setValue);
        
        if (list.size() < 2) {
            System.out.println("No second largest element found.");
        } else {
            int secondLargest = list.get(list.size() - 2); // Second last element in sorted order
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
