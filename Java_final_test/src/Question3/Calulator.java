package Question3;

public class Calulator {

	private int num1;
	private int num2;
	
	public Calulator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return  num1+ num2;
	}
	
	public int minus() {
		return  num1- num2;
	}
	public int mul() {
		return  num1* num2;
	}
	public double div() {
		return  num1/(double) num2;
	}
}
