package collection;
import java.util.*;
import java.util.ArrayList;

public class ArratList {

	public static void main(String[] args) {
		
		ArrayList<String> obj=new ArrayList<>();
		
		obj.add("java");
		obj.add("php");
		obj.add(2,"cpp");
		obj.addFirst("html");
		obj.addLast("spring boot");
		//obj.addAll(obj)
;
	//	obj.addAll(null);
	
		
		obj.add(2,"geeks");
		System.out.println(obj);
		
		obj.set(4, "null"); // tyach element vr another element geycha asel tr set 
		                   
		System.out.println("Set element "+obj);
		obj.remove(4);
		System.out.println("Remove element at 4"+obj);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
}
