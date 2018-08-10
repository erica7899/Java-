package imsi;
import java.awt.BorderLayout;

import javax.swing.*;

public class Main {
	
	JFrame f;
	ViewA a;
	ViewB b;
	ViewC c;
	ViewD d;

	public Main()
	{
		//void쓰면 안불려짐
		f=new JFrame ("project");
		a=new ViewA();
		b=new ViewB();
		c=new ViewC();
		
		d=new ViewD();
		
		
		
		JTabbedPane pane = new JTabbedPane();
		pane.add("management",a);
		pane.add("management",b);
		pane.add("management",c);
		pane.add("management",d);
		
		f.add(pane,BorderLayout.CENTER);
		f.setSize(500, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();

	}

}
