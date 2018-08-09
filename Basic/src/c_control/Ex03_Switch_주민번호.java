package c_control;
import java.util.Scanner;
public class Ex03_Switch_주민번호 {

	public static void main(String[] args) {
		
		
		System.out.println("주민번호 입력");
		Scanner iid=new Scanner (System.in);
		String id=iid.nextLine();
		
		char chul = id.charAt(8);
		String home = "";
		switch(chul) {
		case '0' : home="서울"; break;
		case '1' : home="경기";break;
		case '2' : home="인천,부산"; break;
		case '3' : home="제주"; break;
	    default: home="한국인"; break; //case에서 아무것도 안걸린 경우
		}
		System.out.println("출신지:"+home);
		int kor,eng,math;
		int sum;
		int mean;
		char score = '0';
	
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하시오:");
		kor = a.nextInt();
		
		System.out.println("영어 점수를 입력하시오:");
		eng = a.nextInt();
		
		System.out.println("수학 점수를 입력하시오:");
		math= a.nextInt();
		
		sum=kor+eng+math;
		mean=sum/3;
		
		switch(mean/10)
		{
		case 10 : case 9 : score='A'; break;
		case 8 : score = 'B'; break;
		case 7 : score = 'C'; break;
		default : score = 'F'; break;
		}
		System.out.println(score);

	}

}
