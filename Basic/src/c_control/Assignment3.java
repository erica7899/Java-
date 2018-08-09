package c_control;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {

		System.out.println("1.");
		System.out.println("높이:");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		System.out.println("너비:");
		int m = input.nextInt();

		int num=0;

		for(int j = 0 ; j<n ; j++ )
		{
			for(int i=0; i<m; i++)
			{
				num++;
				System.out.print(" "+num);

			}System.out.println();
		}

		System.out.println("2.");

		int num2=0;
		System.out.println("Input:");
		int square = input.nextInt();

		for(int j=0; j<square; j++)
		{
			for(int i=0 ; i<square ; i++) 
			{
				num2++;
				System.out.print(" "+num2);
			}System.out.println();
		}

		System.out.println("3.");

		int num3=1;
		int result=0;
		System.out.println("높이:");
		int n3 = input.nextInt();
		System.out.println("너비:");
		int m3 = input.nextInt();
		
		for (int j=1; j<=n3; j++)
		{
				if(j==1)
				{
					for(int k=1; k<=m3; k++ )
					{System.out.print("  "+num3);
					num3++;
					
					if(k==m3)
					{
						result=num3;
					}
					}
				}
				
				else if(j%2!=0) 
				{
				  num3=result+m3;
				  for(int i=1; i<=m3; i++)
				  {
				  num3++;
				  System.out.print("  "+num3);
				  if(i==m3)
				  {
				  result=num3;
				  }
				  }
				}
				
				else if(j%2==0) 
				{
				  num3=result+m3;
				  for(int i=1; i<=m3; i++)
				  {
				  num3--;
				  System.out.print("  "+num3);
				  if(i==m3)
				  {
				  result=num3;
				  }
				  }
				}System.out.println();
			
		}
		
				


			


		}

	}

