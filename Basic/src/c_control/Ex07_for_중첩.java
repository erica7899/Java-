package c_control;

public class Ex07_for_중첩 {

	public static void main(String[] args) {


		for(int j=0;j<5;j++) {
			for(int i=0; i<5; i++) {
				System.out.print("*");//print만 쓰면 다음줄로 안넘어간다
			}
			System.out.println();
		}
		
		for(int j=0;j<5;j++) {
			for(int i=0;i<j+1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j=0; j<5;j++) {
			for(int i=0;i<5-j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
