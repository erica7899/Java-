package g_test;

import java.awt.Button;
import java.awt.Frame;

public class Is_a extends Frame {//Frame을 부모로. 단일 부모가 원칙. 두개를 가질 수 없음
	
	public  Is_a() {
		Button b = new Button("accept");//부모를 하나밖에 못하기 때문에 has-a방식.
		add(b);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Is_a a = new Is_a(); //static 문제 피하려고 써줌
	}

}
