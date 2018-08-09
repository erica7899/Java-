package e_method;
import java.util.Scanner;
public class Ex02_인자와반환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = input();
		output (result);

	}
	
	static String input()//main 함수가 static이면 앞에 static써야함
	{
		Scanner in = new Scanner(System.in);
		System.out.println("인사말 입력");
		String greeting = in.nextLine();
		return greeting;
	}
	
	static void output (String greeting)
	{
		System.out.println("출력");
		System.out.println(greeting);
	}

}
