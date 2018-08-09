package b_operator;
import java.util.Scanner;
public class Ex08_SamHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=81;
		String result = ""; //항상 초기화
		
		if(score>=80)
		{
			result="합격";
		}
		else {
			result="불합격";
		}
		System.out.println(result);
		
		
		//(조건)? A:B  =>삼항연산자
		//조건이 true이면 A를 실행하고 false이면 B를 실행

		int sc = 81;
		String re = (sc>=80)? "합격": "불합격";
		System.out.println(re);
		
		System.out.println(" 세 수 입력");
		int a,b,d,big,mbig;
		Scanner c = new Scanner(System.in);
		a=c.nextInt();
		b=c.nextInt();
		d=c.nextInt();
		big= (a>b)? a:b;
		mbig=(big>d)? big:d;
		System.out.println("더 큰수:"+mbig);
		
		}

}
