package c_control;

import java.util.Scanner;
public class Ex09_369 {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++) {
			int mok=i;

			boolean su369= false;
			while(mok != 0) {
				int na= mok % 10;
				if (na == 3 || na == 6 || na == 9) {
					System.out.print("짝");
					su369 = true;
				}mok /= 10;
			}



			if(su369) {
				System.out.println();
			}else {
				System.out.println(i);
			}
		}
		
		
		int result = 0;
		for(int i=1; i<10000; i++) {
		int a=i;
		
		while (a !=0) {
			int na= a%10;
			if (na==8) {
				result++;
			}a/=10;
		}
		}
		System.out.println(result);

	}

}
