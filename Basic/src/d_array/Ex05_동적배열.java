package d_array;

public class Ex05_동적배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = new char [5][];
		//*이 생기지 않는 공간까지 처리 할 필요는 없다.
		
		for(int i=0; i<star.length;i++)
		{
			star[i]=new char[i+1];
			for(int j=0; j<i+1;j++)
			{
				star[i][j]='*';
			}
		}
		
		for(int i=0; i<star.length;i++)
		{
			for(int j=0; j<star[i].length;j++)//length때문에 가능
			{
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
	}

}
