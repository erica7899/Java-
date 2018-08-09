package e_method;

public class Ex03_String {
	public static void main(String[] args) {
		
		String a =new String( "불금");
		String b =new String ("맛점");
		add(a,b);
		System.out.println("A="+a+"B"+b);
	}
	static void add(String a, String b)
	{
		a+=b; //클래스에서 연산은 스트링만
		System.out.println("A="+a+"B"+b);
	}

}
//string은 메모리가 조금만 수정되어도 메모리를 새로잡음.
