package g_inherit;

public class Test {

	public static void main(String[] args) {
		
		Umma u = new Umma();
		u.job();
		u.gene();
		
		Ddal d = new Ddal();
		d.study();
		d.gene();
		d.job();//Ddal class에서 부모 관계를 맺었기 때문에 오류가 나지 않는다.
		
		//Ddal d2 = new Umma(); 오류나는 이유:자식변수에 부모객체
		Umma u2 = new Ddal(); //부모변수에 자식객체
		//오류가 나지 않는 이유:ddal 클래스가 heap에 메모리를 올릴 때 내부적으로 엄마 class를 먼저 올리기 때문에 엄마class 메모리를 쓸 수 있다.
		//하지만 u2가 참조할 수 있는건 엄마클래스 메모리만.
		//u2.study();->그래서 u2가 딸 클래스에 있는 메모리는 사용하지 못한다.
		u2.gene();//overriding:딸과엄마가 똑같이 같고 있는 gene method는 무조건 자식 method를 불러온다.
		
		Ddal z = new Ddal();
		if(z instanceof Ddal) {//z 객체가 딸 객체가 맞는가
		System.out.println("딸객체");
		}
		if(z instanceof Umma) {//z 객체가 엄마객체가 맞는가>>맞음
		System.out.println("엄마객체");
		}
		 
		 
		if(z instanceof Object) {//z 객체가 딸 객체가 맞는가
		System.out.println("Object 객체"); // 자바 클래스의 상속 최상위
		}

		
		Object [] data = method();//출력>> return을 받기 위해 준비할 것.
		 
		for(int i=0; i<data.length;i++) {
		 
		System.out.println(data[i].toString());//원래 toString생략 가능 >> 얘는 다형성이다.
		}


	}
	
	static Object [] method() {
		 
		String name = "홍길동";
		int age = 26;
		double height =170.9;// 이 정보를 메인으로 보내고 싶을 때
		 
		Object[] data = new Object[3];//OBject를 이용한다.
		 
		data[0]=name;
		data[1]= new Integer(age);//Integer 자식 객체 생성>>>age가 기본형이니까 Integer를 이용해서 바꿔주기
		data[2]= new Double(height);
		return data;
		}

	
	

}
