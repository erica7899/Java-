package c_control;

import java.util.Scanner;
import java.util.Date;
public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,id = ""; //숫자로 이뤄지지만 연산하지 않는 숫자는 스트링으로.
		int score;
		Date now = new Date();
		String n =now.toString();
		String nyear = n.substring(24, 28);
		int nnyear=Integer.parseInt(nyear);
		System.out.println(nyear);
		Scanner i = new Scanner(System.in);
		
		System.out.println("주만번호를 입력하시오");
		id=i.nextLine();
		char sung=id.charAt(7);
		String year =id.substring(0,2);//2번째꺼 앞까지 받는다는 뜻
		int nai=Integer.parseInt(year);//참조형은 형변환 x
		//steing을 int로 바꿔주는 함수
		
		int age = 0;
		if(sung=='1'||sung=='3') {//문자 1이랑 비교해야함
			System.out.println("남자");
			
		}
		else if(sung=='2'|| sung=='4') {
			System.out.println("여자");
		}
		
		if(sung=='1'||sung=='2') {//문자 1이랑 비교해야함
			age=nnyear-(1900+nai)+1;
			
			
		}
		else if(sung=='3'|| sung=='4') {
			age=nnyear-(2000+nai)+1;
			
		}
		System.out.println(age);
		
	
		
	}

}
