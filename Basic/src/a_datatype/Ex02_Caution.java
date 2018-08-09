package a_datatype;

public class Ex02_Caution {

	public static void main(String[] args) {

		//문자형 변수에 정수를 대입하면?
		char ch;
		ch=1; 
		System.out.println("값:"+ch);

		//정수형 변수에 문자를 대입하면?
		int a;
		a='!';
		System.out.println("값:"+a);

		//실수형

		float f=3.6f; //float은4바이트 자바에선 실수를 8바이트로 침->오류
		//소수를 4바이트로 쓰려면 뒤에 f를 붙여야함
		float h=(float)3.6;//강제형변환
		System.out.println(f);
		
		int i=(int)3.6;   
		System.out.println(i);
		
		long big=20000000000000L;
		System.out.println(big);
		
		String s="";
			


	}

}
