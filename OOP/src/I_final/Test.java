package I_final;
/* final: 변경 불가
 *                -변수 앞에  final : 값 변경 불가
 *                -메소드앞에  final : Overriding 막기
 *                 -클래스앞에  final : 부모 클래스 불가능.>>자식 클래스가 마구 접근 할 수 있으므로.
 * */

class Parent{
	 
String field ="부모님께";
public void jib() {
System.out.println("부모님이 만드신 집");
}
}
 
 
class Child extends Parent{
 
Child(){
field="내꺼";//부모꺼 바꿔 버리기
}
 
public void jib() {
System.out.println("물려받은 집");
}//Overriding 하기
 
}
 
 
public class Test {
 
public static void main(String[] args) {
 
Parent p = new Child();
System.out.println(p.field);//child 에서 수정 가능
p.jib();//child 에서 수정 가능
 
}
 
}
 

