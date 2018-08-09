package g_test;

public class CompactDisc extends Product {
	
	
	private String singer;
	private String title;
	
	
	public CompactDisc()
	{
		
	}
	
	public CompactDisc(String id, String des,String producer, int price, String title, String singer)
	{
		super.id=id;
		super.des=des;
		super.producer=producer;
		super.price=price;
		this.singer=singer;
		this.title=title;
		
	}
	
	public void showInfo()
	{
		System.out.println("ID>>"+id);
		System.out.println("description>>"+des);
		System.out.println("producer>>"+producer);
		System.out.println("price>>"+price);
		System.out.println("singer>>"+singer);
		System.out.println("title>>"+title);
		
	}

}
