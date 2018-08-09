package c_control;

public class Ex_BreakContinue {

	public static void main(String[] args) {


		END:
			for (int i=0 ; i<2; i++) {
				for (int j=0; j<3; j++) {
					if(j==1) continue END; 
					System.out.println("<"+i+","+j+">");
				}
				System.out.println("데이터");
				//여기서 끝남
				}

	}
}
