package c_control;

import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("숫자 세개를 입력하세요:");
		Scanner num = new Scanner (System.in);
		a=num.nextInt();
		b=num.nextInt();
		c=num.nextInt();
		
		int fir=0,sec=0;
		
		if(a!=b || a!=c || b!=c) {
		fir=(a>b)? a:b ;
		sec=(c<fir)? c:fir;
		}else if(a==b)
		{
			sec=a;
		}else if(a==c) {
			sec=a;
		
		}else if(b==c) {
			sec=b;
		}
		System.out.println(sec);
		
	}

}
