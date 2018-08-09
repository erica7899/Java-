package gui.sample;
import java.awt.*;
public class GuiTest {
	//1.멤버변수 선언
	Frame f;
	Button b;
	Checkbox girl,boy;
	TextField tf;//한줄받음
	TextArea ta;//여러줄 받음
	List lst;
	//2.객체 생성
	GuiTest()
	{
		f= new Frame("first");
		b= new Button("Okay");
		CheckboxGroup cgb = new CheckboxGroup();
		girl=new Checkbox("girl",cgb,true);//멀티선택=checkbox
		boy = new Checkbox("boy",cgb,false);//하나만 선택=radiobutton
		tf = new TextField(30);
		ta= new TextArea(4,40);
		lst = new List(4, false);
	}
	
	
	//3. 화변 붙이기 및 화면 출력
	void addLayout()
	{
		//FlowLayout f1;
		//f.setLayout(new FlowLayout());//바꾸는 것.한줄에 쓰기//컴포너트 크기 고정하면서 윗중 상단ㅇ에 중앙정렬
		//f.setLayout(new GridLayout(3,2));//행과 열에맞춰서 배치
		f.setLayout(new BorderLayout());//위 아래 중앙 왼쪽 오른쪽에 배치
		f.add(b,BorderLayout.NORTH);//화면에 버튼 붙이기
		Panel p = new Panel();//도화지 역활. panel에 아무것도 지정하지 않으면 flowlayout
		p.setLayout(new GridLayout(2,1));
		p.add(girl);
		p.add(boy);	
		f.add(p,BorderLayout.SOUTH); //두개의 south를 썼더니 덮어짐. 두개를 붙이고 싶을땐?두개를 붙인 도화지를 south에 붙임
		f.add(tf,BorderLayout.WEST);
		f.add(ta,BorderLayout.CENTER);
		f.add(lst,BorderLayout.EAST);
		 lst.add("high school");
		 lst.add("middle school");
		 lst.add("elementary");
		 lst.add("preschool");
		f.setSize(700,600);
		f.setVisible(true);//화면 실행
	}
	
	public static void main(String[] args) {
		GuiTest gt = new GuiTest();
		gt.addLayout();
		
	}

}
