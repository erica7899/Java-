package g_test;

public class Book extends Product {
	
	protected int isbn;
	protected String author;
	protected String title;
	
	
	public Book()
	{
		
	}
	
	public Book(String id, String des,String producer, int price, int isbn, String author, String title)
	{
		super.id=id;
		super.des=des;
		super.producer=producer;
		super.price=price;
		this.isbn=isbn;
		this.author=author;
		this.title=title;
		
	}
	
	public void showInfo()
	{
		System.out.println("ID>>"+id);
		System.out.println("description>>"+des);
		System.out.println("producer>>"+producer);
		System.out.println("price>>"+price);
		System.out.println("isbn>>"+isbn);
		System.out.println("author>>"+author);
		System.out.println("title>>"+title);
		
		
	}

}
