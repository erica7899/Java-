package e_method;
import java.util.Scanner;
public class Ex09_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [][] result =input();
		output(result);
	}
	
	static char[][] makeSquare(int a, int b,char ch)
	{
		char [][] chh= new char [a][b];
		for(int i=0; i<a; i++)
		{
			
			for(int j=0; j<b; j++){
							
					chh[i][j]=ch;
					
					ch++;
				if(chh[i][j]=='Z')
				{
					ch='A';
				}else if(chh[i][j]=='z')
				{
					ch='a';
				}
				
			
			}
					
		}
		return chh;
		//첫번재 정수만큼의 행과 두번재 정수만큼의 열을 배열
		//그 배열에 알파벡을 저장하기
		
	}
	
	static char[][] input() {
		//두 정수와 알파벳 하나를 입력받으세요
		System.out.println("숫자 두개와 알파벳 하나 입력하세요");
		Scanner n = new Scanner (System.in);
		int a = n.nextInt();
		int b= n.nextInt();
		String c = n.next();
		char ch= c.charAt(0);
		char [][] result = makeSquare(a,b,ch);
		return result;
	}
	static void output(char[][] result) {
		
		
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				
				System.out.print(result[i][j]);
				
			}System.out.println();
					
		}
	}

}
