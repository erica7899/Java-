package a_datatype;

import org.omg.Messaging.SyncScopeHelper;

public class Ex09_Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start =0L;
		long end=0L;
		//string 문자열 추가
		String str="";
		start=System.currentTimeMillis();
		for(int i=0; i<50000; i++)
		{
			str=str+'A';
		}
		end=System.currentTimeMillis()-start;
		System.out.println("string:"+end);
		
		StringBuffer sb = new StringBuffer("");
		start=System.currentTimeMillis();
		for(int i=0; i<50000; i++)
		{
			sb.append("A");
		}
		end=System.currentTimeMillis()-start;
		System.out.println("stringBuffer:"+end);

	}

}
