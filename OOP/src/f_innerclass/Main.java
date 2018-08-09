package f_innerclass;

class Outer{
	static class Inner{//원래 class에는 static을 못붙인다.
		//하지만 Inner은 outer의 안에있어 멤버변수이기 때문에 static을 붙일 수 있다.
		static void catchme() {//catchme를 호출하고 싶으면 밖에있는 class를 메모리에 먼저 올려야 한다.
			System.out.println("catch me");
		}
	}
}



public class Main {//만약 두개 이상의 class를 쓰면 main함수에만 public을 쓸 수 있고 다른 class엔 못쓴다.

	public static void main(String[] args) {
		//Outer o = new Outer(); //class를 메모리에 올림
		//Outer.Inner in = o.new Inner(); //o라는 객체를 통해서 안에있는 객체를 메모리에 올린다. 
		//Outer.Inner in = new Outer.Inner(); //inner은 static이기 때문에 객체 없이 메모리에 올릴 수 있다.
		
		//in.catchme();
		
		Outer.Inner.catchme();

	}

}
