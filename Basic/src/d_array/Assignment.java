package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("학생 수 입력:");
		Scanner su = new Scanner (System.in);
		int n=su.nextInt();
		int m=3;
		int [][] score= new int[n][m];

		for(int i=0; i<n ; i++) 
		{
			System.out.println((i+1)+"번째 학생 점수입력(국/수/영):");
			Scanner sc = new Scanner(System.in);
			String score1 = sc.nextLine();
			StringTokenizer score2 = new StringTokenizer(score1,"/");
			for(int j=0; j<m; j++)
			{
				score[i][j]=Integer.parseInt(score2.nextToken());
			}
		}//학생별로 score변수에 점수 저장
		
		int [] sum = new int[n];
		int [] ave=new int[n];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				sum[i]+=score[i][j];
			}
		}
		
		for(int i=0; i<n; i++)
		{
			ave[i]=sum[i]/m;
		}
		
		
		
		for (int i=0; i<n; i++)
		{
			
			System.out.println((i+1)+"쨰 학생의 총점은 "+sum[i]+"이고 평균은 "+ave[i]+"입니다.");
			
		}//학생 별 총점과 평균 구하기
		
		System.out.println();

		int kors=0,kora=0;
		int maths=0,matha=0;
		int engs=0,enga=0;
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0) {
				kors+=score[j][i];
				kora=kors/n;
				}
				else if(i==1) {
				
				
					maths+=score[j][i];
					matha=maths/n;
				}
				else if(i==2) {
					engs+=score[j][i];
					enga=engs/n;
				}
			}
		}//과목별 점수 구하기
		
		System.out.println("국어과목의 총점은 "+kors+"이고 평균은 "+kora+"입니다.");
		System.out.println("수학과목의 총점은 "+maths+"이고 평균은 "+matha+"입니다.");
		System.out.println("영어과목의 총점은 "+engs+"이고 평균은 "+enga+"입니다.");

		//String [] subname = new String[3];
		//subname[0]="국어";
		//subname[1]="수학";
		//subname[2]="영어";//값을 하나하나 지정.
		
		String[] subname = {"국어","영어","수학"};  //배열의 초기화
		
	}

}
