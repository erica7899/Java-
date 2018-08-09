package a_basic;

public class Ex01_Student {
	
	//클래스= 서로 다른 타입의 변수들(field)+ 그 변수들을 사용하는 함수들(method)
	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	void calTotla() {
		total=kor+eng+math;
		
	}
	
	void calAvg() {
		avg=(double)total/3;
		
	}
	

}
