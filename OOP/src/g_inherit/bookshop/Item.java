package g_inherit.bookshop;

public class Item {
	
	protected String num, title;  //공통
	
	//생성자 함수
	public Item (String num, String title)
	{
		this.num = num;
		this.title=title;
		System.out.println("인자부모생성자");
	}
	
	public Item()
	{
		//다른 인자 있는 생성자 함수를 만드는 순간 기본 생성자는 자동으로 만들어 지지 않는다.
		System.out.println("parent method");
	}
	
	public void output()
	
	{
		//다른 자식들한테 똑같이 있으면 자식들이 부모 메모리를 부를 때 자식들 함수가 불러지기 때문에 부모객체가 있어야지 
		//자식 객체들한테 있는 같은 함수들을 한방에 부를 수 있다.
		//부모한테 있어야 overriding 가능
	}

}
