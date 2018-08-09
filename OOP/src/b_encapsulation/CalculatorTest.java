package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorExpr s;
		s= new CalculatorExpr();
		END:
		for(int i=0; i<3; i++) {
		System.out.println("두 숫자 입력:");
		Scanner n= new Scanner(System.in);
		
		s.setNum1(n.nextInt());
		s.setNum2(n.nextInt());
		
		s.Addition();
		s.Division();;
		s.Subtraction();
		s.Multiplication();
		
		System.out.println("덧셈:"+s.getAddition());
		System.out.println("뺄셈:"+s.getSubtraction());
		System.out.println("곱셈:"+s.getMultiplication());
		System.out.println("나눗셈:"+s.getDivision());
		
		System.out.println("다시 하겠습니까?");
		Scanner re = new Scanner (System.in);
		String r= re.next();
		
		if(r=="no") {
			break END;
		}
		
		}
		

	}

}
