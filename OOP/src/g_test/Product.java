package g_test;

public class Product {

	protected String id;  //자식한테 주려면 protected
	protected String des;
	protected String producer;
	protected int price;
	
	public Product()
	{
		
	}
	
	public Product(String id, String des, String producer, int price)
	{
		
		this.des=des;
		this.id=id;
		this.price=price;
		this.producer=producer;
	}
	
	public void showInfo()
	{
		
	}
}
