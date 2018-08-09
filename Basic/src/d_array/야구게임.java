package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;
public class 야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = new int [4];

		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(Math.random()*9+1); //Math.random() 0.0~1.0 랜던으로 숫자를 잡아주는 것.
			//중복된 숫자 없애기

			for (int j=0; j<i; j++)
			{
				if(num[j]==num[i])
				{

					i--;
					break; 
				}
			}
		}

		for(int i=0; i<num.length;i++)
		{
		System.out.print(num[i]);
		}
		System.out.println();

		
		System.out.println("시도 할 횟수를 적어주세요:");
		Scanner tr = new Scanner (System.in);
		int t=tr.nextInt();
		
		END:
		for(int a=0; a<t; a++)
		{
		int numg []= new int [4];
		System.out.println("숫자를 입력하세요:");
		Scanner game = new Scanner (System.in);
		String n = game.nextLine();
		StringTokenizer nn = new StringTokenizer(n," ");
		for(int i=0; i<numg.length; i++)
		{
			numg[i]=Integer.parseInt(nn.nextToken());
		}
		
		
		
		int strike=0;
		int ball=0;
		for(int i=0; i<num.length; i++)
		{
			
			
			for(int j=0; j<numg.length;j++)
			{
				if(numg[j]==num[i])
				{
					if(j==i)
					{
						strike++;
					}else
					{
						ball++;
					}
				}
				if(strike==4)
					{
					System.out.println("정답입니다.");
					break END;
					}
			}
		}
		System.out.println("strike:"+strike+"ball:"+ball);
		}
		





	}

}
