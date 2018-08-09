package e_method;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int i = 4,  j = 2;

		     int sum = 0;

		     method( i, j );

		     System.out.println("main" +  sum );
		     		
	}
	static int method( int i, int j) {

	     int sum = i + j;

	     System.out.println("j" +  sum );

	     return sum;

	}
}
