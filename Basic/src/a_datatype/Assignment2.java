package a_datatype;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner one = new Scanner(System.in);
		String a,b;
		
		System.out.println("nextLine() 사용하기");
		b= one.nextLine();
		System.out.println("출력:"+b);
		
		System.out.println("next() 사용하기");
		a=one.next();
		System.out.println("출력:"+a);
		
		
	

	}

}

//두개의 차이점
//next는 공백이 있으면 출력을 끝내고 nextLine은 공백도 한 단어로 인식한다.
