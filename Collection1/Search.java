package Collection1;

import java.util.ArrayList;
import java.util.List;

public class Search {
		public static void main(String[] args) {
			
			
ArrayList<String> obj= new ArrayList<String>();
			
			obj.add("red");
			obj.add("green");
			obj.add("orange");
			
			obj.add("white");
			obj.add("black");
			
			if(obj.contains("white"))
			{
				System.out.println("Found the element");
			}
			else
			{
				 System.out.println("There is no such element");
			}
			
		boolean var1=obj.contains("");
		
		System.out.println(var1);
		}
}
