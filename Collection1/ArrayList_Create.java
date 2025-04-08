package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Create {

	
	public static void main(String[] args) {
		
		//ArrayList<String>, meaning it can only hold an ArrayList and use only ArrayList-specific methods.
		ArrayList<String> obj= new  ArrayList<String>();
		
		obj.add("RED");
		obj.add("GREEN");
		obj.add("ORANGE");
		obj.add("WHITE");
		obj.add("BLACK");
	
		System.out.println(obj);
		
		//List<String>, which is a more general interface, allowing flexibility in case you need to switch to another List implementation (e.g., LinkedList<String>).
		List<String> list_str= new ArrayList<String>();
		list_str.add("red");
		list_str.add("green");
		list_str.add("orange");
		list_str.add("white");
		list_str.add("black");
		
		System.out.println(list_str);
		
		for(int i=0;i<=list_str.size();i++)
		{
			System.out.println(list_str.get(i));
		}
		
	}
}
