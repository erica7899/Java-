package h_abstract;

import java.util.Scanner;

public class Circle implements Sharp {
	
	int r=0;
	 
	public Circle() {
	 
	}
	 
	public Circle(int r) {
	 
	this.r=r;
	}
	 
	 
	void Input() {
	Scanner in = new Scanner(System.in);
	System.out.println("원의 반지름을 입력하세요:" );
	this.r=in.nextInt();//지역변수가 아니라 멤버변수로 지정하기
	 
	 
	}
	 
	void Output() {
	 
	int s = r*r;
	System.out.println("원의 넓이: "+s );
	 
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}


}
