package g_inherit.bookshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book d = new Book("0001","java","multi","Nam"); //인자 있는 생성자
		d.output();
		
		Item i= new Book("0001","java","multi","Nam"); //overriding
		i.output();
		
		Book b = null;
		Dvd dv = null;
		Cd c = null;
		System.out.println("1.book,2.dvd,3.cd");
	   Scanner in = new Scanner (System.in);
	   int sel=in.nextInt();
	  
	   switch(sel)//상황에 따라서 다른 객체가 불려진다.=다형성
	   {
	   case 1:i=new Book("","","",""); break;
	   case 2:i=new Dvd("","","",""); break;
	   case 3: i=new Cd("","",""); break;
	   }
	   i.output();
	   //다형성(overriding)
	   //1.부모변수의 자식객체 생성
	   //2.overriding method필요
	   switch(sel)
	   {
	   case 1:b.output(); break;
	   case 2:d.output(); break;
	   case 3: c.output(); break;
	   }

	}

}
