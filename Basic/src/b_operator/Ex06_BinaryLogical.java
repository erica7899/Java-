package b_operator;

public class Ex06_BinaryLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =15;
		//00000000 00000000 00000000 00001111
		int b = 10;
		//00000000 00000000 00000000 00001010
		int and = a&b;
		//00000000 00000000 00000000 00001010
		int or = a|b;
		//00000000 00000000 00000000 00001111
		int ex = a^b;//두 입력값이 있는데 같은지 다른지 보고싶을 때
		//00000000 00000000 00000000 00000101
		 System.out.println(and);
		 System.out.println(or);
		 System.out.println(ex);
		 
		 
		 
		 
		 
		 
	}

}
