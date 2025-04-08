package Constructore;
/*Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
Implement a default constructor and a parameterized constructor that takes all three instance variables. 
Use constructor chaining to initialize the variables. Print the values of the variables.*/
public class Student {
	
	private int studentId;
	private String name;
	private char grade;
	
	Student()
	{
		this.studentId=41;
		this.name="Mahesh";
		this.grade='A';
	}

	public int getStudentid()
	{
		return studentId;
	}
	public String getName()
	{
		return name;
	}
	public char getGrade()
	{
		return grade;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
	//return " studentId ="" " ;
	}
	
	Student( int studentId , String name, char grade)
	{

		this.studentId=studentId;
		this.name=name;
		this.grade=grade;
	}
	public static void main(String[] args) {
        // Create a new Student object using the default constructor
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.studentId);
        System.out.println("Student1 Name: " + student1.name);
        System.out.println("Student1 Grade: " + student1.grade);

        // Create a new Student object using the parameterized constructor
        Student student2 = new Student(101, "Cullen", 'a');
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.studentId);
        System.out.println("Student2 Name: " + student2.name);
        System.out.println("Student2 Grade: " + student2.grade);
    }
}
