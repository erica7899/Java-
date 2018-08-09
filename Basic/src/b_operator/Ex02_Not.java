package b_operator;
/*
  not: 결과에 반대로 하는 연산자
  -일반논리 not : !
  -이진논리 not : ~
 */

public class Ex02_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반논리
		boolean result = 3>4;
		System.out.println(result);
		System.out.println(!result);
		
		//이진논리
		int a = 15;
		//00000000 00000000 00000000 00001111 (4byte)
		//11111111 11111111 11111111 11110000 (not 연산)
		System.out.println(~a);
		

	}

}
