package Constructore;
//Constructor Overloading
public class Book {

	private String title;
	private String author;
	private double  price;
	
	
	Book()
	{
		this.author="mrp";
		this.title="rich bad poor dad";
		this.price=2999.3;
		
	}
	
	public String getAutor()
	{
		return author;
	}
	public String getTitle()
	{
		
		return title;
	}
	public double getprice()
	{
		return price;
	}
	Book(String title ,String author)
	{
		
		this.title=title;
		this.author=author;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		Book obj=new Book();
		System.out.println("default"+obj);
		
		Book obj1=new Book("java","jems goslling");
		System.out.println("Book title is "+ obj.title+"\n Author is "+ obj.author);
	}
	
}
