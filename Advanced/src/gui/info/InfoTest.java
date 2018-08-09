package gui.info;

import java.awt.*;

public class InfoTest {

	//1.멤버 변수 선언
	Frame f;
	Button binsert,bmodify,bdelete,bshow,bexit;
	TextField tftel, tfname, tfj,tfg,tfage,tfhome;
	TextArea ta;
	
	
	//2.객체생성
	InfoTest()
	{
		f=new Frame("Information");
		binsert=new Button("Insert");
		bmodify=new Button("modify");
		bdelete=new Button("delete");
		bshow=new Button("show");
		bexit=new Button("exit");
		tftel= new TextField(30);
		tfname= new TextField(30);
		tfj= new TextField(30);
		tfg= new TextField(30);
		tfage= new TextField(30);
		tfhome= new TextField(30);
		ta=new TextArea(4,30);
		
	}
	
	//3.화면 붙이기 및 출력
	void addLayout()
	{
		f.setLayout(new BorderLayout());
		f.add(ta,BorderLayout.CENTER);
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(6,2));
		p1.add(new Label("tel"));
		p1.add(tftel);
		p1.add(new Label("name"));
		p1.add(tfname);
		p1.add(new Label("jumin"));
		p1.add(tfj);
		p1.add(new Label("gender"));
		p1.add(tfg);
		p1.add(new Label("age"));
		p1.add(tfage);
		p1.add(new Label("Home"));
		p1.add(tfhome);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(1,5));
		p2.add(binsert);
		p2.add(bmodify);
		p2.add(bdelete);
		p2.add(bshow);
		p2.add(bexit);
				
		
		f.add(p2,BorderLayout.SOUTH);
		f.add(p1,BorderLayout.WEST);
		f.setSize(700,600);
		f.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		
		InfoTest it = new InfoTest();
		it.addLayout();

	}

}
