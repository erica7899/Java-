package g_inherit;

public class Ddal extends Umma {//상속관계. Ddal(자식)은 Umma(부모)안에 있는 method를 다 쓸 수 있다.
	//extends를 하면 내부적으로 heap에 메모리를 올릴 때 자식class가 부모 class를 먼저 올린다. 
	public void study()
	{
		System.out.println("ddal study");
	}
	
	public void gene()
	{
		System.out.println("ddal gene");
	}//부모와 자식 함수의 이름이 같을 때 자식의 클래스를 호출 후 같은 이름의 함수를 부르면 자기 자신(자식)의 함수를 부른다. 
	
	//생성자 함수
	public Ddal()
	{
		System.out.println("daughter create");
	}

}
