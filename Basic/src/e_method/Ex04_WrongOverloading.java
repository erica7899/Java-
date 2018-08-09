package e_method;

public class Ex04_WrongOverloading {

	public static void main(String[] args) {
		
	}
	static  String method(int no) {
		String s="행복"+no;
		System.out.println(s);
		return s;
	}
	
	static StringBuffer method(int a) {
		StringBuffer s = new StringBuffer("불금");
		s.append(a);
		System.out.println(a);
		return s;
	}//입력받는 인자가 같으면 에러가 난다. 이렇게 리턴 인자가 달라도 리턴은 함수 마지막에 
	//하는거기 때문에 입력인자가 같으면 에러가 난다.

}
