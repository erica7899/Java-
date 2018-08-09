package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		readFile();
		readArray();
		}catch(Exception ex)
		{
			System.out.println("예외발생");
			ex.printStackTrace();
		}

	}
	
	static void readFile() throws Exception //예외를 떠넘기는 것(main에게)
	{
		FileInputStream fis = new FileInputStream("a.x");
	}
	
	static void readArray() throws MyException {
		//throws로 던지면 다른 함수에서 try catch로 예외르 잡아야한다.
		try {
			String [] msg = {"행벅","시원한","fg"};
			for(int i=0 ;i<=3; i++) {
				System.out.println(msg[i]);
				
				
			}
		
		}catch(Exception ex) {
			throw new MyException();
			//예외가 발생하면 밑에는 실행을 하지 않기 때문에 오류가 난다.
				
			}
	}

}

