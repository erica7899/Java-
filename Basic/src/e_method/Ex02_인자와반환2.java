package e_method;
import java.util.Scanner;
public class Ex02_인자와반환2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20, b=5;
		add(a,b);
		int sum= method();
		//method 함수 안의 n과m의 합을 여기서 출력
		System.out.println(sum);
		
		int[] re=method2();
		System.out.println(re[0]+re[1]);
		//method2에 있는 z와 y값을 받아서 합을 여기서 구하기

	}
	static int method()//void method는 반환 못함
	{
		System.out.println("숫자 두개 입력");
		Scanner num= new Scanner (System.in);
		int n=num.nextInt();
		int m=num.nextInt();
		int result=n+m;
		
	    return result;
			}
	
	static int[] method2()//배열까지 표시해 줘야 배열 반환 가능
	{
		Scanner num2= new Scanner(System.in);
		int z=num2.nextInt();
		int y=num2.nextInt();
		int [] result = new int [2];
		result[0]=z;
		result[1]=y;
		return result;//두 수는 반환이 안되기 떄문에 배열로 만들어서 반환
	}
	
	static void add(int a, int b )
	{

}
}
