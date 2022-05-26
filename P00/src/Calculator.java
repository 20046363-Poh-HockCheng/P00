
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 * 20046363, 26 May 2022 10:07:23 am
 */

public class Calculator {
	public int add (int a, int b) {
		return a + b;
	}
	public int subtract (int a, int b) {
		return a - b;
	}
	public int multiply (int a, int b) {
		return a * b;
	}
	public int divide (int a, int b ) {
		if(b ==0) {
			throw new IllegalArgumentException("Division by zero is not supported");
		}
		return a / b;
}
	}