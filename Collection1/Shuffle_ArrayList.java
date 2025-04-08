package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> obj=new ArrayList();
		
		obj.add("RED");
		obj.add("GREEN");
		obj.add("ORANGE");
		obj.add("White");
		obj.add("Black");
		
		System.out.println("List before shuffling:\n"+obj);
		
		Collections.shuffle(obj);
		System.out.println("List After shuffling:\n"+obj);
		
		Collections.shuffle(obj, null);
		System.out.println("List After updating shuffling:\n"+obj);
		
		obj.reversed();	
		
		System.out.println("List After reversing:\n"+obj);
		
	}
}
