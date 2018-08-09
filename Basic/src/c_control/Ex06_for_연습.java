package c_control;
import java.util.Scanner;
public class Ex06_for_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input:");
		Scanner num = new Scanner(System.in);
		int n=num.nextInt();
		
		for(int i=1;i<=n;i++ ) {
			
			
			System.out.println(i+"");
			if(i%5==0) {
				System.out.println();
			}

		}
		
		Scanner c = new Scanner (System.in);
		String ch=c.next();
		char ch1=ch.charAt(0);
		
		if(ch1>='A' && ch1<='Z') {
			for(char i='A';i<=ch1;i++ ) {
				System.out.print(i);
			}
		}
			if(ch1>='a' && ch1<='z') {
				for (char i='a'; i<=ch1;i++) {
					System.out.print(i);
				}
			}
			System.out.println();
		
		System.out.println("문장입력:");
		Scanner a= new Scanner (System.in);
		String b=a.nextLine();
		int f=b.length();
		System.out.println(f);
		char re='0';
		
		for(int i=f-1; i>=0; i--) {
			re=b.charAt(i);
			System.out.print(re);
		}
		
		

	}

}
