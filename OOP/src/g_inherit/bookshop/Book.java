package g_inherit.bookshop;

public class Book extends Item{
	
	private String publisher, writer; //나만 갖고 있는 것
	
	
	public Book()
	{
		super(); //내가 지정하지 않으면 알아서 만들어짐. 부모의 기본 생성자 함수가 없으면 오류가 뜬다.
		System.out.println("book");
	}
	
	public Book(String num, String title , String publish,String writer)
	{
		super(num, title); //자동으로 만들어짐(인자부모생성자)
		super.num=num;
		super.title=title;//자신의 것이 아니라서 this가 아닌 부모를 지칭해 주어야 한다.
		//여기서 오류가 안나는 이유는 부모와 변수가 겹치지 않기 때문이다.
		//부모는 super로 자신은 this로
		this.publisher=publisher;
		this.writer=writer;
		System.out.println("인자 자식 생성");
	}
	
	
	
	
	public void output()
	{
		
		
		System.out.println("번호:"+num);
		System.out.println("제목:"+title); //num,title이 에러 안나는 이유:부모 item의 멤버를 마음대로 쓸 수 있기 때문에
		//만약 item에 private을 하면 에러가 남
		//자식한텐 권한을 주고 싶지만 다른 사람에게 주기 싫을 때는 protected를 사용한다.
		System.out.println("출판사:"+publisher);
		System.out.println("작가:"+writer);
	}

}
