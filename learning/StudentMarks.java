package learning;

//
//import java.util.HashMap;
//import java.util.Map;
//
//public class StudentMarks {
//    public static void main(String[] args) {
//        Map<String, Integer> studentMarks = new HashMap<>();
//
//        studentMarks.put("Alice", 85);
//        studentMarks.put("Bob", 90);
//        studentMarks.put("Charlie", 78);
//
//        // Iterating through the Map
//        for (String i ;i<studentMarks(i); i++) {
//            System.out.println(i + " scored " + studentMarks.get(i));
//        }
//
//    }
//}


import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);

        // Convert entrySet to an array and iterate using a normal loop
        Map.Entry<String, Integer>[] entries = studentMarks.entrySet().toArray(new Map.Entry[0]);

        for (int i = 0; i < entries.length; i++) {
            System.out.println(entries[i].getKey() + " scored " + entries[i].getValue());
        }
    }
}




/*Why Can't We Use for (int i = 0; i < map.size(); i++)?
A Map is not indexed like an array or list.
We can't access elements using map.get(i) because keys are not ordered numbers.
We must use entrySet() or keySet() to access elements.
*/
