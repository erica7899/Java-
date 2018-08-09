package b_operator;

public class Ex07_ShortCircuitLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =3;
		if (a>3 & ++a>3) {
			System.out.println(("조건만족"));

			
		}
		System.out.println("A="+a);
		//이진 논리를 쓰면 뭐가 되던 두개 다 실행된다.
		
		
	    if(a>1 | ++a>3) {
	    	System.out.println("조건만ㄴ족");
	    }
	    System.out.println("A="+a);
	    
	    int i = 5;

	    System.out.println( i++ );

	    System.out.println( i++ );
	    
	    a = -5;

	    if ( ( a> 0 ) && ( ( ++a / 3 ) > 0 ) ) {

	          a++;

	    }

	    System.out.println( a );
	    
	    System.out.println( 4 & 7 );
	}

}
