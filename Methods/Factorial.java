




/*
 * 
 * Wap in Java FActorial Of a Number 
 * Recursion
 * 
 */

package basic;

import java.util.Scanner;

public class Factorial {

	public static int facto(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {

			return n * facto(n - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Factorial of a number " + n + " is =" + facto(n));

	}

}
