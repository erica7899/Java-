package c_constructre;

import java.util.Scanner;

public class Ex01_Main {

	public static void main(String[] args) {
		// Ex01_Student operate
		
		Ex01_Student s; //변수 선언(변수는 stack에 들어감)
		s = new Ex01_Student(); //class는 반드시 new, 객체 생성

		System.out.println("입력:(이름/국영수 성적)");
		Scanner a = new Scanner(System.in);
		String name = a.next();
		int kor = a.nextInt();
		int eng = a.nextInt();
		int math = a.nextInt();
		
		
		 
	    s.setName (name);//set은 입력. 외부 입력값을 받는 것
	    s.setKor(kor);
	    s.setEng(eng);
	    s.setMath(math);
		
		//초기화(객체화):객체생성시 값 지정
		//위 주석은 값을 하나씩지정
		
		//Ex01_Student s =new Ex01_Student(name,kor, eng, math);
	    s.calTotla();
	    
	    s.calAvg();
	    
	    
	    
	    System.out.println(s.getName()+" 총점은"+s.getTotal());//get은 출력
	    System.out.println(s.getName()+" 평균은"+s.getAvg());
	   
	}

}
