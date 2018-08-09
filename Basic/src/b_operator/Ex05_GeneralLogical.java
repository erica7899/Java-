package b_operator;

import java.util.Scanner;
public class Ex05_GeneralLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int 성적=75;
		int 태도='A';
		
		if(성적>80 || 태도=='A')
		{
			System.out.println("우등상 수상");
		}
		
		if(성적>80 && 태도=='A')
		{
			System.out.println("최우수상");
					 
		}
		
		System.out.println("문자입력");
		Scanner scan = new Scanner (System.in);
		String s = scan.next();
	    char ch=s.charAt(0); 

		
		
		if (ch>=45 && ch<=90) {
			System.out.println("대문자");
		}
		else {
			System.out.println("소문자");
		}
		
		
		/*System.out.println("문자입ㄹ력");
		int a;
		Scanner b = new Scanner(System.in);
		a=b.nextInt();
		
		if (a>=97 && a<=119) {
			System.out.println("대문자");
		}
		else {
			System.out.println("소문자");}
			이건 오류남
			char로 변하기 전에 nextInt가 INT로 인식*/
		
		
		
		
		
	}

}
