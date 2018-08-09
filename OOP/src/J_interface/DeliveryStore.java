package J_interface;

import java.awt.List;

public interface DeliveryStore {
	
	String[] setOrderList();
	int getTotalPrice(Food [] menuList,String [] orderList);//부모와 자식의 함수 형태가 같아야 한다.

	
}
