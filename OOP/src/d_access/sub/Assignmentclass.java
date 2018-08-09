package d_access.sub;

public class Assignmentclass {
	
	private String name;
	private int kor,eng,math;
	private int total;
	private double ave;
	
	public void calTotal() {
		total=kor+eng+math;
	}
	
	public void calAve() {
		ave=total/3;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAve() {
		return ave;
	}

	public void setAve(int ave) {
		this.ave = ave;
	}

	public String getName() {
		return name;
	}
	
	
	
	

}
