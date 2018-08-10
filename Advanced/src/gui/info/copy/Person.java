package gui.info.copy;

public class Person {
	
	//멤버변수
	String tel;
	String name;
	String jumin;
	int age;
	String home;
	String gender;
	
	//생성자 함수
	public Person(String tel, String name, String jumin, int age, String home, String gender) {
		super();
		this.tel = tel;
		this.name = name;
		this.jumin = jumin;
		this.age = age;
		this.home = home;
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//setter
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	
	
	//toString()
	
	public String getName() {
		return name;
	}
	public String getJumin() {
		return jumin;
	}
	public int getAge() {
		return age;
	}
	public String getHome() {
		return home;
	}
	public String getTel() {
		return tel;
	}
	public String toString()
	{
		return tel + "\t"+name+"\t"+jumin+"\t"+age+"\t"+home+"\n";
	}
	
	
	//생성자 함수(source->generate constructor using field
public Person() {}
}

