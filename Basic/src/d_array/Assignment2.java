package d_array;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21,-21, -35, -93, -11}, {9, 14, 39, -98}};
		
		int sum[]=new int[a.length];
		for(int i=0; i<a.length;i++)
		{   
		
			for(int j=0; j<a[i].length;j++)
			{
				
				sum[i]+=a[i][j];
			}
			System.out.println(sum[i]);
		}
		System.out.println();
		int temp=0;
		
		
		for(int i=0; i<sum.length;i++)
		{   
		
			for(int j=i+1; j<sum.length; j++)
			{
			if(sum[i]<sum[j])
			{
				temp=sum[i];
				sum[i]=sum[j];
				sum[j]=temp;
			
			}
			}
			System.out.print(" "+sum[i]);
		}
		
	
	}

}
