package gui.info.copy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
//event소속
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class InfoTest implements ActionListener{ //interface는 여러개 받아도 됨

	//1.멤버 변수 선언
	JFrame f;
	JButton binsert,bmodify,bdelete,bshow,bexit;
	JTextField tftel, tfname, tfj,tfg,tfage,tfhome;
	JTextArea ta;
	
	ArrayList list = new ArrayList();
	
	
	//2.객체생성
	InfoTest()
	{
		f=new JFrame("Information");
		binsert=new JButton("Insert");
		bmodify=new JButton("modify");
		bdelete=new JButton("delete");
		bshow=new JButton("show");
		bexit=new JButton("exit");
		tftel= new JTextField(30);
		tfname= new JTextField(30);
		tfj= new JTextField(30);
		tfg= new JTextField(30);
		tfage= new JTextField(30);
		tfhome= new JTextField(30);
		ta=new JTextArea(4,30);
		
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


	void eventProc()
	{
		//버튼을 누르면 이벤트가 발생하게
		binsert.addActionListener(this);//내 클래스가 통으로 이벤트 핸들러이므로 내 클래스를 가르키는 객체는 this

		bmodify.addActionListener(this);
		bdelete.addActionListener(this);
		bshow.addActionListener(this);
		bexit.addActionListener(this);


		//tftel.addActionListener(new TFHdlr()); 한 덩어리로 줄이기
		/*class TFHdlr implements ActionListener{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, tftel.getText()+"확인");
			}}

		}*/


		tftel.addActionListener(new ActionListener()//위에꺼 줄이기
		{//입력 받은 후 번호에 입력을 다시 받ㅇ면 그 사람의 정보가 뜸
			public void actionPerformed(ActionEvent e)
			{
				String tel = tftel.getText();
				for(int i=0; i<list.size();i++)
				{
					Person p = (Person)list.get(i);
					if(p.getTel().equals(tel))
					{
						tfname.setText(p.getName());
						tfj.setText(p.getJumin());
						tfg.setText(p.getGender());
						tfage.setText(String.valueOf(p.getAge()));//int에서 string으로 변환
						tfhome.setText(p.getHome());
					}
				}
			}

		});}



	public void actionPerformed(ActionEvent ev) {
		System.out.println("event");
		JButton btn = (JButton)ev.getSource();
		if(btn == binsert)
		{
			insertData();//입력버튼을 누를 때 마다 불려짐
			clearTextField();//입력 후 화면이 깔끔해지게
			showData();

		}else if(btn==bmodify){

		}else if(btn==bdelete){
			deleteData();//delet누르면 그 사람의 정보가 지워진다.
			clearTextField();
			showData();

		}else if(btn==bshow){showData();

		}else if(btn==bexit){
			System.exit(0);

		}
	}
	
	void clearTextField()
	{
		tftel.setText(null);
		tfname.setText(null);
		tfj.setText(null);
		tfg.setText(null);
		tfage.setText(null);
		tfhome.setText(null);
	}
	
	void deleteData()
	{
		
			String tel = tftel.getText();
			for(int i=0; i<list.size();i++)
			{
				Person p = (Person)list.get(i);
				if(p.getTel().equals(tel))
				{
					list.remove(p);
				}
			}
		
		
	}
	
	void showData() {
		ta.setText("--------------------------------"+"\n");
	;
		for (int i=0; i<list.size();i++)
		{
			Person p = (Person)list.get(i);//list를 받으면 object로 받아오기 때문에 person으로 형변환 해줘야함.
			ta.append(p.toString());
		}
	}
	
	void insertData()
	{
		Person p = new Person();
		//1.각 tf의 입력값들 얻어오기
		p.setTel( tftel.getText() ); //입력값을 받아옴
		p.setName(tfname.getText());
		p.setJumin(tfj.getText());
		p.setGender(tfg.getText());
		p.setAge(Integer.parseInt(tfage.getText()));//integer로 바꿔야함
		p.setHome(tfhome.getText());
		//2.1번 값들을 person의 멤버로 지정
		//3. 2번 person객체를 arraylist에 저장
		list.add(p);
	}
	public static void main(String[] args) {

		InfoTest it = new InfoTest();//객체생성
		it.addLayout();
		it.eventProc();

	}

}
