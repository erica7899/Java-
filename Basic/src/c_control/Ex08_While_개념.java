package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex08_While_개념 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("number:");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		int j=1;
		int result=1;
		
		while(j<=9) {
			result=j*num;
					
			System.out.println(num+"x"+j+"="+result);
					j++;
		}
		
		Scanner in= new Scanner (System.in);
		String str = in.nextLine();
		//독도는 아름다운 대한의 섬 입니다->단어별로 끊어오고 싶을 때(
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println(temp);
		}
		
		
		
		

	}

}
