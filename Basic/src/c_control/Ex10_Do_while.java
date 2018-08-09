package c_control;

import java.util.Scanner;

public class Ex10_Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;

		}while(i<=10);
		System.out.println(sum);



		char re = '0';
		do {

			System.out.println("숫자:");
			Scanner a = new Scanner(System.in);
			int num = a.nextInt();
			int j=1;
			int result=1;

			while(j<=9) {
				result=j*num;

				System.out.println(num+"x"+j+"="+result);
				j++;
			}
			
			System.out.println("다시?");

			Scanner in = new Scanner(System.in);
			re = in.nextLine().charAt(0);
			}while(re=='Y' || re=='y');
	}

}
