package c_control;

import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		System.out.println("년도를 입력하세요:");
		Scanner a = new Scanner(System.in);
		int year = a.nextInt();


		if(year%4==0) {
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("윤년");
				}else {
				System.out.println("평년");}

			}else {
				System.out.println("윤년");
			}


		}else {
			System.out.println("평년");
		}

	}

}
