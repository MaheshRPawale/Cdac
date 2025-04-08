package Collection1;

import java.util.ArrayList;

public class Insert_position_wise {

	
	public static void main(String[] args) {
		
		ArrayList<String> obj= new ArrayList<String>();
		
		obj.add("red");
		obj.add("green");
		obj.add("orange");
		
		obj.add("white");
		obj.add("black");
		
		System.out.println(obj);
		
		
		obj.add(0, "pink");
		obj.addAll(obj);
		
		System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.get(5));
		System.out.println(obj.getLast());
		String var1=obj.get(3);
		System.out.println(var1);
	}
}
