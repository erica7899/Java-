package d_array;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] num = new int [5][6];
		
		for(int i=0;i<num.length;i++)
		{
			
			for (int j=0; j<num[i].length; j++)
			{
				num[i][j]=(int)(Math.random()*45+1); //Math.random() 0.0~1.0 랜던으로 숫자를 잡아주는 것.
				//중복된 숫자 없애기

				for(int a=0; a<j; a++){

					if(num[i][a]==num[i][j])
					{

						j--;//쌤썜 다시 그 자리가 돌아간다.
						break ; //쓰는것과 안쓰는 것의 차이점:같은게 하나 발견되면 굳이 뒤를 비교하지 않아도 되기 때문에.
					}



				}
			}

		}

		for (int i=0; i<num.length; i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				System.out.print(" "+num[i][j]);
			}
			System.out.println();
		}

	}

}
