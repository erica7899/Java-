package c_control;

public class Ex05_For_개념 {

	public static void main(String[] args) {
		//1~10까지 합

		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;

		for(int i=1;i<=10;i++)
		{
			if(i%2==0) {
				sum1+=i;

			}
			if(i%2!=0) {
				sum2+=i;
			}

		}
		System.out.println(sum1);
		System.out.println(sum2);


		for(int i=1;i<=10;i+=2) {
			sum3+=i;
			sum4+=(i+1);
		}
		
		System.out.println(sum3);
		System.out.println(sum4);
		
		for(char i='A';i<='Z';i++)//ascii코드일떄만 char에 연산 가능
		{
			System.out.println(i);
			

		}
		System.out.println();
		
		for(char i='Z'; i>='A';i--) {
			
			System.out.println(i);

		}
		

		}

	}

