package b_operator;

import java.util.Scanner;
//import java.util.Scanner.* //가장 기본적인 패키지. 이것만 소속을 알리지 않아도 사용할 수 있다.(자동)

/**
 * 숫자 입력받아 홀수인지 짝수인지 출력
 * 
 *
 */

public class Ex01_Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("숫자입력=>");
		int su = in.nextInt();
		
		if (su%2==0) {
			System.out.println("짝수");
			
		}else {
			System.out.println("홀수");
		}
				
		//ctrl+shuft+O =소속 모를때 사용
				
				
			
		

		
	}

}
