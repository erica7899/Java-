package c_control;

public class Ex07_for_중첩2 {

	public static void main(String[] args) {
		
		for(int j=0;j<26;j++) {
		for(char i='A';i<='A'+j;i++) {
			System.out.print(i);
			//j가 아스키 값으로 처리되기 때문에 알파벳이 나온다.
			
		}
		System.out.println();
		}
		
		System.out.println("==============================");
		
		for(int j=0;j<26;j++) {
			for(char i='A';i<='Z'-j;i++) {
				System.out.print(i);
				
			}
			System.out.println();
			}
		System.out.println();
		
		for(int j=0;j<26;j++) {
			for(char i='Z' ;i>='Z'-j;i--) {
				System.out.print(i);
				
			}
			System.out.println();
			}
		System.out.println();
		
		for(int j=0;j<26;j++) {
			for(char i=(char)('A'+j) ;i<='Z';i++) {
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println("----------------------------------");

		for(int j=0;j<26;j++) {
			
			for(int i=0; i<j;i++) {
				System.out.print(" ");
			}
			
			for(char i=(char)('A'+j) ;i<='Z';i++) {
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println();

		
	}

}
