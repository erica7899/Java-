package d_array;

public class Ex04_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int [6];
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(Math.random()*45+1); //Math.random() 0.0~1.0 랜던으로 숫자를 잡아주는 것.
		//중복된 숫자 없애기

			for (int j=0; j<i; j++)
			{
				if(num[j]==num[i])
				{
					
					i--;//쌤썜 다시 그 자리가 돌아간다.
					break; //쓰는것과 안쓰는 것의 차이점:같은게 하나 발견되면 굳이 뒤를 비교하지 않아도 되기 때문에.
					
				}
			}
		}
		
		//정렬-버블정렬-삽입/선택
		for(int a =0; a<num.length; a++)
		{
			for(int i=0; i<num.length-a-1;i++) {
				if(num[i]>num[i+1]) {
					int temp = num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
		
		
		for (int a = 0; a < num.length; a++) 
		{
			System.out.print(num[a]+"/");
		}

	}

}
