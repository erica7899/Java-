package c_control;

import java.util.Scanner;
public class Ex02_If_학번 {

	public static void main(String[] args) {
		
		System.out.println("학번입력:");
		Scanner i = new Scanner (System.in);
		String id = i.nextLine();
		
		char a = id.charAt(4);
		String b= id.substring(5,7);
		int c = Integer.parseInt(b);
		String d = "",f ="";
		String e = id.substring(0,4);
		
		if (a=='1') {
		 f="공대";
		}else {
			f=" 사회대";
		}
		
		switch(a)
		{
		case ('1') :
		switch(c) {
		case 11 : d="컴퓨터학과"; break;
		case 12 : d="소프트웨어학과"; break;
		case 13 : d="모바일학과"; break;
		case 22 : d="자바학과"; break;
		case 33 : d="서버학과"; break;} break;
		case ('2'):
			switch(c) {
			case 11 : d="사회학과"; break;
			case 12 : d="경영학과"; break;
			case 13 : d= "경제학과"; break;
			} break;
		}
		
		System.out.println(id+"는 "+e+"에 입학한 "+f+" "+d+" 학생입니다.");
	
		
	}

}
