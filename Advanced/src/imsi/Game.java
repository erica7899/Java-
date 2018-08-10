package imsi;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.*;

public class Game implements ActionListener {
	int getsu=4;
	JFrame f;
	JButton[][] b = new JButton[getsu][getsu];
	
	char[][] answer = new char[getsu][getsu];
	
	JButton firstClick = null;
	int firstRow =0,firstCol=0;
	
	Game()
	{  //객체생성
		f= new JFrame ("game");
		f.setLayout(new GridLayout(getsu,getsu));
		for(int i =0 ; i<getsu;i++) {
			for(int j=0; j<getsu; j++) {
				b[i][j]= new JButton();
				f.add(b[i][j]);
				
				answer[i][j]='0';
				
				b[i][j].addActionListener(this);//1이벤트 등록
			}
		}
		
		
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//나감
		
	}
	
	void intiChar() {
		char alpha = '0';
		
		DASI:
		for (int i=0 ; i<getsu*getsu; )
		{
			//임의의 알파벳
			if(i%2==0) {//8번만 실행//컴퓨터는 0으로 시작하기 때문에 짝수로 시작해야 된다. 반드시 짝수로 해야함
				alpha = (char)('A'+(int)(Math.random()*26));//이렇게 묶어야 함
				//기존 알파벳과 동일한거 발견함ㄴ for문 점핑
				for(int r =0 ; r<getsu;r++) {
					
					for(int c=0; c<getsu; c++) {
						
						if(answer[r][c]==alpha)
						{
							continue DASI;//건너뛰고 싶은 곳에 라벨
						}
						
					}
				}
				
			}
			//임의의 위치에 지정
			//0이 있는 곳은 아직 알파벳이 들어오지 않은 것.
			//몇번실행해야 하는지 모르기 때문에 while
			
			boolean ok = false;
			do {
				int row = (int)(Math.random()*getsu);
				int col = (int)(Math.random()*getsu);
				if(answer[row][col]=='0')//answer은 char이기 때문에 '0'과 비교해야한다.
				{
					answer[row][col]=alpha;
					i++;
					ok=true;
				}
				
			}while(!ok);
		}
	}
	
	void showAnswer()
	{
		//문자를 버튼에 지정하기
		for(int i =0 ; i<getsu;i++) {
				
			for(int j=0; j<getsu; j++) {
				b[i][j].setText(String.valueOf(answer[i][j]));
				
				
			}
		}

		
		//버튼에서 문자를 1초후에 지우기
		/*try {
		Thread.sleep(1000);//예외처리 필수
		}catch(Exception ex) {
			
		}
		for(int i =0 ; i<getsu;i++) {
			
			for(int j=0; j<getsu; j++) {
				b[i][j].setText(null);
				
				
			}
		}*/

	}
	
	public static void main(String[] args) {
		Game g  = new Game();
		g.intiChar();
		g.showAnswer();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		for(int i =0 ; i<getsu;i++) {

			for(int j=0; j<getsu; j++) {
			if(btn==b[i][j]) {//첫번째 선택시
				if(firstClick==null)
				{
					firstClick=btn;
					firstRow=i;
					firstCol=j;
					firstClick.setBackground(Color.yellow);//처음 누른게 노란색
				}else {
					//두번째 선택시
					//문자가 맞았는지 안맞았는지
					if(answer[i][j]==answer[firstRow][firstCol]) {//문자가 맞으면
						//JOptionPane.showMessageDialog(null,"OK");
						firstClick.setBackground(Color.BLACK);//문자가 맞으면 두개가 검정색으러
						btn.setBackground(Color.BLACK);
					}else {
						//문자가 틀리면
						firstClick.setBackground(null);//문자가 틀리면 색이 없어짐
						
					}
					firstClick=null;
				}

			}

			}
		}
	}
}
