package f_exception;

public class Ex01_TryCatch {
	/*
	 * 오류
	 * -에러: 심각한 오류(프로그램 자체가 구동하지 않는 것)
	 * -예외: 심각하지 않은 오류(개발자가 해결할 수 있음)
	 * 
	 * 예외처리=>예외가 나도 건너뛰고 프로그램을 끝까지 실행하게 한다.
	 * 예외발생=>프로그램 비정상 종료
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str= {"형윤", "우석","축하"};
		try {//예외가 발생할 만한 곳에 써준다.
			for(int i=0; i<4; i++)//i<3이면 돌아가지만 i<4이면 없는 메모리가 불러지기 때무에 오류가 난다.
				//예외발생
			{
				System.out.println(str[i]);

			}
			return;
		}catch(Exception ex) {//예외발생 후 처리하는 것
			System.out.println("예외 발생"+ex.getMessage());
			//getMessage=간단하게 오류를 보는 것
			ex.printStackTrace(); //오류를 자세히 보고싶을 때
		}
		finally {//무조건 수행하는 것(위에 return이 있어도 수행함)
			System.out.println("무조건 수행");
		}
		System.out.println("프로그램 종료");
	}
}


