package g_test;

import java.util.Scanner;

public class ProductionInfo {
	

	public static void main(String[] args) {
		
		Product [] i = new Product[5];
		
		int nump = 0;
		int pid=0;
		int ch=0;
		
		END:
		for(int j=0; j<5;j++)
		{
			i[j]= new Product();
			System.out.println("1.상품추가 2.모든상품조회 3.끝내기>>");
			Scanner c = new Scanner(System.in);
			ch=c.nextInt();
			
			switch (ch)
			{
			case 1:addProduct(j); break;
			case 2:i[j].showInfo(); break;
			case 3: break END;
				
			}
		}
		
		

	}
	static void addProduct(int j)
	{
		int pid;
		Product [] i = new Product[5];
		i[j]= new Product();
		System.out.println("1.책 2.CD 3회화책");
		Scanner p = new Scanner (System.in);
		pid=p.nextInt();
		
		switch(pid)
		{
		case 1: i[j] = new Book ("","","",0 ,0 ,"","");
		case 2: i[j] = new CompactDisc ("","","",0 ,"","");
		case 3: i[j] = new ConversationBook ("","","",0 ,0 ,"","","");
		}
	}
	

}
