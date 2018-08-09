package f_exception;

import java.io.*;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		FileInputStream fis= new FileInputStream("abc.txt");
		fis.read();
		System.out.println("파일처리");
		//int su = 10/0;
		//ctrl+shift+o
		//파일 없으면 예외가 발생하는걸 감지해서 예외처리를 해야함
		}catch(FileNotFoundException ex) {
			System.out.println("파일읽기 실패"+ex.getMessage());
		}catch(IOException ex) {
			System.out.println("읽기 실패");
		}//예외를 종류별로 쓸 수 있음. 중요한 작업은 앞에 따로 써주고 그 외는 하나로 묶어서 처리함
		catch(Exception ex) {//이게 다른 catch로 올라가면 이미 모든 예외를 처리했기 때문에 에러가 발생
			//다른 catch는 실행이 되지 않기 때문
			//그래서 세세한 catch는 위에 써야함
			System.out.println("예외");
		}

	}

}
