package a_datatype;

public class Ex05_StringSpecial {

	public static void main(String[] args) {
		
		String a = "홍길자";
		String b = "홍길자";
		
		b = b + "여사님";
		
		if(a.equals(b)) {
			System.out.println("같음");}
		
			else{System.out.println("다름");
		}//equals니까 같음
		
		if(a==b) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}//같은게 있으면 그 주소를 갖는다. 
	}

}
