package e_method;

public class Ex04_OVERLOADING {
	/*
	 * overloading
	 * :동일한 이름의함수들(역활이 동일)
	 * :인자의 자료형이나 개수가 달라야함
	 */
	public static void main(String[] args) {
		String str = "홍길순";
		StringBuilder sb= new StringBuilder("홍길자");
		char[] ch= {'헝','길','동'}; // 초기화할땐 new안써도됨
		add(str);
		add2(sb);
		add3(ch);
	}
	static void add3(char[]s) {
		String temp = new String(s);
		temp+="화이팅";
		System.out.println(temp);
	}
	
	static void add2(StringBuilder s) {
		s.append("화이팅");
		System.out.println(s);
		
	}
	static void add(String s) {
		s+="화이팅";
		System.out.println(s);
	}
	//함수 명이 같아도 인자의형태가 다 다르면 구분이 가능해서 중복으로 치지 않는다.
	static void add(char[]s) {
		String temp = new String(s);
		temp+="화이팅";
		System.out.println(temp);
	}
	
	
	

}
