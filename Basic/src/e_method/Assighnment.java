package e_method;

import java.util.Scanner;

public class Assighnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 입력하세요");
		Scanner a = new Scanner(System.in);
		String alpha = a.nextLine();
		char al=alpha.charAt(0);
		
		checkLower(al);
		String result1=checkLower(al);
		System.out.println(result1);
		//true false 문제
	System.out.println();
	System.out.println("알파벳을 입력하세요 ");
	Scanner b = new Scanner(System.in);
	String alpha2 = b.nextLine();
	char al2=alpha2.charAt(0);
		checkUpper(al2);
		char result2=checkUpper(al2);
		System.out.println(result2);
//소문자 대문자 변환 문제
	}
	
	static String checkLower(char al)
	{
		String result1 = "";
		if(al>='A' && al<='Z')
		{
			result1="false";
		}
		
		else if(al>='a' && al<='z')
		{
			result1="true";
		}
		
		return result1;
	}
	
	static char checkUpper(char al2) {
		
		char result2 = '0';
		if(al2>='A' && al2<='Z')
		{
			result2=al2;
		}
		
		else if(al2>='a' && al2<='z')
		{
			result2=(char)(al2-32);
		}
		
		return result2;
	}

}
