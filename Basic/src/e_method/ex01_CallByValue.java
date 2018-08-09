package e_method;

public class ex01_CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b=3;
		add(a,b);
		System.out.println(a+" main "+b);
		//기본형이 넘어갈 땐 값이 넘어가기 때문에 복사본을 method에 넘겨줌
		//따라서 메인 함수에 잇는 변수엔 영향을 주지 않음
	}
	
	static void add(int a, int b)
	{
		a+=b;
		System.out.println(a+" add "+b);
		
	}

}
