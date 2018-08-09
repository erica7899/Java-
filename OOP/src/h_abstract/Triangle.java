package h_abstract;

import java.util.Scanner;

public class Triangle implements Sharp{
	
	int h=0;
	int w=0;
	 
	public Triangle() {
	 
	}
	 
	public Triangle(int h, int w) {
	 
	this.h=h;
	this.w=w;
	}
	 
	void Input() {
	Scanner in = new Scanner(System.in);
	System.out.println("삼각형의 높이와 길이를 입력하세요:" );
	this.h=in.nextInt();//지역변수가 아니라 멤버변수로 지정하기
	this.w=in.nextInt();//지역변수가 아니라 멤버변수로 지정하기
	 
	}
	 
	void Output() {
	 
	int s = (h*w)*1/2;
	System.out.println("삼각형의 넓이: "+s );
	 
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
