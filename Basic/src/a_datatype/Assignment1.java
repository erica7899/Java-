package a_datatype;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int kor,eng,math;
		int sum;
		int mean;
	
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하시오:");
		kor = a.nextInt();
		
		System.out.println("영어 점수를 입력하시오:");
		eng = a.nextInt();
		
		System.out.println("수학 점수를 입력하시오:");
		math= a.nextInt();
		
		sum=kor+eng+math;
		mean=sum/3;
		
		System.out.println("total:"+sum);
		System.out.println("mean:"+mean);
		}

}
