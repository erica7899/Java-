package a_basic;

public class Ex01_Main {

	public static void main(String[] args) {
		// Ex01_Student operate
		
		Ex01_Student s; //변수 선언(변수는 stack에 들어감)
		s = new Ex01_Student(); //class는 반드시 new, 객체 생성

	    s.name= "hong";
	    s.kor=99;
	    s.eng=88;
	    s.math=70;
	    
	    s.calTotla();
	    s.total=100; //위에 변수에 값을 넣어도 의도적으로 total값 설정
	    s.calAvg();
	    
	    
	    
	    System.out.println(s.name+" 총점은"+s.total);
	    System.out.println(s.name+" 평균은"+s.avg);
	}

}
