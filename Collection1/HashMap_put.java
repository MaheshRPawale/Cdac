package Collection1;

import java.util.HashMap;
import java.util.Map;

public class HashMap_put {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(1,"red");
		hashmap.put(2, "green");
		hashmap.put(3, "black");
		hashmap.put(4, "white");
		hashmap.put(5, "blue");
		
		
		for(Map.Entry<Integer, String> x : hashmap.entrySet()) {
			System.out.println(x.getKey() +" "+ x.getValue());
		}
	}

}
