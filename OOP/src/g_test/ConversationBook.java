package g_test;

public class ConversationBook extends Book {
	
	
	private String lang;
	
	
	public ConversationBook()
	{
		
	}
	
	public ConversationBook(String id, String des,String producer, int price, int isbn, String author, String title, String lang)
	{
		super.id=id;
		super.des=des;
		super.producer=producer;
		super.price=price;
		super.isbn=isbn;
		super.author=author;
		super.title=title;
		this.lang=lang;
		
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
		System.out.println("lang>>"+lang);
	}

}
