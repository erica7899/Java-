package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		System.out.println("투표( , , , )");
		Scanner v = new Scanner(System.in);
		String vo = v.nextLine();
		StringTokenizer vot = new StringTokenizer(vo,",");
		
		int n= vo.length();//n=투표수
		int [] vote = new int [n];
		
		for (int i=0; i<vo.length();i++)
		{
			vote[i]= Integer.parseInt(vot.nextToken());
		}
		
		
		
		solution(vote);
		
		int N=0;
		for(int i=0; i<vote.length;i++)
		{
			
		}
		
		

	}
	
	static void solution(int [] vote)
	{
		int [] result= new int [N]  
		for(int i=0; i<vote.length;i++)
		{
			
		}
	}

}
