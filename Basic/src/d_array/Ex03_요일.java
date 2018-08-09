package d_array;
import java.util.Calendar;
public class Ex03_요일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c= Calendar.getInstance();//get은 뭘 가져오는 것 instance=객체
		//원래 이미 있기 때문에 new를 쓰지 않는다.
		
		int y=c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		int w = c.get(Calendar.DAY_OF_WEEK); //요일
		String [] wstr = {"일","월","화","수","목","금","토"};
		//위 w변수는 숫자기 때문에 문자열로 바꿔는다.
		
		System.out.println(y+"년"+m+"월"+d+"일"+wstr[w-1]+"요일");
		//월만 이상하게 나옴. 서양에서 만들었기 때문에.
		
		
		

	}

}
