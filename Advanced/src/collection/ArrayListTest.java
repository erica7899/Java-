package collection;
import java.util.*; //collestion 소속
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list= new ArrayList (4); //동적이기 때문에 크기가 상관 없다.하지만 메모리를 많이 차지한다.
		//아무때나 쓰지 말고 갯수가 확실하지 않을 때 사용한다.
		//무슨자료형을 저장할건지 알려주는게 인식하기 더 편하기 때문에 어떤 자료형을 쓸건지 <>안에 써주면 노란 경고가 사라진다. 
		list.add("dog");
		list.add("cat");
		list.add("lion");
		list.add("tiger");
		list.add("bee");  
		list.add("dog");
		
		
		//for(int i=0; i<list.size();i++)
		//{
		//	String str=(String)list.get(i);//list를 꺼내오는 것.object형태로 반환하기 때문에 원하는 형으로 형변환이 필요하다. 
		//	System.out.println(str);
		//}
		
		for(String str:list)//향상된 for문
		{
			System.out.println(str);
		}
		
		//첫번째 요소를 지워주세요
		list.remove(0);
		
		for(String str:list)//향상된 for문
		{
			System.out.println(str);
		}

		
		Collections.sort(list);//알아서 순서대로 정렬
		System.out.println(list);//알아서 string으로 출력

		
	}

}
