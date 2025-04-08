package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_ArrayList {
	public static void main(String[] args) {
		
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
	//	  System.out.println("List before sort: "+list_Strings);
	
			Collections.sort(list_Strings);
			 System.out.println("List After sorting"+ list_Strings);
		
		  ArrayList<String> list_Strings1 = new ArrayList<String>();
		  list_Strings1.add("Red");
		  list_Strings1.add("Green");
		  list_Strings1.add("Orange");
		  list_Strings1.add("White");
		  list_Strings1.add("Black");
		  System.out.println("ArrayList before sort: "+list_Strings1);
		  
		  	Collections.sort(list_Strings);
		 System.out.println("ArrayList aftre sorting"+ list_Strings1);
	}
}
