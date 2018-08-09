package b_encapsulation;

public class Ex01_Student {
	
	//클래스= 서로 다른 타입의 변수들(field)+ 그 변수들을 사용하는 함수들(method)
	//1. 캡슐화 : 변수는 private /메소드는 public
	//변수는 더이상 밖에서 막 지정할 수 없음
	//2. 각각의 변수 처리는 setter/getter
	
	private String name; //변수는 다 private로 지정
	private int kor, eng, math;
	private int total;
	private double avg;
	//private을 붙이면 다른 클래스에서 보이지 않기 때문에
	//사용하기 위해서는 set 함수와 get함수가 필요
	
	public void setName(String name) {//오른쪽->소스->generate get,set->setter,getter 자동으로 만듬
		this.name = name;//둘다 name이면 가까운 name변수만 인식하기 때문에 this를 써야하고 this는 함수 안에 있는 name이다.
	}
	
	public String getName() {
		return name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void calTotla() { //method는 다 public으로 지정
		total=kor+eng+math;
		
	}
	
	public void calAvg() {
		avg=(double)total/3;
		
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}
	

}
