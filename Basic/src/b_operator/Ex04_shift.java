package b_operator;

// shift: 각 비트의 값들을 이동하는 연산자
public class Ex04_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= -4;
		//00000000 00000000 00000000 00000100
		int b = a<<2;
		//00000000 00000000 00000000 00010000
		//x2
		int c = a>>2;
		//00000000 00000000 00000000 00000001
		// %2
		int d = a>>>1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
