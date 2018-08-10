package collection;
import java.util.HashMap;
import java.util.Scanner;
public class Maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<String,String> map = new HashMap();
		map.put("java", "1111");//key,value값 지정//노란경고 없애려면 generics
		map.put("javakim", "9999");
		map.put("javapark", "9999");
		map.put("javakim", "1234");

		Scanner input = new Scanner(System.in);
		boolean stop = false;
		while(!stop) {
			System.out.println("put id,password:");
			System.out.println("id>");
			String id = input.nextLine();
			System.out.println("password>");
			String pw=input.nextLine();


			//1-1 입력받은 아이디가 map의 key에 존재?

			if(map.containsKey(id)) {//key랑 입력한 id 가 같은가?
				//2-1  그 아이디와 같은 key의 value값과 패스워드가 같다면 
				if(map.get(id).equals(pw)) {//id에 해당하는 map의value값 얻어오기
					System.out.println("log-in");
					stop = true; //반복문 멈추기
				}else {
				System.out.println("wrong password");
				continue;
			}

		}else {
			//1-2 존재하지 않는 아이디
			System.out.println("wrong id");
			continue; //반복문을 끝내지 않고 다시 반복
			}
		}
	}

}


