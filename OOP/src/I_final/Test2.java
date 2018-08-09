package I_final;


final class Parent2{//final 이 붙은 class는 상속을 못함

	final String field ="부모님께"; // 변수 앞에
	final public void jib() { // 메소드 앞에
		System.out.println("부모님이 만드신 집");
	}
}




public class Test2 {

	public static void main(String[] args) {

		Parent2 p = new Parent2();
		System.out.println(p.field);//child 에서 수정 가능
		p.jib();//child 에서 수정 가능

	}

}
