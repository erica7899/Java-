package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		// 정수형 변수 kor
		int kor;
		kor=30;
		
		//정수형 변ㅁ수 eng
		int eng=60; //초기화
		int temp;
		
		if(kor==eng) {
			System.out.println("두 점수 동일");}
			else {
				System.out.println("두 점수 다름");}
		
		temp=kor;
		kor=eng;
		eng=temp;
		
		System.out.println("국어:"+kor+"영어:"+eng);
		
		
		
	}

}
