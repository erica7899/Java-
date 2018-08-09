package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=7;
		System.out.println("A="+(a+1)+"B+"+b);
		
		a=a+1;
		b=b-1;
		System.out.println(a+"  "+b);
		
		a++;
		b--;
		System.out.println(a+"  "+b);
		
		++a;
		--b;
		System.out.println(a+"  "+b);
		
		int result=++a; //a=a+1  result=a
		System.out.println(result);
		int result2=a++;  //resul2=a a=a+1
		System.out.println(result2+"  "+a);
		
		System.out.println(++a + "  "+--b);
		System.out.println(a++ + "  "+ b--);
		System.out.println(a+"  "+b);
		
		
		
		
	}

}
