package Collection1;

import java.util.ArrayList;

public class Update_Remove_ArrayList {
		public static void main(String[] args) {
			
			ArrayList<String> obj= new ArrayList<String>();
			
			obj.add("red");
			obj.add("green");
			obj.add("orange");
			
			obj.add("white");
			obj.add("black");
			
			
			System.out.println(obj);
			
			obj.set(0, "merquri");
			System.out.println(obj);
			System.out.println();
			for(String color: obj)
			{
				System.out.println(color);
			}
			
			
			obj.remove(4);
			System.out.println(obj);
		
		System.out.println(obj.removeAll(obj)+" remove obj sucessfully");
		System.out.println(obj +" '[] blank because list cha obj remove kela mg tayat lya value pan remove' ");
		}
}
