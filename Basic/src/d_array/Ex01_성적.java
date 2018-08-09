package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적 {

	public static void main(String[] args) {
		
		
		int [] kor;
		kor = new int [5];
		int temp=0;
		
		double ave = 0.0;
		//배열 입력받기
		//입력형식 : 90/80/87/67/56
		//next() nextLine() =>스트링으로.0; 받는다.
		//stringtokenizer사용해서 구별
		System.out.println("점수입력:");
		Scanner n = new Scanner(System.in);
		String score = n.nextLine();
		StringTokenizer sc = new StringTokenizer(score,"/");
		for(int i=0; i<5; i++)
		{
			kor[i]=Integer.parseInt(sc.nextToken());
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5;j++)
			{
				if(kor[i]<kor[j])
				{
					temp=kor[i];
					kor[i]=kor[j];
					kor[j]=temp;
				}
			}
		}
		System.out.println(kor[0]);//kor이라고 치면 주소가 찍혀 나온다.
		for(int i=0; i<5; i++) {
		System.out.print(" "+kor[i]);}
		
		int sum=0;
		
		System.out.println();
		for(int i = 0; i< kor.length ; i++)//배열의 길이를 알려주는 함수  배열이름.length
		{
			sum+=kor[i];
			
		}
		ave=sum/5;
		System.out.println("점수"+sum);
		System.out.println("평균"+ave);
		

	}

}
