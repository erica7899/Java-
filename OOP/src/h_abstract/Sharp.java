package h_abstract;

//abstract
//이거 사용되면 그 자식 클래스들은 함수 이름을 꼭 같게 만들어야함(Overriding)
//메소드 Overriding에 강제성을 주기 위해서 사용.>> 다형성 하기 위해서.
//public abstract void output();//미완성 함수

/*public abstract void output(){//이건 그냥 함수
* 
**/



public interface Sharp {//method에 abstract가 있으면 class에도 abstract를 붙여야 한다.
	
	/*public Sharp() {
	 
	}*/ //생성자 는 만들어진다.
	
	 void input(); //abstract를 사용할때 모양
	 void output();
	 
	//public abstract void input(); //abstract를 사용할때 모양
	//public abstract void output();
	//class 대문자 method 소문자로 시작해야 한다.
	//갖고있는 메소드가 다 추상이면 class가 아니라 interface로 만들기

}
