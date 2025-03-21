

/*
 * WAP in Java Create funtion of Add Subtract multiplication add division
 * 
 */


package basic;

public class Calculator {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition is = " + add(5, 5));
		System.out.println("Subtraction is =" + sub(25, 5));
		System.out.println("Multiplication is =" + mul(5, 4));
		System.out.println("Division is = " + div(6, 3));

	}

}
