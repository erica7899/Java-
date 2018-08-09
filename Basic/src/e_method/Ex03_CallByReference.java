package e_method;

public class Ex03_CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer a =new StringBuffer( "불금");
		StringBuffer b =new StringBuffer ("맛점");
		add(a,b);
		System.out.println("A="+a+"B"+b);
		//참조형일땐 method에 주소가 넘어가기 때문에 메인 함수에 있는 변수도 수정된다. 

	}
	
	static void add(StringBuffer a, StringBuffer b)
	{
		a.append(b);
		System.out.println("A="+a+"B"+b);
	}

}
