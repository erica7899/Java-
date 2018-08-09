package a_datatype;

public class Ex04_String {

	public static void main(String[] args) {
		//스트링은 클래스. 클래스는 메모리 확보를 할때 반드시 new 이용
		String a = new String("홍길동");
		String b = new String("홍길동");

		if(a==b) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}//다르다고 나옴
		//참조형은 선언 과정때문에(new) 주소를 비교하게 된다.

		String c;
		c= new String("홍길동");
		String d;
		d = new String("홍길동");
		
		if (c.equals(d)) {
			System.out.println("이름동일");
		}//문자열 비교는 equals사용


	}
}