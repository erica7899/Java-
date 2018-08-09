package h_abstract;

import java.util.Scanner;

public class Rectangle implements Sharp{//interface를 물려받을 대는 implements를 사용
	
	int h=0;
	int w=0;
	 
	public Rectangle() {
	 
	}
	 
	public Rectangle(int h, int w) {
	 
	this.h=h;
	this.w=w;
	}
	 
	 
	void Input() {
	Scanner in = new Scanner(System.in);
	System.out.println("사각형의 높이와 길이를 입력하세요:" );
	 this.h=in.nextInt();//지역변수가 아니라 멤버변수로 지정하기
	 this.w=in.nextInt();//지역변수가 아니라 멤버변수로 지정하기
	 
	}
	 
	void Output() {
	 
	int s = h*w;
	System.out.println("사각형의 넓이: "+s );

	
	

}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {//추상 메소드가 부모 인터페이스에 있었기 때문에 부모 메소드에 있는 추상 메소드와 같은 형태의 메소드가 있어야 한다.
		// TODO Auto-generated method stub
		
	}
	
}
