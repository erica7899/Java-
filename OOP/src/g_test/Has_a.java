package g_test;

import java.awt.Button;
import java.awt.Frame;

public class Has_a {
	public Has_a()
	{//보편적인 방법
		Frame f = new Frame();
		Button b = new Button("accept");
		f.add(b);
		f.setSize(400, 300);
		f.setVisible(true); //창 하나 뜸
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Has_a  a=new Has_a();
		

	}

}
