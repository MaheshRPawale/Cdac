package learning;

public class Dog {

		String name;
		String breed;
		int age;
		String color;


	public Dog(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName()
	{
		return name;
		
	}
	public String getBreed()
	{
		return breed;
	}
	
	public int getage()
	{
		return age ;
	}
	private String getcolor()
	{
		return color;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj =new Dog("rocky","gavran",5,"brwavn");
		System.out.println(obj.toString());
	}

}
