package b_encapsulation;

public class CalculatorExpr {

	private int num1;
	private int num2;
	private int addition;
	private int subtraction;
	private int multiplication;
	private int division;
	
	public int Addition() {
		addition=num1+num2;
		return addition;
	}
	
	public int Subtraction() {
		 subtraction=num1-num2;
		return subtraction;
	}
	
	public int Multiplication() {
		 multiplication=num1*num2;
		return multiplication;
	}
	
	public int Division() {
		 division=num1/num2;
		return division;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getAddition() {
		return addition;
	}

	public int getSubtraction() {
		return subtraction;
	}

	public int getMultiplication() {
		return multiplication;
	}

	public int getDivision() {
		return division;
	}
}
