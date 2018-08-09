package d_access.sub;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
				
		
		System.out.println("입력할 학생 수는?");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		
		
		Assignmentclass[] a = new Assignmentclass[num]; //배열에 대한 new
		
		for (int i=0; i<num;i++) {
		
			a[i] = new Assignmentclass(); //객체에 대한 new
			System.out.println("번째 학생의 정보 입력(이름/국영수 점수)");
			Scanner na = new Scanner (System.in);
			
			
			a[i].setName(na.nextLine());
			a[i].setKor(n.nextInt());
			a[i].setEng(n.nextInt());
			a[i].setMath(n.nextInt());
			
			a[i].calTotal();
			a[i].calAve();
			
			
			
				}
		
		for(int j =0; j<num; j++)
		{
			for(int i=0; i<num-j-1;i++) {
				if(a[i].getTotal()<a[i+1].getTotal()) {
					Assignmentclass temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		for(int i=0; i<num; i++) {
		System.out.println(a[i].getName()+"의 총점:"+a[i].getTotal()+"평균:"+a[i].getAve());
		}
		
		
	}

}
