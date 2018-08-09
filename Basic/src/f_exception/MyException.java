package f_exception;
import java.lang.Exception;
public class MyException extends Exception//부모
             //자식
{

	public String geMessage() {
	return "자주실수하는" ;
	}

}
