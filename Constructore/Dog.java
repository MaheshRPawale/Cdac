package Constructore;
/*Write a Java program to create a class called Dog with instance variables name and color. 
 * Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
 *  Print the values of the variables.*/
public class Dog {
	
	private String name ;
	private String color;
	
	Dog(String DogName , String DogColor)
	{
		this.name=DogName;
		this.color=DogColor;
	}
	
	
	public static void main(String[] args) {
		
		Dog obj =new Dog("jerry", "Black");
		System.out.println("Dog Name is "+obj.name +" and Dog Color is "+obj.color);
	}
	

}
//-------------------------------------------------------------------
/*
  Dog obj = new Dog("Jerry", "Black");
System.out.println(obj);

  
 The System.out.println(obj); statement calls String.valueOf(obj), which internally calls obj.toString().
 
Since Dog does not override toString(), the inherited Object.toString() method is used.*/