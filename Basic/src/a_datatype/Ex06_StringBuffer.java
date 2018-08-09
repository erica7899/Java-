package a_datatype;

public class Ex06_StringBuffer {

	public static void main(String[] args) {
		// 문자열:String
		//      StringBuffer/StringBuilder
		
		StringBuffer a = new StringBuffer("홍길동");
		StringBuffer b = new StringBuffer("홍길동");
		//b = b+"2"->이런건 string만됨
		//string은 위에 경우 기존께 쓰레기가 되는데
		//stringBuffer은 수정을 해도 쓰레기가 되지 않고 그 자체에서 수정
		if(a.equals(b))
		{
			System.out.println("동일");
		}
		else {
			System.out.println("다름");
		}//다르다고 나옴->equals는 string에 사용
		//문자열 비교할땐 string사용
		
		
		if(a==b) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}//다름
	}

}
