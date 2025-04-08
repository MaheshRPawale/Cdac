package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy_ArrayLIst_into_Arraylist {

	public static <E> void main(String[] args) {
	
		List <String> obj=new ArrayList<>();
		obj.add("1");
		obj.add("2");
		obj.add("3");
		obj.add("4");
		obj.add("5");
		obj.add("6");
		obj.add("7");
		
		System.out.println(obj);
		
		List <String> obj1=new ArrayList<>();
		obj1.add("A");
		obj1.add("B");
		obj1.add("C");
		obj1.add("D");
		obj1.add("E");
		obj1.add("F");
		obj1.add("G");
		
		System.out.println(obj1);
		
		
		Collections.copy(obj, obj1);
		// first convert into second 
		
		System.out.println("List1: "+ obj);
		System.out.println("List2: "+ obj1);
		
		
		
	}
}
