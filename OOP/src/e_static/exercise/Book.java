package e_static.exercise;

public class Book {
	
	private String num, name, author;
	private boolean q;
	private static int count;
	
	
	public Book()
	{
		
	}
	
	public Book(String num, String name, String author)
	{
		this.num=num;
		this.name=name;
		this.author=author;
		count++;
	}
	public Book(String num)
	{
		this.num=num;
		name="무제";
		author="작가미상";
	}

	public static int getCount() {
		return count;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setQ(boolean q) {
		this.q = q;
	}
	
	
	

}
