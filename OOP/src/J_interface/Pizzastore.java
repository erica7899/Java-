package J_interface;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Pizzastore implements DeliveryStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizzastore store = new Pizzastore();
		
	}

	public Pizzastore() { //setorderlist에서 retrun값을 받으려면 그 함수와 형태가 같아야 한다.
		String menu [] = {"pizza","chicken","coke","beer","water"};
		int price []= {15000,18000,3000,5000,1000};		
		Food menuList [] = new Food[5];
		
		for(int i=0; i<5; i++)
		{
			menuList[i]= new Food(menu[i],price[i]);
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.println(menuList[i].menu+" "+menuList[i].price+"won");
			//menuList[i]만 하면 주소가 나옴
		}
		
		String [] orderList = setOrderList();
		getTotalPrice(menuList,orderList);
		
		
		
		System.out.println(getTotalPrice(menuList,orderList));
		
		
	}
	
	public String[] setOrderList() {
		
		String [] orderList = new String[5];
		System.out.println("order:");
		Scanner j = new Scanner(System.in);
		END:
		for(int i=0; i<5;i++) {
		  
		orderList[i]=j.nextLine();
		if(orderList[i]=="k")
		{
			break END;
		}
		}
		
		return orderList;
		
		
	}

	@Override
	public int getTotalPrice(Food[] menuList, String [] orderList) { //class 배열을 받으므로 부모 method에서도 똑같이 써줘야 한다.
		
		String [] oList= orderList;
		//Food List [] = menuList;
		int total=0;
		
		for(int i=0; i<oList.length;i++)
		{
			
			if(oList[i].equals("pizza")) total+=menuList[i].price;//string비교는 .equals
			else if(oList[i].equals("chicken")) total+=menuList[i].price;
			else if(oList[i].equals("coke")) total+=menuList[i].price;
			else if(oList[i].equals("beer")) total+=menuList[i].price;
			else if(oList[i].equals("water")) total+=menuList[i].price;
		}
		
		
		return total;
		
	}

}
