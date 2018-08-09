package e_method;
import java.util.Scanner;
public class Ex02_성적 {
	public static void main(String[] args) {


		int [] result= input();
		
		getTotal(result);
		int sum=getTotal(result);
		
		getAvg(sum);
		int avg=getAvg(sum);
		
		getScore(avg);
		char sc=getScore(avg);
		
		output(sum,avg,sc);
	}


	static int[] input()
	{
		System.out.println("국영수 점수 입력");
		Scanner num = new Scanner (System.in);
		int [] score= new int[3];
		int kor= num.nextInt();
		int eng= num.nextInt();
		int math = num.nextInt();
		score[0]=kor;
		score[1]=eng;
		score[2]=math;

		return score;
		//국영수 점수를 입력
	}

	static int getTotal(int result[])
	{
		int sum=result[0]+result[1]+result[2];
		return sum;
		//입력받은 국영수 총점 구하기+
	}
	
	static int getAvg(int sum)
	{
		int avg=sum/3;
		return avg;
	}
	
	static char getScore(int sum)
	{
		char sc ='0';
		
		if (sum>=90)
		{
			sc='A';
		}else if(sum>=80 && sum<90)
		{
			sc='B';
			
		}else if(sum>=70 && sum<80)
		{
			sc='C';
		}else
		{
			sc='F';
		}
		
		return sc;
	}

	static void output(int sum, int avg, char sc)
	{
		
		System.out.println("총점"+sum);
		System.out.println("평균"+avg);
		System.out.println("점수"+sc);
		//총점 평균 학점 출력
	}
}

